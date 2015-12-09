// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.server.AdPlacementType;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            f

static class ementType
{

    static final int a[];

    static 
    {
        a = new int[AdPlacementType.values().length];
        try
        {
            a[AdPlacementType.BANNER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[AdPlacementType.INTERSTITIAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[AdPlacementType.NATIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
