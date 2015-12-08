// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.rx:
//            RetryWithDelay

class this._cls0
    implements Func1
{

    final RetryWithDelay this$0;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        if (RetryWithDelay.access$006(RetryWithDelay.this) > 0)
        {
            return Observable.timer(RetryWithDelay.access$100(RetryWithDelay.this), TimeUnit.MILLISECONDS);
        } else
        {
            return Observable.error(throwable);
        }
    }

    ()
    {
        this$0 = RetryWithDelay.this;
        super();
    }
}
