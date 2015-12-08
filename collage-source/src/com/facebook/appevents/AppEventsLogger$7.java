// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static final class val.flushState
    implements com.facebook.ack
{

    final cessTokenAppIdPair val$accessTokenAppId;
    final ushStatistics val$flushState;
    final GraphRequest val$postRequest;
    final ssionEventsState val$sessionEventsState;

    public void onCompleted(GraphResponse graphresponse)
    {
        AppEventsLogger.access$1000(val$accessTokenAppId, val$postRequest, graphresponse, val$sessionEventsState, val$flushState);
    }

    ushStatistics(cessTokenAppIdPair cesstokenappidpair, GraphRequest graphrequest, ssionEventsState ssioneventsstate, ushStatistics ushstatistics)
    {
        val$accessTokenAppId = cesstokenappidpair;
        val$postRequest = graphrequest;
        val$sessionEventsState = ssioneventsstate;
        val$flushState = ushstatistics;
        super();
    }
}
