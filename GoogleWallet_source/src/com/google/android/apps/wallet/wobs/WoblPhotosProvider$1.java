// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WoblPhotosProvider

final class 
    implements Predicate
{

    private static boolean apply(com.google.wallet.proto.et et)
    {
        return et.imageWidget != null;
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((com.google.wallet.proto.et)obj);
    }

    ()
    {
    }
}
