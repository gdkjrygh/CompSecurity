// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.stateful.StatefulPlayer;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.spotlets.FeatureIdentifier;
import ctz;
import dmz;
import dvv;
import dwx;
import dxc;
import dxd;
import eqe;
import eqf;
import eqh;
import fiy;
import fln;
import flp;
import flq;
import flr;
import flt;
import fou;
import fud;
import fuj;
import fve;
import fvh;
import fvi;
import fvk;
import fvl;
import fvn;
import fvq;
import fvr;
import fvs;
import gak;
import gbe;
import ggi;
import gkl;
import gnl;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            VideoActivityConfig, VideoPresenter

public class FullscreenVideoActivity extends fou
    implements eqf, flp
{

    flq d;
    private Resolver i;
    private gkl j;
    private VideoPresenter k;
    private dxc l;
    private Flags m;
    private FeatureIdentifier n;
    private Handler o;
    private boolean p;
    private VideoActivityConfig q;
    private PlayerState r;
    private IntentFilter s;
    private dwx t;
    private Runnable u;
    private fln v;
    private Runnable w;
    private final BroadcastReceiver x = new BroadcastReceiver() {

        private FullscreenVideoActivity a;

        public final void onReceive(Context context, Intent intent)
        {
            a.startService(dvv.a(a.getApplicationContext(), "com.spotify.mobile.android.service.action.client.FOREGROUND"));
        }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
    };
    private android.view.View.OnClickListener y;

    public FullscreenVideoActivity()
    {
        j = (gkl)dmz.a(gkl);
        o = new Handler();
        t = new dwx() {

            private FullscreenVideoActivity a;

            public final void a(Flags flags)
            {
                FullscreenVideoActivity.a(a, flags);
                FullscreenVideoActivity.b(a, flags);
            }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
        };
        u = new Runnable() {

            private FullscreenVideoActivity a;

            public final void run()
            {
                VideoActivityConfig videoactivityconfig = FullscreenVideoActivity.a(a);
                FullscreenVideoActivity fullscreenvideoactivity = a;
                videoactivityconfig.a.a(fullscreenvideoactivity);
            }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
        };
        w = new Runnable() {

            private FullscreenVideoActivity a;

            public final void run()
            {
                FullscreenVideoActivity.c(a).b();
            }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
        };
        y = new android.view.View.OnClickListener() {

            private FullscreenVideoActivity a;

            public final void onClick(View view)
            {
                VideoPresenter videopresenter;
                videopresenter = FullscreenVideoActivity.b(a);
                view = (VideoPresenter.Action)view.getTag();
                ctz.a(view);
                VideoPresenter._cls2.a[view.ordinal()];
                JVM INSTR tableswitch 1 9: default 80
            //                           1 104
            //                           2 114
            //                           3 134
            //                           4 152
            //                           5 169
            //                           6 186
            //                           7 206
            //                           8 250
            //                           9 260;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
                throw new IllegalArgumentException((new StringBuilder("Unknown action: ")).append(view).toString());
_L2:
                videopresenter.b.f();
_L12:
                return;
_L3:
                videopresenter.d.b(-15000L);
                videopresenter.b.i();
                return;
_L4:
                videopresenter.d.a(false);
                videopresenter.b.i();
                return;
_L5:
                videopresenter.d.b();
                videopresenter.b.i();
                return;
_L6:
                videopresenter.d.a();
                videopresenter.b.i();
                return;
_L7:
                videopresenter.d.b(15000L);
                videopresenter.b.i();
                return;
_L8:
                view = videopresenter.a.getLastPlayerState();
                if (view == null || view.track() == null) goto _L12; else goto _L11
_L11:
                videopresenter.b.a(view.track());
                videopresenter.b.i();
                return;
_L9:
                videopresenter.b.g();
                return;
_L10:
                videopresenter.b.h();
                return;
            }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
        };
    }

    static VideoActivityConfig a(FullscreenVideoActivity fullscreenvideoactivity)
    {
        return fullscreenvideoactivity.q;
    }

    static Flags a(FullscreenVideoActivity fullscreenvideoactivity, Flags flags)
    {
        fullscreenvideoactivity.m = flags;
        return flags;
    }

    private void a(View view, VideoPresenter.Action action)
    {
        view.setTag(action);
        view.setOnClickListener(y);
    }

    public static VideoPresenter b(FullscreenVideoActivity fullscreenvideoactivity)
    {
        return fullscreenvideoactivity.k;
    }

    static void b(FullscreenVideoActivity fullscreenvideoactivity, Flags flags)
    {
        if (fullscreenvideoactivity.d != null)
        {
            fullscreenvideoactivity = fullscreenvideoactivity.d.g;
            if (fullscreenvideoactivity != null)
            {
                fullscreenvideoactivity.a(flags);
            }
        }
    }

    static flq c(FullscreenVideoActivity fullscreenvideoactivity)
    {
        return fullscreenvideoactivity.d;
    }

    static Flags d(FullscreenVideoActivity fullscreenvideoactivity)
    {
        return fullscreenvideoactivity.m;
    }

    public final void a(long l1)
    {
        flq flq1 = d;
        flq1.e.setText(flt.a((int)(l1 / 1000L)));
        flq1.d.setMax((int)l1);
        flq1.d.refreshDrawableState();
    }

    public final void a(long l1, long l2, float f1)
    {
        d.a(l1, l2, f1);
    }

    public final void a(PlayerTrack playertrack)
    {
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = (new SpotifyLink(playertrack.uri())).c;
        if (linktype != com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            Assertion.a((new StringBuilder("There are no context menu supported for link type ")).append(linktype).toString());
            return;
        } else
        {
            fud.a(this, new fuj() {

                private FullscreenVideoActivity a;

                public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
                {
                    obj = (PlayerTrack)obj;
                    fve.a(a).e(((PlayerTrack) (obj)).uri(), (String)((PlayerTrack) (obj)).metadata().get("title")).a("video".equals(((PlayerTrack) (obj)).metadata().get("media.type"))).a(ViewUri.K).b(true).d(fiy.a(FullscreenVideoActivity.d(a))).e(fiy.d(FullscreenVideoActivity.d(a))).f(false).a(FullscreenVideoActivity.d(a)).a(spotifycontextmenu);
                }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
            }, playertrack);
            return;
        }
    }

    public final void a(String s1, String s2)
    {
        flq flq1 = d;
        String s3 = s1;
        if (s1 == null)
        {
            s3 = "";
        }
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        s2 = new SpannableStringBuilder();
        s2.append(s1);
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s3))
        {
            s2.append(" \u2022 ");
        }
        s2.append(s3);
        s1 = new TextAppearanceSpan(flq1.b, 0x7f0b014a);
        AbsoluteSizeSpan absolutesizespan = new AbsoluteSizeSpan((int)TypedValue.applyDimension(2, 14F, flq1.b.getResources().getDisplayMetrics()));
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(flq1.b, 0x7f0b0135);
        ForegroundColorSpan foregroundcolorspan = new ForegroundColorSpan(-1);
        StyleSpan stylespan = new StyleSpan(1);
        int i1 = s2.length() - s3.length();
        int j1 = s2.length();
        s2.setSpan(s1, 0, i1, 17);
        s2.setSpan(stylespan, 0, i1, 17);
        s2.setSpan(textappearancespan, i1, j1, 17);
        s2.setSpan(foregroundcolorspan, 0, j1, 17);
        s2.setSpan(absolutesizespan, 0, j1, 17);
        flq1.h.setText(s2);
    }

    public final void a_(boolean flag)
    {
        d.a(flag);
    }

    public final void b_(boolean flag)
    {
        d.f.setEnabled(flag);
    }

    public final void c(boolean flag)
    {
        d.k.setEnabled(flag);
    }

    public final void d(boolean flag)
    {
        d.l.setEnabled(flag);
    }

    public final void e(boolean flag)
    {
        d.j.setEnabled(flag);
        d.m.setEnabled(flag);
        d.d.setEnabled(flag);
    }

    public final void f()
    {
        finish();
    }

    public final void f(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 6;
        } else
        {
            byte0 = 7;
        }
        setRequestedOrientation(byte0);
        d.c();
    }

    public final void g()
    {
        if (ggi.a(this))
        {
            q.a(this);
            return;
        } else
        {
            q.b.a(this);
            return;
        }
    }

    public final void h()
    {
        if (ggi.a(this))
        {
            q.a(this);
        }
    }

    public final void i()
    {
        o.removeCallbacks(w);
        o.postDelayed(w, 5000L);
    }

    public final void j()
    {
        o.removeCallbacks(w);
    }

    public final void k()
    {
        if (ggi.b(this))
        {
            d.a();
        }
    }

    public final void l()
    {
        d.i.setVisibility(0);
    }

    public final void m()
    {
        d.i.setVisibility(8);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        o.post(u);
    }

    protected void onCreate(Bundle bundle)
    {
        FontSupport.a(this);
        super.onCreate(bundle);
        q = (VideoActivityConfig)getIntent().getParcelableExtra("video_activity_config");
        if (q == null)
        {
            q = VideoActivityConfig.e;
        }
        p = q.c;
        dmz.a(dxd);
        l = dxd.a(this);
        l.a(t);
        l.a();
        setContentView(0x7f03009f);
        getWindow().addFlags(128);
        d = new flq(this);
        n = gnl.a(getIntent());
        bundle = d;
        gak gak = new gak() {

            private FullscreenVideoActivity a;

            public final void a(SeekBar seekbar)
            {
            }

            public final void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
            {
            }

            public final void onStartTrackingTouch(SeekBar seekbar)
            {
                a.j();
            }

            public final void onStopTrackingTouch(SeekBar seekbar)
            {
                VideoPresenter videopresenter = FullscreenVideoActivity.b(a);
                int i1 = seekbar.getProgress();
                videopresenter.d.a(i1);
                videopresenter.b.i();
                a.i();
            }

            
            {
                a = FullscreenVideoActivity.this;
                super();
            }
        };
        ((flq) (bundle)).r.a = gak;
        if (!q.d)
        {
            d.b();
        }
        a(d.n, VideoPresenter.Action.a);
        a(d.j, VideoPresenter.Action.b);
        a(d.k, VideoPresenter.Action.c);
        a(d.f, VideoPresenter.Action.d);
        a(d.l, VideoPresenter.Action.e);
        a(d.m, VideoPresenter.Action.f);
        a(d.i, VideoPresenter.Action.g);
        a(d.g, VideoPresenter.Action.h);
        a(d.o, VideoPresenter.Action.i);
        s = new IntentFilter("android.intent.action.USER_PRESENT");
        s.addCategory("android.intent.category.DEFAULT");
    }

    protected void onDestroy()
    {
        d.a.a();
        l.b(t);
        l.b();
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
    }

    protected void onStart()
    {
        super.onStart();
        j.a(d.g);
        i = Cosmos.getResolver(this);
        i.connect();
        StatefulPlayer statefulplayer = new StatefulPlayer(((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(i, ViewUri.bQ.toString(), FeatureIdentifier.aC, n));
        k = new VideoPresenter(statefulplayer, this, eqe.a(statefulplayer, this, null), new flr(this));
        boolean flag;
        if (d.q.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i();
        }
        v = new fln(this, this);
        v.enable();
        if (getIntent() != null)
        {
            r = (PlayerState)getIntent().getParcelableExtra("video_activity_player_state");
        }
        if (r != null)
        {
            VideoPresenter videopresenter = k;
            PlayerState playerstate = r;
            videopresenter.f.onPlayerStateReceived(playerstate);
        }
        if (p)
        {
            VideoPresenter videopresenter1 = k;
            videopresenter1.b.f(true);
            videopresenter1.e = true;
            p = false;
        }
        registerReceiver(x, s);
    }

    protected void onStop()
    {
        VideoPresenter videopresenter = k;
        videopresenter.a.unregisterPlayerStateObserver(videopresenter.f);
        i.disconnect();
        i.destroy();
        o.removeCallbacks(w);
        v.disable();
        j.b(d.g);
        unregisterReceiver(x);
        super.onStop();
    }
}
