// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Observable, Subscriber

class 
    implements Subscribe
{

    final Observable this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        subscriber.add(Observable.access$000(subscriber, Observable.this));
    }

    ()
    {
        this$0 = Observable.this;
        super();
    }
}
