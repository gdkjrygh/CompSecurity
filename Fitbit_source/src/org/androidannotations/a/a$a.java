// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.a;

import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package org.androidannotations.a:
//            a

public static abstract class d
    implements Runnable
{

    private String a;
    private int b;
    private long c;
    private String d;
    private boolean e;
    private Future f;
    private AtomicBoolean g;

    static String a(d d1)
    {
        return d1.d;
    }

    static Future a(d d1, Future future)
    {
        d1.f = future;
        return future;
    }

    static boolean a(f f1, boolean flag)
    {
        f1.e = flag;
        return flag;
    }

    static int b(e e1)
    {
        return e1.b;
    }

    private void b()
    {
        if (a == null && d == null)
        {
            return;
        }
        org/androidannotations/a/a;
        JVM INSTR monitorenter ;
        b b1;
        org.androidannotations.a.a.a().remove(this);
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        b1 = org.androidannotations.a.a.a(d);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (b1.b != 0)
        {
            b1.b = Math.max(0, (int)(c - System.currentTimeMillis()));
        }
        org.androidannotations.a.a.a(b1);
        org/androidannotations/a/a;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        org/androidannotations/a/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static String c(illis illis)
    {
        return illis.a;
    }

    static Future d(a a1)
    {
        return a1.f;
    }

    static AtomicBoolean e(f f1)
    {
        return f1.g;
    }

    static void f(g g1)
    {
        g1.b();
    }

    static boolean g(b b1)
    {
        return b1.e;
    }

    public abstract void a();

    public void run()
    {
        if (g.getAndSet(true))
        {
            return;
        }
        a();
        b();
        return;
        Exception exception;
        exception;
        b();
        throw exception;
    }

    public tomicBoolean(String s, int i, String s1)
    {
        g = new AtomicBoolean();
        if (!"".equals(s))
        {
            a = s;
        }
        if (i > 0)
        {
            b = i;
            c = System.currentTimeMillis() + (long)i;
        }
        if (!"".equals(s1))
        {
            d = s1;
        }
    }
}
