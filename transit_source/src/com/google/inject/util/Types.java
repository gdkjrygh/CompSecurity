// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.util;

import com.google.inject.Provider;
import com.google.inject.internal.MoreTypes;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Types
{

    private Types()
    {
    }

    public static GenericArrayType arrayOf(Type type)
    {
        return new com.google.inject.internal.MoreTypes.GenericArrayTypeImpl(type);
    }

    public static ParameterizedType listOf(Type type)
    {
        return newParameterizedType(java/util/List, new Type[] {
            type
        });
    }

    public static ParameterizedType mapOf(Type type, Type type1)
    {
        return newParameterizedType(java/util/Map, new Type[] {
            type, type1
        });
    }

    public static transient ParameterizedType newParameterizedType(Type type, Type atype[])
    {
        return newParameterizedTypeWithOwner(null, type, atype);
    }

    public static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Type type1, Type atype[])
    {
        return new com.google.inject.internal.MoreTypes.ParameterizedTypeImpl(type, type1, atype);
    }

    public static ParameterizedType providerOf(Type type)
    {
        return newParameterizedType(com/google/inject/Provider, new Type[] {
            type
        });
    }

    public static ParameterizedType setOf(Type type)
    {
        return newParameterizedType(java/util/Set, new Type[] {
            type
        });
    }

    public static WildcardType subtypeOf(Type type)
    {
        Type atype[] = MoreTypes.EMPTY_TYPE_ARRAY;
        return new com.google.inject.internal.MoreTypes.WildcardTypeImpl(new Type[] {
            type
        }, atype);
    }

    public static WildcardType supertypeOf(Type type)
    {
        return new com.google.inject.internal.MoreTypes.WildcardTypeImpl(new Type[] {
            java/lang/Object
        }, new Type[] {
            type
        });
    }
}
