// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            as

final class au
    implements com.mopub.volley.Response.Listener
{

    final as a;

    au(as as1)
    {
        a = as1;
        super();
    }

    public final void onResponse(MoPubNativeAdPositioning.MoPubClientPositioning mopubclientpositioning)
    {
        as.a(a, mopubclientpositioning);
    }

    public final volatile void onResponse(Object obj)
    {
        onResponse((MoPubNativeAdPositioning.MoPubClientPositioning)obj);
    }
}
