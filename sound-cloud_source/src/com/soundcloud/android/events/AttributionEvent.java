// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class AttributionEvent extends TrackingEvent
{

    public static final String ADGROUP = "adgroup";
    public static final String CAMPAIGN = "campaign";
    public static final String CREATIVE = "creative";
    public static final String NETWORK = "network";

    public AttributionEvent(String s, String s1, String s2, String s3)
    {
        super("default", System.currentTimeMillis());
        put("network", s);
        put("campaign", s1);
        put("adgroup", s2);
        put("creative", s3);
    }
}
