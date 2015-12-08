// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            CropImageView, e

class init> extends android.view.SimpleOnGestureListener
{

    final CropImageView a;

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        if (CropImageView.e(a))
        {
            CropImageView.a(a, null);
            float f = a.getScale();
            f = CropImageView.a(a, f, a.getMaxScale());
            f = Math.min(a.getMaxScale(), Math.max(f, 1.0F));
            CropImageView.a(a, f, motionevent.getX(), motionevent.getY(), 200F);
            a.invalidate();
        }
        return super.onDoubleTap(motionevent);
    }

    public boolean onDown(MotionEvent motionevent)
    {
        CropImageView.a(a, null);
        Object obj = CropImageView.a(a);
        if (obj != null)
        {
            int i = ((e) (obj)).a(motionevent.getX(), motionevent.getY());
            if (i != 1)
            {
                CropImageView.a(a, i);
                CropImageView.a(a, ((e) (obj)));
                e e1 = CropImageView.b(a);
                if (i == 32)
                {
                    obj = a;
                } else
                {
                    obj = a;
                }
                e1.a(((a) (obj)));
                a.postInvalidate();
            }
        }
        return super.onDown(motionevent);
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        while (motionevent.getPointerCount() > 1 || motionevent1.getPointerCount() > 1 || CropImageView.g(a).isInProgress() || CropImageView.b(a) != null) 
        {
            return false;
        }
        float f2 = motionevent1.getX();
        float f3 = motionevent.getX();
        float f4 = motionevent1.getY();
        float f5 = motionevent.getY();
        if (Math.abs(f) > 800F || Math.abs(f1) > 800F)
        {
            CropImageView.a(a, (f2 - f3) / 2.0F, (f4 - f5) / 2.0F, 300D);
            a.invalidate();
        }
        return super.onFling(motionevent, motionevent1, f, f1);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        while (motionevent == null || motionevent1 == null || motionevent.getPointerCount() > 1 || motionevent1.getPointerCount() > 1 || CropImageView.f(a).isInProgress()) 
        {
            return false;
        }
        if (CropImageView.b(a) != null && CropImageView.c(a) != 1)
        {
            CropImageView.b(a).a(CropImageView.c(a), -f, -f1);
            if (CropImageView.c(a) == 32)
            {
                a.invalidate(CropImageView.b(a).b());
            } else
            {
                a.postInvalidate();
            }
            CropImageView.b(a, CropImageView.b(a));
            return true;
        } else
        {
            a.d(-f, -f1);
            a.invalidate();
            return true;
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        CropImageView.a(a, null);
        return super.onSingleTapConfirmed(motionevent);
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        CropImageView.a(a, null);
        if (CropImageView.a(a) != null && CropImageView.c(a) == 32 && CropImageView.d(a) != null)
        {
            CropImageView.d(a).a();
        }
        return super.onSingleTapUp(motionevent);
    }

    (CropImageView cropimageview)
    {
        a = cropimageview;
        super();
    }
}
