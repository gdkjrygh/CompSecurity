// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;

// Referenced classes of package com.pinterest.api.model:
//            SyncJob, DaoSession

public class SyncJobDao extends AbstractDao
{

    public static final String TABLENAME = "SYNC_JOB";

    public SyncJobDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SyncJobDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'SYNC_JOB' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'KEY' TEXT UNIQUE ,'TYPE' INTEGER,'ACTION' INTEGER,'UID' TEXT,'GROUP_UID' TEXT);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SYNC_JOB'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SyncJob syncjob)
    {
        sqlitestatement.clearBindings();
        Object obj = syncjob.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = syncjob.getKey();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = syncjob.getType();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Integer) (obj)).intValue());
        }
        obj = syncjob.getAction();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        obj = syncjob.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        syncjob = syncjob.getGroupUid();
        if (syncjob != null)
        {
            sqlitestatement.bindString(6, syncjob);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SyncJob)obj);
    }

    public Long getKey(SyncJob syncjob)
    {
        if (syncjob != null)
        {
            return syncjob.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SyncJob)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public SyncJob readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        String s;
        Integer integer;
        Integer integer1;
        String s1;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        if (cursor.isNull(i + 2))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 5);
        }
        return new SyncJob(long1, s, integer, integer1, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SyncJob syncjob, int i)
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
        syncjob.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        syncjob.setKey(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 2));
        }
        syncjob.setType(((Integer) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        syncjob.setAction(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        syncjob.setUid(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 5);
        }
        syncjob.setGroupUid(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SyncJob)obj, i);
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

    protected Long updateKeyAfterInsert(SyncJob syncjob, long l)
    {
        syncjob.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((SyncJob)obj, l);
    }
}
