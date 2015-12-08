// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

// Referenced classes of package retrofit:
//            Types

final class upperBound
    implements WildcardType
{

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
            return Types.access$200();
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

    public on(Type atype[], Type atype1[])
    {
        if (atype1.length > 1)
        {
            throw new IllegalArgumentException();
        }
        if (atype.length != 1)
        {
            throw new IllegalArgumentException();
        }
        if (atype1.length == 1)
        {
            if (atype1[0] == null)
            {
                throw new NullPointerException();
            }
            Types.access$000(atype1[0]);
            if (atype[0] != java/lang/Object)
            {
                throw new IllegalArgumentException();
            } else
            {
                lowerBound = atype1[0];
                upperBound = java/lang/Object;
                return;
            }
        }
        if (atype[0] == null)
        {
            throw new NullPointerException();
        } else
        {
            Types.access$000(atype[0]);
            lowerBound = null;
            upperBound = atype[0];
            return;
        }
    }
}
