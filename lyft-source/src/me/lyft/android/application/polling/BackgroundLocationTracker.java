// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import java.util.concurrent.atomic.AtomicBoolean;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.logging.L;
import me.lyft.android.rx.RetryWithDelay;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.application.polling:
//            IBackgroundLocationTracker, ILocationUpdateService

public class BackgroundLocationTracker
    implements IBackgroundLocationTracker
{

    public static final int RETRY_COUNT = 5;
    public static final int RETRY_DELAY_MILLIS = 30000;
    ILocationService locationService;
    ILocationUpdateService locationUpdateService;
    private Subscription locationUpdatesSubscription;
    private AtomicBoolean resumed;

    public BackgroundLocationTracker(ILocationUpdateService ilocationupdateservice, ILocationService ilocationservice)
    {
        resumed = new AtomicBoolean(false);
        locationUpdatesSubscription = Subscriptions.unsubscribed();
        locationUpdateService = ilocationupdateservice;
        locationService = ilocationservice;
    }

    private Observer createLocationUpdatesSubscriber()
    {
        return new SimpleSubscriber() {

            final BackgroundLocationTracker this$0;

            public void onError(Throwable throwable)
            {
                super.onError(throwable);
                L.e(throwable, "location update failed in background location tracker", new Object[0]);
            }

            public volatile void onNext(Object obj)
            {
                onNext((Location)obj);
            }

            public void onNext(Location location)
            {
                locationUpdateService.updateBackgroundLocation(location).retryWhen(new RetryWithDelay(5, 30000)).subscribe(new SimpleSubscriber() {

                    final _cls1 this$1;

                    public void onError(Throwable throwable)
                    {
                        L.e(throwable, "location update failed in background location tracker", new Object[0]);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = BackgroundLocationTracker.this;
                super();
            }
        };
    }

    private void startLocationUpdates()
    {
        if (locationUpdatesSubscription.isUnsubscribed())
        {
            locationUpdatesSubscription = locationService.observeBackgroundLocationUpdates().subscribe(createLocationUpdatesSubscriber());
        }
    }

    private void stopLocationUpdates()
    {
        locationUpdatesSubscription.unsubscribe();
    }

    public void start()
    {
        if (!resumed.getAndSet(true))
        {
            startLocationUpdates();
        }
    }

    public void stop()
    {
        if (resumed.getAndSet(false))
        {
            stopLocationUpdates();
        }
    }
}
