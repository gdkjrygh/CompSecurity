// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

public final class OperatorWindowWithSize
    implements rx.Observable.Operator
{

    final int size;
    final int skip;

    public OperatorWindowWithSize(int i, int j)
    {
        size = i;
        skip = j;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(Subscriber subscriber)
    {
        if (skip == size)
        {
            subscriber = new ExactSubscriber(subscriber);
            subscriber.init();
            return subscriber;
        } else
        {
            subscriber = new InexactSubscriber(subscriber);
            subscriber.init();
            return subscriber;
        }
    }

    private class ExactSubscriber extends Subscriber
    {

        final Subscriber child;
        int count;
        volatile boolean noWindow;
        final OperatorWindowWithSize this$0;
        BufferUntilSubscriber window;

        void init()
        {
            child.add(Subscriptions.create(new Action0() {

                final ExactSubscriber this$1;

                public void call()
                {
                    if (noWindow)
                    {
                        unsubscribe();
                    }
                }

                
                {
                    this$1 = ExactSubscriber.this;
                    super();
                }
            }));
            child.setProducer(new Producer() {

                final ExactSubscriber this$1;

                public void request(long l)
                {
                    if (l > 0L)
                    {
                        long l2 = (long)size * l;
                        long l1 = l2;
                        if (l2 >>> 31 != 0L)
                        {
                            l1 = l2;
                            if (l2 / l != (long)size)
                            {
                                l1 = 0x7fffffffffffffffL;
                            }
                        }
                        requestMore(l1);
                    }
                }

                
                {
                    this$1 = ExactSubscriber.this;
                    super();
                }
            });
        }

        public void onCompleted()
        {
            if (window != null)
            {
                window.onCompleted();
            }
            child.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            if (window != null)
            {
                window.onError(throwable);
            }
            child.onError(throwable);
        }

        public void onNext(Object obj)
        {
            if (window == null)
            {
                noWindow = false;
                window = BufferUntilSubscriber.create();
                child.onNext(window);
            }
            window.onNext(obj);
            int i = count + 1;
            count = i;
            if (i % size == 0)
            {
                window.onCompleted();
                window = null;
                noWindow = true;
                if (child.isUnsubscribed())
                {
                    unsubscribe();
                }
            }
        }

        void requestMore(long l)
        {
            request(l);
        }

        public ExactSubscriber(Subscriber subscriber)
        {
            this$0 = OperatorWindowWithSize.this;
            super();
            noWindow = true;
            child = subscriber;
        }
    }


    private class InexactSubscriber extends Subscriber
    {

        final Subscriber child;
        final List chunks = new LinkedList();
        int count;
        volatile boolean noWindow;
        final OperatorWindowWithSize this$0;

        CountedSubject createCountedSubject()
        {
            BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
            return new CountedSubject(bufferuntilsubscriber, bufferuntilsubscriber);
        }

        void init()
        {
            child.add(Subscriptions.create(new Action0() {

                final InexactSubscriber this$1;

                public void call()
                {
                    if (noWindow)
                    {
                        unsubscribe();
                    }
                }

                
                {
                    this$1 = InexactSubscriber.this;
                    super();
                }
            }));
            child.setProducer(new Producer() {

                final InexactSubscriber this$1;

                public void request(long l)
                {
                    if (l > 0L)
                    {
                        long l2 = (long)size * l;
                        long l1 = l2;
                        if (l2 >>> 31 != 0L)
                        {
                            l1 = l2;
                            if (l2 / l != (long)size)
                            {
                                l1 = 0x7fffffffffffffffL;
                            }
                        }
                        requestMore(l1);
                    }
                }

                
                {
                    this$1 = InexactSubscriber.this;
                    super();
                }
            });
        }

        public void onCompleted()
        {
            Object obj = new ArrayList(chunks);
            chunks.clear();
            noWindow = true;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((CountedSubject)((Iterator) (obj)).next()).consumer.onCompleted()) { }
            child.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            Object obj = new ArrayList(chunks);
            chunks.clear();
            noWindow = true;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((CountedSubject)((Iterator) (obj)).next()).consumer.onError(throwable)) { }
            child.onError(throwable);
        }

        public void onNext(Object obj)
        {
            int i = count;
            count = i + 1;
            if (i % skip == 0 && !child.isUnsubscribed())
            {
                if (chunks.isEmpty())
                {
                    noWindow = false;
                }
                CountedSubject countedsubject = createCountedSubject();
                chunks.add(countedsubject);
                child.onNext(countedsubject.producer);
            }
            Iterator iterator = chunks.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                CountedSubject countedsubject1 = (CountedSubject)iterator.next();
                countedsubject1.consumer.onNext(obj);
                int j = countedsubject1.count + 1;
                countedsubject1.count = j;
                if (j == size)
                {
                    iterator.remove();
                    countedsubject1.consumer.onCompleted();
                }
            } while (true);
            if (chunks.isEmpty())
            {
                noWindow = true;
                if (child.isUnsubscribed())
                {
                    unsubscribe();
                }
            }
        }

        void requestMore(long l)
        {
            request(l);
        }

        public InexactSubscriber(Subscriber subscriber)
        {
            this$0 = OperatorWindowWithSize.this;
            super();
            noWindow = true;
            child = subscriber;
        }

        private class CountedSubject
        {

            final Observer consumer;
            int count;
            final Observable producer;

            public CountedSubject(Observer observer, Observable observable)
            {
                consumer = observer;
                producer = observable;
            }
        }

    }

}
