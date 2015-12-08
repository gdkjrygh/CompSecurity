// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Message;
import com.apptentive.android.sdk.model.MessageFactory;
import com.apptentive.android.sdk.model.Payload;
import com.apptentive.android.sdk.model.PayloadFactory;
import com.apptentive.android.sdk.model.StoredFile;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.apptentive.android.sdk.storage:
//            PayloadStore, EventStore, MessageStore, FileStore

public class ApptentiveDatabase extends SQLiteOpenHelper
    implements PayloadStore, EventStore, MessageStore, FileStore
{

    private static final String DATABASE_NAME = "apptentive";
    private static final int DATABASE_VERSION = 1;
    private static final int FALSE = 0;
    private static final String FILESTORE_KEY_APPTENTIVE_URL = "apptentive_uri";
    private static final String FILESTORE_KEY_ID = "id";
    private static final String FILESTORE_KEY_LOCAL_URL = "local_uri";
    private static final String FILESTORE_KEY_MIME_TYPE = "mime_type";
    private static final String FILESTORE_KEY_ORIGINAL_URL = "original_uri";
    private static final String MESSAGE_KEY_CLIENT_CREATED_AT = "client_created_at";
    private static final String MESSAGE_KEY_DB_ID = "_id";
    private static final String MESSAGE_KEY_ID = "id";
    private static final String MESSAGE_KEY_JSON = "json";
    private static final String MESSAGE_KEY_NONCE = "nonce";
    private static final String MESSAGE_KEY_READ = "read";
    private static final String MESSAGE_KEY_STATE = "state";
    private static final String PAYLOAD_KEY_BASE_TYPE = "base_type";
    private static final String PAYLOAD_KEY_DB_ID = "_id";
    private static final String PAYLOAD_KEY_JSON = "json";
    private static final String QUERY_MESSAGE_GET_ALL_IN_ORDER = "SELECT * FROM message ORDER BY COALESCE(id, 'z') ASC";
    private static final String QUERY_MESSAGE_GET_BY_NONCE = "SELECT * FROM message WHERE nonce = ?";
    private static final String QUERY_MESSAGE_GET_LAST_ID;
    private static final String QUERY_MESSAGE_UNREAD = "SELECT id FROM message WHERE read = 0 AND id NOTNULL";
    private static final String QUERY_PAYLOAD_GET_NEXT_TO_SEND = "SELECT * FROM payload ORDER BY _id ASC LIMIT 1";
    private static final String TABLE_CREATE_FILESTORE = "CREATE TABLE file_store (id TEXT PRIMARY KEY, mime_type TEXT, original_uri TEXT, local_uri TEXT, apptentive_uri TEXT);";
    private static final String TABLE_CREATE_MESSAGE = "CREATE TABLE message (_id INTEGER PRIMARY KEY, id TEXT, client_created_at DOUBLE, nonce TEXT, state TEXT, read INTEGER, json TEXT);";
    private static final String TABLE_CREATE_PAYLOAD = "CREATE TABLE payload (_id INTEGER PRIMARY KEY, base_type TEXT, json TEXT);";
    private static final String TABLE_FILESTORE = "file_store";
    private static final String TABLE_MESSAGE = "message";
    private static final String TABLE_PAYLOAD = "payload";
    private static final int TRUE = 1;
    private static ApptentiveDatabase instance;
    private boolean payloadsDirty;

    private ApptentiveDatabase(Context context)
    {
        super(context, "apptentive", null, 1);
        payloadsDirty = true;
    }

    public static void ensureClosed(Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        cursor.close();
        return;
        cursor;
        Log.w("Error closing SQLite cursor.", cursor, new Object[0]);
        return;
    }

    public static void ensureClosed(SQLiteDatabase sqlitedatabase)
    {
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        sqlitedatabase.close();
        return;
        sqlitedatabase;
        Log.w("Error closing SQLite database.", sqlitedatabase, new Object[0]);
        return;
    }

    public static ApptentiveDatabase getInstance(Context context)
    {
        if (instance == null)
        {
            instance = new ApptentiveDatabase(context.getApplicationContext());
        }
        return instance;
    }

    public transient void addOrUpdateMessages(Message amessage[])
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        obj = sqlitedatabase;
        int k = amessage.length;
        int i = 0;
_L6:
        Cursor cursor;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        obj = amessage[i];
        cursor = null;
        Cursor cursor1 = sqlitedatabase.rawQuery("SELECT * FROM message WHERE nonce = ?", new String[] {
            ((Message) (obj)).getNonce()
        });
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        Object obj1 = cursor1.getString(0);
        cursor = cursor1;
        ContentValues contentvalues = new ContentValues();
        cursor = cursor1;
        contentvalues.put("id", ((Message) (obj)).getId());
        cursor = cursor1;
        contentvalues.put("state", ((Message) (obj)).getState().name());
        cursor = cursor1;
        if (!((Message) (obj)).isRead())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        cursor = cursor1;
        contentvalues.put("read", Integer.valueOf(1));
        cursor = cursor1;
        contentvalues.put("json", ((Message) (obj)).toString());
        cursor = cursor1;
        sqlitedatabase.update("message", contentvalues, "_id = ?", new String[] {
            obj1
        });
_L4:
        obj = sqlitedatabase;
        ensureClosed(cursor1);
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        cursor = cursor1;
        sqlitedatabase.beginTransaction();
        cursor = cursor1;
        obj1 = new ContentValues();
        cursor = cursor1;
        ((ContentValues) (obj1)).put("id", ((Message) (obj)).getId());
        cursor = cursor1;
        ((ContentValues) (obj1)).put("client_created_at", ((Message) (obj)).getClientCreatedAt());
        cursor = cursor1;
        ((ContentValues) (obj1)).put("nonce", ((Message) (obj)).getNonce());
        cursor = cursor1;
        ((ContentValues) (obj1)).put("state", ((Message) (obj)).getState().name());
        cursor = cursor1;
        int j;
        if (((Message) (obj)).isRead())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        cursor = cursor1;
        ((ContentValues) (obj1)).put("read", Integer.valueOf(j));
        cursor = cursor1;
        ((ContentValues) (obj1)).put("json", ((Message) (obj)).toString());
        cursor = cursor1;
        sqlitedatabase.insert("message", null, ((ContentValues) (obj1)));
        cursor = cursor1;
        sqlitedatabase.setTransactionSuccessful();
        cursor = cursor1;
        sqlitedatabase.endTransaction();
        if (true) goto _L4; else goto _L3
_L3:
        amessage;
        obj = sqlitedatabase;
        ensureClosed(cursor);
        obj = sqlitedatabase;
        throw amessage;
        amessage;
        ensureClosed(((SQLiteDatabase) (obj)));
        throw amessage;
        amessage;
        this;
        JVM INSTR monitorexit ;
        throw amessage;
        ensureClosed(sqlitedatabase);
        this;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public transient void addPayload(Payload apayload[])
    {
        this;
        JVM INSTR monitorenter ;
        payloadsDirty = true;
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.beginTransaction();
        sqlitedatabase = sqlitedatabase1;
        int j = apayload.length;
        int i = 0;
_L2:
        Payload payload;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        payload = apayload[i];
        sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("base_type", payload.getBaseType().name());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("json", payload.toString());
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.insert("payload", null, contentvalues);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.setTransactionSuccessful();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.endTransaction();
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        apayload;
        ensureClosed(sqlitedatabase);
        throw apayload;
        apayload;
        this;
        JVM INSTR monitorexit ;
        throw apayload;
    }

    public void deleteAllMessages()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.delete("message", "", null);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        ensureClosed(sqlitedatabase);
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void deleteAllPayloads()
    {
        this;
        JVM INSTR monitorenter ;
        payloadsDirty = true;
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.delete("payload", "", null);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        ensureClosed(sqlitedatabase);
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void deleteMessage(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        Log.d("Deleted %d messages.", new Object[] {
            Integer.valueOf(sqlitedatabase1.delete("message", "nonce = ?", new String[] {
                s
            }))
        });
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        ensureClosed(sqlitedatabase);
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void deletePayload(Payload payload)
    {
        this;
        JVM INSTR monitorenter ;
        payloadsDirty = true;
        SQLiteDatabase sqlitedatabase;
        if (payload == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.delete("payload", "_id = ?", new String[] {
            Long.toString(payload.getDatabaseId())
        });
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        payload;
        ensureClosed(sqlitedatabase);
        throw payload;
        payload;
        this;
        JVM INSTR monitorexit ;
        throw payload;
    }

    public void deleteStoredFile(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        Log.d("Deleted %d stored files.", new Object[] {
            Integer.valueOf(sqlitedatabase1.delete("file_store", "id = ?", new String[] {
                s
            }))
        });
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        ensureClosed(sqlitedatabase);
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public List getAllMessages()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor1;
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        SQLiteDatabase sqlitedatabase1 = getReadableDatabase();
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        cursor1 = sqlitedatabase1.rawQuery("SELECT * FROM message ORDER BY COALESCE(id, 'z') ASC", null);
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        String s = cursor1.getString(6);
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        Message message = MessageFactory.fromJson(s);
        if (message != null) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        Log.e("Error parsing Record json from database: %s", new Object[] {
            s
        });
_L5:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        boolean flag = cursor1.moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        ensureClosed(cursor1);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L4:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        message.setDatabaseId(cursor1.getLong(0));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        message.setState(com.apptentive.android.sdk.model.Message.State.parse(cursor1.getString(4)));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        Exception exception;
        Exception exception1;
        boolean flag1;
        if (cursor1.getInt(5) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        message.setRead(flag1);
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        arraylist.add(message);
          goto _L5
        exception1;
        ensureClosed(cursor);
        ensureClosed(sqlitedatabase);
        throw exception1;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getLastReceivedMessageId()
    {
        this;
        JVM INSTR monitorenter ;
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        String s;
        sqlitedatabase = null;
        s = null;
        cursor = s;
        SQLiteDatabase sqlitedatabase1 = getReadableDatabase();
        cursor = s;
        sqlitedatabase = sqlitedatabase1;
        Cursor cursor1 = sqlitedatabase1.rawQuery(QUERY_MESSAGE_GET_LAST_ID, null);
        s = null;
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        s = cursor1.getString(0);
        ensureClosed(cursor1);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception1;
        exception1;
        ensureClosed(cursor);
        ensureClosed(sqlitedatabase);
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Payload getOldestUnsentPayload()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = payloadsDirty;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return ((Payload) (obj));
_L2:
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = null;
        obj = null;
        cursor = ((Cursor) (obj));
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        cursor = ((Cursor) (obj));
        sqlitedatabase = sqlitedatabase1;
        Cursor cursor1 = sqlitedatabase1.rawQuery("SELECT * FROM payload ORDER BY _id ASC LIMIT 1", null);
        obj = null;
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_132;
        }
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        long l = Long.parseLong(cursor1.getString(0));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        obj = com.apptentive.android.sdk.model.Payload.BaseType.parse(cursor1.getString(1));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        obj = PayloadFactory.fromJson(cursor1.getString(2), ((com.apptentive.android.sdk.model.Payload.BaseType) (obj)));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ((Payload) (obj)).setDatabaseId(l);
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        payloadsDirty = false;
        ensureClosed(cursor1);
        ensureClosed(sqlitedatabase1);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
        exception;
        ensureClosed(cursor);
        ensureClosed(sqlitedatabase);
        throw exception;
    }

    public StoredFile getStoredFile(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        sqlitedatabase = getReadableDatabase();
        obj = sqlitedatabase.rawQuery("SELECT * FROM file_store WHERE id = ?", new String[] {
            s
        });
        Cursor cursor = ((Cursor) (obj));
        SQLiteDatabase sqlitedatabase1 = getReadableDatabase();
        cursor = ((Cursor) (obj));
        sqlitedatabase = sqlitedatabase1;
        Cursor cursor1 = sqlitedatabase1.rawQuery("SELECT * FROM file_store WHERE id = ?", new String[] {
            s
        });
        obj = null;
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_179;
        }
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        obj = new StoredFile();
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ((StoredFile) (obj)).setId(s);
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ((StoredFile) (obj)).setMimeType(cursor1.getString(1));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ((StoredFile) (obj)).setOriginalUri(cursor1.getString(2));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ((StoredFile) (obj)).setLocalFilePath(cursor1.getString(3));
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ((StoredFile) (obj)).setApptentiveUri(cursor1.getString(4));
        ensureClosed(cursor1);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return ((StoredFile) (obj));
        s;
        ensureClosed(cursor);
        ensureClosed(sqlitedatabase);
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int getUnreadMessageCount()
    {
        this;
        JVM INSTR monitorenter ;
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor1;
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        SQLiteDatabase sqlitedatabase1 = getReadableDatabase();
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        cursor1 = sqlitedatabase1.rawQuery("SELECT id FROM message WHERE read = 0 AND id NOTNULL", null);
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        int i = cursor1.getCount();
        ensureClosed(cursor1);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception1;
        exception1;
        ensureClosed(cursor);
        ensureClosed(sqlitedatabase);
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        Log.d("ApptentiveDatabase.onCreate(db)", new Object[0]);
        sqlitedatabase.execSQL("CREATE TABLE payload (_id INTEGER PRIMARY KEY, base_type TEXT, json TEXT);");
        sqlitedatabase.execSQL("CREATE TABLE message (_id INTEGER PRIMARY KEY, id TEXT, client_created_at DOUBLE, nonce TEXT, state TEXT, read INTEGER, json TEXT);");
        sqlitedatabase.execSQL("CREATE TABLE file_store (id TEXT PRIMARY KEY, mime_type TEXT, original_uri TEXT, local_uri TEXT, apptentive_uri TEXT);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.d("ApptentiveDatabase.onUpgrade(db, %d, %d)", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    public boolean putStoredFile(StoredFile storedfile)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Cursor cursor;
        SQLiteDatabase sqlitedatabase;
        Cursor cursor1;
        sqlitedatabase = null;
        cursor1 = null;
        cursor = cursor1;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("id", storedfile.getId());
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("mime_type", storedfile.getMimeType());
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("original_uri", storedfile.getOriginalUri());
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("local_uri", storedfile.getLocalFilePath());
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("apptentive_uri", storedfile.getApptentiveUri());
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        cursor1 = sqlitedatabase1.rawQuery("SELECT * FROM file_store WHERE id = ?", new String[] {
            storedfile.getId()
        });
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        int i = sqlitedatabase1.update("file_store", contentvalues, "id = ?", new String[] {
            storedfile.getId()
        });
        long l = i;
_L3:
        if (l == -1L)
        {
            flag = false;
        }
        ensureClosed(cursor1);
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        cursor = cursor1;
        sqlitedatabase = sqlitedatabase1;
        l = sqlitedatabase1.insert("file_store", null, contentvalues);
          goto _L3
        storedfile;
        ensureClosed(cursor);
        ensureClosed(sqlitedatabase);
        throw storedfile;
        storedfile;
        this;
        JVM INSTR monitorexit ;
        throw storedfile;
    }

    public void updateMessage(Message message)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase1 = getWritableDatabase();
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.beginTransaction();
        sqlitedatabase = sqlitedatabase1;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("id", message.getId());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("client_created_at", message.getClientCreatedAt());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("nonce", message.getNonce());
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("state", message.getState().name());
        sqlitedatabase = sqlitedatabase1;
        if (!message.isRead())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("read", Integer.valueOf(1));
        sqlitedatabase = sqlitedatabase1;
        contentvalues.put("json", message.toString());
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.update("message", contentvalues, "nonce = ?", new String[] {
            message.getNonce()
        });
        sqlitedatabase = sqlitedatabase1;
        sqlitedatabase1.setTransactionSuccessful();
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        sqlitedatabase1.endTransaction();
        ensureClosed(sqlitedatabase1);
        this;
        JVM INSTR monitorexit ;
        return;
        message;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        sqlitedatabase.endTransaction();
        ensureClosed(sqlitedatabase);
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
    }

    static 
    {
        QUERY_MESSAGE_GET_LAST_ID = (new StringBuilder()).append("SELECT id FROM message WHERE state = '").append(com.apptentive.android.sdk.model.Message.State.saved).append("' AND ").append("id").append(" NOTNULL ORDER BY ").append("id").append(" DESC LIMIT 1").toString();
    }
}
