// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.os.Handler;
import android.os.Message;
import cg;
import com.brightcove.player.util.ErrorUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.event:
//            EventEmitter, Event, EventListener

public class EventEmitterImpl
    implements EventEmitter
{

    private Map a;
    private boolean b;
    private Handler c;

    public EventEmitterImpl()
    {
        b = true;
        new ArrayList();
        toString();
        c = new Handler() {

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

            
            {
                a = EventEmitterImpl.this;
                super();
            }
        };
        a = new HashMap();
    }

    private int a(String s, EventListener eventlistener, boolean flag)
    {
        int i = -1;
        if (!b) goto _L2; else goto _L1
_L1:
        if (s == null || eventlistener == null) goto _L4; else goto _L3
_L3:
        s = a(s);
        eventlistener = new cg(eventlistener, flag);
        if (!((cg) (eventlistener)).b && !s.isEmpty() && ((cg)s.get(s.size() - 1)).b) goto _L6; else goto _L5
_L5:
        s.add(eventlistener);
_L8:
        i = ((cg) (eventlistener)).a;
_L2:
        return i;
_L6:
        int k = s.size();
        int j = 0;
        do
        {
            if (j >= k)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((cg)s.get(j)).b)
            {
                s.add(j, eventlistener);
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
_L4:
        (new StringBuilder("Invalid input provided to on: evenType = ")).append(s).append(", listener = ").append(eventlistener);
        throw new IllegalArgumentException(ErrorUtil.getMessage("eventTypeAndListenerRequired"));
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static int a(List list, int i)
    {
        int k = list.size();
        for (int j = 0; j < k; j++)
        {
            if (((cg)list.get(j)).a == i)
            {
                return j;
            }
        }

        return -1;
    }

    private ArrayList a(String s)
    {
        if (a.containsKey(s))
        {
            return (ArrayList)a.get(s);
        } else
        {
            ArrayList arraylist = new ArrayList();
            a.put(s, arraylist);
            return arraylist;
        }
    }

    private void a(Event event, String s)
    {
        s = a(s);
        Iterator iterator = ((List)s.clone()).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cg cg1 = (cg)iterator.next();
            if (!cg1.b && !event.isStopped() || cg1.b && !event.isPrevented())
            {
                try
                {
                    cg1.c.processEvent(event);
                }
                catch (Throwable throwable) { }
                if (cg1.d)
                {
                    s.remove(cg1);
                }
            }
        } while (true);
    }

    static void a(EventEmitterImpl eventemitterimpl, Event event)
    {
        ArrayList arraylist = eventemitterimpl.a(event.getType());
        int i = event.getIntegerProperty("requestToken");
        int j = a(((List) (arraylist)), i);
        cg cg1 = null;
        if (j >= 0)
        {
            cg1 = (cg)arraylist.get(j);
        }
        if (cg1 != null)
        {
            try
            {
                cg1.c.processEvent(event);
            }
            catch (Throwable throwable) { }
            eventemitterimpl.off(event.getType(), i);
        }
    }

    static void a(EventEmitterImpl eventemitterimpl, Event event, String s)
    {
        eventemitterimpl.a(event, s);
    }

    static void a(Map map, Event event)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s.startsWith("prop_"))
            {
                event.properties.put(s.substring(5), map.get(s));
            }
        } while (true);
    }

    private static void a(Map map, Map map1)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); map1.put((new StringBuilder("prop_")).append(s).toString(), map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    static void b(EventEmitterImpl eventemitterimpl, Event event)
    {
        eventemitterimpl.a(event, event.getType());
    }

    public void disable()
    {
        b = false;
    }

    public void emit(String s)
    {
        emit(s, Collections.emptyMap());
    }

    public void emit(String s, Map map)
    {
label0:
        {
            if (b)
            {
                if (s == null)
                {
                    break label0;
                }
                Message message = Message.obtain();
                HashMap hashmap = new HashMap();
                hashmap.put("event", s);
                if (!map.isEmpty())
                {
                    a(map, hashmap);
                }
                message.obj = hashmap;
                c.sendMessage(message);
            }
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage("invalidEmit"));
    }

    public void enable()
    {
        b = true;
    }

    public void off()
    {
        a.clear();
    }

    public void off(String s, int i)
    {
        if (i >= 0)
        {
            s = a(s);
            i = a(s, i);
            if (i >= 0)
            {
                s.remove(i);
            }
        }
    }

    public int on(String s, EventListener eventlistener)
    {
        return a(s, eventlistener, false);
    }

    public int once(String s, EventListener eventlistener)
    {
        return a(s, eventlistener, true);
    }

    public void request(String s, EventListener eventlistener)
    {
        request(s, ((Map) (new HashMap())), eventlistener);
    }

    public void request(String s, Map map, EventListener eventlistener)
    {
        if (b)
        {
            int i = once("response", eventlistener);
            if (map == null)
            {
                map = new HashMap();
            }
            try
            {
                map.put("requestToken", Integer.valueOf(i));
            }
            // Misplaced declaration of an exception variable
            catch (EventListener eventlistener)
            {
                map = new HashMap(map);
                map.put("requestToken", Integer.valueOf(i));
            }
            emit(s, map);
        }
    }

    public void respond(Event event)
    {
        respond(event.properties);
    }

    public void respond(Map map)
    {
        if (b && map.containsKey("requestToken"))
        {
            emit("response", map);
        }
    }
}
