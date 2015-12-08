// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            ar, gx, at, au, 
//            fz, ga, gd, du, 
//            fk, gn, gv, gu

public class ap
    implements fm, Serializable, Cloneable
{

    private static final gk A = new gk("os_version", (byte)11, (short)8);
    private static final gk B = new gk("resolution", (byte)12, (short)9);
    private static final gk C = new gk("is_jailbroken", (byte)2, (short)10);
    private static final gk D = new gk("is_pirated", (byte)2, (short)11);
    private static final gk E = new gk("device_board", (byte)11, (short)12);
    private static final gk F = new gk("device_brand", (byte)11, (short)13);
    private static final gk G = new gk("device_manutime", (byte)10, (short)14);
    private static final gk H = new gk("device_manufacturer", (byte)11, (short)15);
    private static final gk I = new gk("device_manuid", (byte)11, (short)16);
    private static final gk J = new gk("device_name", (byte)11, (short)17);
    private static final Map K;
    public static final Map r;
    private static final gs s = new gs("DeviceInfo");
    private static final gk t = new gk("device_id", (byte)11, (short)1);
    private static final gk u = new gk("idmd5", (byte)11, (short)2);
    private static final gk v = new gk("mac_address", (byte)11, (short)3);
    private static final gk w = new gk("open_udid", (byte)11, (short)4);
    private static final gk x = new gk("model", (byte)11, (short)5);
    private static final gk y = new gk("cpu", (byte)11, (short)6);
    private static final gk z = new gk("os", (byte)11, (short)7);
    private byte L;
    private au M[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public du i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;

    public ap()
    {
        L = 0;
        M = (new au[] {
            au.a, au.b, au.c, au.d, au.e, au.f, au.g, au.h, au.i, au.j, 
            au.k, au.l, au.m, au.n, au.o, au.p, au.q
        });
    }

    public static void D()
    {
    }

    public static void F()
    {
    }

    public static void H()
    {
    }

    static gs J()
    {
        return s;
    }

    static gk K()
    {
        return t;
    }

    static gk L()
    {
        return u;
    }

    static gk M()
    {
        return v;
    }

    static gk N()
    {
        return w;
    }

    static gk O()
    {
        return x;
    }

    static gk P()
    {
        return y;
    }

    static gk Q()
    {
        return z;
    }

    static gk R()
    {
        return A;
    }

    static gk S()
    {
        return B;
    }

    static gk T()
    {
        return C;
    }

    static gk U()
    {
        return D;
    }

    static gk V()
    {
        return E;
    }

    static gk W()
    {
        return F;
    }

    static gk X()
    {
        return G;
    }

    static gk Y()
    {
        return H;
    }

    static gk Z()
    {
        return I;
    }

    static gk aa()
    {
        return J;
    }

    public static void b()
    {
    }

    public static void d()
    {
    }

    public static void f()
    {
    }

    public static void h()
    {
    }

    public static void j()
    {
    }

    public static void l()
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

    public static void x()
    {
    }

    public static void z()
    {
    }

    public final boolean A()
    {
        return fk.a(L, 2);
    }

    public final void B()
    {
        L = (byte)(L | 4);
    }

    public final boolean C()
    {
        return o != null;
    }

    public final boolean E()
    {
        return p != null;
    }

    public final boolean G()
    {
        return q != null;
    }

    public final void I()
    {
        if (i != null)
        {
            du du1 = i;
            du.e();
        }
    }

    public final ap a(long l1)
    {
        n = l1;
        B();
        return this;
    }

    public final ap a(du du1)
    {
        i = du1;
        return this;
    }

    public final ap a(String s1)
    {
        a = s1;
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)K.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return a != null;
    }

    public final ap b(String s1)
    {
        b = s1;
        return this;
    }

    public final void b(gn gn1)
    {
        ((gv)K.get(gn1.s())).a().a(gn1, this);
    }

    public final ap c(String s1)
    {
        c = s1;
        return this;
    }

    public final boolean c()
    {
        return b != null;
    }

    public final ap d(String s1)
    {
        e = s1;
        return this;
    }

    public final ap e(String s1)
    {
        f = s1;
        return this;
    }

    public final boolean e()
    {
        return c != null;
    }

    public final ap f(String s1)
    {
        g = s1;
        return this;
    }

    public final ap g(String s1)
    {
        h = s1;
        return this;
    }

    public final boolean g()
    {
        return d != null;
    }

    public final ap h(String s1)
    {
        l = s1;
        return this;
    }

    public final ap i(String s1)
    {
        m = s1;
        return this;
    }

    public final boolean i()
    {
        return e != null;
    }

    public final ap j(String s1)
    {
        o = s1;
        return this;
    }

    public final ap k(String s1)
    {
        p = s1;
        return this;
    }

    public final boolean k()
    {
        return f != null;
    }

    public final ap l(String s1)
    {
        q = s1;
        return this;
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
        return fk.a(L, 0);
    }

    public final void t()
    {
        L = (byte)(L | 1);
    }

    public String toString()
    {
        boolean flag2 = false;
        StringBuilder stringbuilder = new StringBuilder("DeviceInfo(");
        boolean flag1 = true;
        boolean flag;
        if (a())
        {
            stringbuilder.append("device_id:");
            if (a == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(a);
            }
            flag1 = false;
        }
        flag = flag1;
        if (c())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("idmd5:");
            if (b == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(b);
            }
            flag = false;
        }
        flag1 = flag;
        if (e())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("mac_address:");
            if (c == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(c);
            }
            flag1 = false;
        }
        flag = flag1;
        if (g())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("open_udid:");
            if (d == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(d);
            }
            flag = false;
        }
        flag1 = flag;
        if (i())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("model:");
            if (e == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(e);
            }
            flag1 = false;
        }
        flag = flag1;
        if (k())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("cpu:");
            if (f == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(f);
            }
            flag = false;
        }
        flag1 = flag;
        if (m())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("os:");
            if (g == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(g);
            }
            flag1 = false;
        }
        flag = flag1;
        if (o())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("os_version:");
            if (h == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(h);
            }
            flag = false;
        }
        flag1 = flag;
        if (q())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("resolution:");
            if (i == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(i);
            }
            flag1 = false;
        }
        flag = flag1;
        if (s())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("is_jailbroken:");
            stringbuilder.append(j);
            flag = false;
        }
        flag1 = flag;
        if (u())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("is_pirated:");
            stringbuilder.append(k);
            flag1 = false;
        }
        flag = flag1;
        if (w())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("device_board:");
            if (l == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(l);
            }
            flag = false;
        }
        flag1 = flag;
        if (y())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("device_brand:");
            if (m == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(m);
            }
            flag1 = false;
        }
        flag = flag1;
        if (A())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("device_manutime:");
            stringbuilder.append(n);
            flag = false;
        }
        flag1 = flag;
        if (C())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("device_manufacturer:");
            if (o == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(o);
            }
            flag1 = false;
        }
        if (E())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("device_manuid:");
            if (p == null)
            {
                stringbuilder.append("null");
                flag = flag2;
            } else
            {
                stringbuilder.append(p);
                flag = flag2;
            }
        } else
        {
            flag = flag1;
        }
        if (G())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("device_name:");
            if (q == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(q);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    public final boolean u()
    {
        return fk.a(L, 1);
    }

    public final void v()
    {
        L = (byte)(L | 2);
    }

    public final boolean w()
    {
        return l != null;
    }

    public final boolean y()
    {
        return m != null;
    }

    static 
    {
        Object obj = new HashMap();
        K = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new ar((byte)0));
        K.put(b/a/gx, new at((byte)0));
        obj = new EnumMap(b/a/au);
        ((Map) (obj)).put(au.a, new fz("device_id", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.b, new fz("idmd5", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.c, new fz("mac_address", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.d, new fz("open_udid", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.e, new fz("model", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.f, new fz("cpu", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.g, new fz("os", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.h, new fz("os_version", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.i, new fz("resolution", (byte)2, new gd(b/a/du)));
        ((Map) (obj)).put(au.j, new fz("is_jailbroken", (byte)2, new ga((byte)2)));
        ((Map) (obj)).put(au.k, new fz("is_pirated", (byte)2, new ga((byte)2)));
        ((Map) (obj)).put(au.l, new fz("device_board", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.m, new fz("device_brand", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.n, new fz("device_manutime", (byte)2, new ga((byte)10)));
        ((Map) (obj)).put(au.o, new fz("device_manufacturer", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.p, new fz("device_manuid", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(au.q, new fz("device_name", (byte)2, new ga((byte)11)));
        r = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/ap, r);
    }
}
