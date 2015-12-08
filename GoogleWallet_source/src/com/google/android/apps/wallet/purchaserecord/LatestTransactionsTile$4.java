// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.common.base.Optional;
import java.util.Comparator;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            LatestTransactionsTile, PurchaseRecord

final class this._cls0
    implements Comparator
{

    final LatestTransactionsTile this$0;

    private static int compare(PurchaseRecord purchaserecord, PurchaseRecord purchaserecord1)
    {
        long l = ((Long)purchaserecord.getTransactionTimeInMillis().or(Long.valueOf(0x7fffffffffffffffL))).longValue();
        long l1 = ((Long)purchaserecord1.getTransactionTimeInMillis().or(Long.valueOf(0x7fffffffffffffffL))).longValue();
        if (l == l1)
        {
            return 0;
        }
        return l >= l1 ? -1 : 1;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((PurchaseRecord)obj, (PurchaseRecord)obj1);
    }

    ()
    {
        this$0 = LatestTransactionsTile.this;
        super();
    }
}
