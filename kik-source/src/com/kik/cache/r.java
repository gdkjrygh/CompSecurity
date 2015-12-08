// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

// Referenced classes of package com.kik.cache:
//            ContentImageView

final class r
    implements android.view.View.OnTouchListener
{

    final ContentImageView a;

    r(ContentImageView contentimageview)
    {
        a = contentimageview;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        float f3;
        float f4;
        float f5;
        f3 = 0.0F;
        if (ContentImageView.c(a) != null)
        {
            ContentImageView.c(a).onTouch(view, motionevent);
        }
        ContentImageView.d(a).onTouchEvent(motionevent);
        ContentImageView.f(a).getValues(ContentImageView.e(a));
        f5 = ContentImageView.e(a)[2];
        f4 = ContentImageView.e(a)[5];
        view = new PointF(motionevent.getX(), motionevent.getY());
        motionevent.getAction();
        JVM INSTR tableswitch 0 6: default 140
    //                   0 163
    //                   1 584
    //                   2 210
    //                   3 140
    //                   4 140
    //                   5 140
    //                   6 658;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5
_L1:
        a.setImageMatrix(ContentImageView.f(a));
        a.invalidate();
        return true;
_L2:
        ContentImageView.g(a).set(motionevent.getX(), motionevent.getY());
        ContentImageView.h(a).set(ContentImageView.g(a));
        ContentImageView.a(a, 1);
        continue; /* Loop/switch isn't completed */
_L4:
        float f;
        float f1;
        float f2;
        float f6;
        if (ContentImageView.i(a) != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        f1 = ((PointF) (view)).x - ContentImageView.g(a).x;
        f2 = ((PointF) (view)).y - ContentImageView.g(a).y;
        f = Math.round(ContentImageView.j(a) * ContentImageView.k(a));
        f6 = Math.round(ContentImageView.l(a) * ContentImageView.k(a));
        if (f >= ContentImageView.m(a)) goto _L7; else goto _L6
_L6:
        if (f4 + f2 <= 0.0F) goto _L9; else goto _L8
_L8:
        f = -f4;
        f1 = f3;
_L15:
        ContentImageView.f(a).postTranslate(f1, f);
        ContentImageView.g(a).set(((PointF) (view)).x, ((PointF) (view)).y);
        continue; /* Loop/switch isn't completed */
_L9:
        f = f2;
        f1 = f3;
        if (f4 + f2 < -ContentImageView.n(a))
        {
            f = -(ContentImageView.n(a) + f4);
            f1 = f3;
        }
          goto _L10
_L7:
        if (f6 >= ContentImageView.o(a)) goto _L12; else goto _L11
_L11:
        if (f5 + f1 > 0.0F)
        {
            f1 = -f5;
            f = 0.0F;
        } else
        if (f5 + f1 < -ContentImageView.p(a))
        {
            f1 = -(ContentImageView.p(a) + f5);
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
        if (f4 + f2 < -ContentImageView.n(a))
        {
            f2 = -(ContentImageView.n(a) + f4);
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
        if (f5 + f1 < -ContentImageView.p(a))
        {
            f = -(ContentImageView.p(a) + f5);
        }
          goto _L16
_L3:
        ContentImageView.a(a, 0);
        int i = (int)Math.abs(((PointF) (view)).x - ContentImageView.h(a).x);
        int j = (int)Math.abs(((PointF) (view)).y - ContentImageView.h(a).y);
        if (i < 3 && j < 3)
        {
            a.performClick();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        ContentImageView.a(a, 0);
        if (true) goto _L1; else goto _L17
_L17:
    }
}
