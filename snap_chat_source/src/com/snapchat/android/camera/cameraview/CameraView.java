// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameraview;

import IK;
import Ic;
import Jy;
import OP;
import OQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.camera.lenses.LensesGlTextureView;
import com.snapchat.android.util.SnapMediaUtils;
import qF;
import qw;
import qx;
import rT;

public class CameraView extends RelativeLayout
    implements qw
{
    public final class a
    {

        float a;
        float b;

        a(float f1, float f2)
        {
            a = f1;
            b = f2;
        }
    }


    public FrameLayout a;
    public SurfaceView b;
    public TextureView c;
    public final OQ d;
    public TextureView e;
    public LensesGlTextureView f;
    private final CameraEventAnalytics g;

    public CameraView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, CameraEventAnalytics.a(), ((OQ) (new OP())));
    }

    private CameraView(Context context, AttributeSet attributeset, CameraEventAnalytics cameraeventanalytics, OQ oq)
    {
        super(context, attributeset);
        a = new FrameLayout(getContext());
        a.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(a);
        g = cameraeventanalytics;
        d = oq;
    }

    static OQ a(CameraView cameraview)
    {
        return cameraview.d;
    }

    private Bitmap a(IK ik)
    {
        if (ik == null || c == null)
        {
            return null;
        }
        setDrawingCacheEnabled(true);
        int i = ik.b();
        int j = ik.a();
        ik = SnapMediaUtils.a(new rT(), i, j);
        ik = Jy.a().a(ik, true);
        if (ik == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        try
        {
            ik = c.getBitmap(ik);
        }
        // Misplaced declaration of an exception variable
        catch (IK ik)
        {
            System.gc();
            ik = c.getBitmap(i, j);
        }
        setDrawingCacheEnabled(false);
        return ik;
        ik = c.getBitmap(i, j);
        break MISSING_BLOCK_LABEL_63;
    }

    public static boolean a(double d1, double d2)
    {
        return d1 < d2;
    }

    static FrameLayout b(CameraView cameraview)
    {
        return cameraview.a;
    }

    public final void a()
    {
        if (!Ic.HAS_SURFACE_TEXTURE_RECORDING)
        {
            if (b != null)
            {
                post(new Runnable() {

                    private CameraView a;

                    public final void run()
                    {
                        CameraView.b(a).removeView(a.b);
                        a.b = null;
                    }

            
            {
                a = CameraView.this;
                super();
            }
                });
            }
            if (c != null)
            {
                c.setVisibility(0);
                return;
            }
        }
    }

    public final void a(IK ik, qx qx1)
    {
        g.a(false);
        qx1.a(a(ik));
    }

    public final void a(IK ik, rT rt)
    {
        float f1 = (float)rt.heightPixels / (float)rt.widthPixels;
        float f2 = (float)ik.c();
        if (a(f1, f2))
        {
            ik = new a(1.0F, f2 / f1);
        } else
        {
            ik = new a(f1 / f2, 1.0F);
        }
        c.setScaleX(((a) (ik)).a);
        c.setScaleY(((a) (ik)).b);
    }

    // Unreferenced inner class com/snapchat/android/camera/cameraview/CameraView$1

/* anonymous class */
    public final class _cls1
        implements android.view.TextureView.SurfaceTextureListener
    {

        private qF a;
        private CameraView b;

        public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
        {
            Timber.c("CameraView", "Camera View: Surface texture available", new Object[0]);
            a.a(surfacetexture);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
        {
            Timber.c("CameraView", "Surface Destroyed", new Object[0]);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
        {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
            CameraView.a(b).a();
        }

            public 
            {
                b = CameraView.this;
                a = qf;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/camera/cameraview/CameraView$3

/* anonymous class */
    public final class _cls3
        implements android.view.SurfaceHolder.Callback
    {

        private qF a;

        public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
        {
            Timber.c("CameraView", "Surface Changed to [%d x %d]", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            });
        }

        public final void surfaceCreated(SurfaceHolder surfaceholder)
        {
            a.a(surfaceholder.getSurface());
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            Timber.c("CameraView", "Surface Destroyed", new Object[0]);
        }

            public 
            {
                a = qf;
                super();
            }
    }

}
