// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal.loaders;

import dagger.internal.Binding;
import dagger.internal.Keys;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import javax.inject.Singleton;

// Referenced classes of package dagger.internal.loaders:
//            ReflectiveModuleAdapter

static final class setLibrary extends ProvidesBinding
{

    private final Object instance;
    private final Method method;
    private Binding parameters[];

    public final void attach(Linker linker)
    {
        java.lang.reflect.Type atype[] = method.getGenericParameterTypes();
        java.lang.annotation.Annotation aannotation[][] = method.getParameterAnnotations();
        parameters = new Binding[atype.length];
        for (int i = 0; i < parameters.length; i++)
        {
            Object obj = atype[i];
            java.lang.annotation.Annotation aannotation1[] = aannotation[i];
            String s = String.valueOf(method);
            obj = Keys.get(((java.lang.reflect.Type) (obj)), aannotation1, (new StringBuilder(String.valueOf(s).length() + 22)).append(s).append(" parameter ").append(i).toString());
            parameters[i] = linker.requestBinding(((String) (obj)), method, instance.getClass().getClassLoader());
        }

    }

    public final Object get()
    {
        Object aobj[] = new Object[parameters.length];
        for (int i = 0; i < parameters.length; i++)
        {
            aobj[i] = parameters[i].get();
        }

        Object obj;
        try
        {
            obj = method.invoke(instance, aobj);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Object obj1 = invocationtargetexception.getCause();
            if (obj1 instanceof RuntimeException)
            {
                obj1 = (RuntimeException)obj1;
            } else
            {
                obj1 = new RuntimeException(((Throwable) (obj1)));
            }
            throw obj1;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
        return obj;
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1 = parameters;
        int j = set1.length;
        for (int i = 0; i < j; i++)
        {
            set.add(set1[i]);
        }

    }

    public final void injectMembers(Object obj)
    {
        throw new AssertionError("Provides method bindings are not MembersInjectors");
    }

    public (Method method1, String s, String s1, Object obj, boolean flag)
    {
        super(s, method1.isAnnotationPresent(javax/inject/Singleton), s1, method1.getName());
        method = method1;
        instance = obj;
        method1.setAccessible(true);
        setLibrary(flag);
    }
}
