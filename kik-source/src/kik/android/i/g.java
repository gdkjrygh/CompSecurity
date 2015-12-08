// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

final class g
{

    private final float a[] = {
        -1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 0.0F, 
        -1F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
    };
    private FloatBuffer b;
    private float c[];
    private float d[];
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public g()
    {
        c = new float[16];
        d = new float[16];
        f = -12345;
        b = ByteBuffer.allocateDirect(a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        b.put(a).position(0);
        Matrix.setIdentityM(d, 0);
    }

    private static int a(int k, String s)
    {
        int l = GLES20.glCreateShader(k);
        a((new StringBuilder("glCreateShader type=")).append(k).toString());
        GLES20.glShaderSource(l, s);
        GLES20.glCompileShader(l);
        s = new int[1];
        GLES20.glGetShaderiv(l, 35713, s, 0);
        if (s[0] == 0)
        {
            GLES20.glDeleteShader(l);
            return 0;
        } else
        {
            return l;
        }
    }

    public static void a(String s)
    {
        int k = GLES20.glGetError();
        if (k != 0)
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(": glError ").append(k).toString());
        } else
        {
            return;
        }
    }

    public final int a()
    {
        return f;
    }

    public final void a(SurfaceTexture surfacetexture)
    {
        a("onDrawFrame start");
        surfacetexture.getTransformMatrix(d);
        GLES20.glClearColor(0.0F, 1.0F, 0.0F, 1.0F);
        GLES20.glClear(16640);
        GLES20.glUseProgram(e);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, f);
        b.position(0);
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 20, b);
        a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(i);
        a("glEnableVertexAttribArray maPositionHandle");
        b.position(3);
        GLES20.glVertexAttribPointer(j, 2, 5126, false, 20, b);
        a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(j);
        a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(c, 0);
        GLES20.glUniformMatrix4fv(g, 1, false, c, 0);
        GLES20.glUniformMatrix4fv(h, 1, false, d, 0);
        GLES20.glDrawArrays(5, 0, 4);
        a("glDrawArrays");
        GLES20.glFinish();
    }

    public final void b()
    {
        int k = a(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (k != 0) goto _L2; else goto _L1
_L1:
        k = 0;
_L4:
        e = k;
        if (e == 0)
        {
            throw new RuntimeException("failed creating program");
        }
        break; /* Loop/switch isn't completed */
_L2:
        int i1 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if (i1 == 0)
        {
            k = 0;
        } else
        {
            int l = GLES20.glCreateProgram();
            a("glCreateProgram");
            GLES20.glAttachShader(l, k);
            a("glAttachShader");
            GLES20.glAttachShader(l, i1);
            a("glAttachShader");
            GLES20.glLinkProgram(l);
            int ai[] = new int[1];
            GLES20.glGetProgramiv(l, 35714, ai, 0);
            k = l;
            if (ai[0] != 1)
            {
                GLES20.glDeleteProgram(l);
                k = 0;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = GLES20.glGetAttribLocation(e, "aPosition");
        a("glGetAttribLocation aPosition");
        if (i == -1)
        {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        j = GLES20.glGetAttribLocation(e, "aTextureCoord");
        a("glGetAttribLocation aTextureCoord");
        if (j == -1)
        {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        g = GLES20.glGetUniformLocation(e, "uMVPMatrix");
        a("glGetUniformLocation uMVPMatrix");
        if (g == -1)
        {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        h = GLES20.glGetUniformLocation(e, "uSTMatrix");
        a("glGetUniformLocation uSTMatrix");
        if (h == -1)
        {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        } else
        {
            int ai1[] = new int[1];
            GLES20.glGenTextures(1, ai1, 0);
            f = ai1[0];
            GLES20.glBindTexture(36197, f);
            a("glBindTexture mTextureID");
            GLES20.glTexParameterf(36197, 10241, 9728F);
            GLES20.glTexParameterf(36197, 10240, 9729F);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            a("glTexParameter");
            return;
        }
    }
}
