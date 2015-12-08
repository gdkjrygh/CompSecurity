// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

static final class nonicalize
    implements Serializable, WildcardType
{

    private final Type a;
    private final Type b;

    public final boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && uals(this, (WildcardType)obj);
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
            return (new StringBuilder("? super ")).append(peToString(b)).toString();
        }
        if (a == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder("? extends ")).append(peToString(a)).toString();
        }
    }

    public tions(Type atype[], Type atype1[])
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
        tions.checkArgument(flag);
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        tions.checkArgument(flag);
        if (atype1.length == 1)
        {
            tions.checkNotNull(atype1[0]);
            tions.checkNotNull(atype1[0]);
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            tions.checkArgument(flag);
            b = nonicalize(atype1[0]);
            a = java/lang/Object;
            return;
        } else
        {
            tions.checkNotNull(atype[0]);
            tions.checkNotNull(atype[0]);
            b = null;
            a = nonicalize(atype[0]);
            return;
        }
    }
}
