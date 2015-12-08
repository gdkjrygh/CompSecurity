// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.lang.ref.WeakReference;

public final class ohq extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{

    public static final ohy a = new ohy();
    public final WeakReference b = new WeakReference(this);
    public ohx c;
    public oia d;
    public oht e;
    public ohu f;
    public ohv g;
    public int h;
    private boolean i;

    public ohq(Context context)
    {
        super(context);
        setSurfaceTextureListener(this);
    }

    static int a(ohq ohq1)
    {
        return ohq1.h;
    }

    static oht b(ohq ohq1)
    {
        return ohq1.e;
    }

    static ohu c(ohq ohq1)
    {
        return ohq1.f;
    }

    static ohy c()
    {
        return a;
    }

    static ohv d(ohq ohq1)
    {
        return ohq1.g;
    }

    static k e(ohq ohq1)
    {
        return null;
    }

    static int f(ohq ohq1)
    {
        return 0;
    }

    static boolean g(ohq ohq1)
    {
        return false;
    }

    static oia h(ohq ohq1)
    {
        return ohq1.d;
    }

    public final void a()
    {
        ohx ohx1 = c;
        synchronized (a)
        {
            ohx1.h = true;
            a.notifyAll();
        }
        return;
        exception;
        ohy1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        if (c != null)
        {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        } else
        {
            return;
        }
    }

    protected final void finalize()
    {
        if (c != null)
        {
            c.e();
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (i && d != null)
        {
            int j;
            if (c != null)
            {
                j = c.a();
            } else
            {
                j = 1;
            }
            c = new ohx(b);
            if (j != 1)
            {
                c.a(j);
            }
            c.start();
        }
        i = false;
    }

    protected final void onDetachedFromWindow()
    {
        if (c != null)
        {
            c.e();
        }
        i = true;
        super.onDetachedFromWindow();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int j, int k)
    {
        ohx ohx1 = c;
        surfacetexture = a;
        surfacetexture;
        JVM INSTR monitorenter ;
        ohx1.d = true;
        ohx1.f = false;
        a.notifyAll();
_L1:
        boolean flag;
        if (!ohx1.e || ohx1.f)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        flag = ohx1.a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        c.a(j, k);
        return;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        ohx ohx1 = c;
        surfacetexture = a;
        surfacetexture;
        JVM INSTR monitorenter ;
        ohx1.d = false;
        a.notifyAll();
_L1:
        boolean flag;
        if (ohx1.e)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = ohx1.a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int j, int k)
    {
        c.a(j, k);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        c.b();
    }

}
