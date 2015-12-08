// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.widget.RemoteViews;
import java.text.NumberFormat;
import java.util.List;

public class NotificationCompatImplBase
{

    static final int MAX_MEDIA_BUTTONS = 5;
    static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;

    public NotificationCompatImplBase()
    {
    }

    private static RemoteViews applyStandardTemplate(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, boolean flag, 
            long l, int j, boolean flag1)
    {
        RemoteViews remoteviews = new RemoteViews(context.getPackageName(), j);
        j = 0;
        boolean flag2 = false;
        if (bitmap != null && android.os.Build.VERSION.SDK_INT >= 16)
        {
            remoteviews.setImageViewBitmap(android.support.v7.appcompat.R.id.icon, bitmap);
        } else
        {
            remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.icon, 8);
        }
        if (charsequence != null)
        {
            remoteviews.setTextViewText(android.support.v7.appcompat.R.id.title, charsequence);
        }
        if (charsequence1 != null)
        {
            remoteviews.setTextViewText(android.support.v7.appcompat.R.id.text, charsequence1);
            j = 1;
        }
        if (charsequence2 != null)
        {
            remoteviews.setTextViewText(android.support.v7.appcompat.R.id.info, charsequence2);
            remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.info, 0);
            i = 1;
        } else
        if (i > 0)
        {
            if (i > context.getResources().getInteger(android.support.v7.appcompat.R.integer.status_bar_notification_info_maxnum))
            {
                remoteviews.setTextViewText(android.support.v7.appcompat.R.id.info, context.getResources().getString(android.support.v7.appcompat.R.string.status_bar_notification_info_overflow));
            } else
            {
                charsequence = NumberFormat.getIntegerInstance();
                remoteviews.setTextViewText(android.support.v7.appcompat.R.id.info, charsequence.format(i));
            }
            remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.info, 0);
            i = 1;
        } else
        {
            remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.info, 8);
            i = j;
        }
        j = ((flag2) ? 1 : 0);
        if (charsequence3 != null)
        {
            j = ((flag2) ? 1 : 0);
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                remoteviews.setTextViewText(android.support.v7.appcompat.R.id.text, charsequence3);
                float f;
                if (charsequence1 != null)
                {
                    remoteviews.setTextViewText(android.support.v7.appcompat.R.id.text2, charsequence1);
                    remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.text2, 0);
                    j = 1;
                } else
                {
                    remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.text2, 8);
                    j = ((flag2) ? 1 : 0);
                }
            }
        }
        if (j != 0 && android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (flag1)
            {
                f = context.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.notification_subtext_size);
                remoteviews.setTextViewTextSize(android.support.v7.appcompat.R.id.text, 0, f);
            }
            remoteviews.setViewPadding(android.support.v7.appcompat.R.id.line1, 0, 0, 0, 0);
        }
        if (l != 0L)
        {
            if (flag)
            {
                remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.chronometer, 0);
                remoteviews.setLong(android.support.v7.appcompat.R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + l);
                remoteviews.setBoolean(android.support.v7.appcompat.R.id.chronometer, "setStarted", true);
            } else
            {
                remoteviews.setViewVisibility(android.support.v7.appcompat.R.id.time, 0);
                remoteviews.setLong(android.support.v7.appcompat.R.id.time, "setTime", l);
            }
        }
        j = android.support.v7.appcompat.R.id.line3;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        remoteviews.setViewVisibility(j, i);
        return remoteviews;
    }

    private static RemoteViews generateBigContentView(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, boolean flag, 
            long l, List list, boolean flag1, PendingIntent pendingintent)
    {
        int j = Math.min(list.size(), 5);
        charsequence = applyStandardTemplate(context, charsequence, charsequence1, charsequence2, i, bitmap, charsequence3, flag, l, getBigLayoutResource(j), false);
        charsequence.removeAllViews(android.support.v7.appcompat.R.id.media_actions);
        if (j > 0)
        {
            for (i = 0; i < j; i++)
            {
                charsequence1 = generateMediaActionButton(context, (android.support.v4.app.NotificationCompatBase.Action)list.get(i));
                charsequence.addView(android.support.v7.appcompat.R.id.media_actions, charsequence1);
            }

        }
        if (flag1)
        {
            charsequence.setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 0);
            charsequence.setInt(android.support.v7.appcompat.R.id.cancel_action, "setAlpha", context.getResources().getInteger(android.support.v7.appcompat.R.integer.cancel_button_image_alpha));
            charsequence.setOnClickPendingIntent(android.support.v7.appcompat.R.id.cancel_action, pendingintent);
            return charsequence;
        } else
        {
            charsequence.setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 8);
            return charsequence;
        }
    }

    private static RemoteViews generateContentView(Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, boolean flag, 
            long l, List list, int ai[], boolean flag1, PendingIntent pendingintent)
    {
        charsequence = applyStandardTemplate(context, charsequence, charsequence1, charsequence2, i, bitmap, charsequence3, flag, l, android.support.v7.appcompat.R.layout.notification_template_media, true);
        int k = list.size();
        if (ai == null)
        {
            i = 0;
        } else
        {
            i = Math.min(ai.length, 3);
        }
        charsequence.removeAllViews(android.support.v7.appcompat.R.id.media_actions);
        if (i > 0)
        {
            for (int j = 0; j < i; j++)
            {
                if (j >= k)
                {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[] {
                        Integer.valueOf(j), Integer.valueOf(k - 1)
                    }));
                }
                charsequence1 = generateMediaActionButton(context, (android.support.v4.app.NotificationCompatBase.Action)list.get(ai[j]));
                charsequence.addView(android.support.v7.appcompat.R.id.media_actions, charsequence1);
            }

        }
        if (flag1)
        {
            charsequence.setViewVisibility(android.support.v7.appcompat.R.id.end_padder, 8);
            charsequence.setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 0);
            charsequence.setOnClickPendingIntent(android.support.v7.appcompat.R.id.cancel_action, pendingintent);
            charsequence.setInt(android.support.v7.appcompat.R.id.cancel_action, "setAlpha", context.getResources().getInteger(android.support.v7.appcompat.R.integer.cancel_button_image_alpha));
            return charsequence;
        } else
        {
            charsequence.setViewVisibility(android.support.v7.appcompat.R.id.end_padder, 0);
            charsequence.setViewVisibility(android.support.v7.appcompat.R.id.cancel_action, 8);
            return charsequence;
        }
    }

    private static RemoteViews generateMediaActionButton(Context context, android.support.v4.app.NotificationCompatBase.Action action)
    {
        boolean flag;
        if (action.getActionIntent() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = new RemoteViews(context.getPackageName(), android.support.v7.appcompat.R.layout.notification_media_action);
        context.setImageViewResource(android.support.v7.appcompat.R.id.action0, action.getIcon());
        if (!flag)
        {
            context.setOnClickPendingIntent(android.support.v7.appcompat.R.id.action0, action.getActionIntent());
        }
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            context.setContentDescription(android.support.v7.appcompat.R.id.action0, action.getTitle());
        }
        return context;
    }

    private static int getBigLayoutResource(int i)
    {
        if (i <= 3)
        {
            return android.support.v7.appcompat.R.layout.notification_template_big_media_narrow;
        } else
        {
            return android.support.v7.appcompat.R.layout.notification_template_big_media;
        }
    }

    public static void overrideBigContentView(Notification notification, Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, 
            boolean flag, long l, List list, boolean flag1, PendingIntent pendingintent)
    {
        notification.bigContentView = generateBigContentView(context, charsequence, charsequence1, charsequence2, i, bitmap, charsequence3, flag, l, list, flag1, pendingintent);
        if (flag1)
        {
            notification.flags = notification.flags | 2;
        }
    }

    public static void overrideContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Context context, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, int i, Bitmap bitmap, CharSequence charsequence3, 
            boolean flag, long l, List list, int ai[], boolean flag1, PendingIntent pendingintent)
    {
        context = generateContentView(context, charsequence, charsequence1, charsequence2, i, bitmap, charsequence3, flag, l, list, ai, flag1, pendingintent);
        notificationbuilderwithbuilderaccessor.getBuilder().setContent(context);
        if (flag1)
        {
            notificationbuilderwithbuilderaccessor.getBuilder().setOngoing(true);
        }
    }
}
