// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Queue;
import rx.Subscriber;
import rx.internal.util.RxRingBuffer;

// Referenced classes of package rx.internal.operators:
//            OperatorMerge

static final class id extends Subscriber
{

    static final int limit;
    volatile boolean done;
    final long id;
    int outstanding;
    final limit parent;
    volatile RxRingBuffer queue;

    public void onCompleted()
    {
        done = true;
        parent.emit();
    }

    public void onError(Throwable throwable)
    {
        done = true;
        parent.getOrCreateErrorQueue().offer(throwable);
        parent.emit();
    }

    public void onNext(Object obj)
    {
        parent.tryEmit(this, obj);
    }

    public void onStart()
    {
        outstanding = RxRingBuffer.SIZE;
        request(RxRingBuffer.SIZE);
    }

    public void requestMore(long l)
    {
        int i = outstanding - (int)l;
        if (i > limit)
        {
            outstanding = i;
        } else
        {
            outstanding = RxRingBuffer.SIZE;
            i = RxRingBuffer.SIZE - i;
            if (i > 0)
            {
                request(i);
                return;
            }
        }
    }

    static 
    {
        limit = RxRingBuffer.SIZE / 4;
    }

    public _cls9(_cls9 _pcls9, long l)
    {
        parent = _pcls9;
        id = l;
    }
}
