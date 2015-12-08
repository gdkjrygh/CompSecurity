// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

private static final class componentType
    implements GenericArrayType, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Type componentType;

    public boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && componentType(this, (GenericArrayType)obj);
    }

    public Type getGenericComponentType()
    {
        return componentType;
    }

    public int hashCode()
    {
        return componentType.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(componentType(componentType)).append("[]").toString();
    }

    public (Type type)
    {
        componentType = componentType(type);
    }
}
