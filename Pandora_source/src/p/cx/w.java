// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.pandora.radio.data.o;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.l;
import java.security.InvalidParameterException;
import p.cw.c;
import p.dd.ag;
import p.df.a;

// Referenced classes of package p.cx:
//            v, g

public class w
{

    private final v a = new v();
    private final android.os.PowerManager.WakeLock b;
    private final android.os.PowerManager.WakeLock c;
    private final android.net.wifi.WifiManager.WifiLock d;
    private final c e;

    public w(c c1)
    {
        e = c1;
        c1.b(this);
        android.content.Context context = c1.s();
        d = ((WifiManager)l.a(context, "wifi")).createWifiLock(1, c1.A());
        d.setReferenceCounted(false);
        c1 = (PowerManager)l.a(context, "power");
        c = c1.newWakeLock(1, p/cw/c.getName());
        c.setReferenceCounted(false);
        b = c1.newWakeLock(10, p/cw/c.getName());
        b.setReferenceCounted(false);
    }

    private void a(String s)
    {
        p.df.a.c("PowerManagementService", (new StringBuilder()).append("POWER MANAGEMENT SERVICE - ").append(s).toString());
    }

    static void a(w w1)
    {
        w1.b();
    }

    static c b(w w1)
    {
        return w1.e;
    }

    private void b()
    {
        if (!c.isHeld() && !a.b())
        {
            a("aquire cpu wake lock");
            c.acquire();
        }
    }

    private void c()
    {
        if (!b.isHeld() && !a.b())
        {
            a("aquire screen bright wake lock");
            b.acquire();
        }
    }

    static void c(w w1)
    {
        w1.d();
    }

    private void d()
    {
        if (!d.isHeld() && !a.b())
        {
            a("aquire wifi wake lock");
            d.acquire();
        }
    }

    static void d(w w1)
    {
        w1.c();
    }

    private void e()
    {
        if (c.isHeld())
        {
            a("release cpu wake lock");
            c.release();
        }
    }

    static void e(w w1)
    {
        w1.f();
    }

    private void f()
    {
        if (b.isHeld())
        {
            a("release screen bright wake lock");
            b.release();
        }
    }

    private void g()
    {
        if (d.isHeld())
        {
            a("release wifi wake lock");
            d.release();
        }
    }

    private void h()
    {
        f();
        e();
        g();
    }

    private void i()
    {
        a("stopping");
        a.a();
        h();
    }

    private void j()
    {
        if (a.b())
        {
            a("starting");
            a.a(new v.a() {

                final w a;

                public void a(g g1)
                {
                    if (!g1.b())
                    {
                        p.cx.w.a(a);
                        if (w.b(a).u().c())
                        {
                            p.cx.w.c(a);
                        }
                        if (!g1.b())
                        {
                            if (w.b(a).j().x())
                            {
                                w.d(a);
                                return;
                            } else
                            {
                                w.e(a);
                                return;
                            }
                        }
                    }
                }

            
            {
                a = w.this;
                super();
            }
            }, 0, 3000);
        }
    }

    public void a()
    {
        a("shutdown");
        e.c(this);
        i();
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void onPlayerStateChange(ag ag1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.cw.b.a.values().length];
                try
                {
                    a[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cw.b.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cw.b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cw.b.a.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.cx._cls2.a[ag1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChange called with unknown event state: ").append(ag1.a).toString());

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i();
            // fall through

        case 1: // '\001'
            return;

        case 5: // '\005'
            j();
            break;
        }
    }
}
