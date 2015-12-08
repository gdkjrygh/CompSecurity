// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pushnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.kit.utils.NotificationUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.EventType;
import com.pinterest.service.NotifData;
import com.pinterest.ui.badge.AppBadgeUtils;
import org.apache.commons.lang3.StringUtils;

public class PushNotification
{

    public static final int a = (int)Resources.dimension(0x7f0a01b1);
    private static android.support.v4.app.NotificationCompat.BigPictureStyle b;
    private static boolean c = false;
    private static int d = 0;
    private static com.pinterest.api.remote.PinApi.PinApiResponse e = new _cls1();

    public static Rect a(Pin pin)
    {
        int i;
        int j;
        if (pin.getImageLargeHeight() == null)
        {
            i = 0;
        } else
        {
            i = pin.getImageLargeHeight().intValue();
        }
        if (pin.getImageLargeWidth() == null)
        {
            j = 0;
        } else
        {
            j = pin.getImageLargeWidth().intValue();
        }
        if (i == 0 || j == 0 || i <= Constants.PUSH_NOTIF_MAX_HEIGHT)
        {
            return null;
        } else
        {
            i = (i - Constants.PUSH_NOTIF_MAX_HEIGHT) / 2;
            return new Rect(0, i, Math.min(j, 1024), Constants.PUSH_NOTIF_MAX_HEIGHT + i);
        }
    }

    private static void a(int i, Notification notification)
    {
        try
        {
            NotificationUtils.getManager().notify(i, notification);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Notification notification)
        {
            CrashReporting.a(notification);
        }
    }

    public static void a(Context context, Bundle bundle)
    {
        Pinalytics.a(EventType.PUSH_NOTIFICATION_RECEIVED_BY, ApplicationInfo.getInstallId());
        AnalyticsApi.a("received", bundle);
        a(context, new NotifData(bundle), bundle);
    }

    public static void a(Context context, NotifData notifdata, Bundle bundle)
    {
        Object obj;
        Object obj2;
        Object obj3;
        int j;
        if (!TextUtils.isEmpty(notifdata.imageUrl))
        {
            Object obj1;
            int i;
            try
            {
                obj1 = ImageCache.getBitmapBlocking(notifdata.imageUrl, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                CrashReporting.a(((Throwable) (obj)));
                obj1 = null;
            }
            obj = obj1;
            if (obj1 != null)
            {
                obj = Bitmap.createScaledBitmap(((Bitmap) (obj1)), a, a, true);
            }
        } else
        {
            obj = null;
        }
        PLog.info("Push notif received. msg: %s, link: %s, imageUrl: %s", new Object[] {
            notifdata.msg, notifdata.link, notifdata.imageUrl
        });
        obj3 = ActivityHelper.getWebhook(context);
        if (bundle != null)
        {
            ((Intent) (obj3)).putExtras(bundle);
            obj1 = bundle.getString("badge");
            PLog.info("Badge data received. badgeCount: %s", new Object[] {
                obj1
            });
            if (obj1 != null)
            {
                i = Integer.parseInt(((String) (obj1)));
                Pinalytics.a(EventType.MOBILE_BADGE_RECEIEVED, ((String) (obj1)));
                if (AppBadgeUtils.isBadgingSupported(context))
                {
                    AppBadgeUtils.updateBadge(context, i);
                }
            }
        }
        if (TextUtils.isEmpty(notifdata.msg) || "None".equalsIgnoreCase(notifdata.msg))
        {
            return;
        }
        obj2 = Uri.parse("pinterest://");
        if (!TextUtils.isEmpty(notifdata.link))
        {
            if (notifdata.link.startsWith("http"))
            {
                obj2 = notifdata.link;
            } else
            {
                obj2 = (new StringBuilder("pinterest://")).append(notifdata.link).toString();
            }
            obj2 = Uri.parse(((String) (obj2)));
        }
        ((Intent) (obj3)).setData(((Uri) (obj2)));
        if (notifdata.isPull)
        {
            obj2 = "PULL_NOTIF";
        } else
        {
            obj2 = "PUSH_NOTIF";
        }
        ((Intent) (obj3)).putExtra("com.pinterest.EXTRA_SOURCE", ((String) (obj2)));
        obj2 = PendingIntent.getActivity(context, 0, ((Intent) (obj3)), 0x8000000);
        obj3 = context.getString(0x7f07005d);
        obj2 = (new android.support.v4.app.NotificationCompat.Builder(context)).setContentTitle(((CharSequence) (obj3))).setContentText(notifdata.msg).setSmallIcon(0x7f0201f7).setOnlyAlertOnce(true).setContentIntent(((PendingIntent) (obj2))).setAutoCancel(true);
        if (obj != null)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setLargeIcon(((Bitmap) (obj)));
        }
        if (notifdata.isLargeText)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(notifdata.msg));
        }
        if (notifdata.largeImageUrl != null)
        {
            b = (new android.support.v4.app.NotificationCompat.BigPictureStyle(((android.support.v4.app.NotificationCompat.Builder) (obj2)))).setSummaryText(notifdata.msg);
            context = new Rect(0, 0, 1024, Constants.PUSH_NOTIF_MAX_HEIGHT);
            context = ImageCache.getBitmapBlocking(notifdata.largeImageUrl, true, context);
            if (context == null)
            {
                context = b.build();
            } else
            {
                context = b.bigPicture(context).build();
            }
            a(58902, ((Notification) (context)));
            return;
        }
        context = notifdata.link;
        if (StringUtils.isBlank(context))
        {
            context = null;
        } else
        {
            context = context.split("/");
            if (context.length < 3)
            {
                context = null;
            } else
            if (!context[1].equals("pin"))
            {
                context = null;
            } else
            {
                context = context[2];
            }
        }
        if (StringUtils.isNotBlank(notifdata.msg))
        {
            c = notifdata.msg.contains("sent you a pin");
        }
        if (context != null)
        {
            PLog.info("Get pin in push notif: %s", new Object[] {
                context
            });
            b = (new android.support.v4.app.NotificationCompat.BigPictureStyle(((android.support.v4.app.NotificationCompat.Builder) (obj2)))).setSummaryText(notifdata.msg);
            PinApi.a(context, e, null);
            return;
        }
        context = ((android.support.v4.app.NotificationCompat.Builder) (obj2)).build();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        notifdata = bundle.getString("link");
        if (notifdata == null || !notifdata.contains("conversation")) goto _L2; else goto _L3
_L3:
        j = 58904;
_L5:
        a(j, ((Notification) (context)));
        return;
_L2:
        j = 58902;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static void b(Pin pin)
    {
        if (pin == null || b == null)
        {
            return;
        }
        Rect rect = a(pin);
        int i;
        try
        {
            pin = ImageCache.getBitmapBlocking(pin.getImageLargeUrl(), true, rect);
        }
        // Misplaced declaration of an exception variable
        catch (Pin pin)
        {
            CrashReporting.a(pin);
            pin = null;
        }
        if (pin == null)
        {
            pin = b.build();
        } else
        {
            pin = b.bigPicture(pin).build();
        }
        if (c)
        {
            i = 58903;
        } else
        {
            i = 58902;
        }
        a(i, pin);
    }


    private class _cls1 extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        public final void onSuccess(Pin pin)
        {
            super.onSuccess(pin);
            (new PushNotifTask((byte)0)).execute(new Pin[] {
                pin
            });
        }

        _cls1()
        {
        }

        private class PushNotifTask extends AsyncTask
        {

            protected Object doInBackground(Object aobj[])
            {
                PushNotification.b(((Pin[])aobj)[0]);
                return null;
            }

            private PushNotifTask()
            {
            }

            PushNotifTask(byte byte0)
            {
                this();
            }
        }

    }

}
