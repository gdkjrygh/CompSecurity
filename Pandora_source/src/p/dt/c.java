// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dt;

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

// Referenced classes of package p.dt:
//            g, f, e, k, 
//            d

public class c
{
    static class a
    {

        final Object a;
        final e b;

        public a(Object obj, e e1)
        {
            a = obj;
            b = e1;
        }
    }


    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final String c;
    private final k d;
    private final g e;
    private final ThreadLocal f;
    private final ThreadLocal g;
    private final Map h;

    public c(k k1, String s)
    {
        this(k1, s, g.a);
    }

    c(k k1, String s, g g1)
    {
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        f = new ThreadLocal() {

            final c a;

            protected ConcurrentLinkedQueue a()
            {
                return new ConcurrentLinkedQueue();
            }

            protected Object initialValue()
            {
                return a();
            }

            
            {
                a = c.this;
                super();
            }
        };
        g = new ThreadLocal() {

            final c a;

            protected Boolean a()
            {
                return Boolean.valueOf(false);
            }

            protected Object initialValue()
            {
                return a();
            }

            
            {
                a = c.this;
                super();
            }
        };
        h = new HashMap();
        d = k1;
        c = s;
        e = g1;
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

    private void a(e e1, f f1)
    {
        Object obj = null;
        Object obj1 = f1.c();
        f1 = ((f) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (f1 == null)
        {
            return;
        } else
        {
            b(f1, e1);
            return;
        }
        invocationtargetexception;
        a((new StringBuilder()).append("Producer ").append(f1).append(" threw an exception.").toString(), invocationtargetexception);
        f1 = obj;
          goto _L1
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

    f a(Class class1)
    {
        return (f)b.get(class1);
    }

    protected void a()
    {
        if (((Boolean)g.get()).booleanValue())
        {
            return;
        }
        g.set(Boolean.valueOf(true));
_L2:
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
                a(obj, (e)((Iterator) (obj1)).next());
            } while (true);
        }

        if (!flag1 && !(obj instanceof d))
        {
            a(new d(this, obj));
        }
        a();
    }

    protected void a(Object obj, e e1)
    {
        ((ConcurrentLinkedQueue)f.get()).offer(new a(obj, e1));
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
        for (Iterator iterator = e.a(obj).entrySet().iterator(); iterator.hasNext(); ((f)b.remove(class1)).b())
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            f f1 = a(class1);
            obj2 = (f)((java.util.Map.Entry) (obj2)).getValue();
            if (obj2 == null || !((f) (obj2)).equals(f1))
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
                e e1 = (e)iterator2.next();
                if (((Collection) (obj1)).contains(e1))
                {
                    e1.b();
                }
            } while (true);
        }

    }

    protected void b(Object obj, e e1)
    {
        try
        {
            e1.a(obj);
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            a((new StringBuilder()).append("Could not dispatch event: ").append(obj.getClass()).append(" to handler ").append(e1).toString(), invocationtargetexception);
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
            f f1 = (f)map.get(obj4);
            f f2 = (f)b.putIfAbsent(obj4, f1);
            if (f2 != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Producer method for type ").append(obj4).append(" found on type ").append(f1.a.getClass()).append(", but already registered by type ").append(f2.a.getClass()).append(".").toString());
            }
            obj4 = (Set)a.get(obj4);
            if (obj4 != null && !((Set) (obj4)).isEmpty())
            {
                obj4 = ((Set) (obj4)).iterator();
                while (((Iterator) (obj4)).hasNext()) 
                {
                    a((e)((Iterator) (obj4)).next(), f1);
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
                break MISSING_BLOCK_LABEL_492;
            }
            obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj2 = (Class)((java.util.Map.Entry) (obj3)).getKey();
            obj2 = (f)b.get(obj2);
        } while (obj2 == null || !((f) (obj2)).a());
        obj3 = ((Set)((java.util.Map.Entry) (obj3)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        e e1 = (e)((Iterator) (obj3)).next();
        if (!((f) (obj2)).a()) goto _L2; else goto _L3
_L3:
        if (e1.a())
        {
            a(e1, ((f) (obj2)));
        }
          goto _L4
    }

    public String toString()
    {
        return (new StringBuilder()).append("[Bus \"").append(c).append("\"]").toString();
    }
}
