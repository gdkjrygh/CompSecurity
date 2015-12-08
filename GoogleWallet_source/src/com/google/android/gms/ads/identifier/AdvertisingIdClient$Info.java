// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class lB
{

    private final String lA;
    private final boolean lB;

    public final String getId()
    {
        return lA;
    }

    public final boolean isLimitAdTrackingEnabled()
    {
        return lB;
    }

    public final String toString()
    {
        return (new StringBuilder("{")).append(lA).append("}").append(lB).toString();
    }

    public (String s, boolean flag)
    {
        lA = s;
        lB = flag;
    }
}
