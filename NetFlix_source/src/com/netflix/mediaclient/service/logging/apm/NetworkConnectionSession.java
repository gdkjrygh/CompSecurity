// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.client.model.Event;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public abstract class NetworkConnectionSession extends BaseApmSession
{

    public NetworkConnectionSession()
    {
    }

    public abstract Event createEndedEvent();

    public abstract Event createStartEvent();
}
