// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.preference.PreferenceManager;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.views.PlaybackRemoteViews;
import com.soundcloud.android.properties.FeatureFlags;

public class PlayerWidgetRemoteViews extends PlaybackRemoteViews
{

    private static final int PENDING_INTENT_REQUEST_CODE = com/soundcloud/android/playback/widget/PlayerWidgetRemoteViews.hashCode();

    public PlayerWidgetRemoteViews(Context context)
    {
        super(context.getPackageName(), 0x7f030022, 0x7f020175, 0x7f020167);
    }

    public PlayerWidgetRemoteViews(Parcel parcel)
    {
        super(parcel);
    }

    private Intent createIntent(String s)
    {
        return (new Intent(s)).putExtra("play_event_source", "widget").addFlags(32);
    }

    private Intent createLaunchIntent(Context context, Urn urn)
    {
        context = (new Intent(context, com/soundcloud/android/main/MainActivity)).addFlags(0x4000000);
        boolean flag;
        if (!urn.equals(Urn.NOT_SET))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.putExtra("expand_player", flag);
        Screen.WIDGET.addToIntent(context);
        Referrer.PLAYBACK_WIDGET.addToIntent(context);
        return context;
    }

    private PendingIntent createPendingIntent(Context context, String s)
    {
        return PendingIntent.getBroadcast(context, PENDING_INTENT_REQUEST_CODE, createIntent(s), 0);
    }

    private void linkPlayerControls(Context context)
    {
        setOnClickPendingIntent(0x7f0f00ad, createPendingIntent(context, "com.soundcloud.android.playback.external.toggleplayback"));
        setOnClickPendingIntent(0x7f0f00ac, createPendingIntent(context, "com.soundcloud.android.playback.external.previous"));
        setOnClickPendingIntent(0x7f0f00ae, createPendingIntent(context, "com.soundcloud.android.playback.external.next"));
    }

    void linkButtonsWidget(Context context, Urn urn, Urn urn1, boolean flag)
    {
        linkPlayerControls(context);
        setOnClickPendingIntent(0x7f0f00aa, PendingIntent.getActivity(context, PENDING_INTENT_REQUEST_CODE, createLaunchIntent(context, urn), 0x10000000));
        if (!urn.equals(Urn.NOT_SET))
        {
            setOnClickPendingIntent(0x7f0f00a8, (new Navigator(new FeatureFlags(PreferenceManager.getDefaultSharedPreferences(context)))).openProfileFromWidget(context, urn1, PENDING_INTENT_REQUEST_CODE));
            urn = new Intent("com.soundcloud.android.widgetLike");
            urn.putExtra("isLike", flag);
            setOnClickPendingIntent(0x7f0f00af, PendingIntent.getBroadcast(context, PENDING_INTENT_REQUEST_CODE, urn, 0x10000000));
        }
    }

    void setEmptyState(Context context)
    {
        setPlaybackStatus(false);
        setCurrentTrackTitle(context.getString(0x7f070223));
        setCurrentCreator("");
        linkButtonsWidget(context, Urn.NOT_SET, Urn.NOT_SET, false);
    }

}
