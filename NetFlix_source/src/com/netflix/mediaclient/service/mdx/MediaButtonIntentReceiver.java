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

public final class MediaButtonIntentReceiver extends BroadcastReceiver
{

    private static final String TAG = "nf_mdx_RemoteClient";

    public MediaButtonIntentReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent.getAction().equals("android.intent.action.MEDIA_BUTTON"))
            {
                Log.d("nf_mdx_RemoteClient", "received ACTION_MEDIA_BUTTON");
                intent = (KeyEvent)intent.getExtras().get("android.intent.extra.KEY_EVENT");
                if (intent.getAction() == 0)
                {
                    break label0;
                }
            }
            return;
        }
        switch (intent.getKeyCode())
        {
        default:
            Log.d("nf_mdx_RemoteClient", "received unhandled key");
            return;

        case 85: // 'U'
            Log.d("nf_mdx_RemoteClient", "received play_pause");
            context.startService((new Intent("com.netflix.mediaclient.intent.action.MDX_TOGGLE_PAUSE")).setClass(context, com/netflix/mediaclient/service/NetflixService).addCategory("com.netflix.mediaclient.intent.category.MDX").addCategory("com.netflix.mediaclient.intent.category.MDXRCC"));
            return;

        case 127: // '\177'
            Log.d("nf_mdx_RemoteClient", "received pause");
            context.startService((new Intent("com.netflix.mediaclient.intent.action.MDX_PAUSE")).setClass(context, com/netflix/mediaclient/service/NetflixService).addCategory("com.netflix.mediaclient.intent.category.MDX").addCategory("com.netflix.mediaclient.intent.category.MDXRCC"));
            return;

        case 126: // '~'
            Log.d("nf_mdx_RemoteClient", "received play");
            context.startService((new Intent("com.netflix.mediaclient.intent.action.MDX_RESUME")).setClass(context, com/netflix/mediaclient/service/NetflixService).addCategory("com.netflix.mediaclient.intent.category.MDX").addCategory("com.netflix.mediaclient.intent.category.MDXRCC"));
            return;
        }
    }
}
