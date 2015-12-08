// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponse;
import com.digby.mm.android.library.utils.Logger;
import java.util.ArrayList;
import java.util.List;

public class EventResponse
    implements IEventResponse
{

    private IEvent mEvent;
    private List mMessages;

    public EventResponse(IEvent ievent, List list)
    {
        mMessages = new ArrayList();
        try
        {
            mEvent = ievent;
            mMessages = list;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEvent ievent)
        {
            Logger.Error("EventResponse", ievent);
        }
    }

    public IEvent getEvent()
    {
        return mEvent;
    }

    public List getMessages()
    {
        return mMessages;
    }
}
