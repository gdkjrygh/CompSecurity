// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            c, NativeResponse

final class ak
    implements c
{

    final NativeResponse a;

    ak(NativeResponse nativeresponse)
    {
        a = nativeresponse;
        super();
    }

    public final void onAdClicked()
    {
        a.handleClick(null);
    }

    public final void onAdImpressed()
    {
        a.recordImpression(null);
    }
}
