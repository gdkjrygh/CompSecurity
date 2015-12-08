// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import com.worklight.wlclient.WLRequestPiggybacker;

// Referenced classes of package com.worklight.location.internal.events:
//            EventTransmitterPiggybacker, EventTransmitter

class PiggybackerFactory
{

    PiggybackerFactory()
    {
    }

    WLRequestPiggybacker create(EventTransmitter eventtransmitter, long l)
    {
        return new EventTransmitterPiggybacker(eventtransmitter, l);
    }
}
