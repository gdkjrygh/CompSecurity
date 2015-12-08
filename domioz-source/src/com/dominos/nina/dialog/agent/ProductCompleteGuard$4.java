// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.activities.CartActivity;
import com.dominos.activities.CartActivity_;
import com.dominos.activities.LabsCouponWizardActivity_;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            ProductCompleteGuard

class stination
    implements Runnable
{

    final ProductCompleteGuard this$0;
    final Activity val$activity;
    final stination val$destination;

    public void run()
    {
label0:
        {
            if (!(val$activity instanceof CartActivity))
            {
                if (val$destination != stination.COUPON_WIZARD)
                {
                    break label0;
                }
                ((com.dominos.activities.y_.IntentBuilder_)LabsCouponWizardActivity_.intent(val$activity).flags(0x4000000)).start();
            }
            return;
        }
        ((com.dominos.activities.lder_)CartActivity_.intent(val$activity).flags(0x4000000)).start();
    }

    stination()
    {
        this$0 = final_productcompleteguard;
        val$activity = activity1;
        val$destination = stination.this;
        super();
    }
}
