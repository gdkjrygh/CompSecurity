// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.Context;
import android.widget.RemoteViews;
import com.spotify.mobile.android.util.notifications.NotificationButtonHelper;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

final class gid extends gic
{

    private NotificationButtonHelper c;
    private NotificationButtonHelper d;
    private NotificationButtonHelper e;
    private NotificationButtonHelper f;
    private NotificationButtonHelper g;

    gid(Context context, ecp ecp1)
    {
        super(context, ecp1);
        c = new NotificationButtonHelper(0x7f110457, 0x7f110458);
        d = new NotificationButtonHelper(0x7f11044a, 0x7f11044b);
        e = new NotificationButtonHelper(0x7f1102d1, 0x7f110456);
        f = new NotificationButtonHelper(0x7f11044f, 0x7f110450, 0x7f110451);
        g = new NotificationButtonHelper(0x7f11044c, 0x7f11044d, 0x7f11044e);
    }

    protected final void a(RemoteViews remoteviews)
    {
        boolean flag = b.c;
        boolean flag1 = b.f;
        boolean flag2 = b.g;
        boolean flag3 = b.d;
        ThumbState thumbstate = b.h;
        boolean flag4 = b.i;
        c.a(remoteviews, flag);
        if (flag4)
        {
            d.a(remoteviews, false);
            e.a(remoteviews, false);
            if (flag3)
            {
                f.a(remoteviews, false);
                g.a(remoteviews, false);
            }
        } else
        {
            d.a(remoteviews, flag1);
            e.a(remoteviews, flag2);
            if (flag3)
            {
                final class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[ThumbState.values().length];
                        try
                        {
                            a[ThumbState.b.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[ThumbState.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls1.a[thumbstate.ordinal()])
                {
                default:
                    f.a(remoteviews, true);
                    g.a(remoteviews, true);
                    return;

                case 1: // '\001'
                    f.a(remoteviews, com.spotify.mobile.android.util.notifications.NotificationButtonHelper.Visibility.c);
                    g.a(remoteviews, false);
                    return;

                case 2: // '\002'
                    f.a(remoteviews, false);
                    break;
                }
                g.a(remoteviews, com.spotify.mobile.android.util.notifications.NotificationButtonHelper.Visibility.c);
                return;
            }
        }
    }

    protected final RemoteViews c()
    {
        RemoteViews remoteviews = new RemoteViews(a.getPackageName(), 0x7f0300ea);
        Object obj = b.a.b();
        remoteviews.setTextViewText(0x7f110452, ((ecs) (obj)).a);
        remoteviews.setTextViewText(0x7f110453, ((ecs) (obj)).b);
        remoteviews.setTextViewText(0x7f110446, ((ecs) (obj)).c);
        obj = PendingIntent.getService(a, 1, RadioActionsService.a(a, ThumbState.b), 0x8000000);
        PendingIntent pendingintent = PendingIntent.getService(a, 2, RadioActionsService.a(a, ThumbState.c), 0x8000000);
        PendingIntent pendingintent1 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"), 0x8000000);
        PendingIntent pendingintent2 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"), 0x8000000);
        PendingIntent pendingintent3 = PendingIntent.getService(a, 0, dvv.a(a, "com.spotify.mobile.android.service.action.player.NEXT"), 0x8000000);
        remoteviews.setOnClickPendingIntent(0x7f11044f, ((PendingIntent) (obj)));
        remoteviews.setOnClickPendingIntent(0x7f11044c, pendingintent);
        remoteviews.setOnClickPendingIntent(0x7f110457, pendingintent2);
        remoteviews.setOnClickPendingIntent(0x7f110458, pendingintent2);
        remoteviews.setOnClickPendingIntent(0x7f1102d1, pendingintent3);
        remoteviews.setOnClickPendingIntent(0x7f1102da, pendingintent1);
        return remoteviews;
    }
}
