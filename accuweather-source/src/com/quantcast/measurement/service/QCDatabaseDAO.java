// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.quantcast.measurement.service:
//            QCEvent, QCLog, QCPolicy

class QCDatabaseDAO extends SQLiteOpenHelper
{

    private static final String EVENTS_COLUMN_DOH = "doh";
    private static final String EVENTS_COLUMN_ID = "id";
    static final String EVENTS_TABLE = "events";
    private static final String EVENT_PARAMETERS_COLUMN_EVENT_ID = "eventid";
    private static final String EVENT_PARAMETERS_COLUMN_NAME = "name";
    private static final String EVENT_PARAMETERS_COLUMN_VALUE = "value";
    private static final String EVENT_PARAMETERS_EVENT_ID_INDEX_NAME = "event_id_idx";
    static final String EVENT_PARAMETERS_TABLE = "event";
    static final String NAME = "Quantcast.db";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCDatabaseDAO);
    private static final int VERSION = 2;
    private int m_numOpenDBs;
    private SQLiteDatabase m_openDB;

    QCDatabaseDAO(Context context)
    {
        super(context, "Quantcast.db", null, 2);
        m_numOpenDBs = 0;
    }

    private static void addEventIdIndex(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE INDEX event_id_idx ON event (eventid)");
    }

    private static String generateDeleteClause(String s, String s1, String s2)
    {
        return (new StringBuilder()).append("delete from ").append(s).append(" where ").append(s1).append(" in (").append(s2).append(");").toString();
    }

    public void close()
    {
        m_numOpenDBs = m_numOpenDBs - 1;
        if (m_numOpenDBs == 0)
        {
            super.close();
            m_openDB = null;
        }
    }

    void deleteDB(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        close();
        context.deleteDatabase("Quantcast.db");
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    List getEvents(int i, QCPolicy qcpolicy)
    {
        this;
        JVM INSTR monitorenter ;
        qcpolicy = getEvents(getReadableDatabase(), i, qcpolicy);
        close();
        this;
        JVM INSTR monitorexit ;
        return qcpolicy;
        qcpolicy;
        throw qcpolicy;
    }

    List getEvents(SQLiteDatabase sqlitedatabase, int i, QCPolicy qcpolicy)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist = null;
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        if (!sqlitedatabase.isOpen()) goto _L2; else goto _L3
_L3:
        arraylist = new ArrayList();
        if (i <= 0) goto _L5; else goto _L4
_L4:
        Object obj = Integer.toString(i);
        obj = sqlitedatabase.query("events", new String[] {
            "id"
        }, null, null, null, null, "id", ((String) (obj)));
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                long l = ((Cursor) (obj)).getLong(0);
                Object obj1 = Long.toString(l);
                obj1 = sqlitedatabase.query("event", new String[] {
                    "name", "value"
                }, "eventid=?", new String[] {
                    obj1
                }, null, null, null);
                HashMap hashmap = new HashMap();
                if (((Cursor) (obj1)).moveToFirst())
                {
                    do
                    {
                        hashmap.put(((Cursor) (obj1)).getString(0), ((Cursor) (obj1)).getString(1));
                    } while (((Cursor) (obj1)).moveToNext());
                }
                ((Cursor) (obj1)).close();
                arraylist.add(QCEvent.dataBaseEventWithPolicyCheck(Long.valueOf(l), hashmap, qcpolicy));
            } while (((Cursor) (obj)).moveToNext());
        }
        ((Cursor) (obj)).close();
        sqlitedatabase = arraylist;
_L8:
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
_L2:
        QCLog.e(TAG, "Database could not be opened.(1)");
        sqlitedatabase = arraylist;
        continue; /* Loop/switch isn't completed */
        sqlitedatabase;
_L6:
        this;
        JVM INSTR monitorexit ;
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L6; else goto _L5
_L5:
        sqlitedatabase = arraylist;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public SQLiteDatabase getReadableDatabase()
    {
        return getWritableDatabase();
    }

    public SQLiteDatabase getWritableDatabase()
    {
        if (m_openDB == null || !m_openDB.isOpen())
        {
            m_numOpenDBs = 0;
            m_openDB = super.getWritableDatabase();
        }
        m_numOpenDBs = m_numOpenDBs + 1;
        return m_openDB;
    }

    long numberOfEvents()
    {
        long l = rowCountForTable(getReadableDatabase(), "events");
        close();
        return l;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL("PRAGMA foreign_keys = ON;");
        sqlitedatabase.execSQL("create table events (id integer primary key autoincrement,doh integer);");
        sqlitedatabase.execSQL("create table event (eventid integer,name varchar not null,value varchar not null,FOREIGN KEY(eventid) REFERENCES events(id));");
        addEventIdIndex(sqlitedatabase);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Object obj;
        obj;
        QCLog.e(TAG, "Unable to create events related tables", ((Throwable) (obj)));
        sqlitedatabase.endTransaction();
        return;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.beginTransaction();
        if (i > 1)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        addEventIdIndex(sqlitedatabase);
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    void removeAllEvents()
    {
        this;
        JVM INSTR monitorenter ;
        removeAllEvents(getWritableDatabase());
        close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void removeAllEvents(SQLiteDatabase sqlitedatabase)
    {
        this;
        JVM INSTR monitorenter ;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("event", null, null);
        sqlitedatabase.delete("events", null, null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        QCLog.e(TAG, "Cannot clear events.", ((Throwable) (obj)));
        sqlitedatabase.endTransaction();
          goto _L1
        sqlitedatabase;
        throw sqlitedatabase;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        QCLog.e(TAG, "Database could not be opened.(3)");
          goto _L1
    }

    boolean removeEvents(SQLiteDatabase sqlitedatabase, Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = false;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        ArrayList arraylist;
        if (!sqlitedatabase.isOpen())
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (collection.isEmpty())
        {
            break MISSING_BLOCK_LABEL_129;
        }
        arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(((QCEvent)collection.next()).getEventId())) { }
        break MISSING_BLOCK_LABEL_82;
        sqlitedatabase;
        throw sqlitedatabase;
        collection = TextUtils.join(",", arraylist);
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL(generateDeleteClause("events", "id", collection));
        sqlitedatabase.execSQL(generateDeleteClause("event", "eventid", collection));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        flag = true;
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        sqlitedatabase.endTransaction();
        throw collection;
        QCLog.e(TAG, "Database could not be opened.(2)");
          goto _L1
    }

    boolean removeEvents(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        flag = removeEvents(getWritableDatabase(), collection);
        close();
        this;
        JVM INSTR monitorexit ;
        return flag;
        collection;
        throw collection;
    }

    long rowCountForTable(SQLiteDatabase sqlitedatabase, String s)
    {
        if (sqlitedatabase != null && sqlitedatabase.isOpen())
        {
            return DatabaseUtils.queryNumEntries(sqlitedatabase, s);
        } else
        {
            QCLog.e(TAG, "Database could not be opened.(6)");
            return 0L;
        }
    }

    int writeEvents(SQLiteDatabase sqlitedatabase, Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        i = ((flag1) ? 1 : 0);
        if (collection.isEmpty()) goto _L2; else goto _L1
_L1:
        if (sqlitedatabase == null) goto _L4; else goto _L3
_L3:
        if (!sqlitedatabase.isOpen()) goto _L4; else goto _L5
_L5:
        SQLiteStatement sqlitestatement;
        SQLiteStatement sqlitestatement1;
        sqlitestatement = sqlitedatabase.compileStatement("INSERT INTO events ( doh ) VALUES ( ? )");
        sqlitestatement1 = sqlitedatabase.compileStatement("INSERT INTO event ( eventid,name,value ) VALUES ( ? , ? , ?)");
        i = ((flag1) ? 1 : 0);
        if (sqlitestatement == null) goto _L2; else goto _L6
_L6:
        i = ((flag1) ? 1 : 0);
        if (sqlitestatement1 == null) goto _L2; else goto _L7
_L7:
        sqlitedatabase.beginTransaction();
        collection = collection.iterator();
        i = ((flag) ? 1 : 0);
_L12:
        if (!collection.hasNext()) goto _L9; else goto _L8
_L8:
        Object obj;
        long l;
        obj = (QCEvent)collection.next();
        sqlitestatement.clearBindings();
        sqlitestatement.bindLong(1, 0L);
        l = sqlitestatement.executeInsert();
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        QCLog.e(TAG, (new StringBuilder()).append("Unable to save ").append(obj).append(". See DatabaseUtils logs for a detailed stack trace.").toString());
        continue; /* Loop/switch isn't completed */
        collection;
        sqlitedatabase.endTransaction();
        sqlitestatement.close();
        sqlitestatement1.close();
        throw collection;
        sqlitedatabase;
        this;
        JVM INSTR monitorexit ;
        throw sqlitedatabase;
        for (obj = ((QCEvent) (obj)).getParameters().entrySet().iterator(); ((Iterator) (obj)).hasNext(); sqlitestatement1.execute())
        {
            Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            String s = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
            sqlitestatement1.clearBindings();
            sqlitestatement1.bindLong(1, l);
            sqlitestatement1.bindString(2, s);
            sqlitestatement1.bindString(3, ((String) (obj1)));
        }

          goto _L10
_L9:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        sqlitestatement.close();
        sqlitestatement1.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return i;
_L4:
        QCLog.e(TAG, "Database could not be opened.(4)");
        i = ((flag1) ? 1 : 0);
        if (true) goto _L2; else goto _L10
_L10:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    int writeEvents(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = writeEvents(getWritableDatabase(), collection);
        close();
        this;
        JVM INSTR monitorexit ;
        return i;
        collection;
        throw collection;
    }

}
