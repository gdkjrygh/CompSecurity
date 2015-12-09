// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent

public final class this._cls0 extends BroadcastReceiver
{

    final UserAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            Log.i("nf_service_useragent", (new StringBuilder()).append("PlayStopReceiver inovoked and received Intent with Action ").append(context).toString());
            if ("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP".equals(context))
            {
                if (getCurrentProfileId() != null && UserAgent.access$3500(UserAgent.this) != null)
                {
                    Log.i("nf_service_useragent", "Starting userProfile fetch ");
                    fetchProfileData(getCurrentProfileId());
                    return;
                } else
                {
                    Log.i("nf_service_useragent", "canDoDataFetches false - skipping fetchProfileData request");
                    return;
                }
            }
        }
    }

    public ()
    {
        this$0 = UserAgent.this;
        super();
    }
}
