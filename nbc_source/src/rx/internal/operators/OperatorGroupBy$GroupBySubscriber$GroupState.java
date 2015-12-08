// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.subjects.Subject;

// Referenced classes of package rx.internal.operators:
//            OperatorGroupBy, BufferUntilSubscriber

private static class <init>
{

    private final Queue buffer;
    private final AtomicLong count;
    private final AtomicLong requested;
    private final Subject s;

    public Observable getObservable()
    {
        return s;
    }

    public Observer getObserver()
    {
        return s;
    }




    private ()
    {
        s = BufferUntilSubscriber.create();
        requested = new AtomicLong();
        count = new AtomicLong();
        buffer = new ConcurrentLinkedQueue();
    }

    buffer(buffer buffer1)
    {
        this();
    }
}
