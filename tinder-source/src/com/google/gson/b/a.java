// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class a
{

    public final Class a;
    public final Type b;
    final int c;

    protected a()
    {
        Type type = getClass().getGenericSuperclass();
        if (type instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            b = com.google.gson.internal..Gson.Types.a(((ParameterizedType)type).getActualTypeArguments()[0]);
            a = com.google.gson.internal..Gson.Types.b(b);
            c = b.hashCode();
            return;
        }
    }

    private a(Type type)
    {
        b = com.google.gson.internal..Gson.Types.a((Type)com.google.gson.internal.a.a(type));
        a = com.google.gson.internal..Gson.Types.b(b);
        c = b.hashCode();
    }

    public static a a(Class class1)
    {
        return new a(class1);
    }

    public static a a(Type type)
    {
        return new a(type);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof a) && com.google.gson.internal..Gson.Types.a(b, ((a)obj).b);
    }

    public final int hashCode()
    {
        return c;
    }

    public final String toString()
    {
        return com.google.gson.internal..Gson.Types.c(b);
    }
}
