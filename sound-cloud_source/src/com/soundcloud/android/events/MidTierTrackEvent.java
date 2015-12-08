// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class MidTierTrackEvent extends TrackingEvent
{

    public static final String KIND_CLICK = "Click";
    public static final String KIND_IMPRESSION = "Impression";
    private final String pageName;
    private final Urn trackUrn;

    private MidTierTrackEvent(String s, Urn urn, String s1)
    {
        this(s, urn, s1, System.currentTimeMillis());
    }

    private MidTierTrackEvent(String s, Urn urn, String s1, long l)
    {
        super(s, l);
        trackUrn = urn;
        pageName = s1;
    }

    public static MidTierTrackEvent forClick(Urn urn, String s)
    {
        return new MidTierTrackEvent("Click", urn, s);
    }

    public static MidTierTrackEvent forImpression(Urn urn, String s)
    {
        return new MidTierTrackEvent("Impression", urn, s);
    }

    public String getPageName()
    {
        return pageName;
    }

    public Urn getTrackUrn()
    {
        return trackUrn;
    }
}
