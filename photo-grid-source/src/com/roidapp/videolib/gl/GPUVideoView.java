// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.gl;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.roidapp.videolib.b.i;
import com.roidapp.videolib.b.m;

// Referenced classes of package com.roidapp.videolib.gl:
//            b, c, d, f

public class GPUVideoView extends GLSurfaceView
{

    private Context a;
    private i b;
    private m c;
    private f d;
    private Handler e;
    private Runnable f;
    private Runnable g;
    private d h;

    public GPUVideoView(Context context)
    {
        super(context);
        e = new Handler();
        f = new b(this);
        g = new c(this);
        h = d.a;
        if (!a(context))
        {
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        } else
        {
            a = context;
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(1);
            c = new m(context);
            b = new i(c);
            b.a(false);
            setRenderer(b);
            setRenderMode(0);
            return;
        }
    }

    public GPUVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new Handler();
        f = new b(this);
        g = new c(this);
        h = d.a;
        if (!a(context))
        {
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        } else
        {
            a = context;
            setEGLContextClientVersion(2);
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(1);
            c = new m(context);
            b = new i(c);
            b.a(false);
            setRenderer(b);
            setRenderMode(0);
            return;
        }
    }

    static i a(GPUVideoView gpuvideoview)
    {
        return gpuvideoview.b;
    }

    private static boolean a(Context context)
    {
        return ((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 0x20000;
    }

    public final void a()
    {
        if (getRenderMode() == 0)
        {
            b.d();
            requestRender();
        }
    }

    public final void a(float f1)
    {
        b.a(f1);
    }

    public final void a(int j)
    {
        synchronized (h)
        {
            if (h != d.b)
            {
                h = d.b;
            }
            b.a(j);
            setRenderMode(1);
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int j, boolean flag)
    {
        if (c != null)
        {
            c.a(j, flag);
            requestRender();
        }
    }

    public final void a(long l)
    {
        synchronized (h)
        {
            if (h != d.b)
            {
                h = d.b;
            }
            b.b(l);
            setRenderMode(1);
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(Handler handler)
    {
        b.a(handler);
    }

    public final void a(f f1)
    {
        d = f1;
        c.a(d);
    }

    public final void b()
    {
        d d1 = h;
        d1;
        JVM INSTR monitorenter ;
        if (h != d.d)
        {
            h = d.d;
        }
        setRenderMode(0);
        b.a();
        Thread.sleep(20L);
_L1:
        return;
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L1
        obj;
        d1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void b(int j)
    {
        b.b(j);
        if (getRenderMode() == 0)
        {
            requestRender();
        }
    }

    public final void b(long l)
    {
        b.c(l);
        if (getRenderMode() == 0)
        {
            requestRender();
        }
    }

    public final void c()
    {
        synchronized (h)
        {
            if (h == d.b)
            {
                h = d.c;
                if (getRenderMode() != 0)
                {
                    setRenderMode(0);
                }
                b.b();
            }
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        synchronized (h)
        {
            if (h == d.c)
            {
                h = d.b;
                if (getRenderMode() != 1)
                {
                    setRenderMode(1);
                }
                b.c();
            }
        }
        return;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int e()
    {
        return c.g();
    }

    public void onPause()
    {
        c();
        super.onPause();
    }

    public void onResume()
    {
        c();
        super.onResume();
    }
}
