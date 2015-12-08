// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent

class this._cls0 extends BroadcastReceiver
{

    final BrowseAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            Log.i("nf_service_browseagent", (new StringBuilder()).append("UserAgentIntentReceiver inovoked and received Intent with Action ").append(intent.getAction()).toString());
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(context))
            {
                BrowseAgent.access$5800(BrowseAgent.this);
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE".equals(context))
            {
                BrowseAgent.access$5900(BrowseAgent.this);
                return;
            }
        }
    }

    ()
    {
        this$0 = BrowseAgent.this;
        super();
    }
}
