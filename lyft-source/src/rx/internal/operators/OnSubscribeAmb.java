// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

public final class OnSubscribeAmb
    implements rx.Observable.OnSubscribe
{

    final AtomicReference choice;
    final Selection selection = new Selection();
    final Iterable sources;

    private OnSubscribeAmb(Iterable iterable)
    {
        choice = selection.choice;
        sources = iterable;
    }

    public static rx.Observable.OnSubscribe amb(Iterable iterable)
    {
        return new OnSubscribeAmb(iterable);
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2, Observable observable3)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        arraylist.add(observable3);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        arraylist.add(observable3);
        arraylist.add(observable4);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        arraylist.add(observable3);
        arraylist.add(observable4);
        arraylist.add(observable5);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        arraylist.add(observable3);
        arraylist.add(observable4);
        arraylist.add(observable5);
        arraylist.add(observable6);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        arraylist.add(observable3);
        arraylist.add(observable4);
        arraylist.add(observable5);
        arraylist.add(observable6);
        arraylist.add(observable7);
        return amb(((Iterable) (arraylist)));
    }

    public static rx.Observable.OnSubscribe amb(Observable observable, Observable observable1, Observable observable2, Observable observable3, Observable observable4, Observable observable5, Observable observable6, Observable observable7, 
            Observable observable8)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(observable);
        arraylist.add(observable1);
        arraylist.add(observable2);
        arraylist.add(observable3);
        arraylist.add(observable4);
        arraylist.add(observable5);
        arraylist.add(observable6);
        arraylist.add(observable7);
        arraylist.add(observable8);
        return amb(((Iterable) (arraylist)));
    }

    private static void unsubscribeAmbSubscribers(Collection collection)
    {
        if (!collection.isEmpty())
        {
            for (Iterator iterator = collection.iterator(); iterator.hasNext(); ((AmbSubscriber)iterator.next()).unsubscribe()) { }
            collection.clear();
        }
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.add(Subscriptions.create(new Action0() {

            final OnSubscribeAmb this$0;

            public void call()
            {
                AmbSubscriber ambsubscriber2 = (AmbSubscriber)choice.get();
                if (ambsubscriber2 != null)
                {
                    ambsubscriber2.unsubscribe();
                }
                OnSubscribeAmb.unsubscribeAmbSubscribers(selection.ambSubscribers);
            }

            
            {
                this$0 = OnSubscribeAmb.this;
                super();
            }
        }));
        Iterator iterator = sources.iterator();
        do
        {
            Observable observable;
label0:
            {
                if (iterator.hasNext())
                {
                    observable = (Observable)iterator.next();
                    if (!subscriber.isUnsubscribed())
                    {
                        break label0;
                    }
                }
                if (subscriber.isUnsubscribed())
                {
                    unsubscribeAmbSubscribers(selection.ambSubscribers);
                }
                subscriber.setProducer(new Producer() {

                    final OnSubscribeAmb this$0;

                    public void request(long l)
                    {
                        AmbSubscriber ambsubscriber2 = (AmbSubscriber)choice.get();
                        if (ambsubscriber2 != null)
                        {
                            ambsubscriber2.requestMore(l);
                        } else
                        {
                            Iterator iterator1 = selection.ambSubscribers.iterator();
                            while (iterator1.hasNext()) 
                            {
                                AmbSubscriber ambsubscriber3 = (AmbSubscriber)iterator1.next();
                                if (!ambsubscriber3.isUnsubscribed())
                                {
                                    if (choice.get() == ambsubscriber3)
                                    {
                                        ambsubscriber3.requestMore(l);
                                        return;
                                    }
                                    ambsubscriber3.requestMore(l);
                                }
                            }
                        }
                    }

            
            {
                this$0 = OnSubscribeAmb.this;
                super();
            }
                });
                return;
            }
            AmbSubscriber ambsubscriber = new AmbSubscriber(0L, subscriber, selection);
            selection.ambSubscribers.add(ambsubscriber);
            AmbSubscriber ambsubscriber1 = (AmbSubscriber)choice.get();
            if (ambsubscriber1 != null)
            {
                selection.unsubscribeOthers(ambsubscriber1);
                return;
            }
            observable.unsafeSubscribe(ambsubscriber);
        } while (true);
    }


    private class Selection
    {

        final Collection ambSubscribers;
        final AtomicReference choice;

        public void unsubscribeLosers()
        {
            AmbSubscriber ambsubscriber = (AmbSubscriber)choice.get();
            if (ambsubscriber != null)
            {
                unsubscribeOthers(ambsubscriber);
            }
        }

        public void unsubscribeOthers(AmbSubscriber ambsubscriber)
        {
            Iterator iterator = ambSubscribers.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                AmbSubscriber ambsubscriber1 = (AmbSubscriber)iterator.next();
                if (ambsubscriber1 != ambsubscriber)
                {
                    ambsubscriber1.unsubscribe();
                }
            } while (true);
            ambSubscribers.clear();
        }

        private Selection()
        {
            choice = new AtomicReference();
            ambSubscribers = new ConcurrentLinkedQueue();
        }

    }


    private class AmbSubscriber extends Subscriber
    {

        private boolean chosen;
        private final Selection selection;
        private final Subscriber subscriber;

        private boolean isSelected()
        {
            if (chosen)
            {
                return true;
            }
            if (selection.choice.get() == this)
            {
                chosen = true;
                return true;
            }
            if (selection.choice.compareAndSet(null, this))
            {
                selection.unsubscribeOthers(this);
                chosen = true;
                return true;
            } else
            {
                selection.unsubscribeLosers();
                return false;
            }
        }

        private final void requestMore(long l)
        {
            request(l);
        }

        public void onCompleted()
        {
            if (!isSelected())
            {
                return;
            } else
            {
                subscriber.onCompleted();
                return;
            }
        }

        public void onError(Throwable throwable)
        {
            if (!isSelected())
            {
                return;
            } else
            {
                subscriber.onError(throwable);
                return;
            }
        }

        public void onNext(Object obj)
        {
            if (!isSelected())
            {
                return;
            } else
            {
                subscriber.onNext(obj);
                return;
            }
        }


        private AmbSubscriber(long l, Subscriber subscriber1, Selection selection1)
        {
            subscriber = subscriber1;
            selection = selection1;
            request(l);
        }

        AmbSubscriber(long l, Subscriber subscriber1, Selection selection1, _cls1 _pcls1)
        {
            this(l, subscriber1, selection1);
        }
    }

}
