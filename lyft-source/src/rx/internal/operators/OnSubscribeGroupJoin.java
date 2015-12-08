// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;

public final class OnSubscribeGroupJoin
    implements rx.Observable.OnSubscribe
{

    protected final Observable left;
    protected final Func1 leftDuration;
    protected final Func2 resultSelector;
    protected final Observable right;
    protected final Func1 rightDuration;

    public OnSubscribeGroupJoin(Observable observable, Observable observable1, Func1 func1, Func1 func1_1, Func2 func2)
    {
        left = observable;
        right = observable1;
        leftDuration = func1;
        rightDuration = func1_1;
        resultSelector = func2;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        ResultManager resultmanager = new ResultManager(new SerializedSubscriber(subscriber));
        subscriber.add(resultmanager);
        resultmanager.init();
    }

    private class ResultManager
        implements Subscription
    {

        final RefCountSubscription cancel;
        final CompositeSubscription group = new CompositeSubscription();
        final Object guard = new Object();
        boolean leftDone;
        int leftIds;
        final Map leftMap = new HashMap();
        boolean rightDone;
        int rightIds;
        final Map rightMap = new HashMap();
        final Subscriber subscriber;
        final OnSubscribeGroupJoin this$0;

        void complete(List list)
        {
            if (list != null)
            {
                for (list = list.iterator(); list.hasNext(); ((Observer)list.next()).onCompleted()) { }
                subscriber.onCompleted();
                cancel.unsubscribe();
            }
        }

        void errorAll(Throwable throwable)
        {
            ArrayList arraylist;
            synchronized (guard)
            {
                arraylist = new ArrayList(leftMap.values());
                leftMap.clear();
                rightMap.clear();
            }
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((Observer)((Iterator) (obj)).next()).onError(throwable)) { }
            break MISSING_BLOCK_LABEL_83;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
            subscriber.onError(throwable);
            cancel.unsubscribe();
            return;
        }

        void errorMain(Throwable throwable)
        {
            synchronized (guard)
            {
                leftMap.clear();
                rightMap.clear();
            }
            subscriber.onError(throwable);
            cancel.unsubscribe();
            return;
            throwable;
            obj;
            JVM INSTR monitorexit ;
            throw throwable;
        }

        public void init()
        {
            class LeftObserver extends Subscriber
            {

                final ResultManager this$1;

                public void onCompleted()
                {
                    ArrayList arraylist = null;
                    synchronized (guard)
                    {
                        leftDone = true;
                        if (rightDone)
                        {
                            arraylist = new ArrayList(leftMap.values());
                            leftMap.clear();
                            rightMap.clear();
                        }
                    }
                    complete(arraylist);
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                public void onError(Throwable throwable)
                {
                    errorAll(throwable);
                }

                public void onNext(Object obj)
                {
                    SerializedObserver serializedobserver;
                    Object obj2;
                    obj2 = PublishSubject.create();
                    serializedobserver = new SerializedObserver(((Observer) (obj2)));
                    int i;
                    synchronized (guard)
                    {
                        ResultManager resultmanager = ResultManager.this;
                        i = resultmanager.leftIds;
                        resultmanager.leftIds = i + 1;
                        leftMap.put(Integer.valueOf(i), serializedobserver);
                    }
                    obj1 = Observable.create(new WindowObservableFunc(((Observable) (obj2)), cancel));
                    obj2 = (Observable)leftDuration.call(obj);
                    class LeftDurationObserver extends Subscriber
                    {

                        final int id;
                        boolean once;
                        final ResultManager this$1;

                        public void onCompleted()
                        {
                            if (once)
                            {
                                once = false;
                                Observer observer;
                                synchronized (guard)
                                {
                                    observer = (Observer)leftMap.remove(Integer.valueOf(id));
                                }
                                if (observer != null)
                                {
                                    observer.onCompleted();
                                }
                                group.remove(this);
                            }
                            return;
                            exception1;
                            obj3;
                            JVM INSTR monitorexit ;
                            throw exception1;
                        }

                        public void onError(Throwable throwable)
                        {
                            errorMain(throwable);
                        }

                        public void onNext(Object obj3)
                        {
                            onCompleted();
                        }

                            public LeftDurationObserver(int i)
                            {
                                this$1 = ResultManager.this;
                                super();
                                once = true;
                                id = i;
                            }
                    }

                    LeftDurationObserver leftdurationobserver = new LeftDurationObserver(i);
                    group.add(leftdurationobserver);
                    ((Observable) (obj2)).unsafeSubscribe(leftdurationobserver);
                    obj1 = resultSelector.call(obj, obj1);
                    ArrayList arraylist;
                    synchronized (guard)
                    {
                        arraylist = new ArrayList(rightMap.values());
                    }
                    try
                    {
                        subscriber.onNext(obj1);
                        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); serializedobserver.onNext(((Iterator) (obj)).next())) { }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        onError(((Throwable) (obj)));
                    }
                    return;
                    obj;
                    obj1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                LeftObserver()
                {
                    this$1 = ResultManager.this;
                    super();
                }

                private class WindowObservableFunc
                    implements rx.Observable.OnSubscribe
                {

                    final RefCountSubscription refCount;
                    final Observable underlying;

                    public volatile void call(Object obj)
                    {
                        call((Subscriber)obj);
                    }

                    public void call(Subscriber subscriber1)
                    {
                        Subscription subscription = refCount.get();
                        class WindowSubscriber extends Subscriber
                        {

                            private final Subscription ref;
                            final Subscriber subscriber;
                            final WindowObservableFunc this$0;

                            public void onCompleted()
                            {
                                subscriber.onCompleted();
                                ref.unsubscribe();
                            }

                            public void onError(Throwable throwable)
                            {
                                subscriber.onError(throwable);
                                ref.unsubscribe();
                            }

                            public void onNext(Object obj)
                            {
                                subscriber.onNext(obj);
                            }

                            public WindowSubscriber(Subscriber subscriber1, Subscription subscription)
                            {
                                this$0 = WindowObservableFunc.this;
                                super(subscriber1);
                                subscriber = subscriber1;
                                ref = subscription;
                            }
                        }

                        subscriber1 = new WindowSubscriber(subscriber1, subscription);
                        subscriber1.add(subscription);
                        underlying.unsafeSubscribe(subscriber1);
                    }

                    public WindowObservableFunc(Observable observable, RefCountSubscription refcountsubscription)
                    {
                        refCount = refcountsubscription;
                        underlying = observable;
                    }
                }

            }

            LeftObserver leftobserver = new LeftObserver();
            class RightObserver extends Subscriber
            {

                final ResultManager this$1;

                public void onCompleted()
                {
                    ArrayList arraylist = null;
                    synchronized (guard)
                    {
                        rightDone = true;
                        if (leftDone)
                        {
                            arraylist = new ArrayList(leftMap.values());
                            leftMap.clear();
                            rightMap.clear();
                        }
                    }
                    complete(arraylist);
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                public void onError(Throwable throwable)
                {
                    errorAll(throwable);
                }

                public void onNext(Object obj)
                {
                    int i;
                    synchronized (guard)
                    {
                        ResultManager resultmanager = ResultManager.this;
                        i = resultmanager.rightIds;
                        resultmanager.rightIds = i + 1;
                        rightMap.put(Integer.valueOf(i), obj);
                    }
                    obj1 = (Observable)rightDuration.call(obj);
                    class RightDurationObserver extends Subscriber
                    {

                        final int id;
                        boolean once;
                        final ResultManager this$1;

                        public void onCompleted()
                        {
                            if (once)
                            {
                                once = false;
                                synchronized (guard)
                                {
                                    rightMap.remove(Integer.valueOf(id));
                                }
                                group.remove(this);
                            }
                            return;
                            exception;
                            obj2;
                            JVM INSTR monitorexit ;
                            throw exception;
                        }

                        public void onError(Throwable throwable)
                        {
                            errorMain(throwable);
                        }

                        public void onNext(Object obj2)
                        {
                            onCompleted();
                        }

                            public RightDurationObserver(int i)
                            {
                                this$1 = ResultManager.this;
                                super();
                                once = true;
                                id = i;
                            }
                    }

                    RightDurationObserver rightdurationobserver = new RightDurationObserver(i);
                    group.add(rightdurationobserver);
                    ((Observable) (obj1)).unsafeSubscribe(rightdurationobserver);
                    ArrayList arraylist;
                    synchronized (guard)
                    {
                        arraylist = new ArrayList(leftMap.values());
                    }
                    try
                    {
                        for (obj1 = arraylist.iterator(); ((Iterator) (obj1)).hasNext(); ((Observer)((Iterator) (obj1)).next()).onNext(obj)) { }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        onError(((Throwable) (obj)));
                    }
                    return;
                    obj;
                    obj1;
                    JVM INSTR monitorexit ;
                    throw obj;
                    obj;
                    obj1;
                    JVM INSTR monitorexit ;
                    throw obj;
                }

                RightObserver()
                {
                    this$1 = ResultManager.this;
                    super();
                }
            }

            RightObserver rightobserver = new RightObserver();
            group.add(leftobserver);
            group.add(rightobserver);
            left.unsafeSubscribe(leftobserver);
            right.unsafeSubscribe(rightobserver);
        }

        public boolean isUnsubscribed()
        {
            return cancel.isUnsubscribed();
        }

        public void unsubscribe()
        {
            cancel.unsubscribe();
        }

        public ResultManager(Subscriber subscriber1)
        {
            this$0 = OnSubscribeGroupJoin.this;
            super();
            subscriber = subscriber1;
            cancel = new RefCountSubscription(group);
        }
    }

}
