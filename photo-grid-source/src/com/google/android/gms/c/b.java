// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.c:
//            d, a

final class b
    implements Comparator
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (d)obj;
        obj1 = (d)obj1;
        return obj.getClass().getCanonicalName().compareTo(obj1.getClass().getCanonicalName());
    }
}
