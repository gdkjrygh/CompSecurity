// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.mdx.MdxAgent;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService

class this._cls0 extends BroadcastReceiver
{

    final NetflixService this$0;

    private Asset getMdxAgentVideoAsset()
    {
        com.netflix.mediaclient.servicemgr.VideoDetails videodetails = NetflixService.access$1900(NetflixService.this).getVideoDetail();
        if (videodetails != null && StringUtils.isNotEmpty(videodetails.getId()))
        {
            return Asset.create(videodetails, PlayContext.EMPTY_CONTEXT, PlayerActivity.PIN_VERIFIED.booleanValue());
        } else
        {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        boolean flag2 = false;
        boolean flag1 = false;
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKEND".equals(context))
        {
            flag2 = com.netflix.mediaclient.service.mdx.InPostPlay(intent);
            context = NetflixService.this;
            if (!flag2)
            {
                flag = true;
            }
            context.stopForeground(flag);
            if (Log.isLoggable("NetflixService", 3))
            {
                Log.d("NetflixService", "mdx exit, stop service in 28800000ms");
            }
            NetflixService.access$1800(NetflixService.this).postDelayed(NetflixService.access$1700(NetflixService.this), 0x1b77400L);
            context = getMdxAgentVideoAsset();
            flag = flag1;
            if (context != null)
            {
                flag = context.isPinProtected();
            }
            PinVerifier.getInstance().registerPlayEvent(flag);
            Log.d("NetflixService", "Refreshing CW for MDXUPDATE_PLAYBACKEND...");
            NetflixService.access$500(NetflixService.this).refreshCW();
        } else
        {
            if (!"com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART".equals(context))
            {
                continue;
            }
            if (NetflixService.access$1900(NetflixService.this) != null && NetflixService.access$1900(NetflixService.this).hasActiveSession())
            {
                Log.i("NetflixService", "start mdx notification");
                NetflixService.access$1800(NetflixService.this).removeCallbacks(NetflixService.access$1700(NetflixService.this));
                context = NetflixService.access$1900(NetflixService.this).getMdxNotification(false);
                startForeground(((Integer)((Pair) (context)).first).intValue(), (Notification)((Pair) (context)).second);
                context = getMdxAgentVideoAsset();
                if (context != null)
                {
                    Log.d("NetflixService", "refreshing episodes data on play start");
                    NetflixService.access$500(NetflixService.this).refreshEpisodesData(context);
                    return;
                }
            } else
            {
                Log.e("NetflixService", "false MDXUPDATE_PLAYBACKSTART");
                return;
            }
        }
        do
        {
            return;
        } while (!"com.netflix.mediaclient.intent.action.MDXUPDATE_STATE".equals(context));
        int i = intent.getIntExtra("time", -1);
        Log.v("NetflixService", (new StringBuilder()).append("on MDX state update - received updated mdx position: ").append(i).toString());
        context = getMdxAgentVideoAsset();
        flag = flag2;
        if (context != null)
        {
            context.setPlaybackBookmark(i);
            Log.v("NetflixService", "updating cached video position");
            NetflixService.access$500(NetflixService.this).updateCachedVideoPosition(context);
            flag = context.isPinProtected();
        }
        PinVerifier.getInstance().registerPlayEvent(flag);
    }

    t()
    {
        this$0 = NetflixService.this;
        super();
    }
}
