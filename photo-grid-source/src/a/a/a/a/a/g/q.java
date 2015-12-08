// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.g;

import a.a.a.a.a.b.ah;
import a.a.a.a.a.b.j;
import a.a.a.a.a.b.l;
import a.a.a.a.a.b.r;
import a.a.a.a.a.b.x;
import a.a.a.a.a.e.m;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package a.a.a.a.a.g:
//            r, k, i, l, 
//            j, y, v, s, 
//            u, t

public final class q
{

    private final AtomicReference a;
    private final CountDownLatch b;
    private u c;
    private boolean d;

    private q()
    {
        a = new AtomicReference();
        b = new CountDownLatch(1);
        d = false;
    }

    q(byte byte0)
    {
        this();
    }

    public static q a()
    {
        return r.a();
    }

    private void a(v v1)
    {
        a.set(v1);
        b.countDown();
    }

    public final q a(p p1, x x1, m m, String s1, String s2, String s3)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (c == null)
        {
            android.content.Context context = p1.v();
            String s4 = x1.c();
            new j();
            String s5 = j.a(context);
            String s6 = x1.h();
            ah ah1 = new ah();
            k k1 = new k();
            i i1 = new i(p1);
            String s7 = l.j(context);
            m = new a.a.a.a.a.g.l(p1, s3, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s4
            }), m);
            c = new a.a.a.a.a.g.j(p1, new y(s5, x1.a(s5, s4), l.a(new String[] {
                l.l(context)
            }), s2, s1, r.a(s6).a(), s7), ah1, k1, i1, m);
        }
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        p1;
        throw p1;
    }

    public final Object a(a.a.a.a.a.g.s s1, Object obj)
    {
        v v1 = (v)a.get();
        if (v1 == null)
        {
            return obj;
        } else
        {
            return s1.a(v1);
        }
    }

    public final v b()
    {
        v v1;
        try
        {
            b.await();
            v1 = (v)a.get();
        }
        catch (InterruptedException interruptedexception)
        {
            f.d().c("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
        return v1;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        v v1;
        v1 = c.a();
        a(v1);
        boolean flag;
        if (v1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        v v1;
        v1 = c.a(t.b);
        a(v1);
        if (v1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        f.d().b("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        boolean flag;
        if (v1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
