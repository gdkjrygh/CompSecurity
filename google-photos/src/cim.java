// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLES20;

public final class cim
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public cim(int i, int j)
    {
        int ai[] = new int[1];
        GLES20.glGetProgramiv(i, 35722, ai, 0);
        int ai1[] = new int[1];
        int ai2[] = new int[1];
        byte abyte0[] = new byte[ai[0]];
        int ai3[] = new int[1];
        GLES20.glGetActiveAttrib(i, j, ai[0], ai3, 0, ai2, 0, ai1, 0, abyte0, 0);
        b.i("Initializing attribute");
        a = new String(abyte0, 0, cij.a(abyte0));
        b = GLES20.glGetAttribLocation(i, a);
        c = ai1[0];
        d = ai2[0];
    }
}
