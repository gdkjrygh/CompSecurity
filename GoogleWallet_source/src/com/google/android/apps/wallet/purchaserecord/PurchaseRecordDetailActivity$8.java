// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordDetailActivity, InferredMerchantFeedbackManager

final class val.geoMerchantDocid
    implements Callable
{

    final PurchaseRecordDetailActivity this$0;
    final String val$geoMerchantDocid;
    final String val$transactionId;

    private com.google.wallet.proto.api.onGeoMerchantFeedbackResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.onGeoMerchantFeedbackRequest ongeomerchantfeedbackrequest = new com.google.wallet.proto.api.onGeoMerchantFeedbackRequest();
        ongeomerchantfeedbackrequest.transactionId = val$transactionId;
        ongeomerchantfeedbackrequest.feedbackValue = Integer.valueOf(0);
        ongeomerchantfeedbackrequest.geoMerchant = new com.google.wallet.proto.api.onGeoMerchantFeedbackRequest.GeoMerchant();
        ongeomerchantfeedbackrequest.geoMerchant.locationDocid = Long.valueOf(Long.parseLong(val$geoMerchantDocid));
        return inferredMerchantFeedbackManager.sendFeedback(ongeomerchantfeedbackrequest);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ackResponse()
    {
        this$0 = final_purchaserecorddetailactivity;
        val$transactionId = s;
        val$geoMerchantDocid = String.this;
        super();
    }
}
