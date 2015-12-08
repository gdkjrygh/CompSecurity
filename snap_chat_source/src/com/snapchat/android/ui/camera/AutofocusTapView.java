// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.camera;

import Jo;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import br;

public class AutofocusTapView extends View
{

    public long a;
    public int b;
    public boolean c;
    public Runnable d;
    private final Paint e = new Paint();
    private final Paint f = new Paint();
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private final float m;
    private final AccelerateDecelerateInterpolator n;
    private final DecelerateInterpolator o;
    private final Interpolator p;

    public AutofocusTapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = true;
        d = new Runnable() {

            private AutofocusTapView a;

            public final void run()
            {
                a.invalidate();
            }

            
            {
                a = AutofocusTapView.this;
                super();
            }
        };
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.FILL);
        f.setAntiAlias(true);
        f.setStyle(android.graphics.Paint.Style.STROKE);
        setLayerType(1, f);
        b = (int)context.getResources().getDimension(0x7f0a0101);
        n = new AccelerateDecelerateInterpolator(context, attributeset);
        o = new DecelerateInterpolator(context, attributeset);
        int i1;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            attributeset = new PathInterpolator(0.0F, 0.0F, 0.0F, 1.0F);
        } else
        {
            attributeset = new br();
        }
        p = attributeset;
        m = Jo.a(1.0F, context);
        i1 = (int)getContext().getResources().getDimension(0x7f0a0012);
        g = i1 / 2;
        h = i1 / 2;
    }

    public void onDraw(Canvas canvas)
    {
        long l1 = SystemClock.elapsedRealtime() - a;
        if (c)
        {
            invalidate();
        }
        if ((float)l1 < 167F)
        {
            l = Math.round(255F * p.getInterpolation((float)l1 / 167F));
        } else
        if ((float)l1 < 668F)
        {
            l = 255;
        } else
        if ((float)l1 < 835F)
        {
            l = Math.round(255F * n.getInterpolation((167F - ((float)l1 - 668F)) / 167F));
        } else
        {
            removeCallbacks(d);
            c = false;
            setVisibility(4);
        }
        if ((float)l1 < 334F)
        {
            j = (float)b * (p.getInterpolation((float)l1 / 334F) * 0.5F + 0.5F);
        } else
        if ((float)l1 < 501F)
        {
            j = (float)b * (0.17F * n.getInterpolation((167F - ((float)l1 - 334F)) / 167F) + 0.83F);
        } else
        {
            j = (float)b * 0.83F;
        }
        if ((float)l1 < 167F)
        {
            k = Math.round(102F * o.getInterpolation((float)l1 / 167F));
        } else
        if ((float)l1 < 501F)
        {
            k = Math.round(102F * n.getInterpolation((334F - ((float)l1 - 167F)) / 334F));
        } else
        {
            k = 0;
        }
        if ((float)l1 < 334F)
        {
            float f1 = b;
            i = p.getInterpolation((float)l1 / 334F) * f1;
        } else
        {
            i = b;
        }
        f.setColor(-1);
        f.setAlpha(l);
        f.setStrokeWidth(m);
        if (l > 0)
        {
            f.setShadowLayer(j * 0.05F, 0.0F, 0.0F, 0xffcccccc);
        }
        canvas.drawCircle(g, h, j, f);
        e.setColor(-1);
        e.setAlpha(k);
        canvas.drawCircle(g, h, i, e);
    }
}
