// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.producers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;

public final class ProducerObserverArbiter
    implements Observer, Producer
{

    static final Producer NULL_PRODUCER = new Producer() {

        public void request(long l)
        {
        }

    };
    final Subscriber child;
    Producer currentProducer;
    boolean emitting;
    volatile boolean hasError;
    Producer missedProducer;
    long missedRequested;
    Object missedTerminal;
    List queue;
    long requested;

    public ProducerObserverArbiter(Subscriber subscriber)
    {
        child = subscriber;
    }

    void emitLoop()
    {
        Object obj = child;
_L2:
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        List list;
        Object obj2;
        long l3;
        l3 = missedRequested;
        obj1 = missedProducer;
        obj2 = missedTerminal;
        list = queue;
        if (l3 != 0L || obj1 != null || list != null || obj2 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        missedRequested = 0L;
        missedProducer = null;
        queue = null;
        missedTerminal = null;
        this;
        JVM INSTR monitorexit ;
        boolean flag;
        if (list == null || list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (obj2 != Boolean.TRUE)
        {
            ((Subscriber) (obj)).onError((Throwable)obj2);
            return;
        }
        break MISSING_BLOCK_LABEL_129;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (flag)
        {
            ((Subscriber) (obj)).onCompleted();
            return;
        }
        long l1 = 0L;
        if (list != null)
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                Object obj3 = iterator.next();
                if (((Subscriber) (obj)).isUnsubscribed())
                {
                    break; /* Loop/switch isn't completed */
                }
                if (hasError)
                {
                    continue; /* Loop/switch isn't completed */
                }
                try
                {
                    ((Subscriber) (obj)).onNext(obj3);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    Exceptions.throwIfFatal(((Throwable) (obj1)));
                    ((Subscriber) (obj)).onError(OnErrorThrowable.addValueAsLastCause(((Throwable) (obj1)), obj3));
                    return;
                }
            }

            l1 = 0L + (long)list.size();
        }
        long l2 = requested;
        long l;
        if (l2 != 0x7fffffffffffffffL)
        {
            l = l2;
            if (l3 != 0L)
            {
                l2 += l3;
                l = l2;
                if (l2 < 0L)
                {
                    l = 0x7fffffffffffffffL;
                }
            }
            if (l1 != 0L && l != 0x7fffffffffffffffL)
            {
                l1 = l - l1;
                l = l1;
                if (l1 < 0L)
                {
                    throw new IllegalStateException("More produced than requested");
                }
            }
            requested = l;
        } else
        {
            l = l2;
        }
        if (obj1 != null)
        {
            if (obj1 == NULL_PRODUCER)
            {
                currentProducer = null;
            } else
            {
                currentProducer = ((Producer) (obj1));
                if (l != 0L)
                {
                    ((Producer) (obj1)).request(l);
                }
            }
        } else
        {
            Producer producer = currentProducer;
            if (producer != null && l3 != 0L)
            {
                producer.request(l3);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onCompleted()
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        missedTerminal = Boolean.valueOf(true);
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        child.onCompleted();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting) goto _L2; else goto _L1
_L1:
        missedTerminal = throwable;
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        if (flag)
        {
            child.onError(throwable);
            return;
        } else
        {
            hasError = true;
            return;
        }
_L2:
        emitting = true;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        throwable;
        this;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    public void onNext(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        list = queue;
        Object obj1;
        obj1 = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj1 = new ArrayList(4);
        queue = ((List) (obj1));
        ((List) (obj1)).add(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        long l;
        child.onNext(obj);
        l = requested;
        if (l == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        requested = l - 1L;
        emitLoop();
        return;
        obj;
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void request(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (l == 0L)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        missedRequested = missedRequested + l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        long l2 = requested + l;
        long l1;
        l1 = l2;
        if (l2 < 0L)
        {
            l1 = 0x7fffffffffffffffL;
        }
        Producer producer;
        requested = l1;
        producer = currentProducer;
        if (producer == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        producer.request(l);
        emitLoop();
        return;
        producer;
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        throw producer;
        producer;
        this;
        JVM INSTR monitorexit ;
        throw producer;
    }

    public void setProducer(Producer producer)
    {
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (producer == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
_L2:
        missedProducer = producer;
        this;
        JVM INSTR monitorexit ;
        return;
        producer = NULL_PRODUCER;
        if (true) goto _L2; else goto _L1
_L1:
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        long l;
        currentProducer = producer;
        l = requested;
        if (producer == null || l == 0L)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        producer.request(l);
        emitLoop();
        return;
        producer;
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        throw producer;
        producer;
        this;
        JVM INSTR monitorexit ;
        throw producer;
        producer;
        this;
        JVM INSTR monitorexit ;
        throw producer;
    }

}
