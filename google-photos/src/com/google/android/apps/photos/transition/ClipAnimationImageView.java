// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import iwr;

public class ClipAnimationImageView extends ImageView
{

    public boolean a;
    private int b;
    private float c;
    private int d;
    private int e;
    private float f;
    private Rect g;

    public ClipAnimationImageView(Context context)
    {
        super(context);
    }

    public ClipAnimationImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ClipAnimationImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i, float f1, int j, int k, float f2)
    {
        b = i;
        c = 0.0F;
        d = j;
        e = k;
        f = f2;
        setClipAnimationPosition(0.0F);
    }

    protected void onDraw(Canvas canvas)
    {
        if (g != null)
        {
            canvas.clipRect(g);
        }
        super.onDraw(canvas);
    }

    public void setClipAnimationPosition(float f1)
    {
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        int i1;
        flag = false;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (b == iwr.a && f1 < c)
            {
                setImageAlpha(Math.round((1.0F / c) * f1 * 255F));
            } else
            if (b == iwr.b && f1 > 1.0F - c)
            {
                setImageAlpha(Math.round((1.0F - (f1 - (1.0F - c)) * (1.0F / c)) * 255F));
            } else
            {
                setImageAlpha(255);
            }
        }
        i1 = d;
        j = e;
        if (b != iwr.a) goto _L2; else goto _L1
_L1:
        if (f > 1.0F)
        {
            i = (int)Math.floor(-(((f - 1.0F) / 2.0F) * f1 * (float)d));
            j = (int)Math.ceil((float)e + ((f - 1.0F) / 2.0F) * f1 * (float)d);
            l = ((flag) ? 1 : 0);
            k = i1;
        } else
        {
            l = (int)Math.floor(-(((1.0F / f - 1.0F) / 2.0F) * f1 * (float)e));
            k = (int)Math.ceil((float)d + ((1.0F / f - 1.0F) / 2.0F) * f1 * (float)e);
            i = 0;
        }
_L4:
        if (g == null)
        {
            g = new Rect();
        }
        g.set(l, i, k, j);
        invalidate();
        return;
_L2:
        if (b == iwr.b)
        {
            if (f > 1.0F)
            {
                int k1 = (int)Math.floor(((f - 1.0F) / 2.0F) * f1 * (float)d);
                int j1 = (int)Math.ceil((float)e - ((f - 1.0F) / 2.0F) * f1 * (float)d);
                j = j1;
                k = i1;
                i = k1;
                l = ((flag) ? 1 : 0);
                if (a)
                {
                    j = (int)Math.floor(((f - 1.0F) / 2.0F) * (float)d);
                    i = k1 - j;
                    j = j1 - j;
                    k = i1;
                    l = ((flag) ? 1 : 0);
                }
            } else
            {
                l = (int)Math.floor(((1.0F / f - 1.0F) / 2.0F) * f1 * (float)e);
                k = (int)Math.ceil((float)d - ((1.0F / f - 1.0F) / 2.0F) * f1 * (float)e);
                if (a)
                {
                    i = Math.round(((1.0F / f - 1.0F) / 2.0F) * (float)e);
                    k -= i;
                    l -= i;
                    i = 0;
                } else
                {
                    i = 0;
                }
            }
        } else
        {
            i = 0;
            k = i1;
            l = ((flag) ? 1 : 0);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
