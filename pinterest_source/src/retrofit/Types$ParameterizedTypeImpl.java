// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

// Referenced classes of package retrofit:
//            Types

final class 
    implements ParameterizedType
{

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
        stringbuilder.append("<").append(Types.typeToString(typeArguments[0]));
        for (int i = 1; i < typeArguments.length; i++)
        {
            stringbuilder.append(", ").append(Types.typeToString(typeArguments[i]));
        }

        return stringbuilder.append(">").toString();
    }

    public transient (Type type, Type type1, Type atype[])
    {
        int j = 1;
        boolean flag1 = false;
        super();
        if (type1 instanceof Class)
        {
            boolean flag;
            if (type == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (((Class)type1).getEnclosingClass() != null)
            {
                j = 0;
            }
            if (flag != j)
            {
                throw new IllegalArgumentException();
            }
        }
        ownerType = type;
        rawType = type1;
        typeArguments = (Type[])atype.clone();
        type = typeArguments;
        j = type.length;
        for (int i = ((flag1) ? 1 : 0); i < j; i++)
        {
            type1 = type[i];
            if (type1 == null)
            {
                throw new NullPointerException();
            }
            Types.access$000(type1);
        }

    }
}
