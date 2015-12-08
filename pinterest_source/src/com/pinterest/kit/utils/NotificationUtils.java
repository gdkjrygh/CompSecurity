// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.EventType;

public class NotificationUtils
{

    public static final int GCM_NOTIF_ID = 58902;
    public static final int GCM_NOTIF_ID_CONVERSATION = 58904;
    public static final int GCM_NOTIF_ID_SENT_PIN = 58903;
    private static NotificationManager _notifManager;
    private static Paint whitePaint;

    public NotificationUtils()
    {
    }

    private static Bitmap getInspiredImageText()
    {
        initPaint();
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inMutable = true;
        obj = Resources.bitmap(0x7f02021e, ((android.graphics.BitmapFactory.Options) (obj)));
        (new Canvas(((Bitmap) (obj)))).drawText(Resources.string(0x7f0702f6), ((Bitmap) (obj)).getWidth() / 2, ((Bitmap) (obj)).getHeight() / 2, whitePaint);
        return ((Bitmap) (obj));
    }

    public static NotificationManager getManager()
    {
        if (_notifManager == null)
        {
            _notifManager = (NotificationManager)Application.context().getSystemService("notification");
        }
        return _notifManager;
    }

    private static void initPaint()
    {
        if (whitePaint != null)
        {
            return;
        } else
        {
            Paint paint = new Paint();
            whitePaint = paint;
            paint.setColor(-1);
            whitePaint.setAlpha(180);
            whitePaint.setTextSize((int)Resources.dimension(0x7f0a01d7));
            whitePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
            whitePaint.setAntiAlias(true);
            return;
        }
    }

    public static void showSignupNotification()
    {
        if (MyUser.hasAccessTokenAndUser())
        {
            return;
        } else
        {
            Object obj1 = Application.context();
            Object obj = ActivityHelper.getRootIntent();
            ((Intent) (obj)).putExtra("com.pinterest.EXTRA_SOURCE", "CLIENT_NOTIF");
            Object obj2 = PendingIntent.getActivity(((android.content.Context) (obj1)), 0, ((Intent) (obj)), 0x8000000);
            String s = Resources.string(0x7f07053a);
            obj = Resources.string(0x7f070206);
            obj1 = (new android.support.v4.app.NotificationCompat.Builder(((android.content.Context) (obj1)))).setContentTitle(s).setContentText(((CharSequence) (obj))).setSmallIcon(0x7f0201f7).setAutoCancel(true).setOnlyAlertOnce(true).setContentIntent(((PendingIntent) (obj2)));
            obj2 = getInspiredImageText();
            tryNotif(58902, (new android.support.v4.app.NotificationCompat.BigPictureStyle(((android.support.v4.app.NotificationCompat.Builder) (obj1)))).bigPicture(((Bitmap) (obj2))).setSummaryText(((CharSequence) (obj))).build());
            return;
        }
    }

    private static void tryNotif(int i, Notification notification)
    {
        try
        {
            getManager().notify(i, notification);
            Pinalytics.a(EventType.CLIENT_NOTIFICATION_RECEIVED_BY, ApplicationInfo.getInstallId());
            AnalyticsApi.a("client_notif_received");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Notification notification)
        {
            CrashReporting.a(notification);
        }
    }
}
