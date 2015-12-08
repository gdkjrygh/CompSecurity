// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Objects;
import rx.Observable;

// Referenced classes of package me.lyft.android.services:
//            TimerRecord

public class TimerManager
{

    ILyftPreferences lyftPreferences;
    private Map timerCache;

    TimerManager()
    {
        timerCache = new HashMap();
    }

    private Observable createTimerOrLoadFromCached(long l, String s, String s1)
    {
        TimerCacheValue timercachevalue = (TimerCacheValue)timerCache.get(s);
        if (timercachevalue != null && Objects.equals(timercachevalue.getTag(), s1))
        {
            return timercachevalue.getTimer().observe();
        } else
        {
            Timer timer = new Timer(l);
            timerCache.put(s, new TimerCacheValue(s1, timer));
            return timer.observe();
        }
    }

    private long getTimerRemainingTime(String s, String s1, Long long1)
    {
        TimerRecord timerrecord;
        long l;
label0:
        {
            TimerRecord timerrecord1 = lyftPreferences.getTimerRecord(s);
            l = System.currentTimeMillis();
            if (timerrecord1 != null)
            {
                timerrecord = timerrecord1;
                if (Objects.equals(timerrecord1.getTag(), s1))
                {
                    break label0;
                }
            }
            timerrecord = new TimerRecord(s1, Long.valueOf(TimeUnit.SECONDS.toMillis(long1.longValue()) + l));
            lyftPreferences.setTimerRecord(s, timerrecord);
        }
        s1 = Long.valueOf(timerrecord.getTimestamp().longValue() - l);
        s = s1;
        if (s1.longValue() < 0L)
        {
            s = Long.valueOf(0L);
        }
        return TimeUnit.MILLISECONDS.toSeconds(s.longValue());
    }

    public Observable getTimer(String s, String s1, Long long1)
    {
        return createTimerOrLoadFromCached(getTimerRemainingTime(s, s1, long1), s, s1);
    }

    public void resetTimer(String s)
    {
        TimerCacheValue timercachevalue = (TimerCacheValue)timerCache.get(s);
        if (timercachevalue != null)
        {
            timercachevalue.getTimer().stop();
            lyftPreferences.setTimerRecord(s, null);
        }
    }

    private class TimerCacheValue
    {

        String tag;
        Timer timer;

        public String getTag()
        {
            return tag;
        }

        public Timer getTimer()
        {
            return timer;
        }

        public TimerCacheValue(String s, Timer timer1)
        {
            tag = s;
            timer = timer1;
        }
    }


    private class Timer
    {

        private long secondsLeft;
        Observable timer;
        BehaviorSubject timerResult;
        private Subscription timerSubscription;

        private void initialize()
        {
            timerResult = BehaviorSubject.create();
            timer = Observable.timer(0L, 1L, TimeUnit.SECONDS, Schedulers.computation()).takeWhile(new Func1() {

                final Timer this$0;

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
                    this$0 = Timer.this;
                    super();
                }
            }).onBackpressureDrop().map(new Func1() {

                final Timer this$0;

                public Long call(Long long1)
                {
                    return Long.valueOf(secondsLeft - long1.longValue());
                }

                public volatile Object call(Object obj)
                {
                    return call((Long)obj);
                }

                
                {
                    this$0 = Timer.this;
                    super();
                }
            });
            timerSubscription = timer.subscribe(new SimpleSubscriber() {

                final Timer this$0;

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
                    this$0 = Timer.this;
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


        Timer(long l)
        {
            timerSubscription = Subscriptions.empty();
            secondsLeft = l;
            initialize();
        }
    }

}
