// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;

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
            LoyaltyEnrollmentActivity.access$1000(LoyaltyEnrollmentActivity.this).setVisibility(0);
            if (UtilityMethods.canGetLocation(getActivity()))
            {
                LoyaltyEnrollmentActivity.access$1100(LoyaltyEnrollmentActivity.this);
            }
        } else
        {
            LoyaltyEnrollmentActivity.access$1000(LoyaltyEnrollmentActivity.this).setVisibility(8);
        }
        LoyaltyEnrollmentActivity.access$700(LoyaltyEnrollmentActivity.this);
    }

    ()
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
    }
}
