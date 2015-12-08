// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import ayk;
import bem;
import bet;
import beu;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.ads.model.Targeting;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import dnd;
import edq;
import eeh;
import eei;
import fop;
import fou;
import fyd;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BannerAdActivity extends fou
{

    private static final BroadcastReceiver i = new BroadcastReceiver() {

        public final void onReceive(Context context, Intent intent)
        {
            context.startActivity(new Intent(context, com/spotify/mobile/android/spotlets/ads/BannerAdActivity));
        }

    };
    LoadingView d;
    private ViewGroup j;
    private View k;
    private View l;
    private fop m;
    private edq n;
    private Handler o;
    private Runnable p;
    private Resolver q;
    private eeh r;
    private Map s;
    private long t;

    public BannerAdActivity()
    {
        m = (fop)dmz.a(fop);
    }

    static edq a(BannerAdActivity banneradactivity)
    {
        return banneradactivity.n;
    }

    static Map a(BannerAdActivity banneradactivity, Map map)
    {
        banneradactivity.s = map;
        return map;
    }

    public static void a(Activity activity)
    {
        IntentFilter intentfilter = new IntentFilter("com.spotify.music.action.SHOW_BANNER_AD_EVENT");
        activity.registerReceiver(i, intentfilter);
    }

    public static void a(Context context)
    {
        Intent intent = new Intent("com.spotify.music.action.SHOW_BANNER_AD_EVENT");
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    private void a(Bundle bundle)
    {
        Iterator iterator = s.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
            if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(((CharSequence) (obj))))
            {
                bundle.putString(s1, ((String) (obj)));
            }
        } while (true);
    }

    static void a(BannerAdActivity banneradactivity, String s1)
    {
        edq edq1 = banneradactivity.n;
        long l1 = banneradactivity.f();
        fop.a(banneradactivity, new dnd(edq1.a, null, "event_errored", (new StringBuilder("{\"message\":\"")).append(s1).append("\"}").toString(), edq1.b, l1));
    }

    static fop b(BannerAdActivity banneradactivity)
    {
        return banneradactivity.m;
    }

    public static void b(Activity activity)
    {
        activity.unregisterReceiver(i);
    }

    static void c(BannerAdActivity banneradactivity)
    {
        banneradactivity.h();
    }

    static Runnable d(BannerAdActivity banneradactivity)
    {
        return banneradactivity.p;
    }

    static Handler e(BannerAdActivity banneradactivity)
    {
        return banneradactivity.o;
    }

    static void f(BannerAdActivity banneradactivity)
    {
        if (!banneradactivity.isFinishing())
        {
            eeh eeh1 = banneradactivity.r;
            Bundle bundle = new Bundle();
            bundle.putString("ad_unit_id", banneradactivity.r.a.b());
            beu beu1 = (new beu()).b().a(bet.a).a("732599B3D929F7EDEA82B7C06AE47CC6").a("F9F91BE3178878FE98FB8968BDCAF377");
            if (banneradactivity.s != null)
            {
                banneradactivity.a(bundle);
                banneradactivity = (String)banneradactivity.s.get("aduserid");
                if (banneradactivity != null && !banneradactivity.isEmpty())
                {
                    beu1.b(banneradactivity);
                }
            }
            beu1.a(ayk, bundle);
            banneradactivity = beu1.a();
            eeh1.a.a(banneradactivity);
        }
    }

    static boolean g()
    {
        return true;
    }

    private void h()
    {
        if (!isFinishing())
        {
            finish();
        }
    }

    public final long f()
    {
        return SystemClock.elapsedRealtime() - t;
    }

    public void onBackPressed()
    {
        fop.a(this, n.a("back_button", f()));
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        t = SystemClock.elapsedRealtime();
        setContentView(0x7f03006e);
        j = (ViewGroup)findViewById(0x7f110336);
        l = findViewById(0x7f110337);
        l.setVisibility(4);
        bundle = (ImageButton)findViewById(0x7f110338);
        bem bem;
        if (bundle != null)
        {
            bundle.setImageDrawable(fyd.e(this));
            k = bundle;
        } else
        {
            k = findViewById(0x7f11033b);
        }
        n = new edq("banner", "preroll");
        k.setOnClickListener(new android.view.View.OnClickListener() {

            private BannerAdActivity a;

            public final void onClick(View view)
            {
                BannerAdActivity.b(a);
                fop.a(a, BannerAdActivity.a(a).a("close_button", a.f()));
                BannerAdActivity.c(a);
            }

            
            {
                a = BannerAdActivity.this;
                super();
            }
        });
        j.setOnClickListener(new android.view.View.OnClickListener() {

            private BannerAdActivity a;

            public final void onClick(View view)
            {
                BannerAdActivity.b(a);
                fop.a(a, BannerAdActivity.a(a).a("background", a.f()));
                BannerAdActivity.c(a);
            }

            
            {
                a = BannerAdActivity.this;
                super();
            }
        });
        d = LoadingView.a(getLayoutInflater(), this, l);
        j.addView(d);
        d.a();
        d.setClickable(false);
        bundle = (PublisherAdView)findViewById(0x7f11033a);
        dmz.a(eei);
        r = eei.a(bundle);
        bundle = r;
        bem = new bem() {

            private BannerAdActivity a;

            public final void a()
            {
                super.a();
                BannerAdActivity.e(a).removeCallbacks(BannerAdActivity.d(a));
                BannerAdActivity.g();
                a.d.b();
                BannerAdActivity.b(a);
                BannerAdActivity banneradactivity = a;
                edq edq1 = BannerAdActivity.a(a);
                long l1 = a.f();
                fop.a(banneradactivity, new dnd(edq1.a, null, "event_viewed", "", edq1.b, l1));
            }

            public final void a(int i1)
            {
                super.a(i1);
                BannerAdActivity.e(a).removeCallbacks(BannerAdActivity.d(a));
                i1;
                JVM INSTR tableswitch 0 3: default 52
            //                           0 98
            //                           1 107
            //                           2 116
            //                           3 125;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                String s1;
                String s2;
                s2 = "ERROR_CODE_UNKNOWN";
                s1 = "This error code was not listed on developer.android.com/reference/com/google/android/gms/ads/AdRequest.html";
_L7:
                s1 = (new StringBuilder()).append(s2).append(" ").append(s1).toString();
                BannerAdActivity.a(a, s1);
                BannerAdActivity.c(a);
                return;
_L2:
                s2 = "ERROR_CODE_INTERNAL_ERROR";
                s1 = "Something happened internally; for instance, an invalid response was received from the ad server.";
                continue; /* Loop/switch isn't completed */
_L3:
                s2 = "ERROR_CODE_INVALID_REQUEST";
                s1 = "The ad request was invalid; for instance, the ad unit ID was incorrect.";
                continue; /* Loop/switch isn't completed */
_L4:
                s2 = "ERROR_CODE_NETWORK_ERROR";
                s1 = "The ad request was unsuccessful due to network connectivity.";
                continue; /* Loop/switch isn't completed */
_L5:
                s2 = "ERROR_CODE_NO_FILL";
                s1 = "The ad request was successful, but no ad was returned due to lack of ad inventory.";
                if (true) goto _L7; else goto _L6
_L6:
            }

            public final void b()
            {
                super.b();
                BannerAdActivity.b(a);
                BannerAdActivity banneradactivity = a;
                edq edq1 = BannerAdActivity.a(a);
                long l1 = a.f();
                fop.a(banneradactivity, new dnd(edq1.a, null, "event_clicked", "", edq1.b, l1));
            }

            public final void c()
            {
                super.c();
            }

            public final void d()
            {
                super.d();
            }

            
            {
                a = BannerAdActivity.this;
                super();
            }
        };
        ((eeh) (bundle)).a.a(bem);
        o = new Handler(Looper.getMainLooper());
        p = new Runnable() {

            private BannerAdActivity a;

            public final void run()
            {
                BannerAdActivity.a(a, "TIMED_OUT Load milliseconds exceeded 5000");
                BannerAdActivity.c(a);
            }

            
            {
                a = BannerAdActivity.this;
                super();
            }
        };
        o.postDelayed(p, 5000L);
        q = Cosmos.getResolver(this);
        bundle = RequestBuilder.get("sp://ads/v1/targeting").build();
        q.resolve(bundle, new JsonCallbackReceiver(o, com/spotify/mobile/android/spotlets/ads/model/Targeting) {

            private BannerAdActivity a;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, "Ad Targetings failed to load", new Object[0]);
                BannerAdActivity.f(a);
            }

            protected final void onResolved(Response response, Object obj)
            {
                response = (Targeting)obj;
                if (response != null)
                {
                    BannerAdActivity.a(a, response.getCustomTargetings());
                }
                BannerAdActivity.f(a);
            }

            
            {
                a = BannerAdActivity.this;
                super(handler, class1);
            }
        });
    }

    protected void onDestroy()
    {
        r.a.a();
        q.destroy();
        super.onDestroy();
    }

    protected void onPause()
    {
        r.a.c();
        o.removeCallbacks(p);
        super.onPause();
        h();
    }

    protected void onResume()
    {
        super.onResume();
        r.a.d();
        edq edq1 = n;
        fop.a(this, new dnd(edq1.a, null, "event_started", "", edq1.b, 0L));
    }

}
