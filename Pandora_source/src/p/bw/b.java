// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bw;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.countdown.a;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.y;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import p.cw.c;
import p.cx.p;
import p.dd.an;
import p.dd.at;
import p.dd.bo;
import p.dd.bq;
import p.di.r;

public class b
{
    private class a
    {

        final b a;

        public void onSignInState(an an1)
        {
            static class _cls3
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
                        a[p.cx.e.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.cx.e.a.b.ordinal()] = 3;
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

            switch (p.bw._cls3.a[an1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

            case 3: // '\003'
                if (an1.a != null)
                {
                    an1 = p.bw.b.c(a).b().k().J();
                    a.a(an1);
                }
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                return;

            case 4: // '\004'
                a.b();
                a.c();
                p.bw.b.a(a, null);
                p.bw.b.a(a, null);
                p.bw.b.a(a, false);
                return;
            }
        }

        public void onStationData(at at1)
        {
            boolean flag1 = b.d(a);
            b b1 = a;
            boolean flag;
            if (at1.a != null && at1.a.A())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.b(b1, flag);
            if (flag1 != b.d(a) && b.e(a) != null)
            {
                at1 = p.bw.b.c(a).b().k().J();
                b.b(a, at1);
            }
        }

        public void onUserData(bo bo1)
        {
            if (bo1.a == null)
            {
                return;
            } else
            {
                bo1 = p.bw.b.c(a).b().k().J();
                p.df.a.a("ValueExchangeManager", (new StringBuilder()).append("SubscribeWrapper: onUserData valueExchangeRewardData: ").append(bo1).toString());
                a.a(bo1);
                return;
            }
        }

        public void onValueExchangeReward(bq bq)
        {
            p.df.a.a("ValueExchangeManager", (new StringBuilder()).append("onValueExchangeReward: ").append(bq).toString());
            bq = p.bw.b.c(a).b().k().J();
            p.df.a.a("ValueExchangeManager", (new StringBuilder()).append("SubscribeWrapper->onValueExchangeReward valueExchangeRewardData: ").append(bq).toString());
            a.a(bq);
        }

        private a()
        {
            a = b.this;
            super();
        }

    }


    private com.pandora.android.provider.b a;
    private boolean b;
    private aj c;
    private boolean d;
    private Handler e;
    private a f;
    private com.pandora.android.countdown.a g;
    private boolean h;
    private Runnable i;

    public b(com.pandora.android.provider.b b1)
    {
        b = false;
        d = false;
        g = null;
        h = false;
        i = new Runnable() {

            final b a;

            public void run()
            {
                p.bw.b.a(a, (new StringBuilder()).append("ValueExchangeManager valueExchangeTimer expired, isActive = ").append(p.bw.b.a(a)).append(", rewardData = ").append(b.b(a)).toString());
                if (p.bw.b.a(a) && b.b(a) != null)
                {
                    a.d();
                }
                a.b();
            }

            
            {
                a = b.this;
                super();
            }
        };
        a = b1;
        e = new Handler(Looper.getMainLooper());
        f = new a();
        b1.b().b(f);
    }

    static com.pandora.android.countdown.a a(b b1, com.pandora.android.countdown.a a1)
    {
        b1.g = a1;
        return a1;
    }

    static aj a(b b1, aj aj1)
    {
        b1.c = aj1;
        return aj1;
    }

    static void a(b b1, String s1)
    {
        b1.b(s1);
    }

    static boolean a(b b1)
    {
        return b1.b;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.b = flag;
        return flag;
    }

    static aj b(b b1)
    {
        return b1.c;
    }

    private void b(aj aj1)
    {
        if (aj1 == null)
        {
            return;
        }
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        boolean flag;
        if (h)
        {
            obj = "displayText";
        } else
        {
            obj = "displayTextByBrand";
        }
        obj2 = aj1.a(((String) (obj)));
        if (h)
        {
            obj = "";
        } else
        {
            obj = aj1.a("brandName");
        }
        s1 = aj1.b("offerButtonLabel", a(0x7f080132));
        obj1 = aj1.a("offerButtonUrl");
        if (!h && !a(((String) (obj1))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = new com.pandora.android.countdown.CountdownBarLayout.a(aj1, ((String) (obj1))) {

            final aj a;
            final String b;
            final b c;

            public void a()
            {
                com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.o.c, a);
            }

            public void b()
            {
                c.c();
            }

            public void c()
            {
                PandoraIntent pandoraintent = new PandoraIntent("launch_pandora_browser");
                pandoraintent.putExtra("intent_uri", b);
                com.pandora.android.provider.b.a.C().a(pandoraintent);
                com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.o.d, a);
            }

            public void d()
            {
            }

            
            {
                c = b.this;
                a = aj1;
                b = s1;
                super();
            }
        };
        obj2 = new com.pandora.android.countdown.c(obj2, obj, s1, flag, true);
        obj = aj1.a("displayTextEndRewardLine1");
        s1 = aj1.a("displayTextEndRewardLine2");
        if (!com.pandora.radio.util.i.a(((String) (obj))) || !com.pandora.radio.util.i.a(s1))
        {
            obj = new com.pandora.android.countdown.c(obj, s1, null, false, true);
        } else
        {
            obj = null;
        }
        g = new com.pandora.android.countdown.a(aj1.c(), ((com.pandora.android.countdown.c) (obj2)), ((com.pandora.android.countdown.c) (obj)), aj1.f(), aj1.a(), ((com.pandora.android.countdown.CountdownBarLayout.a) (obj1)));
        aj1 = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.a.b, g);
        a.e().a(aj1);
    }

    private void b(String s1)
    {
        p.df.a.a("ValueExchangeManager", (new StringBuilder()).append("VEX ").append(s1).toString());
    }

    static void b(b b1, aj aj1)
    {
        b1.b(aj1);
    }

    static boolean b(b b1, boolean flag)
    {
        b1.h = flag;
        return flag;
    }

    static com.pandora.android.provider.b c(b b1)
    {
        return b1.a;
    }

    static boolean d(b b1)
    {
        return b1.h;
    }

    static com.pandora.android.countdown.a e(b b1)
    {
        return b1.g;
    }

    private void e()
    {
        (new r()).execute(new Object[] {
            a.b()
        });
    }

    protected String a(int j)
    {
        return a.h().getString(j);
    }

    protected void a()
        throws IllegalStateException
    {
        b("ValueExchangeManager.startValueExchangeTimer");
        b();
        c = a.b().k().J();
        if (c == null)
        {
            throw new IllegalStateException("No active reward, value exchange timer cannot start");
        } else
        {
            long l = c.d();
            b((new StringBuilder()).append("ValueExchangeManager.startValueExchangeTimer, secondsRemaining = ").append(l).toString());
            b = true;
            d = true;
            e.postDelayed(i, 1000L * l);
            b((new StringBuilder()).append("timer started - seconds remaining:").append(l).toString());
            return;
        }
    }

    protected void a(aj aj1)
    {
        p.df.a.a("ValueExchangeManager", (new StringBuilder()).append("handleValueExchangeReward: ").append(aj1).toString());
        if (aj1 == null)
        {
            if (c != null)
            {
                i.run();
            }
            return;
        } else
        {
            a();
            b(aj1);
            return;
        }
    }

    protected boolean a(String s1)
    {
        return s.a(s1);
    }

    protected void b()
    {
        b = false;
        e.removeCallbacksAndMessages(null);
        c();
    }

    protected void c()
    {
        d = false;
    }

    protected void d()
    {
        b = false;
        a.b().o().a(com.pandora.radio.util.k.o.a, c);
        if (g.f() == null)
        {
            com.pandora.android.countdown.b b1 = new com.pandora.android.countdown.b(com.pandora.android.countdown.a.a.c, g);
            a.e().a(b1);
        }
        a.b().z().a();
        e();
        c = null;
    }
}
