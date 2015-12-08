// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorBufferWithSize

class infinite
    implements Producer
{

    private volatile boolean infinite;
    final t this$1;
    final Producer val$producer;

    public void request(long l)
    {
        if (infinite)
        {
            return;
        }
        if (l >= 0x7fffffffffffffffL / (long)count)
        {
            infinite = true;
            val$producer.request(0x7fffffffffffffffL);
            return;
        } else
        {
            val$producer.request((long)count * l);
            return;
        }
    }

    l.child()
    {
        this$1 = final_child;
        val$producer = Producer.this;
        super();
        infinite = false;
    }

    // Unreferenced inner class rx/internal/operators/OperatorBufferWithSize$1

/* anonymous class */
    class OperatorBufferWithSize._cls1 extends Subscriber
    {

        List buffer;
        final OperatorBufferWithSize this$0;
        final Subscriber val$child;

        public void onCompleted()
        {
            List list = buffer;
            buffer = null;
            if (list != null)
            {
                try
                {
                    child.onNext(list);
                }
                catch (Throwable throwable)
                {
                    onError(throwable);
                    return;
                }
            }
            child.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            buffer = null;
            child.onError(throwable);
        }

        public void onNext(Object obj)
        {
            if (buffer == null)
            {
                buffer = new ArrayList(count);
            }
            buffer.add(obj);
            if (buffer.size() == count)
            {
                obj = buffer;
                buffer = null;
                child.onNext(obj);
            }
        }

        public void setProducer(Producer producer1)
        {
            child.setProducer(producer1. new OperatorBufferWithSize._cls1._cls1());
        }

            
            {
                this$0 = final_operatorbufferwithsize;
                child = subscriber1;
                super(Subscriber.this);
            }
    }

}
