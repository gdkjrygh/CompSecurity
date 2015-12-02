// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public class cev
{

    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final String c;
    private final cfd d;
    private final cfa e;
    private final ThreadLocal f;
    private final ThreadLocal g;
    private final Map h;

    public cev()
    {
        this("default");
    }

    private cev(cfd cfd1, String s)
    {
        this(cfd1, s, cfa.a);
    }

    private cev(cfd cfd1, String s, cfa cfa1)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        f = new _cls1();
        g = new _cls2();
        h = new HashMap();
        d = cfd1;
        c = s;
        e = cfa1;
    }

    private cev(String s)
    {
        this(cfd.b, s);
    }

    private cez a(Class class1)
    {
        return (cez)b.get(class1);
    }

    private void a()
    {
        if (((Boolean)g.get()).booleanValue())
        {
            return;
        }
        g.set(Boolean.valueOf(true));
_L2:
        cew cew1 = (cew)((ConcurrentLinkedQueue)f.get()).poll();
        if (cew1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (!cew1.b.a()) goto _L2; else goto _L1
_L1:
        b(cew1.a, cew1.b);
          goto _L2
        Exception exception;
        exception;
        g.set(Boolean.valueOf(false));
        throw exception;
        g.set(Boolean.valueOf(false));
        return;
    }

    private static void a(cey cey1, cez cez1)
    {
        Object obj = null;
        Object obj1 = cez1.c();
        cez1 = ((cez) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (cez1 == null)
        {
            return;
        } else
        {
            b(cez1, cey1);
            return;
        }
        invocationtargetexception;
        a((new StringBuilder("Producer ")).append(cez1).append(" threw an exception.").toString(), invocationtargetexception);
        cez1 = obj;
          goto _L1
    }

    private void a(Object obj, cey cey1)
    {
        ((ConcurrentLinkedQueue)f.get()).offer(new cew(obj, cey1));
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

    private Set b(Class class1)
    {
        return (Set)a.get(class1);
    }

    private static void b(Object obj, cey cey1)
    {
        try
        {
            cey1.a(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            a((new StringBuilder("Could not dispatch event: ")).append(obj.getClass()).append(" to handler ").append(cey1).toString(), invocationtargetexception);
        }
    }

    private Set c(Class class1)
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

    private static Set d(Class class1)
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
            cez cez1 = (cez)map.get(obj4);
            cez cez2 = (cez)b.putIfAbsent(obj4, cez1);
            if (cez2 != null)
            {
                throw new IllegalArgumentException((new StringBuilder("Producer method for type ")).append(obj4).append(" found on type ").append(cez1.a.getClass()).append(", but already registered by type ").append(cez2.a.getClass()).append(".").toString());
            }
            obj4 = (Set)a.get(obj4);
            if (obj4 != null && !((Set) (obj4)).isEmpty())
            {
                obj4 = ((Set) (obj4)).iterator();
                while (((Iterator) (obj4)).hasNext()) 
                {
                    a((cey)((Iterator) (obj4)).next(), cez1);
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
                break MISSING_BLOCK_LABEL_486;
            }
            obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj2 = (Class)((java.util.Map.Entry) (obj3)).getKey();
            obj2 = (cez)b.get(obj2);
        } while (obj2 == null || !((cez) (obj2)).a());
        obj3 = ((Set)((java.util.Map.Entry) (obj3)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        cey cey1 = (cey)((Iterator) (obj3)).next();
        if (!((cez) (obj2)).a()) goto _L2; else goto _L3
_L3:
        if (cey1.a())
        {
            a(cey1, ((cez) (obj2)));
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
        for (Iterator iterator = e.a(obj).entrySet().iterator(); iterator.hasNext(); ((cez)b.remove(class1)).b())
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            cez cez1 = a(class1);
            obj2 = (cez)((java.util.Map.Entry) (obj2)).getValue();
            if (obj2 == null || !((cez) (obj2)).equals(cez1))
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
            set = b((Class)((java.util.Map.Entry) (obj1)).getKey());
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
                cey cey1 = (cey)iterator2.next();
                if (((Collection) (obj1)).contains(cey1))
                {
                    cey1.b();
                }
            } while (true);
        }

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
                a(obj, (cey)((Iterator) (obj1)).next());
            } while (true);
        }

        if (!flag1 && !(obj instanceof cex))
        {
            c(new cex(this, obj));
        }
        a();
    }

    public String toString()
    {
        return (new StringBuilder("[Bus \"")).append(c).append("\"]").toString();
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
