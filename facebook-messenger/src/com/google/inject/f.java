// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.common.base.Preconditions;
import com.google.inject.a.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class f
{

    final Class b;
    final Type c;
    final int d;

    protected f()
    {
        c = a(getClass());
        b = com.google.inject.a.d.b(c);
        d = c.hashCode();
    }

    f(Type type)
    {
        c = com.google.inject.a.d.a((Type)Preconditions.checkNotNull(type, "type"));
        b = com.google.inject.a.d.b(c);
        d = c.hashCode();
    }

    public static f a(Type type)
    {
        return new f(type);
    }

    static Type a(Class class1)
    {
        class1 = class1.getGenericSuperclass();
        if (class1 instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            return com.google.inject.a.d.a(((ParameterizedType)class1).getActualTypeArguments()[0]);
        }
    }

    static f b(Class class1)
    {
        return new f(a(class1));
    }

    public static f c(Class class1)
    {
        return new f(class1);
    }

    public final Class a()
    {
        return b;
    }

    public final Type b()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof f) && com.google.inject.a.d.a(c, ((f)obj).c);
    }

    public final int hashCode()
    {
        return d;
    }

    public final String toString()
    {
        return com.google.inject.a.d.c(c);
    }
}
