// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.exceptions.OnErrorNotImplementedException;

// Referenced classes of package rx:
//            Subscriber, Single

class r extends Subscriber
{

    final Single this$0;

    public final void onCompleted()
    {
    }

    public final void onError(Throwable throwable)
    {
        throw new OnErrorNotImplementedException(throwable);
    }

    public final void onNext(Object obj)
    {
    }

    ject()
    {
        this$0 = Single.this;
        super();
    }
}
