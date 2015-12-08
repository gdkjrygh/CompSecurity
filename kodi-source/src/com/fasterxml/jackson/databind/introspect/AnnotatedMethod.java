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
//            AnnotatedWithParams, AnnotatedClass, AnnotationMap

public final class AnnotatedMethod extends AnnotatedWithParams
    implements Serializable
{

    protected final transient Method _method;
    protected Class _paramClasses[];

    public AnnotatedMethod(AnnotatedClass annotatedclass, Method method, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotatedclass, annotationmap, aannotationmap);
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

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            if (((AnnotatedMethod)obj)._method != _method)
            {
                return false;
            }
        }
        return true;
    }

    public volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public Method getAnnotated()
    {
        return _method;
    }

    public Class getDeclaringClass()
    {
        return _method.getDeclaringClass();
    }

    public String getFullName()
    {
        return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).append("(").append(getParameterCount()).append(" params)").toString();
    }

    public Type getGenericParameterType(int i)
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

    public Type getGenericType()
    {
        return _method.getGenericReturnType();
    }

    public volatile Member getMember()
    {
        return getMember();
    }

    public Method getMember()
    {
        return _method;
    }

    public String getName()
    {
        return _method.getName();
    }

    public int getParameterCount()
    {
        return getRawParameterTypes().length;
    }

    public Class getRawParameterType(int i)
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

    public Class[] getRawParameterTypes()
    {
        if (_paramClasses == null)
        {
            _paramClasses = _method.getParameterTypes();
        }
        return _paramClasses;
    }

    public Class getRawReturnType()
    {
        return _method.getReturnType();
    }

    public Class getRawType()
    {
        return _method.getReturnType();
    }

    public JavaType getType(TypeBindings typebindings)
    {
        return getType(typebindings, _method.getTypeParameters());
    }

    public Object getValue(Object obj)
        throws IllegalArgumentException
    {
        try
        {
            obj = _method.invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to getValue() with method ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to getValue() with method ").append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        return obj;
    }

    public boolean hasReturnType()
    {
        Class class1 = getRawReturnType();
        return class1 != Void.TYPE && class1 != java/lang/Void;
    }

    public int hashCode()
    {
        return _method.getName().hashCode();
    }

    public void setValue(Object obj, Object obj1)
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
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() with method ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() with method ").append(getFullName()).append(": ").append(((InvocationTargetException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[method ").append(getFullName()).append("]").toString();
    }

    public AnnotatedMethod withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedMethod(_context, _method, annotationmap, _paramAnnotations);
    }

    public AnnotatedMethod withMethod(Method method)
    {
        return new AnnotatedMethod(_context, method, _annotations, _paramAnnotations);
    }
}
