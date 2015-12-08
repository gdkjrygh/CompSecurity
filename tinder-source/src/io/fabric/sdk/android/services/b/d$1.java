// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.b;

import java.util.Comparator;

// Referenced classes of package io.fabric.sdk.android.services.b:
//            d

final class a
    implements Comparator
{

    final d a;

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (a)obj;
        obj1 = (a)obj1;
        return (int)(((a) (obj)).b - ((b) (obj1)).b);
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
