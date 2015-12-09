// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.threading.b;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class AviaryGLSurfaceView extends GLSurfaceView
{
    private class a
        implements android.opengl.GLSurfaceView.Renderer
    {

        final AviaryGLSurfaceView a;
        private int b;
        private int c;

        public void onDrawFrame(GL10 gl10)
        {
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a().a("onDrawFrame");
        }

        public void onSurfaceChanged(GL10 gl10, int i, int j)
        {
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a().a((new StringBuilder()).append("onSurfaceChanged. ").append(i).append("x").append(j).toString());
            boolean flag;
            if (b != i || c != j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = i;
            c = j;
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.b(a, flag, i, j);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
        {
            Log.d("GL", (new StringBuilder()).append("GL_RENDERER = ").append(gl10.glGetString(7937)).toString());
            Log.d("GL", (new StringBuilder()).append("GL_VENDOR = ").append(gl10.glGetString(7936)).toString());
            Log.d("GL", (new StringBuilder()).append("GL_VERSION = ").append(gl10.glGetString(7938)).toString());
            Log.i("GL", (new StringBuilder()).append("GL_EXTENSIONS = ").append(gl10.glGetString(7939)).toString());
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a().a("onSurfaceCreated");
            AviaryGLSurfaceView.c(a);
        }

        private a()
        {
            a = AviaryGLSurfaceView.this;
            super();
        }

    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(boolean flag, int i, int j);
    }

    class c
        implements com.aviary.android.feather.common.threading.ThreadPool.b
    {

        final AviaryGLSurfaceView a;

        public volatile Object a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Object aobj[])
            throws Exception
        {
            return a(worker, (Void[])aobj);
        }

        public transient Void a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Void avoid[])
            throws Exception
        {
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a().a("InitializeOpenGlJob::run");
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.b(a);
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a().a("end::nativeInitialize");
            return null;
        }

        c()
        {
            a = AviaryGLSurfaceView.this;
            super();
        }
    }

    class d
        implements com.aviary.android.feather.common.threading.ThreadPool.b
    {

        final AviaryGLSurfaceView a;

        public volatile Object a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Object aobj[])
            throws Exception
        {
            return a(worker, (Integer[])aobj);
        }

        public transient Void a(com.aviary.android.feather.common.threading.ThreadPool.Worker worker, Integer ainteger[])
            throws Exception
        {
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a().a("SetRenderbufferSizeJob::run");
            com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a(a, ainteger[0].intValue(), ainteger[1].intValue());
            return null;
        }

        public d()
        {
            a = AviaryGLSurfaceView.this;
            super();
        }
    }


    private static final com.aviary.android.feather.common.a.a.c a;
    private static final Handler b = new Handler();
    private final Object c;
    private final long d;
    private b e;

    public AviaryGLSurfaceView(Context context)
    {
        super(context);
        c = new Object();
        d = a(context, ((AttributeSet) (null)));
    }

    public AviaryGLSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Object();
        d = a(context, attributeset);
    }

    private long a(Context context, AttributeSet attributeset)
    {
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        setRenderer(new a());
        setRenderMode(0);
        return c();
    }

    static com.aviary.android.feather.common.a.a.c a()
    {
        return a;
    }

    static void a(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        aviaryglsurfaceview.f();
    }

    static void a(AviaryGLSurfaceView aviaryglsurfaceview, boolean flag, int i, int j)
    {
        aviaryglsurfaceview.b(flag, i, j);
    }

    private void a(boolean flag, int i, int j)
    {
        a(((com.aviary.android.feather.common.threading.ThreadPool.b) (new d())), new com.aviary.android.feather.common.threading.b(flag, i, j) {

            final boolean a;
            final int b;
            final int c;
            final AviaryGLSurfaceView d;

            public void a(com.aviary.android.feather.common.threading.a a1)
            {
                com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a(d, a, b, c);
            }

            
            {
                d = AviaryGLSurfaceView.this;
                a = flag;
                b = i;
                c = j;
                super();
            }
        }, ((Object []) (new Integer[] {
            Integer.valueOf(i), Integer.valueOf(j)
        })));
    }

    private boolean a(int i, int j)
    {
        a.a("nativeSetRenderBufferSize");
        boolean flag;
        synchronized (c)
        {
            flag = n_setRenderbufferSize(d, i, j);
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static boolean a(AviaryGLSurfaceView aviaryglsurfaceview, int i, int j)
    {
        return aviaryglsurfaceview.a(i, j);
    }

    private void b()
    {
        a(new c(), new com.aviary.android.feather.common.threading.b() {

            final AviaryGLSurfaceView a;

            public void a(com.aviary.android.feather.common.threading.a a1)
            {
                com.aviary.android.feather.sdk.opengl.AviaryGLSurfaceView.a(a);
            }

            
            {
                a = AviaryGLSurfaceView.this;
                super();
            }
        }, new Void[0]);
    }

    static void b(AviaryGLSurfaceView aviaryglsurfaceview, boolean flag, int i, int j)
    {
        aviaryglsurfaceview.a(flag, i, j);
    }

    private void b(boolean flag, int i, int j)
    {
        if (e != null)
        {
            getHandler().post(new Runnable(flag, i, j) {

                final boolean a;
                final int b;
                final int c;
                final AviaryGLSurfaceView d;

                public void run()
                {
                    AviaryGLSurfaceView.d(d).a(a, b, c);
                }

            
            {
                d = AviaryGLSurfaceView.this;
                a = flag;
                b = i;
                c = j;
                super();
            }
            });
        }
    }

    static boolean b(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        return aviaryglsurfaceview.e();
    }

    private long c()
    {
        a.a("nativeCreate");
        long l;
        synchronized (c)
        {
            l = n_create();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void c(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        aviaryglsurfaceview.b();
    }

    static b d(AviaryGLSurfaceView aviaryglsurfaceview)
    {
        return aviaryglsurfaceview.e;
    }

    private void d()
    {
        a.a("nativeDispose");
        synchronized (c)
        {
            n_dispose(d);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean e()
    {
        a.a("nativeInitialize");
        boolean flag;
        synchronized (c)
        {
            flag = n_initialize(d);
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void f()
    {
        if (e != null)
        {
            e.a();
        }
    }

    private static native long n_create();

    private static native boolean n_dispose(long l);

    private static native boolean n_initialize(long l);

    private static native boolean n_render(long l, Bitmap bitmap, String s);

    private static native boolean n_setRenderbufferSize(long l, int i, int j);

    private static native boolean n_writeCurrentBitmap(long l, Bitmap bitmap);

    public transient com.aviary.android.feather.common.threading.a a(com.aviary.android.feather.common.threading.ThreadPool.b b1, com.aviary.android.feather.common.threading.b b2, Object aobj[])
    {
        throw new RuntimeException("Not Implemented");
    }

    protected void onDetachedFromWindow()
    {
        a.b("onDetachedfromWindow");
        d();
        super.onDetachedFromWindow();
    }

    public void setOnGlRendererListener(b b1)
    {
        e = b1;
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("gl-surface", com.aviary.android.feather.common.a.a.d.a);
    }
}
