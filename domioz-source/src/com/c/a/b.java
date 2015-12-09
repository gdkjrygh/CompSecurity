// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.c.a:
//            i, c, d, m, 
//            e, g, h, f

public final class b
{

    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final String c;
    private final m d;
    private final i e;
    private final ThreadLocal f;
    private final ThreadLocal g;
    private final Map h;

    public b()
    {
        this("default");
    }

    public b(m m1)
    {
        this(m1, "default");
    }

    private b(m m1, String s)
    {
        this(m1, s, i.a);
    }

    private b(m m1, String s, i j)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        f = new c(this);
        g = new d(this);
        h = new HashMap();
        d = m1;
        c = s;
        e = j;
    }

    private b(String s)
    {
        this(m.b, s);
    }

    private Set a(Class class1)
    {
        return (Set)a.get(class1);
    }

    private void a()
    {
        if (((Boolean)g.get()).booleanValue())
        {
            return;
        }
        g.set(Boolean.valueOf(true));
_L2:
        e e1 = (e)((ConcurrentLinkedQueue)f.get()).poll();
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (!e1.b.a()) goto _L2; else goto _L1
_L1:
        a(e1.a, e1.b);
          goto _L2
        Exception exception;
        exception;
        g.set(Boolean.valueOf(false));
        throw exception;
        g.set(Boolean.valueOf(false));
        return;
    }

    private static void a(g g1, h h1)
    {
        Object obj = null;
        Object obj1 = h1.c();
        h1 = ((h) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (h1 == null)
        {
            return;
        } else
        {
            a(h1, g1);
            return;
        }
        invocationtargetexception;
        a((new StringBuilder("Producer ")).append(h1).append(" threw an exception.").toString(), invocationtargetexception);
        h1 = obj;
          goto _L1
    }

    private static void a(Object obj, g g1)
    {
        try
        {
            g1.a(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            a((new StringBuilder("Could not dispatch event: ")).append(obj.getClass()).append(" to handler ").append(g1).toString(), invocationtargetexception);
        }
    }

    private static void a(String s, InvocationTargetException invocationtargetexception)
    {
        Throwable throwable = invocationtargetexception.getCause();
        if (throwable != null)
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(": ").append(throwable.getMessage()).toString(), throwable);
        } else
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(": ").append(invocationtargetexception.getMessage()).toString(), invocationtargetexception);
        }
    }

    private static Set b(Class class1)
    {
        LinkedList linkedlist = new LinkedList();
        HashSet hashset = new HashSet();
        linkedlist.add(class1);
        do
        {
            if (linkedlist.isEmpty())
            {
                break;
            }
            class1 = (Class)linkedlist.remove(0);
            hashset.add(class1);
            class1 = class1.getSuperclass();
            if (class1 != null)
            {
                linkedlist.add(class1);
            }
        } while (true);
        return hashset;
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to register must not be null.");
        }
        d.a(this);
        Map map = e.a(obj);
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj4 = (Class)iterator.next();
            h h1 = (h)map.get(obj4);
            h h2 = (h)b.putIfAbsent(obj4, h1);
            if (h2 != null)
            {
                throw new IllegalArgumentException((new StringBuilder("Producer method for type ")).append(obj4).append(" found on type ").append(h1.a.getClass()).append(", but already registered by type ").append(h2.a.getClass()).append(".").toString());
            }
            obj4 = (Set)a.get(obj4);
            if (obj4 != null && !((Set) (obj4)).isEmpty())
            {
                obj4 = ((Set) (obj4)).iterator();
                while (((Iterator) (obj4)).hasNext()) 
                {
                    a((g)((Iterator) (obj4)).next(), h1);
                }
            }
        } while (true);
        Map map1 = e.b(obj);
        Class class1;
        for (Iterator iterator1 = map1.keySet().iterator(); iterator1.hasNext(); ((Set) (obj)).addAll((Set)map1.get(class1)))
        {
            class1 = (Class)iterator1.next();
            Object obj1 = (Set)a.get(class1);
            obj = obj1;
            if (obj1 != null)
            {
                continue;
            }
            obj1 = new CopyOnWriteArraySet();
            Set set = (Set)a.putIfAbsent(class1, obj1);
            obj = set;
            if (set == null)
            {
                obj = obj1;
            }
        }

        obj = map1.entrySet().iterator();
_L2:
        Object obj2;
        Object obj3;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_482;
            }
            obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj2 = (Class)((java.util.Map.Entry) (obj3)).getKey();
            obj2 = (h)b.get(obj2);
        } while (obj2 == null || !((h) (obj2)).a());
        obj3 = ((Set)((java.util.Map.Entry) (obj3)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        g g1 = (g)((Iterator) (obj3)).next();
        if (!((h) (obj2)).a()) goto _L2; else goto _L3
_L3:
        if (g1.a())
        {
            a(g1, ((h) (obj2)));
        }
          goto _L4
    }

    public final void b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        d.a(this);
        Class class1;
        for (Iterator iterator = e.a(obj).entrySet().iterator(); iterator.hasNext(); ((h)b.remove(class1)).b())
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            h h1 = (h)b.get(class1);
            obj2 = (h)((java.util.Map.Entry) (obj2)).getValue();
            if (obj2 == null || !((h) (obj2)).equals(h1))
            {
                throw new IllegalArgumentException((new StringBuilder("Missing event producer for an annotated method. Is ")).append(obj.getClass()).append(" registered?").toString());
            }
        }

        Set set;
        Object obj1;
label0:
        for (Iterator iterator1 = e.b(obj).entrySet().iterator(); iterator1.hasNext(); set.removeAll(((Collection) (obj1))))
        {
            obj1 = (java.util.Map.Entry)iterator1.next();
            set = a((Class)((java.util.Map.Entry) (obj1)).getKey());
            obj1 = (Collection)((java.util.Map.Entry) (obj1)).getValue();
            if (set == null || !set.containsAll(((Collection) (obj1))))
            {
                throw new IllegalArgumentException((new StringBuilder("Missing event handler for an annotated method. Is ")).append(obj.getClass()).append(" registered?").toString());
            }
            Iterator iterator2 = set.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    continue label0;
                }
                g g1 = (g)iterator2.next();
                if (((Collection) (obj1)).contains(g1))
                {
                    g1.b();
                }
            } while (true);
        }

    }

    public final void c(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Event to post must not be null.");
        }
        d.a(this);
        Class class1 = obj.getClass();
        Set set = (Set)h.get(class1);
        Object obj1 = set;
        if (set == null)
        {
            obj1 = b(class1);
            h.put(class1, obj1);
        }
        boolean flag = false;
        obj1 = ((Set) (obj1)).iterator();
        do
        {
            if (((Iterator) (obj1)).hasNext())
            {
                Object obj2 = a((Class)((Iterator) (obj1)).next());
                if (obj2 == null || ((Set) (obj2)).isEmpty())
                {
                    continue;
                }
                g g1;
                for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((ConcurrentLinkedQueue)f.get()).offer(new e(obj, g1)))
                {
                    g1 = (g)((Iterator) (obj2)).next();
                }

            } else
            {
                if (!flag && !(obj instanceof f))
                {
                    c(new f(this, obj));
                }
                a();
                return;
            }
            flag = true;
        } while (true);
    }

    public final String toString()
    {
        return (new StringBuilder("[Bus \"")).append(c).append("\"]").toString();
    }
}
