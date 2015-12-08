// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;
import java.util.Set;

class d
{

    private final Set a = new HashSet();

    d()
    {
    }

    void a(Class class1)
    {
    }

    void a(GenericArrayType genericarraytype)
    {
    }

    void a(ParameterizedType parameterizedtype)
    {
    }

    void a(TypeVariable typevariable)
    {
    }

    void a(WildcardType wildcardtype)
    {
    }

    public final transient void a(Type atype[])
    {
        int i;
        int j;
        j = atype.length;
        i = 0;
_L2:
        Type type;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        type = atype[i];
        if (type == null || !a.add(type))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (type instanceof TypeVariable)
        {
            a((TypeVariable)type);
            break MISSING_BLOCK_LABEL_162;
        }
        if (type instanceof WildcardType)
        {
            a((WildcardType)type);
            break MISSING_BLOCK_LABEL_162;
        }
        break MISSING_BLOCK_LABEL_83;
        atype;
        a.remove(type);
        throw atype;
        if (type instanceof ParameterizedType)
        {
            a((ParameterizedType)type);
            break MISSING_BLOCK_LABEL_162;
        }
        if (type instanceof Class)
        {
            a((Class)type);
            break MISSING_BLOCK_LABEL_162;
        }
        if (type instanceof GenericArrayType)
        {
            a((GenericArrayType)type);
            break MISSING_BLOCK_LABEL_162;
        }
        throw new AssertionError((new StringBuilder("Unknown type: ")).append(type).toString());
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
