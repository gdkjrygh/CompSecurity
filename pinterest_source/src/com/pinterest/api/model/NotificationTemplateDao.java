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
//            NotificationTemplate, DaoSession

public class NotificationTemplateDao extends AbstractDao
{

    public static final String TABLENAME = "NOTIFICATION_TEMPLATE";

    public NotificationTemplateDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public NotificationTemplateDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'NOTIFICATION_TEMPLATE' ('UID' TEXT PRIMARY KEY NOT NULL ,'CACHE_EXPIRATION_DATE' INTEGER,'TEMPLATE_STRING' TEXT,'SUBJECTS_JSON' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'NOTIFICATION_TEMPLATE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, NotificationTemplate notificationtemplate)
    {
        sqlitestatement.clearBindings();
        Object obj = notificationtemplate.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = notificationtemplate.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = notificationtemplate.getTemplateString();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        notificationtemplate = notificationtemplate.getSubjectsJson();
        if (notificationtemplate != null)
        {
            sqlitestatement.bindString(4, notificationtemplate);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (NotificationTemplate)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((NotificationTemplate)obj);
    }

    public String getKey(NotificationTemplate notificationtemplate)
    {
        if (notificationtemplate != null)
        {
            return notificationtemplate.getUid();
        } else
        {
            return null;
        }
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public NotificationTemplate readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        Date date;
        String s1;
        if (cursor.isNull(i + 0))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 0);
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
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            cursor = obj;
        } else
        {
            cursor = cursor.getString(i + 3);
        }
        return new NotificationTemplate(s, date, s1, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, NotificationTemplate notificationtemplate, int i)
    {
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 0);
        }
        notificationtemplate.setUid(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        notificationtemplate.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        notificationtemplate.setTemplateString(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 3);
        }
        notificationtemplate.setSubjectsJson(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (NotificationTemplate)obj, i);
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    public String readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return cursor.getString(i + 0);
        }
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((NotificationTemplate)obj, l);
    }

    protected String updateKeyAfterInsert(NotificationTemplate notificationtemplate, long l)
    {
        return notificationtemplate.getUid();
    }
}
