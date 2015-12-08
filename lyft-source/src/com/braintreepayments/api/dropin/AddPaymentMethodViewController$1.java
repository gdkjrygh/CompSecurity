// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.view.View;
import android.widget.ScrollView;

// Referenced classes of package com.braintreepayments.api.dropin:
//            AddPaymentMethodViewController

class val.field
    implements Runnable
{

    final AddPaymentMethodViewController this$0;
    final View val$field;

    public void run()
    {
        AddPaymentMethodViewController.access$000(AddPaymentMethodViewController.this).smoothScrollTo(0, val$field.getTop());
    }

    ()
    {
        this$0 = final_addpaymentmethodviewcontroller;
        val$field = View.this;
        super();
    }
}
