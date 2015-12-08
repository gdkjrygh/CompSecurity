// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.render;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;

// Referenced classes of package com.skype.android.video.render:
//            EGLRenderSurface, EGL14RenderSurface, EGL10RenderSurface, EGLException, 
//            SurfaceTextureRenderer

public class GLTextureView extends TextureView
    implements android.os.Handler.Callback, android.view.TextureView.SurfaceTextureListener
{

    private static final int MSG_QUIT = 5;
    private static final int MSG_RENDER = 1;
    private static final int MSG_TEXTURE_AVAILABLE = 2;
    private static final int MSG_TEXTURE_DESTROYED = 4;
    private static final int MSG_TEXTURE_SIZE_CHANGED = 3;
    private boolean available;
    private Handler handler;
    private android.view.TextureView.SurfaceTextureListener listener;
    private boolean releaseSurfaceThread;
    private SurfaceTextureRenderer renderer;
    private EGLRenderSurface surface;
    private boolean suspended;
    private Object sync;
    private HandlerThread thread;
    private boolean useMainThread;

    public GLTextureView(Context context)
    {
        super(context);
        super.setSurfaceTextureListener(this);
        sync = this;
        releaseSurfaceThread = true;
    }

    private void createSurface(SurfaceTexture surfacetexture)
    {
        if (surface != null)
        {
            surface.destroy(releaseSurfaceThread);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            surface = new EGL14RenderSurface();
        } else
        {
            surface = new EGL10RenderSurface();
        }
        surface.create(surfacetexture);
        surface.makeCurrent(true);
    }

    private void render()
    {
        if (surface == null || suspended)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (renderer != null)
        {
            synchronized (sync)
            {
                if (useMainThread)
                {
                    surface.makeCurrent(true);
                }
                renderer.render();
                surface.swapBuffers();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_81;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (EGLException eglexception)
        {
            if (available)
            {
                throw eglexception;
            }
        }
    }

    public boolean getReleaseSurfaceThread()
    {
        return releaseSurfaceThread;
    }

    public Object getRenderSync()
    {
        return sync;
    }

    public SurfaceTextureRenderer getRenderer()
    {
        return renderer;
    }

    public boolean getUseMainThread()
    {
        return useMainThread;
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 329
    //                   2 42
    //                   3 111
    //                   4 208
    //                   5 335;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return false;
_L3:
        suspended = false;
        SurfaceTexture surfacetexture = (SurfaceTexture)message.obj;
        createSurface(surfacetexture);
        if (renderer != null)
        {
            renderer.attach(message.arg1, message.arg2);
        }
        if (listener != null)
        {
            listener.onSurfaceTextureAvailable(surfacetexture, message.arg1, message.arg2);
        }
        return true;
_L4:
        if (renderer != null)
        {
            if (useMainThread)
            {
                surface.makeCurrent(true);
            }
            renderer.detach();
        }
        SurfaceTexture surfacetexture1 = (SurfaceTexture)message.obj;
        createSurface(surfacetexture1);
        if (renderer != null)
        {
            renderer.attach(message.arg1, message.arg2);
        }
        if (listener != null)
        {
            listener.onSurfaceTextureSizeChanged(surfacetexture1, message.arg1, message.arg2);
        }
        return true;
_L5:
        if (listener != null)
        {
            listener.onSurfaceTextureDestroyed((SurfaceTexture)message.obj);
        }
        if (renderer != null)
        {
            renderer.release();
            renderer = null;
        }
        if (surface != null)
        {
            surface.destroy(releaseSurfaceThread);
            surface = null;
        }
        return true;
        message;
        if (renderer != null)
        {
            renderer.release();
            renderer = null;
        }
        if (surface != null)
        {
            surface.destroy(releaseSurfaceThread);
            surface = null;
        }
        throw message;
_L2:
        render();
        return true;
_L6:
        if (thread != null)
        {
            thread.quit();
            thread = null;
        }
        handler = null;
        return true;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        available = true;
        if (useMainThread)
        {
            handler = new Handler(Looper.getMainLooper(), this);
        } else
        {
            thread = new HandlerThread("GLTextureView");
            thread.start();
            handler = new Handler(thread.getLooper(), this);
        }
        handler.sendMessage(handler.obtainMessage(2, i, j, surfacetexture));
        requestRender();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        available = false;
        handler.sendMessage(handler.obtainMessage(4, 0, 0, surfacetexture));
        handler.sendEmptyMessage(5);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        handler.sendMessage(handler.obtainMessage(3, i, j, surfacetexture));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void queueEvent(Runnable runnable)
    {
        if (handler != null)
        {
            handler.post(runnable);
        }
    }

    public void requestRender()
    {
        if (handler != null && !suspended)
        {
            handler.removeMessages(1);
            handler.sendEmptyMessage(1);
        }
    }

    public void resume()
    {
        suspended = false;
        requestRender();
    }

    public void setReleaseSurfaceThread(boolean flag)
    {
        releaseSurfaceThread = flag;
    }

    public void setRenderSync(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("sync cannot be null");
        } else
        {
            sync = obj;
            return;
        }
    }

    public void setRenderer(SurfaceTextureRenderer surfacetexturerenderer)
    {
        renderer = surfacetexturerenderer;
    }

    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfacetexturelistener)
    {
        listener = surfacetexturelistener;
    }

    public void setUseMainThread(boolean flag)
    {
        useMainThread = flag;
    }

    public void suspend()
    {
        suspended = true;
        if (handler != null)
        {
            handler.removeMessages(1);
        }
    }
}
