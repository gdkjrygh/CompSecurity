// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Map;
import rx.Observer;
import rx.Subscriber;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package rx.internal.operators:
//            OnSubscribeGroupJoin

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
            Observer observer;
            synchronized (this._cls1.this.once)
            {
                observer = (Observer)_fld1.remove(Integer.valueOf(id));
            }
            if (observer != null)
            {
                observer.onCompleted();
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
