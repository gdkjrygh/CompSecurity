// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.db.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.digby.mm.android.library.db.IMessageDBHelper;
import com.digby.mm.android.library.messages.IMessage;
import com.digby.mm.android.library.messages.impl.Message;
import com.digby.mm.android.library.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.digby.mm.android.library.db.impl:
//            DigbyDBHelper, DatabaseGuard

public class MessageDBHelper
    implements IMessageDBHelper
{

    public static final String MESSAGES_TABLE_CREATE = "CREATE TABLE Messages(ID INTEGER PRIMARY KEY, CampaignID INTEGER, Title TEXT, Message TEXT, ExpirationDate TEXT, IsRead INTEGER );";
    public static final String MESSAGES_TABLE_NAME = "Messages";
    public static final String MESSAGE_METADATA_TABLE_CREATE = "CREATE TABLE MessageMetadata (Key TEXT, Value TEXT, MessageID INTEGER, FOREIGN KEY(MessageID) REFERENCES Messages(ID));";
    public static final String MESSAGE_METADATA_TABLE_NAME = "MessageMetadata";
    public static final String SQL_INSERT_METADATA = "INSERT INTO MessageMetadata (MessageID, Key, Value) VALUES (?, ?, ?)";
    public static final String SQL_SELECT_METADATA = "SELECT MessageID, Key, Value FROM MessageMetadata";
    public static final String SQL_SELECT_METADATA_BY_CAMPAIGN_ID = "SELECT Key, Value FROM MessageMetadata mm, Messages m WHERE mm.MessageID = m.ID AND m.CampaignID = ?";
    private DigbyDBHelper mDBHelper;

    public MessageDBHelper(DigbyDBHelper digbydbhelper)
    {
        try
        {
            mDBHelper = digbydbhelper;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DigbyDBHelper digbydbhelper)
        {
            Logger.Error("MessageDBHelper", digbydbhelper);
        }
    }

    private void cursor2Metadata(Cursor cursor, Map map)
    {
        if (cursor != null && cursor.getColumnCount() > 0)
        {
            cursor.moveToFirst();
            for (; cursor.getPosition() != cursor.getCount(); cursor.moveToNext())
            {
                map.put(cursor.getString(0), cursor.getString(1));
            }

        }
    }

    private ContentValues getContentValues(long l, long l1, String s, String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        try
        {
            contentvalues.put("ID", Long.valueOf(l));
            contentvalues.put("CampaignID", Long.valueOf(l1));
            contentvalues.put("Title", s);
            contentvalues.put("Message", s1);
            contentvalues.put("ExpirationDate", s2);
            contentvalues.put("IsRead", Integer.valueOf(0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.Error("getContentValues", s);
            return contentvalues;
        }
        return contentvalues;
    }

    private Map getMetadata(long l)
    {
        SQLiteDatabase sqlitedatabase;
        Cursor cursor;
        SQLiteDatabase sqlitedatabase1;
        Cursor cursor1;
        Cursor cursor2;
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        obj = null;
        cursor2 = null;
        cursor = cursor2;
        cursor1 = obj;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase = sqlitedatabase2;
        cursor = cursor2;
        sqlitedatabase1 = sqlitedatabase2;
        cursor1 = obj;
        String s = (new StringBuilder()).append("").append(l).toString();
        sqlitedatabase = sqlitedatabase2;
        cursor = cursor2;
        sqlitedatabase1 = sqlitedatabase2;
        cursor1 = obj;
        cursor2 = sqlitedatabase2.query("MessageMetadata", new String[] {
            "Key", "Value"
        }, "MessageID=?", new String[] {
            s
        }, null, null, null);
        sqlitedatabase = sqlitedatabase2;
        cursor = cursor2;
        sqlitedatabase1 = sqlitedatabase2;
        cursor1 = cursor2;
        cursor2Metadata(cursor2, hashmap);
        if (cursor2 != null)
        {
            cursor2.close();
        }
        if (sqlitedatabase2 != null)
        {
            sqlitedatabase2.close();
        }
_L2:
        return hashmap;
        Exception exception1;
        exception1;
        sqlitedatabase1 = sqlitedatabase;
        cursor1 = cursor;
        Logger.Error("getMetadata", exception1);
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        return hashmap;
        Exception exception;
        exception;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        throw exception;
    }

    private Map getMetadataByCampaignID(long l)
    {
        Cursor cursor;
        Cursor cursor1;
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        Cursor cursor2;
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        obj = null;
        cursor2 = null;
        cursor = cursor2;
        cursor1 = obj;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase2;
        cursor1 = obj;
        sqlitedatabase1 = sqlitedatabase2;
        cursor2 = sqlitedatabase2.rawQuery("SELECT Key, Value FROM MessageMetadata mm, Messages m WHERE mm.MessageID = m.ID AND m.CampaignID = ?", new String[] {
            (new StringBuilder()).append("").append(l).toString()
        });
        cursor = cursor2;
        sqlitedatabase = sqlitedatabase2;
        cursor1 = cursor2;
        sqlitedatabase1 = sqlitedatabase2;
        cursor2Metadata(cursor2, hashmap);
        if (cursor2 != null)
        {
            cursor2.close();
        }
        if (sqlitedatabase2 != null)
        {
            sqlitedatabase2.close();
        }
_L2:
        return hashmap;
        Exception exception1;
        exception1;
        cursor1 = cursor;
        sqlitedatabase1 = sqlitedatabase;
        Logger.Error("getMetadataByCampaignID", exception1);
        if (cursor != null)
        {
            cursor.close();
        }
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        return hashmap;
        Exception exception;
        exception;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        throw exception;
    }

    private void insertOrUpdateMetadata(long l, long l1, Map map, boolean flag)
    {
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        Object obj = null;
        sqlitedatabase = null;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        sqlitedatabase = obj;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase2.delete("MessageMetadata", "MessageID = ?", new String[] {
            (new StringBuilder()).append("").append(l).toString()
        });
        sqlitedatabase = sqlitedatabase2;
        if (sqlitedatabase2 != null)
        {
            sqlitedatabase2.close();
            sqlitedatabase = sqlitedatabase2;
        }
_L8:
        if (map != null && map.size() != 0) goto _L2; else goto _L1
_L1:
        return;
        Exception exception;
        exception;
        sqlitedatabase = sqlitedatabase1;
        Logger.Error("deleteMessageMetadata", exception);
        sqlitedatabase = sqlitedatabase1;
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
            sqlitedatabase = sqlitedatabase1;
        }
        continue; /* Loop/switch isn't completed */
        map;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw map;
_L2:
        Logger.Debug((new StringBuilder()).append("Inserting/updating message metadata. CampaignID: ").append(l1).append(". Metadata: ").append(map.toString()).toString());
        sqlitedatabase1 = sqlitedatabase;
        exception = mDBHelper.getWritableDatabase();
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        SQLiteStatement sqlitestatement = exception.compileStatement("INSERT INTO MessageMetadata (MessageID, Key, Value) VALUES (?, ?, ?)");
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        Iterator iterator = map.keySet().iterator();
_L4:
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        String s = (String)iterator.next();
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        String s1 = (String)map.get(s);
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        sqlitestatement.bindLong(1, l);
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        sqlitestatement.bindString(2, s);
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        sqlitestatement.bindString(3, s1);
        sqlitedatabase1 = exception;
        sqlitedatabase = exception;
        sqlitestatement.execute();
        if (true) goto _L4; else goto _L3
_L3:
        map;
        sqlitedatabase = sqlitedatabase1;
        Logger.Error("insertMessageMetadata", map);
        if (sqlitedatabase1 == null) goto _L1; else goto _L5
_L5:
        sqlitedatabase1.close();
        return;
        if (exception == null) goto _L1; else goto _L6
_L6:
        exception.close();
        return;
        map;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw map;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void messagesMetadata(ArrayList arraylist)
    {
        if (arraylist != null && arraylist.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        Cursor cursor;
        String s;
        HashMap hashmap;
        hashmap = new HashMap();
        IMessage imessage;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); hashmap.put((new StringBuilder()).append("").append(imessage.getID()).toString(), (Message)imessage))
        {
            imessage = (IMessage)arraylist.next();
        }

        obj2 = null;
        obj1 = null;
        s = null;
        cursor = null;
        arraylist = cursor;
        obj = s;
        Object obj3 = mDBHelper.getReadableDatabase();
        arraylist = cursor;
        obj1 = obj3;
        obj = s;
        obj2 = obj3;
        cursor = ((SQLiteDatabase) (obj3)).rawQuery("SELECT MessageID, Key, Value FROM MessageMetadata", null);
        if (cursor == null)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        if (cursor.getColumnCount() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        cursor.moveToFirst();
_L4:
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        if (cursor.getPosition() == cursor.getCount())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        long l = cursor.getLong(0);
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        s = cursor.getString(1);
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        String s1 = cursor.getString(2);
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        Message message = (Message)hashmap.get((new StringBuilder()).append("").append(l).toString());
        if (message == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        message.getMetadata().put(s, s1);
        arraylist = cursor;
        obj1 = obj3;
        obj = cursor;
        obj2 = obj3;
        cursor.moveToNext();
        if (true) goto _L4; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        obj3;
        obj = arraylist;
        obj2 = obj1;
        Logger.Error("messagesMetadata", ((Exception) (obj3)));
        if (arraylist != null)
        {
            arraylist.close();
        }
        if (obj1 != null)
        {
            ((SQLiteDatabase) (obj1)).close();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj3 == null) goto _L1; else goto _L6
_L6:
        ((SQLiteDatabase) (obj3)).close();
        return;
        arraylist;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (obj2 != null)
        {
            ((SQLiteDatabase) (obj2)).close();
        }
        throw arraylist;
    }

    private void updateMessage(long l, long l1, String s, String s1, String s2)
    {
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getWritableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.update("Messages", getContentValues(l, l1, s, s1, s2), "CampaignID=?", new String[] {
            (new StringBuilder()).append("").append(l1).toString()
        });
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        sqlitedatabase2.close();
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return;
        s;
        sqlitedatabase1 = sqlitedatabase;
        Logger.Error("updateMessage", s);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
          goto _L2
        s;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        sqlitedatabase1.close();
        throw s;
    }

    public IMessage getMessage(long l)
    {
        Object obj2 = null;
        Object obj3 = null;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        SQLiteDatabase sqlitedatabase1;
        Object obj1;
        Message message;
        Cursor cursor;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        cursor = null;
        message = null;
        obj = message;
        obj1 = cursor;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase = sqlitedatabase2;
        obj = message;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        String s = (new StringBuilder()).append("").append(l).toString();
        sqlitedatabase = sqlitedatabase2;
        obj = message;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        cursor = sqlitedatabase2.query("Messages", new String[] {
            "ID", "CampaignID", "Title", "Message", "ExpirationDate", "IsRead"
        }, "ID=?", new String[] {
            s
        }, null, null, null);
        message = obj3;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        message = obj3;
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        if (cursor.getColumnCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        message = obj3;
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        cursor.moveToFirst();
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        message = new Message(cursor, mDBHelper.getContext());
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        cursor.close();
        obj = message;
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        sqlitedatabase2.close();
        obj = message;
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        ((Message) (obj)).setMetadata(getMetadata(l));
        return ((IMessage) (obj));
        Exception exception1;
        exception1;
        sqlitedatabase1 = sqlitedatabase;
        obj1 = obj;
        Logger.Error("getMessage", exception1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        ((Cursor) (obj)).close();
        obj = obj2;
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        obj = obj2;
          goto _L2
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        ((Cursor) (obj1)).close();
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        sqlitedatabase1.close();
        throw exception;
    }

    public IMessage getMessageByCampaignID(long l, boolean flag)
    {
        Object obj2 = null;
        Object obj3 = null;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        SQLiteDatabase sqlitedatabase1;
        Object obj1;
        Message message;
        Cursor cursor;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        cursor = null;
        message = null;
        obj = message;
        obj1 = cursor;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase = sqlitedatabase2;
        obj = message;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        String s = (new StringBuilder()).append("").append(l).toString();
        sqlitedatabase = sqlitedatabase2;
        obj = message;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        cursor = sqlitedatabase2.query("Messages", new String[] {
            "ID", "CampaignID", "Title", "Message", "ExpirationDate", "IsRead"
        }, "CampaignID=?", new String[] {
            s
        }, null, null, null);
        message = obj3;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        message = obj3;
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        if (cursor.getColumnCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        message = obj3;
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        cursor.moveToFirst();
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        message = new Message(cursor, mDBHelper.getContext());
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        cursor.close();
        obj = message;
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        sqlitedatabase2.close();
        obj = message;
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        if (flag)
        {
            ((Message) (obj)).setMetadata(getMetadataByCampaignID(l));
        }
        return ((IMessage) (obj));
        Exception exception1;
        exception1;
        sqlitedatabase1 = sqlitedatabase;
        obj1 = obj;
        Logger.Error("getMessageByCampaignID", exception1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        ((Cursor) (obj)).close();
        obj = obj2;
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        obj = obj2;
          goto _L2
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        ((Cursor) (obj1)).close();
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        sqlitedatabase1.close();
        throw exception;
    }

    public ArrayList getMessages()
    {
        ArrayList arraylist = new ArrayList();
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        Object obj;
        Cursor cursor;
        Object obj1;
        Cursor cursor1;
        Cursor cursor2;
        Object obj3;
        obj1 = null;
        obj = null;
        obj3 = null;
        cursor2 = null;
        cursor = cursor2;
        cursor1 = obj3;
        Object obj2 = mDBHelper.getReadableDatabase();
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = obj3;
        cursor2 = ((SQLiteDatabase) (obj2)).query("Messages", new String[] {
            "ID", "CampaignID", "Title", "Message", "ExpirationDate", "IsRead"
        }, null, null, null, null, null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        if (cursor2.getColumnCount() <= 0) goto _L2; else goto _L3
_L3:
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        cursor2.moveToFirst();
_L4:
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        if (cursor2.getPosition() == cursor2.getCount())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        arraylist.add(new Message(cursor2, mDBHelper.getContext()));
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        cursor2.moveToNext();
        if (true) goto _L4; else goto _L2
        obj2;
        obj1 = obj;
        cursor1 = cursor;
        Logger.Error("GetMessages", ((Exception) (obj2)));
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_264;
        }
        cursor.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        ((SQLiteDatabase) (obj)).close();
_L8:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        messagesMetadata(arraylist);
        return arraylist;
_L2:
        if (cursor2 == null) goto _L6; else goto _L5
_L5:
        cursor2.close();
_L6:
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        ((SQLiteDatabase) (obj2)).close();
          goto _L8
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        cursor1.close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        ((SQLiteDatabase) (obj1)).close();
        throw exception;
    }

    public IMessage insertMessage(long l, long l1, String s, String s1, String s2, 
            Map map)
    {
        Object obj2 = null;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        Object obj3;
        Object obj4;
        boolean flag;
        boolean flag1;
        boolean flag2;
        obj3 = null;
        obj4 = null;
        sqlitedatabase = null;
        flag2 = false;
        flag = false;
        obj = obj3;
        flag1 = flag2;
        obj1 = obj4;
        if (getMessageByCampaignID(l1, false) != null) goto _L2; else goto _L1
_L1:
        obj = obj3;
        flag1 = flag2;
        obj1 = obj4;
        sqlitedatabase = mDBHelper.getWritableDatabase();
        obj = sqlitedatabase;
        flag1 = flag2;
        obj1 = sqlitedatabase;
        sqlitedatabase.insert("Messages", "ExpirationDate", getContentValues(l, l1, s, s1, s2));
        s = sqlitedatabase;
_L3:
        obj = s;
        flag1 = flag;
        obj1 = s;
        s2 = getMessage(l);
        flag2 = flag;
        s1 = s2;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        s.close();
        s1 = s2;
        flag2 = flag;
_L5:
        insertOrUpdateMetadata(l, l1, map, flag2);
        ((Message)s1).setMetadata(map);
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        obj = obj3;
        flag1 = flag2;
        obj1 = obj4;
        updateMessage(l, l1, s, s1, s2);
        flag = true;
        s = sqlitedatabase;
          goto _L3
        s;
        obj1 = obj;
        Logger.Error("insertMessage", s);
        flag2 = flag1;
        s1 = obj2;
        if (obj == null) goto _L5; else goto _L4
_L4:
        ((SQLiteDatabase) (obj)).close();
        flag2 = flag1;
        s1 = obj2;
          goto _L5
        s;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw s;
        s;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        ((SQLiteDatabase) (obj1)).close();
        throw s;
          goto _L3
    }

    public void markMessageRead(long l)
    {
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        Object obj = mDBHelper.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("IsRead", Integer.valueOf(1));
        ((SQLiteDatabase) (obj)).update("Messages", contentvalues, "id=?", new String[] {
            (new StringBuilder()).append("").append(l).toString()
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ((SQLiteDatabase) (obj)).close();
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        Logger.Error("markMessageRead", ((Exception) (obj1)));
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((SQLiteDatabase) (obj)).close();
          goto _L2
        obj;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        ((SQLiteDatabase) (obj)).close();
        throw obj1;
    }
}
