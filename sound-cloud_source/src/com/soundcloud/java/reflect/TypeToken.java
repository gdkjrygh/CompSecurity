// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.reflect;

import com.soundcloud.java.checks.Preconditions;
import java.lang.reflect.Type;

// Referenced classes of package com.soundcloud.java.reflect:
//            Types

public class TypeToken
{

    private final int hashCode;
    private final Class rawType;
    private final Type type;

    public TypeToken()
    {
        type = Types.getSuperclassTypeParameter(getClass());
        rawType = Types.getRawType(type);
        hashCode = type.hashCode();
    }

    TypeToken(Type type1)
    {
        type = Types.canonicalize((Type)Preconditions.checkNotNull(type1));
        rawType = Types.getRawType(type);
        hashCode = type.hashCode();
    }

    public static TypeToken of(Class class1)
    {
        return new TypeToken(class1);
    }

    public static TypeToken of(Type type1)
    {
        return new TypeToken(type1);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof TypeToken) && Types.equals(type, ((TypeToken)obj).type);
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
        return Types.typeToString(type);
    }
}
