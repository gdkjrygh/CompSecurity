// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.a:
//            al, h

public class am extends al
{

    public am(String s, String s1, String s2, String s3)
    {
        super(s, s1, s2, s3);
    }

    public final void a(int i, int j)
    {
        super.a(i, j);
        r();
    }

    public final void c()
    {
        super.c();
        r();
    }

    public float f()
    {
        return 1.0F;
    }

    public float g()
    {
        return 1.0F;
    }

    protected void r()
    {
        float f1 = g();
        h h1 = (h)y.get(0);
        int i = GLES20.glGetUniformLocation(h1.p(), "texelWidthOffset");
        int j = GLES20.glGetUniformLocation(h1.p(), "texelHeightOffset");
        h1.a(i, f1 / (float)g);
        h1.a(j, 0.0F);
        f1 = f();
        h1 = (h)y.get(1);
        i = GLES20.glGetUniformLocation(h1.p(), "texelWidthOffset");
        j = GLES20.glGetUniformLocation(h1.p(), "texelHeightOffset");
        h1.a(i, 0.0F);
        h1.a(j, f1 / (float)h);
    }
}
