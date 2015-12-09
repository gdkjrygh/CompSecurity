// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.RemoteViews;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.f;
import com.pandora.radio.data.y;
import java.security.InvalidParameterException;
import p.an.h;
import p.cw.c;
import p.dd.ag;
import p.dd.ap;
import p.dd.at;
import p.dd.au;
import p.dd.ay;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bf;
import p.dd.bh;
import p.dd.e;
import p.dg.n;
import p.l.d;
import p.l.g;
import p.l.j;

public class a
{

    private static boolean j = false;
    private Notification a;
    private boolean b;
    private aa c;
    private y d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Bitmap h;
    private final Service i;

    public a(Service service)
    {
        i = service;
    }

    private Notification a(Context context, String as[], int k, PendingIntent pendingintent, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        RemoteViews remoteviews;
        int l;
        if (g)
        {
            notification.flags = notification.flags | 2;
        } else
        {
            notification.flags = notification.flags & -3;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            notification.category = "transport";
            notification.priority = 0;
            notification.visibility = 1;
        }
        remoteviews = new RemoteViews(context.getPackageName(), 0x7f040078);
        remoteviews.setTextViewText(0x7f100044, as[0]);
        remoteviews.setTextViewText(0x7f1001e9, as[1]);
        if (g() != null)
        {
            remoteviews.setImageViewBitmap(0x7f100078, h);
        } else
        {
            remoteviews.setImageViewResource(0x7f100078, 0x7f0200e9);
        }
        if (f)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        remoteviews.setViewVisibility(0x7f1001e8, l);
        a(context, remoteviews, flag);
        notification.icon = 0x7f02022b;
        notification.largeIcon = BitmapFactory.decodeResource(context.getResources(), 0x7f030000);
        notification.contentView = remoteviews;
        notification.contentIntent = pendingintent;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (!e && flag1)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            a(notification, context, as, k, flag, flag1);
        }
        return notification;
    }

    private Notification a(Context context, String as[], PendingIntent pendingintent)
    {
        Notification notification = new Notification();
        notification.when = 0L;
        notification.flags = notification.flags | 2;
        notification.icon = 0x7f02022b;
        notification.setLatestEventInfo(context, as[0], as[1], pendingintent);
        notification.contentIntent = pendingintent;
        return notification;
    }

    static Bitmap a(a a1, Bitmap bitmap)
    {
        a1.h = bitmap;
        return bitmap;
    }

    private void a(Notification notification, Context context, String as[], int k, boolean flag, boolean flag1)
    {
        if (d == null)
        {
            return;
        }
        String s1 = d.d();
        RemoteViews remoteviews;
        int l;
        if (b.a.b().a(p.dj.b.a.d))
        {
            l = 0x7f040079;
        } else
        {
            l = 0x7f04007a;
        }
        remoteviews = new RemoteViews(context.getPackageName(), l);
        remoteviews.setTextViewText(0x7f100044, as[0]);
        remoteviews.setTextViewText(0x7f1000da, as[1]);
        remoteviews.setTextViewText(0x7f1001ef, s1);
        if (g() != null)
        {
            remoteviews.setImageViewBitmap(0x7f100078, h);
        } else
        {
            remoteviews.setImageViewResource(0x7f100078, 0x7f0200e9);
        }
        a(context, remoteviews, flag);
        if (flag1 && !flag)
        {
            as = new Intent("cmd_widget_thumbs_up");
            as.putExtra("extra_source", com.pandora.radio.util.k.e.b.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f1001f2, PendingIntent.getBroadcast(context, 1, as, 0));
            as = new Intent("cmd_widget_thumbs_down");
            as.putExtra("extra_source", com.pandora.radio.util.k.e.b.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f1001f1, PendingIntent.getBroadcast(context, 1, as, 0));
            if (k == 1)
            {
                remoteviews.setImageViewResource(0x7f1001f1, 0x7f02021d);
                remoteviews.setImageViewResource(0x7f1001f2, 0x7f02021e);
            } else
            if (k == -1)
            {
                remoteviews.setImageViewResource(0x7f1001f1, 0x7f02021c);
                remoteviews.setImageViewResource(0x7f1001f2, 0x7f02021f);
            } else
            {
                remoteviews.setImageViewResource(0x7f1001f1, 0x7f02021d);
                remoteviews.setImageViewResource(0x7f1001f2, 0x7f02021f);
            }
            remoteviews.setBoolean(0x7f1001f1, "setEnabled", true);
            remoteviews.setBoolean(0x7f1001f2, "setEnabled", true);
        } else
        {
            remoteviews.setBoolean(0x7f1001f1, "setEnabled", false);
            remoteviews.setOnClickPendingIntent(0x7f1001f1, PendingIntent.getBroadcast(context, 1, new Intent(), 0));
            remoteviews.setBoolean(0x7f1001f2, "setEnabled", false);
            remoteviews.setOnClickPendingIntent(0x7f1001f2, PendingIntent.getBroadcast(context, 1, new Intent(), 0));
        }
        if (f)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        remoteviews.setViewVisibility(0x7f1001e8, k);
        notification.bigContentView = remoteviews;
    }

    private void a(Context context, RemoteViews remoteviews, boolean flag)
    {
        Object obj = b.a.b().d();
        int k;
        if (!flag && ((p.cw.b) (obj)).W() && !e && !b.a.F())
        {
            k = 1;
        } else
        {
            k = 0;
        }
        remoteviews.setImageViewResource(0x7f1001ae, 0x7f02021a);
        if (k != 0)
        {
            remoteviews.setBoolean(0x7f1001ae, "setEnabled", true);
            obj = new Intent("cmd_widget_skip");
            ((Intent) (obj)).putExtra("intent_skip_source", "Notification skip");
            ((Intent) (obj)).putExtra("extra_source", com.pandora.radio.util.k.e.b.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f1001ae, PendingIntent.getBroadcast(context, 1, ((Intent) (obj)), 0));
        } else
        {
            remoteviews.setBoolean(0x7f1001ae, "setEnabled", false);
            remoteviews.setOnClickPendingIntent(0x7f1001ae, PendingIntent.getBroadcast(context, 1, new Intent(), 0));
        }
        obj = new Intent("cmd_widget_toggle_pause");
        ((Intent) (obj)).putExtra("extra_source", com.pandora.radio.util.k.e.b.ordinal());
        remoteviews.setOnClickPendingIntent(0x7f1001ad, PendingIntent.getBroadcast(context, 1, ((Intent) (obj)), 0));
        if (g)
        {
            k = 0x7f020218;
        } else
        {
            k = 0x7f020219;
        }
        remoteviews.setImageViewResource(0x7f1001ad, k);
        if (e)
        {
            remoteviews.setBoolean(0x7f1001ad, "setEnabled", false);
        } else
        {
            remoteviews.setBoolean(0x7f1001ad, "setEnabled", true);
        }
        obj = new Intent("cmd_widget_close");
        ((Intent) (obj)).putExtra("extra_source", com.pandora.radio.util.k.e.b.ordinal());
        remoteviews.setOnClickPendingIntent(0x7f100040, PendingIntent.getBroadcast(context, 1, ((Intent) (obj)), 0));
    }

    static void a(a a1)
    {
        a1.e();
    }

    public static void b(boolean flag)
    {
        j = flag;
    }

    private boolean c()
    {
        return (com.pandora.android.util.a.a(p.dj.b.a.d) || com.pandora.android.util.a.a(p.dj.b.a.h) || android.os.Build.VERSION.SDK_INT >= 21) && !b.a.b().l().l();
    }

    private void d()
    {
        if (!c())
        {
            return;
        } else
        {
            android.app.Application application = b.a.h();
            int k = (int)application.getResources().getDimension(0x7f090108);
            p.l.g.b(application).a(c.v()).h().a(p.s.b.c).a(new p.ao.b("PersistentNotificationManager")).a(new h(k, k) {

                final a a;

                public void a(Bitmap bitmap, p.am.c c1)
                {
                    a.a(a, bitmap);
                    a.a(a);
                }

                public volatile void a(Object obj, p.am.c c1)
                {
                    a((Bitmap)obj, c1);
                }

            
            {
                a = a.this;
                super(k, l);
            }
            });
            return;
        }
    }

    private void e()
    {
        if (c == null)
        {
            return;
        } else
        {
            NotificationManager notificationmanager = (NotificationManager)b.a.h().getSystemService("notification");
            a = f();
            notificationmanager.notify(1, a);
            return;
        }
    }

    private Notification f()
    {
        android.app.Application application = b.a.h();
        Object obj = new Intent("cmd_widget_foreground_app");
        ((Intent) (obj)).putExtra("extra_source", com.pandora.radio.util.k.e.b.ordinal());
        obj = PendingIntent.getBroadcast(application, 1, ((Intent) (obj)), 0);
        String as[] = s.a(application, c, c.s(), c.t(), c.u());
        if (c() && !b.a.b().C())
        {
            return a(application, as, c.E(), ((PendingIntent) (obj)), c.M(), c.B());
        } else
        {
            return a(application, as, ((PendingIntent) (obj)));
        }
    }

    private Bitmap g()
    {
        if (h != null && h.isRecycled())
        {
            h = null;
            com.crashlytics.android.d.a(new IllegalStateException("Can't use a recycled bitmap."));
        }
        return h;
    }

    public void a()
    {
        b.a.b().b(this);
        b.a.e().c(this);
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void b()
    {
        b.a.b().c(this);
        b.a.e().b(this);
    }

    public void onAutomotiveAccessoryRadioEvent(e e1)
    {
        if (j)
        {
            e();
        }
    }

    public void onPlayerState(ag ag1)
    {
        static class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[p.cw.b.a.values().length];
                try
                {
                    a[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.cw.b.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cw.b.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cw.b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cw.b.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[ag1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 99
    //                   2 99
    //                   3 99
    //                   4 75
    //                   5 191;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChangeEvent called with unknown PlayerStateChangeEvent state: ").append(ag1.a).toString());
_L3:
        g = false;
        if (j) goto _L6; else goto _L5
_L5:
        i.stopForeground(true);
        a(false);
_L2:
        return;
_L6:
        i.stopForeground(false);
        if (!c() || b.a.b().C()) goto _L2; else goto _L7
_L7:
        ag1 = (NotificationManager)i.getSystemService("notification");
        a(i, a.contentView, false);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a(i, a.bigContentView, false);
        }
        ag1.notify(1, a);
        return;
_L4:
        g = false;
        i.stopForeground(true);
        a(false);
        return;
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.b(ap1.c))
        {
            e = true;
            if (b)
            {
                e();
            }
        }
    }

    public void onStationData(at at1)
    {
        d = at1.a;
    }

    public void onStationPersonalizationChange(au au)
    {
        if (b)
        {
            e();
        }
    }

    public void onStationStateChange(ay ay)
    {
        if (b)
        {
            e();
        }
    }

    public void onThumbDown(bb bb1)
    {
        if (b && !bb1.c)
        {
            e();
        }
    }

    public void onThumbRevert(bc bc1)
    {
        if (b && !bc1.c)
        {
            e();
        }
    }

    public void onThumbUp(bd bd1)
    {
        if (b && !bd1.c)
        {
            e();
        }
    }

    public void onTrackBuffering(bf bf1)
    {
        if (bf1.a)
        {
            f = false;
        } else
        {
            f = bf1.b.b();
        }
        if (b)
        {
            e();
        }
    }

    public void onTrackState(bh bh1)
    {
        c = bh1.b;
        switch (com.pandora.android.widget._cls2.b[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
            if (c())
            {
                b(true);
            }
            f = true;
            e = false;
            d();
            e();
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            g = false;
            h = null;
            e();
            return;

        case 4: // '\004'
            f = false;
            g = true;
            if (!c())
            {
                b(false);
            }
            i.startForeground(1, f());
            a(true);
            return;

        case 5: // '\005'
            g = false;
            break;
        }
        if (!j)
        {
            i.stopForeground(true);
            a(false);
            return;
        } else
        {
            i.stopForeground(false);
            e();
            return;
        }
    }

}
