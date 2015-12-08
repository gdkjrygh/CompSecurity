// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import com.pandora.radio.data.af;
import com.pandora.radio.data.f;
import com.pandora.radio.data.q;
import com.pandora.radio.util.g;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.HashMap;
import p.cw.c;
import p.dd.an;
import p.df.a;

// Referenced classes of package p.cx:
//            ad, t, a, s

public class b extends Thread
{
    private static class a
    {

        public int a;
        public String b;
        public boolean c;

        public String toString()
        {
            return (new StringBuilder()).append("AndoResponse{intervalSeconds=").append(a).append(", guid='").append(b).append('\'').append(", valid=").append(c).append('}').toString();
        }

        private a(String s1)
        {
            c = false;
            if (s1 == null || s1.indexOf(',') == -1)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            s1 = s1.split(",");
            a = Integer.parseInt(s1[0]);
            if (s1.length > 1 && s1[1].length() > 0)
            {
                b = s1[1];
                c = true;
            }
            return;
            s1;
        }

    }


    protected int a;
    protected long b;
    protected ad c;
    private c d;
    private af e;
    private q f;
    private boolean g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private boolean l;

    public b(c c1)
    {
        a = 60;
        d = c1;
        c1.b(this);
        i = false;
        setName(getClass().getSimpleName());
        d();
    }

    private void a(String s1)
    {
        p.df.a.c("AndoService", (new StringBuilder()).append("ANDO - ").append(s1).toString());
    }

    private void a(String s1, Throwable throwable)
    {
        p.df.a.c("AndoService", (new StringBuilder()).append("ANDO - ").append(s1).toString(), throwable);
    }

    private boolean b(af af1)
    {
        boolean flag;
        if (c != null && c.a(af1.d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return false;
        }
        int i1;
        if (c == null)
        {
            i1 = 5;
        } else
        {
            i1 = c.a();
        }
        if (!com.pandora.radio.util.i.e())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        af1 = af1.d();
        if (com.pandora.radio.util.i.a(af1))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (Integer.parseInt(af1) % 100 < i1)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        p.df.a.c("AndoService", "stats: skipping ando stats ping for user id '%s' as they are not in the test demographics.", new Object[] {
            af1
        });
        return true;
        af1;
        return false;
    }

    private void g()
        throws Exception
    {
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = true;
        k = e.d();
        if (!i()) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        hashmap = j();
        hashmap.put("sid", "9718");
        if (f != null)
        {
            String s1 = f.d();
            if (!com.pandora.radio.util.i.a(s1))
            {
                hashmap.put("devcat", s1);
            }
            s1 = f.e();
            if (!com.pandora.radio.util.i.a(s1))
            {
                hashmap.put("devtype", s1);
            }
        }
        Object obj;
        boolean flag;
        boolean flag1;
        if (e.a())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        hashmap.put("hasads", obj);
        obj = d.p().a(h(), hashmap, 0x7fffffff);
        obj = d.p().a(((String) (obj)), p.cx.t.a.a);
        obj = new a(((String) (obj)));
        a((new StringBuilder()).append("Ando Login Response, listener id: ").append(k).append(" : ").append(obj).toString());
        flag = ((a) (obj)).c;
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        j = ((a) (obj)).b;
        a = ((a) (obj)).a;
        l = false;
        flag1 = flag;
_L3:
        Object obj1;
        if (!flag1)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        a(flag, "newSession");
        return;
        obj1;
        a(true, "newSession");
        throw obj1;
        obj1;
        flag = false;
_L4:
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        a(flag, "newSession");
        throw obj1;
_L2:
        flag1 = true;
          goto _L3
        obj1;
          goto _L4
    }

    private String h()
    {
        if (c != null)
        {
            return c.c();
        } else
        {
            return "http://lt.andomedia.com/lt";
        }
    }

    private boolean i()
    {
        return c != null && c.b();
    }

    private HashMap j()
    {
        String s1 = com.pandora.radio.util.g.a(e.d());
        HashMap hashmap = new HashMap();
        hashmap.put("dev", d.l().c());
        hashmap.put("vid", s1);
        hashmap.put("gender", e.u());
        hashmap.put("yob", String.valueOf(e.t()));
        hashmap.put("zip", e.m());
        hashmap.put("cb", String.valueOf((double)System.currentTimeMillis() + Math.random()));
        return hashmap;
    }

    private void k()
        throws Exception
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        Object obj;
        boolean flag;
        if (!i())
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = new HashMap();
        ((HashMap) (obj)).put("guid", j);
        ((HashMap) (obj)).put("cb", String.valueOf((double)System.currentTimeMillis() + Math.random()));
        obj = d.p().a(h(), ((HashMap) (obj)), 0x7fffffff);
        obj = new a(d.p().a(((String) (obj)), p.cx.t.a.a));
        a((new StringBuilder()).append("Ando Ping Response: ").append(obj).toString());
        flag = ((a) (obj)).c;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        a = ((a) (obj)).a;
        b = System.currentTimeMillis();
_L1:
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(flag, "ping");
        return;
        flag = true;
          goto _L1
        Exception exception;
        exception;
        flag = false;
_L3:
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        a(flag, "ping");
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void a(af af1)
    {
        e = af1;
        j = null;
        if (!l)
        {
            a(false, "endSession");
            l = true;
        }
    }

    protected void a(boolean flag, String s1)
    {
        for (s1 = new p.cx.a(flag, j, s1); b(e) || s1.d();)
        {
            return;
        }

        d.o().a(s1);
    }

    public boolean a()
    {
        return g;
    }

    public String b()
    {
        return k;
    }

    protected boolean c()
    {
        return h;
    }

    public void d()
    {
        h = true;
    }

    public void e()
    {
        h = false;
        g = false;
        interrupt();
        d.c(this);
        return;
        Exception exception;
        exception;
        d.c(this);
        throw exception;
    }

    public void f()
        throws Exception
    {
        if (b > 0L && System.currentTimeMillis() - b > 0x2bf20L)
        {
            a("Ando, Pause timeout exceeded");
            a(e);
        }
        if (j == null)
        {
            g();
        }
        k();
    }

    public void onCastingStateRadioEvent(p.dd.k k1)
    {
        i = k1.a;
    }

    public void onSignInState(an an1)
    {
        e = an1.a;
        f = an1.c;
        static class _cls1
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
                    a[e.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.a.b.ordinal()] = 4;
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

        case 4: // '\004'
            if (p.cx.s.a.a("tritonRollout", false))
            {
                c = (ad)p.cx.s.a.a("tritonRollout");
            }
            c = new ad(c);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void run()
    {
        g = true;
_L3:
        if (!c()) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (!d.d().m())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = i;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        f();
_L4:
        Object obj;
        try
        {
            Thread.sleep(a * 1000);
        }
        catch (InterruptedException interruptedexception)
        {
            a("Interrupted", interruptedexception);
        }
        catch (p.cw.e.d d1)
        {
            a("Radio is down, finishing.", d1);
            return;
        }
        if (true) goto _L3; else goto _L2
        obj;
        a = 3;
        a("Error on Ando call", ((Throwable) (obj)));
          goto _L4
        obj;
        p.df.a.a("AndoService", ((p.cw.e.d) (obj)).getStackTrace().toString());
        h = false;
_L2:
        g = false;
        return;
        a = 1;
          goto _L4
    }
}
