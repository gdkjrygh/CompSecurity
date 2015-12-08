// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.MoPubReward;
import java.util.HashSet;

// Referenced classes of package com.mopub.mobileads:
//            MoPubRewardedVideoManager, al, MoPubRewardedVideoListener

final class af
    implements Runnable
{

    final Class a;
    final String b;
    final MoPubReward c;

    af(Class class1, String s, MoPubReward mopubreward)
    {
        a = class1;
        b = s;
        c = mopubreward;
        super();
    }

    public final void run()
    {
        HashSet hashset = new HashSet(MoPubRewardedVideoManager.d(MoPubRewardedVideoManager.a()).a(a, b));
        if (MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a()) != null)
        {
            MoPubRewardedVideoManager.a(MoPubRewardedVideoManager.a()).onRewardedVideoCompleted(hashset, c);
        }
    }
}
