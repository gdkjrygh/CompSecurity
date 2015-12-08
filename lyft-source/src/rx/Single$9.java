// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Subscriber, Single, SingleSubscriber

class r extends Subscriber
{

    final Single this$0;
    final SingleSubscriber val$te;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        val$te.onError(throwable);
    }

    public void onNext(Object obj)
    {
        val$te.onSuccess(obj);
    }

    scriber()
    {
        this$0 = final_single;
        val$te = SingleSubscriber.this;
        super();
    }
}
