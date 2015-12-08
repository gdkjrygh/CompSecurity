// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;
import com.pandora.radio.data.aa;
import java.security.InvalidParameterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p.bz.f;
import p.cw.c;
import p.cw.d;
import p.dd.ap;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bg;
import p.dd.bh;

public class TunerControlLayout extends LinearLayout
{

    static final SimpleDateFormat a;
    static Date b = new Date();
    private ImageButton c;
    private ImageButton d;
    private ThumbImageButton e;
    private ThumbImageButton f;
    private ImageButton g;
    private ProgressBar h;
    private TextView i;
    private TextView j;
    private TextView k;
    private aa l;
    private boolean m;
    private com.pandora.android.ads.c.a n;
    private android.view.View.OnClickListener o = new android.view.View.OnClickListener() {

        final TunerControlLayout a;

        public void onClick(View view)
        {
            ae.b(TunerControlLayout.a(a), com.pandora.android.view.TunerControlLayout.b(a));
        }

            
            {
                a = TunerControlLayout.this;
                super();
            }
    };
    private android.view.View.OnClickListener p = new android.view.View.OnClickListener() {

        final TunerControlLayout a;

        public void onClick(View view)
        {
            ae.a(com.pandora.android.view.TunerControlLayout.c(a), com.pandora.android.view.TunerControlLayout.b(a));
        }

            
            {
                a = TunerControlLayout.this;
                super();
            }
    };
    private android.view.View.OnClickListener q = new android.view.View.OnClickListener() {

        final TunerControlLayout a;

        public void onClick(View view)
        {
            ae.a(com.pandora.android.view.TunerControlLayout.b(a));
        }

            
            {
                a = TunerControlLayout.this;
                super();
            }
    };
    private android.view.View.OnClickListener r = new android.view.View.OnClickListener() {

        final TunerControlLayout a;

        public void onClick(View view)
        {
            ae.b(com.pandora.android.view.TunerControlLayout.b(a));
        }

            
            {
                a = TunerControlLayout.this;
                super();
            }
    };

    public TunerControlLayout(Context context)
    {
        this(context, null);
    }

    public TunerControlLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        m = false;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0400b8, this, true);
    }

    static ThumbImageButton a(TunerControlLayout tunercontrollayout)
    {
        return tunercontrollayout.f;
    }

    private void a(long l1, int i1)
    {
        if (h != null && j != null && !m)
        {
            int j1 = (int)l1;
            h.setMax(j1 / 1000);
            h.setProgress(i1 / 1000);
            b.setTime(i1);
            i.setText(a.format(b));
            b.setTime(l1 - (long)i1);
            j.setText((new StringBuilder()).append("-").append(a.format(b)).toString());
        }
    }

    private void a(boolean flag, String s)
    {
        if (flag)
        {
            if (k != null)
            {
                k.setText(getContext().getString(0x7f0800c5, new Object[] {
                    s
                }));
                k.setVisibility(0);
                i.setVisibility(8);
                j.setVisibility(8);
            }
        } else
        if (k != null)
        {
            k.setText(null);
            k.setVisibility(8);
            i.setVisibility(0);
            j.setVisibility(0);
            return;
        }
    }

    static com.pandora.android.ads.c.a b(TunerControlLayout tunercontrollayout)
    {
        return tunercontrollayout.n;
    }

    static ThumbImageButton c(TunerControlLayout tunercontrollayout)
    {
        return tunercontrollayout.e;
    }

    private void d()
    {
        h = (ProgressBar)findViewById(0x7f1002ef);
        i = (TextView)findViewById(0x7f1002ec);
        j = (TextView)findViewById(0x7f1002f0);
        k = (TextView)findViewById(0x7f1002ee);
        c = (ImageButton)findViewById(0x7f1002e8);
        d = (ImageButton)findViewById(0x7f1002e9);
        e = (ThumbImageButton)findViewById(0x7f1002e6);
        f = (ThumbImageButton)findViewById(0x7f1002e5);
        g = (ImageButton)findViewById(0x7f1002f1);
    }

    private void setEnableVolume(boolean flag)
    {
        if (g != null)
        {
            g.setEnabled(flag);
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
            b().setPreventFeedback(flag);
            c().setPreventFeedback(flag);
            ae.a(bh1.E(), f, e, bh1);
        }
    }

    public ImageButton a()
    {
        return d;
    }

    public ThumbImageButton b()
    {
        return e;
    }

    public ThumbImageButton c()
    {
        return f;
    }

    public void onAttachedToWindow()
    {
        if (!isInEditMode())
        {
            d();
            b.a.b().b(this);
            b.a.e().c(this);
        }
        super.onAttachedToWindow();
    }

    public void onChromecastConnected(f f1)
    {
        a(f1.a, f1.b);
    }

    public void onDetachedFromWindow()
    {
        if (!isInEditMode())
        {
            b.a.b().c(this);
            b.a.e().b(this);
        }
        super.onDetachedFromWindow();
    }

    public void onSkipTrack(ap ap1)
    {
        if (p.cw.d.b(ap1.c))
        {
            setEnableTunerControls(false);
        }
    }

    public void onThumbDown(bb bb1)
    {
        while (p.cw.d.a(bb1.a) || bb1.c) 
        {
            return;
        }
        ae.a(-1, f, e, bb1.b);
    }

    public void onThumbRevert(bc bc1)
    {
        ae.a(bc1.b, f, e, bc1.a);
    }

    public void onThumbUp(bd bd1)
    {
        while (p.cw.d.a(bd1.a) || bd1.c) 
        {
            return;
        }
        ae.a(1, f, e, bd1.b);
    }

    public void onTrackElapsedTime(bg bg1)
    {
        a(bg1.b, bg1.a * 1000);
    }

    public void onTrackState(bh bh1)
    {
        boolean flag3 = false;
        boolean flag1 = false;
        l = bh1.b;
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[p.dd.bh.a.values().length];
                try
                {
                    a[p.dd.bh.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[p.dd.bh.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.bh.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.bh.a.d.ordinal()] = 4;
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

        boolean flag;
        if (l != null && l.M())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        switch (_cls5.a[bh1.a.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onTrackState called with unknown TrackStateRadioEvent state : ").append(bh1.a).toString());

        case 1: // '\001'
        case 2: // '\002'
            a(0L, 0);
            setEnableTunerControls(true);
            return;

        case 3: // '\003'
            ae.a(false, c);
            ImageButton imagebutton = a();
            if (!flag)
            {
                flag1 = true;
            }
            imagebutton.setEnabled(flag1);
            setFeedbackControls(bh1);
            setEnableVolume(true);
            return;

        case 4: // '\004'
            ae.a(true, c);
            ImageButton imagebutton1 = a();
            boolean flag2 = flag3;
            if (!flag)
            {
                flag2 = true;
            }
            imagebutton1.setEnabled(flag2);
            setFeedbackControls(bh1);
            setEnableVolume(true);
            return;

        case 5: // '\005'
            a(0L, 0);
            setEnableTunerControls(false);
            return;
        }
    }

    public void setEnableTunerControls(boolean flag)
    {
        c.setEnabled(flag);
        d.setEnabled(flag);
        e.setEnabled(flag);
        f.setEnabled(flag);
        setEnableVolume(flag);
    }

    static 
    {
        a = new SimpleDateFormat("m:ss", Locale.US);
        a.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
