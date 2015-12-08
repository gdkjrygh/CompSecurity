// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import java.util.ArrayList;

// Referenced classes of package com.brightcove.player.event:
//            b, EventEmitter, EventListener

public class EventLogger
{

    private EventEmitter a;
    private EventListener b;
    private int c;
    private boolean d;
    private ArrayList e;
    private String f;

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
        f = s;
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

    static String c(EventLogger eventlogger)
    {
        return eventlogger.f;
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
        b = new b(this);
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
