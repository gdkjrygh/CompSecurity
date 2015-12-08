// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.producers;

import rx.Producer;

public final class ProducerArbiter
    implements Producer
{

    static final Producer NULL_PRODUCER = new Producer() {

        public void request(long l)
        {
        }

    };
    Producer currentProducer;
    boolean emitting;
    long missedProduced;
    Producer missedProducer;
    long missedRequested;
    long requested;

    public ProducerArbiter()
    {
    }

    public void emitLoop()
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        Object obj;
        long l2;
        long l3;
        l2 = missedRequested;
        l3 = missedProduced;
        obj = missedProducer;
        if (l2 != 0L || l3 != 0L || obj != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        return;
        missedRequested = 0L;
        missedProduced = 0L;
        missedProducer = null;
        this;
        JVM INSTR monitorexit ;
        long l1 = requested;
        long l = l1;
        if (l1 != 0x7fffffffffffffffL)
        {
            l = l1 + l2;
            if (l < 0L || l == 0x7fffffffffffffffL)
            {
                requested = 0x7fffffffffffffffL;
                l = 0x7fffffffffffffffL;
            } else
            {
                l -= l3;
                if (l < 0L)
                {
                    throw new IllegalStateException("more produced than requested");
                }
                requested = l;
            }
        }
        if (obj != null)
        {
            if (obj == NULL_PRODUCER)
            {
                currentProducer = null;
            } else
            {
                currentProducer = ((Producer) (obj));
                ((Producer) (obj)).request(l);
            }
        } else
        {
            Producer producer = currentProducer;
            if (producer != null && l2 != 0L)
            {
                producer.request(l2);
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void produced(long l)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("n > 0 required");
        }
        this;
        JVM INSTR monitorenter ;
        if (!emitting)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        missedProduced = missedProduced + l;
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        long l1 = requested;
        if (l1 == 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        l = l1 - l;
        if (l >= 0L)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        throw new IllegalStateException("more items arrived than were requested");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorenter ;
        emitting = false;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        requested = l;
        emitLoop();
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
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
            break MISSING_BLOCK_LABEL_27;
        }
        Producer producer1;
        producer1 = producer;
        if (producer != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        producer1 = NULL_PRODUCER;
        missedProducer = producer1;
        this;
        JVM INSTR monitorexit ;
        return;
        emitting = true;
        this;
        JVM INSTR monitorexit ;
        currentProducer = producer;
        if (producer == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        producer.request(requested);
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
