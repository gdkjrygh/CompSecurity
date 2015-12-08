// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedWithParams, AnnotatedClass, AnnotationMap

public final class AnnotatedConstructor extends AnnotatedWithParams
{

    protected final Constructor _constructor;

    public AnnotatedConstructor(AnnotatedClass annotatedclass, Constructor constructor, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotatedclass, annotationmap, aannotationmap);
        if (constructor == null)
        {
            throw new IllegalArgumentException("Null constructor not allowed");
        } else
        {
            _constructor = constructor;
            return;
        }
    }

    public final Object call()
        throws Exception
    {
        return _constructor.newInstance(new Object[0]);
    }

    public final Object call(Object aobj[])
        throws Exception
    {
        return _constructor.newInstance(aobj);
    }

    public final Object call1(Object obj)
        throws Exception
    {
        return _constructor.newInstance(new Object[] {
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
            if (((AnnotatedConstructor)obj)._constructor != _constructor)
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

    public Constructor getAnnotated()
    {
        return _constructor;
    }

    public Class getDeclaringClass()
    {
        return _constructor.getDeclaringClass();
    }

    public Type getGenericParameterType(int i)
    {
        Type atype[] = _constructor.getGenericParameterTypes();
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
        return getRawType();
    }

    public Member getMember()
    {
        return _constructor;
    }

    public String getName()
    {
        return _constructor.getName();
    }

    public int getParameterCount()
    {
        return _constructor.getParameterTypes().length;
    }

    public Class getRawParameterType(int i)
    {
        Class aclass[] = _constructor.getParameterTypes();
        if (i >= aclass.length)
        {
            return null;
        } else
        {
            return aclass[i];
        }
    }

    public Class getRawType()
    {
        return _constructor.getDeclaringClass();
    }

    public JavaType getType(TypeBindings typebindings)
    {
        return getType(typebindings, _constructor.getTypeParameters());
    }

    public Object getValue(Object obj)
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call getValue() on constructor of ").append(getDeclaringClass().getName()).toString());
    }

    public int hashCode()
    {
        return _constructor.getName().hashCode();
    }

    public void setValue(Object obj, Object obj1)
        throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call setValue() on constructor of ").append(getDeclaringClass().getName()).toString());
    }

    public String toString()
    {
        return (new StringBuilder()).append("[constructor for ").append(getName()).append(", annotations: ").append(_annotations).append("]").toString();
    }
}
