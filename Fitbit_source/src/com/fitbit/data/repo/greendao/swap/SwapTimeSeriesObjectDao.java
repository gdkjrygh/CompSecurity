// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            SwapTimeSeriesObject, DaoSession

public class SwapTimeSeriesObjectDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property DateTime = new Property(1, java/util/Date, "dateTime", false, "DATE_TIME");
        public static final Property EntityStatus = new Property(4, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property ForeignId = new Property(6, java/lang/Long, "foreignId", false, "FOREIGN_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Level = new Property(5, java/lang/Integer, "level", false, "LEVEL");
        public static final Property ObjectType = new Property(3, java/lang/Integer, "objectType", false, "OBJECT_TYPE");
        public static final Property Value = new Property(2, java/lang/Double, "value", false, "VALUE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "SWAP_TIME_SERIES_OBJECT";

    public SwapTimeSeriesObjectDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public SwapTimeSeriesObjectDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'SWAP_TIME_SERIES_OBJECT' (").append("'_id' INTEGER PRIMARY KEY ,").append("'DATE_TIME' INTEGER,").append("'VALUE' REAL,").append("'OBJECT_TYPE' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'LEVEL' INTEGER,").append("'FOREIGN_ID' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SWAP_TIME_SERIES_OBJECT_DATE_TIME ON SWAP_TIME_SERIES_OBJECT").append(" (DATE_TIME);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_SWAP_TIME_SERIES_OBJECT_FOREIGN_ID ON SWAP_TIME_SERIES_OBJECT").append(" (FOREIGN_ID);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'SWAP_TIME_SERIES_OBJECT'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, SwapTimeSeriesObject swaptimeseriesobject)
    {
        sqlitestatement.clearBindings();
        Object obj = swaptimeseriesobject.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = swaptimeseriesobject.getDateTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = swaptimeseriesobject.getValue();
        if (obj != null)
        {
            sqlitestatement.bindDouble(3, ((Double) (obj)).doubleValue());
        }
        obj = swaptimeseriesobject.getObjectType();
        if (obj != null)
        {
            sqlitestatement.bindLong(4, ((Integer) (obj)).intValue());
        }
        obj = swaptimeseriesobject.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Integer) (obj)).intValue());
        }
        obj = swaptimeseriesobject.getLevel();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        swaptimeseriesobject = swaptimeseriesobject.getForeignId();
        if (swaptimeseriesobject != null)
        {
            sqlitestatement.bindLong(7, swaptimeseriesobject.longValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (SwapTimeSeriesObject)obj);
    }

    public Long getKey(SwapTimeSeriesObject swaptimeseriesobject)
    {
        if (swaptimeseriesobject != null)
        {
            return swaptimeseriesobject.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((SwapTimeSeriesObject)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public SwapTimeSeriesObject readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Date date;
        Double double1;
        Integer integer;
        Integer integer1;
        Integer integer2;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 1));
        }
        if (cursor.isNull(i + 2))
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 2));
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
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            cursor = obj;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 6));
        }
        return new SwapTimeSeriesObject(long1, date, double1, integer, integer1, integer2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, SwapTimeSeriesObject swaptimeseriesobject, int i)
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
        swaptimeseriesobject.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        swaptimeseriesobject.setDateTime(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 2));
        }
        swaptimeseriesobject.setValue(((Double) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 3));
        }
        swaptimeseriesobject.setObjectType(((Integer) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 4));
        }
        swaptimeseriesobject.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        swaptimeseriesobject.setLevel(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            cursor = obj1;
        } else
        {
            cursor = Long.valueOf(cursor.getLong(i + 6));
        }
        swaptimeseriesobject.setForeignId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (SwapTimeSeriesObject)obj, i);
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

    protected Long updateKeyAfterInsert(SwapTimeSeriesObject swaptimeseriesobject, long l)
    {
        swaptimeseriesobject.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((SwapTimeSeriesObject)obj, l);
    }
}
