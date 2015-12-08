// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.protocol.nflx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IMdx;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.protocol.nflx:
//            NflxHandler

class val.paramsMap
    implements Runnable
{

    final NflxHandler this$0;
    final String val$action;
    final NetflixActivity val$activity;
    final IMdx val$mdx;
    final Map val$paramsMap;
    final String val$tinyUrl;

    public void run()
    {
        Log.d("NflxHandler", "Resolving tiny URL in background");
        NflxHandler.access$400(NflxHandler.this, val$activity, val$mdx, val$action, val$tinyUrl, NflxHandler.access$300(NflxHandler.this, (String)val$paramsMap.get("targetid")), (String)val$paramsMap.get("trkid"));
    }

    vity()
    {
        this$0 = final_nflxhandler;
        val$activity = netflixactivity;
        val$mdx = imdx;
        val$action = s;
        val$tinyUrl = s1;
        val$paramsMap = Map.this;
        super();
    }
}
