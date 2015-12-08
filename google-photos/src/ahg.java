// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import java.util.Iterator;
import java.util.Set;

final class ahg
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    private Set a;
    private ahf b;

    ahg(ahf ahf1, Set set)
    {
        b = ahf1;
        a = set;
        super();
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        long l = b.h.getTimestamp();
        for (surfacetexture = a.iterator(); surfacetexture.hasNext(); ((aka)surfacetexture.next()).a(b.i, l)) { }
    }
}
