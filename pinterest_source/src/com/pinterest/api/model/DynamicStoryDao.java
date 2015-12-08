// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            DynamicStory, DaoSession

public class DynamicStoryDao extends AbstractDao
{

    public static final String TABLENAME = "DYNAMIC_STORY";

    public DynamicStoryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DynamicStoryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'DYNAMIC_STORY' ('_id' INTEGER PRIMARY KEY ,'CACHE_EXPIRATION_DATE' INTEGER,'TYPE' TEXT,'UID' TEXT,'STORY_TYPE' TEXT,'CONTAINER_TYPE' TEXT,'DISABLE_LOGGING' INTEGER,'FEATURED_IDS' TEXT,'REGULAR_IDS' TEXT,'CONTENT_IDS' TEXT,'POSITION' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DYNAMIC_STORY'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, DynamicStory dynamicstory)
    {
        sqlitestatement.clearBindings();
        Object obj = dynamicstory.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = dynamicstory.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = dynamicstory.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = dynamicstory.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = dynamicstory.getStoryType();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = dynamicstory.getContainerType();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = dynamicstory.getDisableLogging();
        if (obj != null)
        {
            long l;
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(7, l);
        }
        obj = dynamicstory.getFeaturedIds();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = dynamicstory.getRegularIds();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = dynamicstory.getContentIds();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        dynamicstory = dynamicstory.getPosition();
        if (dynamicstory != null)
        {
            sqlitestatement.bindLong(11, dynamicstory.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (DynamicStory)obj);
    }

    public Long getKey(DynamicStory dynamicstory)
    {
        if (dynamicstory != null)
        {
            return dynamicstory.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((DynamicStory)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public DynamicStory readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        Date date;
        String s;
        String s1;
        String s2;
        String s3;
        Boolean boolean1;
        String s4;
        String s5;
        String s6;
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 5);
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
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 10));
        }
        return new DynamicStory(long1, date, s, s1, s2, s3, boolean1, s4, s5, s6, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, DynamicStory dynamicstory, int i)
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
        dynamicstory.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        dynamicstory.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        dynamicstory.setType(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        dynamicstory.setUid(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        dynamicstory.setStoryType(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        dynamicstory.setContainerType(((String) (obj)));
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
        dynamicstory.setDisableLogging(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        dynamicstory.setFeaturedIds(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        dynamicstory.setRegularIds(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        dynamicstory.setContentIds(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            cursor = obj1;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 10));
        }
        dynamicstory.setPosition(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (DynamicStory)obj, i);
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

    protected Long updateKeyAfterInsert(DynamicStory dynamicstory, long l)
    {
        dynamicstory.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((DynamicStory)obj, l);
    }
}
