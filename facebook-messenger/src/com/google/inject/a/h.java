// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.inject.a:
//            e, d

public class h
    implements e, Serializable, WildcardType
{

    private final Type a;
    private final Type b;

    public h(Type atype[], Type atype1[])
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (atype1.length <= 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must have at most one lower bound.");
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must have exactly one upper bound.");
        if (atype1.length == 1)
        {
            Preconditions.checkNotNull(atype1[0], "lowerBound");
            d.a(atype1[0], "wildcard bounds");
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "bounded both ways");
            b = d.a(atype1[0]);
            a = java/lang/Object;
            return;
        } else
        {
            Preconditions.checkNotNull(atype[0], "upperBound");
            d.a(atype[0], "wildcard bounds");
            b = null;
            a = d.a(atype[0]);
            return;
        }
    }

    public boolean a()
    {
        return d.d(a) && (b == null || d.d(b));
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && d.a(this, (WildcardType)obj);
    }

    public Type[] getLowerBounds()
    {
        if (b != null)
        {
            return (new Type[] {
                b
            });
        } else
        {
            return d.a;
        }
    }

    public Type[] getUpperBounds()
    {
        return (new Type[] {
            a
        });
    }

    public int hashCode()
    {
        int i;
        if (b != null)
        {
            i = b.hashCode() + 31;
        } else
        {
            i = 1;
        }
        return i ^ a.hashCode() + 31;
    }

    public String toString()
    {
        if (b != null)
        {
            return (new StringBuilder()).append("? super ").append(d.c(b)).toString();
        }
        if (a == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder()).append("? extends ").append(d.c(a)).toString();
        }
    }
}
