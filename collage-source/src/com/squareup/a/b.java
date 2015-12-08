// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

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

// Referenced classes of package com.squareup.a:
//            f, i, e, d, 
//            c

public class b
{

    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final String c;
    private final i d;
    private final f e;
    private final ThreadLocal f;
    private final ThreadLocal g;
    private final Map h;

    public b()
    {
        this("default");
    }

    public b(i j, String s)
    {
        this(j, s, f.a);
    }

    b(i j, String s, f f1)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        f = new _cls1();
        g = new _cls2();
        h = new HashMap();
        d = j;
        c = s;
        e = f1;
    }

    public b(String s)
    {
        this(i.b, s);
    }

    private void a(d d1, e e1)
    {
        Object obj = null;
        Object obj1 = e1.c();
        e1 = ((e) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (e1 == null)
        {
            return;
        } else
        {
            b(e1, d1);
            return;
        }
        invocationtargetexception;
        a((new StringBuilder()).append("Producer ").append(e1).append(" threw an exception.").toString(), invocationtargetexception);
        e1 = obj;
          goto _L1
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

    private Set d(Class class1)
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

    e a(Class class1)
    {
        return (e)b.get(class1);
    }

    protected void a()
    {
        if (((Boolean)g.get()).booleanValue())
        {
            return;
        }
        g.set(Boolean.valueOf(true));
_L2:
    /* block-local class not found */
    class a {}

        a a1 = (a)((ConcurrentLinkedQueue)f.get()).poll();
        if (a1 == null)
        {
            g.set(Boolean.valueOf(false));
            return;
        }
        if (!a1.b.a()) goto _L2; else goto _L1
_L1:
        b(a1.a, a1.b);
          goto _L2
        Exception exception;
        exception;
        g.set(Boolean.valueOf(false));
        throw exception;
    }

    public void a(Object obj)
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
            Object obj3 = (Class)iterator.next();
            e e1 = (e)map.get(obj3);
            e e2 = (e)b.putIfAbsent(obj3, e1);
            if (e2 != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Producer method for type ").append(obj3).append(" found on type ").append(e1.a.getClass()).append(", but already registered by type ").append(e2.a.getClass()).append(".").toString());
            }
            obj3 = (Set)a.get(obj3);
            if (obj3 != null && !((Set) (obj3)).isEmpty())
            {
                obj3 = ((Set) (obj3)).iterator();
                while (((Iterator) (obj3)).hasNext()) 
                {
                    a((d)((Iterator) (obj3)).next(), e1);
                }
            }
        } while (true);
        Map map1 = e.b(obj);
        for (Iterator iterator1 = map1.keySet().iterator(); iterator1.hasNext();)
        {
            Class class1 = (Class)iterator1.next();
            Set set = (Set)a.get(class1);
            obj = set;
            if (set == null)
            {
                CopyOnWriteArraySet copyonwritearrayset = new CopyOnWriteArraySet();
                Set set1 = (Set)a.putIfAbsent(class1, copyonwritearrayset);
                obj = set1;
                if (set1 == null)
                {
                    obj = copyonwritearrayset;
                }
            }
            if (!((Set) (obj)).addAll((Set)map1.get(class1)))
            {
                throw new IllegalArgumentException("Object already registered.");
            }
        }

        obj = map1.entrySet().iterator();
_L2:
        Object obj1;
        Object obj2;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_497;
            }
            obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            obj1 = (e)b.get(obj1);
        } while (obj1 == null || !((e) (obj1)).a());
        obj2 = ((Set)((java.util.Map.Entry) (obj2)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        d d1 = (d)((Iterator) (obj2)).next();
        if (!((e) (obj1)).a()) goto _L2; else goto _L3
_L3:
        if (d1.a())
        {
            a(d1, ((e) (obj1)));
        }
          goto _L4
    }

    protected void a(Object obj, d d1)
    {
        ((ConcurrentLinkedQueue)f.get()).offer(new a(obj, d1));
    }

    Set b(Class class1)
    {
        return (Set)a.get(class1);
    }

    public void b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        d.a(this);
        Class class1;
        for (Iterator iterator = e.a(obj).entrySet().iterator(); iterator.hasNext(); ((e)b.remove(class1)).b())
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            e e1 = a(class1);
            obj2 = (e)((java.util.Map.Entry) (obj2)).getValue();
            if (obj2 == null || !((e) (obj2)).equals(e1))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Missing event producer for an annotated method. Is ").append(obj.getClass()).append(" registered?").toString());
            }
        }

        Set set;
        Object obj1;
label0:
        for (Iterator iterator1 = e.b(obj).entrySet().iterator(); iterator1.hasNext(); set.removeAll(((Collection) (obj1))))
        {
            obj1 = (java.util.Map.Entry)iterator1.next();
            set = b((Class)((java.util.Map.Entry) (obj1)).getKey());
            obj1 = (Collection)((java.util.Map.Entry) (obj1)).getValue();
            if (set == null || !set.containsAll(((Collection) (obj1))))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Missing event handler for an annotated method. Is ").append(obj.getClass()).append(" registered?").toString());
            }
            Iterator iterator2 = set.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    continue label0;
                }
                d d1 = (d)iterator2.next();
                if (((Collection) (obj1)).contains(d1))
                {
                    d1.b();
                }
            } while (true);
        }

    }

    protected void b(Object obj, d d1)
    {
        try
        {
            d1.a(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            a((new StringBuilder()).append("Could not dispatch event: ").append(obj.getClass()).append(" to handler ").append(d1).toString(), invocationtargetexception);
        }
    }

    Set c(Class class1)
    {
        Set set1 = (Set)h.get(class1);
        Set set = set1;
        if (set1 == null)
        {
            set = d(class1);
            h.put(class1, set);
        }
        return set;
    }

    public void c(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Event to post must not be null.");
        }
        d.a(this);
        Iterator iterator = c(obj.getClass()).iterator();
        boolean flag;
        boolean flag1;
label0:
        for (flag1 = false; iterator.hasNext(); flag1 = flag)
        {
            Object obj1 = b((Class)iterator.next());
            flag = flag1;
            if (obj1 == null)
            {
                continue;
            }
            flag = flag1;
            if (((Set) (obj1)).isEmpty())
            {
                continue;
            }
            flag1 = true;
            obj1 = ((Set) (obj1)).iterator();
            do
            {
                flag = flag1;
                if (!((Iterator) (obj1)).hasNext())
                {
                    continue label0;
                }
                a(obj, (d)((Iterator) (obj1)).next());
            } while (true);
        }

        if (!flag1 && !(obj instanceof c))
        {
            c(new c(this, obj));
        }
        a();
    }

    public String toString()
    {
        return (new StringBuilder()).append("[Bus \"").append(c).append("\"]").toString();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
