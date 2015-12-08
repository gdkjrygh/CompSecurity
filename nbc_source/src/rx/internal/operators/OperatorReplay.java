// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.subjects.Subject;

public final class OperatorReplay
{
    public static final class SubjectWrapper extends Subject
    {

        final Subject subject;

        public boolean hasObservers()
        {
            return subject.hasObservers();
        }

        public void onCompleted()
        {
            subject.onCompleted();
        }

        public void onError(Throwable throwable)
        {
            subject.onError(throwable);
        }

        public void onNext(Object obj)
        {
            subject.onNext(obj);
        }

        public SubjectWrapper(rx.Observable.OnSubscribe onsubscribe, Subject subject1)
        {
            super(onsubscribe);
            subject = subject1;
        }
    }


    private OperatorReplay()
    {
        throw new IllegalStateException("No instances!");
    }

    public static Subject createScheduledSubject(Subject subject, Scheduler scheduler)
    {
        return new SubjectWrapper(new rx.Observable.OnSubscribe(subject.observeOn(scheduler)) {

            final Observable val$observedOn;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                OperatorReplay.subscriberOf(observedOn).call(subscriber);
            }

            
            {
                observedOn = observable;
                super();
            }
        }, subject);
    }

    public static rx.Observable.OnSubscribe subscriberOf(Observable observable)
    {
        return new rx.Observable.OnSubscribe(observable) {

            final Observable val$target;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                target.unsafeSubscribe(subscriber);
            }

            
            {
                target = observable;
                super();
            }
        };
    }
}
