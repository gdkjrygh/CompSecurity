// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class PlayParamsReceiver extends BroadcastReceiver
{

    public static final String BUFFERSIZE_INTENT = "com.netflix.mediaclient.intent.action.TWEAK_BUFFERSIZE";
    private static final String TAG = "Bandwidth_Rcvr";
    public static final String TWEAKBW_INTENT = "com.netflix.mediaclient.intent.action.TWEAKBW";
    PlayerAgent mPlayController;

    PlayParamsReceiver(PlayerAgent playeragent)
    {
        mPlayController = playeragent;
    }

    private Runnable getHandlerForBufferSize(final Context context, final Intent intent)
    {
        return new Runnable() {

            final PlayParamsReceiver this$0;
            final Context val$context;
            final Intent val$intent;

            public void run()
            {
                handleBufferSize(context, intent);
            }

            
            {
                this$0 = PlayParamsReceiver.this;
                context = context1;
                intent = intent1;
                super();
            }
        };
    }

    private Runnable getHandlerForTweakBandwith(final Context context, final Intent intent)
    {
        return new Runnable() {

            final PlayParamsReceiver this$0;
            final Context val$context;
            final Intent val$intent;

            public void run()
            {
                handleTweakBandwith(context, intent);
            }

            
            {
                this$0 = PlayParamsReceiver.this;
                context = context1;
                intent = intent1;
                super();
            }
        };
    }

    private void handleBufferSize(Context context, Intent intent)
    {
        int i;
        int j;
        try
        {
            context = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Bandwidth_Rcvr", "Unintented Exception thrown ", context);
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        j = context.getInt("bufferSizeInMS");
        i = j;
        if (j <= 0)
        {
            i = 0x1d4c0;
        }
        mPlayController.setVideoStreamingBufferSize(i);
        Log.d("Bandwidth_Rcvr", (new StringBuilder()).append("Video Buffer Size in MS: ").append(i).toString());
    }

    private void handleTweakBandwith(Context context, Intent intent)
    {
        int i;
        int j;
        int k;
        try
        {
            context = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("Bandwidth_Rcvr", "Unintented Exception thrown ", context);
            return;
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        j = context.getInt("maxbw");
        i = j;
        if (j <= 0)
        {
            i = 4800;
        }
        k = context.getInt("minbw");
        if (k < 0) goto _L4; else goto _L3
_L3:
        j = k;
        if (k <= i) goto _L5; else goto _L4
_L5:
        mPlayController.setVideoBitrateRange(j, i);
        Log.d("Bandwidth_Rcvr", (new StringBuilder()).append("MaxBw set: ").append(i).append("MinBw set: ").append(j).toString());
_L2:
        return;
_L4:
        j = 0;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void onReceive(Context context, Intent intent)
    {
        Runnable runnable;
        Log.d("Bandwidth_Rcvr", (new StringBuilder()).append("Received an action: ").append(intent.getAction()).toString());
        runnable = null;
        if (!"com.netflix.mediaclient.intent.action.TWEAKBW".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        runnable = getHandlerForTweakBandwith(context, intent);
_L4:
        mPlayController.excuteOnPlayExecutor(runnable);
        return;
_L2:
        if ("com.netflix.mediaclient.intent.action.TWEAK_BUFFERSIZE".equals(intent.getAction()))
        {
            runnable = getHandlerForBufferSize(context, intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


}
