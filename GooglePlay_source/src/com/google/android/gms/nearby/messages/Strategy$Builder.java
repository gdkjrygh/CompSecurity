// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;


// Referenced classes of package com.google.android.gms.nearby.messages:
//            Strategy

public static final class discoveryMedium
{

    int discoveryMedium;
    private int discoveryMode;
    private int distanceType;
    int ttlSeconds;

    public final Strategy build()
    {
        return new Strategy(2, 0, ttlSeconds, 0, false, discoveryMedium, discoveryMode);
    }

    public ()
    {
        discoveryMode = 3;
        ttlSeconds = 300;
        distanceType = 0;
        discoveryMedium = 6;
    }
}
