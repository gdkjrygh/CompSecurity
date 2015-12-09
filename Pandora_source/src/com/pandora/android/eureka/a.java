// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.eureka;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.OperationApplicationException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.content.j;
import android.support.v7.app.MediaRouteButton;
import android.support.v7.media.g;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.sessions.LaunchSession;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.data.n;
import com.pandora.android.eureka.dialog.e;
import com.pandora.android.provider.b;
import com.pandora.android.util.af;
import com.pandora.android.util.s;
import com.pandora.android.util.z;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.f;
import com.pandora.radio.data.o;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.List;
import org.json.JSONException;
import p.cw.c;
import p.cx.d;
import p.cx.h;
import p.cx.q;
import p.cx.x;
import p.dd.an;
import p.dd.bh;
import p.dd.bn;
import p.dd.p;

// Referenced classes of package com.pandora.android.eureka:
//            c

public class com.pandora.android.eureka.a
    implements n
{
    private class a extends h
    {

        final com.pandora.android.eureka.a a;

        public a a()
        {
            return a. new a();
        }

        public transient String a(Object aobj[])
            throws JSONException, q, p.cx.y, p.cx.n
        {
            aobj = com.pandora.android.eureka.a.e(a).e().g();
            if (!com.pandora.android.util.s.a(((String) (aobj))))
            {
                com.pandora.android.eureka.a.e(a).l().a(((String) (aobj)));
            }
            return ((String) (aobj));
        }

        public void a(String s1)
        {
            com.pandora.android.eureka.a.a("retreived deviceId");
            if (s1 != null && a.g != null)
            {
                a.g.S();
                return;
            } else
            {
                com.pandora.android.eureka.a.a(a);
                return;
            }
        }

        public Object b(Object aobj[])
            throws JSONException, q, p.cx.y, p.cx.n, RemoteException, OperationApplicationException
        {
            return a(aobj);
        }

        public h b()
        {
            return a();
        }

        public void onPostExecute(Object obj)
        {
            a((String)obj);
        }

        private a()
        {
            a = com.pandora.android.eureka.a.this;
            super();
        }

    }


    protected g f;
    protected com.pandora.android.eureka.c g;
    private c h;
    private p.dt.b i;
    private Context j;
    private android.support.v7.media.f k;
    private e l;
    private android.support.v7.media.g.a m;
    private Context n;
    private p.cx.e.a o;
    private boolean p;

    public com.pandora.android.eureka.a(c c1)
    {
        j = null;
        m = null;
        n = null;
        o = p.cx.e.a.d;
        g = null;
        p = false;
        Context context = b.a.h().getApplicationContext();
        j = context;
        h = c1;
        h.b(this);
        i = b.a.e();
        i.c(this);
        if (l())
        {
            g = new com.pandora.android.eureka.c(h, context);
        }
    }

    private void a(android.support.v7.media.g.f f1)
    {
        g.a(f1.b(), f1.a(), f1.m());
        b((new StringBuilder()).append("Cast device selected: ").append(g.R()).toString());
        if (!g.F())
        {
            r();
        }
    }

    static void a(com.pandora.android.eureka.a a1)
    {
        a1.p();
    }

    static void a(com.pandora.android.eureka.a a1, android.support.v7.media.g.f f1)
    {
        a1.a(f1);
    }

    static void a(String s1)
    {
        b(s1);
    }

    protected static boolean a(long l1, long l2)
    {
        return l1 + l2 < System.currentTimeMillis();
    }

    static void b(com.pandora.android.eureka.a a1)
    {
        a1.r();
    }

    private static void b(String s1)
    {
        p.df.a.c("EurekaHandler", (new StringBuilder()).append("PANDCAST: ").append(s1).toString());
    }

    static android.support.v7.media.f c(com.pandora.android.eureka.a a1)
    {
        return a1.k;
    }

    static android.support.v7.media.g.a d(com.pandora.android.eureka.a a1)
    {
        return a1.m;
    }

    static c e(com.pandora.android.eureka.a a1)
    {
        return a1.h;
    }

    static Context f(com.pandora.android.eureka.a a1)
    {
        return a1.j;
    }

    static p.cx.e.a g(com.pandora.android.eureka.a a1)
    {
        return a1.o;
    }

    static void h(com.pandora.android.eureka.a a1)
    {
        a1.q();
    }

    private void m()
    {
        if (l())
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final com.pandora.android.eureka.a a;

                public void run()
                {
                    if (a.f != null)
                    {
                        com.pandora.android.eureka.a.a("start scan");
                        a.f.a(com.pandora.android.eureka.a.c(a), com.pandora.android.eureka.a.d(a), 1);
                    }
                }

            
            {
                a = com.pandora.android.eureka.a.this;
                super();
            }
            });
        }
    }

    private void n()
    {
        if (l())
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final com.pandora.android.eureka.a a;

                public void run()
                {
                    if (a.f != null)
                    {
                        com.pandora.android.eureka.a.a("stop scan");
                        a.f.a(com.pandora.android.eureka.a.d(a));
                    }
                }

            
            {
                a = com.pandora.android.eureka.a.this;
                super();
            }
            });
        }
    }

    private android.support.v7.media.g.a o()
    {
        return new android.support.v7.media.g.a() {

            final com.pandora.android.eureka.a a;

            public void a(g g1, android.support.v7.media.g.f f1)
            {
                b.a.e().a(a.produceCastDeviceListChangedAppEvent());
                com.pandora.android.eureka.a.a((new StringBuilder()).append("onRouteAdded: ").append(f1.b()).toString());
                super.a(g1, f1);
                if (a.g == null)
                {
                    g1 = null;
                } else
                {
                    g1 = a.g.Q();
                }
                while (g1 == null || g1.c() == null || com.pandora.android.eureka.a.g(a) == null || !g1.c().equals(f1.a()) || !com.pandora.android.eureka.a.g(a).equals(p.cx.e.a.b)) 
                {
                    return;
                }
                f1.n();
                com.pandora.android.eureka.a.a((new StringBuilder()).append("Selecting newly added route: ").append(f1.b()).toString());
            }

            public void b(g g1, android.support.v7.media.g.f f1)
            {
                b.a.e().a(a.produceCastDeviceListChangedAppEvent());
            }

            public void d(g g1, android.support.v7.media.g.f f1)
            {
                com.pandora.android.eureka.a.a("onRouteSelected");
                Object obj;
                if (com.pandora.android.eureka.a.e(a).d().o())
                {
                    g1 = "play";
                } else
                {
                    g1 = "pause";
                }
                com.pandora.android.eureka.a.e(a).o().a(com.pandora.radio.util.k.g.a, g1, null);
                obj = f1.m();
                ((Bundle) (obj)).setClassLoader(com/google/android/gms/cast/CastDevice.getClassLoader());
                if (obj != null && ((Bundle) (obj)).size() > 0 && ((Bundle) (obj)).containsKey("deviceType"))
                {
                    g1 = com.pandora.android.eureka.dialog.f.a.a(((Bundle) (obj)).getInt("deviceType"));
                } else
                {
                    g1 = null;
                }
                if (a.g != null)
                {
                    if (!a.g.E())
                    {
                        if (g1 != null)
                        {
                            obj = com.pandora.android.eureka.dialog.f.a(com.pandora.android.eureka.a.f(a)).b(((Bundle) (obj)).getString("deviceUuid"));
                            if (g1 == com.pandora.android.eureka.dialog.f.a.a)
                            {
                                ((ConnectableDevice) (obj)).getLauncher().launchApp("pandora", new com.connectsdk.service.capability.Launcher.AppLaunchListener(this, f1) {

                                    final android.support.v7.media.g.f a;
                                    final _cls5 b;

                                    public void a(LaunchSession launchsession)
                                    {
                                        b.a.g.a(a.m().getString("messageUrl"));
                                        com.pandora.android.eureka.a.a(b.a, a);
                                    }

                                    public void onError(ServiceCommandError servicecommanderror)
                                    {
                                    }

                                    public void onSuccess(Object obj)
                                    {
                                        a((LaunchSession)obj);
                                    }

            
            {
                b = _pcls5;
                a = f1;
                super();
            }
                                });
                                return;
                            }
                        } else
                        {
                            a.g.g();
                            com.pandora.android.eureka.a.a(a, f1);
                            return;
                        }
                    }
                    return;
                } else
                {
                    com.pandora.android.eureka.a.a("Cast device selected - but no connection");
                    return;
                }
            }

            public void e(g g1, android.support.v7.media.g.f f1)
            {
                com.pandora.android.eureka.a.a((new StringBuilder()).append("onRouteUnselected: ").append(f1.b()).toString());
                if (a.g.E())
                {
                    f1.n();
                }
                if (com.pandora.android.eureka.a.e(a).d().o())
                {
                    g1 = "play";
                } else
                {
                    g1 = "pause";
                }
                com.pandora.android.eureka.a.e(a).o().a(com.pandora.radio.util.k.g.b, g1, null);
            }

            
            {
                a = com.pandora.android.eureka.a.this;
                super();
            }
        };
    }

    private void p()
    {
        b("deselectCastRoute");
        if (f == null)
        {
            a();
        }
        if (f.b() != null && !f.b().f())
        {
            f.b().n();
        }
    }

    private void q()
    {
        b("closeCast");
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable() {

                final com.pandora.android.eureka.a a;

                public void run()
                {
                    com.pandora.android.eureka.a.h(a);
                }

            
            {
                a = com.pandora.android.eureka.a.this;
                super();
            }
            });
            return;
        }
        if (g != null && (g.E() || g.F()))
        {
            g.T();
            return;
        } else
        {
            p();
            return;
        }
    }

    private void r()
    {
        b("openSession");
        if (h.d() == null || h.d().t() == null && (g == null || !g.V()))
        {
            g();
            p();
            com.pandora.android.util.s.e("Please select a station before casting.");
            return;
        }
        if (h.d() != null && h.d().t() != null && h.d().t().A())
        {
            g();
            p();
            com.pandora.android.util.s.e(j.getResources().getString(0x7f08024c));
            return;
        }
        if (h.d().s() != null && h.d().s().M())
        {
            g();
            p();
            com.pandora.android.util.s.e("Sorry, you cannot cast while an audio ad is playing.");
            return;
        }
        if (z.a().b())
        {
            d();
            return;
        } else
        {
            s();
            return;
        }
    }

    private void s()
    {
        String s1 = h.l().f();
        if (s1 == null)
        {
            (new a()).execute(new Object[0]);
        }
        if (s1 == null)
        {
            b("Cannot continue because deviceId is null");
            return;
        } else
        {
            g.S();
            return;
        }
    }

    private void t()
    {
        Object obj = b.a.b().j();
        if (a(((o) (obj)).z(), 0xdbba00L))
        {
            ((o) (obj)).a(System.currentTimeMillis());
            com.pandora.android.util.af.c c1 = af.a().b();
            obj = b.a.b();
            k k1 = ((c) (obj)).o();
            com.pandora.radio.util.k.g g1 = com.pandora.radio.util.k.g.c;
            if (((c) (obj)).d().o())
            {
                obj = "play";
            } else
            {
                obj = "pause";
            }
            k1.a(g1, ((String) (obj)), c1.toString());
        }
    }

    public void a()
    {
        if (f == null && l())
        {
            b("setupMediaRouter");
            f = c();
            android.support.v7.media.f.a a1 = new android.support.v7.media.f.a();
            a1.a(CastMediaControlIntent.categoryForCast(com.pandora.android.data.d.h));
            k = a1.a();
            m = o();
            m();
            l = new e();
            f.a(com.pandora.android.eureka.dialog.f.a(j));
        }
    }

    public void a(MediaRouteButton mediaroutebutton)
    {
        if (l())
        {
            a();
            b("setupRouteButton");
            n = mediaroutebutton.getContext();
            mediaroutebutton.setDialogFactory(l);
            mediaroutebutton.setRouteSelector(k);
            mediaroutebutton.setEnabled(true);
            return;
        } else
        {
            mediaroutebutton.setVisibility(8);
            return;
        }
    }

    public boolean a(y y1)
    {
        return !i() || y1 == null || !y1.A();
    }

    public void b()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_ok_dialog");
        pandoraintent.putExtra("intent_message", j.getString(0x7f08024c));
        b.a.C().a(pandoraintent);
    }

    protected g c()
    {
        return android.support.v7.media.g.a(j);
    }

    protected void d()
    {
        Object obj = n;
        String s1 = ((Context) (obj)).getResources().getString(0x7f0800c4);
        String s2 = ((Context) (obj)).getResources().getString(0x7f0801f5);
        String s3 = ((Context) (obj)).getResources().getString(0x7f0800c3);
        obj = new android.app.AlertDialog.Builder(((Context) (obj)));
        ((android.app.AlertDialog.Builder) (obj)).setMessage(s1).setCancelable(true).setPositiveButton(s2, new android.content.DialogInterface.OnClickListener() {

            final com.pandora.android.eureka.a a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                z.a().c();
                com.pandora.android.eureka.a.b(a);
            }

            
            {
                a = com.pandora.android.eureka.a.this;
                super();
            }
        }).setNegativeButton(s3, new android.content.DialogInterface.OnClickListener() {

            final com.pandora.android.eureka.a a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                com.pandora.android.eureka.a.a(a);
            }

            
            {
                a = com.pandora.android.eureka.a.this;
                super();
            }
        });
        ((android.app.AlertDialog.Builder) (obj)).create().show();
    }

    public void e()
    {
        n = null;
    }

    public void f()
    {
        if (!l())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        b("user triggered disconnected?");
        g.d(true);
        q();
        return;
        Exception exception;
        exception;
        b((new StringBuilder()).append("Error while disconnecting: ").append(exception).toString());
        return;
    }

    public void g()
    {
        g.d(false);
    }

    public p.dd.k getCastingState()
    {
        return new p.dd.k(i());
    }

    public boolean h()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (g != null)
        {
            p.by.e e1 = g.Q();
            flag = flag1;
            if (e1 != null)
            {
                flag = flag1;
                if (e1.c() != null)
                {
                    flag = flag1;
                    if (!e1.c().isEmpty())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public boolean i()
    {
        if (g != null)
        {
            return g.E();
        } else
        {
            return false;
        }
    }

    public String j()
    {
        if (g != null)
        {
            return g.R();
        } else
        {
            return null;
        }
    }

    public p.dg.a k()
    {
        return g;
    }

    protected boolean l()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (j != null)
        {
            flag = flag1;
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(j) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void onAlternatePlayerDisconnected(p.dd.b b1)
    {
        p();
    }

    public void onCastingStateChanged(p.dd.k k1)
    {
        b("onCastingStateChanged");
        if (!k1.a && g != null && h != null)
        {
            boolean flag;
            boolean flag1;
            if (o.equals(p.cx.e.a.b) && !p)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = g.Q().f();
            h.a(new p.dd.b(g.t(), g.s(), flag, flag1, new com.pandora.android.data.c(true)));
            p = false;
        }
    }

    public void onChromecastConnectedAppEvent(p.bz.f f1)
    {
        if (f1.a)
        {
            b.a.b().k().e(false);
        }
    }

    public void onCoachmarkShownAppEvent(p.bz.g g1)
    {
        if (g1.a == p.bz.g.a.b && g1.c != null)
        {
            com.pandora.android.coachmark.e.e e1 = g1.c.e();
            if (g1.b != com.pandora.android.coachmark.e.d.a && e1 == com.pandora.android.coachmark.e.e.r)
            {
                b.a.b().k().e(false);
            }
        }
    }

    public void onDeleteStation(p p1)
    {
        if (i())
        {
            y y1 = g.t();
            if (y1 != null && p1.a.equals(y1.c()))
            {
                p = true;
                h.a(new p.dd.ag(p.cw.b.a.e, y1));
                f();
            }
        }
    }

    public void onSignInStateEvent(an an1)
    {
label0:
        {
label1:
            {
                static class _cls7
                {

                    static final int a[];

                    static 
                    {
                        a = new int[p.cx.e.a.values().length];
                        try
                        {
                            a[p.cx.e.a.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[p.cx.e.a.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[p.cx.e.a.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[p.cx.e.a.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (l())
                {
                    switch (_cls7.a[an1.b.ordinal()])
                    {
                    default:
                        throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

                    case 1: // '\001'
                        break;

                    case 3: // '\003'
                        break label1;

                    case 4: // '\004'
                        break label0;

                    case 2: // '\002'
                        if (f == null)
                        {
                            a();
                        } else
                        {
                            m();
                        }
                        o = p.cx.e.a.b;
                        break;
                    }
                }
                return;
            }
            o = p.cx.e.a.c;
            g.T();
            return;
        }
        h.l().a(null);
        n();
        o = p.cx.e.a.d;
        g.T();
    }

    public void onTrackStateEvent(bh bh1)
    {
        if (bh1.a != p.dd.bh.a.a && g != null && g.U())
        {
            g.d(true);
        }
    }

    public void onUserCreated(bn bn)
    {
        b.a.b().k().e(true);
    }

    public p.bz.e produceCastDeviceListChangedAppEvent()
    {
        g g1 = f;
        if (g1 != null)
        {
            t();
            return new p.bz.e(g1.a().size());
        } else
        {
            return new p.bz.e(0);
        }
    }
}
