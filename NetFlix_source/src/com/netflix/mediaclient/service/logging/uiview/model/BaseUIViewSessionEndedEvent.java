// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.uiview.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;

public abstract class BaseUIViewSessionEndedEvent extends SessionEndedEvent
{

    public BaseUIViewSessionEndedEvent(String s, DeviceUniqueId deviceuniqueid, long l)
    {
        super(s, deviceuniqueid, l);
    }
}
