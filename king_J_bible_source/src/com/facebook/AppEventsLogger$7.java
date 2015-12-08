// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AppEventsLogger, Request, Response

class val.flushState
    implements val.flushState
{

    private final cessTokenAppIdPair val$accessTokenAppId;
    private final ushStatistics val$flushState;
    private final Request val$postRequest;
    private final ssionEventsState val$sessionEventsState;

    public void onCompleted(Response response)
    {
        AppEventsLogger.access$10(val$accessTokenAppId, val$postRequest, response, val$sessionEventsState, val$flushState);
    }

    ushStatistics()
    {
        val$accessTokenAppId = cesstokenappidpair;
        val$postRequest = request;
        val$sessionEventsState = ssioneventsstate;
        val$flushState = ushstatistics;
        super();
    }
}
