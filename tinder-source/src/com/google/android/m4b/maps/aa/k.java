// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            q

final class k extends q
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private Comparator a;

    k(Comparator comparator)
    {
        a = (Comparator)j.a(comparator);
    }

    public final int compare(Object obj, Object obj1)
    {
        return a.compare(obj, obj1);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof k)
        {
            obj = (k)obj;
            return a.equals(((k) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }
}
