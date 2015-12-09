// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.Comparator;

// Referenced classes of package com.crashlytics.android.internal:
//            l, j

final class k
    implements Comparator
{

    k(j j)
    {
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (l)obj;
        obj1 = (l)obj1;
        return (int)(((l) (obj)).b - ((l) (obj1)).b);
    }
}
