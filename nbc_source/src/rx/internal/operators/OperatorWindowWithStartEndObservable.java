// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedObserver;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            BufferUntilSubscriber

public final class OperatorWindowWithStartEndObservable
    implements rx.Observable.Operator
{
    static final class SerializedSubject
    {

        final Observer consumer;
        final Observable producer;

        public SerializedSubject(Observer observer, Observable observable)
        {
            consumer = new SerializedObserver(observer);
            producer = observable;
        }
    }

    final class SourceSubscriber extends Subscriber
    {

        final Subscriber child;
        final List chunks = new LinkedList();
        final CompositeSubscription csub;
        boolean done;
        final Object guard = new Object();
        final OperatorWindowWithStartEndObservable this$0;

        void beginWindow(Object obj)
        {
            Object obj1;
label0:
            {
                obj1 = createSerializedSubject();
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            chunks.add(obj1);
            obj2;
            JVM INSTR monitorexit ;
            child.onNext(((SerializedSubject) (obj1)).producer);
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
            obj1 = ((_cls1) (obj1)). new Subscriber() {

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

                public void onNext(Object obj)
                {
                    onCompleted();
                }

            
            {
                this$1 = final_sourcesubscriber;
                s = SerializedSubject.this;
                super();
                once = true;
            }
            };
            csub.add(((rx.Subscription) (obj1)));
            ((Observable) (obj)).unsafeSubscribe(((Subscriber) (obj1)));
            return;
            obj;
            obj2;
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
            boolean flag1;
label0:
            {
                flag1 = false;
                synchronized (guard)
                {
                    if (!done)
                    {
                        break label0;
                    }
                }
                return;
            }
            Iterator iterator = chunks.iterator();
_L2:
            boolean flag = flag1;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_65;
            }
            if ((SerializedSubject)iterator.next() != serializedsubject) goto _L2; else goto _L1
_L1:
            flag = true;
            iterator.remove();
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
    }


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
}
