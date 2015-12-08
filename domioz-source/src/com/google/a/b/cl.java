// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.io.Serializable;

// Referenced classes of package com.google.a.b:
//            cn, cv

final class cl extends cn
    implements Serializable
{

    static final cl a = new cl();

    private cl()
    {
    }

    public final cn a()
    {
        return cv.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        ad.a(obj);
        ad.a(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public final String toString()
    {
        return "Ordering.natural()";
    }

}
