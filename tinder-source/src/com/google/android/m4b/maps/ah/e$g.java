// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            e

static final class a
    implements Serializable, WildcardType
{

    private static final long serialVersionUID = 0L;
    private final ae a;
    private final ae b;

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof WildcardType)
        {
            obj = (WildcardType)obj;
            flag = flag1;
            if (a.equals(Arrays.asList(((WildcardType) (obj)).getLowerBounds())))
            {
                flag = flag1;
                if (b.equals(Arrays.asList(((WildcardType) (obj)).getUpperBounds())))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final Type[] getLowerBounds()
    {
        return e.a(a);
    }

    public final Type[] getUpperBounds()
    {
        return e.a(b);
    }

    public final int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("?");
        Type type;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(" super ").append(e.b(type)))
        {
            type = (Type)iterator.next();
        }

        Type type1;
        for (Iterator iterator1 = e.a(b).iterator(); iterator1.hasNext(); stringbuilder.append(" extends ").append(e.b(type1)))
        {
            type1 = (Type)iterator1.next();
        }

        return stringbuilder.toString();
    }

    (Type atype[], Type atype1[])
    {
        e.a(atype, "lower bound for wildcard");
        e.a(atype1, "upper bound for wildcard");
        a = a.a(atype);
        b = a.a(atype1);
    }
}
