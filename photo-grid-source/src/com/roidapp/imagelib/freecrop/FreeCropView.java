// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            n, l, Magnifier, d, 
//            a

public class FreeCropView extends ImageView
{

    a a;
    public boolean b;
    private l c;
    private Magnifier d;
    private RelativeLayout e;
    private PaintFlagsDrawFilter f;
    private int g;
    private int h;
    private boolean i;

    public FreeCropView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        i = false;
        b = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            try
            {
                getClass().getMethod("setLayerType", new Class[] {
                    Integer.TYPE, android/graphics/Paint
                }).invoke(this, new Object[] {
                    Integer.valueOf(1), null
                });
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                attributeset.printStackTrace();
            }
        }
        context = context.getResources().getDisplayMetrics();
        g = ((DisplayMetrics) (context)).widthPixels;
        h = ((DisplayMetrics) (context)).heightPixels;
        f = new PaintFlagsDrawFilter(0, 3);
    }

    private static PointF a(float f1, float f2, Matrix matrix)
    {
        float af[] = new float[2];
        af[0] = f1;
        af[1] = f2;
        matrix.mapPoints(af);
        return new PointF(af[0], af[1]);
    }

    private void a(MotionEvent motionevent)
    {
        if (c instanceof n)
        {
            c.a(motionevent.getX(), motionevent.getY(), 0.0F, 0.0F);
            return;
        }
        c.a(motionevent.getX(), motionevent.getY(), 0.0F, 0.0F);
        int j = d.a();
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(j, j);
        if (motionevent.getX() < (float)j && motionevent.getY() < (float)j)
        {
            layoutparams.addRule(11, -1);
            layoutparams.addRule(10, -1);
            e.setLayoutParams(layoutparams);
        }
        if (motionevent.getX() > (float)(g - j) && motionevent.getY() < (float)j)
        {
            layoutparams.addRule(9, -1);
            layoutparams.addRule(10, -1);
            e.setLayoutParams(layoutparams);
        }
        motionevent = a(motionevent.getX(), motionevent.getY(), c.i());
        d.a(motionevent);
        d.a(((d)c).b());
        d.invalidate();
    }

    public final void a()
    {
        i = true;
    }

    public final void a(Magnifier magnifier, RelativeLayout relativelayout)
    {
        d = magnifier;
        e = relativelayout;
    }

    public final void a(l l1)
    {
        c = l1;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (c != null)
        {
            canvas.setDrawFilter(f);
            c.a(canvas, null, false);
        }
    }

    protected void onSizeChanged(int j, int k, int i1, int j1)
    {
        super.onSizeChanged(j, k, i1, j1);
        if (k != j1)
        {
            getLocationOnScreen(new int[] {
                0, 0
            });
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        while (c == null || i) 
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 48
    //                   0 54
    //                   1 187
    //                   2 267;
           goto _L1 _L2 _L3 _L4
_L1:
        invalidate();
        return true;
_L2:
        if (c instanceof n)
        {
            return c.a(motionevent.getX(), motionevent.getY());
        }
        if (!b)
        {
            b = true;
        }
        e.setVisibility(0);
        c.a(motionevent.getX(), motionevent.getY());
        d.a(((d)c).b());
        motionevent = a(motionevent.getX(), motionevent.getY(), c.i());
        d.a(motionevent);
        d.a(((d)c).a());
        d.invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        if (c instanceof n)
        {
            l l1 = c;
            motionevent.getX();
            motionevent.getY();
            l1.d();
        } else
        {
            l l2 = c;
            motionevent.getX();
            motionevent.getY();
            l2.d();
            d.a(((d)c).a());
            d.invalidate();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (android.os.Build.VERSION.SDK_INT > 5)
        {
            break; /* Loop/switch isn't completed */
        }
        c.a(false);
        a(motionevent);
        if (true) goto _L1; else goto _L5
_L5:
        switch (MotionEventCompat.getPointerCount(motionevent))
        {
        case 1: // '\001'
            c.a(false);
            a(motionevent);
            break;

        case 2: // '\002'
            c.a(true);
            if (c instanceof n)
            {
                c.a(MotionEventCompat.getX(motionevent, 0), MotionEventCompat.getY(motionevent, 0), MotionEventCompat.getX(motionevent, 1), MotionEventCompat.getY(motionevent, 1));
            }
            break;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
