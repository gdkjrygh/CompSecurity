// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package dagger:
//            ObjectGraph

static final class MethodIndex extends ObjectGraph
{
    static final class MethodIndex
    {

        static final Map methodIndexes = new WeakHashMap();
        final Map membersInjectionMethodIndex;
        final Map provisionMethodIndex;

    }


    private final Object component;
    private final MethodIndex methodIndex;

    private static StringBuilder appendMembersInjectionMethod(StringBuilder stringbuilder, Method method)
    {
        return stringbuilder.append(method.getParameterTypes()[0].getCanonicalName()).append("->").append(method.getName());
    }

    private static StringBuilder appendProvisionMethod(StringBuilder stringbuilder, Method method)
    {
        return stringbuilder.append(method.getName()).append("->").append(method.getReturnType().getCanonicalName());
    }

    public final Object get(Class class1)
    {
        if (class1 == null)
        {
            throw new NullPointerException();
        }
        Method method = (Method)methodIndex.provisionMethodIndex.get(class1);
        if (method == null)
        {
            throw new IllegalArgumentException(String.format("%s was not the return type of a provision method on %s; only %s", new Object[] {
                class1.getName(), component.getClass().getName(), methodIndex.provisionMethodIndex.keySet()
            }));
        }
        try
        {
            class1 = ((Class) (class1.cast(method.invoke(component, new Object[0]))));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(java/lang/reflect/InvocationTargetException.getCanonicalName(), class1);
        }
        return class1;
    }

    public final Object inject(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        Method method = (Method)methodIndex.membersInjectionMethodIndex.get(obj.getClass());
        if (method == null)
        {
            throw new IllegalArgumentException(String.format("No injection methods for %s were found on %s; only %s", new Object[] {
                obj.getClass().getName(), component.getClass().getName(), methodIndex.membersInjectionMethodIndex.keySet()
            }));
        }
        try
        {
            method.invoke(component, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(java/lang/reflect/InvocationTargetException.getCanonicalName(), ((Throwable) (obj)));
        }
        return obj;
    }

    public final transient ObjectGraph plus(Object aobj[])
    {
        throw new UnsupportedOperationException("Object graphs made from components do not support plus(). To compose component-based graphs, compose the components and use the resultwith ObjectGraph.forComponent().");
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("ComponentObjectGraph(")).append(component.getClass().getCanonicalName()).append("){provisionMethods=[");
        Iterator iterator = methodIndex.provisionMethodIndex.values().iterator();
        if (iterator.hasNext())
        {
            appendProvisionMethod(stringbuilder, (Method)iterator.next());
        }
        for (; iterator.hasNext(); appendProvisionMethod(stringbuilder, (Method)iterator.next()))
        {
            stringbuilder.append(", ");
        }

        stringbuilder.append("], membersInjectionMethods=[");
        iterator = methodIndex.membersInjectionMethodIndex.values().iterator();
        if (iterator.hasNext())
        {
            appendMembersInjectionMethod(stringbuilder, (Method)iterator.next());
        }
        for (; iterator.hasNext(); appendMembersInjectionMethod(stringbuilder, (Method)iterator.next()))
        {
            stringbuilder.append(", ");
        }

        return stringbuilder.append("]}").toString();
    }
}
