// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AppEventsLogger, Request, Response

final class val.flushState
    implements val.flushState
{

    final cessTokenAppIdPair val$accessTokenAppId;
    final ushStatistics val$flushState;
    final Request val$postRequest;
    final ssionEventsState val$sessionEventsState;

    public final void onCompleted(Response response)
    {
        AppEventsLogger.access$900(val$accessTokenAppId, val$postRequest, response, val$sessionEventsState, val$flushState);
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
