// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            Badge, DaoSession

public class BadgeDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Category = new Property(14, java/lang/String, "category", false, "CATEGORY");
        public static final Property DateTime = new Property(4, java/lang/Long, "dateTime", false, "DATE_TIME");
        public static final Property Description = new Property(9, java/lang/String, "description", false, "DESCRIPTION");
        public static final Property EarnedMessage = new Property(10, java/lang/String, "earnedMessage", false, "EARNED_MESSAGE");
        public static final Property EncodedId = new Property(1, java/lang/String, "encodedId", false, "ENCODED_ID");
        public static final Property GradientEnd = new Property(12, java/lang/Integer, "gradientEnd", false, "GRADIENT_END");
        public static final Property GradientStart = new Property(11, java/lang/Integer, "gradientStart", false, "GRADIENT_START");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property Image = new Property(7, java/lang/String, "image", false, "IMAGE");
        public static final Property MobileDescription = new Property(15, java/lang/String, "mobileDescription", false, "MOBILE_DESCRIPTION");
        public static final Property ShareImageUrl = new Property(17, java/lang/String, "shareImageUrl", false, "SHARE_IMAGE_URL");
        public static final Property ShareText = new Property(18, java/lang/String, "shareText", false, "SHARE_TEXT");
        public static final Property ShortDescription = new Property(16, java/lang/String, "shortDescription", false, "SHORT_DESCRIPTION");
        public static final Property ShortName = new Property(3, java/lang/String, "shortName", false, "SHORT_NAME");
        public static final Property TimesAchieved = new Property(5, java/lang/Integer, "timesAchieved", false, "TIMES_ACHIEVED");
        public static final Property Type = new Property(2, java/lang/String, "type", false, "TYPE");
        public static final Property Unit = new Property(8, java/lang/String, "unit", false, "UNIT");
        public static final Property UserId = new Property(13, java/lang/Long, "userId", false, "USER_ID");
        public static final Property Value = new Property(6, java/lang/Integer, "value", false, "VALUE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "BADGE";

    public BadgeDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public BadgeDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'BADGE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'ENCODED_ID' TEXT,").append("'TYPE' TEXT,").append("'SHORT_NAME' TEXT,").append("'DATE_TIME' INTEGER,").append("'TIMES_ACHIEVED' INTEGER,").append("'VALUE' INTEGER,").append("'IMAGE' TEXT,").append("'UNIT' TEXT,").append("'DESCRIPTION' TEXT,").append("'EARNED_MESSAGE' TEXT,").append("'GRADIENT_START' INTEGER,").append("'GRADIENT_END' INTEGER,").append("'USER_ID' INTEGER,").append("'CATEGORY' TEXT,").append("'MOBILE_DESCRIPTION' TEXT,").append("'SHORT_DESCRIPTION' TEXT,").append("'SHARE_IMAGE_URL' TEXT,").append("'SHARE_TEXT' TEXT);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_BADGE_USER_ID ON BADGE").append(" (USER_ID);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'BADGE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Badge badge)
    {
        sqlitestatement.clearBindings();
        Object obj = badge.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = badge.getEncodedId();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = badge.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = badge.getShortName();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = badge.getDateTime();
        if (obj != null)
        {
            sqlitestatement.bindLong(5, ((Long) (obj)).longValue());
        }
        obj = badge.getTimesAchieved();
        if (obj != null)
        {
            sqlitestatement.bindLong(6, ((Integer) (obj)).intValue());
        }
        obj = badge.getValue();
        if (obj != null)
        {
            sqlitestatement.bindLong(7, ((Integer) (obj)).intValue());
        }
        obj = badge.getImage();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = badge.getUnit();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = badge.getDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = badge.getEarnedMessage();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = badge.getGradientStart();
        if (obj != null)
        {
            sqlitestatement.bindLong(12, ((Integer) (obj)).intValue());
        }
        obj = badge.getGradientEnd();
        if (obj != null)
        {
            sqlitestatement.bindLong(13, ((Integer) (obj)).intValue());
        }
        obj = badge.getUserId();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Long) (obj)).longValue());
        }
        obj = badge.getCategory();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = badge.getMobileDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = badge.getShortDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(17, ((String) (obj)));
        }
        obj = badge.getShareImageUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(18, ((String) (obj)));
        }
        badge = badge.getShareText();
        if (badge != null)
        {
            sqlitestatement.bindString(19, badge);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Badge)obj);
    }

    public Long getKey(Badge badge)
    {
        if (badge != null)
        {
            return badge.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Badge)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Badge readEntity(Cursor cursor, int i)
    {
        Long long1;
        String s;
        String s1;
        String s2;
        Long long2;
        Integer integer;
        Integer integer1;
        String s3;
        String s4;
        String s5;
        String s6;
        Integer integer2;
        Integer integer3;
        Long long3;
        String s7;
        String s8;
        String s9;
        String s10;
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
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 4));
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
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 6));
        }
        if (cursor.isNull(i + 7))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 7);
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
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 12));
        }
        if (cursor.isNull(i + 13))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 16);
        }
        if (cursor.isNull(i + 17))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 17);
        }
        if (cursor.isNull(i + 18))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 18);
        }
        return new Badge(long1, s, s1, s2, long2, integer, integer1, s3, s4, s5, s6, integer2, integer3, long3, s7, s8, s9, s10, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Badge badge, int i)
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
        badge.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        badge.setEncodedId(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        badge.setType(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        badge.setShortName(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 4));
        }
        badge.setDateTime(((Long) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 5));
        }
        badge.setTimesAchieved(((Integer) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 6));
        }
        badge.setValue(((Integer) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        badge.setImage(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        badge.setUnit(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        badge.setDescription(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        badge.setEarnedMessage(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 11));
        }
        badge.setGradientStart(((Integer) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 12));
        }
        badge.setGradientEnd(((Integer) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 13));
        }
        badge.setUserId(((Long) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        badge.setCategory(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        badge.setMobileDescription(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 16);
        }
        badge.setShortDescription(((String) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 17);
        }
        badge.setShareImageUrl(((String) (obj)));
        if (cursor.isNull(i + 18))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 18);
        }
        badge.setShareText(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Badge)obj, i);
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

    protected Long updateKeyAfterInsert(Badge badge, long l)
    {
        badge.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Badge)obj, l);
    }
}
