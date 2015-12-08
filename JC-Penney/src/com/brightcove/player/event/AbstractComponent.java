// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import com.brightcove.player.util.ErrorUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.event:
//            Component, RegisteringEventEmitter, EventEmitter, EventListener

public abstract class AbstractComponent
    implements Component
{

    protected EventEmitter F;
    protected Map G;

    public AbstractComponent(EventEmitter eventemitter)
    {
        this(eventemitter, null);
    }

    public AbstractComponent(EventEmitter eventemitter, Class class1)
    {
        G = new HashMap();
        if (eventemitter == null)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("eventEmitterRequired"));
        }
        Object obj = eventemitter;
        if (class1 != null)
        {
            obj = RegisteringEventEmitter.build(eventemitter, class1);
        }
        F = ((EventEmitter) (obj));
    }

    public void addListener(String s, EventListener eventlistener)
    {
        G.put(s, Integer.valueOf(F.on(s, eventlistener)));
    }

    public EventEmitter getEventEmitter()
    {
        return F;
    }

    public void removeListener(String s)
    {
        F.off(s, ((Integer)G.get(s)).intValue());
    }

    public void removeListeners()
    {
        String s;
        for (Iterator iterator = G.keySet().iterator(); iterator.hasNext(); F.off(s, ((Integer)G.get(s)).intValue()))
        {
            s = (String)iterator.next();
        }

        G.clear();
    }
}
