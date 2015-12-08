// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.skype.android.util.Log;

// Referenced classes of package com.skype.android.video.render:
//            Renderer, SurfaceTextureRenderer, GLTextureView

public class GLESRenderer
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener, Renderer, SurfaceTextureRenderer
{

    static Integer seq = Integer.valueOf(0);
    private String TAG;
    private long cobj;
    private boolean flip;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener frameListener;
    private boolean frameReady;
    private boolean initSurface;
    private boolean renderParamsChanged;
    private int rendered;
    private Object renderedLock;
    private int rotation;
    private int sourceHeight;
    private boolean sourceSizeChanged;
    private int sourceWidth;
    private boolean started;
    private GLTextureView surface;
    private int surfaceHeight;
    private boolean surfaceSizeChanged;
    private int surfaceWidth;
    private boolean zoomChanged;
    private int zoomMode;

    public GLESRenderer()
    {
        cobj = 0L;
        started = false;
        rendered = 1;
        renderedLock = new Object();
        initSurface = false;
        sourceSizeChanged = false;
        sourceWidth = 0;
        sourceHeight = 0;
        surfaceSizeChanged = false;
        surfaceWidth = 0;
        surfaceHeight = 0;
        frameReady = false;
        zoomChanged = false;
        zoomMode = 1;
        renderParamsChanged = false;
        rotation = 0;
        flip = false;
        synchronized (seq)
        {
            StringBuilder stringbuilder = new StringBuilder("GLESRenderer");
            Integer integer1 = seq;
            seq = Integer.valueOf(seq.intValue() + 1);
            TAG = stringbuilder.append(integer1).toString();
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "GLESRenderer");
        }
        return;
        exception;
        integer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void stateChanged()
    {
        this;
        JVM INSTR monitorenter ;
        GLTextureView gltextureview;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "stateChanged");
        }
        gltextureview = surface;
        if (gltextureview != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!started)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "stateChanged: started");
        }
        setSourceSize(surfaceWidth, surfaceHeight);
        surface.requestRender();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "stateChanged: stopped");
        }
        surface.suspend();
          goto _L1
    }

    public void attach(int i, int j)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("attach: ")).append(i).append(", ").append(j).toString());
        }
        surfaceWidth = i;
        surfaceHeight = j;
        surfaceSizeChanged = true;
    }

    public int blockRender()
    {
        return doRender(true);
    }

    public void detach()
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "detach");
        }
    }

    public int doRender(boolean flag)
    {
        setFrameReady();
        if (!flag)
        {
            surface.requestRender();
            return 0;
        }
        Object obj = renderedLock;
        obj;
        JVM INSTR monitorenter ;
        rendered = 0;
        surface.requestRender();
_L1:
        int i = rendered;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        renderedLock.wait(1000L);
        rendered = 1;
          goto _L1
        Object obj1;
        obj1;
        if (!Log.isLoggable(TAG, 6)) goto _L1; else goto _L2
_L2:
        Log.e(TAG, (new StringBuilder("doRender: wait timed out: ")).append(obj1).toString());
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return 0;
    }

    public void draw()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        if (initSurface)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, String.format("draw: initSurface", new Object[0]));
            }
            initSurface = false;
        }
        if (sourceSizeChanged)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder("draw: sourceSizeChanged: ")).append(sourceWidth).append(", ").append(sourceHeight).toString());
            }
            updateSourceSize(sourceWidth, sourceHeight);
            sourceSizeChanged = false;
        }
        if (!surfaceSizeChanged)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("draw: surfaceSizeChanged: ")).append(surfaceWidth).append(", ").append(surfaceHeight).toString());
        }
        updateSurfaceSize(surfaceWidth, surfaceHeight);
        surfaceSizeChanged = false;
        flag = true;
        if (!zoomChanged) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("draw: zoomChanged: ")).append(zoomMode).toString());
        }
        if (zoomMode != 0) goto _L4; else goto _L3
_L3:
        setNativeZoomIn();
_L9:
        zoomChanged = false;
_L2:
        if (renderParamsChanged)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder("draw: renderParamsChanged: ")).append(rotation).append(", ").append(flip).toString());
            }
            updateRenderParameters(rotation, flip);
            renderParamsChanged = false;
        }
        if (!frameReady) goto _L6; else goto _L5
_L5:
        if (flag) goto _L8; else goto _L7
_L7:
        drawFrame();
_L10:
        frameReady = false;
_L12:
        synchronized (renderedLock)
        {
            rendered = 1;
            renderedLock.notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (zoomMode != 1)
        {
            break MISSING_BLOCK_LABEL_397;
        }
        setNativeZoomOut();
          goto _L9
        obj;
        throw obj;
        setNativeZoomBestFit();
          goto _L9
_L8:
        skipFrame();
          goto _L10
_L6:
        if (!Log.isLoggable(TAG, 3)) goto _L12; else goto _L11
_L11:
        Log.d(TAG, String.format("draw: frame not ready", new Object[0]));
          goto _L12
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
          goto _L9
    }

    public native boolean drawFrame();

    public TextureView getTextureView()
    {
        return surface;
    }

    public void initialize(int i, int j)
    {
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        surface.requestRender();
    }

    public void release()
    {
    }

    public void render()
    {
        if (surface.getSurfaceTexture() != null)
        {
            if (frameListener != null)
            {
                frameListener.onFrameAvailable(surface.getSurfaceTexture());
            }
            draw();
        } else
        if (Log.isLoggable(TAG, 5))
        {
            Log.w(TAG, "render: SurfaceTexture not available");
            return;
        }
    }

    public void setFrameReady()
    {
        this;
        JVM INSTR monitorenter ;
        frameReady = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public native void setNativeZoomBestFit();

    public native void setNativeZoomIn();

    public native void setNativeZoomOut();

    public int setRenderParameters(int i, int j)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("setRenderParameters: ")).append(i).append(", ").append(j).toString());
        }
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setRendererParameters(i, flag);
        return 0;
    }

    public void setRendererParameters(int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("setRendererParameters: ")).append(i).append(", ").append(flag).toString());
        }
        rotation = i;
        flip = flag;
        renderParamsChanged = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int setSourceSize(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("setSourceSize: ")).append(i).append(", ").append(j).toString());
        }
        sourceWidth = i;
        sourceHeight = j;
        sourceSizeChanged = true;
        this;
        JVM INSTR monitorexit ;
        return 0;
        Exception exception;
        exception;
        throw exception;
    }

    public int setTextureView(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("setTextureView: ")).append(obj).toString());
        }
        surface = (GLTextureView)obj;
        surface.setRenderer(this);
        if (surface.getSurfaceTexture() == null) goto _L2; else goto _L1
_L1:
        surface.getSurfaceTexture().setOnFrameAvailableListener(this);
_L4:
        this;
        JVM INSTR monitorexit ;
        return 0;
_L2:
        if (Log.isLoggable(TAG, 5))
        {
            Log.w(TAG, "setTextureView: SurfaceTexture not available");
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public void setZoomBestFit()
    {
        this;
        JVM INSTR monitorenter ;
        zoomChanged = true;
        zoomMode = 2;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setZoomIn()
    {
        this;
        JVM INSTR monitorenter ;
        zoomChanged = true;
        zoomMode = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setZoomOut()
    {
        this;
        JVM INSTR monitorenter ;
        zoomChanged = true;
        zoomMode = 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public native boolean skipFrame();

    public int start(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder("start: ")).append(i).append(", ").append(j).toString());
        }
        started = true;
        initialize(i, j);
        stateChanged();
        surface.resume();
        surface.requestRender();
        this;
        JVM INSTR monitorexit ;
        return 0;
        Exception exception;
        exception;
        throw exception;
    }

    public int stop()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "stop");
        }
        started = false;
        stateChanged();
        surface.suspend();
        this;
        JVM INSTR monitorexit ;
        return 0;
        Exception exception;
        exception;
        throw exception;
    }

    public native boolean updateRenderParameters(int i, boolean flag);

    public native boolean updateSourceSize(int i, int j);

    public native boolean updateSurfaceSize(int i, int j);

}
