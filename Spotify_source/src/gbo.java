// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.MainActivity;
import com.spotify.music.spotlets.widget.SpotifyWidget;

public final class gbo
    implements gbn
{

    private static final int a[] = {
        0x7f02027d, 0x7f02027e
    };
    private static final int b[] = {
        0x7f020280, 0x7f020281
    };
    private static final int c[] = {
        0x7f0801fa, 0x7f0801f9
    };
    private static final int d[] = {
        0x7f0801fc, 0x7f0801fb
    };

    public gbo()
    {
    }

    private static void a(Context context, RemoteViews remoteviews, String s, int i, boolean flag)
    {
        Intent intent = new Intent(context, com/spotify/music/spotlets/widget/SpotifyWidget);
        intent.setAction(s);
        intent.putExtra("is_suggested_track", flag);
        remoteviews.setOnClickPendingIntent(i, PendingIntent.getBroadcast(context, 1, intent, 0x8000000));
    }

    public final void a(Context context)
    {
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.request.update.WIDGET"));
    }

    public final void a(Context context, Intent intent)
    {
        if (!intent.hasExtra("track_uri"))
        {
            a(context);
        } else
        {
            String s1 = intent.getStringExtra("track_uri");
            String s = intent.getStringExtra("track_name");
            Object obj = intent.getStringExtra("artist_name");
            Object obj1 = intent.getStringExtra("album_name");
            AppWidgetManager appwidgetmanager;
            RemoteViews remoteviews;
            Bitmap bitmap;
            int i;
            int j;
            int l;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            boolean flag5;
            if (obj == null)
            {
                obj = "";
            }
            obj = new StringBuilder(((String) (obj)));
            if (obj1 != null && ((String) (obj1)).length() > 0)
            {
                ((StringBuilder) (obj)).append(" \u2014 ").append(((String) (obj1)));
            }
            flag = intent.getBooleanExtra("paused", true);
            bitmap = (Bitmap)intent.getParcelableExtra("cover");
            flag1 = intent.getBooleanExtra("is_prev_enabled", false);
            flag2 = intent.getBooleanExtra("is_next_enabled", false);
            flag3 = intent.getBooleanExtra("is_ad_playing", false);
            flag4 = intent.getBooleanExtra("is_suggested_track", false);
            flag5 = intent.getBooleanExtra("is_video", false);
            obj1 = new ComponentName(context, com/spotify/music/spotlets/widget/SpotifyWidget);
            appwidgetmanager = AppWidgetManager.getInstance(context);
            remoteviews = new RemoteViews(context.getPackageName(), 0x7f03014c);
            remoteviews.setViewVisibility(0x7f1104e8, 8);
            remoteviews.setViewVisibility(0x7f1104e6, 8);
            remoteviews.setViewVisibility(0x7f1104ea, 8);
            remoteviews.setViewVisibility(0x7f1104e7, 0);
            remoteviews.setViewVisibility(0x7f1104e5, 0);
            remoteviews.setViewVisibility(0x7f1104e9, 0);
            i = 0x7f1104e7;
            if (s1 != null && s1.length() > 0 && !flag3 && !flag5)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                int k = 0x7f1104e8;
                remoteviews.setViewVisibility(0x7f1104e7, 8);
                remoteviews.setViewVisibility(0x7f1104e8, 0);
                if (flag1)
                {
                    remoteviews.setViewVisibility(0x7f1104e5, 8);
                    remoteviews.setViewVisibility(0x7f1104e6, 0);
                }
                i = k;
                if (flag2)
                {
                    remoteviews.setViewVisibility(0x7f1104e9, 8);
                    remoteviews.setViewVisibility(0x7f1104ea, 0);
                    i = k;
                }
            }
            if (j != 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (flag)
            {
                l = b[j];
            } else
            {
                l = a[j];
            }
            remoteviews.setImageViewResource(i, l);
            if (flag)
            {
                j = d[j];
            } else
            {
                j = c[j];
            }
            remoteviews.setContentDescription(i, context.getString(j));
            if (s != null)
            {
                intent = s;
            } else
            {
                intent = "";
            }
            remoteviews.setTextViewText(0x7f11026e, intent);
            remoteviews.setTextViewText(0x7f1104e3, ((StringBuilder) (obj)).toString());
            a(context, remoteviews, "com.spotify.mobile.android.ui.widget.PREVIOUS", 0x7f1104e6, flag4);
            a(context, remoteviews, "com.spotify.mobile.android.ui.widget.PLAY", 0x7f1104e8, flag4);
            a(context, remoteviews, "com.spotify.mobile.android.ui.widget.NEXT", 0x7f1104ea, flag4);
            if (bitmap == null)
            {
                remoteviews.setImageViewResource(0x7f110447, 0x7f02027f);
            } else
            {
                remoteviews.setImageViewBitmap(0x7f110447, bitmap);
            }
            intent = new Intent(context, com/spotify/music/MainActivity);
            intent.setFlags(0x30000000);
            if (s1 != null)
            {
                intent.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
            }
            context = SpotifyWidget.a(context, intent);
            remoteviews.setOnClickPendingIntent(0x7f110447, context);
            remoteviews.setOnClickPendingIntent(0x7f11026e, context);
            remoteviews.setOnClickPendingIntent(0x7f1104e3, context);
            if (appwidgetmanager != null)
            {
                try
                {
                    appwidgetmanager.updateAppWidget(((ComponentName) (obj1)), remoteviews);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Logger.b(context, "failing to update widget", new Object[0]);
                }
                return;
            }
        }
    }

}
