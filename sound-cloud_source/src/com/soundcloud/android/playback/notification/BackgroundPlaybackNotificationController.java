// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.notification;

import android.app.NotificationManager;
import android.app.Service;
import android.graphics.Bitmap;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackService;
import com.soundcloud.android.playback.PlaybackStateProvider;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.PropertySetFunctions;
import javax.inject.Provider;
import rx.Y;
import rx.a.b.a;
import rx.b.f;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.playback.notification:
//            NotificationBuilder, PlaybackNotificationPresenter

class BackgroundPlaybackNotificationController
    implements PlaybackNotificationController.Strategy
{
    private class NotificationSubscriber extends DefaultSubscriber
    {

        private final Service playbackService;
        final BackgroundPlaybackNotificationController this$0;

        public void onNext(NotificationBuilder notificationbuilder)
        {
            notificationBuilder = notificationbuilder;
            if (playbackStateProvider.isSupposedToBePlaying())
            {
                playbackService.startForeground(1, notificationBuilder.build());
                return;
            } else
            {
                notificationManager.notify(1, notificationBuilder.build());
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((NotificationBuilder)obj);
        }

        private NotificationSubscriber(Service service)
        {
            this$0 = BackgroundPlaybackNotificationController.this;
            super();
            playbackService = service;
        }

        NotificationSubscriber(Service service, _cls1 _pcls1)
        {
            this(service);
        }
    }


    private final Provider builderProvider;
    private final ImageOperations imageOperations;
    private NotificationBuilder notificationBuilder;
    private final NotificationManager notificationManager;
    private final PlaybackStateProvider playbackStateProvider;
    private final PlaybackNotificationPresenter presenter;
    private b subscriptions;
    private final f toNotification = new _cls1();
    private final TrackRepository trackRepository;

    BackgroundPlaybackNotificationController(TrackRepository trackrepository, PlaybackNotificationPresenter playbacknotificationpresenter, NotificationManager notificationmanager, ImageOperations imageoperations, Provider provider, PlaybackStateProvider playbackstateprovider)
    {
        subscriptions = new b();
        trackRepository = trackrepository;
        presenter = playbacknotificationpresenter;
        notificationManager = notificationmanager;
        imageOperations = imageoperations;
        builderProvider = provider;
        playbackStateProvider = playbackstateprovider;
    }

    private void createNotificationBuilder()
    {
        notificationBuilder = (NotificationBuilder)builderProvider.get();
        presenter.init(notificationBuilder, playbackStateProvider.isSupposedToBePlaying());
    }

    private rx.b getBitmap(Urn urn, NotificationBuilder notificationbuilder)
    {
        return imageOperations.artwork(urn, notificationbuilder.getImageSize(), notificationbuilder.getTargetImageSize(), notificationbuilder.getTargetImageSize());
    }

    private Bitmap getCachedBitmap(Urn urn, NotificationBuilder notificationbuilder)
    {
        if (notificationbuilder.getTargetImageSize() == -1)
        {
            return imageOperations.getCachedBitmap(urn, notificationbuilder.getImageSize());
        } else
        {
            return imageOperations.getCachedBitmap(urn, notificationbuilder.getImageSize(), notificationbuilder.getTargetImageSize(), notificationbuilder.getTargetImageSize());
        }
    }

    private void loadAndSetArtwork(Urn urn, final NotificationBuilder notificationBuilder)
    {
        Bitmap bitmap = getCachedBitmap(urn, notificationBuilder);
        if (bitmap != null)
        {
            notificationBuilder.setIcon(bitmap);
            return;
        } else
        {
            subscriptions.a(getBitmap(urn, notificationBuilder).subscribe(new _cls2()));
            return;
        }
    }

    public void clear(PlaybackService playbackservice)
    {
        playbackservice.stopForeground(true);
        notificationManager.cancel(1);
    }

    public void notifyIdleState(PlaybackService playbackservice)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (notificationBuilder != null)
        {
            flag = flag1;
            if (notificationBuilder.hasPlayStateSupport())
            {
                presenter.updateToIdleState(notificationBuilder);
                playbackservice.startForeground(1, notificationBuilder.build());
                flag = false;
            }
        }
        playbackservice.stopForeground(flag);
    }

    public void notifyPlaying(PlaybackService playbackservice)
    {
        if (notificationBuilder != null)
        {
            presenter.updateToPlayingState(notificationBuilder);
            playbackservice.startForeground(1, notificationBuilder.build());
        }
    }

    public void setTrack(PlaybackService playbackservice, PropertySet propertyset)
    {
        createNotificationBuilder();
        subscriptions.unsubscribe();
        subscriptions = new b(new Y[] {
            trackRepository.track((Urn)propertyset.get(EntityProperty.URN)).observeOn(a.a()).map(PropertySetFunctions.mergeInto(propertyset)).flatMap(toNotification).cache().subscribe(new NotificationSubscriber(playbackservice, null))
        });
    }



/*
    static NotificationBuilder access$002(BackgroundPlaybackNotificationController backgroundplaybacknotificationcontroller, NotificationBuilder notificationbuilder)
    {
        backgroundplaybacknotificationcontroller.notificationBuilder = notificationbuilder;
        return notificationbuilder;
    }

*/





    private class _cls1
        implements f
    {

        final BackgroundPlaybackNotificationController this$0;

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        public rx.b call(PropertySet propertyset)
        {
            presenter.updateTrackInfo(notificationBuilder, propertyset);
            if (notificationBuilder.hasArtworkSupport())
            {
                loadAndSetArtwork((Urn)propertyset.get(TrackProperty.URN), notificationBuilder);
            }
            return rx.b.just(notificationBuilder);
        }

        _cls1()
        {
            this$0 = BackgroundPlaybackNotificationController.this;
            super();
        }
    }


    private class _cls2 extends DefaultSubscriber
    {

        final BackgroundPlaybackNotificationController this$0;
        final NotificationBuilder val$notificationBuilder;

        public void onNext(Bitmap bitmap)
        {
            notificationBuilder.setIcon(bitmap);
            notificationManager.notify(1, notificationBuilder.build());
        }

        public volatile void onNext(Object obj)
        {
            onNext((Bitmap)obj);
        }

        _cls2()
        {
            this$0 = BackgroundPlaybackNotificationController.this;
            notificationBuilder = notificationbuilder;
            super();
        }
    }

}
