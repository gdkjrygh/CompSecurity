// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.d:
//            ab, x

class y
    implements Comparator
{

    final x a;

    y(x x)
    {
        a = x;
        super();
    }

    public int a(ab ab1, ab ab2)
    {
        return ab1.getClass().getCanonicalName().compareTo(ab2.getClass().getCanonicalName());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((ab)obj, (ab)obj1);
    }
}
