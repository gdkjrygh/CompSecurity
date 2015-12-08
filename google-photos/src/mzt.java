// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;

public class mzt
{

    final int a[] = new int[1];

    public mzt()
    {
    }

    public int a()
    {
        GLES20.glGenTextures(1, a, 0);
        mzp.d();
        return a[0];
    }

    public void a(int i, int ai[], int j)
    {
        GLES20.glGenBuffers(1, ai, 0);
        mzp.d();
    }
}
