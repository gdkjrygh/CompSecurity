// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import p.bz.q;
import p.bz.r;
import p.cw.c;
import p.dd.an;
import p.dd.p;

// Referenced classes of package com.pandora.android.util:
//            s

public class z
{

    static volatile z a;
    private long b;
    private long c;
    private boolean d;
    private Handler e;
    private Runnable f;

    private z()
    {
        b = 0L;
        c = -1L;
        d = false;
        e = new Handler(Looper.getMainLooper());
        f = new Runnable() {

            final z a;

            public void run()
            {
                if (System.currentTimeMillis() >= z.a(a))
                {
                    com.pandora.android.util.z.b(a);
                    b.a.b().o().a("ended", com.pandora.android.util.z.c(a));
                    b.a.e().a(new q());
                    b.a.b().d().b(p.cw.b.c.a);
                } else
                if (z.d(a))
                {
                    z.f(a).postDelayed(z.e(a), 1000L);
                    z.g(a);
                    return;
                }
            }

            
            {
                a = z.this;
                super();
            }
        };
        b.a.b().b(this);
    }

    static long a(z z1)
    {
        return z1.b;
    }

    public static z a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/pandora/android/util/z;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new z();
        }
        com/pandora/android/util/z;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/pandora/android/util/z;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(Context context, long l, boolean flag)
    {
        l /= 1000L;
        if (l == 0L)
        {
            return context.getString(0x7f080249);
        }
        StringBuilder stringbuilder = new StringBuilder(DateUtils.formatElapsedTime(l));
        if (flag)
        {
            stringbuilder.append(context.getString(0x7f08024b));
        }
        return stringbuilder.toString();
    }

    static void b(z z1)
    {
        z1.e();
    }

    static long c(z z1)
    {
        return z1.c;
    }

    private void d()
    {
        b.a.e().a(produceSleepTimerUpdateEvent());
    }

    static boolean d(z z1)
    {
        return z1.d;
    }

    static Runnable e(z z1)
    {
        return z1.f;
    }

    private void e()
    {
        d = false;
        b = 0L;
        c = -1L;
    }

    private long f()
    {
        if (b())
        {
            return b - System.currentTimeMillis();
        } else
        {
            return 0L;
        }
    }

    static Handler f(z z1)
    {
        return z1.e;
    }

    static void g(z z1)
    {
        z1.d();
    }

    public void a(long l)
    {
        if (b())
        {
            c();
        }
        p.cw.b b1 = b.a.b().d();
        if (b1.p())
        {
            b1.a(p.cw.b.c.a);
        }
        d = true;
        c = l;
        b = System.currentTimeMillis() + l;
        b.a.b().o().a("started", c);
        d();
        e.post(f);
    }

    public boolean b()
    {
        return d;
    }

    public void c()
    {
        if (e != null)
        {
            e.removeCallbacks(f);
            b.a.b().o().a("cancelled", c);
            e();
            d();
        }
    }

    public void onSignInState(an an1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            c();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onStationDeleted(p p1)
    {
        y y1 = b.a.b().d().t();
        p1 = p1.a;
        boolean flag;
        if (p1 != null && y1 != null && p1.equals(y1.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && b())
        {
            s.a(0x7f080248);
            c();
        }
    }

    public r produceSleepTimerUpdateEvent()
    {
        return new r(f());
    }
}
