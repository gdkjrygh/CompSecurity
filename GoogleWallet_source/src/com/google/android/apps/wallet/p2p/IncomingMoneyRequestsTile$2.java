// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestsTile

final class this._cls0
    implements Function
{

    final IncomingMoneyRequestsTile this$0;

    private static String apply(PurchaseRecord purchaserecord)
    {
        return purchaserecord.getCounterPartyEmail();
    }

    public final volatile Object apply(Object obj)
    {
        return apply((PurchaseRecord)obj);
    }

    ()
    {
        this$0 = IncomingMoneyRequestsTile.this;
        super();
    }
}
