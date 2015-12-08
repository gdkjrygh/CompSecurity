// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.brightcove.player.util.ErrorUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.event:
//            EventEmitter, a, c, Event, 
//            EventListener

public class EventEmitterImpl
    implements EventEmitter
{

    protected Handler a;
    private String b;
    private Map c;
    private boolean d;
    private List e;

    public EventEmitterImpl()
    {
        b = "EventEmitterImpl";
        d = true;
        e = new ArrayList();
        b = toString();
        a = new a(this);
        c = new HashMap();
    }

    private int a(String s, EventListener eventlistener, boolean flag)
    {
        int i = -1;
        if (!d) goto _L2; else goto _L1
_L1:
        if (s == null || eventlistener == null) goto _L4; else goto _L3
_L3:
        s = a(s);
        eventlistener = new c(eventlistener, flag);
        if (!eventlistener.c() && !s.isEmpty() && ((c)s.get(s.size() - 1)).c()) goto _L6; else goto _L5
_L5:
        s.add(eventlistener);
_L8:
        i = eventlistener.a();
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
            if (((c)s.get(j)).c())
            {
                s.add(j, eventlistener);
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
_L4:
        Log.e(b, (new StringBuilder()).append("Invalid input provided to on: evenType = ").append(s).append(", listener = ").append(eventlistener).toString());
        throw new IllegalArgumentException(ErrorUtil.getMessage("eventTypeAndListenerRequired"));
        if (true) goto _L8; else goto _L7
_L7:
    }

    private ArrayList a(String s)
    {
        if (c.containsKey(s))
        {
            return (ArrayList)c.get(s);
        } else
        {
            ArrayList arraylist = new ArrayList();
            c.put(s, arraylist);
            return arraylist;
        }
    }

    private void a(Event event)
    {
        Object obj = a(event.getType());
        int i = event.getIntegerProperty("requestToken");
        obj = b(((List) (obj)), i);
        if (obj != null)
        {
            try
            {
                ((c) (obj)).b().processEvent(event);
            }
            catch (Throwable throwable)
            {
                Log.e(b, "processEvent() threw a throwable.", throwable);
            }
            off(event.getType(), i);
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
            c c1 = (c)iterator.next();
            if (!c1.c() && !event.isStopped() || c1.c() && !event.isPrevented())
            {
                try
                {
                    c1.b().processEvent(event);
                }
                catch (Throwable throwable)
                {
                    Log.e(b, "processEvent() threw a throwable.", throwable);
                }
                if (c1.d())
                {
                    s.remove(c1);
                }
            }
        } while (true);
    }

    static void a(EventEmitterImpl eventemitterimpl, Event event)
    {
        eventemitterimpl.a(event);
    }

    static void a(EventEmitterImpl eventemitterimpl, Event event, String s)
    {
        eventemitterimpl.a(event, s);
    }

    static void a(EventEmitterImpl eventemitterimpl, Map map, Event event)
    {
        eventemitterimpl.a(map, event);
    }

    private void a(Map map, Event event)
    {
        int i = "prop_".length();
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
                event.properties.put(s.substring(i), map.get(s));
            }
        } while (true);
    }

    private void a(Map map, Map map1)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); map1.put((new StringBuilder()).append("prop_").append(s).toString(), map.get(s)))
        {
            s = (String)iterator.next();
        }

    }

    private void b(Event event)
    {
        a(event, event.getType());
    }

    static void b(EventEmitterImpl eventemitterimpl, Event event)
    {
        eventemitterimpl.b(event);
    }

    protected int a(List list, int i)
    {
        int k = list.size();
        for (int j = 0; j < k; j++)
        {
            if (((c)list.get(j)).a() == i)
            {
                return j;
            }
        }

        return -1;
    }

    protected c b(List list, int i)
    {
        i = a(list, i);
        c c1 = null;
        if (i >= 0)
        {
            c1 = (c)list.get(i);
        }
        return c1;
    }

    public void disable()
    {
        d = false;
    }

    public void emit(String s)
    {
        emit(s, Collections.emptyMap());
    }

    public void emit(String s, Map map)
    {
label0:
        {
            if (d)
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
                a.sendMessage(message);
            }
            return;
        }
        Log.e(b, "Received an emit without an EventType");
        throw new IllegalArgumentException(ErrorUtil.getMessage("invalidEmit"));
    }

    public void enable()
    {
        d = true;
    }

    public void off()
    {
        c.clear();
    }

    public void off(String s, int i)
    {
        if (i > -1)
        {
            s = a(s);
            i = a(s, i);
            if (i > -1)
            {
                s.remove(i);
            }
            return;
        } else
        {
            Log.w(b, (new StringBuilder()).append("Off attempted for invalid token of ").append(i).toString());
            return;
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
        if (d)
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
label0:
        {
            if (d)
            {
                if (!map.containsKey("requestToken"))
                {
                    break label0;
                }
                emit("response", map);
            }
            return;
        }
        Log.d(b, "Respond attempted without an requestToken");
    }
}
