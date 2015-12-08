// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity, LandingActivity_

class this._cls0 extends BroadcastReceiver
{

    final TrackerActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        LogUtil.d(".notification.", "Tracker status received", new Object[0]);
        if (StringHelper.equalsIgnoreCase(intent.getAction(), "com.dominos.notifications.tracker"))
        {
            String s = intent.getStringExtra("tracker-status");
            if (StringHelper.equals(s, "tracking-progress"))
            {
                int i = intent.getIntExtra("tracker-index", 0);
                TrackerActivity.access$002(TrackerActivity.this, (TrackerResult)intent.getParcelableExtra("tracker-result"));
                if (TrackerActivity.access$000(TrackerActivity.this) != null)
                {
                    mOrderStatus = (TrackerOrderStatus)TrackerActivity.access$000(TrackerActivity.this).getOrderStatuses().get(i);
                    TrackerActivity.access$100(TrackerActivity.this, mOrderStatus);
                }
            } else
            {
                if (StringHelper.equals(s, "tracking-timedout"))
                {
                    showTrackerNotAvailableDialog();
                    return;
                }
                if (StringHelper.equals(s, "tracking-completed"))
                {
                    LogUtil.d(TrackerActivity.access$200(), "stopping and going to landing", new Object[0]);
                    ((ntentBuilder_)LandingActivity_.intent(context).flags(0x4000000)).start();
                    finish();
                    return;
                }
            }
        }
    }

    ntentBuilder_()
    {
        this$0 = TrackerActivity.this;
        super();
    }
}
