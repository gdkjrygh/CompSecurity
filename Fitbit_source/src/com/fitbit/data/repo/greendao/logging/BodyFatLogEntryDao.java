// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.logging:
//            BodyFatLogEntry, DaoSession

public class BodyFatLogEntryDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property LogDate = new Property(8, java/util/Date, "logDate", false, "LOG_DATE");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property TrackerType = new Property(7, java/lang/String, "trackerType", false, "TRACKER_TYPE");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
        public static final Property Value = new Property(6, java/lang/Double, "value", false, "VALUE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "BODY_FAT_LOG_ENTRY";

    public BodyFatLogEntryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public BodyFatLogEntryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'BODY_FAT_LOG_ENTRY' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'VALUE' REAL,").append("'TRACKER_TYPE' TEXT,").append("'LOG_DATE' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_BODY_FAT_LOG_ENTRY_UUID ON BODY_FAT_LOG_ENTRY").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_BODY_FAT_LOG_ENTRY_ENTITY_STATUS ON BODY_FAT_LOG_ENTRY").append(" (ENTITY_STATUS);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_BODY_FAT_LOG_ENTRY_LOG_DATE ON BODY_FAT_LOG_ENTRY").append(" (LOG_DATE);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'BODY_FAT_LOG_ENTRY'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, BodyFatLogEntry bodyfatlogentry)
    {
        sqlitestatement.clearBindings();
        Object obj = bodyfatlogentry.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = bodyfatlogentry.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = bodyfatlogentry.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = bodyfatlogentry.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = bodyfatlogentry.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = bodyfatlogentry.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = bodyfatlogentry.getValue();
        if (obj != null)
        {
            sqlitestatement.bindDouble(7, ((Double) (obj)).doubleValue());
        }
        obj = bodyfatlogentry.getTrackerType();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        bodyfatlogentry = bodyfatlogentry.getLogDate();
        if (bodyfatlogentry != null)
        {
            sqlitestatement.bindLong(9, bodyfatlogentry.getTime());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (BodyFatLogEntry)obj);
    }

    public Long getKey(BodyFatLogEntry bodyfatlogentry)
    {
        if (bodyfatlogentry != null)
        {
            return bodyfatlogentry.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((BodyFatLogEntry)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public BodyFatLogEntry readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Double double1;
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
        if (cursor.isNull(i + 6))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            cursor = obj;
        } else
        {
            cursor = new Date(cursor.getLong(i + 8));
        }
        return new BodyFatLogEntry(long1, long2, s, date, date1, integer, double1, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, BodyFatLogEntry bodyfatlogentry, int i)
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
        bodyfatlogentry.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        bodyfatlogentry.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        bodyfatlogentry.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        bodyfatlogentry.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        bodyfatlogentry.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        bodyfatlogentry.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 6));
        }
        bodyfatlogentry.setValue(((Double) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        bodyfatlogentry.setTrackerType(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            cursor = new Date(cursor.getLong(i + 8));
        }
        bodyfatlogentry.setLogDate(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (BodyFatLogEntry)obj, i);
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

    protected Long updateKeyAfterInsert(BodyFatLogEntry bodyfatlogentry, long l)
    {
        bodyfatlogentry.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((BodyFatLogEntry)obj, l);
    }
}
