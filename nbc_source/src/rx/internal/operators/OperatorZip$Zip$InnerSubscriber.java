// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observer;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.RxRingBuffer;

// Referenced classes of package rx.internal.operators:
//            OperatorZip

final class this._cls0 extends Subscriber
{

    final RxRingBuffer items = RxRingBuffer.getSpmcInstance();
    final request this$0;

    public void onCompleted()
    {
        items.onCompleted();
        items.this.items();
    }

    public void onError(Throwable throwable)
    {
        items(this._cls0.this).onError(throwable);
    }

    public void onNext(Object obj)
    {
        try
        {
            items.onNext(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            onError(((Throwable) (obj)));
        }
        onError.this.onError();
    }

    public void onStart()
    {
        request(RxRingBuffer.SIZE);
    }

    public void requestMore(long l)
    {
        request(l);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
