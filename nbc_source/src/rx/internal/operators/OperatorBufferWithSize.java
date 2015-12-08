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

public final class OperatorBufferWithSize
    implements rx.Observable.Operator
{

    final int count;
    final int skip;

    public OperatorBufferWithSize(int i, int j)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (j <= 0)
        {
            throw new IllegalArgumentException("skip must be greater than 0");
        } else
        {
            count = i;
            skip = j;
            return;
        }
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        if (count == skip)
        {
            return new Subscriber(final_subscriber) {

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

                public void setProducer(Producer producer)
                {
                    child.setProducer(producer. new Producer() {

                        private volatile boolean infinite;
                        final _cls1 this$1;
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
                this$1 = final__pcls1;
                producer = Producer.this;
                super();
                infinite = false;
            }
                    });
                }

            
            {
                this$0 = OperatorBufferWithSize.this;
                child = subscriber1;
                super(final_subscriber);
            }
            };
        } else
        {
            return new Subscriber(final_subscriber) {

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
                    child.onNext(list);
                      goto _L1
                    Object obj;
                    obj;
                    onError(((Throwable) (obj)));
                    chunks.clear();
                    return;
                    child.onCompleted();
                    chunks.clear();
                    return;
                    obj;
                    chunks.clear();
                    throw obj;
                }

                public void onError(Throwable throwable)
                {
                    chunks.clear();
                    child.onError(throwable);
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
                            child.onNext(list);
                        }
                    } while (true);
                }

                public void setProducer(Producer producer)
                {
                    child.setProducer(producer. new Producer() {

                        private volatile boolean firstRequest;
                        private volatile boolean infinite;
                        final _cls2 this$1;
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
                this$1 = final__pcls2;
                producer = Producer.this;
                super();
                firstRequest = true;
                infinite = false;
            }
                    });
                }

            
            {
                this$0 = OperatorBufferWithSize.this;
                child = subscriber1;
                super(final_subscriber);
            }
            };
        }
    }
}
