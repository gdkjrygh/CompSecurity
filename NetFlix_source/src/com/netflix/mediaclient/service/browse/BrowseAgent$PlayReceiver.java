// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.Asset;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent

public final class this._cls0 extends BroadcastReceiver
{

    final BrowseAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = intent.getAction();
            Log.i("nf_bookmark", (new StringBuilder()).append("PlayReceiver inovoked and received Intent with Action ").append(context).toString());
            if (BrowseAgent.access$5700())
            {
                if ("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP".equals(context))
                {
                    Log.i("nf_bookmark", "Refreshing CW for LOCAL_PLAYER_PLAY_STOP...");
                    updateCachedCwData(Asset.fromIntent(intent));
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_START".equals(context))
                {
                    refreshEpisodesData(Asset.fromIntent(intent));
                    return;
                }
            }
        }
    }

    public ()
    {
        this$0 = BrowseAgent.this;
        super();
    }
}
