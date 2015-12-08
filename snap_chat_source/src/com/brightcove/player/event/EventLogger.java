// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.event:
//            EventEmitter, EventListener, Event

public class EventLogger
{

    private EventEmitter a;
    private EventListener b;
    private int c;
    private boolean d;
    private ArrayList e;

    public EventLogger(EventEmitter eventemitter, boolean flag)
    {
        this(eventemitter, flag, "EventLogger");
    }

    public EventLogger(EventEmitter eventemitter, boolean flag, String s)
    {
        c = 0;
        e = new ArrayList();
        a = eventemitter;
        d = flag;
        e.add("bufferedUpdate");
        e.add("progress");
        e.add("adProgress");
        start();
    }

    static ArrayList a(EventLogger eventlogger)
    {
        return eventlogger.e;
    }

    static boolean b(EventLogger eventlogger)
    {
        return eventlogger.d;
    }

    public void addExclude(String s)
    {
        if (!e.contains(s))
        {
            e.add(s);
        }
    }

    public void clearExcludes()
    {
        e.clear();
    }

    public void removeExclude(String s)
    {
        e.remove(s);
    }

    public void setVerbose(boolean flag)
    {
        d = flag;
    }

    public void start()
    {
        stop();
        b = new EventListener() {

            private EventLogger a;

            public final void processEvent(Event event)
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
                    if ("error".equals(event.getType()) && event.properties.containsKey("error"))
                    {
                        event.properties.get("error");
                        return;
                    }
                }
            }

            
            {
                a = EventLogger.this;
                super();
            }
        };
        c = a.on("*", b);
    }

    public void stop()
    {
        if (c > 0)
        {
            a.off("*", c);
            c = 0;
        }
    }
}
