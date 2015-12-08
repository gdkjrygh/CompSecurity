// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeToken
{

    final int hashCode;
    final Class rawType;
    final Type type;

    public TypeToken()
    {
        Type type1 = getClass().getGenericSuperclass();
        if (type1 instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            type = com.google.gson.internal..Gson.Types.canonicalize(((ParameterizedType)type1).getActualTypeArguments()[0]);
            rawType = com.google.gson.internal..Gson.Types.getRawType(type);
            hashCode = type.hashCode();
            return;
        }
    }

    private TypeToken(Type type1)
    {
        type = com.google.gson.internal..Gson.Types.canonicalize((Type)com.google.gson.internal..Gson.Preconditions.checkNotNull(type1));
        rawType = com.google.gson.internal..Gson.Types.getRawType(type);
        hashCode = type.hashCode();
    }

    public static TypeToken get(Class class1)
    {
        return new TypeToken(class1);
    }

    public static TypeToken get(Type type1)
    {
        return new TypeToken(type1);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof TypeToken) && com.google.gson.internal..Gson.Types.equals(type, ((TypeToken)obj).type);
    }

    public final Class getRawType()
    {
        return rawType;
    }

    public final Type getType()
    {
        return type;
    }

    public final int hashCode()
    {
        return hashCode;
    }

    public final String toString()
    {
        return com.google.gson.internal..Gson.Types.typeToString(type);
    }
}
