// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import rx.Subscriber;
import rx.observers.SerializedObserver;

// Referenced classes of package rx.subjects:
//            Subject

public class SerializedSubject extends Subject
{

    private final Subject actual;
    private final SerializedObserver observer;

    public SerializedSubject(final Subject actual)
    {
        super(new rx.Observable.OnSubscribe() {

            final Subject val$actual;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                actual.unsafeSubscribe(subscriber);
            }

            
            {
                actual = subject;
                super();
            }
        });
        this.actual = actual;
        observer = new SerializedObserver(actual);
    }

    public Throwable getThrowable()
    {
        return actual.getThrowable();
    }

    public Object getValue()
    {
        return actual.getValue();
    }

    public Object[] getValues()
    {
        return actual.getValues();
    }

    public Object[] getValues(Object aobj[])
    {
        return actual.getValues(aobj);
    }

    public boolean hasCompleted()
    {
        return actual.hasCompleted();
    }

    public boolean hasObservers()
    {
        return actual.hasObservers();
    }

    public boolean hasThrowable()
    {
        return actual.hasThrowable();
    }

    public boolean hasValue()
    {
        return actual.hasValue();
    }

    public void onCompleted()
    {
        observer.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        observer.onError(throwable);
    }

    public void onNext(Object obj)
    {
        observer.onNext(obj);
    }
}
