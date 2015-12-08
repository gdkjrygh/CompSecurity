// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Producer;
import rx.Subscriber;

// Referenced classes of package rx.internal.operators:
//            OperatorBufferWithSize

class val.child extends Subscriber
{

    final List chunks = new LinkedList();
    int index;
    final OperatorBufferWithSize this$0;
    final Subscriber val$child;

    public void onCompleted()
    {
        Iterator iterator = chunks.iterator();
_L1:
        List list;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        list = (List)iterator.next();
        val$child.onNext(list);
          goto _L1
        Object obj;
        obj;
        onError(((Throwable) (obj)));
        chunks.clear();
        return;
        val$child.onCompleted();
        chunks.clear();
        return;
        obj;
        chunks.clear();
        throw obj;
    }

    public void onError(Throwable throwable)
    {
        chunks.clear();
        val$child.onError(throwable);
    }

    public void onNext(Object obj)
    {
        int i = index;
        index = i + 1;
        if (i % skip == 0)
        {
            chunks.add(new ArrayList(count));
        }
        Iterator iterator = chunks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            List list = (List)iterator.next();
            list.add(obj);
            if (list.size() == count)
            {
                iterator.remove();
                val$child.onNext(list);
            }
        } while (true);
    }

    public void setProducer(final Producer producer)
    {
        val$child.setProducer(new Producer() {

            private volatile boolean firstRequest;
            private volatile boolean infinite;
            final OperatorBufferWithSize._cls2 this$1;
            final Producer val$producer;

            private void requestInfinite()
            {
                infinite = true;
                producer.request(0x7fffffffffffffffL);
            }

            public void request(long l)
            {
                if (l != 0L)
                {
                    if (l < 0L)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("request a negative number: ").append(l).toString());
                    }
                    if (!infinite)
                    {
                        if (l == 0x7fffffffffffffffL)
                        {
                            requestInfinite();
                            return;
                        }
                        if (firstRequest)
                        {
                            firstRequest = false;
                            if (l - 1L >= (0x7fffffffffffffffL - (long)count) / (long)skip)
                            {
                                requestInfinite();
                                return;
                            } else
                            {
                                producer.request((long)count + (long)skip * (l - 1L));
                                return;
                            }
                        }
                        if (l >= 0x7fffffffffffffffL / (long)skip)
                        {
                            requestInfinite();
                            return;
                        } else
                        {
                            producer.request((long)skip * l);
                            return;
                        }
                    }
                }
            }

            
            {
                this$1 = OperatorBufferWithSize._cls2.this;
                producer = producer1;
                super();
                firstRequest = true;
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
