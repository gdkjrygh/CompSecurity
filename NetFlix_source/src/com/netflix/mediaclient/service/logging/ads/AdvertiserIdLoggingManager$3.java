// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            AdvertiserIdLoggingManager

class this._cls0 extends BroadcastReceiver
{

    final AdvertiserIdLoggingManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_adv_id", 2))
        {
            Log.v("nf_adv_id", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN".equals(context))
        {
            Log.d("nf_adv_id", "onLogin");
            AdvertiserIdLoggingManager.access$600(AdvertiserIdLoggingManager.this);
        } else
        {
            if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT".equals(context))
            {
                Log.d("nf_adv_id", "onLogout");
                AdvertiserIdLoggingManager.access$700(AdvertiserIdLoggingManager.this);
                return;
            }
            if ("com.netflix.mediaclient.intent.action.ONSIGNUP".equals(context))
            {
                Log.d("nf_adv_id", "onSignUp");
                sendAdvertiserId(com.netflix.mediaclient.servicemgr..sign_up);
                return;
            }
            if (Log.isLoggable("nf_adv_id", 3))
            {
                Log.d("nf_adv_id", (new StringBuilder()).append("We do not support action ").append(context).toString());
                return;
            }
        }
    }

    ()
    {
        this$0 = AdvertiserIdLoggingManager.this;
        super();
    }
}
