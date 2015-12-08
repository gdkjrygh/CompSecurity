// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.a;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.a:
//            aj

public class u extends aj
{

    private float C;
    private int y;

    public u(String s)
    {
        this(s, (byte)0);
    }

    private u(String s, byte byte0)
    {
        super(s);
        C = 0.5F;
    }

    public final void a(float f)
    {
        C = f;
        if (y != -1)
        {
            a(y, C);
        }
    }

    public final void c()
    {
        super.c();
        y = GLES20.glGetUniformLocation(p(), "mixturePercent");
    }

    public final void d()
    {
        super.d();
        a(C);
    }
}
