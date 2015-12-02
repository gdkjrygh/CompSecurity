// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

// Referenced classes of package com.google.inject.a:
//            e, d

public class g
    implements e, Serializable, ParameterizedType
{

    private final Type a;
    private final Type b;
    private final Type c[];

    public transient g(Type type, Type type1, Type atype[])
    {
        int i = 0;
        super();
        if (type1 instanceof Class)
        {
            Class class1 = (Class)type1;
            boolean flag;
            if (type != null || class1.getEnclosingClass() == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "No owner type for enclosed %s", new Object[] {
                type1
            });
            if (type == null || class1.getEnclosingClass() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Owner type for unenclosed %s", new Object[] {
                type1
            });
        }
        if (type == null)
        {
            type = null;
        } else
        {
            type = d.a(type);
        }
        a = type;
        b = d.a(type1);
        for (c = (Type[])atype.clone(); i < c.length; i++)
        {
            Preconditions.checkNotNull(c[i], "type parameter");
            d.a(c[i], "type parameters");
            c[i] = d.a(c[i]);
        }

    }

    public boolean a()
    {
_L2:
        return false;
        if (a != null && !d.d(a) || !d.d(b)) goto _L2; else goto _L1
_L1:
        Type atype[] = c;
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
                if (!d.d(atype[i]))
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

    public boolean equals(Object obj)
    {
        return (obj instanceof ParameterizedType) && d.a(this, (ParameterizedType)obj);
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
        return Arrays.hashCode(c) ^ b.hashCode() ^ d.a(a);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((c.length + 1) * 30);
        stringbuilder.append(d.c(b));
        if (c.length == 0)
        {
            return stringbuilder.toString();
        }
        stringbuilder.append("<").append(d.c(c[0]));
        for (int i = 1; i < c.length; i++)
        {
            stringbuilder.append(", ").append(d.c(c[i]));
        }

        return stringbuilder.append(">").toString();
    }
}
