// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.comscore.utils.o;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ai;
import java.security.InvalidParameterException;
import java.util.Calendar;
import p.aq.k;
import p.cw.c;
import p.dd.an;
import p.dd.bh;
import p.df.a;

// Referenced classes of package p.cx:
//            i

public class j
    implements i
{
    class a
    {

        final j a;

        public void a(c c1)
        {
            c1.c(this);
        }

        public void onCastingState(p.dd.k k1)
        {
            p.cx.j.a(a, k1.a);
            p.cx.j.a(a);
        }

        public void onSignInState(an an1)
        {
            p.cx.j.a(a, an1.a);
            p.cx.j.a(a, an1.b);
            static class _cls1
            {

                static final int a[];
                static final int b[];
                static final int c[];

                static 
                {
                    c = new int[com.pandora.radio.data.ai.b.values().length];
                    try
                    {
                        c[com.pandora.radio.data.ai.b.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        c[com.pandora.radio.data.ai.b.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        c[com.pandora.radio.data.ai.b.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    b = new int[p.dd.bh.a.values().length];
                    try
                    {
                        b[p.dd.bh.a.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        b[p.dd.bh.a.a.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        b[p.dd.bh.a.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        b[p.dd.bh.a.b.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[p.dd.bh.a.e.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    a = new int[p.cx.e.a.values().length];
                    try
                    {
                        a[e.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.cx.e.a.a.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.cx.e.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[e.a.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (p.cx._cls1.a[an1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

            case 1: // '\001'
                p.df.a.a("COMSCORE", "SignInState.SIGNED_IN setting cs_wn label");
                j.b(a);
                // fall through

            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                return;
            }
        }

        public void onTrackState(bh bh1)
        {
            p.cx.j.a(a, bh1.a);
            p.cx.j.a(a);
        }

        public a(c c1)
        {
            a = j.this;
            super();
            c1.b(this);
        }
    }


    protected a a;
    protected boolean b;
    private c c;
    private boolean d;
    private p.dd.bh.a e;
    private boolean f;
    private af g;
    private String h;
    private e.a i;

    public j(c c1)
    {
        e = p.dd.bh.a.a;
        i = p.cx.e.a.a;
        c = c1;
        a = new a(c1);
        d();
    }

    static af a(j j1, af af1)
    {
        j1.g = af1;
        return af1;
    }

    static e.a a(j j1, e.a a1)
    {
        j1.i = a1;
        return a1;
    }

    static p.dd.bh.a a(j j1, p.dd.bh.a a1)
    {
        j1.e = a1;
        return a1;
    }

    static void a(j j1)
    {
        j1.i();
    }

    static boolean a(j j1, boolean flag)
    {
        j1.d = flag;
        return flag;
    }

    static void b(j j1)
    {
        j1.h();
    }

    private void h()
    {
        String s = k();
        if (!s.equals(h))
        {
            p.df.a.a("COMSCORE", "setYearGenderLabel: cs_wn label changed, updating to %s", new Object[] {
                s
            });
            p.aq.k.a("cs_wn", s);
            p.aq.k.e();
            h = s;
        }
    }

    private void i()
    {
        switch (_cls1.b[e.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("updateUxState called with unknown TrackStateRadioEvent state : ").append(e).toString());

        case 1: // '\001'
            if (d)
            {
                f();
                return;
            } else
            {
                g();
                return;
            }

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            f();
            return;
        }
    }

    private boolean j()
    {
        return f;
    }

    private String k()
    {
        return String.format("u%dz%s", new Object[] {
            Integer.valueOf(l()), m()
        });
    }

    private int l()
    {
        return (Calendar.getInstance().get(1) - g.k()) + 1999;
    }

    private String m()
    {
        com.pandora.radio.data.ai.b b1 = ai.b(g.l());
        switch (p.cx._cls1.c[b1.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("getGender called with unknown gender: ").append(b1).toString());

        case 1: // '\001'
            return "0";

        case 2: // '\002'
            return "1";

        case 3: // '\003'
            return "2";
        }
    }

    public void a()
    {
        if (!b)
        {
            p.df.a.a("COMSCORE", "comScore.onEnterForeground()");
            p.aq.k.c();
            b = true;
        }
    }

    protected void a(boolean flag)
    {
        f = flag;
    }

    public void b()
    {
        if (b)
        {
            p.df.a.a("COMSCORE", "comScore.onExitForeground()");
            p.aq.k.d();
            b = false;
        }
    }

    public void c()
    {
        if (i == e.a.b)
        {
            p.df.a.a("COMSCORE", "comScore.settingsChanged()");
            h();
        }
    }

    protected void d()
    {
        p.df.a.a("COMSCORE", "initComscore()");
        p.aq.k.a(c.s());
        p.aq.k.a("6036333");
        p.aq.k.b("36c1be160ddd1adab1a4c3457095b3a9");
        p.aq.k.a(60, false);
        p.aq.k.a("PandoraDuration", c.B());
        p.aq.k.a(o.e);
    }

    public void e()
    {
        a.a(c);
    }

    protected void f()
    {
        if (j())
        {
            p.df.a.a("COMSCORE", "comScore.onUxInactive()");
            p.aq.k.b();
            a(false);
        }
    }

    protected void g()
    {
        if (!j())
        {
            p.df.a.a("COMSCORE", "comScore.onUxActive()");
            p.aq.k.a();
            a(true);
        }
    }
}
