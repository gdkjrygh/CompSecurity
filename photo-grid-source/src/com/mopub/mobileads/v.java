// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;

// Referenced classes of package com.mopub.mobileads:
//            MoPubConversionTracker

final class v extends BaseUrlGenerator
{

    final MoPubConversionTracker a;

    private v(MoPubConversionTracker mopubconversiontracker)
    {
        a = mopubconversiontracker;
        super();
    }

    v(MoPubConversionTracker mopubconversiontracker, byte byte0)
    {
        this(mopubconversiontracker);
    }

    public final String generateUrlString(String s)
    {
        a(s, "/m/open");
        b("6");
        b("id", MoPubConversionTracker.c(a));
        c(ClientMetadata.getInstance(MoPubConversionTracker.d(a)).getAppVersion());
        c();
        return b();
    }
}
