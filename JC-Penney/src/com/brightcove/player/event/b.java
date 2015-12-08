// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.event:
//            EventListener, EventLogger, Event

class b
    implements EventListener
{

    final EventLogger a;

    b(EventLogger eventlogger)
    {
        a = eventlogger;
        super();
    }

    public void processEvent(Event event)
    {
        if (!EventLogger.a(a).contains(event.getType()))
        {
            StringBuffer stringbuffer = new StringBuffer(event.getType());
            Object obj = event.properties.get("emitter");
            if (obj != null)
            {
                stringbuffer.append(" (");
                stringbuffer.append(obj);
                stringbuffer.append(')');
            }
            if (EventLogger.b(a))
            {
                stringbuffer.append(" { ");
                for (Iterator iterator = event.properties.entrySet().iterator(); iterator.hasNext(); stringbuffer.append(' '))
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    stringbuffer.append((String)entry.getKey());
                    stringbuffer.append(": ");
                    stringbuffer.append(entry.getValue());
                }

                stringbuffer.append('}');
            }
            Log.d(EventLogger.c(a), stringbuffer.toString());
            if ("error".equals(event.getType()) && event.properties.containsKey("error"))
            {
                Log.e("EventLogger", "Unhandled error event", (Throwable)event.properties.get("error"));
                return;
            }
        }
    }
}
