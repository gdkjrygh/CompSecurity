// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            ah, MoPubRewardedVideoManager, MoPubRewardedVideoListener

final class z extends ah
{

    z(Class class1, String s)
    {
        super(class1, s);
    }

    protected final void a(String s)
    {
        MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a(), s);
        if (MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a()) != null)
        {
            MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a()).onRewardedVideoLoadSuccess(s);
        }
    }
}
