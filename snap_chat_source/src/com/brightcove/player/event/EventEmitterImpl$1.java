// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.os.Handler;
import android.os.Message;
import java.util.Map;

// Referenced classes of package com.brightcove.player.event:
//            EventEmitterImpl, Event

final class a extends Handler
{

    private EventEmitterImpl a;

    public final void handleMessage(Message message)
    {
        message = (Map)message.obj;
        String s = (String)message.get("event");
        Event event = new Event(s);
        EventEmitterImpl.a(message, event);
        EventEmitterImpl.a(a, event, "*");
        if (s.equals("response"))
        {
            EventEmitterImpl.a(a, event);
            return;
        } else
        {
            EventEmitterImpl.b(a, event);
            return;
        }
    }

    (EventEmitterImpl eventemitterimpl)
    {
        a = eventemitterimpl;
        super();
    }
}
