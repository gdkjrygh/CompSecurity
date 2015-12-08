// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Rm;
import Su;
import Vt;
import Vw;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;

// Referenced classes of package com.snapchat.videochat.view:
//            StreamView

public class DummyStreamView extends StreamView
{

    public DummyStreamView(Context context)
    {
        super(context);
    }

    public DummyStreamView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public DummyStreamView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static void setCameraInfo(android.hardware.Camera.CameraInfo camerainfo)
    {
    }

    public static void setCameraPreviewSize(int i, int j)
    {
    }

    public final void a()
    {
    }

    public final void a(Rm rm, String s, Su su)
    {
    }

    public final void a(Activity activity, Vw vw, Vt vt)
    {
    }

    public final void a(MotionEvent motionevent)
    {
    }

    public final void a(String s)
    {
    }

    public final void a(boolean flag)
    {
    }

    public final void a(boolean flag, String s)
    {
    }

    public final void a(boolean flag, boolean flag1)
    {
    }

    public final void b()
    {
    }

    public final void b(boolean flag)
    {
    }

    public final void c()
    {
    }

    public final void c(boolean flag)
    {
    }

    public final void d(boolean flag)
    {
    }

    public final boolean d()
    {
        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
    }

    public final boolean e()
    {
        return false;
    }

    public final boolean f()
    {
        return false;
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void setCanStreamVideo(boolean flag, String s)
    {
    }

    public void setDeferDisconnectTimeoutMs(int i)
    {
    }
}
