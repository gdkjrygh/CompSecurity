// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mobiletrack;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.mobiletrack:
//            PedometerMinuteData, DaoSession

public class PedometerMinuteDataDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property MetsCount;
        public static final Property MinuteType = new Property(9, java/lang/Integer, "minuteType", false, "MINUTE_TYPE");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property StepsCount;
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Timestamp;
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");

        static 
        {
            Timestamp = new Property(6, Long.TYPE, "timestamp", false, "TIMESTAMP");
            StepsCount = new Property(7, Integer.TYPE, "stepsCount", false, "STEPS_COUNT");
            MetsCount = new Property(8, Double.TYPE, "metsCount", false, "METS_COUNT");
        }

        public Properties()
        {
        }
    }


    public static final String TABLENAME = "PEDOMETER_MINUTE_DATA";

    public PedometerMinuteDataDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public PedometerMinuteDataDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'PEDOMETER_MINUTE_DATA' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'TIMESTAMP' INTEGER NOT NULL ,").append("'STEPS_COUNT' INTEGER NOT NULL ,").append("'METS_COUNT' REAL NOT NULL ,").append("'MINUTE_TYPE' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_PEDOMETER_MINUTE_DATA_UUID ON PEDOMETER_MINUTE_DATA").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_PEDOMETER_MINUTE_DATA_ENTITY_STATUS ON PEDOMETER_MINUTE_DATA").append(" (ENTITY_STATUS);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PEDOMETER_MINUTE_DATA'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, PedometerMinuteData pedometerminutedata)
    {
        sqlitestatement.clearBindings();
        Object obj = pedometerminutedata.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = pedometerminutedata.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = pedometerminutedata.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = pedometerminutedata.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = pedometerminutedata.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = pedometerminutedata.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        sqlitestatement.bindLong(7, pedometerminutedata.getTimestamp());
        sqlitestatement.bindLong(8, pedometerminutedata.getStepsCount());
        sqlitestatement.bindDouble(9, pedometerminutedata.getMetsCount());
        pedometerminutedata = pedometerminutedata.getMinuteType();
        if (pedometerminutedata != null)
        {
            sqlitestatement.bindLong(10, pedometerminutedata.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (PedometerMinuteData)obj);
    }

    public Long getKey(PedometerMinuteData pedometerminutedata)
    {
        if (pedometerminutedata != null)
        {
            return pedometerminutedata.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((PedometerMinuteData)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public PedometerMinuteData readEntity(Cursor cursor, int i)
    {
        double d;
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        int j;
        long l;
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
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 3));
        }
        if (cursor.isNull(i + 4))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 5));
        }
        l = cursor.getLong(i + 6);
        j = cursor.getInt(i + 7);
        d = cursor.getDouble(i + 8);
        if (cursor.isNull(i + 9))
        {
            cursor = null;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 9));
        }
        return new PedometerMinuteData(long1, long2, s, date, date1, integer, l, j, d, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, PedometerMinuteData pedometerminutedata, int i)
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
        pedometerminutedata.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        pedometerminutedata.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        pedometerminutedata.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        pedometerminutedata.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        pedometerminutedata.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        pedometerminutedata.setEntityStatus(((Integer) (obj)));
        pedometerminutedata.setTimestamp(cursor.getLong(i + 6));
        pedometerminutedata.setStepsCount(cursor.getInt(i + 7));
        pedometerminutedata.setMetsCount(cursor.getDouble(i + 8));
        if (cursor.isNull(i + 9))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 9));
        }
        pedometerminutedata.setMinuteType(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (PedometerMinuteData)obj, i);
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

    protected Long updateKeyAfterInsert(PedometerMinuteData pedometerminutedata, long l)
    {
        pedometerminutedata.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((PedometerMinuteData)obj, l);
    }
}
