// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;

final class id extends Subscriber
{

    final int id;
    boolean once;
    final onCompleted this$2;

    public void onCompleted()
    {
        if (once)
        {
            once = false;
            once.this.once(id, this);
        }
    }

    public void onError(Throwable throwable)
    {
        id.this.id(throwable);
    }

    public void onNext(Object obj)
    {
        onCompleted();
    }

    public (int i)
    {
        this$2 = this._cls2.this;
        super();
        once = true;
        id = i;
    }
}
