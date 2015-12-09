// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import gem;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;

public final class GlUtil
{

    private static final String a;
    private static final int b[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12344
    };

    private static int a(int i, String s)
    {
        int j = GLES20.glCreateShader(i);
        if (j == 0)
        {
            throw new RuntimeException((new StringBuilder("could not create shader: ")).append(GLES20.glGetError()).toString());
        }
        GLES20.glShaderSource(j, s);
        GLES20.glCompileShader(j);
        s = new int[1];
        GLES20.glGetShaderiv(j, 35713, s, 0);
        if (s[0] == 0)
        {
            s = GLES20.glGetShaderInfoLog(j);
            GLES20.glDeleteShader(j);
            throw new RuntimeException((new StringBuilder("could not compile shader ")).append(i).append(":").append(s).toString());
        } else
        {
            return j;
        }
    }

    public static EGLContext a(EGLDisplay egldisplay)
    {
        EGLContext eglcontext = EGL14.eglCreateContext(egldisplay, c(egldisplay), EGL14.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        }, 0);
        if (eglcontext == null)
        {
            EGL14.eglTerminate(egldisplay);
            throw new UnsupportedEglVersionException();
        } else
        {
            return eglcontext;
        }
    }

    public static EGLDisplay a()
    {
        EGLDisplay egldisplay = EGL14.eglGetDisplay(0);
        if (egldisplay == EGL14.EGL_NO_DISPLAY)
        {
            throw new IllegalStateException("no EGL display");
        }
        if (!EGL14.eglInitialize(egldisplay, new int[1], 0, new int[1], 0))
        {
            throw new IllegalStateException("error in eglInitialize");
        } else
        {
            return egldisplay;
        }
    }

    public static EGLSurface a(EGLDisplay egldisplay, Object obj)
    {
        return EGL14.eglCreateWindowSurface(egldisplay, c(egldisplay), obj, new int[] {
            12344
        }, 0);
    }

    public static Buffer a(float af[])
    {
        return ByteBuffer.allocateDirect(af.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(af).position(0);
    }

    public static void a(EGLDisplay egldisplay, EGLContext eglcontext)
    {
        if (egldisplay != null)
        {
            EGL14.eglMakeCurrent(egldisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            int i = EGL14.eglGetError();
            if (i != 12288)
            {
                throw new RuntimeException((new StringBuilder("error releasing context: ")).append(i).toString());
            }
            if (eglcontext != null)
            {
                EGL14.eglDestroyContext(egldisplay, eglcontext);
                i = EGL14.eglGetError();
                if (i != 12288)
                {
                    throw new RuntimeException((new StringBuilder("error destroying context: ")).append(i).toString());
                }
            }
            EGL14.eglTerminate(egldisplay);
            i = EGL14.eglGetError();
            if (i != 12288)
            {
                throw new RuntimeException((new StringBuilder("error terminating display: ")).append(i).toString());
            }
        }
    }

    public static void a(EGLDisplay egldisplay, EGLContext eglcontext, EGLSurface eglsurface, int i, int j)
    {
        EGL14.eglMakeCurrent(egldisplay, eglsurface, eglsurface, eglcontext);
        GLES20.glViewport(0, 0, i, j);
        GLES20.glScissor(0, 0, i, j);
    }

    public static int b()
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        e();
        return ai[0];
    }

    public static EGLSurface b(EGLDisplay egldisplay)
    {
        return EGL14.eglCreatePbufferSurface(egldisplay, c(egldisplay), new int[] {
            12375, 1, 12374, 1, 12344
        }, 0);
    }

    public static int c()
    {
        String s2 = a;
        String s;
        int i;
        int j;
        int k;
        if ("shamu".equals(Build.DEVICE) && gem.q)
        {
            s = "#extension GL_OES_EGL_image_external : require                                                               \nprecision mediump float;                                                                                     \nuniform samplerExternalOES tex_sampler_0;                                                                    \nvarying vec2 v_texcoord;                                                                                     \nvoid main() {                                                                                                \n  mat4 transformMat = mat4(1.0, 0.0, 0.0, 0.0, 0.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0); \n  vec2 texCoord = (transformMat * vec4(v_texcoord, 0, 1)).st;                                                \n  gl_FragColor = texture2D(tex_sampler_0, texCoord);                                                         \n}                                                                                                            \n";
        } else
        {
            s = "#extension GL_OES_EGL_image_external : require                   \nprecision mediump float;                                         \nuniform samplerExternalOES tex_sampler_0;                        \nuniform mat4 u_transform_mat;                                    \nvarying vec2 v_texcoord;                                         \nvoid main() {                                                    \n  vec2 texCoord = (u_transform_mat * vec4(v_texcoord, 0, 1)).st; \n  gl_FragColor = texture2D(tex_sampler_0, texCoord);             \n}                                                                \n";
        }
        i = a(35633, s2);
        j = a(35632, s);
        k = GLES20.glCreateProgram();
        if (k == 0)
        {
            throw new RuntimeException("could not create shader program");
        }
        GLES20.glAttachShader(k, i);
        GLES20.glAttachShader(k, j);
        GLES20.glLinkProgram(k);
        int ai[] = new int[1];
        GLES20.glGetProgramiv(k, 35714, ai, 0);
        if (ai[0] != 1)
        {
            String s1 = GLES20.glGetProgramInfoLog(k);
            GLES20.glDeleteProgram(k);
            throw new RuntimeException((new StringBuilder("could not link shader ")).append(s1).toString());
        } else
        {
            return k;
        }
    }

    private static EGLConfig c(EGLDisplay egldisplay)
    {
        int ai[] = new int[1];
        EGLConfig aeglconfig[] = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(egldisplay, b, 0, aeglconfig, 0, 1, ai, 0))
        {
            throw new RuntimeException("eglChooseConfig failed");
        } else
        {
            return aeglconfig[0];
        }
    }

    public static void d()
    {
        e();
    }

    private static void e()
    {
        int i = GLES20.glGetError();
        if (i != 0)
        {
            throw new RuntimeException((new StringBuilder("gl error: ")).append(Integer.toHexString(i)).toString());
        } else
        {
            return;
        }
    }

    static 
    {
        a = String.format(Locale.US, "attribute vec4 %1$s;      \nattribute vec3 %2$s;      \nvarying vec2 v_texcoord;  \nvoid main() {             \n  gl_Position = %1$s;     \n  v_texcoord = %2$s.xy;   \n}                         \n", new Object[] {
            "a_position", "a_texcoord"
        });
    }

    private class UnsupportedEglVersionException extends Exception
    {

        private static final long serialVersionUID = 42L;

        public UnsupportedEglVersionException()
        {
        }
    }

}
