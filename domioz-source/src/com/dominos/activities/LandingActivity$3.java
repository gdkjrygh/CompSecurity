// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.utils.ActivityHelper;

// Referenced classes of package com.dominos.activities:
//            LandingActivity

class ack extends com.dominos.beacon.manager.onCheckInCallback
{

    final LandingActivity this$0;

    public void onCheckInFailed()
    {
        LogUtil.d(LandingActivity.access$200(), "Profiled customer check in failed!", new Object[0]);
    }

    public void onCheckInSuccess()
    {
        mActivityHelper.showAlert(getString(0x7f080360), getString(0x7f08035f), null);
    }

    BeaconCheckInCallback()
    {
        this$0 = LandingActivity.this;
        super();
    }
}
