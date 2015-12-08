// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.ui.activity.upsell.UpsellService;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dmz;
import dwx;
import dxc;
import eda;
import edb;
import eez;
import efa;
import ezw;
import fot;
import fou;
import foz;
import fxw;
import fyw;
import gdo;
import gex;
import gfv;
import ggn;
import gms;

public class PlayerActivity extends fou
    implements eda
{

    private Handler d;
    private String i;
    private Flags j;
    private efa k;
    private Runnable l;
    private Runnable m;
    private final ServiceConnection n = new foz();
    private dxc o;
    private dwx p;

    public PlayerActivity()
    {
        d = new Handler();
        k = new efa() {

            private PlayerActivity a;

            public final void a(Ad ad)
            {
                Context context = a.getApplicationContext();
                Intent intent = new Intent("com.spotify.mobile.android.ui.action.ads.screensaver.SHOW");
                intent.putExtra("screensaver_ad", (Parcelable)ctz.a(ad));
                ad = (new gms((Context)ctz.a(context), intent)).a;
                a.startActivity(ad);
            }

            
            {
                a = PlayerActivity.this;
                super();
            }
        };
        l = new Runnable() {

            private boolean a;
            private PlayerActivity b;

            public final void run()
            {
                if (b.g || a)
                {
                    return;
                }
                a = true;
                ctz.a(PlayerActivity.a(b));
                android.support.v4.app.Fragment fragment = ezw.a(PlayerActivity.a(b), PlayerActivity.b(b));
                fyw.a(fragment, PlayerActivity.a(b));
                aa aa1 = b.a_();
                fxw.a(aa1, PlayerActivity.a(b), com/spotify/mobile/android/ui/activity/PlayerActivity);
                if (aa1.a("player") == null)
                {
                    aa1.a().b(0x7f1102b1, fragment, "player").c();
                }
                b.setVisible(true);
            }

            
            {
                b = PlayerActivity.this;
                super();
            }
        };
        m = new Runnable() {

            private PlayerActivity a;

            public final void run()
            {
                if (a.g)
                {
                    return;
                } else
                {
                    android.support.v4.app.Fragment fragment = a.a_().a("player");
                    fyw.a(fragment, PlayerActivity.a(a));
                    gdo.a(a, fragment);
                    return;
                }
            }

            
            {
                a = PlayerActivity.this;
                super();
            }
        };
        p = new dwx() {

            private PlayerActivity a;

            public final void a(Flags flags)
            {
                boolean flag = gex.a(PlayerActivity.a(a), flags);
                PlayerActivity.a(a, flags);
                PlayerActivity.d(a).post(PlayerActivity.c(a));
                if (flag)
                {
                    PlayerActivity.d(a).post(PlayerActivity.e(a));
                }
            }

            
            {
                a = PlayerActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, String s)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/PlayerActivity);
        context.setFlags(0x4000000);
        context.putExtra("from_entity_uri", s);
        return context;
    }

    static Flags a(PlayerActivity playeractivity)
    {
        return playeractivity.j;
    }

    static Flags a(PlayerActivity playeractivity, Flags flags)
    {
        playeractivity.j = flags;
        return flags;
    }

    static String b(PlayerActivity playeractivity)
    {
        return playeractivity.i;
    }

    static Runnable c(PlayerActivity playeractivity)
    {
        return playeractivity.l;
    }

    static Handler d(PlayerActivity playeractivity)
    {
        return playeractivity.d;
    }

    static Runnable e(PlayerActivity playeractivity)
    {
        return playeractivity.m;
    }

    public final void a(SessionState sessionstate)
    {
        if (sessionstate != null)
        {
            boolean flag = sessionstate.e;
            boolean flag1 = sessionstate.g;
            if (!flag || flag1)
            {
                finish();
                return;
            }
        }
    }

    public void onBackPressed()
    {
        android.support.v4.app.Fragment fragment = a_().a("player");
        if (fragment instanceof fot)
        {
            ((fot)fragment).C_();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        gfv.a(this);
        setContentView(0x7f03002b);
        o = new dxc(this);
        i = getIntent().getStringExtra("from_entity_uri");
        if (bundle == null)
        {
            setVisible(false);
        } else
        {
            bundle.setClassLoader(getClassLoader());
            j = fyw.a(bundle);
        }
        super.e = ggn.a(this, ViewUri.K);
    }

    protected void onPause()
    {
        d.removeCallbacks(l);
        d.removeCallbacks(m);
        ((eez)dmz.a(eez)).g = null;
        super.onPause();
    }

    protected void onResume()
    {
        ((eez)dmz.a(eez)).g = k;
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("FlagsArgumentHelper.Flags", j);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        UpsellService.a(this, n);
        h.a(this);
        o.a();
        o.a(p);
    }

    protected void onStop()
    {
        super.onStop();
        h.b(this);
        o.b(p);
        o.b();
        UpsellService.b(this, n);
    }
}
