// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.content.Context;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.google.common.a.ef;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.iw;
import com.google.common.a.kl;
import com.google.common.base.Preconditions;
import com.google.inject.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Singleton;

// Referenced classes of package com.facebook.inject:
//            ba, n, af, g, 
//            ag, e, t, h, 
//            ak, au, ap, f, 
//            aq, s, aj, ah, 
//            ThreadLocalScoped, bh, i, z, 
//            ay, ax

class y
{

    private static Class a = com/facebook/inject/y;
    private final t b;
    private final Context c;
    private final List d;
    private final n e;
    private final ba f;
    private final boolean g;
    private final Map h = ik.a();
    private final Map i = ik.a();
    private final Map j = ik.a();
    private final Set k = kl.b();
    private final Map l = ik.b();
    private final LinkedHashMap m = ik.b();
    private final Set n = kl.a();
    private final Map o = ik.a();
    private final Map p = ik.a();
    private final Set q = kl.a();
    private final iw r = ef.m();
    private final iw s = ef.m();

    public y(t t1, Context context, List list, boolean flag, boolean flag1)
    {
        b = t1;
        c = context;
        d = list;
        f = new ba(flag);
        e = new n(context);
        g = flag1;
    }

    private af a(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.getConstructor(new Class[0]);
            ((Constructor) (obj)).setAccessible(true);
            obj = (af)((Constructor) (obj)).newInstance(new Object[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to find public default constructor for ").append(class1).toString(), nosuchmethodexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to invoke constructor for ").append(class1).toString(), invocationtargetexception);
        }
        catch (InstantiationException instantiationexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to instantiate ").append(class1).toString(), instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to access constructor for ").append(class1).toString(), illegalaccessexception);
        }
        return ((af) (obj));
    }

    private static IllegalArgumentException a(ag ag1, LinkedHashMap linkedhashmap, Class class1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Circular loop in requires while processing ");
        stringbuilder.append(ag1.getClass().getSimpleName()).append(":\n");
        ag1 = linkedhashmap.keySet().iterator();
        boolean flag = true;
        while (ag1.hasNext()) 
        {
            linkedhashmap = (Class)ag1.next();
            stringbuilder.append("   ").append(linkedhashmap.getSimpleName());
            if (flag)
            {
                stringbuilder.append(" required\n");
                flag = false;
            } else
            {
                stringbuilder.append(" which required\n");
            }
        }
        stringbuilder.append("   ").append(class1.getSimpleName()).append(".");
        return new IllegalArgumentException(stringbuilder.toString());
    }

    private void a(ag ag1)
    {
        g g1 = new g();
        ag1.a(g1);
        a(ag1, ((com.facebook.inject.e) (g1)));
        k.add(ag1);
        n.add(ag1.getClass());
        java.util.Map.Entry entry;
        for (Iterator iterator = g1.h().entrySet().iterator(); iterator.hasNext(); o.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        Iterator iterator1 = g1.e().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Class class1 = (Class)iterator1.next();
            if (m.containsKey(class1))
            {
                throw a(ag1, m, class1);
            }
            if (!l.containsKey(class1))
            {
                af af1 = a(class1);
                l.put(class1, Boolean.TRUE);
                m.put(class1, Boolean.TRUE);
                a(((ag) (af1)));
                m.remove(class1);
            }
        } while (true);
        iterator1 = g1.f().iterator();
        while (iterator1.hasNext()) 
        {
            ag ag2 = (ag)iterator1.next();
            e e1 = com.facebook.debug.d.e.a((new StringBuilder()).append("Module ").append(ag2.getClass()).toString());
            boolean flag;
            if (!(ag2 instanceof af))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            a(ag2);
            e1.a();
        }
        t t1 = (t)b.f(ag1.getClass());
        Iterator iterator3 = g1.a().iterator();
        do
        {
            if (!iterator3.hasNext())
            {
                break;
            }
            h h1 = (h)iterator3.next();
            a a3 = h1.a();
            Object obj1 = h1.b();
            if (obj1 instanceof ak)
            {
                ((ak)obj1).a(t1);
            }
            javax.inject.a a1 = ((javax.inject.a) (obj1));
            if (h1.c() != null)
            {
                obj1 = b(h1.c()).a(a3, ((javax.inject.a) (obj1)));
                a1 = ((javax.inject.a) (obj1));
                if (obj1 instanceof ak)
                {
                    ((ak)obj1).a(t1);
                    a1 = ((javax.inject.a) (obj1));
                }
            }
            obj1 = a1;
            if (g)
            {
                obj1 = new ap(a3, a1);
            }
            if (h1.e())
            {
                i.put(a3, obj1);
            } else
            {
                j.put(a3, obj1);
            }
            if (h1.d() != f.NONE)
            {
                if (h1.c() == null)
                {
                    throw new aq((new StringBuilder()).append("EagerInitFlag specified with no scope for ").append(a3).toString());
                }
                s.a(h1.c(), new s(a3, h1.d()));
            }
        } while (true);
        for (Iterator iterator2 = g1.b().entrySet().iterator(); iterator2.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator2.next();
            a a2 = (a)((java.util.Map.Entry) (obj)).getKey();
            aj aj1 = (aj)((java.util.Map.Entry) (obj)).getValue();
            Object obj2 = (ah)p.get(a2);
            obj = obj2;
            if (obj2 == null)
            {
                obj = new ah(b, a2);
                p.put(a2, obj);
            }
            obj2 = aj1.a().iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                ((ah) (obj)).a((a)((Iterator) (obj2)).next());
            }
        }

        q.addAll(g1.c());
        r.c(ag1, g1.d());
    }

    private void a(ag ag1, com.facebook.inject.e e1)
    {
        h.put(ag1.getClass(), e1);
    }

    private au b(Class class1)
    {
        au au1 = (au)o.get(class1);
        if (au1 == null)
        {
            throw new aq((new StringBuilder()).append("No scope registered for ").append(class1).toString());
        } else
        {
            return au1;
        }
    }

    private void c()
    {
        ah ah1;
        for (Iterator iterator = p.values().iterator(); iterator.hasNext(); j.put(ah1.b(), ah1.a()))
        {
            ah1 = (ah)iterator.next();
        }

    }

    public z a()
    {
        o.put(javax/inject/Singleton, f);
        o.put(com/facebook/inject/ThreadLocalScoped, bh.get());
        e e1 = com.facebook.debug.d.e.a("FbInjectorImpl.init#modules");
        a(((ag) (new i(e, c))));
        for (Iterator iterator2 = d.iterator(); iterator2.hasNext(); a((ag)iterator2.next())) { }
        e1.a();
        c();
        for (Iterator iterator = q.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (!j.containsKey(a1) && !i.containsKey(a1))
            {
                throw new RuntimeException((new StringBuilder()).append("No binding for required key ").append(a1).toString());
            }
        }

        q.clear();
        for (Iterator iterator1 = r.i().iterator(); iterator1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator1.next();
            ag ag1 = (ag)((java.util.Map.Entry) (obj)).getKey();
            obj = (Class)((java.util.Map.Entry) (obj)).getValue();
            if (!n.contains(obj))
            {
                throw new RuntimeException((new StringBuilder()).append("Module ").append(obj).append(" is required by ").append(ag1.getClass()).append(" but was not installed").toString());
            }
        }

        r.f();
        return new z(h, f, e, i, j);
    }

    public void b()
    {
        Iterator iterator = o.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            au au1 = (au)iterator.next();
            if (au1 instanceof ay)
            {
                ((ay)au1).a(b);
            }
        } while (true);
        ag ag1;
        for (iterator = k.iterator(); iterator.hasNext(); ag1.a((t)b.f(ag1.getClass())))
        {
            ag1 = (ag)iterator.next();
        }

        k.clear();
        iterator = o.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            au au2 = (au)iterator.next();
            if (au2 instanceof ax)
            {
                java.util.ArrayList arraylist = hq.a(s.d(au2.annotationType()));
                ((ax)au2).a(arraylist);
            }
        } while (true);
        if (!s.e())
        {
            java.util.Map.Entry entry;
            for (Iterator iterator1 = s.i().iterator(); iterator1.hasNext(); com.facebook.debug.log.b.d(a, "Scope %s does not support eager scoping for key %s", new Object[] {
    entry.getKey(), entry.getValue()
}))
            {
                entry = (java.util.Map.Entry)iterator1.next();
            }

            throw new aq("Illegal scoping. See earlier warnings");
        } else
        {
            return;
        }
    }

}
