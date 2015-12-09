// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

// Referenced classes of package com.jcp.views:
//            TouchImageView

class ae
    implements android.view.View.OnTouchListener
{

    final TouchImageView a;

    ae(TouchImageView touchimageview)
    {
        a = touchimageview;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        TouchImageView.a(a).onTouchEvent(motionevent);
        view = new PointF(motionevent.getX(), motionevent.getY());
        motionevent.getAction();
        JVM INSTR tableswitch 0 6: default 76
    //                   0 99
    //                   1 299
    //                   2 139
    //                   3 76
    //                   4 76
    //                   5 76
    //                   6 373;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5
_L1:
        a.setImageMatrix(TouchImageView.j(a));
        a.invalidate();
        return true;
_L2:
        TouchImageView.b(a).set(view);
        TouchImageView.c(a).set(TouchImageView.b(a));
        TouchImageView.a(a, 1);
        continue; /* Loop/switch isn't completed */
_L4:
        if (TouchImageView.d(a) == 1)
        {
            float f2 = ((PointF) (view)).x;
            float f3 = TouchImageView.b(a).x;
            float f = ((PointF) (view)).y;
            float f1 = TouchImageView.b(a).y;
            f2 = a.b(f2 - f3, TouchImageView.e(a), TouchImageView.f(a) * TouchImageView.g(a));
            f = a.b(f - f1, TouchImageView.h(a), TouchImageView.i(a) * TouchImageView.g(a));
            TouchImageView.j(a).postTranslate(f2, f);
            a.a();
            TouchImageView.b(a).set(((PointF) (view)).x, ((PointF) (view)).y);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        TouchImageView.a(a, 0);
        int i = (int)Math.abs(((PointF) (view)).x - TouchImageView.c(a).x);
        int j = (int)Math.abs(((PointF) (view)).y - TouchImageView.c(a).y);
        if (i < 3 && j < 3)
        {
            a.performClick();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        TouchImageView.a(a, 0);
        if (true) goto _L1; else goto _L6
_L6:
    }
}
