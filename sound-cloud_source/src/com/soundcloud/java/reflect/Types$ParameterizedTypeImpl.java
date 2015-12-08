// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.reflect;

import com.soundcloud.java.checks.Preconditions;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

// Referenced classes of package com.soundcloud.java.reflect:
//            Types

private static final class typeArguments
    implements Serializable, ParameterizedType
{

    private static final long serialVersionUID = 0L;
    private final Type ownerType;
    private final Type rawType;
    private final Type typeArguments[];

    public final boolean equals(Object obj)
    {
        return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType)obj);
    }

    public final Type[] getActualTypeArguments()
    {
        return (Type[])typeArguments.clone();
    }

    public final Type getOwnerType()
    {
        return ownerType;
    }

    public final Type getRawType()
    {
        return rawType;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(typeArguments) ^ rawType.hashCode() ^ Types.access$100(ownerType);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
        stringbuilder.append(Types.typeToString(rawType));
        if (typeArguments.length == 0)
        {
            return stringbuilder.toString();
        }
        stringbuilder.append('<').append(Types.typeToString(typeArguments[0]));
        for (int i = 1; i < typeArguments.length; i++)
        {
            stringbuilder.append(", ").append(Types.typeToString(typeArguments[i]));
        }

        return stringbuilder.append('>').toString();
    }

    public transient (Type type, Type type1, Type atype[])
    {
        boolean flag = false;
        super();
        if (type1 instanceof Class)
        {
            Class class1 = (Class)type1;
            int i;
            boolean flag1;
            if (Modifier.isStatic(class1.getModifiers()) || class1.getEnclosingClass() == null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (type != null || i != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1);
        }
        if (type == null)
        {
            type = null;
        } else
        {
            type = Types.canonicalize(type);
        }
        ownerType = type;
        rawType = Types.canonicalize(type1);
        typeArguments = (Type[])atype.clone();
        for (i = ((flag) ? 1 : 0); i < typeArguments.length; i++)
        {
            Preconditions.checkNotNull(typeArguments[i]);
            Types.access$000(typeArguments[i]);
            typeArguments[i] = Types.canonicalize(typeArguments[i]);
        }

    }
}
