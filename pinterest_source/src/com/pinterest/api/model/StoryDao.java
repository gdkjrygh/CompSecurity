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
//            Story, DaoSession

public class StoryDao extends AbstractDao
{

    public static final String TABLENAME = "STORY";

    public StoryDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public StoryDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'STORY' ('_id' INTEGER PRIMARY KEY ,'UID' TEXT,'CACHE_EXPIRATION_DATE' INTEGER,'STORY_TYPE' TEXT,'CELL_TYPE' TEXT,'RELATED_HEADER' TEXT,'HAS_VIEWED' INTEGER,'LAST_UPDATE_TS' INTEGER,'MESSAGE' TEXT,'MAIN_OBJECT_ID' TEXT,'MAIN_ACTOR_ID' TEXT,'MAIN_ACTOR_TYPE' INTEGER,'ACTOR_IDS' TEXT,'RELATED_OBJECT_IDS' TEXT,'MAIN_OBJECT_TYPE' INTEGER,'OBJECTS_TYPE' INTEGER,'OBJECTS_COUNT' INTEGER,'TOTAL_COUNT' INTEGER,'IMAGE_URL' TEXT,'DESTINATION_URL' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'STORY'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Story story)
    {
        sqlitestatement.clearBindings();
        Object obj = story.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = story.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = story.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Date) (obj)).getTime());
        }
        obj = story.getStoryType();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = story.getCellType();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = story.getRelatedHeader();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = story.getHasViewed();
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
        obj = story.getLastUpdateTs();
        if (obj != null)
        {
            sqlitestatement.bindLong(8, ((Long) (obj)).longValue());
        }
        obj = story.getMessage();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = story.getMainObjectId();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = story.getMainActorId();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = story.getMainActorType();
        if (obj != null)
        {
            sqlitestatement.bindLong(12, ((Integer) (obj)).intValue());
        }
        obj = story.getActorIds();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = story.getRelatedObjectIds();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = story.getMainObjectType();
        if (obj != null)
        {
            sqlitestatement.bindLong(15, ((Integer) (obj)).intValue());
        }
        obj = story.getObjectsType();
        if (obj != null)
        {
            sqlitestatement.bindLong(16, ((Integer) (obj)).intValue());
        }
        obj = story.getObjectsCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(17, ((Integer) (obj)).intValue());
        }
        obj = story.getTotalCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(18, ((Integer) (obj)).intValue());
        }
        obj = story.getImageUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(19, ((String) (obj)));
        }
        story = story.getDestinationUrl();
        if (story != null)
        {
            sqlitestatement.bindString(20, story);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Story)obj);
    }

    public Long getKey(Story story)
    {
        if (story != null)
        {
            return story.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Story)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Story readEntity(Cursor cursor, int i)
    {
        Long long1;
        String s;
        Date date;
        String s1;
        String s2;
        String s3;
        Boolean boolean1;
        Long long2;
        String s4;
        String s5;
        String s6;
        Integer integer;
        String s7;
        String s8;
        Integer integer1;
        Integer integer2;
        Integer integer3;
        Integer integer4;
        String s9;
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
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 2));
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
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 7));
        }
        if (cursor.isNull(i + 8))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 14));
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
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            integer4 = null;
        } else
        {
            integer4 = Integer.valueOf(cursor.getInt(i + 17));
        }
        if (cursor.isNull(i + 18))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 18);
        }
        if (cursor.isNull(i + 19))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 19);
        }
        return new Story(long1, s, date, s1, s2, s3, boolean1, long2, s4, s5, s6, integer, s7, s8, integer1, integer2, integer3, integer4, s9, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Story story, int i)
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
        story.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        story.setUid(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 2));
        }
        story.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        story.setStoryType(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        story.setCellType(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        story.setRelatedHeader(((String) (obj)));
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
        story.setHasViewed(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 7));
        }
        story.setLastUpdateTs(((Long) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        story.setMessage(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        story.setMainObjectId(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        story.setMainActorId(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 11));
        }
        story.setMainActorType(((Integer) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        story.setActorIds(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        story.setRelatedObjectIds(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 14));
        }
        story.setMainObjectType(((Integer) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 15));
        }
        story.setObjectsType(((Integer) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 16));
        }
        story.setObjectsCount(((Integer) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 17));
        }
        story.setTotalCount(((Integer) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 18);
        }
        story.setImageUrl(((String) (obj)));
        if (cursor.isNull(i + 19))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 19);
        }
        story.setDestinationUrl(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Story)obj, i);
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

    protected Long updateKeyAfterInsert(Story story, long l)
    {
        story.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Story)obj, l);
    }
}
