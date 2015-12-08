// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.reporting.CrashReporting;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Token;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            PaymentFormFragmentController

class this._cls0 extends TokenCallback
{

    final PaymentFormFragmentController this$0;

    public void onError(Exception exception)
    {
        CrashReporting.a(exception);
        PaymentFormFragmentController.access$002(PaymentFormFragmentController.this, true);
        PaymentFormFragmentController.access$100(PaymentFormFragmentController.this);
    }

    public void onSuccess(Token token)
    {
        PaymentFormFragmentController.access$202(PaymentFormFragmentController.this, token.getId());
        PaymentFormFragmentController.access$100(PaymentFormFragmentController.this);
    }

    ()
    {
        this$0 = PaymentFormFragmentController.this;
        super();
    }
}
