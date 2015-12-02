// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.c.a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.a:
//            bk, bl, hy, bn, 
//            eb, cm, cl, cn, 
//            dd, ct, cb, ij, 
//            ii, ck, de

class bj extends AbstractMap
    implements Serializable, ConcurrentMap
{

    private static final Logger a = Logger.getLogger(com/google/common/a/bj.getName());
    static final dd q = new bk();
    static final Queue r = new bl();
    final transient int b;
    final transient int c;
    final transient cn d[];
    final int e;
    final Equivalence f;
    final Equivalence g;
    final ct h;
    final ct i;
    final int j;
    final long k;
    final long l;
    final Queue m;
    final ii n;
    final transient bn o;
    final Ticker p;
    Set s;
    Collection t;
    Set u;

    bj(hy hy1)
    {
        int j2 = 1;
        boolean flag1 = false;
        boolean flag = false;
        super();
        e = Math.min(hy1.e(), 0x10000);
        h = hy1.g();
        i = hy1.j();
        f = hy1.b();
        g = hy1.c();
        j = hy1.e;
        k = hy1.l();
        l = hy1.k();
        o = bn.getFactory(h, b(), a());
        p = hy1.m();
        n = hy1.a();
        Object obj;
        int i1;
        int j1;
        int k1;
        if (n == eb.INSTANCE)
        {
            obj = i();
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        m = ((Queue) (obj));
        i1 = Math.min(hy1.d(), 0x40000000);
        j1 = i1;
        if (a())
        {
            j1 = Math.min(i1, j);
        }
        i1 = 1;
        k1 = 0;
        for (; i1 < e && (!a() || i1 * 2 <= j); i1 <<= 1)
        {
            k1++;
        }

        c = 32 - k1;
        b = i1 - 1;
        d = d(i1);
        k1 = j1 / i1;
        if (k1 * i1 < j1)
        {
            k1++;
            j1 = j2;
        } else
        {
            j1 = j2;
        }
        for (; j1 < k1; j1 <<= 1) { }
        k1 = ((flag1) ? 1 : 0);
        if (a())
        {
            int i2 = j / i1 + 1;
            j2 = j;
            k1 = ((flag) ? 1 : 0);
            for (int l1 = i2; k1 < d.length; l1 = i2)
            {
                i2 = l1;
                if (k1 == j2 % i1)
                {
                    i2 = l1 - 1;
                }
                d[k1] = a(j1, i2);
                k1++;
            }

        } else
        {
            for (; k1 < d.length; k1++)
            {
                d[k1] = a(j1, -1);
            }

        }
    }

    static void a(cm cm1, cm cm2)
    {
        cm1.setNextExpirable(cm2);
        cm2.setPreviousExpirable(cm1);
    }

    static void b(cm cm1, cm cm2)
    {
        cm1.setNextEvictable(cm2);
        cm2.setPreviousEvictable(cm1);
    }

    static int c(int i1)
    {
        i1 = (i1 << 15 ^ 0xffffcd7d) + i1;
        i1 ^= i1 >>> 10;
        i1 += i1 << 3;
        i1 ^= i1 >>> 6;
        i1 += (i1 << 2) + (i1 << 14);
        return i1 ^ i1 >>> 16;
    }

    static void d(cm cm1)
    {
        cm cm2 = h();
        cm1.setNextExpirable(cm2);
        cm1.setPreviousExpirable(cm2);
    }

    static void e(cm cm1)
    {
        cm cm2 = h();
        cm1.setNextEvictable(cm2);
        cm1.setPreviousEvictable(cm2);
    }

    static dd g()
    {
        return q;
    }

    static cm h()
    {
        return cl.INSTANCE;
    }

    static Queue i()
    {
        return r;
    }

    cn a(int i1, int j1)
    {
        return new cn(this, i1, j1);
    }

    void a(cm cm1)
    {
        int i1 = cm1.getHash();
        b(i1).a(cm1, i1);
    }

    void a(dd dd1)
    {
        cm cm1 = dd1.a();
        int i1 = cm1.getHash();
        b(i1).a(cm1.getKey(), i1, dd1);
    }

    boolean a()
    {
        return j != -1;
    }

    boolean a(cm cm1, long l1)
    {
        return l1 - cm1.getExpirationTime() > 0L;
    }

    int b(Object obj)
    {
        return c(f.hash(obj));
    }

    cn b(int i1)
    {
        return d[i1 >>> c & b];
    }

    Object b(cm cm1)
    {
        Object obj;
        if (cm1.getKey() != null)
        {
            if ((obj = cm1.getValueReference().get()) != null && (!b() || !c(cm1)))
            {
                return obj;
            }
        }
        return null;
    }

    boolean b()
    {
        return c() || d();
    }

    boolean c()
    {
        return l > 0L;
    }

    boolean c(cm cm1)
    {
        return a(cm1, p.read());
    }

    public void clear()
    {
        cn acn[] = d;
        int j1 = acn.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            acn[i1].m();
        }

    }

    public boolean containsKey(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            int i1 = b(obj);
            return b(i1).d(obj, i1);
        }
    }

    public boolean containsValue(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        cn acn[] = d;
        int i1 = 0;
        long l3 = -1L;
        do
        {
            long l2;
label0:
            {
                if (i1 < 3)
                {
                    int i2 = acn.length;
                    l2 = 0L;
                    for (int j1 = 0; j1 < i2; j1++)
                    {
                        cn cn1 = acn[j1];
                        int k1 = cn1.b;
                        AtomicReferenceArray atomicreferencearray = cn1.e;
                        for (int l1 = 0; l1 < atomicreferencearray.length(); l1++)
                        {
                            for (cm cm1 = (cm)atomicreferencearray.get(l1); cm1 != null; cm1 = cm1.getNext())
                            {
                                Object obj1 = cn1.f(cm1);
                                if (obj1 != null && g.equivalent(obj, obj1))
                                {
                                    return true;
                                }
                            }

                        }

                        l2 += cn1.c;
                    }

                    if (l2 != l3)
                    {
                        break label0;
                    }
                }
                return false;
            }
            i1++;
            l3 = l2;
        } while (true);
    }

    boolean d()
    {
        return k > 0L;
    }

    final cn[] d(int i1)
    {
        return new cn[i1];
    }

    boolean e()
    {
        return h != ct.STRONG;
    }

    public Set entrySet()
    {
        Set set = u;
        if (set != null)
        {
            return set;
        } else
        {
            cb cb1 = new cb(this);
            u = cb1;
            return cb1;
        }
    }

    boolean f()
    {
        return i != ct.STRONG;
    }

    public Object get(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i1 = b(obj);
            return b(i1).c(obj, i1);
        }
    }

    public boolean isEmpty()
    {
        cn acn[];
        int i1;
        long l1;
        acn = d;
        i1 = 0;
        l1 = 0L;
_L9:
        if (i1 >= acn.length) goto _L2; else goto _L1
_L1:
        if (acn[i1].b == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l1 += acn[i1].c;
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (l1 == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L6:
        if (i1 >= acn.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (acn[i1].b != 0) goto _L3; else goto _L5
_L5:
        l1 -= acn[i1].c;
        i1++;
          goto _L6
        if (l1 != 0L) goto _L3; else goto _L7
_L7:
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    void j()
    {
        do
        {
            ij ij1 = (ij)m.poll();
            if (ij1 != null)
            {
                try
                {
                    n.onRemoval(ij1);
                }
                catch (Exception exception)
                {
                    a.log(Level.WARNING, "Exception thrown by removal listener", exception);
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public Set keySet()
    {
        Set set = s;
        if (set != null)
        {
            return set;
        } else
        {
            ck ck1 = new ck(this);
            s = ck1;
            return ck1;
        }
    }

    public Object put(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        int i1 = b(obj);
        return b(i1).a(obj, i1, obj1, false);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        int i1 = b(obj);
        return b(i1).a(obj, i1, obj1, true);
    }

    public Object remove(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i1 = b(obj);
            return b(i1).e(obj, i1);
        }
    }

    public boolean remove(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            int i1 = b(obj);
            return b(i1).b(obj, i1, obj1);
        }
    }

    public Object replace(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        int i1 = b(obj);
        return b(i1).a(obj, i1, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        if (obj1 == null)
        {
            return false;
        } else
        {
            int i1 = b(obj);
            return b(i1).a(obj, i1, obj1, obj2);
        }
    }

    public int size()
    {
        cn acn[] = d;
        long l1 = 0L;
        for (int i1 = 0; i1 < acn.length; i1++)
        {
            l1 += acn[i1].b;
        }

        return com.google.common.c.a.b(l1);
    }

    public Collection values()
    {
        Collection collection = t;
        if (collection != null)
        {
            return collection;
        } else
        {
            de de1 = new de(this);
            t = de1;
            return de1;
        }
    }

}
