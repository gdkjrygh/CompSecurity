// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.j;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p.dd.ap;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bg;
import p.dd.bh;
import p.l.c;
import p.l.d;
import p.l.g;
import p.s.b;

public class MiniPlayerView extends RelativeLayout
    implements j, com.pandora.android.ads.c.a
{

    private static final SimpleDateFormat a;
    private com.pandora.android.activity.j.a b;
    private ThumbImageButton c;
    private ThumbImageButton d;
    private ImageButton e;
    private ImageButton f;
    private ImageButton g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private aa k;
    private boolean l;
    private View m;
    private ProgressBar n;
    private TextView o;
    private TextView p;
    private Date q;
    private boolean r;
    private android.view.View.OnClickListener s = new android.view.View.OnClickListener() {

        final MiniPlayerView a;

        public void onClick(View view)
        {
            a.a((Activity)a.getContext(), com.pandora.android.view.MiniPlayerView.b(a));
            com.pandora.android.view.MiniPlayerView.b(a).setEnabled(false);
            ae.b(com.pandora.android.view.MiniPlayerView.b(a), a);
        }

            
            {
                a = MiniPlayerView.this;
                super();
            }
    };
    private android.view.View.OnClickListener t = new android.view.View.OnClickListener() {

        final MiniPlayerView a;

        public void onClick(View view)
        {
            a.a((Activity)a.getContext(), com.pandora.android.view.MiniPlayerView.c(a));
            com.pandora.android.view.MiniPlayerView.c(a).setEnabled(false);
            ae.a(com.pandora.android.view.MiniPlayerView.c(a), a);
        }

            
            {
                a = MiniPlayerView.this;
                super();
            }
    };
    private android.view.View.OnClickListener u = new android.view.View.OnClickListener() {

        final MiniPlayerView a;

        public void onClick(View view)
        {
            ae.a(a);
        }

            
            {
                a = MiniPlayerView.this;
                super();
            }
    };
    private android.view.View.OnClickListener v = new android.view.View.OnClickListener() {

        final MiniPlayerView a;

        public void onClick(View view)
        {
            ae.b(a);
        }

            
            {
                a = MiniPlayerView.this;
                super();
            }
    };

    public MiniPlayerView(Context context)
    {
        super(context);
        r = true;
        a();
    }

    public MiniPlayerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        r = true;
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.MiniPlayer);
        boolean flag = context.getBoolean(0, r);
        context.recycle();
        a();
        a(flag);
    }

    public MiniPlayerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        r = true;
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.MiniPlayer);
        boolean flag = context.getBoolean(0, r);
        context.recycle();
        a();
        a(flag);
    }

    static TextView a(MiniPlayerView miniplayerview)
    {
        return miniplayerview.p;
    }

    private void a(long l1, int i1)
    {
        if (r)
        {
            if (q == null)
            {
                q = new Date();
            }
            int j1 = (int)l1;
            n.setMax(j1 / 1000);
            n.setProgress(i1 / 1000);
            if (p.getVisibility() == 0)
            {
                q.setTime(i1);
                p.setText(a.format(q));
            }
            if (o.getVisibility() == 0)
            {
                q.setTime(l1 - (long)i1);
                o.setText((new StringBuilder()).append("-").append(a.format(q)).toString());
                return;
            }
        }
    }

    static ThumbImageButton b(MiniPlayerView miniplayerview)
    {
        return miniplayerview.d;
    }

    private void b()
    {
        if (!r)
        {
            View view = findViewById(0x7f1001a6);
            int i1 = view.getMeasuredHeight();
            view.setVisibility(8);
            view = findViewById(0x7f1001a5);
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            int j1 = getContext().getResources().getDimensionPixelOffset(0x7f090021);
            if (layoutparams != null)
            {
                layoutparams.height = j1 - i1;
                view.setLayoutParams(layoutparams);
            }
        }
    }

    static ThumbImageButton c(MiniPlayerView miniplayerview)
    {
        return miniplayerview.c;
    }

    private void c()
    {
        if (j == null || k == null)
        {
            return;
        }
        j.setText(k.t());
        i.setText(k.s());
        int i1 = k.E();
        if (i1 == 1)
        {
            d.setChecked(false);
            c.setChecked(true);
            return;
        }
        if (i1 == -1)
        {
            d.setChecked(true);
            c.setChecked(false);
            return;
        } else
        {
            d.setChecked(false);
            c.setChecked(false);
            return;
        }
    }

    private void d()
    {
        if (k == null)
        {
            return;
        } else
        {
            p.l.g.b(getContext()).a(k.v()).a(b.c).a(0x7f0200e9).a(h);
            return;
        }
    }

    private void setFeedbackControls(bh bh1)
    {
        bh1 = bh1.b;
        if (bh1 != null)
        {
            boolean flag;
            if (!bh1.B())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c.setPreventFeedback(flag);
            d.setPreventFeedback(flag);
            ae.a(bh1.E(), d, c, bh1);
        }
    }

    protected void a()
    {
        LayoutInflater.from(getContext()).inflate(0x7f040065, this, true);
        n = (ProgressBar)findViewById(0x7f1001a8);
        d = (ThumbImageButton)findViewById(0x7f1001ab);
        c = (ThumbImageButton)findViewById(0x7f1001ac);
        e = (ImageButton)findViewById(0x7f1001ad);
        f = (ImageButton)findViewById(0x7f1001ae);
        m = findViewById(0x7f1001b0);
        h = (ImageView)findViewById(0x7f1000d8);
        j = (TextView)findViewById(0x7f1000da);
        i = (TextView)findViewById(0x7f100044);
        g = (ImageButton)findViewById(0x7f1001af);
        n = (ProgressBar)findViewById(0x7f1001a8);
        p = (TextView)findViewById(0x7f1001a7);
        o = (TextView)findViewById(0x7f1001a9);
        e.setOnClickListener(u);
        f.setOnClickListener(v);
        c.setOnClickListener(t);
        d.setOnClickListener(s);
        g.setOnClickListener(u);
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final MiniPlayerView a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.C().a(new PandoraIntent("show_now_playing"));
                a.setDisplayMode(com.pandora.android.activity.j.a.a);
            }

            
            {
                a = MiniPlayerView.this;
                super();
            }
        });
        setDisplayMode(com.pandora.android.activity.j.a.a);
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f1001a6);
        linearlayout.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(linearlayout) {

            final LinearLayout a;
            final MiniPlayerView b;

            public void onGlobalLayout()
            {
                android.widget.RelativeLayout.LayoutParams layoutparams;
                int i1;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else
                {
                    a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                i1 = MiniPlayerView.a(b).getHeight();
                layoutparams = (android.widget.RelativeLayout.LayoutParams)a.getLayoutParams();
                layoutparams.height = i1;
                a.setLayoutParams(layoutparams);
            }

            
            {
                b = MiniPlayerView.this;
                a = linearlayout;
                super();
            }
        });
    }

    protected void a(Activity activity, ThumbImageButton thumbimagebutton)
    {
        p.bv.c.a(activity, thumbimagebutton);
    }

    protected void a(boolean flag)
    {
        r = flag;
        b();
    }

    public void b(String s1)
    {
        Activity activity = (Activity)getContext();
        if (activity == null)
        {
            return;
        }
        if (!(activity instanceof com.pandora.android.ads.c.a))
        {
            throw new IllegalStateException("Hosting activity must implement AdManager.AdInteractionListener");
        } else
        {
            ((com.pandora.android.ads.c.a)activity).b(s1);
            return;
        }
    }

    public com.pandora.android.activity.j.a getDisplayMode()
    {
        return b;
    }

    public View getThumbDown()
    {
        return d;
    }

    public View getThumbUp()
    {
        return c;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            com.pandora.android.provider.b.a.b().b(this);
            com.pandora.android.provider.b.a.e().c(this);
            return;
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            c = null;
            d = null;
            h = null;
            com.pandora.android.provider.b.a.b().c(this);
            com.pandora.android.provider.b.a.e().b(this);
            return;
        }
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.b(ap1.c))
        {
            setDisplayMode(com.pandora.android.activity.j.a.d);
        }
    }

    public void onThumbDown(bb bb1)
    {
        while (p.cw.d.a(bb1.a) || bb1.c) 
        {
            return;
        }
        ae.a(-1, d, c, bb1.b);
    }

    public void onThumbRevert(bc bc1)
    {
        if (!bc1.c)
        {
            ae.a(bc1.b, d, c, bc1.a);
        }
    }

    public void onThumbUp(bd bd1)
    {
        while (p.cw.d.a(bd1.a) || bd1.c) 
        {
            return;
        }
        ae.a(1, d, c, bd1.b);
    }

    public void onTrackElapsedTime(bg bg1)
    {
        a(bg1.b, bg1.a * 1000);
    }

    public void onTrackState(bh bh1)
    {
        boolean flag4 = true;
        boolean flag3 = true;
        k = bh1.b;
        static class _cls7
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[com.pandora.android.activity.j.a.values().length];
                try
                {
                    a[com.pandora.android.activity.j.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.activity.j.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.activity.j.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.activity.j.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        boolean flag;
        if (k != null && k.M())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        switch (com.pandora.android.view._cls7.b[bh1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onTrackState called with unknown TrackStateRadioEvent state : ").append(bh1.a).toString());

        case 1: // '\001'
            a(0L, 0);
            setDisplayMode(com.pandora.android.activity.j.a.d);
            return;

        case 2: // '\002'
            if (l)
            {
                bh1 = com.pandora.android.activity.j.a.c;
            } else
            {
                bh1 = com.pandora.android.activity.j.a.a;
            }
            setDisplayMode(bh1);
            a(0L, 0);
            c();
            return;

        case 3: // '\003'
            ae.a(false, e);
            ae.a(false, g);
            ImageButton imagebutton = f;
            boolean flag1;
            if (!l)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            setFeedbackControls(bh1);
            return;

        case 4: // '\004'
            ae.a(true, e);
            ae.a(true, g);
            ImageButton imagebutton1 = f;
            boolean flag2;
            if (!l)
            {
                flag2 = flag4;
            } else
            {
                flag2 = false;
            }
            imagebutton1.setEnabled(flag2);
            setFeedbackControls(bh1);
            return;

        case 5: // '\005'
            a(0L, 0);
            setDisplayMode(com.pandora.android.activity.j.a.d);
            return;
        }
    }

    public void setDisplayMode(com.pandora.android.activity.j.a a1)
    {
        b = a1;
        switch (_cls7.a[b.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown DisplayMode : ").append(a1).toString());

        case 1: // '\001'
            m.setVisibility(8);
            g.setVisibility(8);
            g.setEnabled(false);
            boolean flag;
            if (k != null)
            {
                if (k.l() != ac.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = true;
            }
            d.setEnabled(flag);
            c.setEnabled(flag);
            e.setEnabled(true);
            f.setEnabled(true);
            d.setVisibility(0);
            c.setVisibility(0);
            e.setVisibility(0);
            f.setVisibility(0);
            setShowProgressTime(true);
            return;

        case 2: // '\002'
            m.setVisibility(0);
            g.setVisibility(0);
            g.setEnabled(true);
            d.setEnabled(false);
            c.setEnabled(false);
            e.setEnabled(false);
            f.setEnabled(false);
            d.setVisibility(8);
            c.setVisibility(8);
            e.setVisibility(8);
            f.setVisibility(8);
            setShowProgressTime(false);
            c();
            d();
            return;

        case 3: // '\003'
            m.setVisibility(8);
            g.setVisibility(8);
            g.setEnabled(false);
            d.setVisibility(0);
            c.setVisibility(0);
            e.setVisibility(0);
            f.setVisibility(0);
            d.setEnabled(false);
            c.setEnabled(false);
            e.setEnabled(true);
            f.setEnabled(false);
            setShowProgressTime(true);
            return;

        case 4: // '\004'
            m.setVisibility(8);
            g.setVisibility(8);
            g.setEnabled(false);
            d.setEnabled(false);
            c.setEnabled(false);
            e.setEnabled(false);
            f.setEnabled(false);
            d.setVisibility(0);
            c.setVisibility(0);
            e.setVisibility(0);
            f.setVisibility(0);
            setShowProgressTime(true);
            return;
        }
    }

    public void setShowProgressTime(boolean flag)
    {
        if (!r)
        {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)n.getLayoutParams();
        if (flag)
        {
            p.setVisibility(0);
            o.setVisibility(0);
            layoutparams.gravity = 17;
        } else
        {
            p.setVisibility(8);
            o.setVisibility(8);
            layoutparams.gravity = 48;
        }
        n.setLayoutParams(layoutparams);
    }

    static 
    {
        a = new SimpleDateFormat("m:ss", Locale.US);
        a.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
