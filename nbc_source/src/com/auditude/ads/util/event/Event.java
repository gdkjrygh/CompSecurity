// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.event;


// Referenced classes of package com.auditude.ads.util.event:
//            IEventDispatcher

public class Event
{

    private IEventDispatcher owner;

    public Event(IEventDispatcher ieventdispatcher)
    {
        owner = ieventdispatcher;
    }

    public IEventDispatcher getOwner()
    {
        return owner;
    }
}
