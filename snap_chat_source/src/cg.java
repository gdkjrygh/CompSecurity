// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.ErrorUtil;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public class cg
{

    private static String e = "processEvent";
    private static AtomicInteger f;
    public int a;
    public boolean b;
    public EventListener c;
    public boolean d;

    public cg(EventListener eventlistener, boolean flag)
    {
        if (eventlistener == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("listenerRequired"));
        }
        if (f == null)
        {
            f = new AtomicInteger();
        }
        a = f.incrementAndGet();
        c = eventlistener;
        b = a(eventlistener);
        d = flag;
    }

    private static boolean a(EventListener eventlistener)
    {
        if (eventlistener != null)
        {
            boolean flag;
            try
            {
                flag = eventlistener.getClass().getMethod(e, new Class[] {
                    com/brightcove/player/event/Event
                }).isAnnotationPresent(com/brightcove/player/event/Default);
            }
            // Misplaced declaration of an exception variable
            catch (EventListener eventlistener)
            {
                (new StringBuilder()).append(e).append(" method seems to be missing from this handler!");
                return false;
            }
            return flag;
        } else
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("listenerRequired"));
        }
    }

    public String toString()
    {
        return (new StringBuilder("InvocationContainer (")).append(a).append(")").toString();
    }

    static 
    {
        cg.getName();
    }
}
