// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.appboy.push:
//            AppboyNotificationUtils

public class AppboyNotificationRemoteViewsUtils
{

    public static final String APPBOY_NOTIFICATION_CONTENT_ID = "com_appboy_notification_content";
    public static final String APPBOY_NOTIFICATION_ICON_ID = "com_appboy_notification_icon";
    public static final String APPBOY_NOTIFICATION_ID = "com_appboy_notification";
    public static final String APPBOY_NOTIFICATION_TIME_ID = "com_appboy_notification_time";
    public static final String APPBOY_NOTIFICATION_TITLE_ID = "com_appboy_notification_title";
    public static final String APPBOY_NOTIFICATION_TWELVE_HOUR_FORTMAT_ID = "com_appboy_notification_time_twelve_hour_format";
    public static final String APPBOY_NOTIFICATION_TWENTY_FOUR_HOUR_FORMAT_ID = "com_appboy_notification_time_twenty_four_hour_format";
    private static final String TAG;

    public AppboyNotificationRemoteViewsUtils()
    {
    }

    public static RemoteViews createMultiLineContentNotificationView(Context context, Bundle bundle, int i)
    {
        String s;
        String s1;
        String s2;
        String s3;
        int j;
        int k;
        int l;
        int i1;
        int j1;
label0:
        {
            if (bundle != null)
            {
                s2 = bundle.getString("t");
                s3 = bundle.getString("a");
                bundle = context.getResources();
                s = PackageUtils.getResourcePackageName(context);
                j = bundle.getIdentifier("com_appboy_notification", "layout", s);
                k = bundle.getIdentifier("com_appboy_notification_title", "id", s);
                l = bundle.getIdentifier("com_appboy_notification_content", "id", s);
                i1 = bundle.getIdentifier("com_appboy_notification_icon", "id", s);
                j1 = bundle.getIdentifier("com_appboy_notification_time", "id", s);
                int k1 = bundle.getIdentifier("com_appboy_notification_time_twenty_four_hour_format", "string", s);
                int l1 = bundle.getIdentifier("com_appboy_notification_time_twelve_hour_format", "string", s);
                s = AppboyNotificationUtils.getOptionalStringResource(bundle, k1, "HH:mm");
                s1 = AppboyNotificationUtils.getOptionalStringResource(bundle, l1, "h:mm a");
                if (j != 0 && k != 0 && l != 0 && i1 != 0 && j1 != 0)
                {
                    break label0;
                }
                AppboyLogger.w(TAG, String.format("Couldn't find all resource IDs for custom notification view, extended view will not be used for push notifications. Received %d for layout, %d for title, %d for content, %d for icon, and %d for time.", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j1)
                }));
            }
            return null;
        }
        AppboyLogger.d(TAG, "Using RemoteViews for rendering of push notification.");
        try
        {
            bundle = new RemoteViews(PackageUtils.getResourcePackageName(context), j);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            AppboyLogger.e(TAG, String.format("Failed to initialized remote views with package %s", new Object[] {
                PackageUtils.getResourcePackageName(context)
            }), bundle);
            try
            {
                bundle = new RemoteViews(context.getPackageName(), j);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                AppboyLogger.e(TAG, String.format("Failed to initialized remote views with package %s", new Object[] {
                    context.getPackageName()
                }), bundle);
                return null;
            }
        }
        bundle.setTextViewText(k, s2);
        bundle.setTextViewText(l, s3);
        bundle.setImageViewResource(i1, i);
        if (DateFormat.is24HourFormat(context))
        {
            context = s;
        } else
        {
            context = s1;
        }
        bundle.setTextViewText(j1, (new SimpleDateFormat(context)).format(new Date()));
        return bundle;
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/push/AppboyNotificationRemoteViewsUtils.getName()
        });
    }
}
