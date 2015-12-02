// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.view.View;
import com.nineoldandroids.b.a.a;
import com.nineoldandroids.util.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.nineoldandroids.a:
//            o, l, m

public final class k extends o
{

    private static final Map h;
    private Object i;
    private String j;
    private c k;

    public k()
    {
    }

    private k(Object obj, c c1)
    {
        i = obj;
        a(c1);
    }

    private k(Object obj, String s)
    {
        i = obj;
        a(s);
    }

    public static transient k a(Object obj, c c1, float af[])
    {
        obj = new k(obj, c1);
        ((k) (obj)).a(af);
        return ((k) (obj));
    }

    public static transient k a(Object obj, c c1, int ai[])
    {
        obj = new k(obj, c1);
        ((k) (obj)).a(ai);
        return ((k) (obj));
    }

    public static transient k a(Object obj, String s, float af[])
    {
        obj = new k(obj, s);
        ((k) (obj)).a(af);
        return ((k) (obj));
    }

    public static transient k a(Object obj, String s, int ai[])
    {
        obj = new k(obj, s);
        ((k) (obj)).a(ai);
        return ((k) (obj));
    }

    public static transient k a(Object obj, m am[])
    {
        k k1 = new k();
        k1.i = obj;
        k1.b(am);
        return k1;
    }

    public void a()
    {
        super.a();
    }

    void a(float f)
    {
        super.a(f);
        int j1 = this.f.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return;
            }
            this.f[i1].b(i);
            i1++;
        } while (true);
    }

    public void a(c c1)
    {
        if (f != null)
        {
            m m1 = f[0];
            String s = m1.c();
            m1.a(c1);
            g.remove(s);
            g.put(j, m1);
        }
        if (k != null)
        {
            j = c1.a();
        }
        k = c1;
        e = false;
    }

    public void a(String s)
    {
        if (f != null)
        {
            m m1 = f[0];
            String s1 = m1.c();
            m1.a(s);
            g.remove(s1);
            g.put(s, m1);
        }
        j = s;
        e = false;
    }

    public transient void a(float af[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                b(new m[] {
                    com.nineoldandroids.a.m.a(k, af)
                });
                return;
            } else
            {
                b(new m[] {
                    com.nineoldandroids.a.m.a(j, af)
                });
                return;
            }
        } else
        {
            super.a(af);
            return;
        }
    }

    public transient void a(int ai[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                b(new m[] {
                    com.nineoldandroids.a.m.a(k, ai)
                });
                return;
            } else
            {
                b(new m[] {
                    com.nineoldandroids.a.m.a(j, ai)
                });
                return;
            }
        } else
        {
            super.a(ai);
            return;
        }
    }

    public k c(long l1)
    {
        super.d(l1);
        return this;
    }

    public o d(long l1)
    {
        return c(l1);
    }

    void i()
    {
        if (e) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        if (k == null && a.a && (i instanceof View) && h.containsKey(j))
        {
            a((c)h.get(j));
        }
        j1 = f.length;
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        super.i();
_L2:
        return;
_L4:
        f[i1].a(i);
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object j()
    {
        return i;
    }

    public k k()
    {
        return (k)super.l();
    }

    public o l()
    {
        return k();
    }

    public String toString()
    {
        String s;
        String s1;
        s = (new StringBuilder("ObjectAnimator@")).append(Integer.toHexString(hashCode())).append(", target ").append(i).toString();
        s1 = s;
        if (f == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 < f.length) goto _L4; else goto _L3
_L3:
        s1 = s;
_L2:
        return s1;
_L4:
        s = (new StringBuilder(String.valueOf(s))).append("\n    ").append(f[i1].toString()).toString();
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        h = new HashMap();
        h.put("alpha", com.nineoldandroids.a.l.a);
        h.put("pivotX", l.b);
        h.put("pivotY", com.nineoldandroids.a.l.c);
        h.put("translationX", l.d);
        h.put("translationY", l.e);
        h.put("rotation", l.f);
        h.put("rotationX", l.g);
        h.put("rotationY", l.h);
        h.put("scaleX", l.i);
        h.put("scaleY", l.j);
        h.put("scrollX", l.k);
        h.put("scrollY", l.l);
        h.put("x", l.m);
        h.put("y", l.n);
    }
}
