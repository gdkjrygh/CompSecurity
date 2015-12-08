// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Br;
import Bt;
import PG;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public final class FindFriendRequestCacheTable extends DbTable
{
    public static final class NumberToTimestampSchema extends Enum
        implements tt
    {

        private static final NumberToTimestampSchema $VALUES[];
        public static final NumberToTimestampSchema HASHED_NUMBER;
        public static final NumberToTimestampSchema REQUEST_TIMESTAMP;
        private int a;
        private String b;
        private DataType c;
        private String d;

        static String a(NumberToTimestampSchema numbertotimestampschema)
        {
            return numbertotimestampschema.b;
        }

        static DataType b(NumberToTimestampSchema numbertotimestampschema)
        {
            return numbertotimestampschema.c;
        }

        public static NumberToTimestampSchema valueOf(String s)
        {
            return (NumberToTimestampSchema)Enum.valueOf(com/snapchat/android/database/table/FindFriendRequestCacheTable$NumberToTimestampSchema, s);
        }

        public static NumberToTimestampSchema[] values()
        {
            return (NumberToTimestampSchema[])$VALUES.clone();
        }

        public final String getColumnName()
        {
            return b;
        }

        public final int getColumnNumber()
        {
            return a;
        }

        public final String getConstraints()
        {
            return d;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            HASHED_NUMBER = new NumberToTimestampSchema("HASHED_NUMBER", "hashedPhoneNumber", DataType.TEXT, "PRIMARY KEY");
            REQUEST_TIMESTAMP = new NumberToTimestampSchema("REQUEST_TIMESTAMP", "requestTimestamp", DataType.LONG);
            $VALUES = (new NumberToTimestampSchema[] {
                HASHED_NUMBER, REQUEST_TIMESTAMP
            });
        }

        private NumberToTimestampSchema(String s, String s1, DataType datatype)
        {
            super(s, 1);
            a = 1;
            b = s1;
            c = datatype;
        }

        private NumberToTimestampSchema(String s, String s1, DataType datatype, String s2)
        {
            super(s, 0);
            a = 0;
            b = s1;
            c = datatype;
            d = s2;
        }
    }


    private static FindFriendRequestCacheTable a;

    public FindFriendRequestCacheTable()
    {
    }

    public static FindFriendRequestCacheTable a()
    {
        com/snapchat/android/database/table/FindFriendRequestCacheTable;
        JVM INSTR monitorenter ;
        FindFriendRequestCacheTable findfriendrequestcachetable;
        if (a == null)
        {
            a = new FindFriendRequestCacheTable();
        }
        findfriendrequestcachetable = a;
        com/snapchat/android/database/table/FindFriendRequestCacheTable;
        JVM INSTR monitorexit ;
        return findfriendrequestcachetable;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Br br, Map map)
    {
        if (br != null && Bt.t()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        br = DatabaseHelper.a(SnapchatApplication.get()).getWritableDatabase();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "saveEntriesToDatabase - beginTransaction", new Object[0]);
        }
        br.beginTransaction();
        ContentValues contentvalues;
        for (map = map.entrySet().iterator(); map.hasNext(); br.insertWithOnConflict("FindFriendRequestCacheTable", null, contentvalues, 5))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            contentvalues = new ContentValues();
            contentvalues.put(NumberToTimestampSchema.HASHED_NUMBER.getColumnName(), (String)entry.getKey());
            contentvalues.put(NumberToTimestampSchema.REQUEST_TIMESTAMP.getColumnName(), (Long)entry.getValue());
            if (ReleaseManager.f())
            {
                Timber.c("FindFriendRequestCacheTable", (new StringBuilder("Save hashed phone number:")).append((String)entry.getKey()).append("requested at timestamp:").append(entry.getValue()).toString(), new Object[0]);
            }
        }

        break MISSING_BLOCK_LABEL_209;
        map;
        br.endTransaction();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "saveEntriesToDatabase - endTransaction", new Object[0]);
        }
        throw map;
        br.setTransactionSuccessful();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "saveEntriesToDatabase - TransactionSuccessful", new Object[0]);
        }
        br.endTransaction();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "saveEntriesToDatabase - endTransaction", new Object[0]);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void a(Br br, Set set)
    {
        PG.b();
        if (br != null && Bt.t()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        br = DatabaseHelper.a(SnapchatApplication.get()).getWritableDatabase();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "removeEntriesFromDatabase - beginTransaction", new Object[0]);
        }
        br.beginTransaction();
        String s;
        for (set = set.iterator(); set.hasNext(); br.delete("FindFriendRequestCacheTable", (new StringBuilder()).append(NumberToTimestampSchema.HASHED_NUMBER.getColumnName()).append("=?").toString(), new String[] {
    s
}))
        {
            s = (String)set.next();
            PG.b();
            if (ReleaseManager.f())
            {
                Timber.c("FindFriendRequestCacheTable", (new StringBuilder("delete entry for hashed phone number:")).append(s).toString(), new Object[0]);
            }
        }

        break MISSING_BLOCK_LABEL_171;
        set;
        br.endTransaction();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "removeEntriesFromDatabase - endTransaction", new Object[0]);
        }
        throw set;
        br.setTransactionSuccessful();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "removeEntriesFromDatabase - TransactionSuccessful", new Object[0]);
        }
        br.endTransaction();
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "removeEntriesFromDatabase - endTransaction", new Object[0]);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static Map e(Br br)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (br == null || !Bt.t())
        {
            return hashmap;
        }
        i().lock();
        br = DatabaseHelper.a(SnapchatApplication.get()).getReadableDatabase().query("FindFriendRequestCacheTable", null, null, null, null, null, null);
        if (ReleaseManager.f())
        {
            Timber.c("FindFriendRequestCacheTable", "Querying [%s] database table", new Object[] {
                "FindFriendRequestCacheTable"
            });
        }
        if (br == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        boolean flag;
        if (br.moveToFirst())
        {
            do
            {
                hashmap.put(br.getString(NumberToTimestampSchema.HASHED_NUMBER.getColumnNumber()), Long.valueOf(br.getLong(NumberToTimestampSchema.REQUEST_TIMESTAMP.getColumnNumber())));
                flag = br.moveToNext();
            } while (flag);
        }
        if (br != null)
        {
            br.close();
        }
        i().unlock();
        return hashmap;
        Exception exception;
        exception;
        if (br != null)
        {
            br.close();
        }
        i().unlock();
        throw exception;
    }

    protected final ContentValues a(Object obj)
    {
        obj = (java.util.Map.Entry)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            tA ta = new tA();
            ta.a(NumberToTimestampSchema.HASHED_NUMBER, (String)((java.util.Map.Entry) (obj)).getKey());
            ta.a(NumberToTimestampSchema.REQUEST_TIMESTAMP, ((Long)((java.util.Map.Entry) (obj)).getValue()).longValue());
            return ta.a;
        }
    }

    protected final volatile Object a(Cursor cursor)
    {
        return null;
    }

    protected final Collection a(Br br)
    {
        return null;
    }

    public final tt[] b()
    {
        return NumberToTimestampSchema.values();
    }

    public final String c()
    {
        return "FindFriendRequestCacheTable";
    }

    public final String d()
    {
        StringBuilder stringbuilder = new StringBuilder();
        NumberToTimestampSchema anumbertotimestampschema[] = NumberToTimestampSchema.values();
        int j = anumbertotimestampschema.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = anumbertotimestampschema[i];
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append((new StringBuilder()).append(NumberToTimestampSchema.a(((NumberToTimestampSchema) (obj)))).append(" ").append(NumberToTimestampSchema.b(((NumberToTimestampSchema) (obj))).toString()).toString());
            obj = ((NumberToTimestampSchema) (obj)).getConstraints();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                stringbuilder.append(" ");
                stringbuilder.append(((String) (obj)));
            }
        }

        return stringbuilder.toString();
    }
}
