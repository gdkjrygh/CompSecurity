// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import me.lyft.android.common.Objects;
import rx.Subscriber;
import rx.subjects.BehaviorSubject;
import rx.subjects.Subject;

public final class ReactiveProperty extends Subject
{

    private static final EqualityComparator ALLOW_DUPLICATES_COMPARATOR = new EqualityComparator() {

        public boolean equals(Object obj, Object obj1)
        {
            return false;
        }

    };
    private static final EqualityComparator DEFAULT_EQUALITY_COMPARATOR = new EqualityComparator() {

        public boolean equals(Object obj, Object obj1)
        {
            return Objects.equals(obj, obj1);
        }

    };
    private EqualityComparator equalityComparator;
    private Subject subject;
    private Object value;

    public ReactiveProperty(rx.Observable.OnSubscribe onsubscribe, Subject subject1, Object obj)
    {
        super(onsubscribe);
        subject = subject1;
        value = obj;
    }

    public static ReactiveProperty create()
    {
        final BehaviorSubject subject = BehaviorSubject.create();
        return new ReactiveProperty(new rx.Observable.OnSubscribe() {

            final BehaviorSubject val$subject;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                subject.subscribe(subscriber);
            }

            
            {
                subject = behaviorsubject;
                super();
            }
        }, subject, null);
    }

    public static ReactiveProperty create(Object obj)
    {
        final BehaviorSubject subject = BehaviorSubject.create(obj);
        return new ReactiveProperty(new rx.Observable.OnSubscribe() {

            final BehaviorSubject val$subject;

            public volatile void call(Object obj1)
            {
                call((Subscriber)obj1);
            }

            public void call(Subscriber subscriber)
            {
                subject.subscribe(subscriber);
            }

            
            {
                subject = behaviorsubject;
                super();
            }
        }, subject, obj);
    }

    private EqualityComparator getEqualityComparator()
    {
        return (EqualityComparator)Objects.firstNonNull(equalityComparator, DEFAULT_EQUALITY_COMPARATOR);
    }

    public ReactiveProperty allowDuplicates()
    {
        equalityComparator = ALLOW_DUPLICATES_COMPARATOR;
        return this;
    }

    public Object get()
    {
        return value;
    }

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
        if (!getEqualityComparator().equals(value, obj))
        {
            value = obj;
            subject.onNext(obj);
        }
    }

    public ReactiveProperty setEqualityComparator(EqualityComparator equalitycomparator)
    {
        equalityComparator = equalitycomparator;
        return this;
    }


    private class EqualityComparator
    {

        public abstract boolean equals(Object obj, Object obj1);
    }

}
