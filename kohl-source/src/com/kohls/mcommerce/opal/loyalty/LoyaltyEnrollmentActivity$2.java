// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity

class this._cls0
    implements android.widget.geListener
{

    final LoyaltyEnrollmentActivity this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            LoyaltyEnrollmentActivity.access$800(LoyaltyEnrollmentActivity.this).setChecked(false);
            LoyaltyEnrollmentActivity.access$900(LoyaltyEnrollmentActivity.this).setVisibility(0);
            LoyaltyEnrollmentActivity.access$600(LoyaltyEnrollmentActivity.this).setText(getString(0x7f08039b));
        } else
        {
            LoyaltyEnrollmentActivity.access$800(LoyaltyEnrollmentActivity.this).setChecked(true);
            LoyaltyEnrollmentActivity.access$900(LoyaltyEnrollmentActivity.this).setVisibility(8);
            LoyaltyEnrollmentActivity.access$600(LoyaltyEnrollmentActivity.this).setText(getString(0x7f0804a1));
        }
        LoyaltyEnrollmentActivity.access$700(LoyaltyEnrollmentActivity.this);
    }

    ()
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
    }
}
