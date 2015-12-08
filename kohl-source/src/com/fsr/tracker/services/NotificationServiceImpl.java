// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.services;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.RemoteViews;
import com.fsr.tracker.NotificationService;
import com.fsr.tracker.app.SurveyActivity;
import com.fsr.tracker.app.TrackingContext;
import com.fsr.tracker.domain.MeasureConfiguration;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;

public class NotificationServiceImpl
    implements NotificationService
{

    private Context context;
    private Logger logger;

    public NotificationServiceImpl(Context context1)
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
        context = context1;
    }

    private void notify(String s, String s1, String s2, String s3, Intent intent)
    {
        int i = context.getResources().getIdentifier(s3, "layout", context.getPackageName());
        if (i == 0)
        {
            throw new AssertionError(String.format("Unable to locate resource: %s", new Object[] {
                s3
            }));
        }
        int j = context.getResources().getIdentifier(s2, "drawable", context.getPackageName());
        if (j == 0)
        {
            throw new AssertionError(String.format("Unable to locate resource: %s", new Object[] {
                s2
            }));
        } else
        {
            s2 = (NotificationManager)context.getSystemService("notification");
            s3 = new Notification(j, s, System.currentTimeMillis());
            logger.trace("Identifiers: expected=> {}, found=>{}", Integer.valueOf(i), Integer.valueOf(i));
            s3.contentView = new RemoteViews(context.getPackageName(), i);
            s3.setLatestEventInfo(context, s, s1, null);
            s = PendingIntent.getActivity(context, 0, intent, 0);
            s3.flags = 16;
            s3.defaults = ((Notification) (s3)).defaults | 1;
            s3.contentIntent = s;
            s2.notify(0, s3);
            return;
        }
    }

    public void notifyInApp(String s, String s1, MeasureConfiguration measureconfiguration, String s2, String s3)
    {
        Intent intent = new Intent(context, com/fsr/tracker/app/SurveyActivity);
        intent.putExtra("MEASURE_CONFIG", measureconfiguration);
        intent.putExtra("CONTEXT_CONFIG", TrackingContext.Instance().getConfiguration());
        intent.addFlags(0x800000);
        notify(s, s1, s2, s3, intent);
    }

    public void notifyInBrowser(String s, String s1, String s2, String s3, String s4)
    {
        notify(s, s1, s3, s4, new Intent("android.intent.action.VIEW", Uri.parse(s2)));
    }
}
