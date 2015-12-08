// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            e

final class f
    implements Runnable
{

    final PositioningSource.PositioningListener a;
    final e b;

    f(e e1, PositioningSource.PositioningListener positioninglistener)
    {
        b = e1;
        a = positioninglistener;
        super();
    }

    public final void run()
    {
        a.onLoad(e.a(b));
    }
}
