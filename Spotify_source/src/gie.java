// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.spotify.mobile.android.util.notifications.NotificationButtonHelper;

final class gie extends gic
{

    private NotificationButtonHelper c;
    private NotificationButtonHelper d;
    private NotificationButtonHelper e;
    private NotificationButtonHelper f;

    gie(Context context, ecp ecp1)
    {
        super(context, ecp1);
        c = new NotificationButtonHelper(0x7f110457, 0x7f110458);
        d = new NotificationButtonHelper(0x7f11044a, 0x7f11044b);
        e = new NotificationButtonHelper(0x7f1102d1, 0x7f110456);
        f = new NotificationButtonHelper(0x7f110448, 0x7f110449);
    }

    protected final void a(RemoteViews remoteviews)
    {
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag = b.c;
        flag3 = b.g;
        flag4 = b.f;
        flag5 = b.i;
        flag6 = b.a.e;
        flag2 = b.e;
        c.a(remoteviews, flag);
        if (!flag5) goto _L2; else goto _L1
_L1:
        Object obj;
        d.a(remoteviews, false);
        e.a(remoteviews, false);
        obj = f;
_L6:
        NotificationButtonHelper notificationbuttonhelper;
        boolean flag1;
        notificationbuttonhelper = ((NotificationButtonHelper) (obj));
        obj = remoteviews;
        flag1 = false;
_L4:
        notificationbuttonhelper.a(((RemoteViews) (obj)), flag1);
        if (flag2)
        {
            f.a(remoteviews, com.spotify.mobile.android.util.notifications.NotificationButtonHelper.Visibility.d);
        }
        return;
_L2:
        d.a(remoteviews, flag4);
        e.a(remoteviews, flag3);
        notificationbuttonhelper = f;
        if (flag6)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
        obj = remoteviews;
        if (true) goto _L4; else goto _L3
_L3:
        obj = notificationbuttonhelper;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final RemoteViews c()
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300e9);
        Object obj = b.a;
        Object obj1 = ((ect) (obj)).b();
        remoteviews.setTextViewText(0x7f110452, ((ecs) (obj1)).a);
        remoteviews.setTextViewText(0x7f110453, ((ecs) (obj1)).b);
        remoteviews.setTextViewText(0x7f110446, ((ecs) (obj1)).c);
        obj1 = dvv.a(a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION");
        ((Intent) (obj1)).putExtra("uri", ((ect) (obj)).a);
        obj = PendingIntent.getService(a, 0, ((Intent) (obj1)), 0x8000000);
        remoteviews.setImageViewResource(0x7f110449, 0x7f02009a);
        obj1 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 0x8000000);
        PendingIntent pendingintent = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.PREVIOUS"), 0x8000000);
        PendingIntent pendingintent1 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"), 0x8000000);
        PendingIntent pendingintent2 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.NEXT"), 0x8000000);
        remoteviews.setOnClickPendingIntent(0x7f110448, ((PendingIntent) (obj)));
        remoteviews.setOnClickPendingIntent(0x7f11044a, pendingintent);
        remoteviews.setOnClickPendingIntent(0x7f110457, pendingintent1);
        remoteviews.setOnClickPendingIntent(0x7f110458, pendingintent1);
        remoteviews.setOnClickPendingIntent(0x7f1102d1, pendingintent2);
        remoteviews.setOnClickPendingIntent(0x7f1102da, ((PendingIntent) (obj1)));
        return remoteviews;
    }
}
