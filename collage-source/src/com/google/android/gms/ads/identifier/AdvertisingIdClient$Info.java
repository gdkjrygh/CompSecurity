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

    public String getId()
    {
        return zzol;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return zzom;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(zzol).append("}").append(zzom).toString();
    }

    public (String s, boolean flag)
    {
        zzol = s;
        zzom = flag;
    }
}
