// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.mopub.mobileads:
//            MoPubRewardedVideoManager, al

abstract class ah
    implements Runnable
{

    private final Class a;
    private final String b;

    ah(Class class1, String s)
    {
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(s);
        a = class1;
        b = s;
    }

    protected abstract void a(String s);

    public void run()
    {
        for (Iterator iterator = MoPubRewardedVideoManager.d(MoPubRewardedVideoManager.a()).a(a, b).iterator(); iterator.hasNext(); a((String)iterator.next())) { }
    }
}
