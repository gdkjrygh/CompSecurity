// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public final class mzp
    implements mzo
{

    private static final String g = mzp.getSimpleName();
    private static final float h[] = {
        0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 
        1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F
    };
    private static final mzt z = new mzt();
    public float a[];
    public int b;
    public int c;
    public int d;
    public float e[];
    public ArrayList f;
    private float i[];
    private mzy j;
    private int k;
    private int l;
    private int m;
    private int n;
    private mzr o[] = {
        new mzq("aPosition"), new mzs("uMatrix"), new mzs("uColor")
    };
    private mzr p[] = {
        new mzq("aPosition"), new mzs("uMatrix"), new mzs("uTextureMatrix"), new mzs("uTextureSampler"), new mzs("uAlpha")
    };
    private mzr q[] = {
        new mzq("aPosition"), new mzs("uMatrix"), new mzs("uTextureMatrix"), new mzs("uTextureSampler"), new mzs("uAlpha")
    };
    private mzr r[] = {
        new mzq("aPosition"), new mzs("uMatrix"), new mzq("aTextureCoordinate"), new mzs("uTextureSampler"), new mzs("uAlpha")
    };
    private final mzy s = new mzy();
    private int t;
    private final float u[] = new float[32];
    private final RectF v = new RectF();
    private final RectF w = new RectF();
    private final float x[] = new float[16];
    private final int y[] = new int[1];

    public mzp()
    {
        a = new float[128];
        i = new float[8];
        j = new mzy();
        k = 0;
        b = 0;
        e = new float[16];
        new mzy();
        t = 0;
        f = new ArrayList();
        Matrix.setIdentityM(x, 0);
        Matrix.setIdentityM(a, b);
        i[k] = 1.0F;
        f.add(null);
        float af[] = h;
        FloatBuffer floatbuffer = ByteBuffer.allocateDirect(af.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatbuffer.put(af, 0, af.length).position(0);
        z.a(1, y, 0);
        d();
        int i1 = y[0];
        GLES20.glBindBuffer(34962, i1);
        d();
        GLES20.glBufferData(34962, floatbuffer.capacity() << 2, floatbuffer, 35044);
        d();
        n = i1;
        i1 = a(35633, "uniform mat4 uMatrix;\nattribute vec2 aPosition;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n}\n");
        int j1 = a(35633, "uniform mat4 uMatrix;\nuniform mat4 uTextureMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = (uTextureMatrix * pos).xy;\n}\n");
        int k1 = a(35633, "uniform mat4 uMatrix;\nattribute vec2 aPosition;\nattribute vec2 aTextureCoordinate;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = aTextureCoordinate;\n}\n");
        int l1 = a(35632, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n  gl_FragColor = uColor;\n}\n");
        int i2 = a(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform sampler2D uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n");
        int j2 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform samplerExternalOES uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n");
        a(i1, l1, o);
        l = a(j1, i2, p);
        m = a(j1, j2, q);
        a(k1, i2, r);
        GLES20.glBlendFunc(1, 771);
        d();
    }

    private int a(int i1, int j1, mzr amzr[])
    {
        boolean flag = false;
        int k1 = GLES20.glCreateProgram();
        d();
        if (k1 == 0)
        {
            i1 = GLES20.glGetError();
            throw new RuntimeException((new StringBuilder(37)).append("Cannot create GL program: ").append(i1).toString());
        }
        GLES20.glAttachShader(k1, i1);
        d();
        GLES20.glAttachShader(k1, j1);
        d();
        GLES20.glLinkProgram(k1);
        d();
        int ai[] = y;
        GLES20.glGetProgramiv(k1, 35714, ai, 0);
        i1 = k1;
        j1 = ((flag) ? 1 : 0);
        if (ai[0] != 1)
        {
            Log.e(g, "Could not link program: ");
            Log.e(g, GLES20.glGetProgramInfoLog(k1));
            GLES20.glDeleteProgram(k1);
            i1 = 0;
            j1 = ((flag) ? 1 : 0);
        }
        for (; j1 < amzr.length; j1++)
        {
            amzr[j1].a(i1);
        }

        return i1;
    }

    private static int a(int i1, String s1)
    {
        i1 = GLES20.glCreateShader(i1);
        GLES20.glShaderSource(i1, s1);
        d();
        GLES20.glCompileShader(i1);
        d();
        return i1;
    }

    private static void a(RectF rectf, RectF rectf1, mzm mzm1)
    {
        int i1 = mzm1.b();
        int j1 = mzm1.c();
        int k1 = mzm1.d();
        int l1 = mzm1.e();
        rectf.left = rectf.left / (float)k1;
        rectf.right = rectf.right / (float)k1;
        rectf.top = rectf.top / (float)l1;
        rectf.bottom = rectf.bottom / (float)l1;
        float f1 = (float)i1 / (float)k1;
        if (rectf.right > f1)
        {
            rectf1.right = rectf1.left + (rectf1.width() * (f1 - rectf.left)) / rectf.width();
            rectf.right = f1;
        }
        f1 = (float)j1 / (float)l1;
        if (rectf.bottom > f1)
        {
            rectf1.bottom = rectf1.top + (rectf1.height() * (f1 - rectf.top)) / rectf.height();
            rectf.bottom = f1;
        }
    }

    private void b(mzm mzm1, RectF rectf, RectF rectf1)
    {
        x[0] = rectf.width();
        x[5] = rectf.height();
        x[12] = rectf.left;
        x[13] = rectf.top;
        rectf = x;
        mzm1.f();
        mzr amzr[] = p;
        GLES20.glUseProgram(l);
        d();
        float f1;
        float f2;
        float f3;
        float f4;
        int i1;
        if (!mzm1.j() || e() < 0.95F)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            GLES20.glEnable(3042);
            d();
        } else
        {
            GLES20.glDisable(3042);
            d();
        }
        GLES20.glActiveTexture(33984);
        d();
        mzm1.a(this);
        GLES20.glBindTexture(mzm1.f(), mzm1.a);
        d();
        GLES20.glUniform1i(amzr[3].a, 0);
        d();
        GLES20.glUniform1f(amzr[4].a, e());
        d();
        GLES20.glBindBuffer(34962, n);
        d();
        GLES20.glVertexAttribPointer(amzr[0].a, 2, 5126, false, 8, 0);
        d();
        GLES20.glBindBuffer(34962, 0);
        d();
        GLES20.glUniformMatrix4fv(amzr[2].a, 1, false, rectf, 0);
        d();
        if (mzm1.a())
        {
            a(2);
            a(0.0F, rectf1.centerY());
            Matrix.scaleM(a, b, 1.0F, -1F, 1.0F);
            a(0.0F, -rectf1.centerY());
        }
        f1 = rectf1.left;
        f2 = rectf1.top;
        f3 = rectf1.width();
        f4 = rectf1.height();
        Matrix.translateM(u, 0, a, b, f1, f2, 0.0F);
        Matrix.scaleM(u, 0, f3, f4, 1.0F);
        Matrix.multiplyMM(u, 16, e, 0, u, 0);
        GLES20.glUniformMatrix4fv(amzr[1].a, 1, false, u, 16);
        d();
        i1 = amzr[0].a;
        GLES20.glEnableVertexAttribArray(i1);
        d();
        GLES20.glDrawArrays(5, 0, 4);
        d();
        GLES20.glDisableVertexAttribArray(i1);
        d();
        if (mzm1.a())
        {
            b();
        }
        t = t + 1;
    }

    public static void c()
    {
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        d();
        GLES20.glClear(16384);
        d();
    }

    public static void d()
    {
        int i1 = GLES20.glGetError();
        if (i1 != 0)
        {
            Throwable throwable = new Throwable();
            Log.e(g, (new StringBuilder(21)).append("GL error: ").append(i1).toString(), throwable);
        }
    }

    private float e()
    {
        return i[k];
    }

    public final mzt a()
    {
        return z;
    }

    public final void a(float f1, float f2)
    {
        int i1 = b;
        float af[] = a;
        int j1 = i1 + 12;
        af[j1] = af[j1] + (af[i1] * f1 + af[i1 + 4] * f2);
        j1 = i1 + 13;
        af[j1] = af[j1] + (af[i1 + 1] * f1 + af[i1 + 5] * f2);
        j1 = i1 + 14;
        af[j1] = af[j1] + (af[i1 + 2] * f1 + af[i1 + 6] * f2);
        j1 = i1 + 15;
        float f3 = af[j1];
        float f4 = af[i1 + 3];
        af[j1] = af[i1 + 7] * f2 + f4 * f1 + f3;
    }

    public final void a(float f1, float f2, float f3, float f4)
    {
        if (f1 == 0.0F)
        {
            return;
        } else
        {
            float af[] = u;
            Matrix.setRotateM(af, 0, f1, 0.0F, 0.0F, 1.0F);
            float af1[] = a;
            int i1 = b;
            Matrix.multiplyMM(af, 16, af1, i1, af, 0);
            System.arraycopy(af, 16, af1, i1, 16);
            return;
        }
    }

    public final void a(int i1)
    {
        i1 = b;
        b = b + 16;
        if (a.length <= b)
        {
            a = Arrays.copyOf(a, a.length << 1);
        }
        System.arraycopy(a, i1, a, b, 16);
        j.a(2);
    }

    public final void a(mzm mzm1, int i1, int j1)
    {
        mzm1.f();
        GLES20.glBindTexture(3553, mzm1.a);
        d();
        GLES20.glTexImage2D(3553, 0, i1, mzm1.d(), mzm1.e(), 0, i1, j1, null);
    }

    public final void a(mzm mzm1, int i1, int j1, int k1, int l1)
    {
        int k2 = 1;
        int l2 = 0;
        if (k1 <= 0 || l1 <= 0)
        {
            return;
        }
        RectF rectf = v;
        int j2 = mzm1.b();
        int i2 = mzm1.c();
        if (mzm1.e)
        {
            j2--;
            i2--;
            l2 = 1;
        } else
        {
            k2 = 0;
        }
        rectf.set(l2, k2, j2, i2);
        w.set(i1, j1, i1 + k1, j1 + l1);
        a(v, w, mzm1);
        b(mzm1, v, w);
    }

    public final void a(mzm mzm1, int i1, int j1, Bitmap bitmap, int k1, int l1)
    {
        mzm1.f();
        GLES20.glBindTexture(3553, mzm1.a);
        d();
        GLUtils.texSubImage2D(3553, 0, i1, j1, bitmap, k1, l1);
    }

    public final void a(mzm mzm1, Bitmap bitmap)
    {
        mzm1.f();
        GLES20.glBindTexture(3553, mzm1.a);
        d();
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    public final void a(mzm mzm1, RectF rectf, RectF rectf1)
    {
        if (rectf1.width() <= 0.0F || rectf1.height() <= 0.0F)
        {
            return;
        } else
        {
            v.set(rectf);
            w.set(rectf1);
            a(v, w, mzm1);
            b(mzm1, v, w);
            return;
        }
    }

    public final boolean a(mzm mzm1)
    {
        boolean flag = mzm1.g();
        if (flag)
        {
            synchronized (s)
            {
                s.a(mzm1.a);
            }
            return flag;
        } else
        {
            return flag;
        }
        mzm1;
        mzy1;
        JVM INSTR monitorexit ;
        throw mzm1;
    }

    public final void b()
    {
        boolean flag1 = true;
        mzy mzy1 = j;
        mzy1.b = mzy1.b - 1;
        int i1 = mzy1.a[mzy1.b];
        boolean flag;
        if ((i1 & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            k = k - 1;
        }
        if ((i1 & 2) == 2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b = b - 16;
        }
    }

    public final void b(mzm mzm1)
    {
        mzm1.f();
        GLES20.glBindTexture(3553, mzm1.a);
        d();
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameterf(3553, 10241, 9729F);
        GLES20.glTexParameterf(3553, 10240, 9729F);
    }

}
