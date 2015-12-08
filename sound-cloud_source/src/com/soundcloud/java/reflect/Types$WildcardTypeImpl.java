// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.reflect;

import com.soundcloud.java.checks.Preconditions;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.soundcloud.java.reflect:
//            Types

private static final class upperBound
    implements Serializable, WildcardType
{

    private static final long serialVersionUID = 0L;
    private final Type lowerBound;
    private final Type upperBound;

    public final boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && Types.equals(this, (WildcardType)obj);
    }

    public final Type[] getLowerBounds()
    {
        if (lowerBound != null)
        {
            return (new Type[] {
                lowerBound
            });
        } else
        {
            return Types.EMPTY_TYPE_ARRAY;
        }
    }

    public final Type[] getUpperBounds()
    {
        return (new Type[] {
            upperBound
        });
    }

    public final int hashCode()
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

    public final String toString()
    {
        if (lowerBound != null)
        {
            return (new StringBuilder("? super ")).append(Types.typeToString(lowerBound)).toString();
        }
        if (upperBound == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder("? extends ")).append(Types.typeToString(upperBound)).toString();
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
        Preconditions.checkArgument(flag);
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (atype1.length == 1)
        {
            Preconditions.checkNotNull(atype1[0]);
            Types.access$000(atype1[0]);
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            lowerBound = Types.canonicalize(atype1[0]);
            upperBound = java/lang/Object;
            return;
        } else
        {
            Preconditions.checkNotNull(atype[0]);
            Types.access$000(atype[0]);
            lowerBound = null;
            upperBound = Types.canonicalize(atype[0]);
            return;
        }
    }
}
