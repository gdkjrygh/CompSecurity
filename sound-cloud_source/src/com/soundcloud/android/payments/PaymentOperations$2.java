// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            PurchaseStatus

final class _cls9
    implements f
{

    public final Boolean call(PurchaseStatus purchasestatus)
    {
        boolean flag;
        if (!purchasestatus.isPending())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((PurchaseStatus)obj);
    }

    _cls9()
    {
    }
}
