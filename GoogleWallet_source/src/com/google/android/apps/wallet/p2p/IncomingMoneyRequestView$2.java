// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Context;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.transfer.api.TransferApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestView

final class val.requester
    implements android.view.ingMoneyRequestView._cls2
{

    final IncomingMoneyRequestView this$0;
    final PurchaseRecord val$purchaseRecord;
    final Contact val$requester;

    public final void onClick(View view)
    {
        analyticsUtil.sendButtonTap("AcceptIncomingMoneyRequest", new AnalyticsCustomDimension[0]);
        getContext().startActivity(TransferApi.createSettleRequestIntent(getContext(), val$purchaseRecord.getId(), val$purchaseRecord.getTotalAmountMicros(), val$purchaseRecord.getTotalAmountCurrencyCode(), val$purchaseRecord.getMemo(), val$requester, featureManager));
    }

    ion()
    {
        this$0 = final_incomingmoneyrequestview;
        val$purchaseRecord = purchaserecord;
        val$requester = Contact.this;
        super();
    }
}
