// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;

public final class mvj
{

    private static final String a[] = {
        "name"
    };

    public static SQLiteDatabase a(Context context, int i)
    {
        return ((mvh)olm.a(context, mvh)).b(context, i).getWritableDatabase();
    }

    public static void a(SQLiteDatabase sqlitedatabase)
    {
        if (!sqlitedatabase.isReadOnly())
        {
            sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    private static void a(SQLiteDatabase sqlitedatabase, LinkedList linkedlist)
    {
        Iterator iterator = linkedlist.iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            linkedlist = String.valueOf("DROP TABLE IF EXISTS ");
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                linkedlist = linkedlist.concat(s);
            } else
            {
                linkedlist = new String(linkedlist);
            }
            sqlitedatabase.execSQL(linkedlist);
        }
    }

    public static void a(SQLiteDatabase sqlitedatabase, String as[])
    {
        LinkedList linkedlist = new LinkedList();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            if (a(sqlitedatabase, s))
            {
                linkedlist.addFirst(s);
            } else
            {
                linkedlist.addLast(s);
            }
            i++;
        }
        a(sqlitedatabase, linkedlist);
    }

    private static boolean a(SQLiteDatabase sqlitedatabase, String s)
    {
        SQLiteDatabase sqlitedatabase1;
        SQLiteDatabase sqlitedatabase2;
        sqlitedatabase2 = null;
        sqlitedatabase1 = null;
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder(String.valueOf(s).length() + 25)).append("pragma foreign_key_list(").append(s).append(")").toString(), null);
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        sqlitedatabase1 = sqlitedatabase;
        sqlitedatabase2 = sqlitedatabase;
        int i = sqlitedatabase.getCount();
        if (i > 0)
        {
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return true;
        }
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
_L2:
        return false;
        sqlitedatabase;
        sqlitedatabase2 = sqlitedatabase1;
        if (!Log.isLoggable("DbUtils", 5))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        sqlitedatabase2 = sqlitedatabase1;
        Log.w("DbUtils", "Failed pragma foreign_key_list", sqlitedatabase);
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase;
        if (sqlitedatabase2 != null)
        {
            sqlitedatabase2.close();
        }
        throw sqlitedatabase;
    }

    public static SQLiteDatabase b(Context context, int i)
    {
        return ((mvh)olm.a(context, mvh)).b(context, i).getReadableDatabase();
    }

    public static void b(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        LinkedList linkedlist;
        cursor = sqlitedatabase.query("sqlite_master", a, "type='table' AND name NOT LIKE 'sqlite_%' AND name NOT LIKE 'android_%'", null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        linkedlist = new LinkedList();
_L2:
        String s;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = cursor.getString(0);
        if (a(sqlitedatabase, s))
        {
            linkedlist.addFirst(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_70;
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        linkedlist.addLast(s);
        if (true) goto _L2; else goto _L1
_L1:
        cursor.close();
        a(sqlitedatabase, linkedlist);
    }

    public static void b(SQLiteDatabase sqlitedatabase, String as[])
    {
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            String s = String.valueOf("DROP VIEW IF EXISTS ");
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
            sqlitedatabase.execSQL(s);
            i++;
        }
    }

    public static void c(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor;
        cursor = sqlitedatabase.query("sqlite_master", a, "type='view'", null, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
_L2:
        String s;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        String s1 = cursor.getString(0);
        s = String.valueOf("DROP VIEW IF EXISTS ");
        s1 = String.valueOf(s1);
        if (s1.length() == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s.concat(s1);
_L3:
        sqlitedatabase.execSQL(s);
        if (true) goto _L2; else goto _L1
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
_L1:
        s = new String(s);
          goto _L3
        cursor.close();
    }

    static 
    {
        new mvk();
        new mvl();
        new mvm();
        new mvn();
    }
}
