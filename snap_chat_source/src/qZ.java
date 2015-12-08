// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.view.Surface;
import com.looksery.core.LSCoreManagerWrapper;
import com.looksery.core.LSSoundManager;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public final class qZ
    implements android.view.TextureView.SurfaceTextureListener, qW.a
{
    public static final class a
    {

        final int a;
        final int b;
        final fP c;

        public a(int i1, int j1, fP fp)
        {
            a = i1;
            b = j1;
            c = fp;
        }
    }

    public static interface b
    {

        public abstract void a(boolean flag);
    }


    private static final qZ m = new qZ();
    public final OQ a;
    public b b;
    public a c;
    public boolean d;
    public boolean e;
    public qW f;
    public SurfaceTexture g;
    public qF h;
    public fQ i;
    fQ j;
    public boolean k;
    fS l;
    private final Context n;
    private final LA o;
    private boolean p;
    private boolean q;
    private float r[];
    private fQ s;
    private fQ t;
    private boolean u;
    private BlockingQueue v;
    private int w;

    protected qZ()
    {
        Bt.a();
        this(((Context) (SnapchatApplication.get())), LA.a(), new OQ(), qY.a());
    }

    private qZ(Context context, LA la, OQ oq, qY qy)
    {
        p = false;
        e = false;
        q = true;
        r = new float[16];
        u = false;
        v = new LinkedBlockingDeque();
        k = false;
        n = context;
        o = la;
        a = oq;
        d = k();
        o.addObserver(new Observer() {

            private qZ a;

            public final void update(Observable observable, Object obj)
            {
                qZ.a(a);
            }

            
            {
                a = qZ.this;
                super();
            }
        });
    }

    static void a(qZ qz)
    {
        qz.h();
    }

    static qF b(qZ qz)
    {
        return qz.h;
    }

    private void b(fQ fq)
    {
        s = fq;
        u = false;
    }

    static SurfaceTexture c(qZ qz)
    {
        return qz.g;
    }

    static boolean d(qZ qz)
    {
        return qz.p;
    }

    static fS e(qZ qz)
    {
        qz.l = null;
        return null;
    }

    public static qZ e()
    {
        return m;
    }

    public static boolean f()
    {
        return Ic.SUPPORTS_RECORDING_SURFACE;
    }

    private void i()
    {
        if (!p)
        {
            LSCoreManagerWrapper.init(n);
            p = true;
        }
    }

    private void j()
    {
        do
        {
            if (v.isEmpty())
            {
                break;
            }
            Runnable runnable = (Runnable)v.poll();
            if (runnable != null)
            {
                runnable.run();
            }
        } while (true);
    }

    private boolean k()
    {
        Timber.i("LensesProcessingCore", (new StringBuilder("Current ABI: ")).append(Build.CPU_ABI).toString(), new Object[0]);
        if (Build.CPU_ABI.startsWith("arm"))
        {
            if (o.p())
            {
                Timber.i("LensesProcessingCore", "ignore looksery whitelist because of developer settings.", new Object[0]);
                return l();
            }
            Boolean boolean1 = Bt.bY();
            Timber.i("LensesProcessingCore", "isDeviceWhiteListedOnBackend %s", new Object[] {
                boolean1
            });
            if (boolean1 != null && boolean1.booleanValue() && l())
            {
                return true;
            }
        }
        return false;
    }

    private static boolean l()
    {
        boolean flag = LSCoreManagerWrapper.isNativeLibLoadedSuccessfully();
        Timber.i("LensesProcessingCore", (new StringBuilder("isNativeLibLoaded ")).append(flag).toString(), new Object[0]);
        return flag;
    }

    public final void a()
    {
        i();
        w = LSCoreManagerWrapper.createCameraTexture();
        Timber.i("LensesProcessingCore", (new StringBuilder("Camera texture id: ")).append(w).toString(), new Object[0]);
        g = new SurfaceTexture(w);
        g.setOnFrameAvailableListener(f);
        PG.a(new Runnable() {

            private qZ a;

            public final void run()
            {
                if (qZ.b(a) != null)
                {
                    qZ.b(a).a(qZ.c(a));
                }
            }

            
            {
                a = qZ.this;
                super();
            }
        });
        LSCoreManagerWrapper.setCameraTextureId(w);
    }

    public final void a(Surface surface)
    {
        if (f != null)
        {
            f.a = surface;
        }
    }

    public final void a(fQ fq)
    {
        Timber.i("LensesProcessingCore", (new StringBuilder("setInputSize: ")).append(fq).toString(), new Object[0]);
        t = fq;
    }

    public final void a(Runnable runnable)
    {
        v.add(runnable);
    }

    public final void a(String s1, String s2, String s3)
    {
        a(new Runnable(s1, s2, s3) {

            private String a;
            private String b;
            private String c;
            private qZ d;

            public final void run()
            {
                if (qZ.d(d))
                {
                    LSCoreManagerWrapper.setFilterParam(a, b, c);
                }
            }

            
            {
                d = qZ.this;
                a = s1;
                b = s2;
                c = s3;
                super();
            }
        });
    }

    public final void a(boolean flag)
    {
        boolean flag1 = true;
        if (e == flag)
        {
            return;
        }
        Timber.i("LensesProcessingCore", (new StringBuilder("setLensesEnabled ")).append(flag).toString(), new Object[0]);
        if (flag)
        {
            if (d)
            {
                e = true;
                flag = flag1;
            } else
            {
                flag = false;
            }
            Timber.i("LensesProcessingCore", (new StringBuilder("tryEnableLensesProcessing ")).append(flag).toString(), new Object[0]);
            return;
        } else
        {
            e = false;
            LSSoundManager.stopAll();
            return;
        }
    }

    public final void b()
    {
        if (!u && t != null && s != null)
        {
            fQ fq1 = t;
            double d1 = Math.sqrt(((double)fQ.a.b * (double)fQ.a.c) / ((double)fq1.b * (double)fq1.c));
            fQ fq = fq1;
            if (d1 < 1.0D)
            {
                int i1 = (int)(d1 * (double)fq1.b) / 32 << 5;
                fq = new fQ(i1, (int)(((((double)i1 / (double)fq1.b) * (double)fq1.c) / 4D) * 4D));
            }
            j = fq;
            Timber.i("LensesProcessingCore", (new StringBuilder("Screen size: ")).append(s).toString(), new Object[0]);
            Timber.i("LensesProcessingCore", (new StringBuilder("Processing size: ")).append(j).toString(), new Object[0]);
            Timber.i("LensesProcessingCore", (new StringBuilder("Input size: ")).append(t).toString(), new Object[0]);
            LSCoreManagerWrapper.setInputImageSize(t);
            LSCoreManagerWrapper.setScreenSize(s);
            LSCoreManagerWrapper.setProcessingSize(j);
            u = true;
        }
        j();
        if (k)
        {
            i();
            if (c != null)
            {
                LSCoreManagerWrapper.checkIfPointAtFace(c.a, c.b, c.c);
                LSCoreManagerWrapper.restartTracking(c.a, c.b);
                c = null;
            }
            g.updateTexImage();
            g.getTransformMatrix(r);
            LSCoreManagerWrapper.setTextureTransform(r);
            LSCoreManagerWrapper.processImage();
            LSCoreManagerWrapper.drawCameraImage();
            k = false;
        } else
        if (e)
        {
            i();
            g.updateTexImage();
            g.getTransformMatrix(r);
            LSCoreManagerWrapper.setTextureTransform(r);
            LSCoreManagerWrapper.processImage();
        } else
        {
            g.updateTexImage();
            g.getTransformMatrix(r);
            LSCoreManagerWrapper.setTextureTransform(r);
            LSCoreManagerWrapper.drawCameraImage();
        }
        a.a();
    }

    public final void c()
    {
        fQ fq = i;
        if (fq != null)
        {
            LSCoreManagerWrapper.setRecorderImageSize(fq);
        }
        LSCoreManagerWrapper.drawRecorderTexture();
    }

    public final void d()
    {
        if (w != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                w
            }, 0);
            w = -1;
        }
        if (g != null)
        {
            g.release();
            g = null;
        }
        u = false;
        p = false;
        LSCoreManagerWrapper.release();
    }

    public final void g()
    {
        a(new Runnable() {

            private qZ a;

            public final void run()
            {
                if (qZ.d(a))
                {
                    LSCoreManagerWrapper.removeAllFilters();
                }
            }

            
            {
                a = qZ.this;
                super();
            }
        });
    }

    public final void h()
    {
        boolean flag = k();
        if (d != flag)
        {
            d = flag;
            if (b != null)
            {
                b.a(d);
            }
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        Timber.i("LensesProcessingCore", (new StringBuilder("onSurfaceTextureAvailable: ")).append(i1).append("x").append(j1).toString(), new Object[0]);
        b(new fQ(i1, j1));
        if (f == null)
        {
            f = new qW(surfacetexture, this, q);
            f.start();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        Timber.i("LensesProcessingCore", "onSurfaceTextureDestroyed", new Object[0]);
        if (f != null)
        {
            synchronized (f)
            {
                surfacetexture.b = true;
                surfacetexture.notifyAll();
            }
        }
        f = null;
        return true;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        Timber.i("LensesProcessingCore", "onSurfaceTextureSizeChanged", new Object[0]);
        b(new fQ(i1, j1));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }


    // Unreferenced inner class qZ$4

/* anonymous class */
    public final class _cls4
        implements Runnable
    {

        private String a;
        private qZ b;

        public final void run()
        {
            if (qZ.d(b))
            {
                LSCoreManagerWrapper.addFilter(a);
            }
        }

            public 
            {
                b = qZ.this;
                a = s1;
                super();
            }
    }


    // Unreferenced inner class qZ$6

/* anonymous class */
    public final class _cls6
        implements Runnable
    {

        private int a;
        private int b;
        private qZ c;

        public final void run()
        {
            if (qZ.d(c))
            {
                LSCoreManagerWrapper.restartTracking(a, b);
            }
        }

            public 
            {
                c = qZ.this;
                a = i1;
                b = j1;
                super();
            }
    }


    // Unreferenced inner class qZ$7

/* anonymous class */
    public final class _cls7
        implements Runnable
    {

        private qZ a;

        public final void run()
        {
            if (qZ.d(a))
            {
                LSCoreManagerWrapper.restartTrackingWithoutVisualisation();
            }
        }

            public 
            {
                a = qZ.this;
                super();
            }
    }


    // Unreferenced inner class qZ$8

/* anonymous class */
    final class _cls8
        implements fS
    {

        final Bitmap a;
        final qx b;
        private qZ c;

        public final void a(fR fr)
        {
            Timber.i("LensesProcessingCore", "onPhotoCaptured", new Object[0]);
            a.setPixels(fr.a, 0, fr.d, 0, 0, fr.b, fr.c);
            PG.a(new Runnable(this) {

                private _cls8 a;

                public final void run()
                {
    final class _cls8
        implements fS
    {
                    a.b.a(a.a);
                }

            
            {
                a = _pcls8;
                super();
            }
            });
            qZ.e(c);
        }

            
            {
                c = qZ.this;
                a = bitmap;
                b = qx;
                super();
            }
    }

}
