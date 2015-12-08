// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class ovb
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener, oux
{

    private static final float a[] = {
        -1F, -1F, 0.0F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 1.0F, 1.0F, 
        -1F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F
    };
    private static final ovc b = new ovc();
    private final int c;
    private final int d;
    private EGL10 e;
    private EGLDisplay f;
    private EGLContext g;
    private EGLSurface h;
    private FloatBuffer i;
    private float j[];
    private float k[];
    private float l[];
    private float m[];
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private SurfaceTexture t;
    private Surface u;
    private AtomicBoolean v;
    private ByteBuffer w;

    public ovb(int i1, int j1, int k1)
    {
        this(i1, j1, k1, null);
    }

    private ovb(int i1, int j1, int k1, ovc ovc1)
    {
        f = EGL10.EGL_NO_DISPLAY;
        g = EGL10.EGL_NO_CONTEXT;
        h = EGL10.EGL_NO_SURFACE;
        j = new float[16];
        k = new float[16];
        l = new float[16];
        m = new float[16];
        v = new AtomicBoolean();
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (j1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        ovc1 = b;
        c = i1;
        d = j1;
        e = (EGL10)EGLContext.getEGL();
        f = e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (f == EGL10.EGL_NO_DISPLAY)
        {
            throw new ouy("unable to get EGL display", new Object[0]);
        }
        Object aobj[] = new int[2];
        if (!e.eglInitialize(f, ((int []) (aobj))))
        {
            throw new ouy("unable to initialize EGL", new Object[0]);
        }
        aobj = new EGLConfig[1];
        int ai1[] = new int[1];
        if (!e.eglChooseConfig(f, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 
    12339, 1, 12344
}, ((EGLConfig []) (aobj)), 1, ai1))
        {
            throw new ouy(String.format("Unable to retrieve list of ES2 frame buffer configurations ", new Object[] {
                "(EGL error 0x%08x)", Integer.valueOf(e.eglGetError())
            }), new Object[0]);
        }
        if (ai1[0] <= 0)
        {
            throw new ouy("Unable to find RGB888+recordable ES2 EGL config", new Object[0]);
        }
        g = e.eglCreateContext(f, aobj[0], EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        int l1 = e.eglGetError();
        if (g == null || l1 != 12288)
        {
            throw new ouy(String.format("Unable to create context (EGL error 0x%08x)", new Object[] {
                Integer.valueOf(l1)
            }), new Object[0]);
        }
        l1 = c;
        int i2 = d;
        h = e.eglCreatePbufferSurface(f, aobj[0], new int[] {
            12375, l1, 12374, i2, 12344
        });
        l1 = e.eglGetError();
        if (g == null || l1 != 12288)
        {
            throw new ouy(String.format("Unable to create surface (EGL error 0x%08x)", new Object[] {
                Integer.valueOf(l1)
            }), new Object[0]);
        }
        if (!e.eglMakeCurrent(f, h, h, g))
        {
            throw new ouy(String.format("eglMakeCurrent failed (EGL error 0x%08x)", new Object[] {
                Integer.valueOf(e.eglGetError())
            }), new Object[0]);
        } else
        {
            i = ByteBuffer.allocateDirect(a.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
            i.put(a).position(0);
            n = a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            r = b(n, "aPosition");
            s = b(n, "aTextureCoord");
            p = c(n, "uMVPMatrix");
            q = c(n, "uSTMatrix");
            int ai[] = new int[1];
            GLES20.glGenTextures(1, ai, 0);
            o = ai[0];
            GLES20.glBindTexture(36197, o);
            a("glBindTexture");
            GLES20.glTexParameterf(36197, 10241, 9728F);
            GLES20.glTexParameterf(36197, 10240, 9729F);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            a("glTexParameter");
            t = ovc1.a(o);
            t.setOnFrameAvailableListener(this);
            u = new Surface(t);
            w = ByteBuffer.allocateDirect(i1 * j1 << 2);
            w.order(ByteOrder.LITTLE_ENDIAN);
            Matrix.setIdentityM(k, 0);
            Matrix.translateM(k, 0, 0.5F, 0.5F, 0.0F);
            Matrix.rotateM(k, 0, k1, 0.0F, 0.0F, 1.0F);
            Matrix.translateM(k, 0, -0.5F, -0.5F, 0.0F);
            return;
        }
    }

    private static int a(int i1, String s1)
    {
        int j1 = GLES20.glCreateShader(i1);
        if (j1 == 0)
        {
            throw new ouy("Unable to create shader. Type: %d", new Object[] {
                Integer.valueOf(i1)
            });
        }
        GLES20.glShaderSource(j1, s1);
        GLES20.glCompileShader(j1);
        s1 = new int[1];
        GLES20.glGetShaderiv(j1, 35713, s1, 0);
        if (s1[0] != 1)
        {
            s1 = GLES20.glGetShaderInfoLog(j1);
            GLES20.glDeleteShader(j1);
            throw new ouy("Could not compile shader (Type: %d):\n%s", new Object[] {
                Integer.valueOf(i1), s1
            });
        } else
        {
            return j1;
        }
    }

    private int a(String s1, String s2)
    {
        int j1;
        int i2 = 0;
        int k1 = 0;
        int i1;
        int l1;
        int j2;
        try
        {
            i1 = a(35633, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            j1 = 0;
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            k1 = 0;
            i1 = 0;
            continue; /* Loop/switch isn't completed */
        }
        j1 = a(35632, s2);
        i2 = k1;
        k1 = j1;
        l1 = i1;
        j2 = GLES20.glCreateProgram();
        if (j2 != 0) goto _L2; else goto _L1
_L1:
        i2 = j2;
        k1 = j1;
        l1 = i1;
        try
        {
            throw new ouy("Unable to create program", new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            i1 = l1;
        }
_L6:
        k1 = j1;
        l1 = i1;
        GLES20.glDeleteProgram(i2);
        k1 = j1;
        l1 = i1;
        throw s1;
_L4:
        GLES20.glDeleteShader(i1);
        GLES20.glDeleteShader(k1);
        throw s1;
_L2:
        i2 = j2;
        k1 = j1;
        l1 = i1;
        GLES20.glAttachShader(j2, i1);
        i2 = j2;
        k1 = j1;
        l1 = i1;
        a("glAttachShader - vertexShader");
        i2 = j2;
        k1 = j1;
        l1 = i1;
        GLES20.glAttachShader(j2, j1);
        i2 = j2;
        k1 = j1;
        l1 = i1;
        a("glAttachShader - pixelShader");
        i2 = j2;
        k1 = j1;
        l1 = i1;
        GLES20.glLinkProgram(j2);
        i2 = j2;
        k1 = j1;
        l1 = i1;
        s1 = new int[1];
        i2 = j2;
        k1 = j1;
        l1 = i1;
        GLES20.glGetProgramiv(j2, 35714, s1, 0);
        if (s1[0] == 1)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        i2 = j2;
        k1 = j1;
        l1 = i1;
        throw new ouy("Could not link program:\n%s", new Object[] {
            GLES20.glGetProgramInfoLog(j2)
        });
        GLES20.glDeleteShader(i1);
        GLES20.glDeleteShader(j1);
        return j2;
        s1;
        k1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_14;
        s1;
        j1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(String s1)
    {
        int i1 = GLES20.glGetError();
        if (i1 != 0)
        {
            throw new ouy("Failed: %s, glError: %d", new Object[] {
                s1, Integer.valueOf(i1)
            });
        } else
        {
            return;
        }
    }

    private static int b(int i1, String s1)
    {
        i1 = GLES20.glGetAttribLocation(i1, s1);
        if (i1 < 0)
        {
            throw new ouy("Unable to find attribute %s", new Object[] {
                s1
            });
        } else
        {
            return i1;
        }
    }

    private static int c(int i1, String s1)
    {
        i1 = GLES20.glGetUniformLocation(i1, s1);
        if (i1 < 0)
        {
            throw new ouy("Unable to find uniform variable %s", new Object[] {
                s1
            });
        } else
        {
            return i1;
        }
    }

    public final Surface a()
    {
        return u;
    }

    public final Bitmap b()
    {
        AtomicBoolean atomicboolean = v;
        atomicboolean;
        JVM INSTR monitorenter ;
        long l1 = System.currentTimeMillis();
        do
        {
            if (v.get())
            {
                break MISSING_BLOCK_LABEL_81;
            }
            v.wait(Math.max(1L, 2500L - System.currentTimeMillis()));
        } while (System.currentTimeMillis() <= l1 + 2500L || v.get());
        throw new ouy("frame wait timed out", new Object[0]);
        Exception exception;
        exception;
        atomicboolean;
        JVM INSTR monitorexit ;
        throw exception;
        if (!v.getAndSet(false))
        {
            throw new AssertionError("Frame was not available");
        }
        atomicboolean;
        JVM INSTR monitorexit ;
        a("before updateTexImage");
        t.updateTexImage();
        a("after updateTexImage");
        t.getTransformMatrix(l);
        Matrix.multiplyMM(m, 0, k, 0, l, 0);
        GLES20.glUseProgram(n);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, o);
        i.position(0);
        GLES20.glVertexAttribPointer(r, 3, 5126, false, 20, i);
        a("glVertexAttribPointer - handleAPosition");
        GLES20.glEnableVertexAttribArray(r);
        a("glEnableVertexAttribArray - handleAPosition");
        i.position(3);
        GLES20.glVertexAttribPointer(s, 2, 5126, false, 20, i);
        a("glVertexAttribPointer - handleATextureCoord");
        GLES20.glEnableVertexAttribArray(s);
        a("glEnableVertexAttribArray - handleATextureCoord");
        Matrix.setIdentityM(j, 0);
        GLES20.glUniformMatrix4fv(p, 1, false, j, 0);
        GLES20.glUniformMatrix4fv(q, 1, false, m, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glBindTexture(36197, 0);
        w.rewind();
        GLES20.glReadPixels(0, 0, c, d, 6408, 5121, w);
        Bitmap bitmap = Bitmap.createBitmap(c, d, android.graphics.Bitmap.Config.ARGB_8888);
        w.rewind();
        bitmap.copyPixelsFromBuffer(w);
        return bitmap;
    }

    public final void c()
    {
        boolean flag;
        if (f != EGL10.EGL_NO_DISPLAY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        GLES20.glDeleteProgram(n);
        n = 0;
        e.eglDestroySurface(f, h);
        e.eglDestroyContext(f, g);
        e.eglMakeCurrent(f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        e.eglTerminate(f);
        f = EGL10.EGL_NO_DISPLAY;
        g = EGL10.EGL_NO_CONTEXT;
        h = EGL10.EGL_NO_SURFACE;
        u.release();
        u = null;
        t.release();
        t = null;
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        synchronized (v)
        {
            v.set(true);
            v.notifyAll();
        }
        return;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
