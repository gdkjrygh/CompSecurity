// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class TypeToken
{

    final int hashCode;
    final Class rawType;
    final Type type;

    protected TypeToken()
    {
        type = getSuperclassTypeParameter(getClass());
        rawType = com.google.gson.internal..Gson.Types.getRawType(type);
        hashCode = type.hashCode();
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

    private static Type getSuperclassTypeParameter(Class class1)
    {
        class1 = class1.getGenericSuperclass();
        if (class1 instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            return com.google.gson.internal..Gson.Types.canonicalize(((ParameterizedType)class1).getActualTypeArguments()[0]);
        }
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
