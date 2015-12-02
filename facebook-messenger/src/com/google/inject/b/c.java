// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.b;

import com.google.inject.a.g;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.a;

public final class c
{

    private c()
    {
    }

    public static ParameterizedType a(Type type)
    {
        return a(javax/inject/a, new Type[] {
            type
        });
    }

    public static transient ParameterizedType a(Type type, Type type1, Type atype[])
    {
        return new g(type, type1, atype);
    }

    public static transient ParameterizedType a(Type type, Type atype[])
    {
        return a(null, type, atype);
    }
}
