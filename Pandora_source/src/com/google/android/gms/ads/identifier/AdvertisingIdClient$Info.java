// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class zzmq
{

    private final String zzmp;
    private final boolean zzmq;

    public String getId()
    {
        return zzmp;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return zzmq;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(zzmp).append("}").append(zzmq).toString();
    }

    public (String s, boolean flag)
    {
        zzmp = s;
        zzmq = flag;
    }
}
