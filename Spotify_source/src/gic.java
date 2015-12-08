// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public abstract class gic
{

    protected final Context a;
    protected final ecp b;
    private bb c;

    protected gic(Context context, ecp ecp1)
    {
        a = context;
        b = ecp1;
        context = ecp1.a;
        c = new bb(a);
        ecp1 = c.a(a()).a(((ect) (context)).b).a(0x7f020203).b().c().a(0L).e();
        if (!((ect) (context)).f.b())
        {
            context.f = fnu.a(new ecr(context));
        }
        ecp1.c(((ecr)((ect) (context)).f.a()).a);
        if (gcl.j)
        {
            c.f();
        }
    }

    public static gic a(Context context, ecp ecp1)
    {
        if (ecp1.d)
        {
            return new gid(context, ecp1);
        }
        if (ecp1.j)
        {
            return new gif(context, ecp1);
        } else
        {
            return new gie(context, ecp1);
        }
    }

    protected PendingIntent a()
    {
        Object obj = a;
        Intent intent = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
        intent.setFlags(0x30000000);
        obj = (new gms((Context)ctz.a(obj), intent)).a;
        return PendingIntent.getActivity(a, 0, ((Intent) (obj)), 0x8000000);
    }

    protected abstract void a(RemoteViews remoteviews);

    public final Notification b()
    {
        RemoteViews remoteviews = d();
        Notification notification = c.g();
        notification.contentView = remoteviews;
        if (!gcl.a)
        {
            notification.bigContentView = c();
        }
        a(notification.contentView);
        if (!gcl.a)
        {
            a(notification.bigContentView);
        }
        return notification;
    }

    protected abstract RemoteViews c();

    protected RemoteViews d()
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300f0);
        Object obj = b.a.a();
        remoteviews.setTextViewText(0x7f11026e, ((ecu) (obj)).a);
        remoteviews.setTextViewText(0x7f1102ef, ((ecu) (obj)).b);
        obj = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"), 0x8000000);
        PendingIntent pendingintent = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.NEXT"), 0x8000000);
        PendingIntent pendingintent1 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 0x8000000);
        if (b.c)
        {
            remoteviews.setOnClickPendingIntent(0x7f110457, ((PendingIntent) (obj)));
        } else
        {
            remoteviews.setOnClickPendingIntent(0x7f110458, ((PendingIntent) (obj)));
        }
        remoteviews.setOnClickPendingIntent(0x7f1102d1, pendingintent);
        remoteviews.setOnClickPendingIntent(0x7f1102da, pendingintent1);
        return remoteviews;
    }
}
