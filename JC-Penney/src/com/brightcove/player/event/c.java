// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.util.Log;
import com.brightcove.player.util.ErrorUtil;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.brightcove.player.event:
//            Event, Default, EventListener

class c
{

    private static final String a = com/brightcove/player/event/c.getName();
    private static String b = "processEvent";
    private static AtomicInteger c;
    private int d;
    private boolean e;
    private EventListener f;
    private boolean g;

    public c(EventListener eventlistener, boolean flag)
    {
        if (eventlistener == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("listenerRequired"));
        }
        if (c == null)
        {
            c = new AtomicInteger();
        }
        d = c.incrementAndGet();
        f = eventlistener;
        e = a(eventlistener);
        g = flag;
    }

    private static boolean a(EventListener eventlistener)
    {
        if (eventlistener != null)
        {
            boolean flag;
            try
            {
                flag = eventlistener.getClass().getMethod(b, new Class[] {
                    com/brightcove/player/event/Event
                }).isAnnotationPresent(com/brightcove/player/event/Default);
            }
            // Misplaced declaration of an exception variable
            catch (EventListener eventlistener)
            {
                Log.e(a, (new StringBuilder()).append(b).append(" method seems to be missing from this handler!").toString());
                return false;
            }
            return flag;
        } else
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("listenerRequired"));
        }
    }

    public int a()
    {
        return d;
    }

    public EventListener b()
    {
        return f;
    }

    public boolean c()
    {
        return e;
    }

    public boolean d()
    {
        return g;
    }

    public String toString()
    {
        return (new StringBuilder()).append("InvocationContainer (").append(d).append(")").toString();
    }

}
