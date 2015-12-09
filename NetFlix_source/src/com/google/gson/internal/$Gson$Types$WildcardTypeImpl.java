// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

private static final class upperBound
    implements WildcardType, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Type lowerBound;
    private final Type upperBound;

    public boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && upperBound(this, (WildcardType)obj);
    }

    public Type[] getLowerBounds()
    {
        if (lowerBound != null)
        {
            return (new Type[] {
                lowerBound
            });
        } else
        {
            return lowerBound;
        }
    }

    public Type[] getUpperBounds()
    {
        return (new Type[] {
            upperBound
        });
    }

    public int hashCode()
    {
        int i;
        if (lowerBound != null)
        {
            i = lowerBound.hashCode() + 31;
        } else
        {
            i = 1;
        }
        return i ^ upperBound.hashCode() + 31;
    }

    public String toString()
    {
        if (lowerBound != null)
        {
            return (new StringBuilder()).append("? super ").append(lowerBound(lowerBound)).toString();
        }
        if (upperBound == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder()).append("? extends ").append(upperBound(upperBound)).toString();
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
        ment(flag);
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ment(flag);
        if (atype1.length == 1)
        {
            ull(atype1[0]);
            ull(atype1[0]);
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ment(flag);
            lowerBound = lowerBound(atype1[0]);
            upperBound = java/lang/Object;
            return;
        } else
        {
            ull(atype[0]);
            ull(atype[0]);
            lowerBound = null;
            upperBound = upperBound(atype[0]);
            return;
        }
    }
}
