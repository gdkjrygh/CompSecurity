// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            FoodLocale, DaoSession

public class FoodLocaleDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property ImageUpload = new Property(4, java/lang/Boolean, "imageUpload", false, "IMAGE_UPLOAD");
        public static final Property Label = new Property(2, java/lang/String, "label", false, "LABEL");
        public static final Property SupportsLookupByBarCode = new Property(3, java/lang/Boolean, "supportsLookupByBarCode", false, "SUPPORTS_LOOKUP_BY_BAR_CODE");
        public static final Property Value = new Property(1, java/lang/String, "value", false, "VALUE");


        public Properties()
        {
        }
    }


    public static final String TABLENAME = "FOOD_LOCALE";

    public FoodLocaleDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public FoodLocaleDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'FOOD_LOCALE' (").append("'_id' INTEGER PRIMARY KEY ,").append("'VALUE' TEXT,").append("'LABEL' TEXT,").append("'SUPPORTS_LOOKUP_BY_BAR_CODE' INTEGER,").append("'IMAGE_UPLOAD' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'FOOD_LOCALE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, FoodLocale foodlocale)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = foodlocale.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = foodlocale.getValue();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = foodlocale.getLabel();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = foodlocale.getSupportsLookupByBarCode();
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
        foodlocale = foodlocale.getImageUpload();
        if (foodlocale != null)
        {
            if (foodlocale.booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(5, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (FoodLocale)obj);
    }

    public Long getKey(FoodLocale foodlocale)
    {
        if (foodlocale != null)
        {
            return foodlocale.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((FoodLocale)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public FoodLocale readEntity(Cursor cursor, int i)
    {
        boolean flag2 = true;
        Object obj = null;
        Long long1;
        String s;
        String s1;
        Boolean boolean1;
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
            cursor = obj;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 4) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            cursor = Boolean.valueOf(flag1);
        }
        return new FoodLocale(long1, s, s1, boolean1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, FoodLocale foodlocale, int i)
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
        foodlocale.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        foodlocale.setValue(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        foodlocale.setLabel(((String) (obj)));
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
        foodlocale.setSupportsLookupByBarCode(((Boolean) (obj)));
        if (cursor.isNull(i + 4))
        {
            cursor = obj1;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 4) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            cursor = Boolean.valueOf(flag1);
        }
        foodlocale.setImageUpload(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (FoodLocale)obj, i);
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

    protected Long updateKeyAfterInsert(FoodLocale foodlocale, long l)
    {
        foodlocale.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((FoodLocale)obj, l);
    }
}
