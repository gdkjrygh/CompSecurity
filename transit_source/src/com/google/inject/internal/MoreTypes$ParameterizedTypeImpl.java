// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

// Referenced classes of package com.google.inject.internal:
//            MoreTypes

public static class typeArguments
    implements ParameterizedType, Serializable, typeArguments
{

    private static final long serialVersionUID = 0L;
    private final Type ownerType;
    private final Type rawType;
    private final Type typeArguments[];

    public boolean equals(Object obj)
    {
        return (obj instanceof ParameterizedType) && MoreTypes.equals(this, (ParameterizedType)obj);
    }

    public Type[] getActualTypeArguments()
    {
        return (Type[])typeArguments.clone();
    }

    public Type getOwnerType()
    {
        return ownerType;
    }

    public Type getRawType()
    {
        return rawType;
    }

    public int hashCode()
    {
        return Arrays.hashCode(typeArguments) ^ rawType.hashCode() ^ MoreTypes.access$200(ownerType);
    }

    public boolean isFullySpecified()
    {
_L2:
        return false;
        if (ownerType != null && !MoreTypes.access$100(ownerType) || !MoreTypes.access$100(rawType)) goto _L2; else goto _L1
_L1:
        Type atype[] = typeArguments;
        int j = atype.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (!MoreTypes.access$100(atype[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
        stringbuilder.append(MoreTypes.typeToString(rawType));
        if (typeArguments.length == 0)
        {
            return stringbuilder.toString();
        }
        stringbuilder.append("<").append(MoreTypes.typeToString(typeArguments[0]));
        for (int i = 1; i < typeArguments.length; i++)
        {
            stringbuilder.append(", ").append(MoreTypes.typeToString(typeArguments[i]));
        }

        return stringbuilder.append(">").toString();
    }

    public transient (Type type, Type type1, Type atype[])
    {
        if (type1 instanceof Class)
        {
            Class class1 = (Class)type1;
            int i;
            boolean flag;
            if (type != null || class1.getEnclosingClass() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $Preconditions.checkArgument(flag, "No owner type for enclosed %s", new Object[] {
                type1
            });
            if (type == null || class1.getEnclosingClass() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $Preconditions.checkArgument(flag, "Owner type for unenclosed %s", new Object[] {
                type1
            });
        }
        if (type == null)
        {
            type = null;
        } else
        {
            type = MoreTypes.canonicalize(type);
        }
        ownerType = type;
        rawType = MoreTypes.canonicalize(type1);
        typeArguments = (Type[])atype.clone();
        for (i = 0; i < typeArguments.length; i++)
        {
            $Preconditions.checkNotNull(typeArguments[i], "type parameter");
            MoreTypes.access$000(typeArguments[i], "type parameters");
            typeArguments[i] = MoreTypes.canonicalize(typeArguments[i]);
        }

    }
}
