// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;

public class kp
    implements mlo
{

    private final kq mImpl;

    public kp()
    {
    }

    public kp(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener)
    {
        this(context, ongesturelistener, null);
    }

    public kp(Context context, android.view.GestureDetector.OnGestureListener ongesturelistener, Handler handler)
    {
        if (android.os.Build.VERSION.SDK_INT > 17)
        {
            mImpl = new kt(context, ongesturelistener, handler);
            return;
        } else
        {
            mImpl = new kr(context, ongesturelistener, handler);
            return;
        }
    }

    public PointF calculate(float f, PointF apointf[], PointF pointf)
    {
        float f1 = 1.0F - f;
        float f2 = apointf[0].x;
        float f3 = apointf[1].x;
        float f4 = apointf[1].x;
        float f5 = apointf[2].x;
        float f6 = apointf[0].y;
        float f7 = apointf[1].y;
        pointf.set((f2 * f1 + f3 * f) * f1 + (f4 * f1 + f5 * f) * f, (f1 * apointf[1].y + apointf[2].y * f) * f + (f6 * f1 + f7 * f) * f1);
        return pointf;
    }

    public boolean isLongpressEnabled()
    {
        return mImpl.a();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return mImpl.a(motionevent);
    }

    public void setIsLongpressEnabled(boolean flag)
    {
        mImpl.a(flag);
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        mImpl.a(ondoubletaplistener);
    }
}
