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
import vJ;

public final class ChannelViewStateTable extends DbTable
{
    public static final class ChannelViewStateSchema extends Enum
        implements tt
    {

        private static final ChannelViewStateSchema $VALUES[];
        public static final ChannelViewStateSchema ID;
        public static final ChannelViewStateSchema TIME_LAST_VIEWED_MILLISECONDS;
        private String a;
        private DataType b;
        private String c;

        static String a(ChannelViewStateSchema channelviewstateschema)
        {
            return channelviewstateschema.a;
        }

        static DataType b(ChannelViewStateSchema channelviewstateschema)
        {
            return channelviewstateschema.b;
        }

        public static ChannelViewStateSchema valueOf(String s)
        {
            return (ChannelViewStateSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/ChannelViewStateTable$ChannelViewStateSchema, s);
        }

        public static ChannelViewStateSchema[] values()
        {
            return (ChannelViewStateSchema[])$VALUES.clone();
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
            ID = new ChannelViewStateSchema("ID", "_id", DataType.TEXT, "PRIMARY KEY");
            TIME_LAST_VIEWED_MILLISECONDS = new ChannelViewStateSchema("TIME_LAST_VIEWED_MILLISECONDS", 1, "time_last_viewed_milli", DataType.INTEGER);
            $VALUES = (new ChannelViewStateSchema[] {
                ID, TIME_LAST_VIEWED_MILLISECONDS
            });
        }

        private ChannelViewStateSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private ChannelViewStateSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    private static String a[];
    private static HashMap b;
    private static final ChannelViewStateTable c = new ChannelViewStateTable();
    private final vA d;

    protected ChannelViewStateTable()
    {
        this(vA.a());
    }

    private ChannelViewStateTable(vA va)
    {
        d = va;
    }

    private static ContentValues a(vA.a a1)
    {
        return (new tA()).a(ChannelViewStateSchema.ID, a1.a).a(ChannelViewStateSchema.TIME_LAST_VIEWED_MILLISECONDS, a1.b).a;
    }

    public static ChannelViewStateTable a()
    {
        return c;
    }

    private static List a(SQLiteDatabase sqlitedatabase)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        sqlitedatabase = sqlitedatabase.query("ChannelViewState", a, null, null, null, null, null);
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        boolean flag;
        if (sqlitedatabase.moveToFirst())
        {
            do
            {
                arraylist.add(new vA.a(sqlitedatabase.getString(ChannelViewStateSchema.ID.getColumnNumber()), sqlitedatabase.getLong(ChannelViewStateSchema.TIME_LAST_VIEWED_MILLISECONDS.getColumnNumber())));
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
        return a((vA.a)obj);
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final void a(Context context)
    {
        context = DatabaseHelper.a(context).getWritableDatabase();
        Timber.c("ChannelViewStateTable", "safeUpdate - beginTransaction", new Object[0]);
        context.beginTransaction();
        Iterator iterator;
        Timber.c("ChannelViewStateTable", "Delete the table for ChannelViewState", new Object[0]);
        context.delete("ChannelViewState", null, null);
        iterator = d.c.values().iterator();
_L2:
        ContentValues contentvalues;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_148;
            }
            contentvalues = a((vA.a)iterator.next());
        } while (contentvalues == null);
        if (context.insertWithOnConflict("ChannelViewState", null, contentvalues, 5) != -1L) goto _L2; else goto _L1
_L1:
        throw new SQLiteException("Insertion in DB failed for ChannelViewState");
        Object obj;
        obj;
        Timber.e("ChannelViewState", "Error while writing to database: %s", new Object[] {
            ((SQLiteException) (obj)).getMessage()
        });
        context.endTransaction();
        Timber.c("ChannelViewStateTable", "safeUpdate - endTransaction", new Object[0]);
        return;
        Timber.c("ChannelViewStateTable", "Remove redundant entries in ChannelViewState", new Object[0]);
        context.execSQL(ts.a("ChannelViewState", ChannelViewStateSchema.ID, "PublisherChannel", PublisherChannelTable.PublisherChannelSchema.NAME));
        context.setTransactionSuccessful();
        context.endTransaction();
        Timber.c("ChannelViewStateTable", "safeUpdate - endTransaction", new Object[0]);
        return;
        obj;
        context.endTransaction();
        Timber.c("ChannelViewStateTable", "safeUpdate - endTransaction", new Object[0]);
        throw obj;
    }

    public final void b(Br br)
    {
        br = DatabaseHelper.a(SnapchatApplication.get()).getReadableDatabase();
        Timber.c("ChannelViewStateTable", "populateUserObjectFromTable - beginTransaction", new Object[0]);
        br.beginTransaction();
        Object obj;
        Object obj1 = a(br);
        obj = d;
        vA.a a1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((vA) (obj)).a(a1.a, a1.b))
        {
            a1 = (vA.a)((Iterator) (obj1)).next();
        }

        break MISSING_BLOCK_LABEL_98;
        obj;
        br.endTransaction();
        Timber.c("ChannelViewStateTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        throw obj;
        ((vA) (obj)).a.b();
        br.endTransaction();
        Timber.c("ChannelViewStateTable", "populateUserObjectFromTable - endTransaction", new Object[0]);
        return;
    }

    public final tt[] b()
    {
        return ChannelViewStateSchema.values();
    }

    public final String c()
    {
        return "ChannelViewState";
    }

    public final void c(Br br)
    {
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        ChannelViewStateSchema achannelviewstateschema[] = ChannelViewStateSchema.values();
        int j = achannelviewstateschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = achannelviewstateschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(ChannelViewStateSchema.a(((ChannelViewStateSchema) (obj)))).append(" ").append(ChannelViewStateSchema.b(((ChannelViewStateSchema) (obj))).toString()).toString());
            obj = ((ChannelViewStateSchema) (obj)).getConstraints();
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
        ChannelViewStateSchema achannelviewstateschema[] = ChannelViewStateSchema.values();
        int j = achannelviewstateschema.length;
        a = new String[j];
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            ChannelViewStateSchema channelviewstateschema = achannelviewstateschema[i];
            a[i] = achannelviewstateschema[i].getColumnName();
            b.put(channelviewstateschema.getColumnName(), channelviewstateschema.getColumnName());
        }

    }
}
