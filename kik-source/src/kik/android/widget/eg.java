// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

// Referenced classes of package kik.android.widget:
//            TouchImageView

final class eg
    implements android.view.View.OnTouchListener
{

    final TouchImageView a;

    eg(TouchImageView touchimageview)
    {
        a = touchimageview;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        float f3;
        float f4;
        float f5;
        f3 = 0.0F;
        TouchImageView.a(a).onTouch(view, motionevent);
        TouchImageView.b(a).onTouchEvent(motionevent);
        TouchImageView.d(a).getValues(TouchImageView.c(a));
        f5 = TouchImageView.c(a)[2];
        f4 = TouchImageView.c(a)[5];
        view = new PointF(motionevent.getX(), motionevent.getY());
        motionevent.getAction();
        JVM INSTR tableswitch 0 6: default 132
    //                   0 155
    //                   1 576
    //                   2 202
    //                   3 132
    //                   4 132
    //                   5 132
    //                   6 650;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5
_L1:
        a.setImageMatrix(TouchImageView.d(a));
        a.invalidate();
        return true;
_L2:
        TouchImageView.e(a).set(motionevent.getX(), motionevent.getY());
        TouchImageView.f(a).set(TouchImageView.e(a));
        TouchImageView.a(a, 1);
        continue; /* Loop/switch isn't completed */
_L4:
        float f;
        float f1;
        float f2;
        float f6;
        if (TouchImageView.g(a) != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        f1 = ((PointF) (view)).x - TouchImageView.e(a).x;
        f2 = ((PointF) (view)).y - TouchImageView.e(a).y;
        f = Math.round(TouchImageView.h(a) * TouchImageView.i(a));
        f6 = Math.round(TouchImageView.j(a) * TouchImageView.i(a));
        if (f >= TouchImageView.k(a)) goto _L7; else goto _L6
_L6:
        if (f4 + f2 <= 0.0F) goto _L9; else goto _L8
_L8:
        f = -f4;
        f1 = f3;
_L15:
        TouchImageView.d(a).postTranslate(f1, f);
        TouchImageView.e(a).set(((PointF) (view)).x, ((PointF) (view)).y);
        continue; /* Loop/switch isn't completed */
_L9:
        f = f2;
        f1 = f3;
        if (f4 + f2 < -TouchImageView.l(a))
        {
            f = -(TouchImageView.l(a) + f4);
            f1 = f3;
        }
          goto _L10
_L7:
        if (f6 >= TouchImageView.m(a)) goto _L12; else goto _L11
_L11:
        if (f5 + f1 > 0.0F)
        {
            f1 = -f5;
            f = 0.0F;
        } else
        if (f5 + f1 < -TouchImageView.n(a))
        {
            f1 = -(TouchImageView.n(a) + f5);
            f = 0.0F;
        } else
        {
            f = 0.0F;
        }
          goto _L10
_L12:
        if (f5 + f1 <= 0.0F) goto _L14; else goto _L13
_L13:
        f = -f5;
_L16:
        if (f4 + f2 > 0.0F)
        {
            f2 = -f4;
            f1 = f;
            f = f2;
        } else
        if (f4 + f2 < -TouchImageView.l(a))
        {
            f2 = -(TouchImageView.l(a) + f4);
            f1 = f;
            f = f2;
        } else
        {
            f1 = f;
            f = f2;
        }
_L10:
        if (true) goto _L15; else goto _L14
_L14:
        f = f1;
        if (f5 + f1 < -TouchImageView.n(a))
        {
            f = -(TouchImageView.n(a) + f5);
        }
          goto _L16
_L3:
        TouchImageView.a(a, 0);
        int i = (int)Math.abs(((PointF) (view)).x - TouchImageView.f(a).x);
        int j = (int)Math.abs(((PointF) (view)).y - TouchImageView.f(a).y);
        if (i < 3 && j < 3)
        {
            a.performClick();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        TouchImageView.a(a, 0);
        if (true) goto _L1; else goto _L17
_L17:
    }
}
