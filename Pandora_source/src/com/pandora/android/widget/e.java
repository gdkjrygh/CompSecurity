// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;

import android.app.Application;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.content.j;
import android.widget.RemoteViews;
import com.pandora.android.activity.ListeningTimeoutActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.o;
import com.pandora.radio.data.y;
import com.pandora.radio.util.NetworkUtil;
import java.security.InvalidParameterException;
import p.an.h;
import p.cw.c;
import p.cx.p;
import p.dd.ag;
import p.dd.an;
import p.dd.ao;
import p.dd.ap;
import p.dd.au;
import p.dd.ax;
import p.dd.ay;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bg;
import p.dd.bh;
import p.dd.bu;
import p.dd.x;
import p.dd.z;
import p.l.a;
import p.l.d;
import p.l.g;

// Referenced classes of package com.pandora.android.widget:
//            b, c, Widget

public class e
    implements com.pandora.android.widget.b, com.pandora.android.widget.c
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/widget/e$a, s1);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("STOPPED", 0);
            b = new a("WAITING", 1);
            c = new a("LISTENING_TIMEOUT", 2);
            d = new a("PLAYING", 3);
            e = new a("AUTO_PAUSED", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s1, int l)
        {
            super(s1, l);
        }
    }


    protected ComponentName a;
    private final c b;
    private a c;
    private aa d;
    private p.dd.bh.a e;
    private int f;
    private int g;
    private Bitmap h;
    private final String i;
    private AppWidgetManager j;
    private BroadcastReceiver k;

    public e()
    {
        c = com.pandora.android.widget.a.a;
        a = null;
        k = new BroadcastReceiver() {

            final e a;

            public void onReceive(Context context, Intent intent)
            {
                if (intent.getAction().equals(PandoraIntent.a("show_waiting")))
                {
                    intent = intent.getStringExtra("intent_waiting_msg");
                    context = intent;
                    if (s.a(intent))
                    {
                        context = b.a.h().getString(0x7f0801c0);
                    }
                    com.pandora.android.widget.e.a(a, context);
                }
            }

            
            {
                a = e.this;
                super();
            }
        };
        b b1 = b.a;
        Object obj = b1.h();
        b = b1.b();
        b.b(this);
        f = 1;
        i = ((Application) (obj)).getString(0x7f0801c0);
        j = AppWidgetManager.getInstance(((Context) (obj)));
        obj = new PandoraIntentFilter();
        ((PandoraIntentFilter) (obj)).a("show_waiting");
        b1.C().a(k, ((android.content.IntentFilter) (obj)));
    }

    static Bitmap a(e e1, Bitmap bitmap)
    {
        e1.h = bitmap;
        return bitmap;
    }

    private void a(int l, RemoteViews remoteviews, int i1)
    {
        if (i1 != 0x7f0400c2)
        {
            if (l == 1)
            {
                remoteviews.setImageViewResource(0x7f1001f1, 0x7f0202f3);
                remoteviews.setImageViewResource(0x7f1001f2, 0x7f0202f7);
                return;
            }
            if (l == -1)
            {
                remoteviews.setImageViewResource(0x7f1001f1, 0x7f0202f2);
                remoteviews.setImageViewResource(0x7f1001f2, 0x7f0202f8);
                return;
            } else
            {
                remoteviews.setImageViewResource(0x7f1001f1, 0x7f0202f3);
                remoteviews.setImageViewResource(0x7f1001f2, 0x7f0202f8);
                return;
            }
        }
        if (l == 1)
        {
            remoteviews.setImageViewResource(0x7f1001f1, 0x7f0202de);
            remoteviews.setImageViewResource(0x7f1001f2, 0x7f0202df);
            return;
        }
        if (l == -1)
        {
            remoteviews.setImageViewResource(0x7f1001f1, 0x7f0202dd);
            remoteviews.setImageViewResource(0x7f1001f2, 0x7f0202e0);
            return;
        } else
        {
            remoteviews.setImageViewResource(0x7f1001f1, 0x7f0202de);
            remoteviews.setImageViewResource(0x7f1001f2, 0x7f0202e0);
            return;
        }
    }

    private void a(RemoteViews remoteviews, int l, int i1)
    {
        remoteviews.setViewVisibility(0x7f100308, 8);
        remoteviews.setViewVisibility(0x7f100302, 8);
        remoteviews.setViewVisibility(0x7f10030a, 8);
        remoteviews.setViewVisibility(0x7f10030d, 8);
        remoteviews.setViewVisibility(0x7f100310, 8);
        remoteviews.setViewVisibility(l, 0);
        if (l == 0x7f100302 && i1 != 0x7f0400c0)
        {
            remoteviews.setViewVisibility(0x7f100313, 0);
        }
    }

    private void a(RemoteViews remoteviews, Context context, aa aa1, int l)
    {
        context = s.a(context, aa1, aa1.s(), aa1.t(), aa1.u());
        aa1 = b.a.b().d().t();
        remoteviews.setTextViewText(0x7f100304, context[0]);
        remoteviews.setTextViewText(0x7f100305, context[1]);
        remoteviews.setTextViewText(0x7f100306, context[2]);
        if (l != 0x7f0400c0)
        {
            if (aa1 != null)
            {
                context = aa1.d();
            } else
            {
                context = "";
            }
            remoteviews.setTextViewText(0x7f100314, context);
        }
    }

    static void a(e e1, String s1)
    {
        e1.a(s1);
    }

    private void a(aa aa1, boolean flag)
    {
        Application application = b.a.h();
        int ai[] = j.getAppWidgetIds(a(((Context) (application))));
        int i1 = ai.length;
        for (int l = 0; l < i1; l++)
        {
            a(aa1, flag, ai[l]);
        }

    }

    private void a(String s1)
    {
        Application application = b.a.h();
        int ai[] = j.getAppWidgetIds(a(((Context) (application))));
        int i1 = ai.length;
        for (int l = 0; l < i1; l++)
        {
            int j1 = ai[l];
            int k1 = b(j1);
            RemoteViews remoteviews = new RemoteViews(application.getPackageName(), k1);
            remoteviews.setTextViewText(0x7f10030c, s1);
            a(remoteviews, 0x7f10030a, k1);
            Intent intent = new Intent("cmd_widget_foreground_app");
            intent.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f10030a, PendingIntent.getBroadcast(application, 0, intent, 0));
            j.updateAppWidget(j1, remoteviews);
        }

        c = com.pandora.android.widget.a.b;
    }

    private void a(boolean flag, RemoteViews remoteviews, int l)
    {
        if (l != 0x7f0400c2)
        {
            if (flag)
            {
                l = 0x7f0202ea;
            } else
            {
                l = 0x7f0202e7;
            }
        } else
        if (flag)
        {
            l = 0x7f0202db;
        } else
        {
            l = 0x7f0202da;
        }
        remoteviews.setImageViewResource(0x7f1001ad, l);
    }

    private int b(int l)
    {
        l = b.a.b().j().c(l);
        if (l > 0)
        {
            return Widget.a.values()[l].a();
        } else
        {
            return 0x7f0400c0;
        }
    }

    private void c(int l)
    {
        a(d, e());
    }

    private boolean e()
    {
        return e == p.dd.bh.a.c;
    }

    private void f()
    {
        a(i);
    }

    private void g()
    {
        Application application;
        for (application = b.a.h(); j.getAppWidgetIds(a(application)).length == 0 || d == null;)
        {
            return;
        }

        p.l.g.b(application).a(d.v()).h().a(p.s.b.c).a(new p.ao.b("WIDGET")).a(new h(0x80000000, 0x80000000) {

            final e a;

            public void a(Bitmap bitmap, p.am.c c1)
            {
                com.pandora.android.widget.e.a(a, bitmap);
                a.a();
            }

            public volatile void a(Object obj, p.am.c c1)
            {
                a((Bitmap)obj, c1);
            }

            
            {
                a = e.this;
                super(l, i1);
            }
        });
    }

    protected ComponentName a(Context context)
    {
        if (a == null)
        {
            a = new ComponentName(context.getPackageName(), com/pandora/android/widget/Widget.getName());
        }
        return a;
    }

    public void a()
    {
        Application application = b.a.h();
        a(j.getAppWidgetIds(a(((Context) (application)))));
    }

    public void a(int l)
    {
        a(d, e(), l);
    }

    protected void a(aa aa1, boolean flag, int l)
    {
        if (l == 0)
        {
            throw new InvalidParameterException("updateWidget: valid appWidgetId must be passed (i.e. not AppWidgetManager.INVALID_APPWIDGET_ID)");
        }
        Application application = b.a.h();
        int i1 = b(l);
        RemoteViews remoteviews = new RemoteViews(application.getPackageName(), i1);
        remoteviews.setProgressBar(0x7f100307, f, g, false);
        c = com.pandora.android.widget.a.a;
        boolean flag4 = b.a.t();
        p.cw.b b1 = b.a.b().d();
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (aa1 != null && aa1.M() || b.a.F())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || !b1.W())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag2)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        remoteviews.setBoolean(0x7f1001ae, "setEnabled", flag3);
        if (!flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        remoteviews.setBoolean(0x7f1001f2, "setEnabled", flag3);
        if (!flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        remoteviews.setBoolean(0x7f1001f1, "setEnabled", flag3);
        if (!flag4 && b.a.b().z().b())
        {
            remoteviews.setOnClickPendingIntent(0x7f10030d, PendingIntent.getActivity(application, 0, new Intent(application, com/pandora/android/activity/ListeningTimeoutActivity), 0));
            a(remoteviews, 0x7f10030d, i1);
            c = com.pandora.android.widget.a.c;
        } else
        if (!flag4 && b.a.b().G().d())
        {
            remoteviews.setOnClickPendingIntent(0x7f100310, PendingIntent.getActivity(application, 0, s.b(application), 0));
            a(remoteviews, 0x7f100310, i1);
            c = a.e;
        } else
        if (!flag4 && aa1 != null && !com.pandora.android.ads.VideoAdManager.c.a().l())
        {
            a(remoteviews, ((Context) (application)), aa1, i1);
            a(remoteviews, 0x7f100302, i1);
            Intent intent = new Intent("cmd_widget_foreground_app");
            intent.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f100303, PendingIntent.getBroadcast(application, 0, intent, 0));
            remoteviews.setOnClickPendingIntent(0x7f10030b, PendingIntent.getBroadcast(application, 0, intent, 0));
            if (i1 != 0x7f0400c0)
            {
                remoteviews.setOnClickPendingIntent(0x7f100313, PendingIntent.getBroadcast(application, 0, intent, 0));
            }
            intent = new Intent("cmd_widget_toggle_pause");
            intent.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f1001ad, PendingIntent.getBroadcast(application, 0, intent, 0));
            intent = new Intent("cmd_widget_thumbs_up");
            intent.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f1001f2, PendingIntent.getBroadcast(application, 0, intent, 0));
            intent = new Intent("cmd_widget_thumbs_down");
            intent.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f1001f1, PendingIntent.getBroadcast(application, 0, intent, 0));
            intent = new Intent("cmd_widget_skip");
            intent.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            intent.putExtra("intent_skip_source", "Widget skip");
            remoteviews.setOnClickPendingIntent(0x7f1001ae, PendingIntent.getBroadcast(application, 0, intent, 0));
            a(aa1.E(), remoteviews, i1);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag, remoteviews, i1);
            if (i1 != 0x7f0400c0)
            {
                if (h == null)
                {
                    h = BitmapFactory.decodeResource(application.getResources(), 0x7f0200e9);
                }
                remoteviews.setBitmap(0x7f100313, "setImageBitmap", h);
            }
            c = com.pandora.android.widget.a.d;
        } else
        {
            aa1 = new Intent("cmd_widget_foreground_app");
            aa1.putExtra("extra_source", com.pandora.radio.util.k.e.a.ordinal());
            remoteviews.setOnClickPendingIntent(0x7f100309, PendingIntent.getBroadcast(application, 0, aa1, 0));
            remoteviews.setOnClickPendingIntent(0x7f100308, PendingIntent.getBroadcast(application, 0, aa1, 0));
            a(remoteviews, 0x7f100308, i1);
            c = com.pandora.android.widget.a.a;
        }
        try
        {
            j.updateAppWidget(l, remoteviews);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            h = null;
        }
        com.crashlytics.android.d.a(aa1);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            g();
            return;
        } else
        {
            h = null;
            return;
        }
    }

    public void a(int ai[])
    {
        int i1 = ai.length;
        for (int l = 0; l < i1; l++)
        {
            int j1 = ai[l];
            a(d, e(), j1);
        }

    }

    public void b()
    {
        a(((aa) (null)), false);
    }

    public void b(int ai[])
    {
    }

    public void c()
    {
        b b1 = b.a;
        if (!b.u().b() && c == com.pandora.android.widget.a.b)
        {
            a(b1.h().getResources().getString(0x7f080288));
            return;
        } else
        {
            a(d, e());
            return;
        }
    }

    public void d()
    {
        b.a.C().a(k);
        b.c(this);
    }

    public void onApiError(p.dd.c c1)
    {
        if (c == com.pandora.android.widget.a.b && c1.a == 0x186a1 || c1.a == 3003)
        {
            a(((aa) (null)), false);
        }
    }

    public void onListeningTimeout(x x)
    {
        a(((aa) (null)), false);
    }

    public void onNetworkWaiting(z z)
    {
        a(b.a.h().getResources().getString(0x7f080288));
    }

    public void onPlayerStateChangeEvent(ag ag1)
    {
        static class _cls3
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];
            static final int e[];

            static 
            {
                e = new int[p.cx.a.values().length];
                try
                {
                    e[p.cx.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    e[p.cx.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    e[p.cx.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    e[p.cx.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                d = new int[p.cw.b.a.values().length];
                try
                {
                    d[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    d[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    d[p.cw.b.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    d[p.cw.b.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    d[p.cw.b.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                c = new int[p.dd.ay.a.values().length];
                try
                {
                    c[p.dd.ay.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    c[p.dd.ay.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    c[p.dd.ay.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[p.dd.ay.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                b = new int[p.cw.d.a.values().length];
                try
                {
                    b[p.cw.d.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.cw.d.a.f.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cw.d.a.h.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.widget._cls3.d[ag1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChangeEvent called with unknown PlayerStateChangeEvent state: ").append(ag1.a).toString());

        case 5: // '\005'
            a(((aa) (null)), false);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return;
        }
    }

    public void onSignInState(an an1)
    {
        switch (_cls3.e[an1.b.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return;

        case 3: // '\003'
        case 4: // '\004'
            a(((aa) (null)), false);
            break;
        }
    }

    public void onSilentSkip(ao ao)
    {
        f();
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.b(ap1.c))
        {
            f();
        }
    }

    public void onStationPersonalizationChange(au au)
    {
        a(d, e());
    }

    public void onStationRegainedNetworkEvent(ax ax1)
    {
        a(ax1.a, ax1.b);
    }

    public void onStationStateChange(ay ay1)
    {
        switch (com.pandora.android.widget._cls3.c[ay1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

        case 2: // '\002'
        case 3: // '\003'
            f();
            // fall through

        case 1: // '\001'
            return;

        case 4: // '\004'
            a(((aa) (null)), false);
            break;
        }
        s.d();
    }

    public void onThumbDown(bb bb1)
    {
        com.pandora.android.widget._cls3.b[bb1.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 36
    //                   3 50;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (!bb1.c)
        {
            c(-1);
            return;
        }
          goto _L1
_L3:
        s.a(b.a.h(), 0x7f080183);
        return;
    }

    public void onThumbRevert(bc bc1)
    {
        if (!bc1.c)
        {
            c(bc1.b);
        }
    }

    public void onThumbUp(bd bd1)
    {
        com.pandora.android.widget._cls3.b[bd1.a.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 46;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (!bd1.c)
        {
            c(1);
            return;
        }
          goto _L1
_L3:
        s.a(b.a.h(), 0x7f080183);
        return;
    }

    public void onTrackElapsedTime(bg bg1)
    {
        f = Math.round((float)bg1.b / 1000F);
        g = bg1.a;
        a();
    }

    public void onTrackState(bh bh1)
    {
        e = bh1.a;
        d = bh1.b;
        switch (com.pandora.android.widget._cls3.a[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 1: // '\001'
            g();
            a(d, true);
            return;

        case 2: // '\002'
            a(d, true);
            return;

        case 3: // '\003'
            a(d, false);
            return;

        case 4: // '\004'
        case 5: // '\005'
            h = null;
            break;
        }
    }

    public void onZeroVolumeAutoPause(bu bu)
    {
        a(((aa) (null)), false);
    }
}
