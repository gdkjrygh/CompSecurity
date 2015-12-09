// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService

class this._cls1
    implements Runnable
{

    final Broadcast this$1;

    public void run()
    {
        Log.v("NetflixService", "Sending show mini player intent");
        sendBroadcast(new Intent("com.netflix.mediaclient.service.ACTION_EXPAND_MDX_MINI_PLAYER"));
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/NetflixService$7

/* anonymous class */
    class NetflixService._cls7 extends BroadcastReceiver
    {

        final NetflixService this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null || !"com.netflix.mediaclient.service.ACTION_SHOW_MDX_PLAYER".equals(intent.getAction()))
            {
                Log.v("NetflixService", "Invalid intent: ");
                AndroidUtils.logIntent("NetflixService", intent);
                return;
            } else
            {
                Log.v("NetflixService", "Sending show app intent");
                startActivity(NetflixApplication.createShowApplicationIntent(NetflixService.this).addFlags(0x10000000));
                NetflixService.access$1800(NetflixService.this).postDelayed(new NetflixService._cls7._cls1(), 400L);
                return;
            }
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    }

}
