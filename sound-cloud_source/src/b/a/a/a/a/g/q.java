// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import b.a.a.a.a.b.h;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.n;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.z;
import b.a.a.a.a.e.g;
import b.a.a.a.d;
import b.a.a.a.l;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package b.a.a.a.a.g:
//            k, i, l, j, 
//            w, t, s, r

public final class q
{
    public static final class a
    {

        private static final q a = new q((byte)0);

        public static q a()
        {
            return a;
        }

    }

    public static interface b
    {

        public abstract Object a(b.a.a.a.a.g.t t1);
    }


    private final AtomicReference a;
    private final CountDownLatch b;
    private s c;
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

    private void a(b.a.a.a.a.g.t t1)
    {
        a.set(t1);
        b.countDown();
    }

    public final q a(l l1, t t1, g g, String s1, String s2, String s3)
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
            android.content.Context context = l1.n;
            String s4 = t1.d;
            new h();
            String s5 = h.a(context);
            String s6 = t1.e();
            z z1 = new z();
            k k1 = new k();
            i i1 = new i(l1);
            String s7 = j.k(context);
            g = new b.a.a.a.a.g.l(l1, s3, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[] {
                s4
            }), g);
            c = new b.a.a.a.a.g.j(l1, new w(s5, t1.a(s5, s4), j.a(new String[] {
                j.m(context)
            }), s2, s1, n.a(s6).e, s7), z1, k1, i1, g);
        }
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        l1;
        throw l1;
    }

    public final b.a.a.a.a.g.t a()
    {
        b.a.a.a.a.g.t t1;
        try
        {
            b.await();
            t1 = (b.a.a.a.a.g.t)a.get();
        }
        catch (InterruptedException interruptedexception)
        {
            b.a.a.a.d.a();
            return null;
        }
        return t1;
    }

    public final Object a(b b1, Object obj)
    {
        b.a.a.a.a.g.t t1 = (b.a.a.a.a.g.t)a.get();
        if (t1 == null)
        {
            return obj;
        } else
        {
            return b1.a(t1);
        }
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        b.a.a.a.a.g.t t1;
        t1 = c.a();
        a(t1);
        boolean flag;
        if (t1 != null)
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

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        b.a.a.a.a.g.t t1;
        t1 = c.a(r.b);
        a(t1);
        if (t1 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        b.a.a.a.d.a();
        boolean flag;
        if (t1 != null)
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
