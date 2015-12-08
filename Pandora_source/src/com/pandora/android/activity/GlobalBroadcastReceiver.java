// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.j;
import com.crashlytics.android.d;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.data.l;
import com.pandora.android.personalization.StationPersonalizationActivity;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.p;
import com.pandora.android.util.r;
import com.pandora.android.util.s;
import com.pandora.android.util.v;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import p.ca.bg;
import p.cw.c;
import p.cx.i;
import p.dd.ak;
import p.dd.an;
import p.dd.ao;
import p.dd.ap;
import p.dd.ay;
import p.dd.be;
import p.dd.bh;
import p.dd.bn;
import p.dd.bo;
import p.dd.bq;
import p.dd.bu;
import p.dd.e;
import p.dd.g;
import p.dd.h;
import p.dd.n;
import p.dd.u;
import p.dd.w;
import p.dd.x;
import p.dd.z;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            PandoraIntentFilter, PandoraIntent, BaseFragmentActivity, c, 
//            InAppLandingPageActivity, a, AndroidLinkActivity, PandoraLinkInterceptorActivity, 
//            NowPlaying, BackstageActivity, HomeTabsActivity, PrivacyNoticeActivity, 
//            WelcomeActivity, VideoAdActivity, YuMeVideoActivity, ListeningTimeoutActivity, 
//            InterstitialAdActivity, CapWarningActivity, CustomStationAlertActivity, PandoraWebDialogActivity, 
//            InterstitialBaseActivity

public class GlobalBroadcastReceiver extends BroadcastReceiver
{

    private static volatile GlobalBroadcastReceiver g;
    protected LinkedList a;
    public af b;
    public final c c;
    protected final HashSet d = new HashSet() {

        final GlobalBroadcastReceiver a;

            
            {
                a = GlobalBroadcastReceiver.this;
                super();
                add(com.pandora.android.activity.PandoraIntent.a("show_set_account"));
                add(com.pandora.android.activity.PandoraIntent.a("show_privacy_notice"));
                add(com.pandora.android.activity.PandoraIntent.a("show_page"));
                add(com.pandora.android.activity.PandoraIntent.a("show_now_playing"));
                add(com.pandora.android.activity.PandoraIntent.a("show_backstage"));
                add(com.pandora.android.activity.PandoraIntent.a("show_search_results"));
                add(com.pandora.android.activity.PandoraIntent.a("SHOW_VIDEOAD"));
                add(com.pandora.android.activity.PandoraIntent.a("show_yume_video"));
                add(com.pandora.android.activity.PandoraIntent.a("show_pandora_link_accessory"));
                add(com.pandora.android.activity.PandoraIntent.a("dismiss_pandora_link_accessory"));
                add(com.pandora.android.activity.PandoraIntent.a("show_genre_stations"));
                add(com.pandora.android.activity.PandoraIntent.a("show_create_station"));
                add(com.pandora.android.activity.PandoraIntent.a("show_listening_timeout"));
                add(com.pandora.android.activity.PandoraIntent.a("show_upgrade"));
                add(com.pandora.android.activity.PandoraIntent.a("show_why_ads"));
                add(com.pandora.android.activity.PandoraIntent.a("launch_pandora_browser"));
                add(com.pandora.android.activity.PandoraIntent.a("show_test_landing_page"));
                add(com.pandora.android.activity.PandoraIntent.a("show_cap_warning"));
                add(com.pandora.android.activity.PandoraIntent.a("show_web_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("handle_one_playlist_ended"));
                add(com.pandora.android.activity.PandoraIntent.a("show_interstitial_ad"));
                add(com.pandora.android.activity.PandoraIntent.a("show_edit_station"));
                add(com.pandora.android.activity.PandoraIntent.a("show_edit_profile"));
                add(com.pandora.android.activity.PandoraIntent.a("execute_startup_task"));
                add(com.pandora.android.activity.PandoraIntent.a("show_no_station_selected"));
                add(com.pandora.android.activity.PandoraIntent.a("show_no_stations"));
                add(com.pandora.android.activity.PandoraIntent.a("action_show_station_personalization"));
                add(com.pandora.android.activity.PandoraIntent.a("show_home"));
                add(com.pandora.android.activity.PandoraIntent.a("show_coachmark"));
                add(com.pandora.android.activity.PandoraIntent.a("show_tablet_home"));
            }
    };
    protected final HashSet e = new HashSet() {

        final GlobalBroadcastReceiver a;

            
            {
                a = GlobalBroadcastReceiver.this;
                super();
                add(com.pandora.android.activity.PandoraIntent.a("station_share_success"));
                add(com.pandora.android.activity.PandoraIntent.a("send_toast"));
                add(com.pandora.android.activity.PandoraIntent.a("cmd_change_settings_result"));
            }
    };
    protected final HashSet f = new HashSet() {

        final GlobalBroadcastReceiver a;

            
            {
                a = GlobalBroadcastReceiver.this;
                super();
                add(com.pandora.android.activity.PandoraIntent.a("api_error"));
                add(com.pandora.android.activity.PandoraIntent.a("show_waiting"));
                add(com.pandora.android.activity.PandoraIntent.a("hide_waiting"));
                add(com.pandora.android.activity.PandoraIntent.a("show_after_p1_trial_started_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("show_diagnostic_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("show_locale_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("show_ab_tests"));
                add(com.pandora.android.activity.PandoraIntent.a("show_ok_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("show_yes_no_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("cmd_show_iap_error_dialog"));
                add(com.pandora.android.activity.PandoraIntent.a("show_environment_dialog"));
            }
    };
    private BaseFragmentActivity h;
    private p.bw.a i;
    private boolean j;
    private y k;
    private aa l;

    protected GlobalBroadcastReceiver()
    {
        a = new LinkedList();
        j = s.u();
        c = b.a.b();
        c.b(this);
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        a(pandoraintentfilter, d);
        a(pandoraintentfilter, e);
        a(pandoraintentfilter, f);
        b.a.C().a(this, pandoraintentfilter);
    }

    public static GlobalBroadcastReceiver a()
    {
        if (g == null)
        {
            if (b.a.h() == null)
            {
                throw new IllegalStateException("GlobalBroadcastReceiver has no available context to use.");
            }
            g = new GlobalBroadcastReceiver();
        }
        return g;
    }

    private void a(int i1)
    {
        b b1 = b.a;
        b1.b().d().a(true, "getplaylist failed");
        if (i1 == 1006)
        {
            i1 = 0x7f080180;
        } else
        {
            i1 = 0x7f080172;
        }
        s.a(b1.h().getString(i1), new PandoraIntent("show_no_station_selected"));
    }

    private void a(PandoraIntentFilter pandoraintentfilter, HashSet hashset)
    {
        for (hashset = hashset.iterator(); hashset.hasNext(); pandoraintentfilter.addAction((String)hashset.next())) { }
    }

    private void a(String s1)
    {
        p.df.a.c("GlobalBroadcastReceiver", "[%s] %s", new Object[] {
            Integer.valueOf(hashCode()), s1
        });
    }

    private void a(boolean flag)
    {
        String s1 = p.cp.b.a(flag);
        bg.a(h, Uri.parse(s1));
    }

    private boolean a(Context context, Intent intent)
    {
        boolean flag = h.a(context, intent);
        if (flag) goto _L2; else goto _L1
_L1:
        context = intent.getAction();
        a((new StringBuilder()).append("***** Global action is: ").append(context).toString());
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("station_share_success")))
        {
            s.a(h, 0x7f080262);
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_ok_dialog")) || context.equals(com.pandora.android.activity.PandoraIntent.a("api_error")))
        {
            c();
            context = intent.getStringExtra("intent_message");
            intent = (Intent)intent.getParcelableExtra("intent_followon_intent");
            if (intent == null)
            {
                s.a(h, context, false);
            } else
            {
                s.a(h, context, intent);
            }
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_yes_no_dialog")))
        {
            c();
            context = intent.getStringExtra("intent_message");
            String s1 = intent.getStringExtra("intent_title");
            intent = (Intent)intent.getParcelableExtra("intent_followon_intent");
            s.a(h, s1, context, intent);
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_diagnostic_dialog")))
        {
            c();
            context = (Intent)intent.getParcelableExtra("intent_followon_intent");
            s.a(h, context);
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_locale_dialog")))
        {
            c();
            context = (Intent)intent.getParcelableExtra("intent_followon_intent");
            r.a(h, context);
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_ab_tests")))
        {
            c();
            context = (Intent)intent.getParcelableExtra("intent_followon_intent");
            com.pandora.android.util.a.a(h, context);
            return true;
        }
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("launch_pandora_browser"))) goto _L4; else goto _L3
_L3:
        if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/InAppLandingPageActivity))
        {
            a("skipping PandoraWebActivity start - it's starting up already");
            return true;
        }
        if (intent.hasExtra("pandora.landing_page_data"))
        {
            context = (l)intent.getSerializableExtra("pandora.landing_page_data");
            com.pandora.android.activity.a.a(h, context, true, 124);
            return true;
        }
        if (intent.hasExtra("intent_uri") || intent.hasExtra("intent_html_content"))
        {
            context = intent.getStringExtra("intent_uri");
            String s2 = intent.getStringExtra("intent_html_content");
            int i1 = intent.getIntExtra("intent_color", -1);
            long l1 = intent.getLongExtra("intent_artist_msg_id", -1L);
            intent = intent.getStringExtra("intent_title");
            if (l1 < 0L)
            {
                context = new l(new com.pandora.radio.data.b(), context, s2, i1, com.pandora.android.data.l.a.d, null);
            } else
            {
                context = new l(l1, context, i1, com.pandora.android.data.l.a.d, intent);
            }
            com.pandora.android.activity.a.a(h, context, true, 124);
            return true;
        }
          goto _L2
_L4:
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("show_pandora_link_accessory"))) goto _L6; else goto _L5
_L5:
        if (p.cx.c.a().G() || p.cx.c.a().W())
        {
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/AndroidLinkActivity))
            {
                a("skipping accessory screen start - it's starting up already");
                return true;
            }
            if (!h.getClass().equals(com/pandora/android/activity/AndroidLinkActivity) && !h.getClass().equals(com/pandora/android/activity/PandoraLinkInterceptorActivity))
            {
                a("starting accessory screen");
                com.pandora.android.activity.c.a().a(h, com/pandora/android/activity/AndroidLinkActivity, 0x4000000, null);
                return true;
            }
        }
          goto _L2
_L6:
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("send_toast")))
        {
            context = intent.getStringExtra("intent_toast_message");
            s.a(h, context);
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("cmd_change_settings_result")))
        {
            c.r().c();
            if (intent.getBooleanExtra("intent_success", false))
            {
                if (intent.getBooleanExtra("show_toast", false))
                {
                    s.a(h, 0x7f080232);
                    return true;
                }
            } else
            if (intent.getBooleanExtra("intent_facebook_settings_changed", false))
            {
                s.i(intent.getStringExtra("intent_message"));
                return true;
            }
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_waiting")))
        {
            b(intent);
            return true;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("hide_waiting")))
        {
            c();
            return true;
        }
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("execute_startup_task"))) goto _L8; else goto _L7
_L7:
        context = b.a.B();
        if (context != null)
        {
            b.a.a(null);
            context.execute(new Object[0]);
        }
_L2:
        return flag;
_L8:
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_test_landing_page")))
        {
            d();
            return true;
        }
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("cmd_show_iap_error_dialog"))) goto _L10; else goto _L9
_L9:
        context = com.pandora.android.iap.d.c.valueOf(intent.getStringExtra("intent_iap_error_dialog_type"));
        static class _cls8
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];
            static final int e[];
            static final int f[];

            static 
            {
                f = new int[p.cx.e.a.values().length];
                try
                {
                    f[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    f[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    f[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    f[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                e = new int[p.dd.bh.a.values().length];
                try
                {
                    e[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    e[p.dd.bh.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    e[p.dd.bh.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    e[p.dd.bh.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    e[p.dd.bh.a.c.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                d = new int[p.cw.b.a.values().length];
                try
                {
                    d[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    d[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    d[p.cw.b.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    d[p.cw.b.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    d[p.cw.b.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                c = new int[p.dd.ay.a.values().length];
                try
                {
                    c[p.dd.ay.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    c[p.dd.ay.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    c[p.dd.ay.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    c[p.dd.ay.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                b = new int[p.values().length];
                try
                {
                    b[p.h.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[p.i.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.pandora.android.iap.d.c.values().length];
                try
                {
                    a[com.pandora.android.iap.d.c.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.iap.d.c.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.iap.d.c.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.activity._cls8.a[context.ordinal()];
        JVM INSTR tableswitch 1 3: default 892
    //                   1 917
    //                   2 926
    //                   3 936;
           goto _L11 _L12 _L13 _L14
_L11:
        throw new IllegalArgumentException(String.format(Locale.getDefault(), "IapErrorType '%s' is not supported", new Object[] {
            context
        }));
_L12:
        s.d(h);
_L15:
        return true;
_L13:
        s.f(h);
        continue; /* Loop/switch isn't completed */
_L14:
        s.e(h);
        if (true) goto _L15; else goto _L10
_L10:
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_environment_dialog")))
        {
            context = (Intent)intent.getParcelableExtra("intent_followon_intent");
            s.a(h, context);
        }
        if (true) goto _L2; else goto _L16
_L16:
    }

    private boolean a(Class class1, String s1)
    {
        if (com.pandora.android.activity.c.a().c(class1))
        {
            if (s1 == null)
            {
                s1 = class1.getName();
            }
            a(String.format("skipping %s start - it's starting up already", new Object[] {
                s1
            }));
            return true;
        } else
        {
            return false;
        }
    }

    private void b(Context context, Intent intent)
    {
        String s1 = intent.getAction();
        a((new StringBuilder()).append("***** Tablet action is: ").append(s1).toString());
        if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_tablet_home")))
        {
            a(h, intent.getExtras());
        } else
        {
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_home")))
            {
                context = TabletHome.ag().getExtras();
                if (intent.getExtras() != null)
                {
                    context.putAll(intent.getExtras());
                }
                a(h, context);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_privacy_notice")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_set_account")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_search_results")))
            {
                a(h, TabletHome.c(intent.getExtras()).getExtras());
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("SHOW_VIDEOAD")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_listening_timeout")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_genre_stations")))
            {
                context = (p)intent.getSerializableExtra("intent_page_name");
                switch (com.pandora.android.activity._cls8.b[context.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    a(h, TabletHome.b(context, intent.getExtras()).getExtras());
                    break;
                }
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_create_station")))
            {
                a(h, TabletHome.am().getExtras());
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_edit_station")))
            {
                context = intent.getStringExtra("intent_station_token");
                TabletHome.a(h, context);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_edit_profile")))
            {
                TabletHome.a(h);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("dismiss_pandora_link_accessory")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_upgrade")))
            {
                e();
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_why_ads")))
            {
                com.pandora.android.activity.a.a(h);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_after_p1_trial_started_dialog")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_cap_warning")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_web_dialog")))
            {
                c(context, intent);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_now_playing")))
            {
                context = TabletHome.aj().getExtras();
                if (intent.getExtras() != null)
                {
                    context.putAll(intent.getExtras());
                }
                a(h, context);
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_no_station_selected")))
            {
                a(h, TabletHome.ah().getExtras());
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_no_stations")))
            {
                a(h, TabletHome.af().getExtras());
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("show_page")))
            {
                a(h, TabletHome.e(intent.getExtras()).getExtras());
                return;
            }
            if (s1.equals(com.pandora.android.activity.PandoraIntent.a("action_show_station_personalization")))
            {
                if ((p)intent.getSerializableExtra("intent_page_name") == p.f)
                {
                    a(h, TabletHome.e(intent.getExtras()).getExtras());
                    return;
                } else
                {
                    intent.putExtra("intent_page_name", p.H);
                    a(h, TabletHome.e(intent.getExtras()).getExtras());
                    return;
                }
            }
        }
    }

    private void b(Intent intent)
    {
        intent = intent.getStringExtra("intent_waiting_msg");
        if (intent != null)
        {
            h.d(intent);
            return;
        } else
        {
            h.S();
            return;
        }
    }

    private void c()
    {
        h.U();
    }

    private void c(Context context, Intent intent)
    {
        context = intent.getAction();
        a((new StringBuilder()).append("***** Mobile action is: ").append(context).toString());
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("show_now_playing"))) goto _L2; else goto _L1
_L1:
        if (!com.pandora.android.ads.VideoAdManager.c.a().l()) goto _L4; else goto _L3
_L3:
        a("skipping nowplaying start - waiting for video ad to finish");
_L6:
        return;
_L4:
        if (com.pandora.android.activity.a.c())
        {
            a("skipping nowplaying start - it's starting up already");
            return;
        }
        if (!com.pandora.android.activity.a.i(h))
        {
            a("starting nowplaying");
            a(com/pandora/android/activity/NowPlaying, 0x4000000, intent.getExtras());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_backstage")))
        {
            if (com.pandora.android.ads.VideoAdManager.c.a().l())
            {
                a("skipping backstage start - waiting for video ad to finish");
                return;
            }
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/BackstageActivity))
            {
                a("skipping backstage start - it's starting up already");
                return;
            } else
            {
                a("starting backstage");
                a(com/pandora/android/activity/BackstageActivity, intent.getExtras());
                return;
            }
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_page")))
        {
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/HomeTabsActivity))
            {
                a("skipping StationListActivity start - it's starting up already");
                return;
            } else
            {
                com.pandora.android.activity.HomeTabsActivity.a(h, intent.getExtras());
                return;
            }
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_privacy_notice")))
        {
            a(com/pandora/android/activity/PrivacyNoticeActivity, intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_set_account")))
        {
            a(com/pandora/android/activity/WelcomeActivity, intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_search_results")))
        {
            intent.putExtra("intent_show_force_screen", true);
            com.pandora.android.activity.HomeTabsActivity.e(h, intent.getExtras());
            return;
        }
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("SHOW_VIDEOAD")))
        {
            break; /* Loop/switch isn't completed */
        }
        context = intent.getStringExtra("intent_video_ad_data_id");
        if (!s.a(context))
        {
            intent = new Bundle();
            intent.putString("intent_video_ad_data_id", context);
            a(com/pandora/android/activity/VideoAdActivity, intent);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_yume_video")))
        {
            a(com/pandora/android/activity/YuMeVideoActivity, intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_listening_timeout")))
        {
            a(com/pandora/android/activity/ListeningTimeoutActivity, 0x20000000, intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_genre_stations")))
        {
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/HomeTabsActivity))
            {
                a("skipping HomeTabsActivity start - it's starting up already");
                return;
            } else
            {
                com.pandora.android.activity.HomeTabsActivity.a(h, intent.getExtras());
                return;
            }
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_create_station")))
        {
            com.pandora.android.activity.HomeTabsActivity.a(h);
            return;
        }
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("show_edit_station")))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a(com/pandora/android/activity/HomeTabsActivity, ((String) (null))))
        {
            com.pandora.android.activity.HomeTabsActivity.d(h, intent.getExtras());
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("show_edit_profile")))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!a(com/pandora/android/activity/HomeTabsActivity, ((String) (null))))
        {
            com.pandora.android.activity.HomeTabsActivity.b(h);
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (!context.equals(com.pandora.android.activity.PandoraIntent.a("dismiss_pandora_link_accessory")))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!p.cx.c.a().L())
        {
            s.s();
            return;
        }
        if (true) goto _L6; else goto _L9
_L9:
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_upgrade")))
        {
            e();
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_why_ads")))
        {
            com.pandora.android.activity.a.a(h, null, null, new android.content.DialogInterface.OnDismissListener() {

                final GlobalBroadcastReceiver a;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    b.a.E();
                }

            
            {
                a = GlobalBroadcastReceiver.this;
                super();
            }
            });
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_interstitial_ad")))
        {
            com.pandora.android.activity.c.a().a(h, com/pandora/android/activity/InterstitialAdActivity, 0, intent.getExtras(), 124);
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_after_p1_trial_started_dialog")))
        {
            (new android.app.AlertDialog.Builder(h)).setMessage(0x7f08014f).setCancelable(false).setNeutralButton(0x7f0801f5, new android.content.DialogInterface.OnClickListener() {

                final GlobalBroadcastReceiver a;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    dialoginterface.cancel();
                    a.b.c(true);
                }

            
            {
                a = GlobalBroadcastReceiver.this;
                super();
            }
            }).create().show();
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_cap_warning")))
        {
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/CapWarningActivity))
            {
                a("skipping cap warning screen start - it's starting up already");
                return;
            } else
            {
                a(com/pandora/android/activity/CapWarningActivity, intent.getExtras());
                return;
            }
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("handle_one_playlist_ended")))
        {
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/CustomStationAlertActivity))
            {
                a("skipping ReplayCustomContentStationActivity start - it's starting up already");
                return;
            }
            if (h.getClass().equals(com/pandora/android/activity/CustomStationAlertActivity))
            {
                a("skipping CustomStationAlertActivity start - its running already");
                return;
            } else
            {
                a(com/pandora/android/activity/CustomStationAlertActivity, intent.getExtras());
                return;
            }
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_web_dialog")))
        {
            a(com/pandora/android/activity/PandoraWebDialogActivity, intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_no_station_selected")) || context.equals(com.pandora.android.activity.PandoraIntent.a("show_no_stations")) || context.equals(com.pandora.android.activity.PandoraIntent.a("show_home")))
        {
            a(intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("action_show_station_personalization")))
        {
            context = intent.getStringExtra("intent_station_token");
            context = c.y().a(h.getApplicationContext(), context);
            if (com.pandora.android.activity.a.a(context))
            {
                if (com.pandora.android.activity.c.a().c(com/pandora/android/personalization/StationPersonalizationActivity))
                {
                    a("skipping StationPersonalizationActivity start - it's starting up already");
                    return;
                }
                intent = (p)intent.getSerializableExtra("intent_page_name");
                if (intent == p.J)
                {
                    StationPersonalizationActivity.a(h, context, h.getClass(), false);
                    return;
                }
                if (intent == p.K)
                {
                    StationPersonalizationActivity.a(h, context, h.getClass(), true);
                    return;
                }
                if (intent == p.L && context.l())
                {
                    StationPersonalizationActivity.a(h, context, h.getClass());
                    return;
                } else
                {
                    StationPersonalizationActivity.a(h, context, null, h.getClass());
                    return;
                }
            }
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/HomeTabsActivity))
            {
                a("skipping HomeTabsActivity start - it's starting up already");
                return;
            }
            context = (p)intent.getSerializableExtra("intent_page_name");
            if (context == p.J || context == p.K || context == p.L)
            {
                intent.putExtra("intent_page_name", p.e);
            }
            com.pandora.android.activity.HomeTabsActivity.a(h, intent.getExtras());
            return;
        }
        if (context.equals(com.pandora.android.activity.PandoraIntent.a("show_coachmark")))
        {
            intent = intent.getExtras();
            context = (CoachmarkBuilder)intent.getParcelable("intent_coachmark_builder");
            intent = (aa)intent.getSerializable("intent_track_data");
            if (h == null || h.isFinishing())
            {
                com.crashlytics.android.d.a(new IllegalStateException(String.format("GBR-ShowCoachmark %s Activity", new Object[] {
                    h
                })));
            }
            h.a(context, intent);
            return;
        }
        if (true) goto _L6; else goto _L10
_L10:
    }

    private void c(Intent intent)
    {
        intent = intent.getAction();
        if (intent.equals(com.pandora.android.activity.PandoraIntent.a("show_pandora_link_accessory")) || intent.equals(com.pandora.android.activity.PandoraIntent.a("show_now_playing")))
        {
            if (com.pandora.android.activity.c.a().c(com/pandora/android/activity/AndroidLinkActivity))
            {
                a("skipping accessory screen start - it's starting up already");
            } else
            if (!h.getClass().equals(com/pandora/android/activity/AndroidLinkActivity) && !h.getClass().equals(com/pandora/android/activity/PandoraLinkInterceptorActivity))
            {
                a("starting accessory screen");
                com.pandora.android.activity.c.a().a(h, com/pandora/android/activity/AndroidLinkActivity, 0x4000000, null);
                return;
            }
        }
    }

    private void d()
    {
        Object obj = s.b(h, 0x7f070004);
        obj = new l(new com.pandora.radio.data.b(), null, ((String) (obj)), 0, com.pandora.android.data.l.a.d, null);
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("LANDING_PAGE_DATA", ((java.io.Serializable) (obj)));
        bundle.putBoolean("TEST_AD_WEB_PAGE", true);
        com.pandora.android.activity.c.a().a(h, com/pandora/android/activity/InterstitialBaseActivity, 0, bundle, 123);
    }

    private void e()
    {
        if (b.i())
        {
            com.pandora.android.activity.a.f(h);
        } else
        if (s.m())
        {
            com.pandora.android.iap.b b1 = com.pandora.android.iap.d.d.a().e();
            if (!b1.d())
            {
                b1.a(h);
                return;
            }
        } else
        {
            Object obj = com.pandora.android.iap.d.d.a().d();
            if (((com.pandora.android.iap.c) (obj)).e())
            {
                ((com.pandora.android.iap.c) (obj)).a(h);
                return;
            }
            obj = b.f();
            if (s.a(((String) (obj))) || b.i())
            {
                com.pandora.android.activity.a.f(h);
                return;
            } else
            {
                com.pandora.android.activity.a.a(h, ((String) (obj)));
                return;
            }
        }
    }

    private boolean f()
    {
        return h != null;
    }

    private p.bw.a g()
    {
        if (i == null)
        {
            i = new p.bw.a(b.a.h());
        }
        return i;
    }

    public void a(Activity activity)
    {
        if (h == activity)
        {
            h = null;
        }
    }

    protected void a(Activity activity, Bundle bundle)
    {
        TabletHome.a(activity, bundle);
    }

    protected void a(Intent intent)
    {
        String s1 = intent.getAction();
        if (!s.a(s1))
        {
            if (d.contains(s1))
            {
                a(d, a);
                a.addFirst(intent);
            }
            if (e.contains(s1))
            {
                a(s1, a);
                a.add(intent);
            }
            if (f.contains(s1))
            {
                a(s1, a);
                a.add(intent);
                return;
            }
        }
    }

    protected void a(Bundle bundle)
    {
        com.pandora.android.activity.HomeTabsActivity.c(h, bundle);
    }

    public void a(BaseFragmentActivity basefragmentactivity)
    {
        h = basefragmentactivity;
        if (basefragmentactivity == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        for (ListIterator listiterator = a.listIterator(); f() && listiterator.hasNext(); onReceive(basefragmentactivity, (Intent)listiterator.next())) { }
        break MISSING_BLOCK_LABEL_60;
        basefragmentactivity;
        a.clear();
        throw basefragmentactivity;
        a.clear();
    }

    protected void a(Class class1, int i1, Bundle bundle)
    {
        com.pandora.android.activity.c.a().a(h, class1, i1, bundle);
    }

    protected void a(Class class1, Bundle bundle)
    {
        com.pandora.android.activity.c.a().a(h, class1, bundle);
    }

    protected void a(String s1, LinkedList linkedlist)
    {
        linkedlist = linkedlist.listIterator();
        do
        {
            if (!linkedlist.hasNext())
            {
                break;
            }
            if (!s1.equals(((Intent)linkedlist.next()).getAction()))
            {
                continue;
            }
            linkedlist.remove();
            break;
        } while (true);
    }

    protected void a(HashSet hashset, LinkedList linkedlist)
    {
        linkedlist = linkedlist.listIterator();
        do
        {
            if (!linkedlist.hasNext())
            {
                break;
            }
            if (!hashset.contains(((Intent)linkedlist.next()).getAction()))
            {
                continue;
            }
            linkedlist.remove();
            break;
        } while (true);
    }

    protected void b()
    {
        ag ag1 = b.a.b().k();
        aj aj1 = ag1.J();
        if (aj1 != null)
        {
            aj1.a("leadInAudioUrl", null);
            ag1.a(aj1);
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void onABTestUpdate(p.dd.a a1)
    {
        if (a1.a.a() == p.dj.b.a.i.j && !s.p())
        {
            com.pandora.android.activity.a.b(h);
        }
    }

    public void onApiError(p.dd.c c1)
    {
        String s1 = g().a(c1.a);
        PandoraIntent pandoraintent = null;
        if (c1.a == 1039)
        {
            a(0x7f080172);
            return;
        }
        if (c1.a == 1026)
        {
            pandoraintent = new PandoraIntent("show_set_account");
        } else
        if (c1.a == 1038)
        {
            pandoraintent = new PandoraIntent("show_no_station_selected");
        } else
        if (c1.a == 3000)
        {
            if (k != null)
            {
                pandoraintent = new PandoraIntent("show_now_playing");
            } else
            {
                pandoraintent = new PandoraIntent("show_no_station_selected");
            }
        } else
        if (c1.b)
        {
            pandoraintent = new PandoraIntent("cmd_shutdown");
        }
        if (c.C() && c1.b)
        {
            p.cx.c.a().c();
            c1 = new PandoraIntent("cmd_pandoralink_disconnect");
            c1.putExtra("intent_message", s1);
            b.a.C().a(c1);
            return;
        } else
        {
            s.a(s1, pandoraintent);
            return;
        }
    }

    public void onAutomotiveAccessoryEvent(e e1)
    {
        if (e1.a == p.dd.e.a.a)
        {
            b.a.C().a(new PandoraIntent("show_pandora_link_accessory"));
        } else
        if (e1.a == p.dd.e.a.b)
        {
            b.a.C().a(new PandoraIntent("dismiss_pandora_link_accessory"));
            return;
        }
    }

    public void onBookmarkSuccess(g g1)
    {
        s.h(b.a.h().getString(0x7f0800bd, new Object[] {
            g1.a
        }));
    }

    public void onCapWarning(h h1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_cap_warning");
        pandoraintent.putExtra("remaining_hours", h1.a);
        pandoraintent.putExtra("cap_warning_percent", h1.b);
        b.a.C().a(pandoraintent);
    }

    public void onCappedPlaylist(p.dd.i i1)
    {
        if (j)
        {
            a(h, TabletHome.ai().getExtras());
        }
    }

    public void onCastMessage(p.dd.j j1)
    {
        s.h(j1.a());
    }

    public void onCustomContentStationNotFound(n n)
    {
        if (!j)
        {
            s.k();
            s.e(b.a.h().getString(0x7f080280));
        }
    }

    public void onDeleteStationSuccess(p.dd.p p1)
    {
        if (!s.v())
        {
            s.a(0x7f080252);
        }
    }

    public void onErrorWithRetry(p.dd.r r1)
    {
        String s1 = g().a(r1.a);
        PandoraIntent pandoraintent;
        if (r1.b)
        {
            pandoraintent = new PandoraIntent("cmd_shutdown");
        } else
        {
            pandoraintent = null;
        }
        if (c.C() && r1.b)
        {
            p.cx.c.a().c();
            r1 = new PandoraIntent("cmd_pandoralink_disconnect");
            r1.putExtra("intent_message", s1);
            b.a.C().a(r1);
        } else
        if (h != null)
        {
            r1 = new android.content.DialogInterface.OnClickListener(r1.c) {

                final p.cx.z a;
                final GlobalBroadcastReceiver b;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    a.a();
                }

            
            {
                b = GlobalBroadcastReceiver.this;
                a = z1;
                super();
            }
            };
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(h);
            builder.setMessage(s1).setCancelable(false).setPositiveButton(h.getString(0x7f0801f5), r1).setNegativeButton(h.getString(0x7f0800c3), new android.content.DialogInterface.OnClickListener(pandoraintent) {

                final Intent a;
                final GlobalBroadcastReceiver b;

                public void onClick(DialogInterface dialoginterface, int i1)
                {
                    b.a.C().a(a);
                    dialoginterface.cancel();
                }

            
            {
                b = GlobalBroadcastReceiver.this;
                a = intent;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }

    public void onGetPlaylistFail(u u1)
    {
        if (u1.b == 1006)
        {
            a(u1.b);
        } else
        if (!c.d().m() && u1.c)
        {
            a(u1.b);
            return;
        }
    }

    public void onInterceptorConnection(w w1)
    {
        if (w1.a == p.dd.w.a.a)
        {
            s.a(h, "Connected to Interceptor");
        } else
        if (w1.a == p.dd.w.a.b)
        {
            s.a(h, "Failed to Connect to Interceptor!");
            return;
        }
    }

    public void onListeningTimeout(x x)
    {
        b.a.C().a(new PandoraIntent("show_listening_timeout"));
    }

    public void onNetworkWaiting(z z)
    {
        s.i();
    }

    public void onOnePlaylistEnded(p.dd.aa aa1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("handle_one_playlist_ended");
        if (aa1.a != null)
        {
            pandoraintent.putExtra("intent_station_data", aa1.a);
        }
        if (aa1.b)
        {
            aa1 = "alert_expire";
        } else
        {
            aa1 = "alert_replay";
        }
        pandoraintent.putExtra("intent_action", aa1);
        b.a.C().a(pandoraintent);
    }

    public void onPlayerStateChangeEvent(p.dd.ag ag1)
    {
        switch (com.pandora.android.activity._cls8.d[ag1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onPlayerStateChangeEvent called with unknown PlayerStateChangeEvent state: ").append(ag1.a).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            s.f();
            return;

        case 5: // '\005'
            s.c();
            break;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!f())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c.C())
        {
            c(intent);
            return;
        }
        if (a(context, intent)) goto _L1; else goto _L3
_L3:
        if (j)
        {
            b(context, intent);
            return;
        } else
        {
            c(context, intent);
            return;
        }
        if (c.C()) goto _L1; else goto _L4
_L4:
        a(intent);
        return;
    }

    public void onSearchResults(ak ak1)
    {
        Object obj1 = ak1.b;
        Object obj;
        if (obj1 != null)
        {
            obj = ((MusicSearchData) (obj1)).e();
        } else
        {
            obj = null;
        }
        if (obj != null && ((MusicSearchData) (obj1)).g() == 0 && ((SearchDescriptor) (obj)).c())
        {
            ak1 = new PandoraIntent("show_home");
            ak1.putExtra("showCoachmark", true);
            ak1.putExtra("showCoachmarkType", com.pandora.android.coachmark.e.e.q.name());
            ak1.putExtra("intent_search_descriptor", ((android.os.Parcelable) (obj)));
            ak1.putExtra("intent_show_force_screen", true);
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_search_results");
            pandoraintent.putExtra("intent_search_results", ((android.os.Parcelable) (obj1)));
            pandoraintent.putExtra("intent_search_query", ak1.c);
            pandoraintent.putExtra("intent_search_result_consumer", ak1.d);
            pandoraintent.putExtra("intent_search_add_variety", ak1.e);
            pandoraintent.putExtra("intent_search_id", ak1.a);
            ak1 = pandoraintent;
        }
        if (com.pandora.android.ads.VideoAdManager.c.a().l())
        {
            obj = new PandoraIntent("SHOW_VIDEOAD");
            obj1 = ak1.getExtras();
            ((Bundle) (obj1)).putString("intent_followon_action", ak1.getAction());
            ((PandoraIntent) (obj)).putExtras(((Bundle) (obj1)));
            b.a.C().a(((Intent) (obj)));
            return;
        }
        if (l != null && l.M())
        {
            PandoraIntent pandoraintent1 = new PandoraIntent("show_now_playing");
            Bundle bundle = ak1.getExtras();
            bundle.putString("intent_followon_action", ak1.getAction());
            pandoraintent1.putExtras(bundle);
            b.a.C().a(pandoraintent1);
            return;
        } else
        {
            b.a.C().a(ak1);
            return;
        }
    }

    public void onSignInState(an an1)
    {
        b = an1.a;
        switch (_cls8.f[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            break;

        case 4: // '\004'
            if (!c.C())
            {
                b.a.C().a(new PandoraIntent("show_set_account"));
            }
            break;
        }
    }

    public void onSilentSkip(ao ao1)
    {
        if (p.cw.d.b(ao1.a))
        {
            s.h();
        } else
        if (h != null && !c.C() && ao1.a == p.cw.d.a.i)
        {
            a(true);
            return;
        }
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.b(ap1.c))
        {
            s.h();
        } else
        {
            s.k();
            if (ap1.c != p.cw.d.a.d)
            {
                String s1 = v.a(ap1.c);
                if (!c.C() && !ap1.b.equals("WATCH"))
                {
                    if (h != null && (ap1.c == p.cw.d.a.b || ap1.c == p.cw.d.a.i))
                    {
                        boolean flag;
                        if (ap1.c == p.cw.d.a.i)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        a(flag);
                        return;
                    } else
                    {
                        s.h(s1);
                        return;
                    }
                }
            }
        }
    }

    public void onStationStateChange(ay ay1)
    {
        k = ay1.a;
        com.pandora.android.activity._cls8.c[ay1.b.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 79
    //                   2 79
    //                   3 83
    //                   4 86;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());
_L2:
        s.k();
_L6:
        return;
_L3:
        s.k();
_L4:
        if (ay1.c != null && (ay1.c instanceof com.pandora.android.data.c))
        {
            ay1 = (com.pandora.android.data.c)ay1.c;
            if (((com.pandora.android.data.c) (ay1)).a)
            {
                PandoraIntent pandoraintent = new PandoraIntent("show_now_playing");
                if (((com.pandora.android.data.c) (ay1)).b != null)
                {
                    pandoraintent.putExtras(((com.pandora.android.data.c) (ay1)).b);
                }
                b.a.C().a(pandoraintent);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onTiredOfTrack(be be)
    {
        s.a(0x7f08027d);
    }

    public void onTrackState(bh bh1)
    {
        l = bh1.b;
        switch (com.pandora.android.activity._cls8.e[bh1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onTrackState called with unknown TrackStateRadioEvent state : ").append(bh1.a).toString());

        case 4: // '\004'
            s.h();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;

        case 5: // '\005'
            s.k();
            break;
        }
    }

    public void onUserCreated(bn bn)
    {
        boolean flag1 = true;
        boolean flag;
        if (c.a(p.dj.b.a.c) && !s.u())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !j)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s.s();
            return;
        } else
        {
            b.a.C().a(new PandoraIntent("show_privacy_notice"));
            return;
        }
    }

    public void onUserData(bo bo1)
    {
        b = bo1.a;
    }

    public void onValueExchangeRewardEvent(bq bq1)
    {
        if (bq1.a != null)
        {
            String s1 = bq1.a.a("leadInAudioUrl");
            if (!s.a(s1))
            {
                b();
                com.pandora.android.util.w.a(s1, null, null);
                b.a.b().o().a(com.pandora.radio.util.k.o.b, bq1.a);
                b.a.C().a(new PandoraIntent("keep_sample_playing"));
            }
        }
    }

    public void onZeroVolumeAutoPause(bu bu1)
    {
        if (bu1.a)
        {
            s.e();
            return;
        } else
        {
            s.f();
            return;
        }
    }
}
