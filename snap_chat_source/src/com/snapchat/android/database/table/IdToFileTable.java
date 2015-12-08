// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            DbTable

public abstract class IdToFileTable extends DbTable
{
    public static final class IdToFileSchema extends Enum
        implements tt
    {

        private static final IdToFileSchema $VALUES[];
        public static final IdToFileSchema FILE_PATH;
        public static final IdToFileSchema LAST_ACCESS_MILLISECONDS;
        public static final IdToFileSchema SNAP_ID;
        private int a;
        private String b;
        private DataType c;

        static String a(IdToFileSchema idtofileschema)
        {
            return idtofileschema.b;
        }

        static DataType b(IdToFileSchema idtofileschema)
        {
            return idtofileschema.c;
        }

        public static IdToFileSchema valueOf(String s)
        {
            return (IdToFileSchema)Enum.valueOf(com/snapchat/android/database/table/IdToFileTable$IdToFileSchema, s);
        }

        public static IdToFileSchema[] values()
        {
            return (IdToFileSchema[])$VALUES.clone();
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
            return null;
        }

        public final DataType getDataType()
        {
            return c;
        }

        static 
        {
            SNAP_ID = new IdToFileSchema("SNAP_ID", 0, 1, "id", DataType.TEXT);
            FILE_PATH = new IdToFileSchema("FILE_PATH", 1, 2, "path", DataType.TEXT);
            LAST_ACCESS_MILLISECONDS = new IdToFileSchema("LAST_ACCESS_MILLISECONDS", 2, 3, "last_access", DataType.LONG);
            $VALUES = (new IdToFileSchema[] {
                SNAP_ID, FILE_PATH, LAST_ACCESS_MILLISECONDS
            });
        }

        private IdToFileSchema(String s, int i, int j, String s1, DataType datatype)
        {
            super(s, i);
            a = j;
            b = s1;
            c = datatype;
        }
    }


    public IdToFileTable()
    {
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
            ta.a(IdToFileSchema.SNAP_ID, (String)((java.util.Map.Entry) (obj)).getKey());
            ta.a(IdToFileSchema.FILE_PATH, ((JY.b)((java.util.Map.Entry) (obj)).getValue()).mAbsoluteFilePath);
            ta.a(IdToFileSchema.LAST_ACCESS_MILLISECONDS, ((JY.b)((java.util.Map.Entry) (obj)).getValue()).mLastAccessMilliseconds);
            return ta.a;
        }
    }

    protected final volatile Object a(Cursor cursor)
    {
        return null;
    }

    public final tt[] b()
    {
        return IdToFileSchema.values();
    }

    public final String d()
    {
        String s = "_id INTEGER PRIMARY KEY";
        IdToFileSchema aidtofileschema[] = IdToFileSchema.values();
        int j = aidtofileschema.length;
        for (int i = 0; i < j; i++)
        {
            IdToFileSchema idtofileschema = aidtofileschema[i];
            s = (new StringBuilder()).append(s).append(",").append(IdToFileSchema.a(idtofileschema)).append(" ").append(IdToFileSchema.b(idtofileschema).toString()).toString();
        }

        return s;
    }

    public final Map f()
    {
        Cursor cursor;
        i().lock();
        cursor = mDatabase.query(c(), null, null, null, null, null, null);
        Object obj = m();
        if (obj == null)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            i().unlock();
            return null;
        }
        obj = new HashMap();
        if (ReleaseManager.f())
        {
            Timber.c("IdToFileTable", "Querying [%s] database table", new Object[] {
                c()
            });
        }
        cursor.moveToFirst();
        boolean flag;
        do
        {
            if (cursor.isAfterLast())
            {
                break;
            }
            ((Map) (obj)).put(cursor.getString(IdToFileSchema.SNAP_ID.getColumnNumber()), new JY.b(cursor.getString(IdToFileSchema.FILE_PATH.getColumnNumber()), cursor.getLong(IdToFileSchema.LAST_ACCESS_MILLISECONDS.getColumnNumber())));
            flag = cursor.moveToNext();
        } while (flag);
        if (cursor != null)
        {
            cursor.close();
        }
        i().unlock();
        return ((Map) (obj));
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        i().unlock();
        throw exception;
    }
}
