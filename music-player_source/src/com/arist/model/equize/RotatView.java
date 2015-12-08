// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.arist.model.skin.b;
import com.arist.model.skin.m;

// Referenced classes of package com.arist.model.equize:
//            l

public class RotatView extends View
    implements m
{

    private Drawable a;
    private Drawable b;
    private Drawable c;
    private Drawable d;
    private Drawable e;
    private int f;
    private int g;
    private int h;
    private Point i;
    private boolean j;
    private l k;

    public RotatView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = 14;
        h = -120;
        i = new Point();
        f = getResources().getDimensionPixelSize(0x7f07001c);
        a = getResources().getDrawable(0x7f02001a);
        c = getResources().getDrawable(0x7f02001b);
        b = getResources().getDrawable(0x7f02004d);
        d = getResources().getDrawable(0x7f02004e);
        e = getResources().getDrawable(0x7f02007d);
        int i1 = getResources().getDimensionPixelSize(0x7f07001a);
        int j1 = getResources().getDimensionPixelSize(0x7f07001b);
        g = j1 * 2 + i1 + f * 2;
        a.setBounds(0, 0, i1, i1);
        b.setBounds(0, 0, j1, j1);
        a.getBounds().offset(f + j1, f + j1);
        b.getBounds().offset((g - j1) / 2, 0);
        c.setBounds(a.copyBounds());
        e.setBounds(a.copyBounds());
        d.setBounds(b.copyBounds());
    }

    public final void a(float f1)
    {
        h = (int)(240F * f1 - 120F);
        invalidate();
    }

    public final void a(int i1)
    {
        d.setColorFilter(new LightingColorFilter(i1, 1));
        e.setColorFilter(new LightingColorFilter(i1, 1));
    }

    public final void a(l l1)
    {
        k = l1;
    }

    protected void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        Drawable drawable;
        int i1;
        if (j)
        {
            drawable = c;
        } else
        {
            drawable = a;
        }
        drawable.draw(canvas);
        f1 = getWidth() / 2;
        i1 = -120;
        do
        {
            if (i1 > 120)
            {
                canvas.save();
                canvas.rotate(h, f1, f1);
                e.draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                return;
            }
            canvas.save();
            canvas.rotate(i1, f1, f1);
            if (h != -120 && i1 <= h)
            {
                drawable = d;
            } else
            {
                drawable = b;
            }
            drawable.draw(canvas);
            canvas.restore();
            i1 += 30;
        } while (true);
    }

    protected void onMeasure(int i1, int j1)
    {
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(g, 0x40000000);
        super.onMeasure(i1, i1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 50
    //                   1 385
    //                   2 82
    //                   3 385;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        invalidate();
        return true;
_L2:
        i.x = (int)motionevent.getX();
        i.y = (int)motionevent.getY();
        j = true;
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = h;
        float f5 = g / 2;
        float f2 = g / 2;
        float f1 = i.x;
        float f3 = i.y;
        float f6 = motionevent.getX();
        float f4 = motionevent.getY();
        f1 -= f5;
        f3 -= f2;
        f5 = f6 - f5;
        f4 -= f2;
        f2 = (float)Math.sqrt(f1 * f1 + f3 * f3) * (float)Math.sqrt(f5 * f5 + f4 * f4);
        int i1;
        if (f2 == 0.0F)
        {
            i1 = -180;
        } else
        {
            f2 = (float)Math.toDegrees((float)Math.acos((f1 * f5 + f3 * f4) / f2));
            PointF pointf = new PointF(f1, f3);
            PointF pointf1 = new PointF(f5, f4);
            f3 = pointf.x;
            f4 = pointf1.y;
            f5 = pointf.y;
            f1 = f2;
            if (f3 * f4 - pointf1.x * f5 < 0.0F)
            {
                f1 = -f2;
            }
            i1 = (int)f1;
        }
        h = i1 + j1;
        h = Math.min(120, Math.max(-120, h));
        if (k != null)
        {
            k.a(this, (float)(h + 120) / 240F);
        }
        i.x = (int)motionevent.getX();
        i.y = (int)motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L3:
        j = false;
        if (true) goto _L1; else goto _L5
_L5:
    }
}
