// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, PurchaseRecord

final class val.status
    implements Predicate
{

    final String val$id;
    final Integer val$status;

    private boolean apply(PurchaseRecord purchaserecord)
    {
        return val$id.equals(purchaserecord.getId()) && val$status.equals(purchaserecord.getStatus());
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((PurchaseRecord)obj);
    }

    ()
    {
        val$id = s;
        val$status = integer;
        super();
    }
}
