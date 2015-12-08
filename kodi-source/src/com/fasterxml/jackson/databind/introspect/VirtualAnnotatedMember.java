// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotatedClass

public class VirtualAnnotatedMember extends AnnotatedMember
    implements Serializable
{

    protected final Class _declaringClass;
    protected final String _name;
    protected final Class _rawType;

    public VirtualAnnotatedMember(AnnotatedClass annotatedclass, Class class1, String s, Class class2)
    {
        super(annotatedclass, null);
        _declaringClass = class1;
        _rawType = class2;
        _name = s;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (VirtualAnnotatedMember)obj;
            if (((VirtualAnnotatedMember) (obj))._declaringClass != _declaringClass || !((VirtualAnnotatedMember) (obj))._name.equals(_name))
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

    public Field getAnnotated()
    {
        return null;
    }

    public Annotation getAnnotation(Class class1)
    {
        return null;
    }

    public Class getDeclaringClass()
    {
        return _declaringClass;
    }

    public String getFullName()
    {
        return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).toString();
    }

    public Type getGenericType()
    {
        return _rawType;
    }

    public Member getMember()
    {
        return null;
    }

    public String getName()
    {
        return _name;
    }

    public Class getRawType()
    {
        return _rawType;
    }

    public Object getValue(Object obj)
        throws IllegalArgumentException
    {
        throw new IllegalArgumentException((new StringBuilder()).append("Can not get virtual property '").append(_name).append("'").toString());
    }

    public int hashCode()
    {
        return _name.hashCode();
    }

    public void setValue(Object obj, Object obj1)
        throws IllegalArgumentException
    {
        throw new IllegalArgumentException((new StringBuilder()).append("Can not set virtual property '").append(_name).append("'").toString());
    }

    public String toString()
    {
        return (new StringBuilder()).append("[field ").append(getFullName()).append("]").toString();
    }
}
