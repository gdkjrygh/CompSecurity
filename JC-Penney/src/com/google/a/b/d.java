// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

// Referenced classes of package com.google.a.b:
//            a, b

final class d
    implements Serializable, ParameterizedType
{

    private final Type a;
    private final Type b;
    private final Type c[];

    public transient d(Type type, Type type1, Type atype[])
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
            com.google.a.b.a.a(flag1);
        }
        if (type == null)
        {
            type = null;
        } else
        {
            type = com.google.a.b.b.d(type);
        }
        a = type;
        b = com.google.a.b.b.d(type1);
        c = (Type[])atype.clone();
        for (i = ((flag) ? 1 : 0); i < c.length; i++)
        {
            com.google.a.b.a.a(c[i]);
            com.google.a.b.b.h(c[i]);
            c[i] = com.google.a.b.b.d(c[i]);
        }

    }

    public boolean equals(Object obj)
    {
        return (obj instanceof ParameterizedType) && com.google.a.b.b.a(this, (ParameterizedType)obj);
    }

    public Type[] getActualTypeArguments()
    {
        return (Type[])c.clone();
    }

    public Type getOwnerType()
    {
        return a;
    }

    public Type getRawType()
    {
        return b;
    }

    public int hashCode()
    {
        return Arrays.hashCode(c) ^ b.hashCode() ^ com.google.a.b.b.a(a);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((c.length + 1) * 30);
        stringbuilder.append(com.google.a.b.b.f(b));
        if (c.length == 0)
        {
            return stringbuilder.toString();
        }
        stringbuilder.append("<").append(com.google.a.b.b.f(c[0]));
        for (int i = 1; i < c.length; i++)
        {
            stringbuilder.append(", ").append(com.google.a.b.b.f(c[i]));
        }

        return stringbuilder.append(">").toString();
    }
}
