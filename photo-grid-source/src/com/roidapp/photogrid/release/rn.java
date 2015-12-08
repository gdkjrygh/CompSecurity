// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.view.MotionEvent;
import com.roidapp.photogrid.common.bl;

// Referenced classes of package com.roidapp.photogrid.release:
//            aq, ig, lc

public final class rn extends aq
{

    private Matrix w;
    private PaintFlagsDrawFilter x;

    public rn(Context context, lc lc, ig ig1, int i, int j)
    {
        super(context);
        w = new Matrix();
        x = new PaintFlagsDrawFilter(0, 3);
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
        a = context;
        b = lc;
        c = ig1;
        f = i;
        g = j;
        m = false;
    }

    public final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!h || d == null || d.isRecycled())
        {
            return;
        }
        if (w != null)
        {
            Bitmap bitmap = d;
            float f;
            float f1;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            if (bitmap != null && !bitmap.isRecycled())
            {
                if ((float)this.f / (float)g > (float)bitmap.getWidth() / (float)bitmap.getHeight())
                {
                    r = ((float)this.f * 1.0F) / (float)bitmap.getWidth();
                } else
                {
                    r = ((float)g * 1.0F) / (float)bitmap.getHeight();
                }
            }
            w.reset();
            w.postScale(c.r, c.s, (float)d.getWidth() / 2.0F, (float)d.getHeight() / 2.0F);
            w.postRotate(c.p, (float)d.getWidth() / 2.0F, (float)d.getHeight() / 2.0F);
            w.postScale(c.v * r, c.v * r);
            f = c.t;
            f1 = (float)d.getWidth() / 2.0F;
            f2 = c.v;
            f3 = r;
            f4 = (float)this.f / 2.0F;
            f5 = c.u;
            f6 = (float)d.getHeight() / 2.0F;
            f7 = c.v;
            f8 = r;
            f9 = (float)g / 2.0F;
            w.postTranslate((f - f1 * f2 * f3) + f4, (f5 - f6 * f7 * f8) + f9);
            canvas.setDrawFilter(x);
            canvas.drawBitmap(d, w, null);
        }
        super.onDraw(canvas);
    }

    public final void onMeasure(int i, int j)
    {
        super.setMeasuredDimension(f, g);
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        if (!h || !m)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            switch (motionevent.getAction())
            {
            case 1: // '\001'
            default:
                return false;

            case 0: // '\0'
                i = motionevent.getRawX();
                j = motionevent.getRawY();
                k = i;
                l = j;
                return true;

            case 2: // '\002'
                k = motionevent.getRawX();
                break;
            }
            l = motionevent.getRawY();
            motionevent = c;
            motionevent.t = ((ig) (motionevent)).t + (float)(int)(k - i);
            motionevent = c;
            motionevent.u = ((ig) (motionevent)).u + (float)(int)(l - j);
            i = k;
            j = l;
            if (System.currentTimeMillis() - n > 200L)
            {
                invalidate();
                return true;
            }
        }
        return flag;
    }
}
