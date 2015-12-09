// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.multitouch.photoproto;

import android.app.Notification;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import bolts.i;
import bolts.j;
import java.util.Calendar;

// Referenced classes of package com.cardinalblue.android.piccollage.multitouch.photoproto:
//            PCGCMIntentService

class b
    implements i
{

    final android.support.v4.app.ilder a;
    final String b;
    final PCGCMIntentService c;

    public Notification a(j j1)
        throws Exception
    {
        if (!j1.d())
        {
            Object obj = new android.support.v4.app.gPictureStyle();
            a.setStyle(((android.support.v4.app.yle) (obj)));
            obj = a.build();
            if (android.os. >= 16)
            {
                RemoteViews remoteviews = new RemoteViews(c.getPackageName(), 0x7f030093);
                remoteviews.setImageViewResource(0x7f10007a, 0x7f02020f);
                j1 = (Bitmap)j1.e();
                j1.setDensity(160);
                remoteviews.setImageViewBitmap(0x7f100191, j1);
                remoteviews.setTextViewText(0x7f10007b, c.getString(0x7f0700f9));
                if (!TextUtils.isEmpty(b))
                {
                    remoteviews.setTextViewText(0x7f100190, b);
                    remoteviews.setViewVisibility(0x7f100190, 0);
                }
                j1 = Calendar.getInstance();
                remoteviews.setTextViewText(0x7f10018f, String.format("%d:%2d", new Object[] {
                    Integer.valueOf(j1.get(11)), Integer.valueOf(j1.get(12))
                }));
                obj.bigContentView = remoteviews;
            }
            return ((Notification) (obj));
        } else
        {
            return a.build();
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (PCGCMIntentService pcgcmintentservice, android.support.v4.app.ilder ilder, String s)
    {
        c = pcgcmintentservice;
        a = ilder;
        b = s;
        super();
    }
}
