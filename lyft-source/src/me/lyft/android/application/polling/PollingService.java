// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.driverdocuments.IDriverDocumentsService;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.Observer;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.application.polling:
//            IPollingService, ILocationUpdateService

public class PollingService
    implements IPollingService
{

    IDriverDocumentsService driverDocumentsService;
    private Action1 errorHandler;
    ILocationService locationService;
    ILocationUpdateService locationUpdateService;
    private Subscription locationUpdatesSubscription;
    ILyftPreferences lyftPreferences;
    private Subscription pollingSubscription;
    private AtomicBoolean resumed;

    public PollingService(ILocationUpdateService ilocationupdateservice, ILocationService ilocationservice, ILyftPreferences ilyftpreferences, IDriverDocumentsService idriverdocumentsservice, IAppForegroundDetector iappforegrounddetector)
    {
        pollingSubscription = Subscriptions.empty();
        locationUpdatesSubscription = Subscriptions.unsubscribed();
        resumed = new AtomicBoolean(false);
        locationUpdateService = ilocationupdateservice;
        locationService = ilocationservice;
        lyftPreferences = ilyftpreferences;
        driverDocumentsService = idriverdocumentsservice;
    }

    private Observer createLocationUpdatesSubscriber()
    {
        return new SimpleSubscriber() {

            final PollingService this$0;

            public void onError(Throwable throwable)
            {
                super.onError(throwable);
                L.e(throwable, "location update failed in api poller", new Object[0]);
                locationUpdatesSubscription.unsubscribe();
            }

            public volatile void onNext(Object obj)
            {
                onNext((Location)obj);
            }

            public void onNext(Location location)
            {
                locationUpdateService.addLocationToHistory(location);
            }

            
            {
                this$0 = PollingService.this;
                super();
            }
        };
    }

    private boolean isResumed()
    {
        return resumed.get();
    }

    private void refreshDriverDocuments()
    {
        try
        {
            driverDocumentsService.refresh();
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "driver documents refresh failed", new Object[0]);
        }
    }

    private void schedulePolling()
    {
        pollingSubscription.unsubscribe();
        final rx.Scheduler.Worker worker = Schedulers.io().createWorker();
        pollingSubscription = worker;
        worker.schedule(new Action0() {

            final PollingService this$0;
            final rx.Scheduler.Worker val$worker;

            public void call()
            {
                if (!worker.isUnsubscribed())
                {
                    startLocationUpdatesIfNeeded();
                    locationUpdateService.updateLocationSync();
                    refreshDriverDocuments();
                }
                if (!worker.isUnsubscribed()) goto _L2; else goto _L1
_L1:
                return;
_L2:
                worker.schedule(this, lyftPreferences.getPollingRate(), TimeUnit.MILLISECONDS);
                return;
                Object obj;
                obj;
                errorHandler.call(obj);
                if (!worker.isUnsubscribed())
                {
                    worker.schedule(this, lyftPreferences.getPollingRate(), TimeUnit.MILLISECONDS);
                    return;
                }
                continue; /* Loop/switch isn't completed */
                obj;
                if (!worker.isUnsubscribed())
                {
                    worker.schedule(this, lyftPreferences.getPollingRate(), TimeUnit.MILLISECONDS);
                    throw obj;
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                this$0 = PollingService.this;
                worker = worker1;
                super();
            }
        });
    }

    private void startLocationUpdatesIfNeeded()
    {
        if (locationUpdatesSubscription.isUnsubscribed())
        {
            locationUpdatesSubscription = locationService.observeLocationUpdates().subscribe(createLocationUpdatesSubscriber());
        }
    }

    private void startPolling()
    {
        if (isResumed())
        {
            schedulePolling();
        }
    }

    private void stopLocationUpdates()
    {
        locationUpdatesSubscription.unsubscribe();
    }

    public void setErrorHandler(Action1 action1)
    {
        errorHandler = action1;
    }

    public void start()
    {
        if (!resumed.getAndSet(true))
        {
            startPolling();
        }
    }

    public void stop()
    {
        if (resumed.getAndSet(false))
        {
            pollingSubscription.unsubscribe();
            stopLocationUpdates();
        }
    }




}
