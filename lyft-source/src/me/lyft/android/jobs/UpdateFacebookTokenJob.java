// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.concurrent.TimeUnit;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateFacebookTokenJob
    implements Job
{

    ILandingService landingService;

    public UpdateFacebookTokenJob()
    {
    }

    public void execute()
    {
        Observable.timer(5L, TimeUnit.SECONDS).flatMap(new Func1() {

            final UpdateFacebookTokenJob this$0;

            public volatile Object call(Object obj)
            {
                return call((Long)obj);
            }

            public Observable call(Long long1)
            {
                return landingService.refreshFacebookToken();
            }

            
            {
                this$0 = UpdateFacebookTokenJob.this;
                super();
            }
        }).subscribe(new SimpleSubscriber());
    }
}
