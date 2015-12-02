// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class MemberKey
{

    static final Class NO_CLASSES[] = new Class[0];
    final Class _argTypes[];
    final String _name;

    public MemberKey(String s, Class aclass[])
    {
        _name = s;
        s = aclass;
        if (aclass == null)
        {
            s = NO_CLASSES;
        }
        _argTypes = s;
    }

    public MemberKey(Constructor constructor)
    {
        this("", constructor.getParameterTypes());
    }

    public MemberKey(Method method)
    {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (MemberKey)obj;
            if (!_name.equals(((MemberKey) (obj))._name))
            {
                return false;
            }
            obj = ((MemberKey) (obj))._argTypes;
            int j = _argTypes.length;
            if (obj.length != j)
            {
                return false;
            }
            int i = 0;
            while (i < j) 
            {
                Class class1 = obj[i];
                Class class2 = _argTypes[i];
                if (class1 == class2 || class1.isAssignableFrom(class2) || class2.isAssignableFrom(class1))
                {
                    i++;
                } else
                {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode()
    {
        return _name.hashCode() + _argTypes.length;
    }

    public String toString()
    {
        return (new StringBuilder()).append(_name).append("(").append(_argTypes.length).append("-args)").toString();
    }

}
