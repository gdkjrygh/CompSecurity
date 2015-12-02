// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class bla
    implements Serializable, ParameterizedType
{

    private static final long serialVersionUID = 0L;
    private final Type a;
    private final Type b;
    private final Type c[];

    public transient bla(Type type, Type type1, Type atype[])
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
            bkx.a(flag1);
        }
        if (type == null)
        {
            type = null;
        } else
        {
            type = bky.a(type);
        }
        a = type;
        b = bky.a(type1);
        c = (Type[])atype.clone();
        for (i = ((flag) ? 1 : 0); i < c.length; i++)
        {
            bkx.a(c[i]);
            bky.e(c[i]);
            c[i] = bky.a(c[i]);
        }

    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof ParameterizedType) && bky.a(this, (ParameterizedType)obj);
    }

    public final Type[] getActualTypeArguments()
    {
        return (Type[])c.clone();
    }

    public final Type getOwnerType()
    {
        return a;
    }

    public final Type getRawType()
    {
        return b;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(c) ^ b.hashCode() ^ bky.a(a);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((c.length + 1) * 30);
        stringbuilder.append(bky.c(b));
        if (c.length == 0)
        {
            return stringbuilder.toString();
        }
        stringbuilder.append("<").append(bky.c(c[0]));
        for (int i = 1; i < c.length; i++)
        {
            stringbuilder.append(", ").append(bky.c(c[i]));
        }

        return stringbuilder.append(">").toString();
    }
}
