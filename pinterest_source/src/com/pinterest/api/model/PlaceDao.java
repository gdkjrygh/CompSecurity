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
//            Place, DaoSession

public class PlaceDao extends AbstractDao
{

    public static final String TABLENAME = "PLACE";

    public PlaceDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public PlaceDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'PLACE' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'UID' TEXT,'CACHE_EXPIRATION_DATE' INTEGER,'SEARCH_ID' TEXT,'LATITUDE' REAL,'LONGITUDE' REAL,'CATEGORY' TEXT,'SOURCE_ICON' TEXT,'SOURCE_NAME' TEXT,'NAME' TEXT,'LOCALITY' TEXT,'URL' TEXT,'COUNTRY' TEXT,'REGION' TEXT,'SOURCE_URL' TEXT,'PHONE' TEXT,'STREET' TEXT,'POSTAL_CODE' TEXT,'TYPE' TEXT,'ACCESS' TEXT,'HOURS' TEXT,'TIPS' TEXT,'FROM_PIN_JOIN' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PLACE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Place place)
    {
        sqlitestatement.clearBindings();
        Object obj = place.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = place.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = place.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Date) (obj)).getTime());
        }
        obj = place.getSearchId();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = place.getLatitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(5, ((Double) (obj)).doubleValue());
        }
        obj = place.getLongitude();
        if (obj != null)
        {
            sqlitestatement.bindDouble(6, ((Double) (obj)).doubleValue());
        }
        obj = place.getCategory();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = place.getSourceIcon();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = place.getSourceName();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = place.getName();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = place.getLocality();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = place.getUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = place.getCountry();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = place.getRegion();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = place.getSourceUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = place.getPhone();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = place.getStreet();
        if (obj != null)
        {
            sqlitestatement.bindString(17, ((String) (obj)));
        }
        obj = place.getPostalCode();
        if (obj != null)
        {
            sqlitestatement.bindString(18, ((String) (obj)));
        }
        obj = place.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(19, ((String) (obj)));
        }
        obj = place.getAccess();
        if (obj != null)
        {
            sqlitestatement.bindString(20, ((String) (obj)));
        }
        obj = place.getHours();
        if (obj != null)
        {
            sqlitestatement.bindString(21, ((String) (obj)));
        }
        obj = place.getTips();
        if (obj != null)
        {
            sqlitestatement.bindString(22, ((String) (obj)));
        }
        place = place.getFromPinJoin();
        if (place != null)
        {
            long l;
            if (place.booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(23, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Place)obj);
    }

    public Long getKey(Place place)
    {
        if (place != null)
        {
            return place.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Place)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Place readEntity(Cursor cursor, int i)
    {
        Long long1;
        String s;
        Date date;
        String s1;
        Double double1;
        Double double2;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        String s12;
        String s13;
        String s14;
        String s15;
        String s16;
        String s17;
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
            double1 = null;
        } else
        {
            double1 = Double.valueOf(cursor.getDouble(i + 4));
        }
        if (cursor.isNull(i + 5))
        {
            double2 = null;
        } else
        {
            double2 = Double.valueOf(cursor.getDouble(i + 5));
        }
        if (cursor.isNull(i + 6))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 6);
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
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 16);
        }
        if (cursor.isNull(i + 17))
        {
            s13 = null;
        } else
        {
            s13 = cursor.getString(i + 17);
        }
        if (cursor.isNull(i + 18))
        {
            s14 = null;
        } else
        {
            s14 = cursor.getString(i + 18);
        }
        if (cursor.isNull(i + 19))
        {
            s15 = null;
        } else
        {
            s15 = cursor.getString(i + 19);
        }
        if (cursor.isNull(i + 20))
        {
            s16 = null;
        } else
        {
            s16 = cursor.getString(i + 20);
        }
        if (cursor.isNull(i + 21))
        {
            s17 = null;
        } else
        {
            s17 = cursor.getString(i + 21);
        }
        if (cursor.isNull(i + 22))
        {
            cursor = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 22) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        return new Place(long1, s, date, s1, double1, double2, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Place place, int i)
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
        place.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        place.setUid(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 2));
        }
        place.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        place.setSearchId(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 4));
        }
        place.setLatitude(((Double) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = Double.valueOf(cursor.getDouble(i + 5));
        }
        place.setLongitude(((Double) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        place.setCategory(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        place.setSourceIcon(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        place.setSourceName(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        place.setName(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        place.setLocality(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        place.setUrl(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        place.setCountry(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        place.setRegion(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        place.setSourceUrl(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        place.setPhone(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 16);
        }
        place.setStreet(((String) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 17);
        }
        place.setPostalCode(((String) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 18);
        }
        place.setType(((String) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 19);
        }
        place.setAccess(((String) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 20);
        }
        place.setHours(((String) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 21);
        }
        place.setTips(((String) (obj)));
        if (cursor.isNull(i + 22))
        {
            cursor = obj1;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 22) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cursor = Boolean.valueOf(flag);
        }
        place.setFromPinJoin(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Place)obj, i);
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

    protected Long updateKeyAfterInsert(Place place, long l)
    {
        place.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Place)obj, l);
    }
}
