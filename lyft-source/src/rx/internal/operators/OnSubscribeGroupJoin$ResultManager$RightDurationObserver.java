// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Map;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

final class id extends Subscriber
{

    final int id;
    boolean once;
    final onCompleted this$1;

    public void onCompleted()
    {
        if (once)
        {
            once = false;
            synchronized (this._cls1.this.once)
            {
                _fld1.remove(Integer.valueOf(id));
            }
            this._cls1.this.id.remove(this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onError(Throwable throwable)
    {
        _mth1(throwable);
    }

    public void onNext(Object obj)
    {
        onCompleted();
    }

    public (int i)
    {
        this$1 = this._cls1.this;
        super();
        once = true;
        id = i;
    }
}
