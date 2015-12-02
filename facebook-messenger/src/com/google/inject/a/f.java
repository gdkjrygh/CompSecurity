// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package com.google.inject.a:
//            e, d

public class f
    implements e, Serializable, GenericArrayType
{

    private final Type a;

    public f(Type type)
    {
        a = d.a(type);
    }

    public boolean a()
    {
        return d.d(a);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && d.a(this, (GenericArrayType)obj);
    }

    public Type getGenericComponentType()
    {
        return a;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(d.c(a)).append("[]").toString();
    }
}
