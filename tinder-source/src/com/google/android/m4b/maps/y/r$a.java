// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.y:
//            q, r, h

public static final class a
    implements q, Serializable
{

    private static final long serialVersionUID = 0L;
    private Object a;

    public final Object a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            obj = (a)obj;
            return h.a(a, ((a) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Suppliers.ofInstance(")).append(a).append(")").toString();
    }

    public (Object obj)
    {
        a = obj;
    }
}
