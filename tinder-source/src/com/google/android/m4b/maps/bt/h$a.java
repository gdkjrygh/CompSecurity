// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            h, l

final class a
    implements Comparator
{

    private h a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (l)obj;
        obj1 = (l)obj1;
        return Float.compare(((l) (obj)).b(), ((l) (obj1)).b());
    }

    (h h1)
    {
        a = h1;
        super();
    }
}
