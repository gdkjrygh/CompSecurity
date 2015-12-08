// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.service.NetflixService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient:
//            NetflixApplication, Log

class this._cls0 extends BroadcastReceiver
{

    final NetflixApplication this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("NetflixApplication", 2))
        {
            Log.v("NetflixApplication", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED".equals(context))
        {
            Log.d("NetflixApplication", "Netflix service is destroyed");
            NetflixApplication.access$000(NetflixApplication.this).set(false);
        } else
        {
            if ("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE".equals(context))
            {
                int i = intent.getIntExtra("status_code", -1);
                if (Log.isLoggable("NetflixApplication", 3))
                {
                    Log.d("NetflixApplication", (new StringBuilder()).append("Netflix service is ready with status ").append(i).toString());
                }
                if (NetflixService.isServiceReady(i))
                {
                    Log.d("NetflixApplication", " Netflix application is ready");
                    NetflixApplication.access$000(NetflixApplication.this).set(true);
                    return;
                } else
                {
                    Log.d("NetflixApplication", " Netflix application is NOT ready");
                    NetflixApplication.access$000(NetflixApplication.this).set(false);
                    return;
                }
            }
            if (Log.isLoggable("NetflixApplication", 3))
            {
                Log.d("NetflixApplication", (new StringBuilder()).append("We do not support action ").append(context).toString());
                return;
            }
        }
    }

    e()
    {
        this$0 = NetflixApplication.this;
        super();
    }
}
