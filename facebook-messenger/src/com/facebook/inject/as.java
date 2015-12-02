// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import android.util.Pair;
import com.facebook.common.annotations.a;
import com.google.common.a.hq;
import com.google.inject.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

// Referenced classes of package com.facebook.inject:
//            d, av, n

public class as extends d
{

    private final Class a;
    private javax.inject.a b;

    public as(Class class1)
    {
        a = class1;
        f();
    }

    private javax.inject.a a()
    {
        Constructor constructor = f();
        java.lang.reflect.Type atype[] = constructor.getGenericParameterTypes();
        Annotation aannotation[][] = com.facebook.common.annotations.a.a().a(constructor);
        java.util.ArrayList arraylist = hq.c(atype.length);
        int i = 0;
        while (i < atype.length) 
        {
            java.lang.reflect.Type type = atype[i];
            Annotation aannotation1[] = aannotation[i];
            Object obj = null;
            int k = aannotation1.length;
            for (int j = 0; j < k;)
            {
                Annotation annotation = aannotation1[j];
                if (com.google.inject.a.a.b(annotation.annotationType()))
                {
                    if (obj != null)
                    {
                        throw new RuntimeException((new StringBuilder()).append("Parameter ").append(i).append(" for ctor of ").append(a.getName()).append(" has multiple binding annotations").toString());
                    }
                } else
                {
                    annotation = ((Annotation) (obj));
                }
                j++;
                obj = annotation;
            }

            f f1 = com.google.inject.f.a(type);
            boolean flag = javax/inject/a.isAssignableFrom(f1.a());
            if (flag)
            {
                f1 = com.google.inject.f.a(((ParameterizedType)type).getActualTypeArguments()[0]);
            }
            if (obj != null)
            {
                obj = com.google.inject.a.a(f1, ((Annotation) (obj)));
            } else
            {
                obj = com.google.inject.a.a(f1);
            }
            arraylist.add(Pair.create(obj, Boolean.valueOf(flag)));
            i++;
        }
        Object obj1 = hq.c(arraylist.size());
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            Pair pair = (Pair)iterator.next();
            com.google.inject.a a1 = (com.google.inject.a)pair.first;
            if (((Boolean)pair.second).booleanValue())
            {
                ((List) (obj1)).add(b(a1));
            } else
            {
                ((List) (obj1)).add(a(a1));
            }
        }

        try
        {
            obj1 = (javax.inject.a)constructor.newInstance(((List) (obj1)).toArray());
        }
        catch (InstantiationException instantiationexception)
        {
            throw new RuntimeException(instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new RuntimeException(invocationtargetexception);
        }
        return ((javax.inject.a) (obj1));
    }

    private Constructor f()
    {
        Constructor aconstructor[] = a.getConstructors();
        Constructor constructor = null;
        int j = aconstructor.length;
        for (int i = 0; i < j;)
        {
            Constructor constructor1 = aconstructor[i];
            if (constructor1.getAnnotation(javax/inject/Inject) != null)
            {
                if (constructor != null)
                {
                    throw new RuntimeException((new StringBuilder()).append(a.getName()).append(" has multiple constructors with @Inject").toString());
                }
            } else
            {
                constructor1 = constructor;
            }
            i++;
            constructor = constructor1;
        }

        if (constructor == null)
        {
            throw new RuntimeException((new StringBuilder()).append(a.getName()).append(" does not have a constructor with @Inject").toString());
        } else
        {
            return constructor;
        }
    }

    public Object b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        n n1;
        obj = com.facebook.inject.av.a();
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        n1 = (n)a(com/facebook/inject/n);
        ((av) (obj)).a(javax/inject/Singleton);
        n1.a();
        b = a();
        n1.b();
        ((av) (obj)).b(javax/inject/Singleton);
        obj = b.b();
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception2;
        exception2;
        n1.b();
        throw exception2;
        Exception exception1;
        exception1;
        ((av) (obj)).b(javax/inject/Singleton);
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
