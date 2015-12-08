// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import java.util.concurrent.TimeUnit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.ride.HeatmapMetaDTO;
import rx.Observable;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import rx.subscriptions.Subscriptions;

public class HeatMapService
{

    private static final long POLLING_FREQUENCY = 1L;
    private BehaviorSubject behaviorSubject;
    private IDefaultErrorHandler defaultErrorHandler;
    private final ILocationService locationService;
    private final ILyftApi lyftApi;
    private Subscription pollingSubscription;

    public HeatMapService(ILyftApi ilyftapi, ILocationService ilocationservice, IDefaultErrorHandler idefaulterrorhandler)
    {
        behaviorSubject = BehaviorSubject.create();
        pollingSubscription = Subscriptions.empty();
        lyftApi = ilyftapi;
        locationService = ilocationservice;
        defaultErrorHandler = idefaulterrorhandler;
    }

    public HeatmapMetaDTO getHeatMapMetaData()
    {
        return (HeatmapMetaDTO)behaviorSubject.getValue();
    }

    public Observable observeHeatMapMetaData()
    {
        return behaviorSubject.asObservable();
    }

    public void start()
    {
        pollingSubscription.unsubscribe();
        final rx.Scheduler.Worker worker = Schedulers.io().createWorker();
        pollingSubscription = worker;
        worker.schedule(new Action0() {

            final HeatMapService this$0;
            final rx.Scheduler.Worker val$worker;

            public void call()
            {
                Object obj = locationService.getLastCachedLocation();
                obj = lyftApi.getHeatmapPricingSync(((Location) (obj)).getLat().doubleValue(), ((Location) (obj)).getLng().doubleValue());
                behaviorSubject.onNext(obj);
                worker.schedule(this, 1L, TimeUnit.MINUTES);
                return;
                Object obj1;
                obj1;
                defaultErrorHandler.handle(((Throwable) (obj1)));
                worker.schedule(this, 1L, TimeUnit.MINUTES);
                return;
                obj1;
                worker.schedule(this, 1L, TimeUnit.MINUTES);
                throw obj1;
            }

            
            {
                this$0 = HeatMapService.this;
                worker = worker1;
                super();
            }
        });
    }

    public void stop()
    {
        pollingSubscription.unsubscribe();
    }




}
