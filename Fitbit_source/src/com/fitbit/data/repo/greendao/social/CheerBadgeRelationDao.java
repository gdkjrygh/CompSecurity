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
//            CheerBadgeRelation, DaoSession

public class CheerBadgeRelationDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property BadgeEncodedId = new Property(1, java/lang/String, "badgeEncodedId", false, "BADGE_ENCODED_ID");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property UserEncodedId = new Property(2, java/lang/String, "userEncodedId", false, "USER_ENCODED_ID");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "CHEER_BADGE_RELATION";

    public CheerBadgeRelationDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public CheerBadgeRelationDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'CHEER_BADGE_RELATION' (").append("'_id' INTEGER PRIMARY KEY ,").append("'BADGE_ENCODED_ID' TEXT,").append("'USER_ENCODED_ID' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'CHEER_BADGE_RELATION'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, CheerBadgeRelation cheerbadgerelation)
    {
        sqlitestatement.clearBindings();
        Object obj = cheerbadgerelation.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = cheerbadgerelation.getBadgeEncodedId();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        cheerbadgerelation = cheerbadgerelation.getUserEncodedId();
        if (cheerbadgerelation != null)
        {
            sqlitestatement.bindString(3, cheerbadgerelation);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (CheerBadgeRelation)obj);
    }

    public Long getKey(CheerBadgeRelation cheerbadgerelation)
    {
        if (cheerbadgerelation != null)
        {
            return cheerbadgerelation.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((CheerBadgeRelation)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public CheerBadgeRelation readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        String s;
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
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        return new CheerBadgeRelation(long1, s, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, CheerBadgeRelation cheerbadgerelation, int i)
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
        cheerbadgerelation.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        cheerbadgerelation.setBadgeEncodedId(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 2);
        }
        cheerbadgerelation.setUserEncodedId(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (CheerBadgeRelation)obj, i);
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

    protected Long updateKeyAfterInsert(CheerBadgeRelation cheerbadgerelation, long l)
    {
        cheerbadgerelation.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((CheerBadgeRelation)obj, l);
    }
}
