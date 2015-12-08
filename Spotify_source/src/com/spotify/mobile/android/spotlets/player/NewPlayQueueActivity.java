// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.SleepTimerView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.queue.QueueManager;
import com.spotify.mobile.android.ui.contextmenu.delegates.flags.ShowRemoveFromQueue;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import dmz;
import dwh;
import dxc;
import dzz;
import edb;
import edd;
import ezm;
import ezv;
import ezz;
import faa;
import fab;
import faq;
import far;
import fat;
import fou;
import fuf;
import fuj;
import fve;
import fvh;
import fvi;
import fvk;
import fvl;
import fvn;
import fvp;
import fvq;
import fvr;
import fvs;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;
import fyd;
import fyw;
import ggn;
import gng;
import gni;
import gnl;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.player:
//            PlayQueueAdapter

public class NewPlayQueueActivity extends fou
    implements fab
{

    private ImageButton d;
    private PlayQueueAdapter i;
    private Flags j;
    private FeatureIdentifier k;
    private SleepTimerView l;
    private dwh m;
    private ezv n;
    private edb o;
    private dxc p;
    private DeferredResolver q;
    private faa r;
    private faq s;
    private android.widget.AdapterView.OnItemClickListener t;

    public NewPlayQueueActivity()
    {
        dmz.a(edd);
        o = edd.a(this);
        t = new android.widget.AdapterView.OnItemClickListener() {

            private NewPlayQueueActivity a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
                adapterview = NewPlayQueueActivity.a(a);
                if (i1 != 0)
                {
                    view = ((faa) (adapterview)).b.a(i1);
                    boolean flag = ((faa) (adapterview)).b.b(i1);
                    ((faa) (adapterview)).c.skipToFutureTrack(view);
                    if (flag)
                    {
                        ((faa) (adapterview)).a.h();
                    }
                }
            }

            
            {
                a = NewPlayQueueActivity.this;
                super();
            }
        };
    }

    public static faa a(NewPlayQueueActivity newplayqueueactivity)
    {
        return newplayqueueactivity.r;
    }

    public final void a(SpotifyContextMenu spotifycontextmenu, ezm ezm1)
    {
        fve.a(this).e(ezm1.c, ezm1.b).a(ezm1.d).a(ViewUri.N).b(ezm1.e).d(ezm1.f).e(ezm1.g).f(false).a(ezm1.h, Integer.valueOf(ezm1.a)).a(j).a(spotifycontextmenu);
    }

    public final void a(SpotifyContextMenu spotifycontextmenu, fat fat1)
    {
        fwv fwv1 = fve.a(this).a(fat1.c, fat1.b).a(ViewUri.N).a(fat1.d).a(fat1.e).a(fat1.f).a(false, null).a(j);
        boolean flag = fat1.g;
        int i1 = fat1.a;
        if (flag)
        {
            fat1 = ShowRemoveFromQueue.a;
        } else
        {
            fat1 = ShowRemoveFromQueue.b;
        }
        fwv1.l = fat1;
        fwv1.m = Optional.b(Integer.valueOf(i1));
        fwv1.a(spotifycontextmenu);
    }

    public final void a(ezz ezz)
    {
        PlayQueueAdapter playqueueadapter = i;
        playqueueadapter.a = ezz;
        playqueueadapter.notifyDataSetChanged();
    }

    public final edb c()
    {
        return o;
    }

    public final void f()
    {
        l.a();
        l.setVisibility(8);
        com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets timerpresets = com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets.a;
        throw new NullPointerException();
    }

    public final void g()
    {
        DebugFlag debugflag = DebugFlag.k;
    }

    public final void h()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030123);
        p = new dxc(this);
        j = fyw.a(this);
        k = gnl.a(getIntent());
        i = new PlayQueueAdapter(this, new fuj() {

            private NewPlayQueueActivity a;

            public final volatile void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (Pair)obj;
                NewPlayQueueActivity.a(a).a(spotifycontextmenu, ((Pair) (obj)));
            }

            
            {
                a = NewPlayQueueActivity.this;
                super();
            }
        });
        q = Cosmos.getResolver(this);
        bundle = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        new QueueManager(q, bundle);
        dmz.a(dzz);
        m = dzz.a(this);
        n = new ezv(this, (byte)0);
        dmz.a(far);
        s = far.a(this);
        l = (SleepTimerView)findViewById(0x7f1104ad);
        bundle = (ListView)findViewById(0x102000a);
        bundle.setAdapter(i);
        bundle.setOnItemClickListener(t);
        bundle.setOnItemLongClickListener(new fuf(this));
        bundle = DebugFlag.k;
        d = (ImageButton)findViewById(0x7f1102b9);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private NewPlayQueueActivity a;

            public final void onClick(View view)
            {
                NewPlayQueueActivity.a(a).a.h();
            }

            
            {
                a = NewPlayQueueActivity.this;
                super();
            }
        });
        ((TextView)findViewById(0x7f11026e)).setText(getString(0x7f080402).toUpperCase(Locale.getDefault()));
        d.setImageDrawable(fyd.e(this));
        super.e = ggn.a(this, ViewUri.N);
    }

    protected void onDestroy()
    {
        q.destroy();
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        unregisterReceiver(n);
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        bundle = DebugFlag.k;
    }

    protected void onResume()
    {
        super.onResume();
        DebugFlag debugflag = DebugFlag.k;
        registerReceiver(n, new IntentFilter("sleep_timer_cancelled"));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        DebugFlag debugflag = DebugFlag.k;
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        q.connect();
        r = new faa(((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(q, ViewUri.N.toString(), FeatureIdentifier.aB, k), this, p, m, s);
        faa faa1 = r;
        faa1.a.a(faa1.b);
        faa1.c.registerPlayerStateObserver(faa1.f, 0, 100);
        faa1.d.a();
        faa1.d.a(faa1.h);
        faa1.e.a();
    }

    protected void onStop()
    {
        super.onStop();
        faa faa1 = r;
        faa1.a.g();
        faa1.c.unregisterPlayerStateObserver(faa1.f);
        faa1.d.b(faa1.h);
        faa1.d.b();
        faa1.e.b();
        q.disconnect();
    }
}
