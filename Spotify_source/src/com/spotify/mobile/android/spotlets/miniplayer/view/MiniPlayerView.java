// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.miniplayer.view;

import aav;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.carousel.CarouselLayoutManager;
import com.spotify.android.paste.widget.carousel.CarouselView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.video.VideoSurfaceView;
import dfs;
import dft;
import dgo;
import dmz;
import eqh;
import ety;
import eue;
import fac;
import fad;
import fyd;
import gcg;
import gkk;
import gkl;
import java.util.Map;

public class MiniPlayerView extends FrameLayout
{

    public CarouselView a;
    public ImageButton b;
    public ImageButton c;
    public ProgressBar d;
    public View e;
    public VideoSurfaceView f;
    public gkl g;
    public ConnectView h;
    public eue i;
    public final gkk j;
    public fad k;
    public eqh l;
    private android.view.View.OnClickListener m = new android.view.View.OnClickListener() {

        private MiniPlayerView a;

        public final void onClick(View view)
        {
            if (MiniPlayerView.b(a) == null)
            {
                return;
            }
            switch (view.getId())
            {
            default:
                Assertion.a((new StringBuilder("Unexpected view ID ")).append(view.getId()).toString());
                return;

            case 2131821721: 
                MiniPlayerView.b(a).c();
                return;

            case 2131821722: 
                MiniPlayerView.b(a).d();
                return;

            case 2131821286: 
                MiniPlayerView.b(a).e();
                return;

            case 2131821720: 
                MiniPlayerView.b(a).f();
                return;

            case 2131821713: 
                MiniPlayerView.b(a).f();
                return;

            case 2131821352: 
                MiniPlayerView.b(a).g();
                return;
            }
        }

            
            {
                a = MiniPlayerView.this;
                super();
            }
    };

    public MiniPlayerView(Context context)
    {
        super(context);
        j = new gkk() {

            private MiniPlayerView a;

            public final void a()
            {
                MiniPlayerView.a(a).c().c();
                MiniPlayerView.b(a).a();
            }

            public final void b()
            {
                MiniPlayerView.a(a).c().c();
                MiniPlayerView.b(a).b();
            }

            public final void c()
            {
            }

            public final void d()
            {
            }

            
            {
                a = MiniPlayerView.this;
                super();
            }
        };
    }

    public MiniPlayerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new _cls1();
    }

    static CarouselView a(MiniPlayerView miniplayerview)
    {
        return miniplayerview.a;
    }

    public static boolean a(PlayerState playerstate)
    {
        playerstate = playerstate.track();
        return playerstate != null && playerstate.metadata().containsKey("is_advertisement") && Boolean.valueOf((String)playerstate.metadata().get("is_advertisement")).booleanValue();
    }

    static eue b(MiniPlayerView miniplayerview)
    {
        return miniplayerview.i;
    }

    public final void a(boolean flag)
    {
        i.a(flag);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        Object obj = new fac(getContext());
        Object obj1 = new ColorDrawable(((fac) (obj)).d);
        dfs dfs1 = new dfs();
        dfs1.setColorFilter(((fac) (obj)).e, android.graphics.PorterDuff.Mode.SRC_ATOP);
        dfs1.a(((android.graphics.drawable.Drawable) (obj1)), false);
        ColorDrawable colordrawable = new ColorDrawable(((fac) (obj)).f);
        GradientDrawable gradientdrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            fac.a, fac.b
        });
        k = new fad(((fac) (obj)).c, dfs1, ((ColorDrawable) (obj1)), colordrawable, gradientdrawable);
        dgo.a(this, k);
        a = (CarouselView)findViewById(0x7f1102e1);
        b = (ImageButton)findViewById(0x7f110499);
        c = (ImageButton)findViewById(0x7f11049a);
        findViewById(0x7f110498);
        e = findViewById(0x7f110491);
        f = (VideoSurfaceView)findViewById(0x7f1102e6);
        g = (gkl)dmz.a(gkl);
        h = (ConnectView)findViewById(0x7f110328);
        h.setBackgroundColor(gcg.b(getContext(), 0x7f0f0074));
        d = (ProgressBar)findViewById(0x7f11049b);
        obj = c;
        obj1 = getContext();
        ((ImageButton) (obj)).setImageDrawable(fyd.a(((Context) (obj1)), SpotifyIcon.S, dft.b(16F, ((Context) (obj1)).getResources())));
        b.setOnClickListener(m);
        c.setOnClickListener(m);
        f.setOnClickListener(m);
        e.setOnClickListener(m);
        h.setOnClickListener(m);
        obj = new CarouselLayoutManager(com.spotify.android.paste.widget.carousel.CarouselLayoutManager.MeasureMode.b);
        ((CarouselLayoutManager) (obj)).a(new ety());
        a.a(((abd) (obj)));
        a.a(null);
        l = new eqh(d, new Property(java/lang/Integer, "progress") {

            public final Object get(Object obj2)
            {
                return Integer.valueOf(((ProgressBar)obj2).getProgress());
            }

            public final void set(Object obj2, Object obj3)
            {
                ((ProgressBar)obj2).setProgress(((Integer)obj3).intValue());
            }

        });
    }
}
