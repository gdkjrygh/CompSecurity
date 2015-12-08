// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            MoPubStreamAdPlacer

final class z
    implements Runnable
{

    final MoPubStreamAdPlacer a;

    z(MoPubStreamAdPlacer mopubstreamadplacer)
    {
        a = mopubstreamadplacer;
        super();
    }

    public final void run()
    {
        if (!MoPubStreamAdPlacer.a(a))
        {
            return;
        } else
        {
            MoPubStreamAdPlacer.b(a);
            MoPubStreamAdPlacer.c(a);
            return;
        }
    }
}
