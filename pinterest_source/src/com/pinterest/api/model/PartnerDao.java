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
//            Partner, DaoSession

public class PartnerDao extends AbstractDao
{

    public static final String TABLENAME = "PARTNER";

    public PartnerDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public PartnerDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'PARTNER' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'UID' TEXT,'CACHE_EXPIRATION_DATE' INTEGER,'ACCOUNT_TYPE' TEXT,'AUTO_FOLLOW_ALLOWED' INTEGER,'BUSINESS_NAME' TEXT,'CONTACT_NAME' TEXT,'TYPE' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PARTNER'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Partner partner)
    {
        sqlitestatement.clearBindings();
        Object obj = partner.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = partner.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = partner.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Date) (obj)).getTime());
        }
        obj = partner.getAccountType();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = partner.getAutoFollowAllowed();
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
            sqlitestatement.bindLong(5, l);
        }
        obj = partner.getBusinessName();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = partner.getContactName();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        partner = partner.getType();
        if (partner != null)
        {
            sqlitestatement.bindString(8, partner);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Partner)obj);
    }

    public Long getKey(Partner partner)
    {
        if (partner != null)
        {
            return partner.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Partner)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Partner readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        Long long1;
        String s;
        Date date;
        String s1;
        Boolean boolean1;
        String s2;
        String s3;
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
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 5))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        return new Partner(long1, s, date, s1, boolean1, s2, s3, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Partner partner, int i)
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
        partner.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        partner.setUid(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 2));
        }
        partner.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        partner.setAccountType(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 4) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        partner.setAutoFollowAllowed(((Boolean) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        partner.setBusinessName(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        partner.setContactName(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 7);
        }
        partner.setType(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Partner)obj, i);
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

    protected Long updateKeyAfterInsert(Partner partner, long l)
    {
        partner.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Partner)obj, l);
    }
}
