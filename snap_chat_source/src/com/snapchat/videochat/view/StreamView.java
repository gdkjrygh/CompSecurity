// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import Rm;
import Su;
import Vk;
import Vq;
import Vt;
import Vu;
import Vv;
import Vw;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public abstract class StreamView extends FrameLayout
    implements Vq, Vv
{

    protected static final Vk g = new Vk();
    protected static final Vu h = new Vu();
    public static boolean i = false;

    public StreamView(Context context)
    {
        super(context);
    }

    public StreamView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public StreamView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    public static void setCameraInfo(android.hardware.Camera.CameraInfo camerainfo)
    {
        g.c = camerainfo;
        h.a();
    }

    public static void setCameraPreviewSize(int j, int k)
    {
        g.a = j;
        g.b = k;
        h.a();
    }

    public abstract void a();

    public abstract void a(Rm rm, String s, Su su);

    public abstract void a(Activity activity, Vw vw, Vt vt);

    public abstract void a(boolean flag, boolean flag1);

    public abstract void b();

    public abstract void c();

    public abstract void d(boolean flag);

    public abstract boolean d();

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
    }

    public abstract boolean e();

    public abstract boolean f();

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected abstract void onSizeChanged(int j, int k, int l, int i1);

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public abstract void setCanStreamVideo(boolean flag, String s);

    public abstract void setDeferDisconnectTimeoutMs(int j);

}
