// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class mLimitAdTrackingEnabled
{

    public final String mAdvertisingId;
    public final boolean mLimitAdTrackingEnabled;

    public final String toString()
    {
        return (new StringBuilder("{")).append(mAdvertisingId).append("}").append(mLimitAdTrackingEnabled).toString();
    }

    public (String s, boolean flag)
    {
        mAdvertisingId = s;
        mLimitAdTrackingEnabled = flag;
    }
}
