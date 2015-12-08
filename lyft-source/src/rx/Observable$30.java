// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Subscriber, Observable, Observer

class it> extends Subscriber
{

    final Observable this$0;
    final Observer val$observer;

    public void onCompleted()
    {
        val$observer.onCompleted();
    }

    public void onError(Throwable throwable)
    {
        val$observer.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$observer.onNext(obj);
    }

    le()
    {
        this$0 = final_observable;
        val$observer = Observer.this;
        super();
    }
}
