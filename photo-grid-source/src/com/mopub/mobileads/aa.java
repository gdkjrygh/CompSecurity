// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            ah, MoPubRewardedVideoManager, MoPubErrorCode

final class aa extends ah
{

    final MoPubErrorCode a;

    aa(Class class1, String s, MoPubErrorCode mopuberrorcode)
    {
        a = mopuberrorcode;
        super(class1, s);
    }

    protected final void a(String s)
    {
        MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a(), s);
        MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a(), s, a);
    }
}
