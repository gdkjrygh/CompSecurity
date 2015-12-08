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
import alb;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.ConditionVariable;
import android.view.TextureView;
import androidx.media.filterfw.ViewFilter;

public class SurfaceTextureTarget extends ViewFilter
{

    private static final int MAX_WAIT_FOR_VIEW_TIME = 1000;
    private ajv mRenderTarget;
    private ajl mShader;
    private SurfaceTexture mSurfaceTexture;
    private Rect mSurfaceTextureRect;
    private TextureView mView;
    private ConditionVariable mWaitForST;

    public SurfaceTextureTarget(ajr ajr, String s)
    {
        super(ajr, s);
        mSurfaceTexture = null;
        mRenderTarget = null;
        mShader = null;
        mWaitForST = new ConditionVariable(true);
        mView = null;
    }

    public static ConditionVariable a(SurfaceTextureTarget surfacetexturetarget)
    {
        return surfacetexturetarget.mWaitForST;
    }

    private void a()
    {
        mView.setSurfaceTextureListener(null);
    }

    public static void b(SurfaceTextureTarget surfacetexturetarget)
    {
        surfacetexturetarget.mSurfaceTexture = null;
        if (surfacetexturetarget.mView != null)
        {
            surfacetexturetarget.a();
            surfacetexturetarget.mView = null;
        }
    }

    public final void a(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        mSurfaceTextureRect = new Rect(0, 0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(SurfaceTexture surfacetexture, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (n())
        {
            throw new IllegalStateException("Cannot set SurfaceTexture while running!");
        }
        break MISSING_BLOCK_LABEL_24;
        surfacetexture;
        this;
        JVM INSTR monitorexit ;
        throw surfacetexture;
        mSurfaceTexture = surfacetexture;
        a(i, j);
        this;
        JVM INSTR monitorexit ;
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

    protected final void d()
    {
        if (mView != null)
        {
            if (mView.getSurfaceTextureListener() != null)
            {
                throw new RuntimeException("TextureView is already hooked up to another listener!");
            }
            mWaitForST.close();
            mView.setSurfaceTextureListener(new alb(this));
            if (mView.isAvailable())
            {
                a(mView.getSurfaceTexture(), mView.getWidth(), mView.getHeight());
                mWaitForST.open();
            }
            if (!mWaitForST.block(1000L))
            {
                throw new RuntimeException("Timed out waiting for TextureView to become available!");
            }
        }
        if (mSurfaceTexture == null)
        {
            throw new NullPointerException("SurfaceTextureTarget has no SurfaceTexture!");
        } else
        {
            mRenderTarget = ajv.a().a(mSurfaceTexture);
            mShader = ajl.a();
            return;
        }
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        ahv ahv1 = a("image").a().h();
        if (mSurfaceTexture != null)
        {
            synchronized (mSurfaceTexture)
            {
                Rect rect = new Rect(0, 0, ahv1.m(), ahv1.n());
                a(mShader, rect, mSurfaceTextureRect);
                mShader.a(ahv1.o(), mRenderTarget, mSurfaceTextureRect.width(), mSurfaceTextureRect.height());
                ahv1.k();
                mRenderTarget.d();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void f()
    {
        if (mRenderTarget != null)
        {
            mRenderTarget.f();
            mRenderTarget = null;
        }
        if (mView != null)
        {
            a();
            mView = null;
        }
    }
}
