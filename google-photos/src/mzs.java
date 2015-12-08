// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;

final class mzs extends mzr
{

    public mzs(String s)
    {
        super(s);
    }

    public final void a(int i)
    {
        a = GLES20.glGetUniformLocation(i, b);
        mzp.d();
    }
}
