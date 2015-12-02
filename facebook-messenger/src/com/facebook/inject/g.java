// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.facebook.inject.a.b;
import com.facebook.inject.a.c;
import com.facebook.inject.a.e;
import com.facebook.inject.a.f;
import com.google.common.a.ev;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.inject.a;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.inject:
//            e, h, aj, r, 
//            af, ag, au

public class g
    implements com.facebook.inject.e
{

    private final List a = hq.a();
    private final Map b = ik.a();
    private final List c = hq.a();
    private Set d;
    private Set e;
    private Set f;
    private Map g;
    private Map h;

    public g()
    {
    }

    private h e(a a1)
    {
        h h1 = new h();
        h1.a(a1);
        a.add(h1);
        return h1;
    }

    private aj f(a a1)
    {
        aj aj2 = (aj)b.get(a1);
        aj aj1 = aj2;
        if (aj2 == null)
        {
            aj1 = new aj(a1);
            b.put(a1, aj1);
        }
        return aj1;
    }

    private f g(Class class1)
    {
        if (g == null)
        {
            g = ik.a();
        }
        r r1 = new r();
        g.put(class1, r1);
        return new f(r1);
    }

    public com.facebook.inject.a.a a(Class class1)
    {
        return new b(e(com.google.inject.a.a(class1)));
    }

    public c a(a a1)
    {
        return new b(e(a1));
    }

    public e a(ag ag)
    {
        if (ag instanceof af)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Library modules cannot be installed (only required): ").append(ag.getClass()).toString());
        } else
        {
            c.add(ag);
            return g(ag.getClass()).a();
        }
    }

    public List a()
    {
        return a;
    }

    public void a(Class class1, au au)
    {
        if (h == null)
        {
            h = ik.a();
        }
        h.put(class1, au);
    }

    public com.facebook.inject.a.a b(Class class1)
    {
        class1 = e(com.google.inject.a.a(class1));
        class1.a(true);
        return new b(class1);
    }

    public c b(a a1)
    {
        a1 = e(a1);
        a1.a(true);
        return new b(a1);
    }

    public Map b()
    {
        return b;
    }

    public aj c(a a1)
    {
        return f(a1);
    }

    public aj c(Class class1)
    {
        return f(com.google.inject.a.a(class1));
    }

    public Set c()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return fi.d();
        }
    }

    public Set d()
    {
        if (e != null)
        {
            return e;
        } else
        {
            return fi.d();
        }
    }

    public void d(a a1)
    {
        if (d == null)
        {
            d = kl.a();
        }
        d.add(a1);
    }

    public void d(Class class1)
    {
        if (d == null)
        {
            d = kl.a();
        }
        d.add(com.google.inject.a.a(class1));
    }

    public e e(Class class1)
    {
        if (e == null)
        {
            e = kl.a();
        }
        e.add(class1);
        return g(class1).a();
    }

    public Set e()
    {
        if (f != null)
        {
            return f;
        } else
        {
            return fi.d();
        }
    }

    public e f(Class class1)
    {
        if (f == null)
        {
            f = kl.b();
        }
        f.add(class1);
        return g(class1).a();
    }

    public List f()
    {
        return c;
    }

    public Map g()
    {
        if (g == null)
        {
            return ev.j();
        } else
        {
            return g;
        }
    }

    public Map h()
    {
        if (h == null)
        {
            return ev.j();
        } else
        {
            return h;
        }
    }
}
