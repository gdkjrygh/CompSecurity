// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class cll
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    private clk a;

    cll(clk clk1)
    {
        a = clk1;
        super();
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        clk.a(a, true);
    }
}
