// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.NetflixService;

public final class PostPlayMediaButtonIntentReceiver extends BroadcastReceiver
{

    private static final String TAG = "nf_mdx_RemoteClient";

    public PostPlayMediaButtonIntentReceiver()
    {
    }

    private void playNextVideo(Context context, Intent intent)
    {
        Intent intent1 = (new Intent("com.netflix.mediaclient.intent.action.MDX_PLAY_VIDEOIDS")).setClass(context, com/netflix/mediaclient/service/NetflixService).addCategory("com.netflix.mediaclient.intent.category.MDX").addCategory("com.netflix.mediaclient.intent.category.MDXRCC");
        if (intent.hasExtra("episodeId"))
        {
            intent1.putExtra("episodeId", intent.getExtras().getInt("episodeId"));
        }
        if (intent.hasExtra("catalogId"))
        {
            intent1.putExtra("catalogId", intent.getExtras().getInt("catalogId"));
        }
        if (intent.hasExtra("uuid"))
        {
            intent1.putExtra("uuid", intent.getExtras().getString("uuid"));
        }
        context.startService(intent1);
    }

    private void stopMDXTarget(Context context, Intent intent)
    {
        Intent intent1 = (new Intent("com.netflix.mediaclient.intent.action.MDX_STOP")).setClass(context, com/netflix/mediaclient/service/NetflixService).addCategory("com.netflix.mediaclient.intent.category.MDX").addCategory("com.netflix.mediaclient.intent.category.MDXRCC");
        if (intent.hasExtra("uuid"))
        {
            intent1.putExtra("uuid", intent.getExtras().getString("uuid"));
        }
        context.startService(intent1);
    }

    public void onReceive(Context context, Intent intent)
    {
        KeyEvent keyevent;
label0:
        {
            if (intent.getAction().equals("android.intent.action.MEDIA_BUTTON"))
            {
                Log.d("nf_mdx_RemoteClient", "received ACTION_MEDIA_BUTTON");
                keyevent = (KeyEvent)intent.getExtras().get("android.intent.extra.KEY_EVENT");
                if (keyevent.getAction() == 0)
                {
                    break label0;
                }
            }
            return;
        }
        switch (keyevent.getKeyCode())
        {
        default:
            Log.d("nf_mdx_RemoteClient", "received unhandled key");
            return;

        case 86: // 'V'
            Log.d("nf_mdx_RemoteClient", "received play_stop");
            stopMDXTarget(context, intent);
            return;

        case 85: // 'U'
            Log.d("nf_mdx_RemoteClient", "received play_pause");
            // fall through

        case 126: // '~'
            Log.d("nf_mdx_RemoteClient", "received play");
            break;
        }
        playNextVideo(context, intent);
    }
}
