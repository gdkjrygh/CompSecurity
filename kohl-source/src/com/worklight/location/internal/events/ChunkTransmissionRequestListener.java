// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;

// Referenced classes of package com.worklight.location.internal.events:
//            EventTransmitter

public final class ChunkTransmissionRequestListener
    implements WLRequestListener
{

    private final int currPurgeCounter;
    private final EventTransmitter eventTransmitter;

    public ChunkTransmissionRequestListener(EventTransmitter eventtransmitter, int i)
    {
        eventTransmitter = eventtransmitter;
        currPurgeCounter = i;
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
        eventTransmitter.txFailure();
    }

    public void onSuccess(WLResponse wlresponse)
    {
        eventTransmitter.txSuccess(currPurgeCounter);
    }
}
