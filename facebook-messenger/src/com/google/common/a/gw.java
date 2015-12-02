// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            hp, gv, ik, hm, 
//            jf, gz, ho, hq, 
//            gx, hc, ha, iw, 
//            gy, hh

public class gw
    implements hp, Serializable
{

    private transient hm a;
    private transient hm b;
    private transient jf c;
    private transient Map d;
    private transient Map e;
    private transient Set f;
    private transient jf g;
    private transient List h;
    private transient Map i;

    gw()
    {
        c = gv.h();
        d = ik.a();
        e = ik.a();
    }

    public static gw a()
    {
        return new gw();
    }

    static hm a(gw gw1)
    {
        return gw1.a;
    }

    static hm a(gw gw1, Object obj, Object obj1, hm hm1)
    {
        return gw1.a(obj, obj1, hm1);
    }

    private hm a(Object obj, Object obj1, hm hm1)
    {
        obj1 = new hm(obj, obj1);
        if (a == null)
        {
            b = ((hm) (obj1));
            a = ((hm) (obj1));
            d.put(obj, obj1);
            e.put(obj, obj1);
        } else
        if (hm1 == null)
        {
            b.c = ((hm) (obj1));
            obj1.d = b;
            hm1 = (hm)e.get(obj);
            if (hm1 == null)
            {
                d.put(obj, obj1);
            } else
            {
                hm1.e = ((hm) (obj1));
                obj1.f = hm1;
            }
            e.put(obj, obj1);
            b = ((hm) (obj1));
        } else
        {
            obj1.d = hm1.d;
            obj1.f = hm1.f;
            obj1.c = hm1;
            obj1.e = hm1;
            if (hm1.f == null)
            {
                d.put(obj, obj1);
            } else
            {
                hm1.f.e = ((hm) (obj1));
            }
            if (hm1.d == null)
            {
                a = ((hm) (obj1));
            } else
            {
                hm1.d.c = ((hm) (obj1));
            }
            hm1.d = ((hm) (obj1));
            hm1.f = ((hm) (obj1));
        }
        c.add(obj);
        return ((hm) (obj1));
    }

    static java.util.Map.Entry a(hm hm1)
    {
        return c(hm1);
    }

    static void a(gw gw1, hm hm1)
    {
        gw1.b(hm1);
    }

    static void a(gw gw1, Object obj)
    {
        gw1.g(obj);
    }

    static hm b(gw gw1)
    {
        return gw1.b;
    }

    private void b(hm hm1)
    {
        if (hm1.d != null)
        {
            hm1.d.c = hm1.c;
        } else
        {
            a = hm1.c;
        }
        if (hm1.c != null)
        {
            hm1.c.d = hm1.d;
        } else
        {
            b = hm1.d;
        }
        if (hm1.f != null)
        {
            hm1.f.e = hm1.e;
        } else
        if (hm1.e != null)
        {
            d.put(hm1.a, hm1.e);
        } else
        {
            d.remove(hm1.a);
        }
        if (hm1.e != null)
        {
            hm1.e.f = hm1.f;
        } else
        if (hm1.f != null)
        {
            e.put(hm1.a, hm1.f);
        } else
        {
            e.remove(hm1.a);
        }
        c.remove(hm1.a);
    }

    private static java.util.Map.Entry c(hm hm1)
    {
        return new gz(hm1);
    }

    static Map c(gw gw1)
    {
        return gw1.d;
    }

    static jf d(gw gw1)
    {
        return gw1.c;
    }

    static Map e(gw gw1)
    {
        return gw1.e;
    }

    static void e(Object obj)
    {
        h(obj);
    }

    private void g(Object obj)
    {
        for (obj = new ho(this, obj); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).remove())
        {
            ((Iterator) (obj)).next();
        }

    }

    private static void h(Object obj)
    {
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return;
        }
    }

    private List i(Object obj)
    {
        return Collections.unmodifiableList(hq.a(new ho(this, obj)));
    }

    public List a(Object obj)
    {
        List list = i(obj);
        g(obj);
        return list;
    }

    public boolean a(Object obj, Object obj1)
    {
        a(obj, obj1, null);
        return true;
    }

    public List b(Object obj)
    {
        return new gx(this, obj);
    }

    public Map b()
    {
        Map map = i;
        Object obj = map;
        if (map == null)
        {
            obj = new hc(this);
            i = ((Map) (obj));
        }
        return ((Map) (obj));
    }

    public boolean b(Object obj, Object obj1)
    {
        for (obj = new ho(this, obj); ((Iterator) (obj)).hasNext();)
        {
            if (Objects.equal(((Iterator) (obj)).next(), obj1))
            {
                return true;
            }
        }

        return false;
    }

    public Collection c(Object obj)
    {
        return b(obj);
    }

    public List c()
    {
        List list = h;
        Object obj = list;
        if (list == null)
        {
            obj = new ha(this);
            h = ((List) (obj));
        }
        return ((List) (obj));
    }

    public boolean c(Object obj, Iterable iterable)
    {
        boolean flag = false;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            flag |= a(obj, iterable.next());
        }

        return flag;
    }

    public boolean c(Object obj, Object obj1)
    {
        for (obj = new ho(this, obj); ((Iterator) (obj)).hasNext();)
        {
            if (Objects.equal(((Iterator) (obj)).next(), obj1))
            {
                ((Iterator) (obj)).remove();
                return true;
            }
        }

        return false;
    }

    public int d()
    {
        return c.size();
    }

    public Collection d(Object obj)
    {
        return a(obj);
    }

    public boolean e()
    {
        return a == null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof iw)
        {
            obj = (iw)obj;
            return b().equals(((iw) (obj)).b());
        } else
        {
            return false;
        }
    }

    public void f()
    {
        a = null;
        b = null;
        c.clear();
        d.clear();
        e.clear();
    }

    public boolean f(Object obj)
    {
        return d.containsKey(obj);
    }

    public Set g()
    {
        Set set = f;
        Object obj = set;
        if (set == null)
        {
            obj = new gy(this);
            f = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public jf h()
    {
        jf jf1 = g;
        Object obj = jf1;
        if (jf1 == null)
        {
            obj = new hh(this, null);
            g = ((jf) (obj));
        }
        return ((jf) (obj));
    }

    public int hashCode()
    {
        return b().hashCode();
    }

    public Collection i()
    {
        return c();
    }

    public String toString()
    {
        return b().toString();
    }
}
