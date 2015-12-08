// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.content.Context;
import android.content.res.Resources;
import com.fitbit.data.domain.Notification;
import com.fitbit.serverinteraction.c.a;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.FitbitMobile:
//            GCMNotification

public class c
{

    private static final String a = "NotificationBuilder";
    private static int b = 1000;
    private final Context c;
    private GCMNotification d;
    private List e;

    public c(Context context)
    {
        c = context;
    }

    private String a(boolean flag)
    {
        if (flag)
        {
            return c.getString(0x7f080544);
        } else
        {
            return c.getString(0x7f080545);
        }
    }

    private String a(boolean flag, int i)
    {
        int j;
        if (flag)
        {
            j = 0x7f080221;
        } else
        {
            j = 0x7f080222;
        }
        return String.format(c.getString(j), new Object[] {
            Integer.valueOf(i)
        });
    }

    private void a(android.support.v4.app.NotificationCompat.Builder builder, Notification notification)
    {
        notification = notification.e();
        if (notification == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        builder.setLargeIcon(com.fitbit.serverinteraction.c.a.b().load(notification).get());
        return;
        builder;
        com.fitbit.e.a.e("NotificationBuilder", "Unable to load image", builder, new Object[0]);
        return;
    }

    public android.app.Notification a()
    {
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(c);
        builder.setVibrate(null);
        Object obj;
        int i;
        boolean flag;
        if (e != null)
        {
            i = e.size();
        } else
        {
            i = 0;
        }
        if (d.a() == GCMNotification.Type.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        builder.setSmallIcon(0x7f020268);
        builder.setContentIntent(d.a(c));
        builder.setColor(c.getResources().getColor(0x7f0f011e));
        if (i > 0 && d.a().b())
        {
            if (i > 1)
            {
                obj = a(flag, i);
                builder.setContentTitle(((CharSequence) (obj)));
                builder.setTicker(((CharSequence) (obj)));
                builder.setContentText(a(flag));
            } else
            {
                Notification notification = (Notification)e.get(0);
                obj = notification.d();
                builder.setContentText(((CharSequence) (obj)));
                builder.setTicker(((CharSequence) (obj)));
                builder.setContentTitle(notification.f());
                builder.setWhen(notification.h() * (long)b);
                a(builder, notification);
            }
        } else
        {
            obj = d.b();
            builder.setContentTitle(c.getString(0x7f080059));
            builder.setContentText(((CharSequence) (obj)));
            builder.setTicker(((CharSequence) (obj)));
        }
        if (i < 2)
        {
            return (new android.support.v4.app.NotificationCompat.BigTextStyle(builder.setSubText(""))).bigText(((CharSequence) (obj))).build();
        }
        obj = new android.support.v4.app.NotificationCompat.InboxStyle(builder);
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((android.support.v4.app.NotificationCompat.InboxStyle) (obj)).addLine(((Notification)iterator.next()).a())) { }
        return ((android.support.v4.app.NotificationCompat.InboxStyle) (obj)).build();
    }

    public c a(GCMNotification gcmnotification)
    {
        d = gcmnotification;
        return this;
    }

    public c a(List list)
    {
        e = list;
        return this;
    }

}
