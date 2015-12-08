// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.worklight.androidgap.jsonstore.security.SecurityManager;
import com.worklight.jsonstore.util.JSONStoreLogger;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
import net.sqlcipher.database.SQLiteDatabase;

// Referenced classes of package com.worklight.jsonstore.database:
//            DatabaseSchema, DatabaseAccessor, DatabaseAccessorImpl

public class DatabaseManager
{

    private static final String SQL_SCHEMA = "PRAGMA table_info({0})";
    private static boolean initialized = false;
    private static final DatabaseManager instance = new DatabaseManager();
    private static final JSONStoreLogger logger = JSONStoreUtil.getDatabaseLogger();
    private HashMap accessors;
    private SQLiteDatabase database;
    private String databaseKey;
    private String dbPath;

    private DatabaseManager()
    {
        accessors = new HashMap();
    }

    public static DatabaseManager getInstance()
    {
        return instance;
    }

    private void openDatabaseIfNecessary(Context context)
    {
        if (database == null)
        {
            if (!initialized)
            {
                SQLiteDatabase.loadLibs(context);
                initialized = true;
            }
            if (databaseKey == null)
            {
                databaseKey = "";
            }
            database = SQLiteDatabase.openDatabase((new File(context.getDatabasePath("wljsonstore"), dbPath)).getAbsolutePath(), databaseKey, null, 0x10000000);
        }
    }

    public boolean checkDatabaseAgainstSchema(Context context, String s, DatabaseSchema databaseschema)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Cursor cursor;
        openDatabaseIfNecessary(context);
        cursor = database.rawQuery(JSONStoreUtil.formatString("PRAGMA table_info({0})", new Object[] {
            s
        }), null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int j = cursor.getCount();
        context = null;
        if (j <= 0) goto _L4; else goto _L3
_L3:
        s = new TreeMap();
        int i = 0;
_L5:
        context = s;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor.moveToNext();
        s.put(cursor.getString(cursor.getColumnIndex("name")), cursor.getString(cursor.getColumnIndex("type")));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        cursor.close();
        if (context == null) goto _L2; else goto _L6
_L6:
        boolean flag1 = databaseschema.equals(context);
        if (flag1)
        {
            flag = false;
        }
_L8:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        throw context;
    }

    public void clearDatabaseKey()
    {
        databaseKey = null;
    }

    public void clearDbPath()
    {
        dbPath = null;
    }

    public void closeDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        database.close();
        accessors.clear();
        database = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int destroyDatabase(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        byte byte0;
        int i;
        i = 0;
        byte0 = 0;
        context = context.getDatabasePath("wljsonstore");
        byte byte1 = i;
        if (!context.exists()) goto _L2; else goto _L1
_L1:
        byte1 = i;
        if (!context.isDirectory()) goto _L2; else goto _L3
_L3:
        String as[] = context.list();
        byte1 = i;
        if (as == null) goto _L2; else goto _L4
_L4:
        int j = as.length;
        i = 0;
_L5:
        String s;
        byte1 = byte0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        byte1 = byte0;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        boolean flag = (new File(context, s)).delete();
        byte1 = byte0;
        if (!flag)
        {
            byte1 = -5;
        }
        i++;
        byte0 = byte1;
        if (true) goto _L5; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return byte1;
        context;
        throw context;
    }

    public void destroyKeychain(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        SecurityManager.getInstance(context).destroyKeychain();
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void destroyPreferences(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        context = context.getSharedPreferences("JsonstorePrefs", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        context = context.edit();
        context.clear();
        context.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public DatabaseAccessor getDatabase()
        throws Exception
    {
        if (accessors == null || accessors.size() == 0)
        {
            throw new Exception("could not retrieve unprovisioned database");
        } else
        {
            return (DatabaseAccessor)(DatabaseAccessor)accessors.values().toArray()[0];
        }
    }

    public DatabaseAccessor getDatabase(String s)
        throws Exception
    {
        DatabaseAccessor databaseaccessor = (DatabaseAccessor)accessors.get(s);
        if (databaseaccessor == null)
        {
            throw new Exception((new StringBuilder()).append("could not retrieve unprovisioned database \"").append(s).append("\"").toString());
        } else
        {
            return databaseaccessor;
        }
    }

    public String getDbPath()
    {
        return dbPath;
    }

    public boolean isDatabaseOpen()
    {
        return database != null;
    }

    public boolean provisionDatabase(Context context, DatabaseSchema databaseschema, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = false;
        String s;
        s = databaseschema.getName();
        openDatabaseIfNecessary(context);
        context = new DatabaseAccessorImpl(database, databaseschema);
        context;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        context.dropTable();
        flag = flag1;
        if (context.getTableExists())
        {
            flag = true;
        }
        logger.logDebug((new StringBuilder()).append("provisioning database \"").append(s).append("\" (").append("already exists: ").append(flag).append(")").toString());
        if (flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        context.createTable();
        accessors.put(s, context);
        context;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return flag;
        databaseschema;
        context;
        JVM INSTR monitorexit ;
        throw databaseschema;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void setDatabaseKey(Context context, String s, String s1)
        throws Exception
    {
        databaseKey = SecurityManager.getInstance(context).getDPK(s, s1);
    }

    public void setDbPath(String s)
    {
        dbPath = (new StringBuilder()).append(s).append(".sqlite").toString();
    }

}
