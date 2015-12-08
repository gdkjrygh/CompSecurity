// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import rx.Observable;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

// Referenced classes of package me.lyft.android.application.polling:
//            IPollingAppProcess, IPollingService

public class PollingAppProcess
    implements IPollingAppProcess
{

    private IAppForegroundDetector appForegroundDetector;
    private Action1 onAppForegroundChange;
    private Action1 onUserUpdated;
    private IPollingService pollingService;
    private CompositeSubscription subscriptions;
    private IUserProvider userProvider;

    public PollingAppProcess(IPollingService ipollingservice, IAppForegroundDetector iappforegrounddetector, IUserProvider iuserprovider)
    {
        subscriptions = new CompositeSubscription();
        onUserUpdated = new Action1() {

            final PollingAppProcess this$0;

            public volatile void call(Object obj)
            {
                call((User)obj);
            }

            public void call(User user)
            {
                boolean flag = appForegroundDetector.isForegrounded();
                invalidePolling(user, flag);
            }

            
            {
                this$0 = PollingAppProcess.this;
                super();
            }
        };
        onAppForegroundChange = new Action1() {

            final PollingAppProcess this$0;

            public void call(Boolean boolean1)
            {
                User user = userProvider.getUser();
                invalidePolling(user, boolean1.booleanValue());
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = PollingAppProcess.this;
                super();
            }
        };
        pollingService = ipollingservice;
        appForegroundDetector = iappforegrounddetector;
        userProvider = iuserprovider;
    }

    private void invalidePolling(User user, boolean flag)
    {
        if (user.isInDriverMode())
        {
            pollingService.start();
        } else
        {
            if (user.isInPassengerMode() && flag)
            {
                pollingService.start();
                return;
            }
            if (user.isUnauthorized())
            {
                pollingService.stop();
                return;
            }
            if (user.isInPassengerMode() && !flag)
            {
                pollingService.stop();
                return;
            }
        }
    }

    public void onServiceCreated()
    {
        rx.Subscription subscription = userProvider.observeUserUpdates().subscribe(onUserUpdated);
        subscriptions.add(subscription);
        subscription = appForegroundDetector.observeAppForegrounded().subscribe(onAppForegroundChange);
        subscriptions.add(subscription);
    }

    public void onServiceDestroyed()
    {
        pollingService.stop();
        subscriptions.unsubscribe();
    }

    public void setErrorHandler(Action1 action1)
    {
        pollingService.setErrorHandler(action1);
    }



}
