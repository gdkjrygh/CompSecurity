// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class VideoEngineView extends SurfaceView
    implements android.view.SurfaceHolder.Callback
{

    static final String TAG = "VideoEngineView(j)";
    SurfaceHolder mHolder;
    private Canvas mLockedCanvas;
    private long m_nativeInstance;
    private Surface m_surface;

    public VideoEngineView(Context context)
    {
        super(context);
        m_nativeInstance = 0L;
        m_surface = null;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.setSecure(true);
        }
        mHolder = getHolder();
        if (useOverlay())
        {
            mHolder.setFormat(0x32315659);
        } else
        {
            mHolder.setFormat(4);
        }
        mHolder.addCallback(this);
    }

    private Surface getSurface()
    {
        return m_surface;
    }

    private void lockCanvas(int i, int j, int k, int l)
    {
        if (!useOverlay())
        {
            Rect rect = new Rect(i, j, k, l);
            mLockedCanvas = mHolder.lockCanvas(rect);
        }
    }

    private native void nativeDrawBitmapToCanvas(long l, Canvas canvas);

    private native void nativeSurfaceChanged(long l, int i, int j);

    private native void nativeSurfaceCreated(long l, int i, int j);

    private native void nativeSurfaceDestroyed(long l);

    private void unlockCanvas()
    {
        if (!useOverlay())
        {
            mHolder.unlockCanvasAndPost(mLockedCanvas);
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (m_nativeInstance != 0L)
        {
            nativeDrawBitmapToCanvas(m_nativeInstance, canvas);
        }
    }

    public void setNativeInstance(long l)
    {
        m_nativeInstance = l;
    }

    public void setWillNotDraw(boolean flag)
    {
    }

    public void setWillNotDrawCaption(boolean flag)
    {
        super.setWillNotDraw(flag);
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (m_nativeInstance != 0L)
        {
            nativeSurfaceChanged(m_nativeInstance, getWidth(), getHeight());
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        SurfaceHolder surfaceholder1 = mHolder;
        surfaceholder1;
        JVM INSTR monitorenter ;
        if (!useOverlay()) goto _L2; else goto _L1
_L1:
        m_surface = surfaceholder.getSurface();
_L3:
        if (m_nativeInstance != 0L)
        {
            nativeSurfaceCreated(m_nativeInstance, getWidth(), getHeight());
        }
        return;
_L2:
        surfaceholder = mHolder.lockCanvas();
        if (surfaceholder != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        surfaceholder1;
        JVM INSTR monitorexit ;
        return;
        surfaceholder;
        surfaceholder1;
        JVM INSTR monitorexit ;
        throw surfaceholder;
        surfaceholder.drawColor(-1);
        mHolder.unlockCanvasAndPost(surfaceholder);
          goto _L3
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (m_nativeInstance != 0L)
        {
            nativeSurfaceDestroyed(m_nativeInstance);
        }
        if (useOverlay())
        {
            m_surface.release();
        }
    }

    protected boolean useOverlay()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }
}
