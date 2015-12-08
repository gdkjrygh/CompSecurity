// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;

import YE;
import YF;
import YG;
import YH;
import YK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

public class Bus
{
    static final class a
    {

        final Object a;
        final YF b;

        public a(Object obj, YF yf)
        {
            a = obj;
            b = yf;
        }
    }


    public static final String DEFAULT_IDENTIFIER = "default";
    private final YK enforcer;
    private final ThreadLocal eventsToDispatch;
    private final Map flattenHierarchyCache;
    private final YH handlerFinder;
    private final ConcurrentMap handlersByType;
    private final String identifier;
    private final ThreadLocal isDispatching;
    private final ConcurrentMap producersByType;

    public Bus(YK yk)
    {
        this(yk, "default");
    }

    private Bus(YK yk, String s)
    {
        this(yk, s, YH.a);
    }

    private Bus(YK yk, String s, YH yh)
    {
        handlersByType = new ConcurrentHashMap();
        producersByType = new ConcurrentHashMap();
        eventsToDispatch = new ThreadLocal() {

            protected final Object initialValue()
            {
                return new ConcurrentLinkedQueue();
            }

        };
        isDispatching = new ThreadLocal() {

            protected final Object initialValue()
            {
                return Boolean.valueOf(false);
            }

        };
        flattenHierarchyCache = new HashMap();
        enforcer = yk;
        identifier = s;
        handlerFinder = yh;
    }

    private Set a(Class class1)
    {
        return (Set)handlersByType.get(class1);
    }

    private void a()
    {
        if (((Boolean)isDispatching.get()).booleanValue())
        {
            return;
        }
        isDispatching.set(Boolean.valueOf(true));
_L2:
        a a1 = (a)((ConcurrentLinkedQueue)eventsToDispatch.get()).poll();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (!a1.b.c) goto _L2; else goto _L1
_L1:
        a(a1.a, a1.b);
          goto _L2
        Exception exception;
        exception;
        isDispatching.set(Boolean.valueOf(false));
        throw exception;
        isDispatching.set(Boolean.valueOf(false));
        return;
    }

    private static void a(YF yf, YG yg)
    {
        Object obj = null;
        Object obj1 = yg.a();
        yg = ((YG) (obj1));
_L1:
        InvocationTargetException invocationtargetexception;
        if (yg == null)
        {
            return;
        } else
        {
            a(yg, yf);
            return;
        }
        invocationtargetexception;
        a((new StringBuilder("Producer ")).append(yg).append(" threw an exception.").toString(), invocationtargetexception);
        yg = obj;
          goto _L1
    }

    private static void a(Object obj, YF yf)
    {
        try
        {
            if (!yf.c)
            {
                throw new IllegalStateException((new StringBuilder()).append(yf.toString()).append(" has been invalidated and can no longer handle events.").toString());
            }
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            a((new StringBuilder("Could not dispatch event: ")).append(obj.getClass()).append(" to handler ").append(yf).toString(), invocationtargetexception);
            return;
        }
        yf.b.invoke(yf.a, new Object[] {
            obj
        });
        return;
        Object obj1;
        obj1;
        throw new AssertionError(obj1);
        obj1;
        if (((InvocationTargetException) (obj1)).getCause() instanceof Error)
        {
            throw (Error)((InvocationTargetException) (obj1)).getCause();
        } else
        {
            throw obj1;
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

    public void a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Event to post must not be null.");
        }
        enforcer.a(this);
        Class class1 = obj.getClass();
        Set set = (Set)flattenHierarchyCache.get(class1);
        Object obj1 = set;
        if (set == null)
        {
            obj1 = b(class1);
            flattenHierarchyCache.put(class1, obj1);
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
                YF yf;
                for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((ConcurrentLinkedQueue)eventsToDispatch.get()).offer(new a(obj, yf)))
                {
                    yf = (YF)((Iterator) (obj2)).next();
                }

            } else
            {
                if (!flag && !(obj instanceof YE))
                {
                    a(new YE());
                }
                a();
                return;
            }
            flag = true;
        } while (true);
    }

    public void b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to unregister must not be null.");
        }
        enforcer.a(this);
        for (Iterator iterator = handlerFinder.a(obj).entrySet().iterator(); iterator.hasNext();)
        {
            Object obj2 = (java.util.Map.Entry)iterator.next();
            Class class1 = (Class)((java.util.Map.Entry) (obj2)).getKey();
            YG yg = (YG)producersByType.get(class1);
            obj2 = (YG)((java.util.Map.Entry) (obj2)).getValue();
            if (obj2 == null || !((YG) (obj2)).equals(yg))
            {
                throw new IllegalArgumentException((new StringBuilder("Missing event producer for an annotated method. Is ")).append(obj.getClass()).append(" registered?").toString());
            }
            ((YG)producersByType.remove(class1)).b = false;
        }

        Set set;
        Object obj1;
label0:
        for (Iterator iterator1 = handlerFinder.b(obj).entrySet().iterator(); iterator1.hasNext(); set.removeAll(((Collection) (obj1))))
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
                YF yf = (YF)iterator2.next();
                if (((Collection) (obj1)).contains(yf))
                {
                    yf.c = false;
                }
            } while (true);
        }

    }

    public final void c(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Object to register must not be null.");
        }
        enforcer.a(this);
        Map map = handlerFinder.a(obj);
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj4 = (Class)iterator.next();
            YG yg = (YG)map.get(obj4);
            YG yg1 = (YG)producersByType.putIfAbsent(obj4, yg);
            if (yg1 != null)
            {
                throw new IllegalArgumentException((new StringBuilder("Producer method for type ")).append(obj4).append(" found on type ").append(yg.a.getClass()).append(", but already registered by type ").append(yg1.a.getClass()).append(".").toString());
            }
            obj4 = (Set)handlersByType.get(obj4);
            if (obj4 != null && !((Set) (obj4)).isEmpty())
            {
                obj4 = ((Set) (obj4)).iterator();
                while (((Iterator) (obj4)).hasNext()) 
                {
                    a((YF)((Iterator) (obj4)).next(), yg);
                }
            }
        } while (true);
        Map map1 = handlerFinder.b(obj);
        Class class1;
        for (Iterator iterator1 = map1.keySet().iterator(); iterator1.hasNext(); ((Set) (obj)).addAll((Set)map1.get(class1)))
        {
            class1 = (Class)iterator1.next();
            Object obj1 = (Set)handlersByType.get(class1);
            obj = obj1;
            if (obj1 != null)
            {
                continue;
            }
            obj1 = new CopyOnWriteArraySet();
            Set set = (Set)handlersByType.putIfAbsent(class1, obj1);
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
                break MISSING_BLOCK_LABEL_487;
            }
            obj3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj2 = (Class)((java.util.Map.Entry) (obj3)).getKey();
            obj2 = (YG)producersByType.get(obj2);
        } while (obj2 == null || !((YG) (obj2)).b);
        obj3 = ((Set)((java.util.Map.Entry) (obj3)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj3)).hasNext()) goto _L2; else goto _L1
_L1:
        YF yf = (YF)((Iterator) (obj3)).next();
        if (!((YG) (obj2)).b) goto _L2; else goto _L3
_L3:
        if (yf.c)
        {
            a(yf, ((YG) (obj2)));
        }
          goto _L4
    }

    public String toString()
    {
        return (new StringBuilder("[Bus \"")).append(identifier).append("\"]").toString();
    }
}
