// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.c;

import com.google.a.b.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a
{

    final Class a;
    final Type b;
    final int c;

    protected a()
    {
        b = a(getClass());
        a = com.google.a.b.b.e(b);
        c = b.hashCode();
    }

    a(Type type)
    {
        b = com.google.a.b.b.d((Type)com.google.a.b.a.a(type));
        a = com.google.a.b.b.e(b);
        c = b.hashCode();
    }

    public static a a(Type type)
    {
        return new a(type);
    }

    static Type a(Class class1)
    {
        class1 = class1.getGenericSuperclass();
        if (class1 instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            return com.google.a.b.b.d(((ParameterizedType)class1).getActualTypeArguments()[0]);
        }
    }

    public static a b(Class class1)
    {
        return new a(class1);
    }

    public final Class a()
    {
        return a;
    }

    public final Type b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof a) && com.google.a.b.b.a(b, ((a)obj).b);
    }

    public final int hashCode()
    {
        return c;
    }

    public final String toString()
    {
        return com.google.a.b.b.f(b);
    }
}
