// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.image;

import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import ajv;
import ajw;
import ala;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media.filterfw.ViewFilter;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGLSurface;

public class SurfaceHolderTarget extends ViewFilter
{

    private boolean mHasSurface;
    private ajv mRenderTarget;
    private ajl mShader;
    private SurfaceHolder mSurfaceHolder;
    private android.view.SurfaceHolder.Callback mSurfaceHolderListener;

    public SurfaceHolderTarget(ajr ajr, String s)
    {
        super(ajr, s);
        mSurfaceHolder = null;
        mRenderTarget = null;
        mShader = null;
        mHasSurface = false;
        mSurfaceHolderListener = new ala(this);
    }

    private void a(SurfaceHolder surfaceholder)
    {
        this;
        JVM INSTR monitorenter ;
        if (mSurfaceHolder != surfaceholder)
        {
            throw new RuntimeException("Unexpected Holder!");
        }
        break MISSING_BLOCK_LABEL_25;
        surfaceholder;
        this;
        JVM INSTR monitorexit ;
        throw surfaceholder;
        mHasSurface = true;
        this;
        JVM INSTR monitorexit ;
    }

    public static void a(SurfaceHolderTarget surfaceholdertarget, SurfaceHolder surfaceholder)
    {
        surfaceholdertarget.a(surfaceholder);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (mRenderTarget != null)
        {
            mRenderTarget.f();
            mRenderTarget = null;
        }
        mHasSurface = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        return super.b().a("image", 2, aif1).a();
    }

    protected final void b(ajo ajo1)
    {
        super.c(ajo1);
    }

    protected final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (r())
        {
            mShader = ajl.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void d()
    {
        this;
        JVM INSTR monitorenter ;
        Surface surface;
        mSurfaceHolder.addCallback(mSurfaceHolderListener);
        surface = mSurfaceHolder.getSurface();
        if (surface == null) goto _L2; else goto _L1
_L1:
        if (!surface.isValid()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        mHasSurface = flag;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a("image").a().h();
        if (!mHasSurface) goto _L2; else goto _L1
_L1:
        Object obj = mSurfaceHolder;
        obj;
        JVM INSTR monitorenter ;
        ajv ajv1;
        EGLSurface eglsurface;
        if (!r())
        {
            break MISSING_BLOCK_LABEL_216;
        }
        if (mRenderTarget != null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        mRenderTarget = ajv.a().a(mSurfaceHolder);
        ajv1 = mRenderTarget;
        if (ajv.a)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        eglsurface = (EGLSurface)ajv.e.get(ajv1.c);
        if (eglsurface == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (!eglsurface.equals(ajv1.d))
        {
            throw new RuntimeException("This device supports only a single display surface!");
        }
        break MISSING_BLOCK_LABEL_120;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        ajv.e.put(ajv1.c, ajv1.d);
        Rect rect = new Rect(0, 0, ((ahv) (obj1)).m(), ((ahv) (obj1)).n());
        Rect rect1 = mSurfaceHolder.getSurfaceFrame();
        a(mShader, rect, rect1);
        mShader.a(((ahv) (obj1)).o(), mRenderTarget, rect1.width(), rect1.height());
        ((ahv) (obj1)).k();
        mRenderTarget.d();
_L3:
        obj;
        JVM INSTR monitorexit ;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Canvas canvas = mSurfaceHolder.lockCanvas();
        obj1 = ((ahv) (obj1)).q();
        Rect rect2 = new Rect(0, 0, ((Bitmap) (obj1)).getWidth(), ((Bitmap) (obj1)).getHeight());
        Rect rect3 = mSurfaceHolder.getSurfaceFrame();
        RectF rectf = a(rect2, rect3);
        canvas.drawColor(0xff000000);
        if (rectf.width() > 0.0F && rectf.height() > 0.0F)
        {
            canvas.scale(rect3.width(), rect3.height());
            canvas.drawBitmap(((Bitmap) (obj1)), rect2, rectf, new Paint());
        }
        mSurfaceHolder.unlockCanvasAndPost(canvas);
          goto _L3
    }

    protected final void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (mRenderTarget != null)
        {
            ajv ajv1 = mRenderTarget;
            if (!ajv.a)
            {
                ajv.e.put(ajv1.c, null);
            }
            mRenderTarget.f();
            mRenderTarget = null;
        }
        if (mSurfaceHolder != null)
        {
            mSurfaceHolder.removeCallback(mSurfaceHolderListener);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
