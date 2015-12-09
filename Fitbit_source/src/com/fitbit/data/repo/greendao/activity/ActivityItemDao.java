// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            ActivityItem, DaoSession

public class ActivityItemDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property AccessLevel = new Property(2, java/lang/String, "accessLevel", false, "ACCESS_LEVEL");
        public static final Property HasSpeed = new Property(3, java/lang/Boolean, "hasSpeed", false, "HAS_SPEED");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Mets = new Property(5, java/lang/Double, "mets", false, "METS");
        public static final Property Name = new Property(4, java/lang/String, "name", false, "NAME");
        public static final Property Populated = new Property(6, java/lang/Boolean, "populated", false, "POPULATED");
        public static final Property ServerId = new Property(1, java/lang/Long, "serverId", false, "SERVER_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "ACTIVITY_ITEM";
    private DaoSession daoSession;

    public ActivityItemDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ActivityItemDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'ACTIVITY_ITEM' (").append("'_id' INTEGER PRIMARY KEY ,").append("'SERVER_ID' INTEGER UNIQUE ,").append("'ACCESS_LEVEL' TEXT,").append("'HAS_SPEED' INTEGER,").append("'NAME' TEXT,").append("'METS' REAL,").append("'POPULATED' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'ACTIVITY_ITEM'").toString());
    }

    protected void attachEntity(ActivityItem activityitem)
    {
        super.attachEntity(activityitem);
        activityitem.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((ActivityItem)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ActivityItem activityitem)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = activityitem.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = activityitem.getServerId();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Long) (obj)).longValue());
        }
        obj = activityitem.getAccessLevel();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = activityitem.getHasSpeed();
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
            sqlitestatement.bindLong(4, l);
        }
        obj = activityitem.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = activityitem.getMets();
        if (obj != null)
        {
            sqlitestatement.bindDouble(6, ((Double) (obj)).doubleValue());
        }
        activityitem = activityitem.getPopulated();
        if (activityitem != null)
        {
            if (activityitem.booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(7, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ActivityItem)obj);
    }

    public Long getKey(ActivityItem activityitem)
    {
        if (activityitem != null)
        {
            return activityitem.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ActivityItem)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public ActivityItem readEntity(Cursor cursor, int i)
    {
        boolean flag2 = true;
        Object obj = null;
        Long long1;
        Long long2;
        String s;
        Boolean boolean1;
        String s1;
        Double double1;
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
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 3) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
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
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            cursor = obj;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 6) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            cursor = Boolean.valueOf(flag1);
        }
        return new ActivityItem(long1, long2, s, boolean1, s1, double1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ActivityItem activityitem, int i)
    {
        boolean flag2 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        activityitem.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 1));
        }
        activityitem.setServerId(((Long) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        activityitem.setAccessLevel(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 3) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        activityitem.setHasSpeed(((Boolean) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        activityitem.setName(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 5));
        }
        activityitem.setMets(((Double) (obj)));
        if (cursor.isNull(i + 6))
        {
            cursor = obj1;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 6) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            cursor = Boolean.valueOf(flag1);
        }
        activityitem.setPopulated(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ActivityItem)obj, i);
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

    protected Long updateKeyAfterInsert(ActivityItem activityitem, long l)
    {
        activityitem.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((ActivityItem)obj, l);
    }
}
