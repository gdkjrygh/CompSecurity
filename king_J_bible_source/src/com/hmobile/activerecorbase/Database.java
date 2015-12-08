// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.hmobile.activerecorbase:
//            DatabaseOpenHelper, ActiveRecordException, DatabaseBuilder, ActiveRecordBase, 
//            ARConst, Logg

public class Database
{

    static final String CNAME = com/hmobile/activerecorbase/Database.getSimpleName();
    static Map _builders = new HashMap();
    private Context _context;
    private SQLiteDatabase _database;
    private DatabaseOpenHelper _dbHelper;
    private String _path;

    Database(Context context, String s, int i, DatabaseBuilder databasebuilder)
    {
        _context = context;
        _path = s;
        _dbHelper = new DatabaseOpenHelper(context, _path, i, databasebuilder);
        _context = context;
    }

    public static Database createInstance(Context context, String s, int i)
        throws ActiveRecordException
    {
        DatabaseBuilder databasebuilder = getBuilder(s);
        if (databasebuilder == null)
        {
            throw new ActiveRecordException("Schema wasn't initialized. Call Database.setBuilder() first");
        } else
        {
            return new Database(context, s, i, databasebuilder);
        }
    }

    public static Database createInstance(Context context, String s, int i, DatabaseBuilder databasebuilder)
    {
        return new Database(context, s, i, databasebuilder);
    }

    public static DatabaseBuilder getBuilder(String s)
    {
        return (DatabaseBuilder)_builders.get(s);
    }

    protected static String getSQLiteTypeString(Class class1)
    {
        String s = class1.getName();
        if (s.equals("java.lang.String"))
        {
            return "text";
        }
        if (s.equals("short"))
        {
            return "int";
        }
        if (s.equals("int"))
        {
            return "int";
        }
        if (s.equals("long"))
        {
            return "int";
        }
        if (s.equals("long"))
        {
            return "int";
        }
        if (s.equals("java.sql.Timestamp"))
        {
            return "int";
        }
        if (s.equals("double"))
        {
            return "real";
        }
        if (s.equals("float"))
        {
            return "real";
        }
        if (s.equals("[B"))
        {
            return "blob";
        }
        if (s.equals("boolean"))
        {
            return "bool";
        }
        if (s.equals("java.util.Date"))
        {
            return "text";
        }
        if (s.equals(java/util/ArrayList.getName()))
        {
            return "text";
        }
        if (class1.getSuperclass() == com/hmobile/activerecorbase/ActiveRecordBase)
        {
            return "int";
        } else
        {
            throw new IllegalArgumentException("Class cannot be stored in Sqlite3 database.");
        }
    }

    public static Database open(Context context, String s, int i)
        throws ActiveRecordException
    {
        context = createInstance(context, s, i);
        context.open();
        return context;
    }

    public static void setBuilder(DatabaseBuilder databasebuilder)
    {
        _builders.put(databasebuilder.getDatabaseName(), databasebuilder);
    }

    public void beginTransaction()
    {
        _database.beginTransaction();
    }

    public void close()
    {
        String s = _database.toString();
        if (_database != null)
        {
            _database.close();
        }
        _database = null;
        Logg.d(ARConst.TAG, "(%t) %s.close(): db obj %s set to null", new Object[] {
            CNAME, s
        });
    }

    public int delete(String s, String s1, String as[])
    {
        return _database.delete(s, s1, as);
    }

    public void endTransaction()
    {
        _database.endTransaction();
    }

    public void execute(String s)
    {
        _database.execSQL(s);
    }

    public String[] getColumnsForTable(String s)
    {
        ArrayList arraylist;
        s = rawQuery(String.format("PRAGMA table_info(%s)", new Object[] {
            s
        }));
        arraylist = new ArrayList();
_L1:
        boolean flag = s.moveToNext();
        if (!flag)
        {
            s.close();
            return (String[])arraylist.toArray(new String[0]);
        }
        arraylist.add(s.getString(s.getColumnIndex("name")));
          goto _L1
        Exception exception;
        exception;
        s.close();
        throw exception;
    }

    public SQLiteDatabase getSqlLiteDatabase()
    {
        return _database;
    }

    public String[] getTables()
        throws ActiveRecordException
    {
        Cursor cursor;
        ArrayList arraylist;
        if (_database == null || !_database.isOpen())
        {
            Logg.e(ARConst.TAG, "(%t) %s.getTables(): ERROR - db object is null or closed", new Object[] {
                CNAME
            });
            throw new ActiveRecordException("Database is closed. Did you forget to open database?");
        }
        cursor = query("sqlite_master", new String[] {
            "name"
        }, "type = ?", new String[] {
            "table"
        });
        arraylist = new ArrayList();
_L1:
        boolean flag = cursor.moveToNext();
        if (!flag)
        {
            cursor.close();
            return (String[])arraylist.toArray(new String[0]);
        }
        arraylist.add(cursor.getString(0));
          goto _L1
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public int getVersion()
        throws ActiveRecordException
    {
        if (_database == null || !_database.isOpen())
        {
            Logg.e(ARConst.TAG, "(%t) %s.getVersion(): ERROR - db object is null or closed", new Object[] {
                CNAME
            });
            throw new ActiveRecordException("Database is closed. Did you forget to open database?");
        } else
        {
            return _database.getVersion();
        }
    }

    public long insert(String s, ContentValues contentvalues)
    {
        return _database.insert(s, null, contentvalues);
    }

    public boolean isOpen()
    {
        return _database != null && _database.isOpen();
    }

    public void open()
    {
        if (_database != null && _database.isOpen())
        {
            _database.close();
            _database = null;
        }
        _database = _dbHelper.getReadableDatabase();
        Logg.d(ARConst.TAG, "(%t) %s.open(): new db obj %s", new Object[] {
            CNAME, _database.toString()
        });
    }

    public Cursor query(String s, String as[], String s1, String as1[])
        throws ActiveRecordException
    {
        return query(false, s, as, s1, as1, null, null, null, null);
    }

    public Cursor query(boolean flag, String s, String as[], String s1, String as1[], String s2, String s3, 
            String s4, String s5)
        throws ActiveRecordException
    {
        if (_database == null || !_database.isOpen())
        {
            Logg.e(ARConst.TAG, "(%t) %s.query(): ERROR - db object is null or closed", new Object[] {
                CNAME
            });
            throw new ActiveRecordException("Database is closed. Did you forget to open database?");
        } else
        {
            return _database.query(flag, s, as, s1, as1, s2, s3, s4, s5);
        }
    }

    public Cursor rawQuery(String s)
    {
        return rawQuery(s, null);
    }

    public Cursor rawQuery(String s, String as[])
    {
        Log.i("rawQuery", s);
        return _database.rawQuery(s, as);
    }

    public void setTransactionSuccessful()
    {
        _database.setTransactionSuccessful();
    }

    public void setVersion(int i)
        throws ActiveRecordException
    {
        if (_database == null || !_database.isOpen())
        {
            Logg.e(ARConst.TAG, "(%t) %s.setVersion(): ERROR - db object is null or closed", new Object[] {
                CNAME
            });
            throw new ActiveRecordException("Database is closed. Did you forget to open database?");
        } else
        {
            _database.setVersion(i);
            return;
        }
    }

    public int update(String s, ContentValues contentvalues, String s1, String as[])
    {
        return _database.update(s, contentvalues, s1, as);
    }

}
