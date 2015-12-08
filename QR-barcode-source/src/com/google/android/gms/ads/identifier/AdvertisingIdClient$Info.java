// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class lo
{

    private final String ln;
    private final boolean lo;

    public String getId()
    {
        return ln;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return lo;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(ln).append("}").append(lo).toString();
    }

    public (String s, boolean flag)
    {
        ln = s;
        lo = flag;
    }
}
