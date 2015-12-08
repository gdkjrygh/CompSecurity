// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class dY
{

    private final String dX;
    private final boolean dY;

    public String getId()
    {
        return dX;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return dY;
    }

    (String s, boolean flag)
    {
        dX = s;
        dY = flag;
    }
}
