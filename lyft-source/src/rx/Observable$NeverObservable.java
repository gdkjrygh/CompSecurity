// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Observable, Subscriber

class _cls1 extends Observable
{

    static _cls1 instance()
    {
        class Holder
        {

            static final Observable.NeverObservable INSTANCE = new Observable.NeverObservable();


            private Holder()
            {
            }
        }

        return Holder.INSTANCE;
    }

    _cls1()
    {
        super(new Observable.OnSubscribe() {

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
            }

        });
    }
}
