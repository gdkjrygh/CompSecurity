// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.android.config.ecs.EcsKey;
import com.skype.telemetry.event.TelemetryEvent;
import java.util.Map;

// Referenced classes of package com.skype.android.analytics:
//            EcsControllableEvent, EventAttribute

public class SkypeTelemetryEvent extends TelemetryEvent
    implements EcsControllableEvent
{

    private EcsControllableEvent event;

    public SkypeTelemetryEvent(EcsControllableEvent ecscontrollableevent)
    {
        super(ecscontrollableevent.name());
        event = ecscontrollableevent;
    }

    public Object get(EventAttribute eventattribute)
    {
        return getAttributes().get(eventattribute.name());
    }

    public EcsKey getEcsKey()
    {
        return event.getEcsKey();
    }

    public String name()
    {
        return event.name();
    }

    public void put(EventAttribute eventattribute, Object obj)
    {
        getAttributes().put(eventattribute.name(), obj);
    }
}
