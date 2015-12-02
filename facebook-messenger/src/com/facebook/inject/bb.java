// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.facebook.debug.log.b;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.inject.a;
import com.google.inject.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.inject:
//            a, bd, bc, t, 
//            ab, bi, e, h, 
//            q, i

public class bb extends com.facebook.inject.a
    implements bd
{

    private static boolean a = true;
    private final ab b;
    private final Class c;
    private final ConcurrentMap d;
    private final Object e;
    private ab f;
    private Set g;
    private Set h;

    private bb(ab ab1, Class class1, Set set, ConcurrentMap concurrentmap)
    {
        b = ab1;
        c = class1;
        e = new Object();
        g = set;
        if (concurrentmap == null)
        {
            d = ik.c();
            return;
        } else
        {
            d = concurrentmap;
            return;
        }
    }

    public bb(t t1, Class class1)
    {
        this(((ab) (t1)), class1, null, null);
    }

    private Set c()
    {
label0:
        {
            Set set;
            synchronized (e)
            {
                if (h == null)
                {
                    break label0;
                }
                set = h;
            }
            return set;
        }
        a a1 = com.facebook.inject.t.f(com/facebook/inject/bc, null);
        if (!b.d(a1))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        h = fi.a(b.c(com/facebook/inject/bc));
_L1:
        Set set1 = h;
        obj;
        JVM INSTR monitorexit ;
        return set1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        h = fi.d();
          goto _L1
    }

    private void e(a a1)
    {
        if (!f().contains(a1) && (!a || d.putIfAbsent(a1, Boolean.TRUE) == null && c != com/facebook/inject/bi))
        {
            boolean flag = false;
            for (Iterator iterator = c().iterator(); iterator.hasNext();)
            {
                ((bc)iterator.next()).a(c, a1);
                flag = true;
            }

            if (!flag)
            {
                com.facebook.debug.log.b.b(getClass(), (new StringBuilder()).append("Module ").append(c.getSimpleName()).append(" used undeclared binding ").append(a1).toString());
                return;
            }
        }
    }

    private Set f()
    {
label0:
        {
            Set set;
            synchronized (e)
            {
                if (g == null)
                {
                    break label0;
                }
                set = g;
            }
            return set;
        }
        obj1 = fi.e();
        if (c != com/facebook/inject/bi)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        g = ((fk) (obj1)).b();
        obj1 = g;
        obj;
        JVM INSTR monitorexit ;
        return ((Set) (obj1));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        Iterator iterator = g().iterator();
_L1:
        Object obj2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj2 = (e)iterator.next();
        for (Iterator iterator1 = ((e) (obj2)).c().iterator(); iterator1.hasNext(); ((fk) (obj1)).b((a)iterator1.next())) { }
        for (Iterator iterator2 = ((e) (obj2)).a().iterator(); iterator2.hasNext(); ((fk) (obj1)).b(((h)iterator2.next()).a())) { }
        obj2 = ((e) (obj2)).b().keySet().iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            a a1 = (a)((Iterator) (obj2)).next();
            ((fk) (obj1)).b(f(a1.a().a(), a1.b()));
        }
          goto _L1
        Set set1;
        g = ((fk) (obj1)).b();
        set1 = g;
        obj;
        JVM INSTR monitorexit ;
        return set1;
    }

    private Set g()
    {
        java.util.HashSet hashset = kl.a();
        java.util.LinkedList linkedlist = hq.b();
        e e1 = (e)d().get(c);
        if (e1 == null)
        {
            return hashset;
        }
        linkedlist.add(c);
        linkedlist.addAll(e1.g().keySet());
        do
        {
            Object obj = (Class)linkedlist.poll();
            if (obj != null)
            {
                obj = (e)d().get(obj);
                if (obj == null)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Module was not installed: ").append(c).toString());
                }
                if (!hashset.contains(obj))
                {
                    hashset.add(obj);
                    obj = ((e) (obj)).g();
                    Iterator iterator = ((Map) (obj)).keySet().iterator();
                    while (iterator.hasNext()) 
                    {
                        Class class1 = (Class)iterator.next();
                        if (((q)((Map) (obj)).get(class1)).a())
                        {
                            linkedlist.add(class1);
                        }
                    }
                }
            } else
            {
                hashset.add(d().get(com/facebook/inject/i));
                return hashset;
            }
        } while (true);
    }

    private bd h()
    {
        if (b instanceof bd)
        {
            return (bd)b;
        } else
        {
            return null;
        }
    }

    public void a()
    {
        bd bd1 = h();
        if (bd1 != null)
        {
            bd1.a();
        }
    }

    public void a(t t1)
    {
        bd bd1 = h();
        if (bd1 != null)
        {
            bd1.a(t1);
        }
    }

    public ab b()
    {
        return b;
    }

    public javax.inject.a b(a a1)
    {
        e(a1);
        return b.b(a1);
    }

    public javax.inject.a c(a a1)
    {
        e(a1);
        return b.c(a1);
    }

    public Map d()
    {
        return b.d();
    }

    public boolean d(a a1)
    {
        return b.d(a1);
    }

    public ab e()
    {
label0:
        {
            ab ab1;
            synchronized (e)
            {
                if (f == null)
                {
                    break label0;
                }
                ab1 = f;
            }
            return ab1;
        }
        obj1 = b.e();
        if (obj1 != b)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        f = this;
_L1:
        obj1 = f;
        obj;
        JVM INSTR monitorexit ;
        return ((ab) (obj1));
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        f = new bb(((ab) (obj1)), c, g, d);
          goto _L1
    }

    public ab f(Class class1)
    {
        return b.f(class1);
    }

}
