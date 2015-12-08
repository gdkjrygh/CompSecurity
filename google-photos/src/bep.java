// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLSurfaceView;

final class bep
    implements Runnable
{

    private long a;
    private bem b;

    bep(bem bem1, long l)
    {
        b = bem1;
        a = l;
        super();
    }

    public final void run()
    {
        if (a == bem.b(b) || a % 5L == 0L)
        {
            bem.a(b, true);
            bem.c(b).requestRender();
        }
    }
}
