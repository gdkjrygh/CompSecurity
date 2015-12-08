// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            Event, EventType

public abstract class DiscreteEvent extends Event
{

    public DiscreteEvent()
    {
        type = EventType.event;
    }

    public DiscreteEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }
}
