// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.IntBuffer;

public class OpenGlUtils
{

    public static final int NO_TEXTURE = -1;

    public OpenGlUtils()
    {
    }

    public static void checkGlError(String s)
    {
        do
        {
            int i = GLES20.glGetError();
            if (i != 0)
            {
                Log.e("OpenGLError", (new StringBuilder()).append(s).append(": glError ").append(i).toString());
            } else
            {
                return;
            }
        } while (true);
    }

    public static int loadProgram(String s, String s1)
    {
        int ai[] = new int[1];
        int i = loadShader(s, 35633);
        int j;
        if (i != 0)
        {
            if ((j = loadShader(s1, 35632)) != 0)
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

    public static int loadShader(String s, int i)
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

    public static int loadTexture(Bitmap bitmap, int i)
    {
        return loadTexture(bitmap, i, true);
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean flag)
    {
        int ai[] = new int[1];
        if (i == -1)
        {
            GLES20.glGenTextures(1, ai, 0);
            GLES20.glBindTexture(3553, ai[0]);
            GLES20.glTexParameterf(3553, 10240, 9729F);
            GLES20.glTexParameterf(3553, 10241, 9729F);
            GLES20.glTexParameterf(3553, 10242, 33071F);
            GLES20.glTexParameterf(3553, 10243, 33071F);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else
        {
            GLES20.glBindTexture(3553, i);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            ai[0] = i;
        }
        if (flag)
        {
            bitmap.recycle();
        }
        return ai[0];
    }

    public static int loadTexture(IntBuffer intbuffer, android.hardware.Camera.Size size, int i)
    {
        int ai[] = new int[1];
        if (i == -1)
        {
            GLES20.glGenTextures(1, ai, 0);
            GLES20.glBindTexture(3553, ai[0]);
            GLES20.glTexParameterf(3553, 10240, 9729F);
            GLES20.glTexParameterf(3553, 10241, 9729F);
            GLES20.glTexParameterf(3553, 10242, 33071F);
            GLES20.glTexParameterf(3553, 10243, 33071F);
            GLES20.glTexImage2D(3553, 0, 6408, size.width, size.height, 0, 6408, 5121, intbuffer);
        } else
        {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, size.width, size.height, 6408, 5121, intbuffer);
            ai[0] = i;
        }
        return ai[0];
    }

    public static int loadTextureAsBitmap(IntBuffer intbuffer, android.hardware.Camera.Size size, int i)
    {
        return loadTexture(Bitmap.createBitmap(intbuffer.array(), size.width, size.height, android.graphics.Bitmap.Config.ARGB_8888), i);
    }

    public static float rnd(float f, float f1)
    {
        return (float)Math.random() * (f1 - f) + f;
    }
}
