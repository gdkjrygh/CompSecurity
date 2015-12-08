// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class kx
{

    private final String kw;
    private final boolean kx;

    public String getId()
    {
        return kw;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return kx;
    }

    public (String s, boolean flag)
    {
        kw = s;
        kx = flag;
    }
}
