// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.activities;

import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.beacon.activities:
//            BeaconCheckInActivity

class Callback extends com.dominos.beacon.manager.kInCallback
{

    final BeaconCheckInActivity this$0;

    public void onCheckInFailed()
    {
        BeaconCheckInActivity.access$400(BeaconCheckInActivity.this).postOnEventCheckinFailure();
        finish();
    }

    public void onCheckInSuccess()
    {
        class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
        {

            final BeaconCheckInActivity._cls2 this$1;

            public void onAlertDismissed()
            {
                finish();
            }

            _cls1()
            {
                this$1 = BeaconCheckInActivity._cls2.this;
                super();
            }
        }

        BeaconCheckInActivity.access$300(BeaconCheckInActivity.this).showAlert(getString(0x7f080360), getString(0x7f08035f), new _cls1());
    }

    _cls1()
    {
        this$0 = BeaconCheckInActivity.this;
        super();
    }
}
