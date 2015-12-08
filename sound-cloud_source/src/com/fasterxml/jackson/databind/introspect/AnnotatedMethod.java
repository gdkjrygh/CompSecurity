// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedWithParams, AnnotationMap

public final class AnnotatedMethod extends AnnotatedWithParams
    implements Serializable
{

    protected final transient Method _method;
    protected Class _paramClasses[];

    public AnnotatedMethod(Method method, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotationmap, aannotationmap);
        if (method == null)
        {
            throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
        } else
        {
            _method = method;
            return;
        }
    }

    public final Object call()
        throws Exception
    {
        return _method.invoke(null, new Object[0]);
    }

    public final Object call(Object aobj[])
        throws Exception
    {
        return _method.invoke(null, aobj);
    }

    public final Object call1(Object obj)
        throws Exception
    {
        return _method.invoke(null, new Object[] {
            obj
        });
    }

    public final volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public final Method getAnnotated()
    {
        return _method;
    }

    public final Class getDeclaringClass()
    {
        return _method.getDeclaringClass();
    }

    public final String getFullName()
    {
        return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).append("(").append(getParameterCount()).append(" params)").toString();
    }

    public final Type getGenericParameterType(int i)
    {
        Type atype[] = _method.getGenericParameterTypes();
        if (i >= atype.length)
        {
            return null;
        } else
        {
            return atype[i];
        }
    }

    public final Type getGenericType()
    {
        return _method.getGenericReturnType();
    }

    public final volatile Member getMember()
    {
        return getMember();
    }

    public final Method getMember()
    {
        return _method;
    }

    public final String getName()
    {
        return _method.getName();
    }

    public final int getParameterCount()
    {
        return getRawParameterTypes().length;
    }

    public final Class getRawParameterType(int i)
    {
        Class aclass[] = getRawParameterTypes();
        if (i >= aclass.length)
        {
            return null;
        } else
        {
            return aclass[i];
        }
    }

    public final Class[] getRawParameterTypes()
    {
        if (_paramClasses == null)
        {
            _paramClasses = _method.getParameterTypes();
        }
        return _paramClasses;
    }

    public final Class getRawReturnType()
    {
        return _method.getReturnType();
    }

    public final Class getRawType()
    {
        return _method.getReturnType();
    }

    public final JavaType getType(TypeBindings typebindings)
    {
        return getType(typebindings, _method.getTypeParameters());
    }

    public final Object getValue(Object obj)
        throws IllegalArgumentException
    {
        try
        {
            obj = _method.invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to getValue() with method ")).append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to getValue() with method ")).append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        return obj;
    }

    public final void setValue(Object obj, Object obj1)
        throws IllegalArgumentException
    {
        try
        {
            _method.invoke(obj, new Object[] {
                obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to setValue() with method ")).append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to setValue() with method ")).append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
    }

    public final String toString()
    {
        return (new StringBuilder("[method ")).append(getFullName()).append("]").toString();
    }

    public final AnnotatedMethod withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedMethod(_method, annotationmap, _paramAnnotations);
    }

    public final AnnotatedMethod withMethod(Method method)
    {
        return new AnnotatedMethod(method, _annotations, _paramAnnotations);
    }
}
