// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class ahh
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    private ahf a;

    ahh(ahf ahf1)
    {
        a = ahf1;
        super();
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        a.e.a(2, false);
    }
}
