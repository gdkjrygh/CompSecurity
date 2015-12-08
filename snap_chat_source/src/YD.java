// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class YD
{

    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    static Map a(Object obj)
    {
        Object obj1 = obj.getClass();
        HashMap hashmap = new HashMap();
        if (!a.containsKey(obj1))
        {
            a(((Class) (obj1)));
        }
        obj1 = (Map)a.get(obj1);
        if (!((Map) (obj1)).isEmpty())
        {
            java.util.Map.Entry entry;
            YG yg;
            for (obj1 = ((Map) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); hashmap.put(entry.getKey(), yg))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                yg = new YG(obj, (Method)entry.getValue());
            }

        }
        return hashmap;
    }

    private static void a(Class class1)
    {
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        Method amethod[] = class1.getDeclaredMethods();
        int j = amethod.length;
        int i = 0;
        while (i < j) 
        {
            Method method = amethod[i];
            if (!method.isBridge())
            {
                if (method.isAnnotationPresent(YJ))
                {
                    Class aclass[] = method.getParameterTypes();
                    if (aclass.length != 1)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has @Subscribe annotation but requires ").append(aclass.length).append(" arguments.  Methods must require a single argument.").toString());
                    }
                    Class class3 = aclass[0];
                    if (class3.isInterface())
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has @Subscribe annotation on ").append(class3).append(" which is an interface.  Subscription must be on a concrete class type.").toString());
                    }
                    if ((method.getModifiers() & 1) == 0)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has @Subscribe annotation on ").append(class3).append(" but is not 'public'.").toString());
                    }
                    Set set = (Set)hashmap.get(class3);
                    Object obj = set;
                    if (set == null)
                    {
                        obj = new HashSet();
                        hashmap.put(class3, obj);
                    }
                    ((Set) (obj)).add(method);
                } else
                if (method.isAnnotationPresent(YI))
                {
                    Class aclass1[] = method.getParameterTypes();
                    if (aclass1.length != 0)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append("has @Produce annotation but requires ").append(aclass1.length).append(" arguments.  Methods must require zero arguments.").toString());
                    }
                    if (method.getReturnType() == java/lang/Void)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has a return type of void.  Must declare a non-void type.").toString());
                    }
                    Class class2 = method.getReturnType();
                    if (class2.isInterface())
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has @Produce annotation on ").append(class2).append(" which is an interface.  Producers must return a concrete class type.").toString());
                    }
                    if (class2.equals(Void.TYPE))
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has @Produce annotation but has no return type.").toString());
                    }
                    if ((method.getModifiers() & 1) == 0)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Method ")).append(method).append(" has @Produce annotation on ").append(class2).append(" but is not 'public'.").toString());
                    }
                    if (hashmap1.containsKey(class2))
                    {
                        throw new IllegalArgumentException((new StringBuilder("Producer for type ")).append(class2).append(" has already been registered.").toString());
                    }
                    hashmap1.put(class2, method);
                }
            }
            i++;
        }
        a.put(class1, hashmap1);
        b.put(class1, hashmap);
    }

    static Map b(Object obj)
    {
        Object obj1 = obj.getClass();
        HashMap hashmap = new HashMap();
        if (!b.containsKey(obj1))
        {
            a(((Class) (obj1)));
        }
        obj1 = (Map)b.get(obj1);
        if (!((Map) (obj1)).isEmpty())
        {
            java.util.Map.Entry entry;
            HashSet hashset;
            for (obj1 = ((Map) (obj1)).entrySet().iterator(); ((Iterator) (obj1)).hasNext(); hashmap.put(entry.getKey(), hashset))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                hashset = new HashSet();
                for (Iterator iterator = ((Set)entry.getValue()).iterator(); iterator.hasNext(); hashset.add(new YF(obj, (Method)iterator.next()))) { }
            }

        }
        return hashmap;
    }

}
