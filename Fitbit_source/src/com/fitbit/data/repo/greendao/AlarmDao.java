// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            Alarm, DaoSession, DeviceDao, Device

public class AlarmDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property DaysOfWeek = new Property(15, java/lang/Integer, "daysOfWeek", false, "DAYS_OF_WEEK");
        public static final Property Deleted = new Property(16, java/lang/Boolean, "deleted", false, "DELETED");
        public static final Property DeviceId = new Property(17, java/lang/Long, "deviceId", false, "DEVICE_ID");
        public static final Property Enabled = new Property(6, java/lang/Boolean, "enabled", false, "ENABLED");
        public static final Property EntityStatus = new Property(5, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Label = new Property(8, java/lang/String, "label", false, "LABEL");
        public static final Property Recurring = new Property(7, java/lang/Boolean, "recurring", false, "RECURRING");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");
        public static final Property SnoozeCount = new Property(9, java/lang/Integer, "snoozeCount", false, "SNOOZE_COUNT");
        public static final Property SnoozeLength = new Property(10, java/lang/Long, "snoozeLength", false, "SNOOZE_LENGTH");
        public static final Property StayVisible = new Property(11, java/lang/Boolean, "stayVisible", false, "STAY_VISIBLE");
        public static final Property SyncedToDevice = new Property(12, java/lang/Boolean, "syncedToDevice", false, "SYNCED_TO_DEVICE");
        public static final Property Time = new Property(13, java/util/Date, "time", false, "TIME");
        public static final Property TimeCreated = new Property(3, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property TimeUpdated = new Property(4, java/util/Date, "timeUpdated", false, "TIME_UPDATED");
        public static final Property Uuid = new Property(2, java/lang/String, "uuid", false, "UUID");
        public static final Property VibePattern = new Property(14, java/lang/String, "vibePattern", false, "VIBE_PATTERN");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "ALARM";
    private DaoSession daoSession;
    private Query device_AlarmListQuery;
    private String selectDeep;

    public AlarmDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public AlarmDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
        daoSession = daosession;
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ALARM' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER,").append("'UUID' TEXT,").append("'TIME_CREATED' INTEGER,").append("'TIME_UPDATED' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'ENABLED' INTEGER,").append("'RECURRING' INTEGER,").append("'LABEL' TEXT,").append("'SNOOZE_COUNT' INTEGER,").append("'SNOOZE_LENGTH' INTEGER,").append("'STAY_VISIBLE' INTEGER,").append("'SYNCED_TO_DEVICE' INTEGER,").append("'TIME' INTEGER,").append("'VIBE_PATTERN' TEXT,").append("'DAYS_OF_WEEK' INTEGER,").append("'DELETED' INTEGER,").append("'DEVICE_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_ALARM_UUID ON ALARM").append(" (UUID);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_ALARM_ENTITY_STATUS ON ALARM").append(" (ENTITY_STATUS);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ALARM'").toString());
    }

    public List _queryDevice_AlarmList(Long long1)
    {
        this;
        JVM INSTR monitorenter ;
        if (device_AlarmListQuery == null)
        {
            QueryBuilder querybuilder = queryBuilder();
            querybuilder.where(Properties.DeviceId.eq(null), new WhereCondition[0]);
            device_AlarmListQuery = querybuilder.build();
        }
        this;
        JVM INSTR monitorexit ;
        Query query = device_AlarmListQuery.forCurrentThread();
        query.setParameter(0, long1);
        return query.list();
        long1;
        this;
        JVM INSTR monitorexit ;
        throw long1;
    }

    protected void attachEntity(Alarm alarm)
    {
        super.attachEntity(alarm);
        alarm.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((Alarm)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Alarm alarm)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = alarm.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = alarm.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = alarm.getUuid();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = alarm.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Date) (obj)).getTime());
        }
        obj = alarm.getTimeUpdated();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Date) (obj)).getTime());
        }
        obj = alarm.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = alarm.getEnabled();
        long l;
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(7, l);
        }
        obj = alarm.getRecurring();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(8, l);
        }
        obj = alarm.getLabel();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = alarm.getSnoozeCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(10, ((Integer) (obj)).intValue());
        }
        obj = alarm.getSnoozeLength();
        if (obj != null)
        {
            sqlitestatement.bindLong(11, ((Long) (obj)).longValue());
        }
        obj = alarm.getStayVisible();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(12, l);
        }
        obj = alarm.getSyncedToDevice();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(13, l);
        }
        obj = alarm.getTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Date) (obj)).getTime());
        }
        obj = alarm.getVibePattern();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = alarm.getDaysOfWeek();
        if (obj != null)
        {
            sqlitestatement.bindLong(16, ((Integer) (obj)).intValue());
        }
        obj = alarm.getDeleted();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(17, l);
        }
        alarm = alarm.getDeviceId();
        if (alarm != null)
        {
            sqlitestatement.bindLong(18, alarm.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Alarm)obj);
    }

    public Long getKey(Alarm alarm)
    {
        if (alarm != null)
        {
            return alarm.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Alarm)obj);
    }

    protected String getSelectDeep()
    {
        if (selectDeep == null)
        {
            StringBuilder stringbuilder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(stringbuilder, "T", getAllColumns());
            stringbuilder.append(',');
            SqlUtils.appendColumns(stringbuilder, "T0", daoSession.getDeviceDao().getAllColumns());
            stringbuilder.append(" FROM ALARM T");
            stringbuilder.append(" LEFT JOIN DEVICE T0 ON T.'DEVICE_ID'=T0.'_id'");
            stringbuilder.append(' ');
            selectDeep = stringbuilder.toString();
        }
        return selectDeep;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public List loadAllDeepFromCursor(Cursor cursor)
    {
        ArrayList arraylist;
        int i = cursor.getCount();
        arraylist = new ArrayList(i);
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (identityScope != null)
        {
            identityScope.lock();
            identityScope.reserveRoom(i);
        }
        boolean flag;
        do
        {
            arraylist.add(loadCurrentDeep(cursor, false));
            flag = cursor.moveToNext();
        } while (flag);
        if (identityScope != null)
        {
            identityScope.unlock();
        }
        return arraylist;
        cursor;
        if (identityScope != null)
        {
            identityScope.unlock();
        }
        throw cursor;
    }

    protected Alarm loadCurrentDeep(Cursor cursor, boolean flag)
    {
        Alarm alarm = (Alarm)loadCurrent(cursor, 0, flag);
        int i = getAllColumns().length;
        alarm.setDevice((Device)loadCurrentOther(daoSession.getDeviceDao(), cursor, i));
        return alarm;
    }

    public Alarm loadDeep(Long long1)
    {
        assertSinglePk();
        if (long1 == null)
        {
            return null;
        }
        Object obj = new StringBuilder(getSelectDeep());
        ((StringBuilder) (obj)).append("WHERE ");
        SqlUtils.appendColumnsEqValue(((StringBuilder) (obj)), "T", getPkColumns());
        obj = ((StringBuilder) (obj)).toString();
        long1 = long1.toString();
        long1 = db.rawQuery(((String) (obj)), new String[] {
            long1
        });
        boolean flag = long1.moveToFirst();
        if (!flag)
        {
            long1.close();
            return null;
        }
        if (!long1.isLast())
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected unique result, but count was ").append(long1.getCount()).toString());
        }
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        long1.close();
        throw exception;
        Alarm alarm = loadCurrentDeep(long1, true);
        long1.close();
        return alarm;
    }

    protected List loadDeepAllAndCloseCursor(Cursor cursor)
    {
        List list = loadAllDeepFromCursor(cursor);
        cursor.close();
        return list;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public transient List queryDeep(String s, String as[])
    {
        return loadDeepAllAndCloseCursor(db.rawQuery((new StringBuilder()).append(getSelectDeep()).append(s).toString(), as));
    }

    public Alarm readEntity(Cursor cursor, int i)
    {
        Long long1;
        Long long2;
        String s;
        Date date;
        Date date1;
        Integer integer;
        Boolean boolean1;
        Boolean boolean2;
        String s1;
        Integer integer1;
        Long long3;
        Boolean boolean3;
        Boolean boolean4;
        Date date2;
        String s2;
        Integer integer2;
        Boolean boolean5;
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
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 6) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 7))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 7) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 8))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 9));
        }
        if (cursor.isNull(i + 10))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 10));
        }
        if (cursor.isNull(i + 11))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 11) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 12))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 12) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 13))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 15));
        }
        if (cursor.isNull(i + 16))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 16) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 17))
        {
            cursor = null;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 17));
        }
        return new Alarm(long1, long2, s, date, date1, integer, boolean1, boolean2, s1, integer1, long3, boolean3, boolean4, date2, s2, integer2, boolean5, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Alarm alarm, int i)
    {
        boolean flag5 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        alarm.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        alarm.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        alarm.setUuid(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 3));
        }
        alarm.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 4));
        }
        alarm.setTimeUpdated(((Date) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        alarm.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 6) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        alarm.setEnabled(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 7) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        alarm.setRecurring(((Boolean) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        alarm.setLabel(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 9));
        }
        alarm.setSnoozeCount(((Integer) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 10));
        }
        alarm.setSnoozeLength(((Long) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 11) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        alarm.setStayVisible(((Boolean) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 12) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        alarm.setSyncedToDevice(((Boolean) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 13));
        }
        alarm.setTime(((Date) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        alarm.setVibePattern(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 15));
        }
        alarm.setDaysOfWeek(((Integer) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 16) != 0)
            {
                flag4 = flag5;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        alarm.setDeleted(((Boolean) (obj)));
        if (cursor.isNull(i + 17))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 17));
        }
        alarm.setDeviceId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Alarm)obj, i);
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

    protected Long updateKeyAfterInsert(Alarm alarm, long l)
    {
        alarm.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Alarm)obj, l);
    }
}
