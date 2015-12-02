// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FloatViewWndmillView extends ImageView
{
    public static interface a
    {

        public abstract void a();
    }


    private float a;
    private int b;
    private int c;
    private a d;
    private int e;
    private float f;
    private float g;

    public FloatViewWndmillView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0.0F;
        b = 0;
        c = -1;
        d = null;
        e = 40;
        f = 1.5F;
        g = 0.8F;
    }

    private void b()
    {
        b = 0;
        a = 0.0F;
    }

    public void a()
    {
        d = null;
        b();
        c = 0;
        invalidate();
    }

    public void a(a a1)
    {
        d = a1;
        if (c == 1)
        {
            c = 2;
        }
        invalidate();
    }

    public void draw(Canvas canvas)
    {
        if (c == -1) goto _L2; else goto _L1
_L1:
        c;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 109
    //                   1 40
    //                   2 161;
           goto _L3 _L4 _L3 _L5
_L3:
        if ((float)b >= 2.147484E+09F - a)
        {
            b = 0;
        }
        b = (int)((float)b + a);
        invalidate();
_L2:
        canvas.rotate(b, (float)getMeasuredWidth() / 2.0F, (float)getMeasuredHeight() / 2.0F);
        super.draw(canvas);
        return;
_L4:
        if (a < (float)e)
        {
            a = a + f;
        } else
        if (d != null)
        {
            c = 2;
        } else
        {
            c = 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a = a - g;
        if (a < 0.0F)
        {
            c = -1;
            if (d != null)
            {
                d.a();
            }
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }
}
