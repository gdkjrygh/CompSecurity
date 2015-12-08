// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class aop
    implements aon, bao, Comparable, Runnable
{

    private amz A;
    private ann B;
    private volatile boolean C;
    public final aoo a = new aoo();
    public final aou b;
    final aov c = new aov();
    public ama d;
    public ane e;
    public amb f;
    public apr g;
    public int h;
    public int i;
    public apa j;
    public ani k;
    public aor l;
    public int m;
    public aow n;
    public volatile aom o;
    public volatile boolean p;
    private final List q = new ArrayList();
    private final baq r = baq.a();
    private final jw s;
    private final aot t = new aot();
    private aox u;
    private long v;
    private Thread w;
    private ane x;
    private ane y;
    private Object z;

    aop(aou aou, jw jw1)
    {
        b = aou;
        s = jw1;
    }

    static aoo a(aop aop1)
    {
        return aop1.a;
    }

    private aqa a(ann ann1, Object obj, amz amz)
    {
        if (obj == null)
        {
            ann1.a();
            return null;
        }
        long l1 = bac.a();
        obj = a(obj, amz, a.b(obj.getClass()));
        if (Log.isLoggable("DecodeJob", 2))
        {
            amz = String.valueOf(obj);
            a((new StringBuilder(String.valueOf(amz).length() + 15)).append("Decoded result ").append(amz).toString(), l1, ((String) (null)));
        }
        ann1.a();
        return ((aqa) (obj));
        obj;
        ann1.a();
        throw obj;
    }

    private aqa a(Object obj, amz amz, apx apx1)
    {
        obj = d.b.d.a(obj);
        amz = apx1.a(((anp) (obj)), k, h, i, new aos(this, amz));
        ((anp) (obj)).b();
        return amz;
        amz;
        ((anp) (obj)).b();
        throw amz;
    }

    private void a(String s1, long l1, String s2)
    {
        double d1 = bac.a(l1);
        String s3 = String.valueOf(g);
        if (s2 != null)
        {
            s2 = String.valueOf(s2);
            String s4;
            if (s2.length() != 0)
            {
                s2 = ", ".concat(s2);
            } else
            {
                s2 = new String(", ");
            }
        } else
        {
            s2 = "";
        }
        s4 = String.valueOf(Thread.currentThread().getName());
        (new StringBuilder(String.valueOf(s1).length() + 50 + String.valueOf(s3).length() + String.valueOf(s2).length() + String.valueOf(s4).length())).append(s1).append(" in ").append(d1).append(", load key: ").append(s3).append(s2).append(", thread: ").append(s4);
    }

    static int b(aop aop1)
    {
        return aop1.h;
    }

    static int c(aop aop1)
    {
        return aop1.i;
    }

    static ani d(aop aop1)
    {
        return aop1.k;
    }

    private void d()
    {
        if (c.a())
        {
            a();
        }
    }

    static ane e(aop aop1)
    {
        return aop1.x;
    }

    private aom e()
    {
        switch (aoq.b[u.ordinal()])
        {
        default:
            String s1 = String.valueOf(u);
            throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 20)).append("Unrecognized stage: ").append(s1).toString());

        case 1: // '\001'
            return new aqb(a, this);

        case 2: // '\002'
            return new aok(a, this);

        case 3: // '\003'
            return new aqf(a, this);

        case 4: // '\004'
            return null;
        }
    }

    static apa f(aop aop1)
    {
        return aop1.j;
    }

    private void f()
    {
        boolean flag;
        w = Thread.currentThread();
        v = bac.a();
        flag = false;
_L6:
        boolean flag1 = flag;
        if (p) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        if (o == null) goto _L2; else goto _L3
_L3:
        flag = o.a();
        flag1 = flag;
        if (flag) goto _L2; else goto _L4
_L4:
        u = a(u);
        o = e();
        if (u != aox.d) goto _L6; else goto _L5
_L5:
        c();
_L8:
        return;
_L2:
        if ((u == aox.f || p) && !flag1)
        {
            g();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static ane g(aop aop1)
    {
        return aop1.e;
    }

    private void g()
    {
        h();
        apv apv1 = new apv("Failed to load resource", new ArrayList(q));
        l.a(apv1);
        if (c.b())
        {
            a();
        }
    }

    static aot h(aop aop1)
    {
        return aop1.t;
    }

    private void h()
    {
        r.b();
        if (C)
        {
            throw new IllegalStateException("Already notified");
        } else
        {
            C = true;
            return;
        }
    }

    private void i()
    {
        apy apy1;
        apy1 = null;
        if (Log.isLoggable("DecodeJob", 2))
        {
            long l1 = v;
            String s1 = String.valueOf(z);
            String s2 = String.valueOf(x);
            String s3 = String.valueOf(B);
            a("Retrieved data", l1, (new StringBuilder(String.valueOf(s1).length() + 30 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("data: ").append(s1).append(", cache key: ").append(s2).append(", fetcher: ").append(s3).toString());
        }
        aqa aqa;
        Object obj;
        amz amz;
        try
        {
            aqa = a(B, z, A);
        }
        catch (apv apv1)
        {
            apv1.a(y, A, null);
            q.add(apv1);
            apv1 = null;
        }
        if (aqa == null)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        amz = A;
        obj = aqa;
        if (t.a())
        {
            apy1 = apy.a(aqa);
            obj = apy1;
        }
        h();
        l.a(((aqa) (obj)), amz);
        u = aox.e;
        if (t.a())
        {
            t.a(b, k);
        }
        if (apy1 != null)
        {
            apy1.e();
        }
        d();
        return;
        Exception exception;
        exception;
        if (apy1 != null)
        {
            apy1.e();
        }
        d();
        throw exception;
        f();
        return;
    }

    public aox a(aox aox1)
    {
        do
        {
            switch (aoq.b[aox1.ordinal()])
            {
            default:
                aox1 = String.valueOf(aox1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(aox1).length() + 20)).append("Unrecognized stage: ").append(aox1).toString());

            case 5: // '\005'
                if (j.a())
                {
                    return aox.b;
                }
                aox1 = aox.b;
                break;

            case 1: // '\001'
                if (j.b())
                {
                    return aox.c;
                }
                aox1 = aox.c;
                break;

            case 2: // '\002'
                return aox.d;

            case 3: // '\003'
            case 4: // '\004'
                return aox.f;
            }
        } while (true);
    }

    void a()
    {
        c.c();
        Object obj = t;
        obj.a = null;
        obj.b = null;
        obj.c = null;
        obj = a;
        obj.c = null;
        obj.d = null;
        obj.n = null;
        obj.g = null;
        obj.k = null;
        obj.i = null;
        obj.o = null;
        obj.j = null;
        obj.p = null;
        ((aoo) (obj)).a.clear();
        obj.l = false;
        ((aoo) (obj)).b.clear();
        obj.m = false;
        C = false;
        d = null;
        e = null;
        k = null;
        f = null;
        g = null;
        l = null;
        u = null;
        o = null;
        w = null;
        x = null;
        z = null;
        A = null;
        B = null;
        v = 0L;
        p = false;
        q.clear();
        s.a(this);
    }

    public final void a(ane ane, Exception exception, ann ann1, amz amz)
    {
        exception = new apv("Fetching data failed", exception);
        exception.a(ane, amz, ann1.d());
        q.add(exception);
        if (Thread.currentThread() != w)
        {
            n = aow.b;
            l.a(this);
            return;
        } else
        {
            f();
            return;
        }
    }

    public final void a(ane ane, Object obj, ann ann1, amz amz, ane ane1)
    {
        x = ane;
        z = obj;
        B = ann1;
        A = amz;
        y = ane1;
        if (Thread.currentThread() != w)
        {
            n = aow.c;
            l.a(this);
            return;
        } else
        {
            i();
            return;
        }
    }

    public final void c()
    {
        n = aow.b;
        l.a(this);
    }

    public final int compareTo(Object obj)
    {
        obj = (aop)obj;
        int j1 = f.ordinal() - ((aop) (obj)).f.ordinal();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = m - ((aop) (obj)).m;
        }
        return i1;
    }

    public final baq q_()
    {
        return r;
    }

    public final void run()
    {
        if (p)
        {
            g();
            return;
        }
        aoq.a[n.ordinal()];
        JVM INSTR tableswitch 1 3: default 227
    //                   1 193
    //                   2 217
    //                   3 222;
           goto _L1 _L2 _L3 _L4
_L1:
        RuntimeException runtimeexception;
        String s2;
        String s3;
        boolean flag;
        String s1 = String.valueOf(n);
        throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 25)).append("Unrecognized run reason: ").append(s1).toString());
_L2:
        try
        {
            u = a(aox.a);
            o = e();
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("DecodeJob", 3))
            {
                s2 = String.valueOf("DecodeJob threw unexpectedly, isCancelled: ");
                flag = p;
                s3 = String.valueOf(u);
                (new StringBuilder(String.valueOf(s2).length() + 14 + String.valueOf(s3).length())).append(s2).append(flag).append(", stage: ").append(s3);
            }
            if (u != aox.e)
            {
                g();
            }
            if (!p)
            {
                throw runtimeexception;
            }
        }
        break; /* Loop/switch isn't completed */
_L3:
        f();
        return;
_L4:
        i();
    }
}
