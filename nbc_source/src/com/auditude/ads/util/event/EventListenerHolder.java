// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.event;


// Referenced classes of package com.auditude.ads.util.event:
//            IEventListener

class EventListenerHolder
{

    public IEventListener listener;
    public int priority;

    public EventListenerHolder(IEventListener ieventlistener, int i)
    {
        priority = 0;
        listener = ieventlistener;
        priority = i;
    }

    public void invoke(String s, Object obj)
    {
        if (listener != null)
        {
            listener.onEvent(s, obj);
        }
    }
}
