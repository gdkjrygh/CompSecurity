// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            q, bl

final class ba extends q
    implements Serializable
{

    static final ba a = new ba();
    private static final long serialVersionUID = 0L;

    private ba()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public final q a()
    {
        return bl.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        j.a(obj);
        j.a(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public final String toString()
    {
        return "Ordering.natural()";
    }

}
