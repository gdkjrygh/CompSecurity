// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.BitSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
import rx.functions.FuncN;
import rx.internal.util.RxRingBuffer;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeCombineLatest, BackpressureUtils

static final class completion
    implements Producer
{

    private static final AtomicLongFieldUpdater WIP = AtomicLongFieldUpdater.newUpdater(rx/internal/operators/OnSubscribeCombineLatest$MultiSourceProducer, "counter");
    private final RxRingBuffer buffer = RxRingBuffer.getSpmcInstance();
    private final Subscriber child;
    private final Object collectedValues[];
    private final FuncN combinator;
    private final BitSet completion;
    private volatile int completionCount;
    private volatile long counter;
    private final BitSet haveValues;
    private volatile int haveValuesCount;
    private final AtomicLong requested = new AtomicLong();
    private final List sources;
    private final AtomicBoolean started = new AtomicBoolean();
    private final leSubscriber subscribers[];

    public void onCompleted(int i, boolean flag)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        child.onCompleted();
_L4:
        return;
_L2:
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (completion.get(i))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        completion.set(i);
        completionCount = completionCount + 1;
        if (completionCount == collectedValues.length)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        this;
        JVM INSTR monitorexit ;
        if (!flag1) goto _L4; else goto _L3
_L3:
        buffer.onCompleted();
        tick();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        child.onError(throwable);
    }

    public boolean onNext(int i, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!haveValues.get(i))
        {
            haveValues.set(i);
            haveValuesCount = haveValuesCount + 1;
        }
        collectedValues[i] = obj;
        if (haveValuesCount == collectedValues.length)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        buffer.onNext(combinator.call(collectedValues));
_L1:
        this;
        JVM INSTR monitorexit ;
        tick();
        return true;
        obj;
        onError(((Throwable) (obj)));
          goto _L1
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        onError(((Throwable) (obj)));
          goto _L1
    }

    public void request(long l)
    {
        BackpressureUtils.getAndAddRequest(requested, l);
        if (!started.get() && started.compareAndSet(false, true))
        {
            int i1 = RxRingBuffer.SIZE / sources.size();
            int j1 = RxRingBuffer.SIZE;
            int k1 = sources.size();
            for (int i = 0; i < sources.size(); i++)
            {
                Observable observable = (Observable)sources.get(i);
                int j = i1;
                int k = j;
                if (i == sources.size() - 1)
                {
                    k = j + j1 % k1;
                }
                leSubscriber lesubscriber = new leSubscriber(i, k, child, this);
                subscribers[i] = lesubscriber;
                observable.unsafeSubscribe(lesubscriber);
            }

        }
        tick();
    }

    void tick()
    {
        if (WIP.getAndIncrement(this) == 0L)
        {
            int j = 0;
            do
            {
                int i = j;
                if (requested.get() > 0L)
                {
                    Object obj = buffer.poll();
                    i = j;
                    int k;
                    if (obj != null)
                    {
                        if (buffer.isCompleted(obj))
                        {
                            child.onCompleted();
                            i = j;
                        } else
                        {
                            buffer.accept(obj, child);
                            i = j + 1;
                            requested.decrementAndGet();
                        }
                    }
                }
                j = i;
            } while (WIP.decrementAndGet(this) > 0L);
            if (i > 0)
            {
                obj = subscribers;
                k = obj.length;
                for (j = 0; j < k; j++)
                {
                    obj[j].requestUpTo(i);
                }

            }
        }
    }


    public leSubscriber(Subscriber subscriber, List list, FuncN funcn)
    {
        sources = list;
        child = subscriber;
        combinator = funcn;
        int i = list.size();
        subscribers = new leSubscriber[i];
        collectedValues = new Object[i];
        haveValues = new BitSet(i);
        completion = new BitSet(i);
    }
}
