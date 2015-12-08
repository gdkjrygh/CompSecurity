// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.filter.bi;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.LocalFilterInfo;
import java.nio.IntBuffer;
import java.util.concurrent.Semaphore;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageRenderer;

// Referenced classes of package com.roidapp.imagelib.a:
//            g, b, c, f, 
//            d, e

public final class a
{

    public g a;
    private Activity b;
    private GPUImage c;
    private GLSurfaceView d;
    private bi e;
    private GPUImageFilter f;
    private int g;
    private int h;
    private f i;

    public a(Activity activity)
    {
        a = null;
        b = activity;
        g = b.getResources().getDisplayMetrics().widthPixels;
        h = b.getResources().getDisplayMetrics().heightPixels;
    }

    static GLSurfaceView a(a a1)
    {
        return a1.d;
    }

    private void a(GPUImageFilter gpuimagefilter)
    {
        GPUImageFilter gpuimagefilter1 = e.h();
        if (gpuimagefilter1 == null || gpuimagefilter1 != null && gpuimagefilter != gpuimagefilter1)
        {
            e.a(gpuimagefilter);
            if (c != null)
            {
                c.setFilter(e.h());
                c.requestRender();
            }
        }
    }

    public final Bitmap a(int j, int k)
    {
        Semaphore semaphore;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Do not call this method from the UI thread!");
        }
        a = new g(j, k);
        semaphore = new Semaphore(0);
        c.mRenderer.mGalaxyYCapture = true;
        d.post(new com.roidapp.imagelib.a.b(this));
        synchronized (c.mRenderer.mSurfaceChangedWaiter)
        {
            c.mRenderer.mSurfaceChangedWaiter.wait(3000L);
        }
_L2:
        c.runOnGLThread(new c(this, semaphore));
        d.requestRender();
        semaphore.acquire();
        return h();
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final Bitmap a(Bitmap bitmap)
    {
        e.c();
        return e.a(bitmap);
    }

    public final void a()
    {
        c.startRender();
    }

    public final void a(int j)
    {
        e.a(j);
    }

    public final void a(int j, e e1)
    {
        i = new f(this, j, e1);
        i.execute(new Void[0]);
    }

    public final void a(int j, boolean flag, boolean flag1)
    {
        e.a(j, flag, flag1);
    }

    public final void a(IFilterInfo ifilterinfo)
    {
        int j = ifilterinfo.a();
        e.b(j);
        e.a(ifilterinfo);
        if (ifilterinfo instanceof CloudFilterInfo)
        {
            f = e.a((CloudFilterInfo)ifilterinfo, g, h, e.g());
        } else
        {
            f = e.a(j, g, h, e.g(), false);
        }
        f.setDarkCorner(e.d());
        a(f);
    }

    public final void a(GPUImage gpuimage, GLSurfaceView glsurfaceview)
    {
        c = gpuimage;
        d = glsurfaceview;
        e = new bi(b);
        e.b(0);
        e.a(new LocalFilterInfo((byte)0));
        e.c(true);
        e.b();
        e.a(true);
        e.e();
        e.a(new b());
        f = e.a(e.f(), g, h, e.g(), false);
        f.setDarkCorner(false);
    }

    public final void a(boolean flag)
    {
        e.b(flag);
        f.setDarkCorner(flag);
    }

    public final int b()
    {
        return e.f();
    }

    public final void b(int j)
    {
        e.a(j);
        e.j();
        c.requestRender();
    }

    public final void b(boolean flag)
    {
        e.a(flag);
    }

    public final void c()
    {
        IFilterInfo ifilterinfo = e.i();
        if (ifilterinfo instanceof CloudFilterInfo)
        {
            f = e.a((CloudFilterInfo)ifilterinfo, g, h, e.g());
        } else
        {
            f = e.a(e.f(), g, h, e.g(), false);
        }
        f.setDarkCorner(e.d());
        a(f);
    }

    public final void c(int j)
    {
        e.a(j);
        e.j();
    }

    public final void c(boolean flag)
    {
        e.b(flag);
        IFilterInfo ifilterinfo = e.i();
        if (ifilterinfo instanceof CloudFilterInfo)
        {
            f = e.a((CloudFilterInfo)ifilterinfo, g, h, e.g());
        } else
        {
            f = e.a(e.f(), g, h, e.g(), false);
        }
        f.setDarkCorner(flag);
        a(f);
    }

    public final b d()
    {
        return e.g();
    }

    public final void e()
    {
        if (d != null)
        {
            c.deleteBufferDirectly();
            c.deleteImage();
            c.deleteFilter();
        }
    }

    public final IFilterInfo f()
    {
        return e.i();
    }

    public final void g()
    {
        i.cancel(true);
    }

    public final Bitmap h()
    {
        Object obj = new Semaphore(0);
        int j = d.getMeasuredWidth();
        int k = d.getMeasuredHeight();
        int ai[] = new int[j * k];
        c.runOnGLThread(new d(this, j, k, ai, ((Semaphore) (obj))));
        d.requestRender();
        ((Semaphore) (obj)).acquire();
        obj = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.ARGB_8888);
        ((Bitmap) (obj)).copyPixelsFromBuffer(IntBuffer.wrap(ai));
        return ((Bitmap) (obj));
    }
}
