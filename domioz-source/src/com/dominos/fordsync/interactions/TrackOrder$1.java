// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.interactions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.core.models.PromptCategoryModel;
import com.dominos.android.sdk.core.models.PrompterModel;
import com.dominos.fordsync.service.AppLinkManager;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.fordsync.interactions:
//            TrackOrder

class this._cls0 extends BroadcastReceiver
{

    final TrackOrder this$0;

    public void onReceive(Context context, Intent intent)
    {
        LogUtil.d("SyncInteraction", "Tracker status received", new Object[0]);
        if (intent.getAction().equalsIgnoreCase("com.dominos.notifications.tracker"))
        {
            if (StringHelper.equals(intent.getStringExtra("tracker-status"), "tracking-progress"))
            {
                TrackOrder.access$002(TrackOrder.this, (TrackerResult)intent.getParcelableExtra("tracker-result"));
                if (TrackOrder.access$000(TrackOrder.this) != null)
                {
                    int i = intent.getIntExtra("tracker-index", 0);
                    context = (TrackerOrderStatus)TrackOrder.access$000(TrackOrder.this).getOrderStatuses().get(i);
                    TrackOrder.access$100(TrackOrder.this, context);
                    TrackOrder.access$202(TrackOrder.this, 0);
                }
            }
            int _tmp = TrackOrder.access$208(TrackOrder.this);
            if (TrackOrder.access$200(TrackOrder.this) > 30)
            {
                TrackOrder.access$202(TrackOrder.this, 0);
                context = prompts.getPrompter("error_prompt").getPrompt("tracker_error");
                mAppLinkManager.alert(context, new Object[0]);
                TrackOrder.access$300(TrackOrder.this);
            }
        }
    }

    el()
    {
        this$0 = TrackOrder.this;
        super();
    }
}
