// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal:
//            r, k

final class m
    implements Comparator
{

    final k a;

    m(k k)
    {
        a = k;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (r)obj;
        obj1 = (r)obj1;
        return (int)(((r) (obj)).a - ((r) (obj1)).a);
    }
}
