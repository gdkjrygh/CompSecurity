// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;

public final class glf
{

    final int a;
    int b;

    public glf(int i, String s)
    {
        a = GLES20.glGetUniformLocation(i, s);
    }
}
