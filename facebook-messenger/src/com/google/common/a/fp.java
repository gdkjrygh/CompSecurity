// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.a:
//            fx, jq, es, kx, 
//            fq, fu, fi, fv, 
//            fy, kh, fr, ft, 
//            ld, kz, fw, gg, 
//            fs, em, mh

public class fp extends fx
    implements SortedMap
{

    private static final Comparator b;
    private static final fp c;
    final transient es a;
    private final transient Comparator d;
    private transient fi e;
    private transient fy f;
    private transient em g;

    fp(es es1, Comparator comparator1)
    {
        a = es1;
        d = comparator1;
    }

    private int a(Object obj, ld ld1, kz kz1)
    {
        return kx.a(m(), Preconditions.checkNotNull(obj), f(), ld1, kz1);
    }

    private fp a(int j, int k)
    {
        if (j < k)
        {
            return new fp(a.a(j, k), d);
        } else
        {
            return a(d);
        }
    }

    private static fp a(Comparator comparator1)
    {
        if (b.equals(comparator1))
        {
            return c;
        } else
        {
            return new fp(es.d(), comparator1);
        }
    }

    static void a(List list, Comparator comparator1)
    {
        c(list, comparator1);
    }

    static void b(List list, Comparator comparator1)
    {
        d(list, comparator1);
    }

    private static void c(List list, Comparator comparator1)
    {
        Collections.sort(list, new fq(comparator1));
    }

    private static void d(List list, Comparator comparator1)
    {
        for (int j = 1; j < list.size(); j++)
        {
            if (comparator1.compare(((java.util.Map.Entry)list.get(j - 1)).getKey(), ((java.util.Map.Entry)list.get(j)).getKey()) == 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate keys in mappings ").append(list.get(j - 1)).append(" and ").append(list.get(j)).toString());
            }
        }

    }

    public static fu e()
    {
        return new fu(jq.b());
    }

    private fi i()
    {
        if (isEmpty())
        {
            return fi.d();
        } else
        {
            return new fv(this);
        }
    }

    private fy l()
    {
        if (isEmpty())
        {
            return fy.a(d);
        } else
        {
            return new kh(new fr(this, a), d);
        }
    }

    private es m()
    {
        return new ft(this, a);
    }

    public fi a()
    {
        fi fi2 = e;
        fi fi1 = fi2;
        if (fi2 == null)
        {
            fi1 = i();
            e = fi1;
        }
        return fi1;
    }

    public fp a(Object obj)
    {
        return a(obj, false);
    }

    fp a(Object obj, boolean flag)
    {
        int j;
        if (flag)
        {
            j = a(obj, ld.ANY_PRESENT, kz.NEXT_LOWER) + 1;
        } else
        {
            j = a(obj, ld.ANY_PRESENT, kz.NEXT_HIGHER);
        }
        return a(0, j);
    }

    fp a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        boolean flag2;
        if (d.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        return b(obj, flag).a(obj1, flag1);
    }

    public fp b(Object obj)
    {
        return b(obj, true);
    }

    fp b(Object obj, boolean flag)
    {
        int j;
        if (flag)
        {
            j = a(obj, ld.ANY_PRESENT, kz.NEXT_HIGHER);
        } else
        {
            j = a(obj, ld.ANY_PRESENT, kz.NEXT_LOWER) + 1;
        }
        return a(j, size());
    }

    public em c()
    {
        em em = g;
        Object obj = em;
        if (em == null)
        {
            obj = new fw(this);
            g = ((em) (obj));
        }
        return ((em) (obj));
    }

    public fp c(Object obj, Object obj1)
    {
        return a(obj, true, obj1, false);
    }

    public Comparator comparator()
    {
        return d;
    }

    public boolean containsValue(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            return gg.a(h(), obj);
        }
    }

    boolean d()
    {
        return a.a();
    }

    public Set entrySet()
    {
        return a();
    }

    Comparator f()
    {
        return d;
    }

    public Object firstKey()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return ((java.util.Map.Entry)a.get(0)).getKey();
        }
    }

    public fy g()
    {
        fy fy2 = f;
        fy fy1 = fy2;
        if (fy2 == null)
        {
            fy1 = l();
            f = fy1;
        }
        return fy1;
    }

    public Object get(Object obj)
    {
        if (obj != null)
        {
            int j;
            try
            {
                j = a(obj, ld.ANY_PRESENT, kz.INVERTED_INSERTION_INDEX);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            if (j >= 0)
            {
                return ((java.util.Map.Entry)a.get(j)).getValue();
            }
        }
        return null;
    }

    mh h()
    {
        return new fs(this, a.h_());
    }

    public SortedMap headMap(Object obj)
    {
        return a(obj);
    }

    public fi i_()
    {
        return g();
    }

    public Set keySet()
    {
        return g();
    }

    public Object lastKey()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        } else
        {
            return ((java.util.Map.Entry)a.get(size() - 1)).getKey();
        }
    }

    public int size()
    {
        return a.size();
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return c(obj, obj1);
    }

    public SortedMap tailMap(Object obj)
    {
        return b(obj);
    }

    public Collection values()
    {
        return c();
    }

    static 
    {
        b = jq.b();
        c = new fp(es.d(), b);
    }
}
