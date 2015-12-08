// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.util.Log;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.List;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

class eerConnectedListener
    implements ResultCallback
{

    final WearablesService this$0;
    final eerConnectedListener val$listener;

    public volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.wearable.dNodesResult)result);
    }

    public void onResult(com.google.android.gms.wearable.dNodesResult dnodesresult)
    {
        if (dnodesresult != null && dnodesresult.getNodes() != null && dnodesresult.getNodes().size() > 0)
        {
            Log.i("WearablesService", (new StringBuilder()).append("checkPeerConnect.onResult node connected - getNodes().size(): ").append(dnodesresult.getNodes().size()).toString());
            if (val$listener != null)
            {
                val$listener.onPeerConnected();
            }
            return;
        } else
        {
            Log.i("WearablesService", (new StringBuilder()).append("checkPeerConnect.onResult node not connected - getNodes().size(): ").append(dnodesresult.getNodes().size()).toString());
            return;
        }
    }

    eerConnectedListener()
    {
        this$0 = final_wearablesservice;
        val$listener = eerConnectedListener.this;
        super();
    }
}
