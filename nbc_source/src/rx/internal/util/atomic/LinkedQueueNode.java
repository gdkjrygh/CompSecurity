// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReference;

public final class LinkedQueueNode extends AtomicReference
{

    private static final long serialVersionUID = 0x215dab4a52b27c94L;
    private Object value;

    public LinkedQueueNode()
    {
    }

    public LinkedQueueNode(Object obj)
    {
        spValue(obj);
    }

    public Object getAndNullValue()
    {
        Object obj = lpValue();
        spValue(null);
        return obj;
    }

    public Object lpValue()
    {
        return value;
    }

    public LinkedQueueNode lvNext()
    {
        return (LinkedQueueNode)get();
    }

    public void soNext(LinkedQueueNode linkedqueuenode)
    {
        lazySet(linkedqueuenode);
    }

    public void spValue(Object obj)
    {
        value = obj;
    }
}
