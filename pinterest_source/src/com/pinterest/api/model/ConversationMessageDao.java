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
//            ConversationMessage, DaoSession

public class ConversationMessageDao extends AbstractDao
{

    public static final String TABLENAME = "CONVERSATION_MESSAGE";

    public ConversationMessageDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public ConversationMessageDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'CONVERSATION_MESSAGE' ('UID' TEXT PRIMARY KEY NOT NULL ,'CACHE_EXPIRATION_DATE' INTEGER,'CONVERSATION_ID' TEXT,'SENDER_ID' TEXT,'PIN_ID' TEXT,'BOARD_ID' TEXT,'USER_ID' TEXT,'TEXT' TEXT,'CREATED_AT' INTEGER);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'CONVERSATION_MESSAGE'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, ConversationMessage conversationmessage)
    {
        sqlitestatement.clearBindings();
        Object obj = conversationmessage.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(1, ((String) (obj)));
        }
        obj = conversationmessage.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(2, ((Date) (obj)).getTime());
        }
        obj = conversationmessage.getConversationId();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = conversationmessage.getSenderId();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = conversationmessage.getPinId();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = conversationmessage.getBoardId();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = conversationmessage.getUserId();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = conversationmessage.getText();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        conversationmessage = conversationmessage.getCreatedAt();
        if (conversationmessage != null)
        {
            sqlitestatement.bindLong(9, conversationmessage.getTime());
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (ConversationMessage)obj);
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ConversationMessage)obj);
    }

    public String getKey(ConversationMessage conversationmessage)
    {
        if (conversationmessage != null)
        {
            return conversationmessage.getUid();
        } else
        {
            return null;
        }
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public ConversationMessage readEntity(Cursor cursor, int i)
    {
        Object obj = null;
        String s;
        Date date;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
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
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            cursor = obj;
        } else
        {
            cursor = new Date(cursor.getLong(i + 8));
        }
        return new ConversationMessage(s, date, s1, s2, s3, s4, s5, s6, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, ConversationMessage conversationmessage, int i)
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
        conversationmessage.setUid(((String) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 1));
        }
        conversationmessage.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        conversationmessage.setConversationId(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        conversationmessage.setSenderId(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        conversationmessage.setPinId(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        conversationmessage.setBoardId(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        conversationmessage.setUserId(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        conversationmessage.setText(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            cursor = obj1;
        } else
        {
            cursor = new Date(cursor.getLong(i + 8));
        }
        conversationmessage.setCreatedAt(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (ConversationMessage)obj, i);
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
        return updateKeyAfterInsert((ConversationMessage)obj, l);
    }

    protected String updateKeyAfterInsert(ConversationMessage conversationmessage, long l)
    {
        return conversationmessage.getUid();
    }
}
