// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.table.DbTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.util.TextUtils;
import tA;
import ts;
import tt;
import vA;

public final class DSnapViewStateTable extends DbTable
{
    public static final class DSnapViewStateSchema extends Enum
        implements tt
    {

        private static final DSnapViewStateSchema $VALUES[];
        public static final DSnapViewStateSchema ID;
        public static final DSnapViewStateSchema TIME_LAST_VIEWED_MILLISECONDS;
        private String a;
        private DataType b;
        private String c;

        static String a(DSnapViewStateSchema dsnapviewstateschema)
        {
            return dsnapviewstateschema.a;
        }

        static DataType b(DSnapViewStateSchema dsnapviewstateschema)
        {
            return dsnapviewstateschema.b;
        }

        public static DSnapViewStateSchema valueOf(String s)
        {
            return (DSnapViewStateSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/DSnapViewStateTable$DSnapViewStateSchema, s);
        }

        public static DSnapViewStateSchema[] values()
        {
            return (DSnapViewStateSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return a;
        }

        public final int getColumnNumber()
        {
            return ordinal();
        }

        public final String getConstraints()
        {
            return c;
        }

        public final DataType getDataType()
        {
            return b;
        }

        static 
        {
            ID = new DSnapViewStateSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            TIME_LAST_VIEWED_MILLISECONDS = new DSnapViewStateSchema("TIME_LAST_VIEWED_MILLISECONDS", 1, "time_last_viewed_milli", DataType.INTEGER);
            $VALUES = (new DSnapViewStateSchema[] {
                ID, TIME_LAST_VIEWED_MILLISECONDS
            });
        }

        private DSnapViewStateSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private DSnapViewStateSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static final DSnapViewStateTable c = new DSnapViewStateTable();
    private final vA d;

    protected DSnapViewStateTable()
    {
        this(vA.a());
    }

    private DSnapViewStateTable(vA va)
    {
        d = va;
    }

    private static ContentValues a(vA.b b1)
    {
        return (new tA()).a(DSnapViewStateSchema.ID, b1.a).a(DSnapViewStateSchema.TIME_LAST_VIEWED_MILLISECONDS, b1.b).a;
    }

    public static DSnapViewStateTable a()
    {
        return c;
    }

    private static List a(SQLiteDatabase sqlitedatabase)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        sqlitedatabase = sqlitedatabase.query("DSnapViewState", a, null, null, null, null, null);
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        boolean flag;
        if (sqlitedatabase.moveToFirst())
        {
            do
            {
                arraylist.add(new vA.b(sqlitedatabase.getString(DSnapViewStateSchema.ID.getColumnNumber()), sqlitedatabase.getLong(DSnapViewStateSchema.TIME_LAST_VIEWED_MILLISECONDS.getColumnNumber())));
                flag = sqlitedatabase.moveToNext();
            } while (flag);
        }
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return arraylist;
        Exception exception;
        exception;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw exception;
    }

    protected final volatile ContentValues a(Object obj)
    {
        return a((vA.b)obj);
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final void a(Context context)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        Timber.c("DSnapViewStateTable", "safeUpdate - beginTransaction", new Object[0]);
        context.beginTransaction();
        Iterator iterator;
        Timber.c("DSnapViewStateTable", "Delete the table for DSnapViewState", new Object[0]);
        context.delete("DSnapViewState", null, null);
        iterator = d.d.values().iterator();
_L2:
        ContentValues contentvalues;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_148;
            }
            contentvalues = a((vA.b)iterator.next());
        } while (contentvalues == null);
        if (context.insertWithOnConflict("DSnapViewState", null, contentvalues, 5) != -1L) goto _L2; else goto _L1
_L1:
        throw new SQLiteException("Insertion in DB failed for DSnapViewState");
        Object obj;
        obj;
        Timber.e("DSnapViewState", "Error while writing to database: %s", new Object[] {
            ((SQLiteException) (obj)).getMessage()
        });
        context.endTransaction();
        Timber.c("DSnapViewStateTable", "safeUpdate - endTransaction", new Object[0]);
        return;
        Timber.c("DSnapViewStateTable", "Remove redundant entries in DSnapViewState", new Object[0]);
        context.execSQL(ts.a("DSnapViewState", DSnapViewStateSchema.ID, "EditionChunk", EditionChunkTable.EditionChunkSchema.ID));
        context.setTransactionSuccessful();
        context.endTransaction();
        Timber.c("DSnapViewStateTable", "safeUpdate - endTransaction", new Object[0]);
        return;
        obj;
        context.endTransaction();
        Timber.c("DSnapViewStateTable", "safeUpdate - endTransaction", new Object[0]);
        throw obj;
    }

    public final void b(Br br)
    {
        br = DatabaseHelper.a(SnapchatApplication.get()).getReadableDatabase();
        Timber.c("DSnapViewStateTable", "populateUserObjectFromTable - beginTransaction", new Object[0]);
        br.beginTransaction();
        Object obj = a(br);
        vA va = d;
        vA.b b1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); va.b(b1.a, b1.b))
        {
            b1 = (vA.b)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_98;
        Exception exception;
        exception;
        br.endTransaction();
        Timber.c("DSnapViewStateTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        throw exception;
        br.endTransaction();
        Timber.c("DSnapViewStateTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        return;
    }

    public final tt[] b()
    {
        return DSnapViewStateSchema.values();
    }

    public final String c()
    {
        return "DSnapViewState";
    }

    public final void c(Br br)
    {
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        DSnapViewStateSchema adsnapviewstateschema[] = DSnapViewStateSchema.values();
        int j = adsnapviewstateschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = adsnapviewstateschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(DSnapViewStateSchema.a(((DSnapViewStateSchema) (obj)))).append(" ").append(DSnapViewStateSchema.b(((DSnapViewStateSchema) (obj))).toString()).toString());
            obj = ((DSnapViewStateSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }

    static 
    {
        DSnapViewStateSchema adsnapviewstateschema[] = DSnapViewStateSchema.values();
        int j = adsnapviewstateschema.length;
        a = new String[j];
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            DSnapViewStateSchema dsnapviewstateschema = adsnapviewstateschema[i];
            a[i] = adsnapviewstateschema[i].getColumnName();
            b.put(dsnapviewstateschema.getColumnName(), dsnapviewstateschema.getColumnName());
        }

    }
}
