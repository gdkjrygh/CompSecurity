// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import com.google.common.base.Ticker;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.a:
//            bj, cc, cf, cm, 
//            bn, dd, ic, ct, 
//            ij

class cn extends ReentrantLock
{

    final bj a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final int f;
    final ReferenceQueue g;
    final ReferenceQueue h;
    final Queue i;
    final AtomicInteger j = new AtomicInteger();
    final Queue k;
    final Queue l;

    cn(bj bj1, int i1, int j1)
    {
        Object obj1 = null;
        super();
        a = bj1;
        f = j1;
        a(a(i1));
        Object obj;
        if (bj1.e())
        {
            obj = new ReferenceQueue();
        } else
        {
            obj = null;
        }
        g = ((ReferenceQueue) (obj));
        obj = obj1;
        if (bj1.f())
        {
            obj = new ReferenceQueue();
        }
        h = ((ReferenceQueue) (obj));
        if (bj1.a() || bj1.d())
        {
            obj = new ConcurrentLinkedQueue();
        } else
        {
            obj = bj.i();
        }
        i = ((Queue) (obj));
        if (bj1.a())
        {
            obj = new cc();
        } else
        {
            obj = bj.i();
        }
        k = ((Queue) (obj));
        if (bj1.b())
        {
            bj1 = new cf();
        } else
        {
            bj1 = bj.i();
        }
        l = bj1;
    }

    cm a(cm cm1, cm cm2)
    {
        dd dd1 = cm1.getValueReference();
        cm1 = a.o.copyEntry(this, cm1, cm2);
        cm1.setValueReference(dd1.a(h, cm1));
        return cm1;
    }

    cm a(Object obj, int i1)
    {
        cm cm1;
        if (b == 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        cm1 = b(i1);
_L1:
        Object obj1;
        if (cm1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (cm1.getHash() == i1)
        {
            obj1 = cm1.getKey();
            if (obj1 != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            a();
        }
_L3:
        cm1 = cm1.getNext();
          goto _L1
        if (!a.f.equivalent(obj, obj1)) goto _L3; else goto _L2
_L2:
        return cm1;
        return null;
    }

    cm a(Object obj, int i1, cm cm1)
    {
        return a.o.newEntry(this, obj, i1, cm1);
    }

    Object a(Object obj, int i1, Object obj1)
    {
        lock();
        cm cm2;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        o();
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm2 = (cm)atomicreferencearray.get(j1);
        cm cm1 = cm2;
_L2:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = cm1.getKey();
        if (cm1.getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        dd dd1;
        Object obj3;
        if (!a.f.equivalent(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        dd1 = cm1.getValueReference();
        obj3 = dd1.get();
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (a(dd1))
        {
            int k1 = b;
            c = c + 1;
            a(obj2, i1, obj3, ic.COLLECTED);
            obj = b(cm2, cm1);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
        }
        unlock();
        p();
        return null;
        c = c + 1;
        a(obj, i1, obj3, ic.REPLACED);
        a(cm1, obj1);
        unlock();
        p();
        return obj3;
        cm1 = cm1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        p();
        return null;
        obj;
        unlock();
        p();
        throw obj;
    }

    Object a(Object obj, int i1, Object obj1, boolean flag)
    {
        lock();
        int k1;
        o();
        k1 = b + 1;
        int j1 = k1;
        Object obj3;
        Object obj4;
        if (k1 > d)
        {
            l();
            j1 = b + 1;
        }
        obj4 = e;
        k1 = i1 & ((AtomicReferenceArray) (obj4)).length() - 1;
        obj3 = (cm)((AtomicReferenceArray) (obj4)).get(k1);
        Object obj2 = obj3;
_L5:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        Object obj5 = ((cm) (obj2)).getKey();
        if (((cm) (obj2)).getHash() != i1 || obj5 == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (!a.f.equivalent(obj, obj5))
        {
            break MISSING_BLOCK_LABEL_282;
        }
        obj3 = ((cm) (obj2)).getValueReference();
        obj4 = ((dd) (obj3)).get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        c = c + 1;
        a(((cm) (obj2)), obj1);
        if (((dd) (obj3)).b()) goto _L2; else goto _L1
_L1:
        a(obj, i1, obj4, ic.COLLECTED);
        j1 = b;
_L4:
        b = j1;
        unlock();
        p();
        return null;
_L2:
        if (!k()) goto _L4; else goto _L3
_L3:
        j1 = b + 1;
          goto _L4
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        b(((cm) (obj2)));
        unlock();
        p();
        return obj4;
        c = c + 1;
        a(obj, i1, obj4, ic.REPLACED);
        a(((cm) (obj2)), obj1);
        unlock();
        p();
        return obj4;
        obj2 = ((cm) (obj2)).getNext();
          goto _L5
        c = c + 1;
        obj = a(obj, i1, ((cm) (obj3)));
        a(((cm) (obj)), obj1);
        ((AtomicReferenceArray) (obj4)).set(k1, obj);
        if (!k())
        {
            break MISSING_BLOCK_LABEL_367;
        }
        i1 = b + 1;
_L6:
        b = i1;
        unlock();
        p();
        return null;
        obj;
        unlock();
        p();
        throw obj;
        i1 = j1;
          goto _L6
    }

    AtomicReferenceArray a(int i1)
    {
        return new AtomicReferenceArray(i1);
    }

    void a()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        b();
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    void a(cm cm1)
    {
        if (a.d())
        {
            a(cm1, a.k);
        }
        i.add(cm1);
    }

    void a(cm cm1, long l1)
    {
        cm1.setExpirationTime(a.p.read() + l1);
    }

    void a(cm cm1, ic ic1)
    {
        a(cm1.getKey(), cm1.getHash(), cm1.getValueReference().get(), ic1);
    }

    void a(cm cm1, Object obj)
    {
        cm1.setValueReference(a.i.referenceValue(this, cm1, obj));
        c(cm1);
    }

    void a(Object obj, int i1, Object obj1, ic ic1)
    {
        if (a.m != bj.r)
        {
            obj = new ij(obj, obj1, ic1);
            a.m.offer(obj);
        }
    }

    void a(AtomicReferenceArray atomicreferencearray)
    {
        d = (atomicreferencearray.length() * 3) / 4;
        if (d == f)
        {
            d = d + 1;
        }
        e = atomicreferencearray;
    }

    boolean a(cm cm1, int i1)
    {
        lock();
        cm cm3;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm3 = (cm)atomicreferencearray.get(j1);
        cm cm2 = cm3;
_L2:
        if (cm2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (cm2 != cm1)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        c = c + 1;
        a(cm2.getKey(), i1, cm2.getValueReference().get(), ic.COLLECTED);
        cm1 = b(cm3, cm2);
        i1 = b;
        atomicreferencearray.set(j1, cm1);
        b = i1 - 1;
        unlock();
        p();
        return true;
        cm2 = cm2.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        p();
        return false;
        cm1;
        unlock();
        p();
        throw cm1;
    }

    boolean a(cm cm1, int i1, ic ic1)
    {
        int j1 = b;
        AtomicReferenceArray atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm cm3 = (cm)atomicreferencearray.get(j1);
        for (cm cm2 = cm3; cm2 != null; cm2 = cm2.getNext())
        {
            if (cm2 == cm1)
            {
                c = c + 1;
                a(cm2.getKey(), i1, cm2.getValueReference().get(), ic1);
                cm1 = b(cm3, cm2);
                i1 = b;
                atomicreferencearray.set(j1, cm1);
                b = i1 - 1;
                return true;
            }
        }

        return false;
    }

    boolean a(dd dd1)
    {
        while (dd1.b() || dd1.get() != null) 
        {
            return false;
        }
        return true;
    }

    boolean a(Object obj, int i1, dd dd1)
    {
        lock();
        cm cm2;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm2 = (cm)atomicreferencearray.get(j1);
        cm cm1 = cm2;
_L2:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = cm1.getKey();
        if (cm1.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (!a.f.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (cm1.getValueReference() != dd1)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        c = c + 1;
        a(obj, i1, dd1.get(), ic.COLLECTED);
        obj = b(cm2, cm1);
        i1 = b;
        atomicreferencearray.set(j1, obj);
        b = i1 - 1;
        unlock();
        if (!isHeldByCurrentThread())
        {
            p();
        }
        return true;
        unlock();
        if (!isHeldByCurrentThread())
        {
            p();
        }
        return false;
        cm1 = cm1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        if (!isHeldByCurrentThread())
        {
            p();
        }
        return false;
        obj;
        unlock();
        if (!isHeldByCurrentThread())
        {
            p();
        }
        throw obj;
    }

    boolean a(Object obj, int i1, Object obj1, Object obj2)
    {
        lock();
        cm cm2;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        o();
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm2 = (cm)atomicreferencearray.get(j1);
        cm cm1 = cm2;
_L2:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = cm1.getKey();
        if (cm1.getHash() != i1 || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        dd dd1;
        Object obj4;
        if (!a.f.equivalent(obj, obj3))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        dd1 = cm1.getValueReference();
        obj4 = dd1.get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (a(dd1))
        {
            int k1 = b;
            c = c + 1;
            a(obj3, i1, obj4, ic.COLLECTED);
            obj = b(cm2, cm1);
            i1 = b;
            atomicreferencearray.set(j1, obj);
            b = i1 - 1;
        }
        unlock();
        p();
        return false;
        if (!a.g.equivalent(obj1, obj4))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        c = c + 1;
        a(obj, i1, obj4, ic.REPLACED);
        a(cm1, obj2);
        unlock();
        p();
        return true;
        b(cm1);
        unlock();
        p();
        return false;
        cm1 = cm1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        p();
        return false;
        obj;
        unlock();
        p();
        throw obj;
    }

    cm b(int i1)
    {
        AtomicReferenceArray atomicreferencearray = e;
        return (cm)atomicreferencearray.get(atomicreferencearray.length() - 1 & i1);
    }

    cm b(cm cm1, cm cm2)
    {
        k.remove(cm2);
        l.remove(cm2);
        int i1 = b;
        cm cm3 = cm2.getNext();
        while (cm1 != cm2) 
        {
            if (e(cm1))
            {
                d(cm1);
                i1--;
            } else
            {
                cm3 = a(cm1, cm3);
            }
            cm1 = cm1.getNext();
        }
        b = i1;
        return cm3;
    }

    cm b(Object obj, int i1)
    {
        obj = a(obj, i1);
        if (obj == null)
        {
            return null;
        }
        if (a.b() && a.c(((cm) (obj))))
        {
            i();
            return null;
        } else
        {
            return ((cm) (obj));
        }
    }

    void b()
    {
        if (a.e())
        {
            c();
        }
        if (a.f())
        {
            d();
        }
    }

    void b(cm cm1)
    {
        k.add(cm1);
        if (a.d())
        {
            a(cm1, a.k);
            l.add(cm1);
        }
    }

    boolean b(Object obj, int i1, dd dd1)
    {
        lock();
        cm cm2;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm2 = (cm)atomicreferencearray.get(j1);
        cm cm1 = cm2;
_L2:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = cm1.getKey();
        if (cm1.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (!a.f.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (cm1.getValueReference() != dd1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        atomicreferencearray.set(j1, b(cm2, cm1));
        unlock();
        p();
        return true;
        unlock();
        p();
        return false;
        cm1 = cm1.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        p();
        return false;
        obj;
        unlock();
        p();
        throw obj;
    }

    boolean b(Object obj, int i1, Object obj1)
    {
        lock();
        cm cm2;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        o();
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm2 = (cm)atomicreferencearray.get(j1);
        cm cm1 = cm2;
_L3:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = cm1.getKey();
        if (cm1.getHash() != i1 || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        Object obj3;
        if (!a.f.equivalent(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        obj = cm1.getValueReference();
        obj3 = ((dd) (obj)).get();
        if (!a.g.equivalent(obj1, obj3))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = ic.EXPLICIT;
_L1:
        c = c + 1;
        a(obj2, i1, obj3, ((ic) (obj)));
        obj1 = b(cm2, cm1);
        i1 = b;
        atomicreferencearray.set(j1, obj1);
        b = i1 - 1;
        obj1 = ic.EXPLICIT;
        boolean flag;
        if (obj == obj1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        unlock();
        p();
        return flag;
label0:
        {
            if (!a(((dd) (obj))))
            {
                break label0;
            }
            obj = ic.COLLECTED;
        }
          goto _L1
        unlock();
        p();
        return false;
        cm1 = cm1.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        p();
        return false;
        obj;
        unlock();
        p();
        throw obj;
    }

    Object c(Object obj, int i1)
    {
        obj = b(obj, i1);
        if (obj == null)
        {
            n();
            return null;
        }
        Object obj1 = ((cm) (obj)).getValueReference().get();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        a(((cm) (obj)));
_L4:
        n();
        return obj1;
_L2:
        a();
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        n();
        throw obj;
    }

    void c()
    {
        int i1 = 0;
        do
        {
            Object obj = g.poll();
            if (obj == null)
            {
                break;
            }
            obj = (cm)obj;
            a.a(((cm) (obj)));
            i1++;
        } while (i1 != 16);
    }

    void c(cm cm1)
    {
        h();
        k.add(cm1);
        if (a.b())
        {
            long l1;
            if (a.d())
            {
                l1 = a.k;
            } else
            {
                l1 = a.l;
            }
            a(cm1, l1);
            l.add(cm1);
        }
    }

    void d()
    {
        int i1 = 0;
        do
        {
            Object obj = h.poll();
            if (obj == null)
            {
                break;
            }
            obj = (dd)obj;
            a.a(((dd) (obj)));
            i1++;
        } while (i1 != 16);
    }

    void d(cm cm1)
    {
        a(cm1, ic.COLLECTED);
        k.remove(cm1);
        l.remove(cm1);
    }

    boolean d(Object obj, int i1)
    {
        boolean flag = false;
        if (b == 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = b(obj, i1);
        if (obj == null)
        {
            n();
            return false;
        }
        obj = ((cm) (obj)).getValueReference().get();
        if (obj != null)
        {
            flag = true;
        }
        n();
        return flag;
        n();
        return false;
        obj;
        n();
        throw obj;
    }

    Object e(Object obj, int i1)
    {
        lock();
        cm cm2;
        AtomicReferenceArray atomicreferencearray;
        int j1;
        o();
        j1 = b;
        atomicreferencearray = e;
        j1 = i1 & atomicreferencearray.length() - 1;
        cm2 = (cm)atomicreferencearray.get(j1);
        cm cm1 = cm2;
_L3:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = cm1.getKey();
        if (cm1.getHash() != i1 || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_197;
        }
        Object obj2;
        if (!a.f.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_197;
        }
        obj = cm1.getValueReference();
        obj2 = ((dd) (obj)).get();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj = ic.EXPLICIT;
_L1:
        c = c + 1;
        a(obj1, i1, obj2, ((ic) (obj)));
        obj = b(cm2, cm1);
        i1 = b;
        atomicreferencearray.set(j1, obj);
        b = i1 - 1;
        unlock();
        p();
        return obj2;
label0:
        {
            if (!a(((dd) (obj))))
            {
                break label0;
            }
            obj = ic.COLLECTED;
        }
          goto _L1
        unlock();
        p();
        return null;
        cm1 = cm1.getNext();
        if (true) goto _L3; else goto _L2
_L2:
        unlock();
        p();
        return null;
        obj;
        unlock();
        p();
        throw obj;
    }

    void e()
    {
        if (a.e())
        {
            f();
        }
        if (a.f())
        {
            g();
        }
    }

    boolean e(cm cm1)
    {
        if (cm1.getKey() == null)
        {
            return true;
        } else
        {
            return a(cm1.getValueReference());
        }
    }

    Object f(cm cm1)
    {
        if (cm1.getKey() == null)
        {
            a();
            return null;
        }
        Object obj = cm1.getValueReference().get();
        if (obj == null)
        {
            a();
            return null;
        }
        if (a.b() && a.c(cm1))
        {
            i();
            return null;
        } else
        {
            return obj;
        }
    }

    void f()
    {
        while (g.poll() != null) ;
    }

    void g()
    {
        while (h.poll() != null) ;
    }

    void h()
    {
        do
        {
            cm cm1 = (cm)i.poll();
            if (cm1 == null)
            {
                break;
            }
            if (k.contains(cm1))
            {
                k.add(cm1);
            }
            if (a.d() && l.contains(cm1))
            {
                l.add(cm1);
            }
        } while (true);
    }

    void i()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        j();
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    void j()
    {
        h();
        if (!l.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1 = a.p.read();
        do
        {
            cm cm1 = (cm)l.peek();
            if (cm1 == null || !a.a(cm1, l1))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!a(cm1, cm1.getHash(), ic.EXPIRED))
            {
                throw new AssertionError();
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    boolean k()
    {
        if (a.a() && b >= f)
        {
            h();
            cm cm1 = (cm)k.remove();
            if (!a(cm1, cm1.getHash(), ic.SIZE))
            {
                throw new AssertionError();
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

    void l()
    {
        AtomicReferenceArray atomicreferencearray;
        AtomicReferenceArray atomicreferencearray1;
        int i1;
        int k1;
        int i2;
        int j2;
        atomicreferencearray = e;
        i2 = atomicreferencearray.length();
        if (i2 >= 0x40000000)
        {
            return;
        }
        i1 = b;
        atomicreferencearray1 = a(i2 << 1);
        d = (atomicreferencearray1.length() * 3) / 4;
        j2 = atomicreferencearray1.length() - 1;
        k1 = 0;
_L2:
        cm cm1;
        cm cm3;
        int j1;
        if (k1 >= i2)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        cm3 = (cm)atomicreferencearray.get(k1);
        if (cm3 != null)
        {
            cm1 = cm3.getNext();
            j1 = cm3.getHash() & j2;
            if (cm1 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            atomicreferencearray1.set(j1, cm3);
        }
_L4:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        cm cm2;
        cm2 = cm3;
        for (; cm1 != null; cm1 = cm1.getNext())
        {
            int l1 = cm1.getHash() & j2;
            if (l1 != j1)
            {
                cm2 = cm1;
                j1 = l1;
            }
        }

        atomicreferencearray1.set(j1, cm2);
        j1 = i1;
_L5:
        i1 = j1;
        if (cm3 == cm2) goto _L4; else goto _L3
_L3:
        if (e(cm3))
        {
            d(cm3);
            i1 = j1 - 1;
        } else
        {
            i1 = cm3.getHash() & j2;
            atomicreferencearray1.set(i1, a(cm3, (cm)atomicreferencearray1.get(i1)));
            i1 = j1;
        }
        cm3 = cm3.getNext();
        j1 = i1;
          goto _L5
          goto _L4
        e = atomicreferencearray1;
        b = i1;
        return;
    }

    void m()
    {
        if (b == 0) goto _L2; else goto _L1
_L1:
        lock();
        AtomicReferenceArray atomicreferencearray;
        atomicreferencearray = e;
        if (a.m == bj.r)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        int i1 = 0;
_L7:
        cm cm1;
        if (i1 >= atomicreferencearray.length())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        cm1 = (cm)atomicreferencearray.get(i1);
_L4:
        if (cm1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!cm1.getValueReference().b())
        {
            a(cm1, ic.EXPLICIT);
        }
        cm1 = cm1.getNext();
        if (true) goto _L4; else goto _L3
_L5:
        Exception exception;
        for (; i1 >= atomicreferencearray.length(); i1 = 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }

        atomicreferencearray.set(i1, null);
        i1++;
          goto _L5
        e();
        k.clear();
        l.clear();
        j.set(0);
        c = c + 1;
        b = 0;
        unlock();
        p();
_L2:
        return;
        exception;
        unlock();
        p();
        throw exception;
_L3:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void n()
    {
        if ((j.incrementAndGet() & 0x3f) == 0)
        {
            q();
        }
    }

    void o()
    {
        r();
    }

    void p()
    {
        s();
    }

    void q()
    {
        r();
        s();
    }

    void r()
    {
        if (!tryLock())
        {
            break MISSING_BLOCK_LABEL_27;
        }
        b();
        j();
        j.set(0);
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    void s()
    {
        if (!isHeldByCurrentThread())
        {
            a.j();
        }
    }
}
