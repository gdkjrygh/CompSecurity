// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.spotify.mobile.android.spotlets.video.BackgroundableVideoPlayerActivity;
import com.spotify.mobile.android.util.notifications.NotificationButtonHelper;

public final class gif extends gic
{

    private NotificationButtonHelper c;
    private NotificationButtonHelper d;
    private NotificationButtonHelper e;

    protected gif(Context context, ecp ecp1)
    {
        super(context, ecp1);
        c = new NotificationButtonHelper(0x7f110457, 0x7f110458);
        d = new NotificationButtonHelper(0x7f11044a, 0x7f11044b);
        e = new NotificationButtonHelper(0x7f1102d1, 0x7f110456);
    }

    protected final PendingIntent a()
    {
        Intent intent = new Intent(a, com/spotify/mobile/android/spotlets/video/BackgroundableVideoPlayerActivity);
        return PendingIntent.getActivity(a, 0, intent, 0x8000000);
    }

    protected final void a(RemoteViews remoteviews)
    {
        c.a(remoteviews, b.c);
        d.a(remoteviews, b.f);
        e.a(remoteviews, b.g);
    }

    protected final RemoteViews c()
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300e9);
        Object obj = b.a.b();
        remoteviews.setTextViewText(0x7f110452, ((ecs) (obj)).a);
        remoteviews.setTextViewText(0x7f110453, ((ecs) (obj)).b);
        remoteviews.setTextViewText(0x7f110446, ((ecs) (obj)).c);
        obj = PendingIntent.getService(a, 0, flb.a(a, "com.spotify.music.service.video.action.player.TOGGLE_PAUSED"), 0x8000000);
        PendingIntent pendingintent = PendingIntent.getService(a, 0, flb.a(a, "com.spotify.music.service.video.action.player.NEXT"), 0x8000000);
        remoteviews.setOnClickPendingIntent(0x7f11044a, PendingIntent.getService(a, 0, flb.a(a, "com.spotify.music.service.video.action.player.PREVIOUS"), 0x8000000));
        remoteviews.setOnClickPendingIntent(0x7f110457, ((PendingIntent) (obj)));
        remoteviews.setOnClickPendingIntent(0x7f110458, ((PendingIntent) (obj)));
        remoteviews.setOnClickPendingIntent(0x7f1102d1, pendingintent);
        return remoteviews;
    }

    protected final RemoteViews d()
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300f0);
        Object obj = b.a.a();
        remoteviews.setTextViewText(0x7f11026e, ((ecu) (obj)).a);
        remoteviews.setTextViewText(0x7f1102ef, ((ecu) (obj)).b);
        obj = PendingIntent.getService(a, 0, flb.a(a, "com.spotify.music.service.video.action.player.TOGGLE_PAUSED"), 0x8000000);
        PendingIntent pendingintent = PendingIntent.getService(a, 0, flb.a(a, "com.spotify.music.service.video.action.player.NEXT"), 0x8000000);
        if (b.c)
        {
            remoteviews.setOnClickPendingIntent(0x7f110457, ((PendingIntent) (obj)));
        } else
        {
            remoteviews.setOnClickPendingIntent(0x7f110458, ((PendingIntent) (obj)));
        }
        remoteviews.setOnClickPendingIntent(0x7f1102d1, pendingintent);
        return remoteviews;
    }
}
