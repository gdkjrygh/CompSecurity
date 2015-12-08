// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package com.google.a.b:
//            b

final class c
    implements Serializable, GenericArrayType
{

    private final Type a;

    public c(Type type)
    {
        a = b.a(type);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && b.a(this, (GenericArrayType)obj);
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
        return (new StringBuilder()).append(b.c(a)).append("[]").toString();
    }
}
