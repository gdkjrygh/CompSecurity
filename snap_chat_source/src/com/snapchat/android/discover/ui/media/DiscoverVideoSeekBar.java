// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.media;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.Timber;

public class DiscoverVideoSeekBar extends View
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(float f1, boolean flag);

        public abstract void b();
    }


    private float a;
    private RectF b;
    private RectF c;
    private Paint d;
    private Paint e;
    private Paint f;
    private boolean g;
    private boolean h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private a m;

    public DiscoverVideoSeekBar(Context context)
    {
        this(context, null, 0);
    }

    public DiscoverVideoSeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DiscoverVideoSeekBar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 0.0F;
        b = new RectF();
        c = new RectF();
        d = new Paint();
        e = new Paint();
        f = new Paint();
        g = true;
        h = false;
        i = getResources().getDimension(0x7f0a008b);
        k = getResources().getDimension(0x7f0a0089);
        l = getResources().getDimension(0x7f0a0088);
        j = getResources().getDimension(0x7f0a008a);
        e.setColor(getResources().getColor(0x7f0c0079));
        f.setColor(getResources().getColor(0x7f0c0076));
    }

    private void a(int i1, float f1)
    {
        boolean flag = true;
        if (m != null)
        {
            f1 /= getWidth();
            if (1 != i1)
            {
                flag = false;
            }
            m.a(f1, flag);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        int i1 = (int)(a * (float)getMeasuredWidth());
        float f1 = ((float)getMeasuredHeight() - i) / 2.0F;
        float f2 = i + f1;
        b.set(0.0F, f1, getMeasuredWidth(), f2);
        c.set(0.0F, f1, i1, f2);
        canvas.drawRoundRect(b, j, j, e);
        canvas.drawRoundRect(c, j, j, d);
        f2 = getMeasuredHeight() / 2;
        if (h)
        {
            f1 = l;
        } else
        {
            f1 = k;
        }
        canvas.drawCircle(i1, f2, f1, d);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1;
        int i1;
        i1 = motionevent.getAction();
        f1 = motionevent.getX();
        Timber.c("DiscoverVideoSeekBar", "OnTouchEvent: %s", new Object[] {
            Integer.valueOf(i1)
        });
        if (!g)
        {
            Timber.c("DiscoverVideoSeekBar", "Progress bar not clickable. Ignoring touch event", new Object[0]);
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 3: default 80
    //                   0 82
    //                   1 115
    //                   2 106
    //                   3 121;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        if (m != null)
        {
            m.a();
        }
        h = true;
        continue; /* Loop/switch isn't completed */
_L4:
        a(i1, f1);
        continue; /* Loop/switch isn't completed */
_L3:
        a(i1, f1);
_L5:
        h = false;
        if (m != null)
        {
            m.b();
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setClickable(boolean flag)
    {
        g = flag;
    }

    public void setColor(Paint paint)
    {
        int i1 = paint.getColor();
        float af[] = new float[3];
        Color.colorToHSV(i1, af);
        boolean flag;
        if (af[2] <= 0.3F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            d.set(paint);
            return;
        } else
        {
            d.set(f);
            return;
        }
    }

    public void setProgress(float f1)
    {
        if (f1 < 0.0F || f1 > 1000F)
        {
            return;
        } else
        {
            a = f1;
            requestLayout();
            invalidate();
            return;
        }
    }

    public void setSeekBarCallback(a a1)
    {
        m = a1;
    }
}
