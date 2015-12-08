// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class GLES20Program
{

    private int a;

    public GLES20Program(String s, String s1)
    {
        a = GLES20.glCreateProgram();
        int i = a(35633, s);
        int j = a(35632, s1);
        GLES20.glAttachShader(a, i);
        GLES20.glAttachShader(a, j);
        GLES20.glLinkProgram(a);
        GLES20.glDetachShader(a, i);
        GLES20.glDetachShader(a, j);
        GLES20.glDeleteShader(i);
        GLES20.glDeleteShader(j);
    }

    private static int a(int i, String s)
    {
        i = GLES20.glCreateShader(i);
        GLES20.glShaderSource(i, s);
        GLES20.glCompileShader(i);
        return i;
    }

    public static FloatBuffer a(float af[])
    {
        Object obj = ByteBuffer.allocateDirect(af.length * 4);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        ((FloatBuffer) (obj)).put(af);
        ((FloatBuffer) (obj)).position(0);
        return ((FloatBuffer) (obj));
    }

    public final void a()
    {
        GLES20.glDeleteProgram(a);
        a = 0;
    }

    public final int b()
    {
        return a;
    }
}
