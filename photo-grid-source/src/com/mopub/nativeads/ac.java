// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            MoPubAdRenderer, NativeResponse

final class ac
{

    private final String a;
    private final MoPubAdRenderer b;
    private final NativeResponse c;

    ac(String s, MoPubAdRenderer mopubadrenderer, NativeResponse nativeresponse)
    {
        a = s;
        b = mopubadrenderer;
        c = nativeresponse;
    }

    final MoPubAdRenderer a()
    {
        return b;
    }

    final NativeResponse b()
    {
        return c;
    }
}
