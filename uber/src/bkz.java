// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class bkz
    implements Serializable, GenericArrayType
{

    private static final long serialVersionUID = 0L;
    private final Type a;

    public bkz(Type type)
    {
        a = bky.a(type);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && bky.a(this, (GenericArrayType)obj);
    }

    public final Type getGenericComponentType()
    {
        return a;
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(bky.c(a)).append("[]").toString();
    }
}
