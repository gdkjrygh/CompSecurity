// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import com.facebook.analytics.am;
import com.facebook.common.e.h;
import com.facebook.common.h.a;
import com.facebook.inject.t;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.acra.ErrorReporter;

// Referenced classes of package com.facebook.analytics.c:
//            a, f, b, e, 
//            h

public class g
{

    private static final String a[] = {
        "id", "sid", "uid", "seq", "timestamp", "active", "meta"
    };
    private static final String b[] = {
        "data", "timestamp"
    };
    private static final String c[] = {
        "timestamp"
    };
    private final com.facebook.analytics.c.a d;
    private final e e;
    private final Context f;
    private final com.facebook.common.time.a g;

    public g(Context context, com.facebook.analytics.c.a a1, e e1, com.facebook.common.time.a a2)
    {
        f = context;
        d = a1;
        e = e1;
        g = a2;
    }

    private void a(f f1, long l)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = d.e();
        sqlitedatabase.beginTransaction();
        e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("id", f1.j());
        contentvalues.put("sid", f1.a());
        contentvalues.put("uid", f1.e());
        contentvalues.put("seq", Long.valueOf(f1.b()));
        contentvalues.put("timestamp", Long.valueOf(l));
        contentvalues.put("active", Integer.valueOf(1));
        sqlitedatabase.insert("batches", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        f1;
        sqlitedatabase.endTransaction();
        throw f1;
    }

    private void a(String s, Throwable throwable)
    {
        h h1 = (h)t.a(f).a(com/facebook/common/e/h);
        if (h1 != null)
        {
            h1.a("AnalyticsStorage", s, throwable);
        }
    }

    private void d(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        ErrorReporter errorreporter = ErrorReporter.getInstance();
        if (!f1.d()) goto _L2; else goto _L1
_L1:
        errorreporter.putCustomData("marauder_session_id", f1.a());
        errorreporter.putCustomData("marauder_batch_id", String.valueOf(f1.b()));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        errorreporter.removeCustomData("marauder_session_id");
        errorreporter.removeCustomData("marauder_batch_id");
        if (true) goto _L4; else goto _L3
_L3:
        f1;
        throw f1;
    }

    private void e()
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = d.e();
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("active", Integer.valueOf(0));
        sqlitedatabase.update("batches", contentvalues, null, null);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    private f f()
    {
        return new f(null, null, 0L, 0L, 0L);
    }

    public int a()
    {
        Cursor cursor = d.e().query("events", c, null, null, null, null, null);
        int i = cursor.getCount();
        cursor.close();
        return i;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public f a(f f1, f f2)
    {
        Preconditions.checkNotNull(f1);
        b(f1);
        f1 = f2;
        if (f2 == null)
        {
            f1 = f();
        }
        d(f1);
        a(f1);
        return f1;
    }

    public f a(f f1, String s)
    {
        s = new f(com.facebook.common.h.a.a().toString(), s, 0L, 0L, 0L);
        if (f1 != null && f1.d())
        {
            a(f1, ((f) (s)));
            return s;
        } else
        {
            d(s);
            a(((f) (s)));
            return s;
        }
    }

    public void a(am am1, String s)
    {
        SQLiteDatabase sqlitedatabase = d.e();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("bid", s);
        contentvalues.put("type", am1.a());
        contentvalues.put("data", am1.e().toString());
        contentvalues.put("timestamp", Long.valueOf(am1.b()));
        sqlitedatabase.insert("events", null, contentvalues);
    }

    public void a(f f1)
    {
        SQLiteDatabase sqlitedatabase;
        Preconditions.checkNotNull(f1);
        try
        {
            sqlitedatabase = d.e();
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            a("Cannot save AnalyticsSession to database", ((Throwable) (f1)));
            return;
        }
        sqlitedatabase.beginTransaction();
        e.b(b.d, f1.a());
        e.b(b.e, f1.e());
        e.b(b.c, f1.g());
        e.b(b.b, f1.f());
        e.b(b.f, f1.b());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        f1;
        sqlitedatabase.endTransaction();
        throw f1;
    }

    public void a(String s)
    {
        SQLiteDatabase sqlitedatabase;
        String as[];
        sqlitedatabase = d.e();
        sqlitedatabase.beginTransaction();
        as = new String[1];
        as[0] = s;
        sqlitedatabase.delete("events", "bid=?", as);
        sqlitedatabase.delete("batches", "id=?", as);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public String b(String s)
    {
        SQLiteDatabase sqlitedatabase;
        Object obj;
        obj = new StringBuilder();
        sqlitedatabase = d.e();
        sqlitedatabase.beginTransaction();
        s = sqlitedatabase.query("events", b, "bid=?", new String[] {
            s
        }, null, null, "timestamp");
        while (s.moveToNext()) 
        {
            String s1 = s.getString(0);
            if (((StringBuilder) (obj)).length() > 0)
            {
                ((StringBuilder) (obj)).append(",");
            }
            ((StringBuilder) (obj)).append(s1);
        }
        break MISSING_BLOCK_LABEL_104;
        obj;
        s.close();
        throw obj;
        s;
        sqlitedatabase.endTransaction();
        throw s;
        s.close();
        sqlitedatabase.endTransaction();
        return ((StringBuilder) (obj)).toString();
    }

    public List b()
    {
        SQLiteDatabase sqlitedatabase;
        Object obj1;
        obj1 = new ArrayList();
        sqlitedatabase = d.e();
        sqlitedatabase.beginTransaction();
        Object obj;
        c();
        obj = sqlitedatabase.query("batches", a, "active=0", null, null, null, "timestamp");
_L1:
        String s;
        String s1;
        String s2;
        long l;
        long l1;
        if (!((Cursor) (obj)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s = ((Cursor) (obj)).getString(0);
        s1 = ((Cursor) (obj)).getString(1);
        s2 = ((Cursor) (obj)).getString(2);
        l = ((Cursor) (obj)).getLong(3);
        l1 = ((Cursor) (obj)).getLong(4);
        boolean flag;
        if (((Cursor) (obj)).getInt(5) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((List) (obj1)).add(new com.facebook.analytics.c.h(this, s, s1, l1, s2, l, flag));
          goto _L1
        obj1;
        ((Cursor) (obj)).close();
        sqlitedatabase.setTransactionSuccessful();
        throw obj1;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        ((Cursor) (obj)).close();
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return ((List) (obj1));
    }

    public void b(f f1)
    {
        Preconditions.checkNotNull(f1);
        e();
        f1.a(false);
        f1.c(0L);
    }

    public void c()
    {
        SQLiteDatabase sqlitedatabase;
        long l;
        l = System.currentTimeMillis() - 0x7b98a00L;
        sqlitedatabase = d.e();
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("events", "timestamp<?", new String[] {
            Long.toString(l)
        });
        sqlitedatabase.delete("batches", "timestamp<?", new String[] {
            Long.toString(l)
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public void c(f f1)
    {
        if (!f1.c())
        {
            f1.k();
            f1.c(0L);
            a(f1, g.a());
            a(f1);
            f1.a(true);
            d(f1);
        }
    }

    public f d()
    {
        Object obj;
        f f1;
        try
        {
            obj = d.e();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Cannot load AnalyticsSession from database", ((Throwable) (obj)));
            obj = f();
            d(((f) (obj)));
            return ((f) (obj));
        }
        ((SQLiteDatabase) (obj)).beginTransaction();
        f1 = new f(e.a(b.d), e.a(b.e), e.a(b.c, 0L), e.a(b.b, 0L), e.a(b.f, 0L));
        d(f1);
        ((SQLiteDatabase) (obj)).endTransaction();
        return f1;
        Exception exception;
        exception;
        ((SQLiteDatabase) (obj)).endTransaction();
        throw exception;
    }

}
