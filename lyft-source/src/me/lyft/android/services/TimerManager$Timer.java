// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import java.util.concurrent.TimeUnit;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.Subscription;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import rx.subscriptions.Subscriptions;

class initialize
{

    private long secondsLeft;
    Observable timer;
    BehaviorSubject timerResult;
    private Subscription timerSubscription;

    private void initialize()
    {
        timerResult = BehaviorSubject.create();
        timer = Observable.timer(0L, 1L, TimeUnit.SECONDS, Schedulers.computation()).takeWhile(new Func1() {

            final TimerManager.Timer this$0;

            public Boolean call(Long long1)
            {
                boolean flag;
                if (secondsLeft - long1.longValue() >= 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((Long)obj);
            }

            
            {
                this$0 = TimerManager.Timer.this;
                super();
            }
        }).onBackpressureDrop().map(new Func1() {

            final TimerManager.Timer this$0;

            public Long call(Long long1)
            {
                return Long.valueOf(secondsLeft - long1.longValue());
            }

            public volatile Object call(Object obj)
            {
                return call((Long)obj);
            }

            
            {
                this$0 = TimerManager.Timer.this;
                super();
            }
        });
        timerSubscription = timer.subscribe(new SimpleSubscriber() {

            final TimerManager.Timer this$0;

            public void onNext(Long long1)
            {
                super.onNext(long1);
                timerResult.onNext(long1);
            }

            public volatile void onNext(Object obj)
            {
                onNext((Long)obj);
            }

            
            {
                this$0 = TimerManager.Timer.this;
                super();
            }
        });
    }

    public Observable observe()
    {
        return timerResult.asObservable();
    }

    public void stop()
    {
        timerSubscription.unsubscribe();
    }


    _cls3.this._cls0(long l)
    {
        timerSubscription = Subscriptions.empty();
        secondsLeft = l;
        initialize();
    }
}
