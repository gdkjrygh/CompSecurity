// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class blb
    implements Serializable, WildcardType
{

    private static final long serialVersionUID = 0L;
    private final Type a;
    private final Type b;

    public blb(Type atype[], Type atype1[])
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
        bkx.a(flag);
        if (atype.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bkx.a(flag);
        if (atype1.length == 1)
        {
            bkx.a(atype1[0]);
            bky.e(atype1[0]);
            if (atype[0] == java/lang/Object)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            bkx.a(flag);
            b = bky.a(atype1[0]);
            a = java/lang/Object;
            return;
        } else
        {
            bkx.a(atype[0]);
            bky.e(atype[0]);
            b = null;
            a = bky.a(atype[0]);
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof WildcardType) && bky.a(this, (WildcardType)obj);
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
            return bky.a;
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
            return (new StringBuilder("? super ")).append(bky.c(b)).toString();
        }
        if (a == java/lang/Object)
        {
            return "?";
        } else
        {
            return (new StringBuilder("? extends ")).append(bky.c(a)).toString();
        }
    }
}
