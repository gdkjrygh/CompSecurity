// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            OperationsQueue, DaoSession

public class OperationsQueueDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Error = new Property(4, java/lang/Boolean, "error", false, "ERROR");
        public static final Property ForeignId = new Property(1, java/lang/Long, "foreignId", false, "FOREIGN_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property TableName = new Property(2, java/lang/String, "tableName", false, "TABLE_NAME");
        public static final Property Type = new Property(3, java/lang/Integer, "type", false, "TYPE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "OPERATIONS_QUEUE";

    public OperationsQueueDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public OperationsQueueDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "IF NOT EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'OPERATIONS_QUEUE' (").append("'_id' INTEGER PRIMARY KEY AUTOINCREMENT ,").append("'FOREIGN_ID' INTEGER,").append("'TABLE_NAME' TEXT,").append("'TYPE' INTEGER,").append("'ERROR' INTEGER);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'OPERATIONS_QUEUE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, OperationsQueue operationsqueue)
    {
        sqlitestatement.clearBindings();
        Object obj = operationsqueue.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = operationsqueue.getForeignId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = operationsqueue.getTableName();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = operationsqueue.getType();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        operationsqueue = operationsqueue.getError();
        if (operationsqueue != null)
        {
            long l;
            if (operationsqueue.booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(5, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (OperationsQueue)obj);
    }

    public Long getKey(OperationsQueue operationsqueue)
    {
        if (operationsqueue != null)
        {
            return operationsqueue.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((OperationsQueue)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public OperationsQueue readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        String s;
        Integer integer;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            cursor = obj;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        return new OperationsQueue(long1, long2, s, integer, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, OperationsQueue operationsqueue, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        operationsqueue.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        operationsqueue.setForeignId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        operationsqueue.setTableName(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        operationsqueue.setType(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            cursor = obj1;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        operationsqueue.setError(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (OperationsQueue)obj, i);
    }

    public Long readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return Long.valueOf(cursor.getLong(i + 0));
        }
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    protected Long updateKeyAfterInsert(OperationsQueue operationsqueue, long l)
    {
        operationsqueue.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((OperationsQueue)obj, l);
    }
}
