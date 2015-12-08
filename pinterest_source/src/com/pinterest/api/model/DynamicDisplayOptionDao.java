// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;

// Referenced classes of package com.pinterest.api.model:
//            DynamicDisplayOption, DaoSession

public class DynamicDisplayOptionDao extends AbstractDao
{

    public static final String TABLENAME = "DYNAMIC_DISPLAY_OPTION";

    public DynamicDisplayOptionDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public DynamicDisplayOptionDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'DYNAMIC_DISPLAY_OPTION' ('SHOW_FOLLOW_BUTTON' INTEGER,'TAP_ONLY' INTEGER,'ACTION_BUTTON_LOCATION' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'DYNAMIC_DISPLAY_OPTION'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, DynamicDisplayOption dynamicdisplayoption)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Boolean boolean1 = dynamicdisplayoption.getShowFollowButton();
        long l;
        if (boolean1 != null)
        {
            if (boolean1.booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(1, l);
        }
        boolean1 = dynamicdisplayoption.getTapOnly();
        if (boolean1 != null)
        {
            if (boolean1.booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(2, l);
        }
        dynamicdisplayoption = dynamicdisplayoption.getActionButtonLocation();
        if (dynamicdisplayoption != null)
        {
            sqlitestatement.bindLong(3, dynamicdisplayoption.intValue());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (DynamicDisplayOption)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((DynamicDisplayOption)obj);
    }

    public Void getKey(DynamicDisplayOption dynamicdisplayoption)
    {
        return null;
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public DynamicDisplayOption readEntity(Cursor cursor, int i)
    {
        boolean flag2 = true;
        Object obj = null;
        Boolean boolean1;
        Boolean boolean2;
        if (cursor.isNull(i + 0))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 0) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 1))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 1) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 2));
        }
        return new DynamicDisplayOption(boolean1, boolean2, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, DynamicDisplayOption dynamicdisplayoption, int i)
    {
        boolean flag2 = true;
        Object obj = null;
        Boolean boolean1;
        if (cursor.isNull(i + 0))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 0) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        dynamicdisplayoption.setShowFollowButton(boolean1);
        if (cursor.isNull(i + 1))
        {
            boolean1 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 1) != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            boolean1 = Boolean.valueOf(flag1);
        }
        dynamicdisplayoption.setTapOnly(boolean1);
        if (cursor.isNull(i + 2))
        {
            cursor = obj;
        } else
        {
            cursor = Integer.valueOf(cursor.getInt(i + 2));
        }
        dynamicdisplayoption.setActionButtonLocation(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (DynamicDisplayOption)obj, i);
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    public Void readKey(Cursor cursor, int i)
    {
        return null;
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((DynamicDisplayOption)obj, l);
    }

    protected Void updateKeyAfterInsert(DynamicDisplayOption dynamicdisplayoption, long l)
    {
        return null;
    }
}
