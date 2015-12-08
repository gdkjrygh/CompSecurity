// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class zzom
{

    private final String zzol;
    private final boolean zzom;

    public final String getId()
    {
        return zzol;
    }

    public final boolean isLimitAdTrackingEnabled()
    {
        return zzom;
    }

    public final String toString()
    {
        return (new StringBuilder("{")).append(zzol).append("}").append(zzom).toString();
    }

    public (String s, boolean flag)
    {
        zzol = s;
        zzom = flag;
    }
}
