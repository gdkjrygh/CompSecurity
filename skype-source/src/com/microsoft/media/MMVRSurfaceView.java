// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.microsoft.media:
//            RtcPalConfig

public class MMVRSurfaceView extends GLSurfaceView
{
    private class DefaultWindowSurfaceFactory
        implements android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    {

        final MMVRSurfaceView this$0;

        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
        {
            RtcPalConfig.isLogcatEnabled();
            egl10 = egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, null);
            surfaceCreate();
            return egl10;
        }

        public void destroySurface(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface)
        {
            egl10.eglDestroySurface(egldisplay, eglsurface);
            surfaceDestroy();
            RtcPalConfig.isLogcatEnabled();
        }

        private DefaultWindowSurfaceFactory()
        {
            this$0 = MMVRSurfaceView.this;
            super();
        }

    }

    public static interface MMVRCallback
    {

        public abstract void onFrameRendered(MMVRSurfaceView mmvrsurfaceview);

        public abstract void onRenderSizeChanged(MMVRSurfaceView mmvrsurfaceview, int i, int j);

        public abstract void onSmartCropInfoChanged(MMVRSurfaceView mmvrsurfaceview, int i, int j, int k, int l, int i1);

        public abstract void onSurfaceCreated(MMVRSurfaceView mmvrsurfaceview);
    }

    class MMVRRenderer
        implements android.opengl.GLSurfaceView.Renderer
    {

        private MMVRSurfaceView m_surfaceView;
        final MMVRSurfaceView this$0;

        public void onDrawFrame(GL10 gl10)
        {
            m_surfaceView.drawFrame();
        }

        public void onSurfaceChanged(GL10 gl10, int i, int j)
        {
            m_surfaceView.surfaceChange(i, j);
            m_surfaceView.requestRender();
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
        {
        }

        public MMVRRenderer(MMVRSurfaceView mmvrsurfaceview1)
        {
            this$0 = MMVRSurfaceView.this;
            super();
            m_surfaceView = null;
            m_surfaceView = mmvrsurfaceview1;
        }
    }


    public static final int MMVRAutoFitMode_Crop = 1;
    public static final int MMVRAutoFitMode_LetterBoxing = 2;
    public static final int MMVRAutoFitMode_SmartCrop = 3;
    private static final String TAG = "MMVRSurfaceView";
    private MMVRCallback m_callback;
    private MMVRRenderer m_mmvrRenderer;
    private int m_nativeMMVR;

    public MMVRSurfaceView(Context context)
    {
        super(context);
        m_nativeMMVR = 0;
        m_mmvrRenderer = null;
        m_callback = null;
        ConstructorInitSeq();
    }

    public MMVRSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        m_nativeMMVR = 0;
        m_mmvrRenderer = null;
        m_callback = null;
        ConstructorInitSeq();
    }

    private void ConstructorInitSeq()
    {
        setEGLContextClientVersion(2);
        initialize();
    }

    private static native int createRenderer(Object obj);

    private static native void destroyRenderer(int i);

    private static native void doRender(int i);

    private void drawFrame()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeMMVR == 0) goto _L2; else goto _L1
_L1:
        doRender(m_nativeMMVR);
        if (m_callback != null)
        {
            m_callback.onFrameRendered(this);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("MMVRSurfaceView", "Native MMVR is destroyed");
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static native int getRendererContext(int i);

    private void initialize()
    {
        m_mmvrRenderer = new MMVRRenderer(this);
        setEGLWindowSurfaceFactory(new DefaultWindowSurfaceFactory());
        setRenderer(m_mmvrRenderer);
        setRenderMode(0);
    }

    private static native void releaseUICallback(int i);

    private void renderSizeChanged(int i, int j)
    {
        if (m_callback != null)
        {
            m_callback.onRenderSizeChanged(this, i, j);
        }
    }

    private static native void setAutoFitMode(int i, int j);

    private void smartCropInfoChanged(int i, int j, int k, int l, int i1)
    {
        if (m_callback != null)
        {
            m_callback.onSmartCropInfoChanged(this, i, j, k, l, i1);
        }
    }

    private void surfaceChange(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeMMVR == 0) goto _L2; else goto _L1
_L1:
        surfaceChanged(m_nativeMMVR, i, j);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (RtcPalConfig.isLogcatEnabled())
        {
            Log.e("MMVRSurfaceView", "Native MMVR is destroyed");
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static native void surfaceChanged(int i, int j, int k);

    private void surfaceCreate()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeMMVR == 0)
        {
            m_nativeMMVR = createRenderer(this);
            if (m_nativeMMVR == 0)
            {
                throw new RuntimeException("Could not create MMVR instance.");
            }
        }
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (m_callback != null)
        {
            m_callback.onSurfaceCreated(this);
        }
        this;
        JVM INSTR monitorexit ;
    }

    private void surfaceDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeMMVR != 0)
        {
            releaseUICallback(m_nativeMMVR);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void destroyNativeRenderer()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeMMVR != 0)
        {
            m_nativeMMVR = 0;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int getNativeHandle()
    {
        this;
        JVM INSTR monitorenter ;
        int i = m_nativeMMVR;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAutoFitMode(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeMMVR != 0)
        {
            setAutoFitMode(m_nativeMMVR, i);
            requestRender();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setCallback(MMVRCallback mmvrcallback)
    {
        m_callback = mmvrcallback;
    }




}
