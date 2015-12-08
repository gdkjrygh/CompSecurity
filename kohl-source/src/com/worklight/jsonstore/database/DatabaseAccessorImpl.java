// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import android.database.Cursor;
import com.worklight.jsonstore.util.JSONStoreLogger;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.HashSet;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;

// Referenced classes of package com.worklight.jsonstore.database:
//            DatabaseAccessor, ReadableDatabase, WritableDatabase, DatabaseSchema, 
//            SearchFieldType

public class DatabaseAccessorImpl
    implements DatabaseAccessor
{

    private static final String SQL_CREATE_TABLE = "CREATE TABLE {0} ({1} INTEGER PRIMARY KEY AUTOINCREMENT, {2} {3} TEXT, {4} REAL DEFAULT 0, {5} INTEGER DEFAULT 0, {6} TEXT);";
    private static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS {0};";
    private static final String SQL_TABLE_EXISTS = "SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = \"{0}\";";
    private static final HashSet ignoredSchemaNodes;
    private static final JSONStoreLogger logger = JSONStoreUtil.getDatabaseLogger();
    private SQLiteDatabase database;
    private ReadableDatabase readableDB;
    private DatabaseSchema schema;
    private WritableDatabase writableDB;

    protected DatabaseAccessorImpl(SQLiteDatabase sqlitedatabase, DatabaseSchema databaseschema)
    {
        database = sqlitedatabase;
        readableDB = new ReadableDatabase(sqlitedatabase, databaseschema);
        schema = databaseschema;
        writableDB = new WritableDatabase(sqlitedatabase, databaseschema);
    }

    private transient void execSQL(String s, Object aobj[])
    {
        s = JSONStoreUtil.formatString(s, aobj);
        logger.logTrace((new StringBuilder()).append("executing SQL on database \"").append(schema.getName()).append("\":").toString());
        logger.logTrace((new StringBuilder()).append("   ").append(s).toString());
        writableDB.getDatabase().execSQL(s);
    }

    private String formatSchemaColumns()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = schema.getSearchFieldIterator();
        HashSet hashset = new HashSet();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!ignoredSchemaNodes.contains(s1))
            {
                hashset.add(s1);
            }
        } while (true);
        for (Iterator iterator1 = hashset.iterator(); iterator1.hasNext(); stringbuilder.append(", "))
        {
            String s = (String)iterator1.next();
            stringbuilder.append((new StringBuilder()).append("'").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(s)).append("'").toString());
            stringbuilder.append(' ');
            stringbuilder.append(schema.getSearchFieldType(s).getMappedType());
        }

        return stringbuilder.toString();
    }

    public void createTable()
    {
        String s = schema.getName();
        logger.logTrace((new StringBuilder()).append("creating database \"").append(s).append("\"").toString());
        execSQL("CREATE TABLE {0} ({1} INTEGER PRIMARY KEY AUTOINCREMENT, {2} {3} TEXT, {4} REAL DEFAULT 0, {5} INTEGER DEFAULT 0, {6} TEXT);", new Object[] {
            s, "_id", formatSchemaColumns(), "json", "_dirty", "_deleted", "_operation"
        });
    }

    public void dropTable()
    {
        String s = schema.getName();
        logger.logTrace((new StringBuilder()).append("[!!!] dropping database \"").append(s).append("\"").toString());
        execSQL("DROP TABLE IF EXISTS {0};", new Object[] {
            s
        });
    }

    public SQLiteDatabase getRawDatabase()
    {
        return database;
    }

    public ReadableDatabase getReadableDatabase()
    {
        return readableDB;
    }

    public DatabaseSchema getSchema()
    {
        return schema;
    }

    public boolean getTableExists()
    {
        boolean flag = false;
        boolean flag1 = false;
        Object obj = JSONStoreUtil.formatString("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = \"{0}\";", new Object[] {
            schema.getName()
        });
        obj = readableDB.rawQuery(((String) (obj)), null);
        if (obj != null)
        {
            flag = flag1;
            if (((Cursor) (obj)).getCount() > 0)
            {
                flag = true;
            }
            ((Cursor) (obj)).close();
        }
        return flag;
    }

    public WritableDatabase getWritableDatabase()
    {
        return writableDB;
    }

    static 
    {
        ignoredSchemaNodes = new HashSet();
        ignoredSchemaNodes.add("_deleted");
        ignoredSchemaNodes.add("_dirty");
        ignoredSchemaNodes.add("_id");
        ignoredSchemaNodes.add("json");
        ignoredSchemaNodes.add("_operation");
    }
}
