// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordManager, PurchaseRecord

final class this._cls0
    implements Function
{

    final PurchaseRecordManager this$0;

    private static PurchaseRecord apply(com.google.checkout.commonui.purchaserecord.proto..ClientPurchaseRecord clientpurchaserecord)
    {
        if (clientpurchaserecord == null)
        {
            return null;
        } else
        {
            return PurchaseRecord.fromClientPurchaseRecord(clientpurchaserecord);
        }
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.checkout.commonui.purchaserecord.proto..ClientPurchaseRecord)obj);
    }

    cord.ClientPurchaseRecord()
    {
        this$0 = PurchaseRecordManager.this;
        super();
    }
}
