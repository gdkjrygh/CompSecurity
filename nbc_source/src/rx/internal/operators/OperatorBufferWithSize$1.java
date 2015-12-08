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

class val.child extends Subscriber
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
                val$child.onNext(list);
            }
            catch (Throwable throwable)
            {
                onError(throwable);
                return;
            }
        }
        val$child.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        buffer = null;
        val$child.onError(throwable);
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
            val$child.onNext(obj);
        }
    }

    public void setProducer(final Producer producer)
    {
        val$child.setProducer(new Producer() {

            private volatile boolean infinite;
            final OperatorBufferWithSize._cls1 this$1;
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
                    producer.request(0x7fffffffffffffffL);
                    return;
                } else
                {
                    producer.request((long)count * l);
                    return;
                }
            }

            
            {
                this$1 = OperatorBufferWithSize._cls1.this;
                producer = producer1;
                super();
                infinite = false;
            }
        });
    }

    _cls1.infinite(Subscriber subscriber1)
    {
        this$0 = final_operatorbufferwithsize;
        val$child = subscriber1;
        super(Subscriber.this);
    }
}
