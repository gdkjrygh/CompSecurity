// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class fem
{

    static final boolean a = Log.isLoggable("DiskCache", 5);
    static final boolean b = Log.isLoggable("DiskCache", 3);
    static final boolean c = Log.isLoggable("DiskCache", 2);
    final File d;
    final fek e;
    final fef f;
    final fec g;
    private final feh h;
    private final File i;
    private final fep j;
    private volatile boolean k;

    public fem(Context context, File file, long l)
    {
        feh feh1 = new feh();
        HandlerThread handlerthread = new HandlerThread("glide_disk_cache", 10);
        handlerthread.start();
        this(context, file, feh1, l, handlerthread.getLooper(), 0.05F, 20);
    }

    private fem(Context context, File file, feh feh1, long l, Looper looper, float f1, 
            int i1)
    {
        g = new fec();
        b.a(true, "updated modified time batch size must be >= 1");
        d = file;
        h = feh1;
        e = new fek(new feb(context), looper, 20);
        i = new File(file, "cache_canary");
        f = new fef(this, file, feh1, e, looper, l, 0.05F);
        j = new fep(this, file, e, looper);
    }

    static long a(long l)
    {
        return SystemClock.currentThreadTimeMillis() - l;
    }

    static long c()
    {
        return SystemClock.currentThreadTimeMillis();
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj1;
        if (a)
        {
            Log.w("DiskCache", "Clearing cache and deleting all entries!");
        }
        h.b(d);
        obj1 = e;
        sqlitedatabase = ((fek) (obj1)).a.getWritableDatabase();
        sqlitedatabase.beginTransactionNonExclusive();
        sqlitedatabase.delete("journal", null, null);
        obj1 = ((fek) (obj1)).d;
        ((fes) (obj1)).b.getReadableDatabase().delete("size", null, null);
        ((fes) (obj1)).a.set(0L);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        k = false;
        g.a();
        a();
        if (!i.createNewFile() && a)
        {
            Log.w("DiskCache", "Failed to create new canary file");
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (!a) goto _L2; else goto _L1
_L1:
        Log.w("DiskCache", "Threw creating canary", ((Throwable) (obj)));
          goto _L2
    }

    public final File a(String s)
    {
        File file;
        fed fed1;
        boolean flag1;
        long l;
        file = null;
        flag1 = true;
        l = SystemClock.currentThreadTimeMillis();
        a();
        fed1 = g.a(s);
        fed1.d();
        fed1.a.readLock().lock();
        boolean flag;
        if (fed1.c != fee.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l1;
        if (fed1.c == fee.b)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        file = fed1.d;
_L3:
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        e.c.obtainMessage(1, s).sendToTarget();
        if (c)
        {
            l1 = SystemClock.currentThreadTimeMillis();
            (new StringBuilder(String.valueOf(s).length() + 45)).append("Completed get in: ").append(l1 - l).append(", key: ").append(s);
        }
        fed1.a();
        return file;
_L2:
        File file1;
        file1 = b(s);
        if (!file1.exists())
        {
            break MISSING_BLOCK_LABEL_200;
        }
        fed1.a(file1);
        file = file1;
          goto _L3
        fed1.c = fee.c;
          goto _L3
        s;
        fed1.a();
        throw s;
    }

    final List a(List list)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        int l;
        obj2 = e;
        obj3 = new ContentValues();
        ((ContentValues) (obj3)).put("pending_delete", Integer.valueOf(1));
        obj1 = ((fek) (obj2)).a.getWritableDatabase();
        l = 0;
_L8:
        String as[];
        String s1;
        if (l >= list.size())
        {
            break MISSING_BLOCK_LABEL_212;
        }
        List list1 = list.subList(l, Math.min(list.size(), l + 200));
        int i1 = list1.size();
        as = (String[])list1.toArray(new String[i1]);
        s1 = b.b("key", i1);
        ((SQLiteDatabase) (obj1)).beginTransactionNonExclusive();
        Object obj;
        obj = String.valueOf("SELECT SUM(size) FROM journal WHERE pending_delete = 0 AND ");
        String s2 = String.valueOf(s1);
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        obj = ((String) (obj)).concat(s2);
_L1:
        long l1 = DatabaseUtils.longForQuery(((SQLiteDatabase) (obj1)), ((String) (obj)), as);
        ((fek) (obj2)).d.a(-l1);
        ((SQLiteDatabase) (obj1)).update("journal", ((ContentValues) (obj3)), s1, as);
        ((SQLiteDatabase) (obj1)).setTransactionSuccessful();
        ((SQLiteDatabase) (obj1)).endTransaction();
        l += 200;
        continue; /* Loop/switch isn't completed */
        obj = new String(((String) (obj)));
          goto _L1
        list;
        ((SQLiteDatabase) (obj1)).endTransaction();
        throw list;
        obj = new ArrayList(list.size());
        obj1 = list.iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_367;
        }
        obj2 = (String)((Iterator) (obj1)).next();
        list = g.a(((String) (obj2)));
        list.b();
        obj3 = b(((String) (obj2)));
        if (!((File) (obj3)).delete()) goto _L3; else goto _L2
_L2:
        ((List) (obj)).add(obj2);
_L6:
        list.c = fee.c;
        list.c();
          goto _L4
_L3:
        if (!a) goto _L6; else goto _L5
_L5:
        String s = String.valueOf(obj3);
        Log.w("DiskCache", (new StringBuilder(String.valueOf(s).length() + 23)).append("Failed to delete file: ").append(s).toString());
          goto _L6
        obj;
        list.c();
        throw obj;
        e.a(((List) (obj)));
        return ((List) (obj));
        if (true) goto _L8; else goto _L7
_L7:
    }

    void a()
    {
        boolean flag1;
        long l;
        l = 0L;
        flag1 = true;
        if (k)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        this;
        JVM INSTR monitorenter ;
        if (k) goto _L2; else goto _L1
_L1:
        boolean flag;
        Object obj;
        Exception exception;
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        if (!d.mkdirs() && (!d.exists() || !d.isDirectory()))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj = String.valueOf(d);
        throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 34)).append("Failed to create cache directory: ").append(((String) (obj))).toString());
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception = e.d;
        sqlitedatabase = ((fes) (exception)).b.getReadableDatabase();
        if (0L != DatabaseUtils.longForQuery(sqlitedatabase, "SELECT COUNT(*) FROM size", null))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        contentvalues = new ContentValues();
        contentvalues.put("size", Integer.valueOf(0));
        sqlitedatabase.insert("size", null, contentvalues);
_L4:
        ((fes) (exception)).a.set(l);
        k = true;
        j.d.obtainMessage(3).sendToTarget();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        l = DatabaseUtils.longForQuery(sqlitedatabase, "SELECT size FROM size", null);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(String s, File file)
    {
        if (file == null) goto _L2; else goto _L1
_L1:
        if (!file.delete()) goto _L2; else goto _L3
_L3:
        SQLiteDatabase sqlitedatabase;
        SQLiteStatement sqlitestatement;
        SQLiteStatement sqlitestatement1;
        SQLiteStatement sqlitestatement2;
        file = e;
        sqlitedatabase = ((fek) (file)).a.getWritableDatabase();
        sqlitestatement = ((fek) (file)).b.a("SELECT COUNT(*) FROM journal WHERE key = ?");
        sqlitestatement.bindString(1, s);
        sqlitestatement1 = ((fek) (file)).b.a("SELECT size FROM journal WHERE key = ?");
        sqlitestatement1.bindString(1, s);
        sqlitestatement2 = ((fek) (file)).b.a("DELETE FROM journal WHERE key = ?");
        sqlitestatement2.bindString(1, s);
        sqlitedatabase.beginTransactionNonExclusive();
        long l1 = sqlitestatement.simpleQueryForLong();
        boolean flag;
        if (0L != l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L5; else goto _L4
_L4:
        sqlitedatabase.endTransaction();
        ((fek) (file)).b.a("SELECT COUNT(*) FROM journal WHERE key = ?", sqlitestatement);
        ((fek) (file)).b.a("SELECT size FROM journal WHERE key = ?", sqlitestatement1);
        ((fek) (file)).b.a("DELETE FROM journal WHERE key = ?", sqlitestatement2);
_L6:
        g.a(s).c = fee.a;
_L2:
        g.a(s).c();
        return;
_L5:
        int l;
        l1 = sqlitestatement1.simpleQueryForLong();
        l = sqlitestatement2.executeUpdateDelete();
        if (l == 1)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        String s1 = String.valueOf("Failed to delete entry, key: ");
        throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 59 + String.valueOf(s).length())).append(s1).append(s).append(", size: ").append(l1).append(", actually deleted: ").append(l).toString());
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        ((fek) (file)).b.a("SELECT COUNT(*) FROM journal WHERE key = ?", sqlitestatement);
        ((fek) (file)).b.a("SELECT size FROM journal WHERE key = ?", sqlitestatement1);
        ((fek) (file)).b.a("DELETE FROM journal WHERE key = ?", sqlitestatement2);
        throw exception;
        file;
        g.a(s).c();
        throw file;
        ((fek) (file)).d.a(-l1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        ((fek) (file)).b.a("SELECT COUNT(*) FROM journal WHERE key = ?", sqlitestatement);
        ((fek) (file)).b.a("SELECT size FROM journal WHERE key = ?", sqlitestatement1);
        ((fek) (file)).b.a("DELETE FROM journal WHERE key = ?", sqlitestatement2);
          goto _L6
    }

    File b(String s)
    {
        return new File(d, s);
    }

    void b()
    {
        if (i.exists())
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!i.exists())
        {
            break MISSING_BLOCK_LABEL_31;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        d();
        this;
        JVM INSTR monitorexit ;
    }

}
