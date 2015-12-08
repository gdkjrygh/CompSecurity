// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import aa;
import ah;
import am;
import android.app.Activity;
import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.google.common.base.Optional;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.arsenal.ArsenalActivity;
import com.spotify.mobile.android.arsenal.FeedbackMode;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.DeviceIdentifierLoggerIntentService;
import com.spotify.mobile.android.service.LoginActivity;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.BannerAdActivity;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.openaccess.OpenAccessActivity;
import com.spotify.mobile.android.spotlets.search.SearchFragment;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.ActionBarTitle;
import com.spotify.mobile.android.ui.activity.MainActivityIntentQueue;
import com.spotify.mobile.android.ui.activity.NotificationWebViewActivity;
import com.spotify.mobile.android.ui.activity.ShowcaseActivity;
import com.spotify.mobile.android.ui.activity.ShowcaseConcertsActivity;
import com.spotify.mobile.android.ui.activity.UpdateActivity;
import com.spotify.mobile.android.ui.activity.UpdateNagActivity;
import com.spotify.mobile.android.ui.activity.dialog.PremiumUpsellInterstitialActivity;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDataStoreControlService;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.UpsellService;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.PremiumInAppDestinationActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.tracking.TrackingService;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.tracking.Tracking;
import ctz;
import cvp;
import de;
import dkb;
import dmz;
import dod;
import dun;
import dvv;
import dvw;
import dwh;
import dwk;
import dyc;
import dzj;
import dzo;
import eda;
import edb;
import edc;
import edd;
import edk;
import edv;
import edw;
import eez;
import efa;
import efb;
import etd;
import eti;
import etn;
import evm;
import ffp;
import fje;
import fkn;
import fny;
import foa;
import fob;
import fod;
import foe;
import fog;
import foh;
import fok;
import fol;
import fop;
import fos;
import fot;
import fow;
import fpe;
import fpi;
import frb;
import fuc;
import fxw;
import fxy;
import fya;
import fyj;
import fys;
import fyw;
import gbi;
import gbj;
import gbl;
import gcb;
import gce;
import gci;
import gcl;
import gcn;
import gco;
import gcq;
import gcr;
import gcz;
import gdn;
import gex;
import gfi;
import gfr;
import gfv;
import gfz;
import ggh;
import ggi;
import ghc;
import ghd;
import gho;
import ghr;
import gix;
import gmo;
import gmp;
import gms;
import gps;
import hew;
import hff;
import hfg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import pa;
import qp;
import rx;

public class MainActivity extends rx
    implements eda, edc, fpe, fuc
{

    private static final String j = com/spotify/music/MainActivity.getName();
    private static final String k = (new StringBuilder()).append(j).append(".sessionloaded").toString();
    private static final String l = (new StringBuilder()).append(j).append(".flagsloaded").toString();
    private static final String m = (new StringBuilder()).append(j).append(".sessionstate").toString();
    private fot A;
    private gdn B;
    private gcn C;
    private ggh D;
    private final fos E = (fos)dmz.a(fos);
    private final ghc F = (ghc)dmz.a(ghc);
    private dwh G;
    private MainActivityIntentQueue H;
    private boolean I;
    private boolean J;
    private gbj K;
    private fje L;
    private SessionState M;
    private IntentFilter N;
    private final dwk O = new dwk() {

        private MainActivity a;

        public final volatile void a(Object obj)
        {
            MainActivity.a(a).e = true;
        }

        public final void b()
        {
            MainActivity.a(a).e = false;
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    private ServiceConnection P;
    private boolean Q;
    private View R;
    private hfg S;
    private eda T;
    private final efa U = new efa() {

        private MainActivity a;

        public final void a(Ad ad)
        {
            MainActivity.h(a).a(ad);
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    private final BroadcastReceiver V = new BroadcastReceiver() {

        private MainActivity a;

        public final void onReceive(Context context, Intent intent)
        {
            a.startActivity((new Intent(a, com/spotify/mobile/android/ui/activity/UpdateActivity)).setData(intent.getData()));
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    private final BroadcastReceiver W = new BroadcastReceiver() {

        private MainActivity a;

        public final void onReceive(Context context, Intent intent)
        {
            MainActivity.i(a);
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    private final BroadcastReceiver X = new BroadcastReceiver() {

        public final void onReceive(Context context, Intent intent)
        {
            CollectionService.a(context, intent);
        }

    };
    private final BroadcastReceiver Y = new BroadcastReceiver() {

        private MainActivity a;

        public final void onReceive(Context context, Intent intent)
        {
            a.startService(dvv.a(a, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    private final pa Z = new pa() {

        private MainActivity a;

        public final void a(View view)
        {
            fny fny1 = MainActivity.j(a);
            if (fny1.a)
            {
                fny1.b.a(view);
            }
            MainActivity.k(a).b(1.0F);
            if (MainActivity.l(a) != null)
            {
                view = MainActivity.l(a);
                if (view.o())
                {
                    u u1 = view.k();
                    fop fop1 = ((fya) (view)).Y;
                    fop.a(u1, ViewUri.c, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.f));
                    if (evm.b(((fya) (view)).Z) && (((fya) (view)).b instanceof fkn))
                    {
                        ((fkn)((fya) (view)).b).a();
                    } else
                    {
                        ((fya) (view)).aa.a(((fya) (view)).ab);
                    }
                    if (!evm.b(((fya) (view)).Z) && (((fya) (view)).b instanceof fkn))
                    {
                        ((fkn)((fya) (view)).b).a();
                    }
                    ((InputMethodManager)u1.getSystemService("input_method")).hideSoftInputFromWindow(u1.getWindow().getDecorView().getWindowToken(), 0);
                    view.G().b(0x7f110068, null, ((fya) (view)).ac);
                }
            }
            MainActivity.a(a).b = true;
        }

        public final void a(View view, float f1)
        {
            fny fny1 = MainActivity.j(a);
            if (fny1.a)
            {
                fny1.b.a(view, f1);
            }
            MainActivity.k(a).b(f1);
        }

        public final void b(View view)
        {
            fny fny1 = MainActivity.j(a);
            if (fny1.a)
            {
                fny1.b.b(view);
            }
            MainActivity.k(a).b(0.0F);
            if (MainActivity.l(a) != null)
            {
                view = MainActivity.l(a);
                if (view.o())
                {
                    fop fop1 = ((fya) (view)).Y;
                    fop.a(view.k(), ViewUri.c, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
                }
            }
            MainActivity.a(a).b = false;
            if (MainActivity.b(a))
            {
                MainActivity.d(a);
            }
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    private final fol aa = new fol() {

        private MainActivity a;

        public final void a(Fragment fragment)
        {
            MainActivity.k(a).a(MainActivity.m(a).a());
            a.q_();
            fragment = a;
            ((InputMethodManager)fragment.getSystemService("input_method")).hideSoftInputFromWindow(fragment.getWindow().getDecorView().getWindowToken(), 0);
            MainActivity.g(a).post(MainActivity.n(a));
        }

            
            {
                a = MainActivity.this;
                super();
            }
    };
    fya d;
    public fog e;
    final gmp f = new gmp(this);
    Flags g;
    efb h;
    gmo i;
    private ActionBarManager n;
    private edb o;
    private edv p;
    private DrawerLayout q;
    private fny r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private gce z;

    public MainActivity()
    {
        dmz.a(fop);
        H = new MainActivityIntentQueue();
        L = new fje();
        M = new SessionState(null, null, false, false, false, false, -1, null, false, false, false, new PaymentState(null), null, null);
        N = a("android.intent.action.USER_PRESENT");
        P = UpsellService.a();
        T = new eda() {

            private MainActivity a;

            public final void a(SessionState sessionstate)
            {
                MainActivity.g(a).sendEmptyMessage(2);
                ((gcr)dmz.a(gcr)).a = sessionstate.b;
                new ghr();
                ghr.a(a, sessionstate.b);
                dmz.a(gfr);
                sessionstate = sessionstate.b;
            }

            
            {
                a = MainActivity.this;
                super();
            }
        };
    }

    private static IntentFilter a(String s1)
    {
        s1 = new IntentFilter(s1);
        s1.addCategory("android.intent.category.DEFAULT");
        return s1;
    }

    public static MainActivityIntentQueue a(MainActivity mainactivity)
    {
        return mainactivity.H;
    }

    private void a(Intent intent)
    {
_L7:
        if (j()) goto _L2; else goto _L1
_L1:
        Assertion.b("handleViewCommand called before flags or session is loaded.");
_L4:
        return;
_L2:
        SpotifyLink spotifylink = new SpotifyLink(intent.getDataString());
        if (spotifylink.f())
        {
            gho.a(this, spotifylink);
        }
        FeatureIdentifier featureidentifier;
        Object obj;
        Object obj1;
        boolean flag;
        if (spotifylink.a.getQueryParameter("utm_source") != null && spotifylink.a.getQueryParameter("utm_medium") != null && spotifylink.a.getQueryParameter("utm_campaign") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            String s1 = spotifylink.c();
            String s3 = spotifylink.d();
            Assertion.a(this);
            Assertion.a(s1);
            Assertion.a(s3);
            ClientEvent clientevent1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dD);
            clientevent1.a("referrer", s1);
            clientevent1.a("uri", s3);
            dmz.a(fop);
            fop.a(this, ViewUri.a, clientevent1);
        }
        obj = intent.getStringExtra("title");
        featureidentifier = FeatureIdentifier.T;
        obj1 = e.b();
        if (obj1 instanceof fxy)
        {
            obj1 = (fxy)obj1;
            featureidentifier = ((fxy) (obj1)).u_();
            Assertion.a(featureidentifier, (new StringBuilder()).append(((fxy) (obj1)).I()).append(" returned a null FeatureIdentifier").toString());
            Logger.a("Got internal referrer %s from %s", new Object[] {
                featureidentifier, ((fxy) (obj1)).I()
            });
        }
        obj = foe.a(spotifylink, intent, ((String) (obj)), M.i, M.d, M.b, g, featureidentifier);
        if (!ggi.a(obj, foe.a))
        {
            a(((fxy) (obj)), intent.getBooleanExtra("extra_clear_backstack", false), intent.getBooleanExtra("keep_current_fragment_active", false));
            return;
        }
        final class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aF.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aH.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ar.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.ay.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.m.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aP.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aU.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.L.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.a.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.u.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.n.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aq.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.O.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls6.a[spotifylink.c.ordinal()])
        {
        default:
            Logger.c("B0rken url is '%s'", new Object[] {
                intent.getDataString()
            });
            Assertion.b("If you end up here, SpotifyLink is b0rken.");
            return;

        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            break;

        case 1: // '\001'
            boolean flag1 = intent.getBooleanExtra("force_navigation_key", false);
            if (gex.a(g) && !flag1)
            {
                fos.a(this, ViewUri.b, FeatureIdentifier.Y, featureidentifier, com.spotify.mobile.android.provider.Metadata.Track.a(spotifylink.d()), g);
                fos.a(this, null);
                return;
            }
            if (C != null)
            {
                C.a();
            }
            int i1;
            if (flag1)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            C = new gcn(this, spotifylink, i1, new gco() {

                private MainActivity a;

                public final void a()
                {
                    MainActivity.o(a);
                }

                public final void a(String s4)
                {
                    a.startActivity(gms.a(a, s4).a);
                }

            
            {
                a = MainActivity.this;
                super();
            }
            });
            intent = C;
            ((gcn) (intent)).c.a(com.spotify.mobile.android.provider.Metadata.Track.a(((gcn) (intent)).b.d()), gcn.a);
            return;

        case 2: // '\002'
            intent = spotifylink.d();
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = intent.replace("radio:", "");
            }
            fos.a(this, intent, ViewUri.h);
            fos.a(this, null);
            return;

        case 3: // '\003'
            fos.a(this, null);
            return;

        case 4: // '\004'
            String s2 = spotifylink.c(":");
            if ("spotify.internal_crash".equals(s2))
            {
                startService(dvv.a(this, "com.spotify.mobile.android.service.action.CRASH_SERVICE"));
                return;
            } else
            {
                a(s2, false, intent.getBooleanExtra("start_radio", false), intent.getBooleanExtra("close_search_on_click", false));
                return;
            }

        case 5: // '\005'
            fop.a(this, null, ViewUri.b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, null, g);
            return;

        case 6: // '\006'
            intent = g;
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.U);
            fop.a(this, ViewUri.b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            startActivity(NotificationWebViewActivity.a(this, spotifylink, intent));
            return;

        case 7: // '\007'
            fos.b(this, spotifylink.d());
            return;

        case 8: // '\b'
            dmz.a(frb);
            frb.a(g, Reason.j, null, null).a(this);
            return;

        case 9: // '\t'
            startActivity(PremiumUpsellInterstitialActivity.a(this, g));
            return;

        case 13: // '\r'
            intent = intent.getData();
            ((gcb)dmz.a(gcb)).a(intent);
            return;

        case 14: // '\016'
            startActivity(PremiumInAppDestinationActivity.a(this, g));
            return;

        case 15: // '\017'
            intent = intent.getData();
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (intent != null && intent.toString().startsWith("https://www.spotify.com/redirect/get-premium/"))
        {
            fop.a(this, intent, ViewUri.b, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, null, g);
        }
        if (v) goto _L4; else goto _L5
_L5:
        intent = gms.a(this).a;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(Intent intent, boolean flag)
    {
        a(intent.getStringExtra("query"), flag, intent.getBooleanExtra("start_radio", false), intent.getBooleanExtra("close_search_on_click", false));
    }

    private void a(fxy fxy1, boolean flag, boolean flag1)
    {
        fog fog1 = e;
        Fragment fragment = fxy1.F();
        fxy1 = fxy1.a(this, g);
        fxy1 = new ActionBarTitle(fog1.d, fxy1);
        ah ah1 = fog1.a.a();
        if (flag)
        {
            for (Iterator iterator = fog1.c.iterator(); iterator.hasNext(); ((fok)iterator.next()).c(ah1)) { }
            fog1.c.clear();
            fog1.a.e();
        }
        fog1.c.add(new foh(fog1, ah1, fragment, fxy1));
        fog1.a(ah1, flag1);
        ah1.c();
        fog1.a.b();
        fog1.d();
    }

    private void a(String s1, boolean flag, boolean flag1, boolean flag2)
    {
        a(((fxy) (ffp.a(s1, flag, flag1, flag2, M.b, g))), false, false);
    }

    public static boolean b(MainActivity mainactivity)
    {
        return mainactivity.w;
    }

    public static void c(MainActivity mainactivity)
    {
        if (mainactivity.s)
        {
            if (mainactivity.v)
            {
                mainactivity.m();
                mainactivity.setVisible(true);
            }
            return;
        }
        mainactivity.s = true;
        mainactivity.o.a(mainactivity.T);
        Object obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.e, com.spotify.mobile.android.util.ClientEvent.SubEvent.b);
        ((ClientEvent) (obj)).a("value", String.valueOf((new dvw(mainactivity.getApplication())).c()));
        fop.a(mainactivity.getApplication(), ViewUri.H, ((ClientEvent) (obj)));
        double d1 = ((gcz)dmz.a(gcz)).d();
        boolean flag = ggi.c(mainactivity);
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.X, com.spotify.mobile.android.util.ClientEvent.SubEvent.a);
        clientevent.a("screen_size", String.format(Locale.US, "%.2f", new Object[] {
            Double.valueOf(d1)
        }));
        if (flag)
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        clientevent.a("layout_as_tablet", ((String) (obj)));
        fop.a(mainactivity.getApplicationContext(), ViewUri.b, clientevent);
        mainactivity.startService(DeviceIdentifierLoggerIntentService.a(mainactivity));
        Logger.a("UpdateNag: Calling from onCreate showIfNeeded", new Object[0]);
        UpdateNagActivity.a(mainactivity);
    }

    public static void d(MainActivity mainactivity)
    {
        mainactivity.l();
    }

    public static void e(MainActivity mainactivity)
    {
        if (!mainactivity.x)
        {
            mainactivity.x = true;
            fxw.a(mainactivity.a_(), mainactivity.g, com/spotify/music/MainActivity);
            mainactivity.z = new gce(mainactivity);
            mainactivity.z.execute(new Void[0]);
        }
        if (mainactivity.v)
        {
            mainactivity.m();
            mainactivity.setVisible(true);
        } else
        {
            mainactivity.t = true;
            mainactivity.o();
            mainactivity.H.c = mainactivity.j();
            if (mainactivity.j())
            {
                mainactivity.k();
                return;
            }
        }
    }

    public static void f(MainActivity mainactivity)
    {
        if (mainactivity.v)
        {
            mainactivity.m();
            mainactivity.setVisible(true);
        } else
        {
            mainactivity.u = true;
            mainactivity.H.c = mainactivity.j();
            if (mainactivity.j())
            {
                mainactivity.k();
                return;
            }
        }
    }

    static gmp g(MainActivity mainactivity)
    {
        return mainactivity.f;
    }

    static efb h(MainActivity mainactivity)
    {
        return mainactivity.h;
    }

    static void i(MainActivity mainactivity)
    {
        fos.a(mainactivity, null);
    }

    static fny j(MainActivity mainactivity)
    {
        return mainactivity.r;
    }

    private boolean j()
    {
        return t && u;
    }

    static ActionBarManager k(MainActivity mainactivity)
    {
        return mainactivity.n;
    }

    private void k()
    {
        if (!((Boolean)g.a(fys.P)).booleanValue() || Q) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = new gix(this);
        obj = g;
        obj1 = (Context)((gix) (obj2)).a.get();
        if (!"Enabled".equals(((Flags) (obj)).a(fys.aH))) goto _L4; else goto _L3
_L3:
        if (!ShowcaseConcertsActivity.a(((Context) (obj1)))) goto _L6; else goto _L5
_L5:
        obj2 = new Intent(((Context) (obj1)), com/spotify/mobile/android/ui/activity/ShowcaseConcertsActivity);
        fyw.a(((Intent) (obj2)), ((Flags) (obj)));
        ((Context) (obj1)).startActivity(((Intent) (obj2)));
_L2:
        Assertion.a(j(), "tried to load UI fragments before ready");
        d = fya.b(g);
        q.a(Z);
        a_().a().a(0x7f11040b, d, "tag_navigation_fragment").c();
        obj = K;
        obj1 = g;
        obj2 = new fyj();
        ((gbj) (obj)).a.a(((Fragment) (obj2)));
        obj2.a = ((gbj) (obj)).a;
        obj1 = eti.a(((Flags) (obj1)));
        ((gbj) (obj)).b.a(((Fragment) (obj1)));
        obj1.a = ((gbj) (obj)).b;
        onNewIntent(getIntent());
        if (H.a())
        {
            l();
        }
        m();
        setVisible(true);
        q_();
        H.d = true;
        v = true;
        return;
_L4:
        ShowcaseConcertsActivity.a(((Context) (obj1)), false);
_L6:
        if (((gix) (obj2)).a(((Flags) (obj))).isEmpty())
        {
            dmz.a(frb);
            frb.a(((Flags) (obj)), Reason.l, null, null).a(((Context) (obj1)));
            DynamicUpsellDataStoreControlService.a(de.a(((Context) (obj1))), com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup.b);
        } else
        {
            Intent intent = new Intent(((Context) (obj1)), com/spotify/mobile/android/ui/activity/ShowcaseActivity);
            fyw.a(intent, ((Flags) (obj)));
            ((Context) (obj1)).startActivity(intent);
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    static fya l(MainActivity mainactivity)
    {
        return mainactivity.d;
    }

    private void l()
    {
        boolean flag1 = false;
        if (H.a())
        {
            MainActivityIntentQueue mainactivityintentqueue = H;
            fow fow1 = new fow() {

                private MainActivity a;

                public final void a(Intent intent)
                {
                    a.onNewIntent(intent);
                }

            
            {
                a = MainActivity.this;
                super();
            }
            };
            Assertion.a(fow1, "Must supply a dispatcher");
            Assertion.a(mainactivityintentqueue.a(), "must have queued intent");
            boolean flag;
            if (mainactivityintentqueue.b)
            {
                flag = flag1;
            } else
            {
                flag = flag1;
                if (mainactivityintentqueue.e)
                {
                    if ((!mainactivityintentqueue.c || mainactivityintentqueue.a) && !mainactivityintentqueue.d)
                    {
                        boolean flag2 = mainactivityintentqueue.a;
                        flag2 = mainactivityintentqueue.c;
                        flag2 = mainactivityintentqueue.d;
                        flag = flag1;
                    } else
                    {
                        flag = true;
                    }
                }
            }
            if (flag)
            {
                for (Iterator iterator = mainactivityintentqueue.f.iterator(); iterator.hasNext(); fow1.a((Intent)iterator.next())) { }
                mainactivityintentqueue.f.clear();
                return;
            }
        }
    }

    static fog m(MainActivity mainactivity)
    {
        return mainactivity.e;
    }

    private void m()
    {
        if (D != null)
        {
            double d1 = (double)D.a() / 1000D;
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.W);
            clientevent.a("time-taken", String.valueOf(d1));
            clientevent.a("android_application_id", getPackageName());
            dmz.a(fop);
            fop.a(this, ViewUri.a, clientevent);
            D = null;
        }
    }

    static gmo n(MainActivity mainactivity)
    {
        return mainactivity.i;
    }

    static gcn o(MainActivity mainactivity)
    {
        mainactivity.C = null;
        return null;
    }

    private void o()
    {
        if (y && t && ((Boolean)g.a(fys.aa)).booleanValue() && e != null && p == null)
        {
            dmz.a(edw);
            p = edw.a();
            e.a(p);
        }
    }

    protected final void O_()
    {
        super.O_();
        w = true;
        if (H.a())
        {
            l();
        }
    }

    public final void P_()
    {
        q_();
    }

    public final boolean Q_()
    {
        eti eti1 = (eti)a_().a(0x7f110495);
        return eti1 != null && eti1.a.b();
    }

    public final fog R_()
    {
        return e;
    }

    public final void a(Fragment fragment, ActionBarTitle actionbartitle)
    {
        fog fog1 = e;
        Iterator iterator = fog1.c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (fok)iterator.next();
            if (((fok) (obj)).a() != 2)
            {
                continue;
            }
            obj = ((fok) (obj)).b(null);
            if (((foh) (obj)).a != fragment)
            {
                continue;
            }
            obj.d = actionbartitle;
            break;
        } while (true);
        n.a(fog1.a());
    }

    public final void a(Fragment fragment, String s1)
    {
        a(fragment, new ActionBarTitle(this, s1));
    }

    public final void a(SessionState sessionstate)
    {
        boolean flag = true;
        if (sessionstate != null && !isFinishing()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        M = sessionstate;
        if (sessionstate.f)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!sessionstate.e || sessionstate.g)
        {
            break; /* Loop/switch isn't completed */
        }
        L.a = sessionstate.h;
        f.sendEmptyMessage(0);
        if (d != null)
        {
            d.a(sessionstate);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        sessionstate = getIntent();
        if (s)
        {
            sessionstate = gms.a(this).a;
        }
        sessionstate.putExtra("extra_manual_login", true);
        m();
        TrackingService.a(this, "TYPE_COLD_START_CANCEL", null, new Bundle());
        obj = sessionstate.getAction();
        if (!"android.intent.action.VIEW".equals(obj) && !"android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(obj)) goto _L5; else goto _L4
_L4:
        obj = sessionstate.getDataString();
        if (!SpotifyLink.b(((String) (obj)))) goto _L5; else goto _L6
_L6:
        obj = new SpotifyLink(((String) (obj)));
        exu._cls1.a[((SpotifyLink) (obj)).c.ordinal()];
        JVM INSTR tableswitch 1 4: default 212
    //                   1 214
    //                   2 214
    //                   3 214
    //                   4 214;
           goto _L5 _L7 _L7 _L7 _L7
_L5:
        flag = false;
_L7:
        if (flag)
        {
            startActivity(OpenAccessActivity.a(this, sessionstate));
        } else
        {
            startActivity(LoginActivity.a(this, sessionstate));
        }
        finish();
        return;
    }

    public final void a(fot fot1)
    {
        A = fot1;
    }

    public final edb c()
    {
        return o;
    }

    public final Context e()
    {
        return this;
    }

    public final boolean g()
    {
        return q.c(3);
    }

    public final void h()
    {
        q.b(3);
    }

    final void i()
    {
        if (g == null)
        {
            return;
        }
        Object obj = (Boolean)g.a(fys.y);
        Object obj1 = (MainLayout)ctz.a(findViewById(0x7f11032d));
        ((MainLayout) (obj1)).a(null);
        if (R.getParent() != null)
        {
            ((ViewGroup)R.getParent()).removeView(R);
        }
        boolean flag;
        if (((Boolean) (obj)).booleanValue())
        {
            ((MainLayout) (obj1)).a(R);
        } else
        {
            ((ViewGroup)findViewById(0x1020002)).addView(R, new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
        obj1 = (Toolbar)findViewById(0x7f110400);
        findViewById(0x7f1103ff).setVisibility(0);
        ((Toolbar) (obj1)).setVisibility(0);
        a(((Toolbar) (obj1)));
        obj1 = n;
        if (!((Boolean) (obj)).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = new foa(((ActionBarManager) (obj1)));
        } else
        {
            obj = new fob(((ActionBarManager) (obj1)));
        }
        obj1.j = ((fnz) (obj));
        n.a();
    }

    public final boolean n()
    {
        return w;
    }

    public void onBackPressed()
    {
        if (g())
        {
            h();
        } else
        if ((A == null || !A.C_()) && !e.c())
        {
            finish();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        configuration = r;
        if (((fny) (configuration)).a)
        {
            ((fny) (configuration)).b.b();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        MethodTraceScope.f.a();
        FontSupport.a(this);
        dmz.a(gfz);
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.setExtrasClassLoader(getClassLoader());
        if (fpi.a(this, intent))
        {
            I = false;
            finish();
            return;
        }
        dmz.a(edd);
        o = edd.a(getApplicationContext());
        o.a(O);
        gfv.a(this);
        if (bundle == null && "android.intent.action.MAIN".equals(intent.getAction()))
        {
            D = new ggh();
            dyc.b(this);
            long l1 = System.currentTimeMillis();
            Bundle bundle1 = new Bundle();
            bundle1.putLong("ARG_TIMESTAMP", l1);
            TrackingService.a(this, "TYPE_COLD_START", null, bundle1);
        }
        setVisible(false);
        setContentView(0x7f0300d6);
        Object obj = (MainLayout)ctz.a(findViewById(0x7f11032d));
        e = new fog(this, a_(), ((ViewGroup) (obj)));
        i = new gmo(this, e, g);
        R = LayoutInflater.from(this).inflate(0x7f0300cb, ((ViewGroup) (obj)), false);
        ((MainLayout) (obj)).a(R);
        new fod();
        n = new ActionBarManager(this);
        q = (DrawerLayout)cvp.a(findViewById(0x7f110407));
        r = new fny(this, q);
        new foe();
        obj = ((MainLayout) (obj)).a;
        K = new gbj(this, ((SnackBar) (obj)));
        h = new efb(this);
        h.a = g;
        B = new gdn(e);
        ((gcq)dmz.a(gcq)).a(B);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            u = bundle.getBoolean(k);
            t = bundle.getBoolean(l);
            s = bundle.getBoolean("login_handled", false);
            v = bundle.getBoolean("ui_fragments_loaded", false);
            x = bundle.getBoolean("dialog_handler_added", false);
            g = fyw.a(bundle);
            M = (SessionState)bundle.getParcelable(m);
            d = (fya)a_().a("tag_navigation_fragment");
            q.a(Z);
            o.a(T);
            if (bundle.containsKey("navigation_state"))
            {
                e.a(bundle.getBundle("navigation_state"));
            }
            if (bundle.containsKey("intent_queue"))
            {
                H = (MainActivityIntentQueue)bundle.getParcelable("intent_queue");
            }
        }
        registerReceiver(W, a("com.spotify.mobile.android.service.broadcast.session.SHOW_PLAYER"));
        registerReceiver(L, a("com.spotify.mobile.android.service.broadcast.session.SOCIAL_ERROR"));
        Object obj1 = a("com.spotify.mobile.android.service.broadcast.session.UPDATE_AVAILABLE");
        ((IntentFilter) (obj1)).addDataScheme("http");
        registerReceiver(V, ((IntentFilter) (obj1)));
        obj1 = F;
        ghd ghd = new ghd() {

            private MainActivity a;

            public final Uri a()
            {
                Fragment fragment = a.e.b();
                if (!(fragment instanceof dod))
                {
                    return null;
                } else
                {
                    return ((dod)fragment).a();
                }
            }

            
            {
                a = MainActivity.this;
                super();
            }
        };
        if (((ghc) (obj1)).a != null)
        {
            ((ghc) (obj1)).a.setNdefPushMessageCallback(new ghc._cls1(ghd, this), this, new Activity[0]);
        }
        e.a(aa);
        setVolumeControlStream(3);
        G = new dwh(getApplicationContext());
        i();
        ((SnackBar) (obj)).bringToFront();
        new dun(this);
        I = true;
        obj = dkb.a(this);
        if (intent.getBooleanExtra("just_logged_in", false))
        {
            if (((dkb) (obj)).a() && bundle == null)
            {
                ArsenalActivity.a(this, FeedbackMode.b);
                Q = true;
            }
            intent.putExtra("just_logged_in", false);
        }
        MethodTraceScope.f.b();
    }

    protected void onDestroy()
    {
        if (I)
        {
            ((gcq)dmz.a(gcq)).b(B);
            unregisterReceiver(W);
            unregisterReceiver(V);
            unregisterReceiver(L);
            if (o != null)
            {
                o.b(O);
                o.b();
                o = null;
            }
            G = null;
        }
        f.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 82 && gcl.d && "LGE".equals(Build.MANUFACTURER))
        {
            openOptionsMenu();
        } else
        if (!gci.a(G, keyevent, this) && !super.onKeyDown(i1, keyevent))
        {
            return false;
        }
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        intent.setExtrasClassLoader(getClassLoader());
        setIntent(intent);
        obj = H;
        boolean flag;
        if (((MainActivityIntentQueue) (obj)).b && "android.intent.action.VIEW".equals(intent.getAction()))
        {
            ((MainActivityIntentQueue) (obj)).a(intent);
            flag = true;
        } else
        if (((MainActivityIntentQueue) (obj)).a)
        {
            ((MainActivityIntentQueue) (obj)).a(intent);
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            h();
            return;
        }
        ((gps)dmz.a(gps)).a(intent);
        obj = intent.getAction();
        if ("com.facebook.application.174829003346".equals(obj))
        {
            intent.setAction("android.intent.action.VIEW");
        }
        if ("android.intent.action.SEARCH".equals(obj))
        {
            a(intent, false);
            return;
        }
        if (!"android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(obj))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        if (!SpotifyLink.b(intent.getDataString())) goto _L4; else goto _L3
_L3:
        obj = new SpotifyLink(intent.getDataString());
        com.spotify.mobile.android.util.SpotifyLink._cls1.a[((SpotifyLink) (obj)).c.ordinal()];
        JVM INSTR tableswitch 1 9: default 228
    //                   1 248
    //                   2 228
    //                   3 260
    //                   4 228
    //                   5 272
    //                   6 228
    //                   7 228
    //                   8 228
    //                   9 284;
           goto _L5 _L6 _L5 _L7 _L5 _L8 _L5 _L5 _L5 _L9
_L5:
        obj = ((SpotifyLink) (obj)).d();
_L10:
        intent.setData(Uri.parse(((String) (obj))));
        a(intent);
        return;
_L6:
        obj = ((SpotifyLink) (obj)).a(2, "play");
        continue; /* Loop/switch isn't completed */
_L7:
        obj = ((SpotifyLink) (obj)).a(2, "play");
        continue; /* Loop/switch isn't completed */
_L8:
        obj = ((SpotifyLink) (obj)).a(4, "play");
        continue; /* Loop/switch isn't completed */
_L9:
        obj = ((SpotifyLink) (obj)).a(2, "play");
        if (true) goto _L10; else goto _L4
_L4:
        a(intent, true);
        return;
        if ("android.intent.action.VIEW".equals(obj))
        {
            a(intent);
            return;
        }
        if (!"com.spotify.mobile.android.ui.action.view.CLOSE".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = (String)ctz.a(intent.getStringExtra("fragment_key"));
        obj = e.b();
        if ((obj instanceof fxy) && intent.equals(((fxy)obj).I()))
        {
            e.c();
            return;
        }
        if (true) goto _L1; else goto _L11
_L11:
        if ("android.nfc.action.NDEF_DISCOVERED".equals(obj))
        {
            a(intent);
            return;
        }
        if ("com.spotify.mobile.android.ui.action.ads.screensaver.SHOW".equals(obj))
        {
            intent = (Ad)intent.getExtras().getParcelable("screensaver_ad");
            h.a(intent);
            return;
        }
        if ("com.spotify.mobile.android.ui.action.player.SHOW".equals(obj))
        {
            boolean flag1;
            if (e.b() != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                a(gms.a(this).a);
            }
            fos.a(this, null);
            return;
        }
        if (!v)
        {
            a(gms.a(this).a);
            return;
        }
        if (true) goto _L1; else goto _L12
_L12:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        fny fny1 = r;
        boolean flag;
        if (fny1.a)
        {
            flag = fny1.b.a(menuitem);
        } else
        {
            if (fny1.c.c(0x800003))
            {
                fny1.c.b(0x800003);
            } else
            {
                fny1.c.a();
            }
            flag = true;
        }
        return flag || super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        super.onPause();
        try
        {
            BannerAdActivity.b(this);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logger.b(illegalargumentexception, "Unable to deregister broadcastreceiver", new Object[0]);
        }
        H.a = true;
        if (z != null)
        {
            z.cancel(false);
        }
        if (C != null)
        {
            C.a();
            C = null;
        }
        h.a("navigated_away");
        ((eez)dmz.a(eez)).g = null;
        ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).c();
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        bundle = r;
        if (((fny) (bundle)).a)
        {
            ((fny) (bundle)).b.a();
        }
        bundle = e.a();
        if (!TextUtils.isEmpty(bundle))
        {
            n.a(bundle);
        }
        bundle = n;
        bundle.g = new ActionBarTitle(this, getString(0x7f08061c), true);
        bundle.b();
    }

    public boolean onPreparePanel(int i1, View view, Menu menu)
    {
        if (n.f)
        {
            return false;
        } else
        {
            return super.onPreparePanel(i1, view, menu);
        }
    }

    protected void onResume()
    {
        super.onResume();
        BannerAdActivity.a(this);
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        if (q != null && q.c(3))
        {
            n.b(1.0F);
        }
        ((eez)dmz.a(eez)).g = U;
        H.a = false;
        ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).b();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable(m, M);
        bundle.putBoolean(l, t);
        bundle.putBoolean(k, u);
        bundle.putBoolean("login_handled", s);
        bundle.putBoolean("ui_fragments_loaded", v);
        bundle.putBoolean("dialog_handler_added", x);
        bundle.putBundle("navigation_state", e.e());
        bundle.putParcelable("intent_queue", H);
        bundle.putParcelable("FlagsArgumentHelper.Flags", g);
        w = false;
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested()
    {
        if (!(e.b() instanceof SearchFragment))
        {
            startActivity(gms.a(this, ViewUri.T.toString()).a);
        }
        return false;
    }

    protected void onStart()
    {
        super.onStart();
        y = true;
        w = true;
        UpsellService.a(this, P);
        G.a();
        o.a();
        o.a(this);
        if (s)
        {
            o.a(T);
            f.post(i);
        }
        hew hew1 = ((dun)dmz.a(dun)).a;
        S = hew.a(new hff() {

            private MainActivity a;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
                Assertion.a("Failed loading feature flags", new Exception(throwable));
            }

            public final void onNext(Object obj)
            {
                Object obj1 = (Flags)obj;
                obj = a;
                MethodTraceScope.e.a();
                obj.g = ((Flags) (obj1));
                ((MainActivity) (obj)).i.a = ((MainActivity) (obj)).g;
                ((MainActivity) (obj)).i();
                ((MainActivity) (obj)).h.a = ((MainActivity) (obj)).g;
                ((MainActivity) (obj)).f.sendEmptyMessage(1);
                if (((MainActivity) (obj)).d != null)
                {
                    ((MainActivity) (obj)).d.a(((MainActivity) (obj)).g);
                }
                obj1 = (gps)dmz.a(gps);
                obj1.b = Optional.b(((MainActivity) (obj)).g);
                if (!((gps) (obj1)).a.isEmpty())
                {
                    Intent intent;
                    for (Iterator iterator = ((gps) (obj1)).a.iterator(); iterator.hasNext(); ((gps) (obj1)).a(intent))
                    {
                        intent = (Intent)iterator.next();
                        iterator.remove();
                    }

                }
                obj1 = ((MainActivity) (obj)).getApplicationContext();
                Flags flags = ((MainActivity) (obj)).g;
                if (dzo.b().a(flags))
                {
                    boolean flag;
                    if (dzj.a(((Context) (obj1)), 0x20000000) != null)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        long l1 = (long)((new Random()).nextDouble() * (double)dzo.a);
                        TimeUnit.MILLISECONDS.toMinutes(l1);
                        long l2 = System.currentTimeMillis();
                        dzj.a(((Context) (obj1))).setInexactRepeating(1, l1 + l2, 0x5265c00L, dzj.a(((Context) (obj1)), 0));
                    }
                }
                ((MainActivity) (obj)).f.post(((MainActivity) (obj)).i);
                MethodTraceScope.e.b();
            }

            
            {
                a = MainActivity.this;
                super();
            }
        }, hew1);
        registerReceiver(Y, N);
        registerReceiver(X, a("com.spotify.mobile.android.spotlets.collection.cosmos.service.COLLECTION_ERROR"));
        J = true;
        o();
    }

    protected void onStop()
    {
        super.onStop();
        y = false;
        G.b();
        w = false;
        if (o != null)
        {
            o.b(this);
            o.b();
        }
        if (s && o != null)
        {
            o.b(T);
        }
        S.unsubscribe();
        if (p != null)
        {
            e.b(p);
            p = null;
        }
        UpsellService.b(this, P);
        if (J)
        {
            unregisterReceiver(Y);
            unregisterReceiver(X);
        }
    }

    protected void onUserLeaveHint()
    {
        super.onUserLeaveHint();
        Object obj = (eti)a_().a(0x7f110495);
        if (obj != null)
        {
            obj = ((eti) (obj)).b;
            ((etn) (obj)).a.a();
            boolean flag;
            if (!((etn) (obj)).f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj.g = flag;
            obj.f = false;
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        Assertion.a("Don't call setTitle() directly, use setTitleForFragment() instead.");
    }

}
