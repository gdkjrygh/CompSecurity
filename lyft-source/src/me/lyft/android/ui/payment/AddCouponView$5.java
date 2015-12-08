// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.payment:
//            AddCouponView

class this._cls0
    implements android.view.geListener
{

    final AddCouponView this$0;

    public void onFocusChange(View view, boolean flag)
    {
        boolean flag1 = true;
        if (flag)
        {
            applyCouponButton.setVisibility(0);
            view = applyCouponButton;
            if (couponEditText.length() > 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
        }
    }

    ()
    {
        this$0 = AddCouponView.this;
        super();
    }
}
