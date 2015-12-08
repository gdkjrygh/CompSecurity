// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.gl;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public final class g
{

    public static final float a[] = {
        -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
    };
    private static String b = "GPUTransition";

    private static float a(float f, float f1)
    {
        if (f == 0.0F)
        {
            return f1;
        } else
        {
            return 0.0F;
        }
    }

    public static int a(Bitmap bitmap, int i, boolean flag)
    {
        int ai[] = new int[1];
        ai[0] = i;
        if (bitmap != null && !bitmap.isRecycled())
        {
            if (i == -1)
            {
                GLES20.glGenTextures(1, ai, 0);
                a("glGenTextures");
                GLES20.glBindTexture(3553, ai[0]);
                a("glBindTexture");
                GLES20.glTexParameterf(3553, 10240, 9729F);
                a("glTexParameterf");
                GLES20.glTexParameterf(3553, 10241, 9729F);
                a("glTexParameterf");
                GLES20.glTexParameterf(3553, 10242, 33071F);
                a("glTexParameterf");
                GLES20.glTexParameterf(3553, 10243, 33071F);
                a("glTexParameterf");
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                a("texImage2D");
            } else
            {
                GLES20.glBindTexture(3553, i);
                a("glBindTexture");
                GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
                a("texSubImage2D");
                ai[0] = i;
            }
        }
        if (flag && bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        return ai[0];
    }

    private static int a(String s, int i)
    {
        int ai[] = new int[1];
        i = GLES20.glCreateShader(i);
        GLES20.glShaderSource(i, s);
        GLES20.glCompileShader(i);
        GLES20.glGetShaderiv(i, 35713, ai, 0);
        if (ai[0] == 0)
        {
            (new StringBuilder("Compilation\n")).append(GLES20.glGetShaderInfoLog(i));
            return 0;
        } else
        {
            return i;
        }
    }

    public static int a(String s, String s1)
    {
        int ai[] = new int[1];
        int i = a(s, 35633);
        int j;
        if (i != 0)
        {
            if ((j = a(s1, 35632)) != 0)
            {
                int k = GLES20.glCreateProgram();
                GLES20.glAttachShader(k, i);
                GLES20.glAttachShader(k, j);
                GLES20.glLinkProgram(k);
                GLES20.glGetProgramiv(k, 35714, ai, 0);
                if (ai[0] > 0)
                {
                    GLES20.glDeleteShader(i);
                    GLES20.glDeleteShader(j);
                    return k;
                }
            }
        }
        return 0;
    }

    public static int a(ByteBuffer bytebuffer, int i, int j, int k)
    {
        int ai[] = new int[1];
        if (k == -1)
        {
            GLES20.glGenTextures(1, ai, 0);
            GLES20.glBindTexture(3553, ai[0]);
            GLES20.glTexParameterf(3553, 10240, 9729F);
            GLES20.glTexParameterf(3553, 10241, 9729F);
            GLES20.glTexParameterf(3553, 10242, 33071F);
            GLES20.glTexParameterf(3553, 10243, 33071F);
            GLES20.glTexImage2D(3553, 0, 6408, i, j, 0, 6408, 5121, bytebuffer);
        } else
        {
            GLES20.glBindTexture(3553, k);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i, j, 6408, 5121, bytebuffer);
            ai[0] = k;
        }
        return ai[0];
    }

    public static void a(String s)
    {
        do
        {
            int i = GLES20.glGetError();
            if (i != 0)
            {
                Log.e(b, (new StringBuilder()).append(s).append(": glError ").append(i).toString());
            } else
            {
                return;
            }
        } while (true);
    }

    public static float[] a(FloatBuffer floatbuffer)
    {
        float af[] = new float[8];
        floatbuffer.position(0);
        floatbuffer.get(af);
        float f1 = 1.0F;
        int i = 0;
        do
        {
label0:
            {
                float f = f1;
                if (i < 8)
                {
                    if (af[i] == 0.0F)
                    {
                        break label0;
                    }
                    f = af[i];
                }
                return (new float[] {
                    af[0], a(af[1], f), af[2], a(af[3], f), af[4], a(af[5], f), af[6], a(af[7], f)
                });
            }
            i++;
        } while (true);
    }

}
