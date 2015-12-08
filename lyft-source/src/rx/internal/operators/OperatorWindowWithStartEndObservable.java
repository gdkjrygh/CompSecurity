// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.subscriptions.CompositeSubscription;

public final class OperatorWindowWithStartEndObservable
    implements rx.Observable.Operator
{

    final Func1 windowClosingSelector;
    final Observable windowOpenings;

    public OperatorWindowWithStartEndObservable(Observable observable, Func1 func1)
    {
        windowOpenings = observable;
        windowClosingSelector = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber sub)
    {
        CompositeSubscription compositesubscription = new CompositeSubscription();
        sub.add(compositesubscription);
        sub = new SourceSubscriber(sub, compositesubscription);
        Subscriber subscriber = new Subscriber() {

            final OperatorWindowWithStartEndObservable this$0;
            final SourceSubscriber val$sub;

            public void onCompleted()
            {
                sub.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                sub.onError(throwable);
            }

            public void onNext(Object obj)
            {
                sub.beginWindow(obj);
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorWindowWithStartEndObservable.this;
                sub = sourcesubscriber;
                super();
            }
        };
        compositesubscription.add(sub);
        compositesubscription.add(subscriber);
        windowOpenings.unsafeSubscribe(subscriber);
        return sub;
    }

    private class SourceSubscriber extends Subscriber
    {

        final Subscriber child;
        final List chunks = new LinkedList();
        final CompositeSubscription csub;
        boolean done;
        final Object guard = new Object();
        final OperatorWindowWithStartEndObservable this$0;

        void beginWindow(Object obj)
        {
            final SerializedSubject s;
label0:
            {
                s = createSerializedSubject();
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            chunks.add(s);
            obj1;
            JVM INSTR monitorexit ;
            child.onNext(s.producer);
            try
            {
                obj = (Observable)windowClosingSelector.call(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onError(((Throwable) (obj)));
                return;
            }
            s = new Subscriber() {

                boolean once;
                final SourceSubscriber this$1;
                final SerializedSubject val$s;

                public void onCompleted()
                {
                    if (once)
                    {
                        once = false;
                        endWindow(s);
                        csub.remove(this);
                    }
                }

                public void onError(Throwable throwable)
                {
                }

                public void onNext(Object obj2)
                {
                    onCompleted();
                }

                
                {
                    this$1 = SourceSubscriber.this;
                    s = serializedsubject;
                    super();
                    once = true;
                }
            };
            csub.add(s);
            ((Observable) (obj)).unsafeSubscribe(s);
            return;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        SerializedSubject createSerializedSubject()
        {
            BufferUntilSubscriber bufferuntilsubscriber = BufferUntilSubscriber.create();
            return new SerializedSubject(bufferuntilsubscriber, bufferuntilsubscriber);
        }

        void endWindow(SerializedSubject serializedsubject)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            Iterator iterator;
            iterator = chunks.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_80;
                }
            } while ((SerializedSubject)iterator.next() != serializedsubject);
            boolean flag = true;
            iterator.remove();
_L1:
            obj;
            JVM INSTR monitorexit ;
            if (flag)
            {
                serializedsubject.consumer.onCompleted();
                return;
            } else
            {
                return;
            }
            serializedsubject;
            obj;
            JVM INSTR monitorexit ;
            throw serializedsubject;
            flag = false;
              goto _L1
        }

        public void onCompleted()
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                csub.unsubscribe();
                return;
            }
            ArrayList arraylist;
            done = true;
            arraylist = new ArrayList(chunks);
            chunks.clear();
            obj;
            JVM INSTR monitorexit ;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((SerializedSubject)((Iterator) (obj)).next()).consumer.onCompleted()) { }
            break MISSING_BLOCK_LABEL_103;
            obj;
            csub.unsubscribe();
            throw obj;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            child.onCompleted();
            csub.unsubscribe();
            return;
        }

        public void onError(Throwable throwable)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                csub.unsubscribe();
                return;
            }
            ArrayList arraylist;
            done = true;
            arraylist = new ArrayList(chunks);
            chunks.clear();
            obj;
            JVM INSTR monitorexit ;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((SerializedSubject)((Iterator) (obj)).next()).consumer.onError(throwable)) { }
            break MISSING_BLOCK_LABEL_104;
            throwable;
            csub.unsubscribe();
            throw throwable;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            child.onError(throwable);
            csub.unsubscribe();
            return;
        }

        public void onNext(Object obj)
        {
label0:
            {
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            ArrayList arraylist = new ArrayList(chunks);
            obj1;
            JVM INSTR monitorexit ;
            for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); ((SerializedSubject)((Iterator) (obj1)).next()).consumer.onNext(obj)) { }
            break MISSING_BLOCK_LABEL_73;
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

        public SourceSubscriber(Subscriber subscriber, CompositeSubscription compositesubscription)
        {
            this$0 = OperatorWindowWithStartEndObservable.this;
            super();
            child = new SerializedSubscriber(subscriber);
            csub = compositesubscription;
        }

        private class SerializedSubject
        {

            final Observer consumer;
            final Observable producer;

            public SerializedSubject(Observer observer, Observable observable)
            {
                consumer = new SerializedObserver(observer);
                producer = observable;
            }
        }

    }

}
