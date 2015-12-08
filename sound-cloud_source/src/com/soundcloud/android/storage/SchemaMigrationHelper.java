// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.storage:
//            Table

public final class SchemaMigrationHelper
{

    private static final String TAG = com/soundcloud/android/storage/SchemaMigrationHelper.getSimpleName();

    private SchemaMigrationHelper()
    {
    }

    static List alterColumns(SQLiteDatabase sqlitedatabase, String s, String s1, String as[], String as1[])
    {
        ArrayList arraylist = new ArrayList();
        Object obj = new ArrayList();
        Collections.addAll(((java.util.Collection) (obj)), as);
        Collections.addAll(arraylist, as1);
        as = (new StringBuilder("bck_")).append(s).toString();
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(as).toString());
        sqlitedatabase.execSQL(s1.replace((new StringBuilder(" ")).append(s).append(" ").toString(), (new StringBuilder(" ")).append(as).append(" ").toString()));
        as1 = getColumnNames(sqlitedatabase, as);
        as1.retainAll(getColumnNames(sqlitedatabase, s));
        arraylist.addAll(as1);
        ((List) (obj)).addAll(as1);
        as1 = TextUtils.join(",", arraylist);
        obj = TextUtils.join(",", ((Iterable) (obj)));
        sqlitedatabase.execSQL(String.format(Locale.ENGLISH, "INSERT INTO %s (%s) SELECT %s from %s", new Object[] {
            as, as1, obj, s
        }));
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString());
        sqlitedatabase.execSQL(s1);
        sqlitedatabase.execSQL(String.format(Locale.ENGLISH, "INSERT INTO %s (%s) SELECT %s from %s", new Object[] {
            s, as1, as1, as
        }));
        sqlitedatabase.execSQL((new StringBuilder("DROP table ")).append(as).toString());
        return arraylist;
    }

    public static List alterColumns(Table table, SQLiteDatabase sqlitedatabase)
    {
        return alterColumns(sqlitedatabase, table.name(), table.createString, new String[0], new String[0]);
    }

    public static List alterColumns(String s, String s1, SQLiteDatabase sqlitedatabase)
    {
        return alterColumns(sqlitedatabase, s, s1, new String[0], new String[0]);
    }

    public static void create(Table table, SQLiteDatabase sqlitedatabase)
    {
        if (!TextUtils.isEmpty(table.createString))
        {
            if (Log.isLoggable("DatabaseManager", 3))
            {
                StringBuilder stringbuilder = new StringBuilder("creating ");
                String s;
                if (table.view)
                {
                    s = "view";
                } else
                {
                    s = "table";
                }
                stringbuilder.append(s).append(" ").append(table.name());
            }
            sqlitedatabase.execSQL(table.createString);
        } else
        if (Log.isLoggable("DatabaseManager", 3))
        {
            (new StringBuilder("NOT creating ")).append(table.name());
            return;
        }
    }

    public static void drop(Table table, SQLiteDatabase sqlitedatabase)
    {
        if (Log.isLoggable("DatabaseManager", 3))
        {
            (new StringBuilder("dropping ")).append(table.name());
        }
        if (table.view)
        {
            sqlitedatabase.execSQL((new StringBuilder("DROP VIEW IF EXISTS ")).append(table.name()).toString());
            return;
        } else
        {
            dropTable(table.name(), sqlitedatabase);
            return;
        }
    }

    public static void dropTable(String s, SQLiteDatabase sqlitedatabase)
    {
        Log.isLoggable("DatabaseManager", 3);
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString());
    }

    public static List getColumnNames(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder("PRAGMA table_info (")).append(s).append(")").toString(), null);
        s = new ArrayList();
        for (; sqlitedatabase != null && sqlitedatabase.moveToNext(); s.add(sqlitedatabase.getString(1))) { }
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return s;
    }

    public static List getColumnNames(Table table, SQLiteDatabase sqlitedatabase)
    {
        return getColumnNames(sqlitedatabase, table.name());
    }

    public static void migrate(SQLiteDatabase sqlitedatabase, String s, List list, String s1, List list1)
    {
        list = TextUtils.join(",", list);
        list1 = TextUtils.join(",", list1);
        sqlitedatabase.execSQL(String.format(Locale.ENGLISH, "INSERT INTO %s (%s) SELECT %s from %s", new Object[] {
            s, list, list1, s1
        }));
    }

    public static void recreate(Table table, SQLiteDatabase sqlitedatabase)
    {
        drop(table, sqlitedatabase);
        create(table, sqlitedatabase);
    }

}
