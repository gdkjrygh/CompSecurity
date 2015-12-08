// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.rx;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.functions.Func1;

public class RetryWithDelay
    implements Func1
{

    private int retryCount;
    private final int retryDelayMillis;

    public RetryWithDelay(int i, int j)
    {
        retryDelayMillis = j;
        retryCount = i;
    }

    public volatile Object call(Object obj)
    {
        return call((Observable)obj);
    }

    public Observable call(Observable observable)
    {
        return observable.flatMap(new Func1() {

            final RetryWithDelay this$0;

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                if (int i = ((Object) (this)).Object - 1 > 0)
                {
                    return Observable.timer(retryDelayMillis, TimeUnit.MILLISECONDS);
                } else
                {
                    return Observable.error(throwable);
                }
            }

            
            {
                this$0 = RetryWithDelay.this;
                super();
            }
        });
    }


/*
    static int access$006(RetryWithDelay retrywithdelay)
    {
        int i = retrywithdelay.retryCount - 1;
        retrywithdelay.retryCount = i;
        return i;
    }

*/

}
