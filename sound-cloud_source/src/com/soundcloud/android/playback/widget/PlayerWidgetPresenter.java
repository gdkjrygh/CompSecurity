// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.service.PlayerAppWidgetProvider;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import rx.Y;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            WidgetTrack, PlayerWidgetRemoteViewsBuilder

class PlayerWidgetPresenter
{

    private static final ComponentName PLAYER_WIDGET_PROVIDER = new ComponentName("com.soundcloud.android", com/soundcloud/android/playback/service/PlayerAppWidgetProvider.getCanonicalName());
    private final AppWidgetManager appWidgetManager;
    private Y artworkSubscription;
    private final ImageOperations imageOperations;
    private WidgetTrack widgetTrack;

    PlayerWidgetPresenter(AppWidgetManager appwidgetmanager, ImageOperations imageoperations)
    {
        artworkSubscription = RxUtils.invalidSubscription();
        appWidgetManager = appwidgetmanager;
        imageOperations = imageoperations;
    }

    private RemoteViews buildEmptyRemoteViews(Context context)
    {
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), 0x7f030021);
        remoteviews.setOnClickPendingIntent(0x7f0f00a5, getPendingIntentForMainActivity(context));
        return remoteviews;
    }

    private ApiImageSize getApiImageSize(Resources resources)
    {
        return ApiImageSize.getNotificationLargeIconImageSize(resources);
    }

    private DefaultSubscriber getArtworkSubscriber(final Context context)
    {
        return new _cls1();
    }

    private Bitmap getCachedBitmap(Context context, Urn urn)
    {
        return imageOperations.getCachedBitmap(urn, getApiImageSize(context.getResources()), context.getResources().getDimensionPixelSize(0x7f0b0116), context.getResources().getDimensionPixelSize(0x7f0b0115));
    }

    private PendingIntent getPendingIntentForMainActivity(Context context)
    {
        return PendingIntent.getActivity(context, 0x7f0f001d, (new Intent(context, com/soundcloud/android/main/MainActivity)).addFlags(0x4000000), 0x10000000);
    }

    private void loadArtwork(Context context)
    {
        artworkSubscription = imageOperations.artwork(widgetTrack.getUrn(), getApiImageSize(context.getResources()), context.getResources().getDimensionPixelSize(0x7f0b0116), context.getResources().getDimensionPixelSize(0x7f0b0115)).observeOn(a.a()).subscribe(getArtworkSubscriber(context));
    }

    private void pushUpdate(RemoteViews remoteviews)
    {
        appWidgetManager.updateAppWidget(PLAYER_WIDGET_PROVIDER, remoteviews);
    }

    private void updateRemoveViews(Context context, Bitmap bitmap)
    {
        pushUpdate((new PlayerWidgetRemoteViewsBuilder()).forTrack(widgetTrack).forArtwork(bitmap).build(context));
    }

    void reset(Context context)
    {
        artworkSubscription.unsubscribe();
        widgetTrack = null;
        pushUpdate(buildEmptyRemoteViews(context));
    }

    void updatePlayState(Context context, boolean flag)
    {
        if (widgetTrack != null)
        {
            pushUpdate((new PlayerWidgetRemoteViewsBuilder()).forIsPlaying(widgetTrack, flag).build(context));
        }
    }

    void updateTrackInformation(Context context, PropertySet propertyset)
    {
        artworkSubscription.unsubscribe();
        widgetTrack = new WidgetTrack(propertyset);
        propertyset = getCachedBitmap(context, widgetTrack.getUrn());
        updateRemoveViews(context, propertyset);
        if (propertyset == null)
        {
            loadArtwork(context);
        }
    }



    private class _cls1 extends DefaultSubscriber
    {

        final PlayerWidgetPresenter this$0;
        final Context val$context;

        public void onNext(Bitmap bitmap)
        {
            updateRemoveViews(context, bitmap);
        }

        public volatile void onNext(Object obj)
        {
            onNext((Bitmap)obj);
        }

        _cls1()
        {
            this$0 = PlayerWidgetPresenter.this;
            context = context1;
            super();
        }
    }

}
