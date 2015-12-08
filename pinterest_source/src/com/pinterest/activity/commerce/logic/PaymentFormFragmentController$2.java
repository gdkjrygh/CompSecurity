// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            PaymentFormFragmentController

class val.braintree
    implements com.braintreepayments.api.ontroller._cls2
{

    final PaymentFormFragmentController this$0;
    final Braintree val$braintree;

    public void onRecoverableError(ErrorWithResponse errorwithresponse)
    {
        CrashReporting.a(errorwithresponse);
        PaymentFormFragmentController.access$300(PaymentFormFragmentController.this, val$braintree);
    }

    public void onUnrecoverableError(Throwable throwable)
    {
        CrashReporting.a(throwable);
        PaymentFormFragmentController.access$300(PaymentFormFragmentController.this, val$braintree);
    }

    ()
    {
        this$0 = final_paymentformfragmentcontroller;
        val$braintree = Braintree.this;
        super();
    }
}
