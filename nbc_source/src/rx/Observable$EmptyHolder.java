// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Observable, Subscriber

private static final class _cls1
{

    static final Observable INSTANCE = Observable.create(new Observable.OnSubscribe() {

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            subscriber.onCompleted();
        }

    });


    private _cls1()
    {
    }
}
