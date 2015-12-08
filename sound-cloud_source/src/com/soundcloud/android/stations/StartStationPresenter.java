// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.Context;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.ExpandPlayerSubscriber;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.tracks.DelayedLoadingDialogPresenter;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsOperations

public class StartStationPresenter
{
    private static class ExpandAndDismissDialogSubscriber extends ExpandPlayerSubscriber
    {

        private final Context context;
        private final DelayedLoadingDialogPresenter delayedLoadingDialogPresenter;

        public void onError(Throwable throwable)
        {
            delayedLoadingDialogPresenter.onError(context);
            super.onError(throwable);
        }

        public void onNext(PlaybackResult playbackresult)
        {
            if (playbackresult.isSuccess())
            {
                expandPlayer();
                delayedLoadingDialogPresenter.onSuccess();
                return;
            } else
            {
                delayedLoadingDialogPresenter.onError(context);
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlaybackResult)obj);
        }

        public ExpandAndDismissDialogSubscriber(Context context1, EventBus eventbus, PlaybackToastHelper playbacktoasthelper, DelayedLoadingDialogPresenter delayedloadingdialogpresenter)
        {
            super(eventbus, playbacktoasthelper);
            context = context1;
            delayedLoadingDialogPresenter = delayedloadingdialogpresenter;
        }
    }


    private final com.soundcloud.android.tracks.DelayedLoadingDialogPresenter.Builder dialogBuilder;
    private final EventBus eventBus;
    private final PlaybackInitiator playbackInitiator;
    private final PlaybackToastHelper playbackToastHelper;
    private final ScreenProvider screenProvider;
    private final StationsOperations stationsOperations;
    private Y subscription;
    private final f toPlaybackResult = new _cls1();

    public StartStationPresenter(com.soundcloud.android.tracks.DelayedLoadingDialogPresenter.Builder builder, StationsOperations stationsoperations, PlaybackInitiator playbackinitiator, EventBus eventbus, PlaybackToastHelper playbacktoasthelper, ScreenProvider screenprovider)
    {
        subscription = RxUtils.invalidSubscription();
        dialogBuilder = builder;
        stationsOperations = stationsoperations;
        playbackInitiator = playbackinitiator;
        eventBus = eventbus;
        playbackToastHelper = playbacktoasthelper;
        screenProvider = screenprovider;
    }

    private void startStation(Context context, b b1)
    {
        DelayedLoadingDialogPresenter delayedloadingdialogpresenter = dialogBuilder.setLoadingMessage(context.getString(0x7f0701ee)).setOnErrorToastText(context.getString(0x7f0701f2)).setOnCancelListener(new _cls2()).create().show(context);
        subscription = b1.flatMap(toPlaybackResult).subscribe(new ExpandAndDismissDialogSubscriber(context, eventBus, playbackToastHelper, delayedloadingdialogpresenter));
    }

    public void startStation(Context context, Urn urn)
    {
        startStation(context, stationsOperations.station(urn));
    }

    public void startStationForTrack(Context context, Urn urn)
    {
        Urn urn1 = Urn.forTrackStation(urn.getNumericId());
        startStation(context, stationsOperations.stationWithSeed(urn1, urn));
    }




    private class _cls1
        implements f
    {

        final StartStationPresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((StationRecord)obj);
        }

        public b call(StationRecord stationrecord)
        {
            PlaySessionSource playsessionsource;
            boolean flag;
            if (!stationrecord.getTracks().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "The stationWithSeed does not have any tracks.");
            playsessionsource = PlaySessionSource.forStation(screenProvider.getLastScreenTag(), stationrecord.getUrn());
            return playbackInitiator.playStation(stationrecord.getUrn(), stationrecord.getTracks(), playsessionsource, stationrecord.getPreviousPosition());
        }

        _cls1()
        {
            this$0 = StartStationPresenter.this;
            super();
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnCancelListener
    {

        final StartStationPresenter this$0;

        public void onCancel(DialogInterface dialoginterface)
        {
            subscription.unsubscribe();
        }

        _cls2()
        {
            this$0 = StartStationPresenter.this;
            super();
        }
    }

}
