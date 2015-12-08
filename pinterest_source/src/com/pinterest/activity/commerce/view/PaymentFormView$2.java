// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            PaymentFormView

class val.view
    implements Runnable
{

    final PaymentFormView this$0;
    final View val$view;

    public void run()
    {
        if (val$view == null)
        {
            return;
        } else
        {
            Device.showSoftKeyboard(val$view);
            return;
        }
    }

    ()
    {
        this$0 = final_paymentformview;
        val$view = View.this;
        super();
    }
}
