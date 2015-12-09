// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ServiceManager, ManagerCallback

private static class callback
{

    private static int sRequestIdCounter = 0;
    private final ManagerCallback callback;
    private final int requestId;

    public ManagerCallback getDemuxedCallback()
    {
        return callback;
    }

    public int getRequestId()
    {
        return requestId;
    }


    public (ManagerCallback managercallback)
    {
        sRequestIdCounter++;
        requestId = sRequestIdCounter;
        callback = managercallback;
    }
}
