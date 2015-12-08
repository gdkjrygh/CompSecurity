// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class kA
{

    private final boolean kA;
    private final String kz;

    public String getId()
    {
        return kz;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return kA;
    }

    public (String s, boolean flag)
    {
        kz = s;
        kA = flag;
    }
}
