// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            r, NativeErrorCode

final class s
    implements CustomEventNative.ImageListener
{

    final r a;

    s(r r1)
    {
        a = r1;
        super();
    }

    public final void onImagesCached()
    {
        r.a(a).onNativeAdLoaded(a);
    }

    public final void onImagesFailedToCache(NativeErrorCode nativeerrorcode)
    {
        r.a(a).onNativeAdFailed(nativeerrorcode);
    }
}
