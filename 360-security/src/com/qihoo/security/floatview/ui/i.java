// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.nineoldandroids.b.a;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.r;

public class i extends LinearLayout
    implements android.view.animation.Animation.AnimationListener
{

    private static final String a = com/qihoo/security/floatview/ui/i.getSimpleName();
    private final LocaleTextView b = (LocaleTextView)findViewById(0x7f0b0115);
    private final LocaleTextView c = (LocaleTextView)findViewById(0x7f0b0116);
    private final View d = findViewById(0x7f0b0113);
    private final View e = findViewById(0x7f0b0114);
    private final ImageView f = (ImageView)findViewById(0x7f0b0117);
    private final ImageView g = (ImageView)findViewById(0x7f0b0118);
    private final int h = getResources().getColor(0x7f080033);
    private final int i = getResources().getColor(0x7f080032);
    private final Animation j = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
    private Animation k;
    private int l;
    private final Handler m = new Handler() {

        final i a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                a.setMemoryAlpha(0.5F);
                break;
            }
        }

            
            {
                a = i.this;
                super();
            }
    };

    public i(Context context)
    {
        super(context);
        k = null;
        View.inflate(context, 0x7f030050, this);
        setGravity(17);
        setOrientation(0);
        j.setDuration(300L);
        j.setStartOffset(1000L);
        k = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        k.setDuration(300L);
        k.setStartOffset(1000L);
        j.setAnimationListener(this);
        b();
        a();
    }

    public void a()
    {
        if (f.getVisibility() == 0)
        {
            f.startAnimation(k);
            e.startAnimation(j);
        }
    }

    public void a(int i1)
    {
        b.setLocalText((new StringBuilder()).append(i1).append("").toString());
        if (r.a((float)i1 / 100F))
        {
            b.setTextColor(h);
            c.setTextColor(h);
            d.setBackgroundResource(0x7f020082);
            f.setImageResource(0x7f020080);
            return;
        } else
        {
            b.setTextColor(i);
            c.setTextColor(i);
            d.setBackgroundResource(0x7f020081);
            f.setImageResource(0x7f02007f);
            return;
        }
    }

    public void b()
    {
        if (f.getVisibility() == 4)
        {
            f.clearAnimation();
            e.clearAnimation();
            e.setVisibility(4);
            f.setVisibility(0);
        }
    }

    public void c()
    {
        if (f.getVisibility() == 0)
        {
            f.clearAnimation();
            e.clearAnimation();
            e.setVisibility(0);
            f.setVisibility(4);
        }
    }

    public void d()
    {
        d.setVisibility(0);
        g.setVisibility(8);
    }

    public void e()
    {
        d.setVisibility(8);
        g.setVisibility(0);
        setMemoryAlpha(1.0F);
        m.removeMessages(1);
    }

    public void f()
    {
        d.setVisibility(0);
        g.setVisibility(8);
    }

    public void g()
    {
        setMemoryAlpha(1.0F);
        m.removeMessages(1);
        m.sendEmptyMessageDelayed(1, 5000L);
    }

    public int getWidthOnSide()
    {
        return l;
    }

    public void onAnimationEnd(Animation animation)
    {
        f.setVisibility(4);
        e.setVisibility(0);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (d.getVisibility() == 0)
        {
            l = d.getWidth();
        }
    }

    public void setFocus(boolean flag)
    {
    }

    public void setMemoryAlpha(float f1)
    {
        if (getVisibility() == 0)
        {
            com.nineoldandroids.b.a.a(this, f1);
        }
    }

}
