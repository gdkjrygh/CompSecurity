// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.Notification;
import android.content.Context;
import android.support.v4.app.ad;
import android.widget.RemoteViews;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.c.a.a;

// Referenced classes of package com.arist.service:
//            o

public final class l extends o
{

    public l(Context context)
    {
        super(context);
    }

    public final Notification a(b b1, boolean flag)
    {
        ad ad1 = new ad(b);
        String s = b1.d();
        String s1 = b1.j();
        b1 = com.arist.c.a.a.a(MyApplication.q, b1);
        RemoteViews remoteviews = new RemoteViews(b.getPackageName(), 0x7f030036);
        remoteviews.setOnClickPendingIntent(0x7f0600d8, a(com.arist.c.a.f));
        remoteviews.setOnClickPendingIntent(0x7f0600d9, a(com.arist.c.a.b));
        remoteviews.setOnClickPendingIntent(0x7f0600da, a(com.arist.c.a.g));
        remoteviews.setOnClickPendingIntent(0x7f0600d5, a(com.arist.c.a.q));
        remoteviews.setImageViewBitmap(0x7f0600d3, b1);
        int i;
        if (flag)
        {
            i = 0x7f0200c9;
        } else
        {
            i = 0x7f0200cc;
        }
        remoteviews.setImageViewResource(0x7f0600d9, i);
        remoteviews.setTextViewText(0x7f0600d4, s);
        remoteviews.setTextViewText(0x7f0600d7, s1);
        ad1.a(remoteviews).a(a()).a(System.currentTimeMillis()).a(s).c().b().a();
        b1 = ad1.d();
        b1.flags = 2;
        return b1;
    }
}
