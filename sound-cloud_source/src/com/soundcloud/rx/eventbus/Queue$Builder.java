// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import rx.b.b;

// Referenced classes of package com.soundcloud.rx.eventbus:
//            Queue

public static final class eventType
{

    private Object defaultEvent;
    private final Class eventType;
    private String name;
    private b onError;
    private boolean replayLast;

    public final Queue get()
    {
        if (name == null)
        {
            name = (new StringBuilder()).append(eventType.getSimpleName()).append("Queue").toString();
        }
        return new Queue(name, eventType, replayLast, defaultEvent, onError);
    }

    public final onError name(String s)
    {
        name = s;
        return this;
    }

    public final name onError(b b)
    {
        onError = b;
        return this;
    }

    public final onError replay()
    {
        replayLast = true;
        return this;
    }

    public final replayLast replay(Object obj)
    {
        replayLast = true;
        defaultEvent = obj;
        return this;
    }

    (Class class1)
    {
        eventType = class1;
    }
}
