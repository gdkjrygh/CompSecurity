// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;

final class mzq extends mzr
{

    public mzq(String s)
    {
        super(s);
    }

    public final void a(int i)
    {
        a = GLES20.glGetAttribLocation(i, b);
        mzp.d();
    }
}
