// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class ly
{

    private final String lx;
    private final boolean ly;

    public String getId()
    {
        return lx;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return ly;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(lx).append("}").append(ly).toString();
    }

    public (String s, boolean flag)
    {
        lx = s;
        ly = flag;
    }
}
