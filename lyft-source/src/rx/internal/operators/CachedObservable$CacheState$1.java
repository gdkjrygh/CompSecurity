// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

class this._cls0 extends Subscriber
{

    final Next this$0;

    public void onCompleted()
    {
        Completed();
    }

    public void onError(Throwable throwable)
    {
        Error(throwable);
    }

    public void onNext(Object obj)
    {
        Next(obj);
    }

    _cls9()
    {
        this$0 = this._cls0.this;
        super();
    }
}
