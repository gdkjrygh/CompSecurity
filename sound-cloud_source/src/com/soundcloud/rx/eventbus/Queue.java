// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.rx.eventbus;

import rx.b.b;

public final class Queue
{
    public static final class Builder
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

        public final Builder name(String s)
        {
            name = s;
            return this;
        }

        public final Builder onError(b b)
        {
            onError = b;
            return this;
        }

        public final Builder replay()
        {
            replayLast = true;
            return this;
        }

        public final Builder replay(Object obj)
        {
            replayLast = true;
            defaultEvent = obj;
            return this;
        }

        Builder(Class class1)
        {
            eventType = class1;
        }
    }


    private static int runningId;
    final Object defaultEvent;
    public final Class eventType;
    final int id;
    public final String name;
    final b onError;
    final boolean replayLast;

    Queue(String s, Class class1, boolean flag, Object obj, b b)
    {
        name = s;
        eventType = class1;
        replayLast = flag;
        defaultEvent = obj;
        onError = b;
        int i = runningId;
        runningId = i + 1;
        id = i;
    }

    public static Builder of(Class class1)
    {
        return new Builder(class1);
    }

    public final boolean equals(Object obj)
    {
        return obj != null && (obj instanceof Queue) && ((Queue)obj).id == id;
    }

    public final int hashCode()
    {
        return id;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(name).append("[").append(eventType.getCanonicalName()).append("]").toString();
    }
}
