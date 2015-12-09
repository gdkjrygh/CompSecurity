// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.controllers.CouponWizardController;

// Referenced classes of package com.dominos.activities:
//            LabsCouponWizardActivity

class Callback extends com.dominos.utils.ctionCallback
{

    final LabsCouponWizardActivity this$0;

    public void onNegativeButtonClicked()
    {
    }

    public void onNeutralButtonClicked()
    {
    }

    public void onPositiveButtonClicked()
    {
        LabsCouponWizardActivity.access$000(LabsCouponWizardActivity.this).removeCoupon(LabsCouponWizardActivity.access$500(LabsCouponWizardActivity.this));
    }

    Callback()
    {
        this$0 = LabsCouponWizardActivity.this;
        super();
    }
}
