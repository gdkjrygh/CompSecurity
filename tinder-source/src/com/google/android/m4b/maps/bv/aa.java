// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.opengl.Matrix;

public final class aa
{

    final float a[];
    int b;
    final float c[];

    public aa()
    {
        this((byte)0);
    }

    private aa(byte byte0)
    {
        a = new float[512];
        c = new float[32];
        a();
    }

    public final void a()
    {
        Matrix.setIdentityM(a, b);
    }

    public final void a(float f, float f1, float f2)
    {
        Matrix.scaleM(a, b, f, f1, f2);
    }

    public final void a(float f, float f1, float f2, float f3)
    {
        Matrix.setRotateM(c, 0, f, f1, f2, f3);
        System.arraycopy(a, b, c, 16, 16);
        Matrix.multiplyMM(a, b, c, 16, c, 0);
    }

    public final void a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        Matrix.frustumM(a, b, f, f1, f2, f3, f4, f5);
    }

    final void a(int i)
    {
        i = b + i * 16;
        if (i < 0)
        {
            throw new IllegalArgumentException("stack underflow");
        }
        if (i + 16 > a.length)
        {
            throw new IllegalArgumentException("stack overflow");
        } else
        {
            return;
        }
    }

    public final void a(float af[], int i)
    {
        System.arraycopy(a, b, c, 0, 16);
        Matrix.multiplyMM(a, b, c, 0, af, i);
    }

    public final void b(float f, float f1, float f2)
    {
        Matrix.translateM(a, b, f, f1, f2);
    }

    public final void b(float f, float f1, float f2, float f3, float f4, float f5)
    {
        Matrix.orthoM(a, b, f, f1, f2, f3, f4, f5);
    }

    final void b(int i)
    {
        b = b + i * 16;
    }
}
