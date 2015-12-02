// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.images.zoomableimageview;

import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.facebook.widget.images.zoomableimageview:
//            a, c

public class b extends android.view.GestureDetector.SimpleOnGestureListener
{

    final a a;

    public b(a a1)
    {
        a = a1;
        super();
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        Log.i("image", (new StringBuilder()).append("onDoubleTap. double tap enabled? ").append(a.i).toString());
        if (a.i)
        {
            float f = a.getScale();
            f = a.a(f, a.getMaxZoom());
            f = Math.min(a.getMaxZoom(), Math.max(f, a.getMinZoom()));
            a.d = f;
            a.a(f, motionevent.getX(), motionevent.getY(), 200F);
            a.invalidate();
        }
        if (com.facebook.widget.images.zoomableimageview.a.a(a) != null)
        {
            com.facebook.widget.images.zoomableimageview.a.a(a).a();
        }
        return super.onDoubleTap(motionevent);
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return a.b(motionevent, motionevent1, f, f1);
    }

    public void onLongPress(MotionEvent motionevent)
    {
        if (a.isLongClickable() && !a.a.isInProgress())
        {
            a.setPressed(true);
            a.performLongClick();
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return a.a(motionevent, motionevent1, f, f1);
    }
}
