// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package retrofit:
//            Types

final class componentType
    implements GenericArrayType
{

    private final Type componentType;

    public final boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType)obj);
    }

    public final Type getGenericComponentType()
    {
        return componentType;
    }

    public final int hashCode()
    {
        return componentType.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(Types.typeToString(componentType)).append("[]").toString();
    }

    public (Type type)
    {
        componentType = type;
    }
}
