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
//            TimeZone, DaoSession

public class TimeZoneDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Name = new Property(3, java/lang/String, "name", false, "NAME");
        public static final Property Offset = new Property(4, java/lang/Long, "offset", false, "OFFSET");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property TimeZoneId = new Property(2, java/lang/String, "timeZoneId", false, "TIME_ZONE_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "TIME_ZONE";

    public TimeZoneDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public TimeZoneDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'TIME_ZONE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'TIME_ZONE_ID' TEXT UNIQUE ,").append("'NAME' TEXT,").append("'OFFSET' INTEGER,").append("'ENTITY_STATUS' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_TIME_ZONE_TIME_ZONE_ID ON TIME_ZONE").append(" (TIME_ZONE_ID);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'TIME_ZONE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, TimeZone timezone)
    {
        sqlitestatement.clearBindings();
        Object obj = timezone.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = timezone.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = timezone.getTimeZoneId();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = timezone.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = timezone.getOffset();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Long) (obj)).longValue());
        }
        timezone = timezone.getEntityStatus();
        if (timezone != null)
        {
            sqlitestatement.bindLong(6, timezone.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (TimeZone)obj);
    }

    public Long getKey(TimeZone timezone)
    {
        if (timezone != null)
        {
            return timezone.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((TimeZone)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public TimeZone readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        String s;
        String s1;
        Long long3;
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
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 5));
        }
        return new TimeZone(long1, long2, s, s1, long3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, TimeZone timezone, int i)
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
        timezone.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        timezone.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        timezone.setTimeZoneId(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        timezone.setName(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 4));
        }
        timezone.setOffset(((Long) (obj)));
        if (cursor.isNull(i + 5))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 5));
        }
        timezone.setEntityStatus(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (TimeZone)obj, i);
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

    protected Long updateKeyAfterInsert(TimeZone timezone, long l)
    {
        timezone.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((TimeZone)obj, l);
    }
}
