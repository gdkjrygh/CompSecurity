// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.gson.internal:
//            a

private static final class a
    implements Serializable, WildcardType
{

    private static final long serialVersionUID = 0L;
    private final Type a;
    private final Type b;

    public final boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && a(this, (WildcardType)obj);
    }

    public final Type[] getLowerBounds()
    {
        if (b != null)
        {
            return (new Type[] {
                b
            });
        } else
        {
            return b;
        }
    }

    public final Type[] getUpperBounds()
    {
        return (new Type[] {
            a
        });
    }

    public final int hashCode()
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

    public final String toString()
    {
        if (b != null)
        {
            return (new StringBuilder("? super ")).append(b(b)).toString();
        }
        if (a == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder("? extends ")).append(a(a)).toString();
        }
    }

    public (Type atype[], Type atype1[])
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
        com.google.gson.internal.a.a(flag);
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.gson.internal.a.a(flag);
        if (atype1.length == 1)
        {
            com.google.gson.internal.a.a(atype1[0]);
            (atype1[0]);
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            com.google.gson.internal.a.a(flag);
            b = b(atype1[0]);
            a = java/lang/Object;
            return;
        } else
        {
            com.google.gson.internal.a.a(atype[0]);
            a(atype[0]);
            b = null;
            a = a(atype[0]);
            return;
        }
    }
}
