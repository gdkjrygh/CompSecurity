// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package com.google.inject.internal:
//            MoreTypes

public static class componentType
    implements GenericArrayType, Serializable, componentType
{

    private static final long serialVersionUID = 0L;
    private final Type componentType;

    public boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && MoreTypes.equals(this, (GenericArrayType)obj);
    }

    public Type getGenericComponentType()
    {
        return componentType;
    }

    public int hashCode()
    {
        return componentType.hashCode();
    }

    public boolean isFullySpecified()
    {
        return MoreTypes.access$100(componentType);
    }

    public String toString()
    {
        return (new StringBuilder()).append(MoreTypes.typeToString(componentType)).append("[]").toString();
    }

    public (Type type)
    {
        componentType = MoreTypes.canonicalize(type);
    }
}
