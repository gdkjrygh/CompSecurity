// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import java.util.Map;

// Referenced classes of package com.brightcove.player.event:
//            EventListener, Event

public interface EventEmitter
{

    public abstract void disable();

    public abstract void emit(String s);

    public abstract void emit(String s, Map map);

    public abstract void enable();

    public abstract void off();

    public abstract void off(String s, int i);

    public abstract int on(String s, EventListener eventlistener);

    public abstract int once(String s, EventListener eventlistener);

    public abstract void request(String s, EventListener eventlistener);

    public abstract void request(String s, Map map, EventListener eventlistener);

    public abstract void respond(Event event);

    public abstract void respond(Map map);
}
