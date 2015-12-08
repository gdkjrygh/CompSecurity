// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.inject.internal:
//            MoreTypes

public static class upperBound
    implements WildcardType, Serializable, upperBound
{

    private static final long serialVersionUID = 0L;
    private final Type lowerBound;
    private final Type upperBound;

    public boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && MoreTypes.equals(this, (WildcardType)obj);
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
            return MoreTypes.EMPTY_TYPE_ARRAY;
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

    public boolean isFullySpecified()
    {
        return MoreTypes.access$100(upperBound) && (lowerBound == null || MoreTypes.access$100(lowerBound));
    }

    public String toString()
    {
        if (lowerBound != null)
        {
            return (new StringBuilder()).append("? super ").append(MoreTypes.typeToString(lowerBound)).toString();
        }
        if (upperBound == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder()).append("? extends ").append(MoreTypes.typeToString(upperBound)).toString();
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
        $Preconditions.checkArgument(flag, "Must have at most one lower bound.");
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkArgument(flag, "Must have exactly one upper bound.");
        if (atype1.length == 1)
        {
            $Preconditions.checkNotNull(atype1[0], "lowerBound");
            MoreTypes.access$000(atype1[0], "wildcard bounds");
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            $Preconditions.checkArgument(flag, "bounded both ways");
            lowerBound = MoreTypes.canonicalize(atype1[0]);
            upperBound = java/lang/Object;
            return;
        } else
        {
            $Preconditions.checkNotNull(atype[0], "upperBound");
            MoreTypes.access$000(atype[0], "wildcard bounds");
            lowerBound = null;
            upperBound = MoreTypes.canonicalize(atype[0]);
            return;
        }
    }
}
