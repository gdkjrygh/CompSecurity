// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class mvo
    implements mvi
{

    private static final mvo a = new mvo();

    private mvo()
    {
    }

    static String[] a(SQLiteDatabase sqlitedatabase, String s)
    {
        int i;
        sqlitedatabase = sqlitedatabase.query("partition_tables", new String[] {
            "table_name"
        }, "partition_name=?", new String[] {
            s
        }, null, null, null);
        s = new String[sqlitedatabase.getCount()];
        i = 0;
_L2:
        if (!sqlitedatabase.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s[i] = sqlitedatabase.getString(0);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        return s;
        s;
        sqlitedatabase.close();
        throw s;
    }

    static String[] b(SQLiteDatabase sqlitedatabase, String s)
    {
        int i;
        sqlitedatabase = sqlitedatabase.query("partition_views", new String[] {
            "view_name"
        }, "partition_name=?", new String[] {
            s
        }, null, null, null);
        s = new String[sqlitedatabase.getCount()];
        i = 0;
_L2:
        if (!sqlitedatabase.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s[i] = sqlitedatabase.getString(0);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        return s;
        s;
        sqlitedatabase.close();
        throw s;
    }

    static Map c(SQLiteDatabase sqlitedatabase)
    {
        Object obj;
        obj = new HashMap();
        sqlitedatabase = sqlitedatabase.query("partition_versions", new String[] {
            "partition_name", "version"
        }, null, null, null, null, null);
        while (sqlitedatabase.moveToNext()) 
        {
            ((Map) (obj)).put(sqlitedatabase.getString(0), Integer.valueOf(sqlitedatabase.getInt(1)));
        }
        break MISSING_BLOCK_LABEL_79;
        obj;
        sqlitedatabase.close();
        throw obj;
        sqlitedatabase.close();
        return ((Map) (obj));
    }

    public static mvo e()
    {
        return a;
    }

    public final String a()
    {
        return "__master_partition__";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        if (Log.isLoggable("PartitionedDatabase", 3))
        {
            String s = String.valueOf("__master_partition__");
            if (s.length() != 0)
            {
                "onCreate: ".concat(s);
            } else
            {
                new String("onCreate: ");
            }
        }
        sqlitedatabase.execSQL("CREATE TABLE partition_versions (partition_name TEXT NOT NULL PRIMARY KEY,version INT NOT NULL DEFAULT(0));");
        sqlitedatabase.execSQL("CREATE TABLE partition_tables (partition_name TEXT NOT NULL,table_name TEXT NOT NULL,UNIQUE (partition_name,table_name));");
        sqlitedatabase.execSQL("CREATE TABLE partition_views (partition_name TEXT NOT NULL,view_name TEXT NOT NULL,UNIQUE (partition_name,view_name));");
    }

    final void a(SQLiteDatabase sqlitedatabase, mvi mvi1)
    {
        java.util.List list = Arrays.asList(a(sqlitedatabase, mvi1.a()));
        Object obj = Arrays.asList(mvi1.b());
        Object obj1 = new HashSet(list);
        ((Set) (obj1)).removeAll(((java.util.Collection) (obj)));
        obj = new HashSet(((java.util.Collection) (obj)));
        ((Set) (obj)).removeAll(list);
        String as[] = new String[2];
        as[0] = mvi1.a();
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); sqlitedatabase.delete("partition_tables", "partition_name=? AND table_name=?", as))
        {
            as[1] = (String)((Iterator) (obj1)).next();
        }

        obj1 = new ContentValues(2);
        ((ContentValues) (obj1)).put("partition_name", mvi1.a());
        for (mvi1 = ((Set) (obj)).iterator(); mvi1.hasNext(); sqlitedatabase.insert("partition_tables", null, ((ContentValues) (obj1))))
        {
            ((ContentValues) (obj1)).put("table_name", (String)mvi1.next());
        }

    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        if (Log.isLoggable("PartitionedDatabase", 4))
        {
            (new StringBuilder(53)).append("Upgrade master partition: ").append(j).append(" --> ").append(k);
        }
        return true;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    void b(SQLiteDatabase sqlitedatabase, mvi mvi1)
    {
        java.util.List list = Arrays.asList(b(sqlitedatabase, mvi1.a()));
        Object obj = Arrays.asList(mvi1.c());
        Object obj1 = new HashSet(list);
        ((Set) (obj1)).removeAll(((java.util.Collection) (obj)));
        obj = new HashSet(((java.util.Collection) (obj)));
        ((Set) (obj)).removeAll(list);
        String as[] = new String[2];
        as[0] = mvi1.a();
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); sqlitedatabase.delete("partition_views", "partition_name=? AND view_name=?", as))
        {
            as[1] = (String)((Iterator) (obj1)).next();
        }

        obj1 = new ContentValues(2);
        ((ContentValues) (obj1)).put("partition_name", mvi1.a());
        for (mvi1 = ((Set) (obj)).iterator(); mvi1.hasNext(); sqlitedatabase.insert("partition_views", null, ((ContentValues) (obj1))))
        {
            ((ContentValues) (obj1)).put("view_name", (String)mvi1.next());
        }

    }

    public final String[] b()
    {
        return (new String[] {
            "partition_versions", "partition_tables", "partition_views"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 1;
    }

}
