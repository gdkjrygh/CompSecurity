// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.event;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.skype.android.event:
//            EventSender, EventListener, EventFilter

final class a
    implements EventSender
{

    private final Map a = new HashMap();
    private int b;

    public a(int i)
    {
        b = i;
    }

    private static boolean a(Object obj, EventListener eventlistener)
    {
        eventlistener = eventlistener.getFilter();
        return eventlistener == null || eventlistener.accept(obj);
    }

    public final void a(Handler handler, EventListener eventlistener)
    {
        Object obj;
        Object obj1;
        if (eventlistener == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        obj1 = (Set)a.get(handler);
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        obj = new CopyOnWriteArraySet();
        a.put(handler, obj);
        obj1;
        JVM INSTR monitorexit ;
_L2:
        ((Set) (obj)).add(eventlistener);
        return;
        handler;
_L4:
        obj1;
        JVM INSTR monitorexit ;
        throw handler;
        handler;
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(Message message)
    {
        if (message.what == b)
        {
            Object obj = message.obj;
            if (obj != null)
            {
                message = ((Set)a.get(message.getTarget())).iterator();
                do
                {
                    if (!message.hasNext())
                    {
                        break;
                    }
                    EventListener eventlistener = (EventListener)message.next();
                    if (a(obj, eventlistener))
                    {
                        eventlistener.onEvent(obj);
                    }
                } while (true);
            }
        }
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = false;
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Handler handler = (Handler)iterator.next();
            if (((Set)a.get(handler)).size() > 0)
            {
                boolean flag = true;
                Iterator iterator1 = ((Set)a.get(handler)).iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    if (a(obj, (EventListener)iterator1.next()))
                    {
                        flag = false;
                    }
                } while (true);
                if (!flag && handler.sendMessageDelayed(handler.obtainMessage(b, obj), 0L))
                {
                    flag1 = true;
                }
            }
        } while (true);
        return flag1;
    }

    public final boolean b(Handler handler, EventListener eventlistener)
    {
        if (eventlistener != null)
        {
            handler = (Set)a.get(handler);
            if (handler != null)
            {
                return handler.remove(eventlistener);
            }
        }
        return false;
    }
}
