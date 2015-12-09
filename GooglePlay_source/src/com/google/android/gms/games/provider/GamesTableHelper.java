// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.provider:
//            GamesSQLHelper

final class GamesTableHelper
    implements GamesSQLHelper
{
    public static final class Builder
    {

        final ArrayList mColumnNames = new ArrayList();
        final ArrayList mColumnStatements = new ArrayList();
        final ArrayList mIndexStatements = new ArrayList();
        private boolean mPrimaryKeyDefined;
        final String mTable;

        static String generateIndexName(String s, String s1)
        {
            return String.format("%s_%s_index", new Object[] {
                s, s1.replace(",", "_")
            });
        }

        final void appendToLastColumn(String s)
        {
            int i = mColumnStatements.size() - 1;
            mColumnStatements.set(i, (new StringBuilder()).append((String)mColumnStatements.get(i)).append(" ").append(s).toString());
        }

        public final GamesTableHelper build()
        {
            return new GamesTableHelper(this);
        }

        final Builder col(String s, ColumnSpec.DataType datatype)
        {
            mColumnNames.add(s);
            mColumnStatements.add((new StringBuilder()).append(s).append(" ").append(datatype.toSQLiteDataType()).toString());
            return this;
        }

        final Builder defaultValue(int i)
        {
            int j = mColumnStatements.size() - 1;
            if (!((String)mColumnStatements.get(j)).contains(ColumnSpec.DataType.INTEGER.toSQLiteDataType()))
            {
                throw new RuntimeException((new StringBuilder("Attempting to add an integer default value to a non-integer column: ")).append((String)mColumnNames.get(j)).toString());
            } else
            {
                appendToLastColumn((new StringBuilder("DEFAULT ")).append(i).toString());
                return this;
            }
        }

        final Builder defaultValue(String s)
        {
            boolean flag;
            if (!s.contains("'"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            appendToLastColumn((new StringBuilder("DEFAULT '")).append(s).append("'").toString());
            return this;
        }

        final Builder index(String s)
        {
            mIndexStatements.add(String.format("CREATE INDEX %s ON %s (%s);", new Object[] {
                generateIndexName(mTable, s), mTable, s
            }));
            return this;
        }

        final Builder notNull()
        {
            appendToLastColumn("NOT NULL");
            return this;
        }

        final Builder primaryKey(String s)
        {
            boolean flag;
            if (!mPrimaryKeyDefined)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            mPrimaryKeyDefined = true;
            col(s, ColumnSpec.DataType.INTEGER);
            appendToLastColumn("PRIMARY KEY AUTOINCREMENT");
            return this;
        }

        final Builder refCol(String s)
        {
            appendToLastColumn(String.format("REFERENCES %s (%s)", new Object[] {
                s, "_id"
            }));
            return this;
        }

        public Builder(String s)
        {
            mTable = s;
        }
    }

    static final class PurgeHelper
        implements GamesSQLHelper
    {

        private String mTable;

        public final void execute(SQLiteDatabase sqlitedatabase, int i)
        {
            sqlitedatabase.delete(mTable, null, null);
        }

        PurgeHelper(String s)
        {
            mTable = s;
        }
    }

    static final class StatementHelper
        implements GamesSQLHelper
    {

        String mStatement;

        public final void execute(SQLiteDatabase sqlitedatabase, int i)
        {
            sqlitedatabase.execSQL(mStatement);
        }

        StatementHelper(String s)
        {
            mStatement = s;
        }
    }


    private static final Pattern COLUMN_STATEMENT_VALIDATION_REGEX = Pattern.compile("\\w+\\s(INTEGER\\sPRIMARY\\sKEY\\sAUTOINCREMENT|INTEGER|TEXT|BLOB)(\\sREFERENCES\\s\\w+\\s\\(\\w+\\))?(\\sNOT\\sNULL)?(\\sDEFAULT\\s[-\\w\\(\\)']+)?");
    final ArrayList mColumnNames;
    final ArrayList mColumnStatements;
    final ArrayList mIndexStatements;
    TreeMap mMapVersionToColumns;
    TreeMap mMapVersionToIndexes;
    final String mTable;

    GamesTableHelper(Builder builder)
    {
        mTable = builder.mTable;
        mColumnNames = builder.mColumnNames;
        mColumnStatements = builder.mColumnStatements;
        mIndexStatements = builder.mIndexStatements;
        mMapVersionToColumns = new TreeMap();
        mMapVersionToIndexes = new TreeMap();
        if (mColumnStatements.size() == 0)
        {
            throw new RuntimeException((new StringBuilder("Invalid table definition (")).append(mTable).append(") - you must include at least one column.").toString());
        }
        int i = 0;
        for (int j = mColumnStatements.size(); i < j; i++)
        {
            builder = (String)mColumnStatements.get(i);
            if (!COLUMN_STATEMENT_VALIDATION_REGEX.matcher(builder).matches())
            {
                throw new RuntimeException((new StringBuilder("Invalid column definition (")).append(mTable).append(") - '").append(builder).append("'.").toString());
            }
        }

    }

    private static ArrayList getVersionedStatements(TreeMap treemap, ArrayList arraylist, int i)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        for (Iterator iterator = treemap.tailMap(Integer.valueOf(i), false).keySet().iterator(); iterator.hasNext(); arraylist2.addAll((Collection)treemap.get((Integer)iterator.next()))) { }
        if (arraylist.size() > 0)
        {
            i = 0;
            int j = arraylist.size();
            do
            {
                treemap = arraylist1;
                if (i >= j)
                {
                    break;
                }
                if (!arraylist2.contains(Integer.valueOf(i)))
                {
                    arraylist1.add(arraylist.get(i));
                }
                i++;
            } while (true);
        } else
        {
            treemap = arraylist;
        }
        return treemap;
    }

    public final void drop(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", new Object[] {
            mTable
        }));
        int i = 0;
        for (int j = mIndexStatements.size(); i < j; i++)
        {
            String s = (String)mIndexStatements.get(i);
            Preconditions.checkState(s.contains("CREATE INDEX"));
            sqlitedatabase.execSQL(String.format("DROP INDEX IF EXISTS %s;", new Object[] {
                s.split("ON", 2)[0].replace("CREATE INDEX", "").trim()
            }));
        }

    }

    public final void execute(SQLiteDatabase sqlitedatabase, int i)
    {
        Object obj = getVersionedStatements(mMapVersionToColumns, mColumnStatements, i);
        obj = String.format("CREATE TABLE %s (%s);", new Object[] {
            mTable, TextUtils.join(",", ((Iterable) (obj)))
        });
        drop(sqlitedatabase);
        sqlitedatabase.execSQL(((String) (obj)));
        obj = getVersionedStatements(mMapVersionToIndexes, mIndexStatements, i);
        i = 0;
        for (int j = ((ArrayList) (obj)).size(); i < j; i++)
        {
            sqlitedatabase.execSQL((String)((ArrayList) (obj)).get(i));
        }

    }

    final int version(TreeMap treemap, int i, int j)
    {
        if (i == -1)
        {
            throw new RuntimeException((new StringBuilder("Invalid version added for table: ")).append(mTable).append(". Are you sure it was added first?").toString());
        }
        ArrayList arraylist1 = (ArrayList)treemap.get(Integer.valueOf(j));
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            treemap.put(Integer.valueOf(j), arraylist);
        }
        arraylist.add(Integer.valueOf(i));
        return i;
    }

}
