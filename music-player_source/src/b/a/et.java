// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            ev, gx, ex, ey, 
//            fz, gd, ad, x, 
//            ap, df, l, gb, 
//            cn, eh, cb, bu, 
//            r, aj, gn, gv, 
//            gu, go

public class et
    implements fm, Serializable, Cloneable
{

    public static final Map l;
    private static final gs m = new gs("UALogEntry");
    private static final gk n = new gk("client_stats", (byte)12, (short)1);
    private static final gk o = new gk("app_info", (byte)12, (short)2);
    private static final gk p = new gk("device_info", (byte)12, (short)3);
    private static final gk q = new gk("misc_info", (byte)12, (short)4);
    private static final gk r = new gk("activate_msg", (byte)12, (short)5);
    private static final gk s = new gk("instant_msgs", (byte)15, (short)6);
    private static final gk t = new gk("sessions", (byte)15, (short)7);
    private static final gk u = new gk("imprint", (byte)12, (short)8);
    private static final gk v = new gk("id_tracking", (byte)12, (short)9);
    private static final gk w = new gk("active_user", (byte)12, (short)10);
    private static final gk x = new gk("control_policy", (byte)12, (short)11);
    private static final Map y;
    public ad a;
    public x b;
    public ap c;
    public df d;
    public l e;
    public List f;
    public List g;
    public cb h;
    public bu i;
    public r j;
    public aj k;
    private ey z[];

    public et()
    {
        z = (new ey[] {
            ey.e, ey.f, ey.g, ey.h, ey.i, ey.j, ey.k
        });
    }

    static gk A()
    {
        return p;
    }

    static gk B()
    {
        return q;
    }

    static gk C()
    {
        return r;
    }

    static gk D()
    {
        return s;
    }

    static gk E()
    {
        return t;
    }

    static gk F()
    {
        return u;
    }

    static gk G()
    {
        return v;
    }

    static gk H()
    {
        return w;
    }

    static gk I()
    {
        return x;
    }

    public static void a()
    {
    }

    public static void b()
    {
    }

    public static void c()
    {
    }

    public static void d()
    {
    }

    public static void f()
    {
    }

    public static void k()
    {
    }

    public static void n()
    {
    }

    public static void p()
    {
    }

    public static void r()
    {
    }

    public static void t()
    {
    }

    public static void v()
    {
    }

    static gs x()
    {
        return m;
    }

    static gk y()
    {
        return n;
    }

    static gk z()
    {
        return o;
    }

    public final et a(ad ad1)
    {
        a = ad1;
        return this;
    }

    public final et a(aj aj1)
    {
        k = aj1;
        return this;
    }

    public final et a(ap ap1)
    {
        c = ap1;
        return this;
    }

    public final et a(bu bu1)
    {
        i = bu1;
        return this;
    }

    public final et a(cb cb1)
    {
        h = cb1;
        return this;
    }

    public final et a(df df1)
    {
        d = df1;
        return this;
    }

    public final et a(l l1)
    {
        e = l1;
        return this;
    }

    public final et a(r r1)
    {
        j = r1;
        return this;
    }

    public final et a(x x1)
    {
        b = x1;
        return this;
    }

    public final et a(List list)
    {
        g = list;
        return this;
    }

    public final void a(cn cn1)
    {
        if (f == null)
        {
            f = new ArrayList();
        }
        f.add(cn1);
    }

    public final void a(eh eh1)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        g.add(eh1);
    }

    public final void a(gn gn1)
    {
        ((gv)y.get(gn1.s())).a().b(gn1, this);
    }

    public final void b(gn gn1)
    {
        ((gv)y.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean e()
    {
        return e != null;
    }

    public final int g()
    {
        if (f == null)
        {
            return 0;
        } else
        {
            return f.size();
        }
    }

    public final List h()
    {
        return f;
    }

    public final et i()
    {
        f = null;
        return this;
    }

    public final boolean j()
    {
        return f != null;
    }

    public final List l()
    {
        return g;
    }

    public final boolean m()
    {
        return g != null;
    }

    public final boolean o()
    {
        return h != null;
    }

    public final boolean q()
    {
        return i != null;
    }

    public final boolean s()
    {
        return j != null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("UALogEntry(");
        stringbuilder.append("client_stats:");
        if (a == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(a);
        }
        stringbuilder.append(", ");
        stringbuilder.append("app_info:");
        if (b == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(b);
        }
        stringbuilder.append(", ");
        stringbuilder.append("device_info:");
        if (c == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(c);
        }
        stringbuilder.append(", ");
        stringbuilder.append("misc_info:");
        if (d == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(d);
        }
        if (e())
        {
            stringbuilder.append(", ");
            stringbuilder.append("activate_msg:");
            if (e == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(e);
            }
        }
        if (j())
        {
            stringbuilder.append(", ");
            stringbuilder.append("instant_msgs:");
            if (f == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(f);
            }
        }
        if (m())
        {
            stringbuilder.append(", ");
            stringbuilder.append("sessions:");
            if (g == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(g);
            }
        }
        if (o())
        {
            stringbuilder.append(", ");
            stringbuilder.append("imprint:");
            if (h == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(h);
            }
        }
        if (q())
        {
            stringbuilder.append(", ");
            stringbuilder.append("id_tracking:");
            if (i == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(i);
            }
        }
        if (s())
        {
            stringbuilder.append(", ");
            stringbuilder.append("active_user:");
            if (j == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(j);
            }
        }
        if (u())
        {
            stringbuilder.append(", ");
            stringbuilder.append("control_policy:");
            if (k == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(k);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    public final boolean u()
    {
        return k != null;
    }

    public final void w()
    {
        if (a == null)
        {
            throw new go((new StringBuilder("Required field 'client_stats' was not present! Struct: ")).append(toString()).toString());
        }
        if (b == null)
        {
            throw new go((new StringBuilder("Required field 'app_info' was not present! Struct: ")).append(toString()).toString());
        }
        if (c == null)
        {
            throw new go((new StringBuilder("Required field 'device_info' was not present! Struct: ")).append(toString()).toString());
        }
        if (d == null)
        {
            throw new go((new StringBuilder("Required field 'misc_info' was not present! Struct: ")).append(toString()).toString());
        }
        if (a != null)
        {
            ad ad1 = a;
            ad.g();
        }
        if (b != null)
        {
            b.q();
        }
        if (c != null)
        {
            c.I();
        }
        if (d != null)
        {
            df df1 = d;
            df.u();
        }
        if (e != null)
        {
            l l1 = e;
            b.a.l.c();
        }
        if (h != null)
        {
            h.i();
        }
        if (i != null)
        {
            i.g();
        }
        if (j != null)
        {
            j.c();
        }
        if (k != null)
        {
            k.c();
        }
    }

    static 
    {
        Object obj = new HashMap();
        y = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new ev((byte)0));
        y.put(b/a/gx, new ex((byte)0));
        obj = new EnumMap(b/a/ey);
        ((Map) (obj)).put(ey.a, new fz("client_stats", (byte)1, new gd(b/a/ad)));
        ((Map) (obj)).put(ey.b, new fz("app_info", (byte)1, new gd(b/a/x)));
        ((Map) (obj)).put(ey.c, new fz("device_info", (byte)1, new gd(b/a/ap)));
        ((Map) (obj)).put(ey.d, new fz("misc_info", (byte)1, new gd(b/a/df)));
        ((Map) (obj)).put(ey.e, new fz("activate_msg", (byte)2, new gd(b/a/l)));
        ((Map) (obj)).put(ey.f, new fz("instant_msgs", (byte)2, new gb(new gd(b/a/cn))));
        ((Map) (obj)).put(ey.g, new fz("sessions", (byte)2, new gb(new gd(b/a/eh))));
        ((Map) (obj)).put(ey.h, new fz("imprint", (byte)2, new gd(b/a/cb)));
        ((Map) (obj)).put(ey.i, new fz("id_tracking", (byte)2, new gd(b/a/bu)));
        ((Map) (obj)).put(ey.j, new fz("active_user", (byte)2, new gd(b/a/r)));
        ((Map) (obj)).put(ey.k, new fz("control_policy", (byte)2, new gd(b/a/aj)));
        l = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/et, l);
    }
}
