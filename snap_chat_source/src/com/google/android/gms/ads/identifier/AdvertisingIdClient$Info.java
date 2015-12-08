// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class zzly
{

    private final String zzlx;
    private final boolean zzly;

    public final String getId()
    {
        return zzlx;
    }

    public final boolean isLimitAdTrackingEnabled()
    {
        return zzly;
    }

    public final String toString()
    {
        return (new StringBuilder("{")).append(zzlx).append("}").append(zzly).toString();
    }

    public (String s, boolean flag)
    {
        zzlx = s;
        zzly = flag;
    }
}
