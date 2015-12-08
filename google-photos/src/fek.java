// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

final class fek
{

    private static final boolean e = Log.isLoggable("Journal", 2);
    private static final boolean f = Log.isLoggable("Journal", 3);
    private static final boolean g = Log.isLoggable("Journal", 5);
    private static final String h[] = {
        "key", "size"
    };
    private static final String i[] = {
        "key"
    };
    final feb a;
    final fet b;
    final Handler c;
    final fes d;

    fek(feb feb1, Looper looper, int j)
    {
        a = feb1;
        d = new fes(feb1);
        b = new fet(feb1);
        c = new Handler(looper, new fel(feb1, j));
    }

    static boolean b()
    {
        return f;
    }

    static boolean c()
    {
        return e;
    }

    final List a()
    {
        Cursor cursor;
        Object obj;
        obj = new ArrayList();
        cursor = a.getReadableDatabase().query("journal", i, "pending_delete != 0", null, null, null, null);
        while (cursor.moveToNext()) 
        {
            ((List) (obj)).add(cursor.getString(cursor.getColumnIndexOrThrow("key")));
        }
        break MISSING_BLOCK_LABEL_72;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((List) (obj));
    }

    final List a(long l)
    {
        SQLiteDatabase sqlitedatabase;
        ArrayList arraylist;
        int j;
        int k;
        long l1;
        sqlitedatabase = a.getReadableDatabase();
        arraylist = new ArrayList();
        l1 = 0L;
        j = 0;
        k = 0;
_L3:
        Cursor cursor;
        if (j != 0 || l1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        String as[] = h;
        String s1 = String.valueOf("25");
        cursor = sqlitedatabase.query("journal", as, "pending_delete = 0", null, null, null, "last_modified_time ASC", (new StringBuilder(String.valueOf(s1).length() + 13)).append(k).append(", ").append(s1).toString());
        int i1;
        j = cursor.getColumnIndexOrThrow("key");
        i1 = cursor.getColumnIndexOrThrow("size");
_L1:
        if (!cursor.moveToNext() || l1 >= l)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        arraylist.add(cursor.getString(j));
        l1 += cursor.getLong(i1);
          goto _L1
        j = cursor.getCount();
        if (j < 25)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        cursor.close();
        k += 25;
        if (true) goto _L3; else goto _L2
        Exception exception;
        exception;
        cursor.close();
        throw exception;
_L2:
        if (j != 0 && l1 < l)
        {
            String s = String.valueOf("Size mismatch, expected to be able to evict at least ");
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 87)).append(s).append(l).append(" bytes, but only found ").append(l1).append(" bytes worth of entries!").toString());
        } else
        {
            return arraylist;
        }
    }

    final void a(String s, long l)
    {
        SQLiteDatabase sqlitedatabase;
        SQLiteStatement sqlitestatement;
        sqlitedatabase = a.getWritableDatabase();
        sqlitestatement = b.a("INSERT OR REPLACE INTO journal(key, last_modified_time, size) VALUES (?, ?, ?)");
        sqlitestatement.bindString(1, s);
        sqlitestatement.bindLong(2, System.currentTimeMillis());
        sqlitestatement.bindLong(3, l);
        sqlitedatabase.beginTransactionNonExclusive();
        sqlitestatement.executeInsert();
        d.a(l);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        b.a("INSERT OR REPLACE INTO journal(key, last_modified_time, size) VALUES (?, ?, ?)", sqlitestatement);
        return;
        s;
        sqlitedatabase.endTransaction();
        b.a("INSERT OR REPLACE INTO journal(key, last_modified_time, size) VALUES (?, ?, ?)", sqlitestatement);
        throw s;
    }

    final void a(List list)
    {
        SQLiteDatabase sqlitedatabase;
        int j;
        sqlitedatabase = a.getWritableDatabase();
        j = 0;
_L2:
        String as[];
        int k;
        if (j >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        List list1 = list.subList(j, Math.min(list.size(), j + 200));
        k = list1.size();
        as = (String[])list1.toArray(new String[k]);
        sqlitedatabase.beginTransactionNonExclusive();
        k = sqlitedatabase.delete("journal", b.b("key", k), as);
        if (k != as.length && g)
        {
            String s = String.valueOf("Failed to delete all expected entries, expected: ");
            int l = as.length;
            Log.w("Journal", (new StringBuilder(String.valueOf(s).length() + 33)).append(s).append(l).append(", deleted: ").append(k).toString());
        }
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        j += 200;
        if (true) goto _L2; else goto _L1
        list;
        sqlitedatabase.endTransaction();
        throw list;
_L1:
    }

}
