// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer.ExoPlaybackException;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.exo.AggregateException;
import com.spotify.mobile.android.video.exo.GlUtil;
import java.util.List;

public final class glb extends azg
{

    boolean h;
    private glc i;
    private SurfaceTexture j;
    private int k;
    private int l;
    private gle m;
    private gle n;
    private glf o;
    private int p;
    private Surface q;
    private int r;
    private int s;
    private EGLSurface t;
    private Surface u;
    private final gld v;
    private float w[];

    glb(azl azl, bbm bbm, Handler handler, gld gld1)
    {
        super(azl, bbm, handler, gld1);
        v = gld1;
    }

    private void r()
    {
        if (t != null && t != EGL14.EGL_NO_SURFACE)
        {
            EGL14.eglMakeCurrent(i.a, i.c, i.c, i.b);
            EGL14.eglDestroySurface(i.a, t);
            int i1 = EGL14.eglGetError();
            if (i1 != 12288)
            {
                Logger.c("Error detaching the surface: %s", new Object[] {
                    Integer.valueOf(i1)
                });
                return;
            }
        }
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            if (i == null)
            {
                i = new glc((byte)0);
                try
                {
                    i.a = GlUtil.a();
                    i.b = GlUtil.a(i.a);
                    i.c = GlUtil.b(i.a);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new ExoPlaybackException("Setting up GL rendering failed.", ((Throwable) (obj)));
                }
                GlUtil.a(i.a, i.b, i.c, 1, 1);
                l = GlUtil.c();
                m = new gle(l, "a_position");
                n = new gle(l, "a_texcoord");
                o = new glf(l, "tex_sampler_0");
                p = GLES20.glGetUniformLocation(l, "u_transform_mat");
                m.a(new float[] {
                    -1F, -1F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 1.0F, -1F, 1.0F, 
                    0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F
                }, 4);
                n.a(new float[] {
                    0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 
                    1.0F, 1.0F
                }, 3);
                k = GlUtil.b();
                j = new SurfaceTexture(k);
                u = new Surface(j);
                super.a(1, u);
                w = new float[16];
                Matrix.setIdentityM(w, 0);
                h = false;
                j.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() {

                    private glb a;

                    public final void onFrameAvailable(SurfaceTexture surfacetexture)
                    {
                        a.h = true;
                    }

            
            {
                a = glb.this;
                super();
            }
                });
            }
            r();
            v.c = false;
            q = (Surface)obj;
            t = EGL14.EGL_NO_SURFACE;
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    protected final void a(long l1, long l2)
    {
        if (q != null && q.isValid() && h)
        {
            if (t == EGL14.EGL_NO_SURFACE)
            {
                t = GlUtil.a(i.a, q);
                int ai[] = new int[1];
                EGL14.eglQuerySurface(i.a, t, 12375, ai, 0);
                int ai1[] = new int[1];
                EGL14.eglQuerySurface(i.a, t, 12374, ai1, 0);
                r = ai[0];
                s = ai1[0];
            }
            GlUtil.a(i.a, i.b, t, r, s);
            j.updateTexImage();
            j.getTransformMatrix(w);
            GLES20.glUseProgram(l);
            GLES20.glUniformMatrix4fv(p, 1, false, w, 0);
            o.b = k;
            m.a();
            n.a();
            Object obj = o;
            if (((glf) (obj)).b == 0)
            {
                throw new IllegalStateException("call setSamplerTexId before bind");
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, ((glf) (obj)).b);
            GLES20.glUniform1i(((glf) (obj)).a, 0);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GlUtil.d();
            GLES20.glDrawArrays(5, 0, 4);
            EGL14.eglSwapBuffers(i.a, t);
            obj = v;
            if (!((gld) (obj)).c)
            {
                obj.c = true;
                ((gld) (obj)).b.post(new gld._cls1(((gld) (obj))));
            }
        }
        super.a(l1, l2);
    }

    protected final void n()
    {
        AggregateException aggregateexception;
        Object obj;
        aggregateexception = new AggregateException();
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        try
        {
            r();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aggregateexception.a(((Exception) (obj)));
        }
        obj = i;
        GlUtil.a(((glc) (obj)).a, ((glc) (obj)).b);
        Exception exception1;
        try
        {
            obj.a = null;
            obj.b = null;
            obj.c = null;
        }
        catch (Exception exception)
        {
            aggregateexception.a(exception);
        }
        u.release();
        j.release();
        super.n();
        if (!aggregateexception.mExceptionList.isEmpty())
        {
            throw aggregateexception;
        } else
        {
            return;
        }
        exception1;
        obj.a = null;
        obj.b = null;
        obj.c = null;
        throw exception1;
    }
}
