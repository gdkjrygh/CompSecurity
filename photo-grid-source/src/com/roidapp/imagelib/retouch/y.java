// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Matrix;
import android.view.MotionEvent;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            x

final class y
    implements android.view.GestureDetector.OnGestureListener
{

    final x a;

    y(x x1)
    {
        a = x1;
        super();
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return false;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        x.a(a).postTranslate(-f, -f1);
        x.b(a);
        return true;
    }

    public final void onShowPress(MotionEvent motionevent)
    {
    }

    public final boolean onSingleTapUp(MotionEvent motionevent)
    {
        return true;
    }
}
