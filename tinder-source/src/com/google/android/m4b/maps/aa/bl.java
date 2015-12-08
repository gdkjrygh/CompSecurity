// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            q, ba

final class bl extends q
    implements Serializable
{

    static final bl a = new bl();
    private static final long serialVersionUID = 0L;

    private bl()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public final q a()
    {
        return ba.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        j.a(obj);
        if (obj == obj1)
        {
            return 0;
        } else
        {
            return ((Comparable) (obj1)).compareTo(obj);
        }
    }

    public final String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
