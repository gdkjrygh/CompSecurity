// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Bt;
import Jo;
import SF;
import SG;
import SH;
import SX;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

public class SponsoredSlugView extends TextView
{

    public int a;
    private final Context b;
    private final Bt c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private String m;

    public SponsoredSlugView(Context context)
    {
        this(context, Bt.a());
    }

    protected SponsoredSlugView(Context context, Bt bt)
    {
        super(context);
        d = -1;
        m = "";
        b = context;
        c = bt;
    }

    public SponsoredSlugView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, Bt.a());
    }

    protected SponsoredSlugView(Context context, AttributeSet attributeset, Bt bt)
    {
        super(context, attributeset);
        d = -1;
        m = "";
        b = context;
        c = bt;
    }

    private static float a(String s)
    {
        return Float.valueOf(s.replaceFirst("dp", "")).floatValue();
    }

    private void a(SG sg, boolean flag)
    {
        if (!sg.g()) goto _L2; else goto _L1
_L1:
        SG.a a1 = sg.f();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[SG.a.values().length];
                try
                {
                    a[SG.a.TOP_LEFT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SG.a.TOP_CENTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SG.a.TOP_RIGHT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SG.a.BOTTOM_LEFT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SG.a.BOTTOM_CENTER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 56
    //                   1 159
    //                   2 173
    //                   3 187
    //                   4 201
    //                   5 215;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_215;
_L3:
        e = 5;
        a = 80;
_L2:
        if (sg.i())
        {
            f = (int)Jo.a(false, a(sg.h()), b);
        }
        if (sg.k())
        {
            g = (int)Jo.a(true, a(sg.j()), b);
        }
        if (flag)
        {
            if (sg.q())
            {
                m = sg.p();
            }
        } else
        if (sg.m())
        {
            m = sg.l();
        }
        if (sg.s())
        {
            d = sg.r().intValue();
        }
        return;
_L4:
        e = 3;
        a = 48;
          goto _L2
_L5:
        e = 1;
        a = 48;
          goto _L2
_L6:
        e = 5;
        a = 48;
          goto _L2
_L7:
        e = 3;
        a = 80;
          goto _L2
        e = 1;
        a = 80;
          goto _L2
    }

    private void a(SH sh)
    {
        if (sh.b())
        {
            j = Float.valueOf(sh.a().replaceFirst("pt", "")).floatValue();
        }
        if (sh.d())
        {
            h = b(sh.c());
        }
        if (sh.h())
        {
            SX sx = sh.g();
            if (sx.b())
            {
                k = Jo.a(false, a(sx.a()), b);
            }
            if (sx.d())
            {
                l = Jo.a(true, a(sx.c()), b);
            }
        }
        if (sh.f())
        {
            i = b(sh.e());
        }
    }

    private static int b(String s)
    {
        return Color.parseColor(s.replaceFirst("0x", "#"));
    }

    public final void a()
    {
        setVisibility(0);
        if (d >= 0)
        {
            animate().alpha(0.0F).setStartDelay(500L).setDuration(d);
        }
    }

    public final void a(boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams;
        int i1;
        setText(m);
        setTextSize(j);
        setTextColor(h);
        setShadowLayer(1.0F, k, l, i);
        int j1 = e | a;
        i1 = j1;
        if (flag)
        {
            setGravity(j1);
            i1 = Jo.a(j1, Jo.j(b));
            measure(0, 0);
            j1 = getMeasuredWidth();
            int i2 = getMeasuredHeight();
            android.widget.FrameLayout.LayoutParams layoutparams1;
            if (j1 > i2)
            {
                setHeight(j1);
                setWidth(j1);
            } else
            {
                setHeight(i2);
                setWidth(i2);
            }
            setRotation(360 - Jo.a(Jo.e(b)));
        }
        layoutparams = getLayoutParams();
        if (!(layoutparams instanceof android.widget.FrameLayout.LayoutParams)) goto _L2; else goto _L1
_L1:
        layoutparams1 = (android.widget.FrameLayout.LayoutParams)layoutparams;
        layoutparams1.gravity = i1;
        if (e == 3)
        {
            layoutparams1.leftMargin = f;
        }
        if (e == 5)
        {
            layoutparams1.rightMargin = f;
        }
        if (a == 48)
        {
            layoutparams1.topMargin = g;
        }
        if (a == 80)
        {
            layoutparams1.bottomMargin = g;
        }
_L4:
        setLayoutParams(layoutparams);
        return;
_L2:
        if (layoutparams instanceof android.widget.RelativeLayout.LayoutParams)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams2 = (android.widget.RelativeLayout.LayoutParams)layoutparams;
            for (int k1 = 9; k1 <= 15; k1++)
            {
                layoutparams2.addRule(k1, 0);
            }

            int l1 = Jo.g(i1);
            i1 = Jo.h(i1);
            layoutparams2.addRule(l1);
            layoutparams2.addRule(i1);
            if (Jo.f(b))
            {
                layoutparams2.leftMargin = f;
                layoutparams2.rightMargin = f;
                layoutparams2.topMargin = g;
                layoutparams2.bottomMargin = g;
            } else
            {
                layoutparams2.bottomMargin = f;
                layoutparams2.topMargin = f;
                layoutparams2.leftMargin = g;
                layoutparams2.rightMargin = g;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        animate().cancel();
        setAlpha(1.0F);
        setVisibility(8);
    }

    public void setHorizontalMargin(int i1)
    {
        f = i1;
    }

    public void setPosAndText(SG sg)
    {
        a(sg, false);
    }

    public void setSponsoredSlugWithDefaultText()
    {
        SF sf = c.bR();
        if (sf != null)
        {
            if (sf.b())
            {
                a(sf.a());
            }
            if (sf.d())
            {
                a(sf.c(), false);
                return;
            }
        }
    }

    public void setSponsoredSlugWithSponsoredChannelText()
    {
        SF sf = c.bR();
        if (sf != null)
        {
            if (sf.b())
            {
                a(sf.a());
            }
            if (sf.d())
            {
                a(sf.c(), true);
                return;
            }
        }
    }

    public void setVerticalMargin(int i1)
    {
        g = i1;
    }
}
