// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            EncoderRenderer, SurfaceTextureRenderer, GLES20Program, ShaderEffect, 
//            SurfaceWrapper

public class GLES20Renderer
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener, EncoderRenderer, SurfaceTextureRenderer
{
    public static interface Overlay
    {

        public abstract void a();

        public abstract void a(float af[]);

        public abstract void b();

        public abstract void b(float af[]);
    }

    private final class a extends GLES20Program
    {

        final GLES20Renderer a;
        private int b;
        private int c;
        private int d;
        private int e;

        static int a(a a1)
        {
            return a1.b;
        }

        static int b(a a1)
        {
            return a1.c;
        }

        static int c(a a1)
        {
            return a1.d;
        }

        static int d(a a1)
        {
            return a1.e;
        }

        a(String s1)
        {
            a = GLES20Renderer.this;
            super("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", s1);
            int i1 = b();
            d = GLES20.glGetAttribLocation(i1, "aPosition");
            e = GLES20.glGetAttribLocation(i1, "aTextureCoord");
            b = GLES20.glGetUniformLocation(i1, "uMVPMatrix");
            c = GLES20.glGetUniformLocation(i1, "uTexMatrix");
        }
    }


    private static final Logger a = Logger.getLogger("GLES");
    private int b;
    private float c[];
    private float d[];
    private float e[];
    private float f[];
    private FloatBuffer g;
    private FloatBuffer h;
    private int i[];
    private String j;
    private SurfaceWrapper k;
    private SurfaceTexture l;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener m;
    private Matrix n;
    private float o[];
    private a p;
    private a q;
    private boolean r;
    private AtomicBoolean s;
    private Set t;
    private Set u;
    private int v;
    private int w;

    public GLES20Renderer(SurfaceWrapper surfacewrapper, android.graphics.SurfaceTexture.OnFrameAvailableListener onframeavailablelistener, boolean flag)
    {
        k = surfacewrapper;
        m = onframeavailablelistener;
        i = new int[1];
        n = new Matrix();
        o = new float[9];
        c = new float[16];
        d = new float[16];
        e = new float[16];
        f = new float[16];
        android.opengl.Matrix.setIdentityM(d, 0);
        android.opengl.Matrix.setIdentityM(e, 0);
        android.opengl.Matrix.setIdentityM(f, 0);
        g = GLES20Program.a(new float[] {
            -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
        });
        h = GLES20Program.a(new float[] {
            0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F
        });
        s = new AtomicBoolean();
        j = ShaderEffect.a.a();
        b = 36197;
        r = flag;
        t = new CopyOnWriteArraySet();
        u = new CopyOnWriteArraySet();
    }

    static String a(GLES20Renderer gles20renderer, String s1)
    {
        gles20renderer.j = s1;
        return s1;
    }

    static AtomicBoolean a(GLES20Renderer gles20renderer)
    {
        return gles20renderer.s;
    }

    private void a(a a1, float af[])
    {
        GLES20.glUseProgram(a1.b());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(b, 0);
        GLES20.glBindTexture(b, i[0]);
        GLES20.glUniformMatrix4fv(a.a(a1), 1, false, af, 0);
        GLES20.glUniformMatrix4fv(a.b(a1), 1, false, c, 0);
        GLES20.glEnableVertexAttribArray(a.c(a1));
        GLES20.glVertexAttribPointer(a.c(a1), 2, 5126, false, 8, g);
        GLES20.glEnableVertexAttribArray(a.d(a1));
        GLES20.glVertexAttribPointer(a.d(a1), 2, 5126, false, 8, h);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(a.c(a1));
        GLES20.glDisableVertexAttribArray(a.d(a1));
        GLES20.glBindTexture(b, 0);
        GLES20.glUseProgram(0);
        GLES20.glFinish();
        for (Iterator iterator = t.iterator(); iterator.hasNext();)
        {
            Overlay overlay = (Overlay)iterator.next();
            if (!u.contains(overlay))
            {
                overlay.a();
                u.add(overlay);
            }
            if (a1 == q && q != null)
            {
                overlay.b(af);
            } else
            {
                overlay.a(af);
            }
        }

    }

    private void a(float af[])
    {
        if (k != null)
        {
            k.a(n);
            n.getValues(o);
            af[0] = o[0];
            af[1] = o[1];
            af[4] = o[3];
            af[5] = o[4];
            af[10] = o[8];
        }
    }

    private void g()
    {
        p = new a(j);
        q = new a(j);
    }

    private void h()
    {
        if (p != null)
        {
            p.a();
            p = null;
        }
        if (q != null)
        {
            q.a();
            q = null;
        }
    }

    private void i()
    {
        Overlay overlay;
        for (Iterator iterator = t.iterator(); iterator.hasNext(); u.add(overlay))
        {
            overlay = (Overlay)iterator.next();
            overlay.a();
        }

    }

    public final void a()
    {
        if (l != null && q != null)
        {
            android.opengl.Matrix.setIdentityM(e, 0);
            a(e);
            android.opengl.Matrix.multiplyMM(e, 0, e, 0, f, 0);
            a(q, e);
        }
    }

    public final void a(int i1, int j1)
    {
        v = i1;
        w = j1;
        GLES20.glGenTextures(i.length, i, 0);
        int ai[] = i;
        j1 = ai.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            GLES20.glBindTexture(b, k1);
            GLES20.glTexParameterf(b, 10241, 9728F);
            GLES20.glTexParameterf(b, 10240, 9729F);
            GLES20.glTexParameteri(b, 10242, 33071);
            GLES20.glTexParameteri(b, 10243, 33071);
        }

        l = new SurfaceTexture(i[0]);
        l.setOnFrameAvailableListener(this);
        g();
        i();
    }

    public final void a(Overlay overlay)
    {
        t.add(overlay);
    }

    public final void a(String s1)
    {
        if (k != null && s1 != null && !s1.equals(j))
        {
            k.a(new Runnable(s1) {

                final String a;
                final GLES20Renderer b;

                public final void run()
                {
                    GLES20Renderer.a(b, a);
                    GLES20Renderer.a(b).set(true);
                }

            
            {
                b = GLES20Renderer.this;
                a = s1;
                super();
            }
            });
        }
    }

    public final void b(int i1, int j1)
    {
        l.attachToGLContext(i[0]);
        v = i1;
        w = j1;
        g();
        i();
    }

    public final void b(Overlay overlay)
    {
        t.remove(overlay);
    }

    public final float[] b()
    {
        return f;
    }

    public final SurfaceTexture c()
    {
        return l;
    }

    public final void d()
    {
        h();
        if (l != null)
        {
            l.release();
            l = null;
        }
        Overlay overlay;
        for (Iterator iterator = t.iterator(); iterator.hasNext(); u.remove(overlay))
        {
            overlay = (Overlay)iterator.next();
            overlay.b();
        }

    }

    public final void e()
    {
        h();
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((Overlay)iterator.next()).b()) { }
        l.detachFromGLContext();
    }

    public final void f()
    {
        if (l != null && p != null)
        {
            if (s.get())
            {
                h();
                g();
                s.set(false);
            }
            try
            {
                l.updateTexImage();
            }
            catch (Exception exception)
            {
                a.log(Level.WARNING, "updateTexImage", exception);
            }
            l.getTransformMatrix(c);
            if (m != null)
            {
                m.onFrameAvailable(l);
            }
            android.opengl.Matrix.setIdentityM(d, 0);
            if (r)
            {
                a(d);
            }
            a(p, d);
        }
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        if (k != null)
        {
            k.f();
        }
    }

}
