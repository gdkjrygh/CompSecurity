// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;

// Referenced classes of package com.skype.android.media:
//            j, h, f, i, 
//            SurfaceTextureRenderer

public class GLTextureView extends TextureView
    implements android.os.Handler.Callback, android.view.TextureView.SurfaceTextureListener
{

    private j a;
    private HandlerThread b;
    private Handler c;
    private boolean d;
    private boolean e;
    private boolean f;
    private SurfaceTextureRenderer g;
    private android.view.TextureView.SurfaceTextureListener h;
    private Object i;
    private boolean j;

    public GLTextureView(Context context)
    {
        super(context);
        super.setSurfaceTextureListener(this);
        i = this;
        j = true;
    }

    private void a(SurfaceTexture surfacetexture)
    {
        if (a != null)
        {
            a.b(j);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new h();
        } else
        {
            a = new f();
        }
        a.a(surfacetexture);
        a.a(true);
    }

    public final void a()
    {
        if (c != null && !d)
        {
            c.removeMessages(1);
            c.sendEmptyMessage(1);
        }
    }

    public final void a(Runnable runnable)
    {
        if (c != null)
        {
            c.post(runnable);
        }
    }

    public final void b()
    {
        d = true;
        if (c != null)
        {
            c.removeMessages(1);
        }
    }

    public final void c()
    {
        d = false;
        a();
    }

    public boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 305
    //                   2 42
    //                   3 87
    //                   4 184
    //                   5 388;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return false;
_L3:
        d = false;
        SurfaceTexture surfacetexture = (SurfaceTexture)message.obj;
        a(surfacetexture);
        if (h != null)
        {
            h.onSurfaceTextureAvailable(surfacetexture, message.arg1, message.arg2);
        }
        return true;
_L4:
        if (g != null)
        {
            if (f)
            {
                a.a(true);
            }
            g.e();
        }
        SurfaceTexture surfacetexture1 = (SurfaceTexture)message.obj;
        a(surfacetexture1);
        if (g != null)
        {
            g.b(message.arg1, message.arg2);
        }
        if (h != null)
        {
            h.onSurfaceTextureSizeChanged(surfacetexture1, message.arg1, message.arg2);
        }
        return true;
_L5:
        if (h != null)
        {
            h.onSurfaceTextureDestroyed((SurfaceTexture)message.obj);
        }
        if (g != null)
        {
            g.d();
            g = null;
        }
        if (a != null)
        {
            a.b(j);
            a = null;
        }
        return true;
        message;
        if (g != null)
        {
            g.d();
            g = null;
        }
        if (a != null)
        {
            a.b(j);
            a = null;
        }
        throw message;
_L2:
        if (a == null || d)
        {
            break; /* Loop/switch isn't completed */
        }
        if (g != null)
        {
            synchronized (i)
            {
                if (f)
                {
                    a.a(true);
                }
                g.f();
                a.a();
            }
        }
        break; /* Loop/switch isn't completed */
        exception;
        message;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        if (e)
        {
            throw message;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (b != null)
        {
            b.quit();
            b = null;
        }
        c = null;
        return true;
        return true;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int k, int l)
    {
        e = true;
        if (f)
        {
            c = new Handler(Looper.getMainLooper(), this);
        } else
        {
            b = new HandlerThread("GLTextureView");
            b.start();
            c = new Handler(b.getLooper(), this);
        }
        c.sendMessage(c.obtainMessage(2, k, l, surfacetexture));
        a();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        e = false;
        c.sendMessage(c.obtainMessage(4, 0, 0, surfacetexture));
        c.sendEmptyMessage(5);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int k, int l)
    {
        c.sendMessage(c.obtainMessage(3, k, l, surfacetexture));
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void setReleaseSurfaceThread(boolean flag)
    {
        j = flag;
    }

    public void setRenderSync(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("sync cannot be null");
        } else
        {
            i = obj;
            return;
        }
    }

    public void setRenderer(SurfaceTextureRenderer surfacetexturerenderer)
    {
        g = surfacetexturerenderer;
    }

    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfacetexturelistener)
    {
        h = surfacetexturelistener;
    }

    public void setUseMainThread(boolean flag)
    {
        f = flag;
    }
}
