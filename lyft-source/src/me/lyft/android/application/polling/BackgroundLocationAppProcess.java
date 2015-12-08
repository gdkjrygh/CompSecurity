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
//            IBackgroundLocationAppProcess, IBackgroundLocationTracker

public class BackgroundLocationAppProcess
    implements IBackgroundLocationAppProcess
{

    private IAppForegroundDetector appForegroundDetector;
    private IBackgroundLocationTracker backgroundLocationTracker;
    private Action1 onAppForegroundChange;
    private Action1 onUserUpdated;
    private CompositeSubscription subscriptions;
    private IUserProvider userProvider;

    public BackgroundLocationAppProcess(IBackgroundLocationTracker ibackgroundlocationtracker, IAppForegroundDetector iappforegrounddetector, IUserProvider iuserprovider)
    {
        subscriptions = new CompositeSubscription();
        onUserUpdated = new Action1() {

            final BackgroundLocationAppProcess this$0;

            public volatile void call(Object obj)
            {
                call((User)obj);
            }

            public void call(User user)
            {
                boolean flag = appForegroundDetector.isForegrounded();
                invalidateLocationTracker(user, flag);
            }

            
            {
                this$0 = BackgroundLocationAppProcess.this;
                super();
            }
        };
        onAppForegroundChange = new Action1() {

            final BackgroundLocationAppProcess this$0;

            public void call(Boolean boolean1)
            {
                User user = userProvider.getUser();
                invalidateLocationTracker(user, boolean1.booleanValue());
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = BackgroundLocationAppProcess.this;
                super();
            }
        };
        backgroundLocationTracker = ibackgroundlocationtracker;
        appForegroundDetector = iappforegrounddetector;
        userProvider = iuserprovider;
    }

    private void invalidateLocationTracker(User user, boolean flag)
    {
        if (flag || user.isInDriverMode() || !user.isApprovedChauffeurDriver())
        {
            backgroundLocationTracker.stop();
            return;
        } else
        {
            backgroundLocationTracker.start();
            return;
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
        backgroundLocationTracker.stop();
        subscriptions.unsubscribe();
    }

    public void setErrorHandler(Action1 action1)
    {
    }



}
