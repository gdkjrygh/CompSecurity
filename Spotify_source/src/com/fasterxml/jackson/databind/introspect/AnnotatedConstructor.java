// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedWithParams, AnnotationMap

public final class AnnotatedConstructor extends AnnotatedWithParams
{

    private static final long serialVersionUID = 1L;
    protected final Constructor _constructor;
    protected Serialization _serialization;

    protected AnnotatedConstructor(Serialization serialization)
    {
        super(null, null);
        _constructor = null;
        _serialization = serialization;
    }

    public AnnotatedConstructor(Constructor constructor, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotationmap, aannotationmap);
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
    {
        return _constructor.newInstance(new Object[0]);
    }

    public final Object call(Object aobj[])
    {
        return _constructor.newInstance(aobj);
    }

    public final Object call1(Object obj)
    {
        return _constructor.newInstance(new Object[] {
            obj
        });
    }

    public final volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public final Constructor getAnnotated()
    {
        return _constructor;
    }

    public final Class getDeclaringClass()
    {
        return _constructor.getDeclaringClass();
    }

    public final Type getGenericParameterType(int i)
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

    public final Type getGenericType()
    {
        return getRawType();
    }

    public final Member getMember()
    {
        return _constructor;
    }

    public final String getName()
    {
        return _constructor.getName();
    }

    public final int getParameterCount()
    {
        return _constructor.getParameterTypes().length;
    }

    public final Class getRawParameterType(int i)
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

    public final Class getRawType()
    {
        return _constructor.getDeclaringClass();
    }

    public final JavaType getType(TypeBindings typebindings)
    {
        return getType(typebindings, _constructor.getTypeParameters());
    }

    public final Object getValue(Object obj)
    {
        throw new UnsupportedOperationException((new StringBuilder("Cannot call getValue() on constructor of ")).append(getDeclaringClass().getName()).toString());
    }

    final Object readResolve()
    {
        Class class1 = _serialization.clazz;
        Object obj;
        try
        {
            obj = class1.getDeclaredConstructor(_serialization.args);
            if (!((Constructor) (obj)).isAccessible())
            {
                ClassUtil.checkAndFixAccess(((Member) (obj)));
            }
            obj = new AnnotatedConstructor(((Constructor) (obj)), null, null);
        }
        catch (Exception exception)
        {
            throw new IllegalArgumentException((new StringBuilder("Could not find constructor with ")).append(_serialization.args.length).append(" args from Class '").append(class1.getName()).toString());
        }
        return obj;
    }

    public final void setValue(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException((new StringBuilder("Cannot call setValue() on constructor of ")).append(getDeclaringClass().getName()).toString());
    }

    public final String toString()
    {
        return (new StringBuilder("[constructor for ")).append(getName()).append(", annotations: ").append(_annotations).append("]").toString();
    }

    final Object writeReplace()
    {
        return new AnnotatedConstructor(new Serialization(_constructor));
    }

    private class Serialization
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        protected Class args[];
        protected Class clazz;

        public Serialization(Constructor constructor)
        {
            clazz = constructor.getDeclaringClass();
            args = constructor.getParameterTypes();
        }
    }

}
