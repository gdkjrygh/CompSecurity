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
//            dh, gx, dj, dk, 
//            fz, ga, fy, k, 
//            gn, gv, gu, fk

public class df
    implements fm, Serializable, Cloneable
{

    public static final Map k;
    private static final gs l = new gs("MiscInfo");
    private static final gk m = new gk("time_zone", (byte)8, (short)1);
    private static final gk n = new gk("language", (byte)11, (short)2);
    private static final gk o = new gk("country", (byte)11, (short)3);
    private static final gk p = new gk("latitude", (byte)4, (short)4);
    private static final gk q = new gk("longitude", (byte)4, (short)5);
    private static final gk r = new gk("carrier", (byte)11, (short)6);
    private static final gk s = new gk("latency", (byte)8, (short)7);
    private static final gk t = new gk("display_name", (byte)11, (short)8);
    private static final gk u = new gk("access_type", (byte)8, (short)9);
    private static final gk v = new gk("access_subtype", (byte)11, (short)10);
    private static final Map w;
    public int a;
    public String b;
    public String c;
    public double d;
    public double e;
    public String f;
    public int g;
    public String h;
    public k i;
    public String j;
    private byte x;
    private dk y[];

    public df()
    {
        x = 0;
        y = (new dk[] {
            dk.a, dk.b, dk.c, dk.d, dk.e, dk.f, dk.g, dk.h, dk.i, dk.j
        });
    }

    static gk A()
    {
        return q;
    }

    static gk B()
    {
        return r;
    }

    static gk C()
    {
        return s;
    }

    static gk D()
    {
        return t;
    }

    static gk E()
    {
        return u;
    }

    static gk F()
    {
        return v;
    }

    public static void d()
    {
    }

    public static void f()
    {
    }

    public static void l()
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

    public static void u()
    {
    }

    static gs v()
    {
        return l;
    }

    static gk w()
    {
        return m;
    }

    static gk x()
    {
        return n;
    }

    static gk y()
    {
        return o;
    }

    static gk z()
    {
        return p;
    }

    public final df a(int i1)
    {
        a = i1;
        b();
        return this;
    }

    public final df a(k k1)
    {
        i = k1;
        return this;
    }

    public final df a(String s1)
    {
        b = s1;
        return this;
    }

    public final void a(gn gn1)
    {
        ((gv)w.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return fk.a(x, 0);
    }

    public final df b(String s1)
    {
        c = s1;
        return this;
    }

    public final void b()
    {
        x = (byte)(x | 1);
    }

    public final void b(gn gn1)
    {
        ((gv)w.get(gn1.s())).a().a(gn1, this);
    }

    public final df c(String s1)
    {
        f = s1;
        return this;
    }

    public final boolean c()
    {
        return b != null;
    }

    public final df d(String s1)
    {
        j = s1;
        return this;
    }

    public final boolean e()
    {
        return c != null;
    }

    public final boolean g()
    {
        return fk.a(x, 1);
    }

    public final void h()
    {
        x = (byte)(x | 2);
    }

    public final boolean i()
    {
        return fk.a(x, 2);
    }

    public final void j()
    {
        x = (byte)(x | 4);
    }

    public final boolean k()
    {
        return f != null;
    }

    public final boolean m()
    {
        return fk.a(x, 3);
    }

    public final void n()
    {
        x = (byte)(x | 8);
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
        boolean flag2 = false;
        StringBuilder stringbuilder = new StringBuilder("MiscInfo(");
        boolean flag1 = true;
        if (a())
        {
            stringbuilder.append("time_zone:");
            stringbuilder.append(a);
            flag1 = false;
        }
        boolean flag = flag1;
        if (c())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("language:");
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
            stringbuilder.append("country:");
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
            stringbuilder.append("latitude:");
            stringbuilder.append(d);
            flag = false;
        }
        flag1 = flag;
        if (i())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("longitude:");
            stringbuilder.append(e);
            flag1 = false;
        }
        flag = flag1;
        if (k())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("carrier:");
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
            stringbuilder.append("latency:");
            stringbuilder.append(g);
            flag1 = false;
        }
        flag = flag1;
        if (o())
        {
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("display_name:");
            if (h == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(h);
            }
            flag = false;
        }
        if (q())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("access_type:");
            if (i == null)
            {
                stringbuilder.append("null");
                flag = flag2;
            } else
            {
                stringbuilder.append(i);
                flag = flag2;
            }
        }
        if (s())
        {
            if (!flag)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append("access_subtype:");
            if (j == null)
            {
                stringbuilder.append("null");
            } else
            {
                stringbuilder.append(j);
            }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        w = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new dh((byte)0));
        w.put(b/a/gx, new dj((byte)0));
        obj = new EnumMap(b/a/dk);
        ((Map) (obj)).put(dk.a, new fz("time_zone", (byte)2, new ga((byte)8)));
        ((Map) (obj)).put(dk.b, new fz("language", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(dk.c, new fz("country", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(dk.d, new fz("latitude", (byte)2, new ga((byte)4)));
        ((Map) (obj)).put(dk.e, new fz("longitude", (byte)2, new ga((byte)4)));
        ((Map) (obj)).put(dk.f, new fz("carrier", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(dk.g, new fz("latency", (byte)2, new ga((byte)8)));
        ((Map) (obj)).put(dk.h, new fz("display_name", (byte)2, new ga((byte)11)));
        ((Map) (obj)).put(dk.i, new fz("access_type", (byte)2, new fy(b/a/k)));
        ((Map) (obj)).put(dk.j, new fz("access_subtype", (byte)2, new ga((byte)11)));
        k = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/df, k);
    }
}
