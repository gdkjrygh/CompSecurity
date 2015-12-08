// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public final class UpgradeTrackingEvent extends TrackingEvent
{

    public static final String KEY_TCODE = "tcode";
    public static final String KIND_UPGRADE_SUCCESS = "upgrade_complete";
    public static final String KIND_UPSELL_CLICK = "upsell_click";
    public static final String KIND_UPSELL_IMPRESSION = "upsell_impression";

    private UpgradeTrackingEvent(String s)
    {
        super(s, System.currentTimeMillis());
    }

    private UpgradeTrackingEvent(String s, int i)
    {
        this(s);
        put("tcode", toTrackingCodeUrn(i));
    }

    public static UpgradeTrackingEvent forLikesClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 1009);
    }

    public static UpgradeTrackingEvent forLikesImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 1009);
    }

    public static UpgradeTrackingEvent forNavClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 1007);
    }

    public static UpgradeTrackingEvent forNavImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 1007);
    }

    public static UpgradeTrackingEvent forPlaylistItemClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 1011);
    }

    public static UpgradeTrackingEvent forPlaylistItemImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 1011);
    }

    public static UpgradeTrackingEvent forPlaylistPageClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 1012);
    }

    public static UpgradeTrackingEvent forPlaylistPageImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 1012);
    }

    public static UpgradeTrackingEvent forSettingsClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 1008);
    }

    public static UpgradeTrackingEvent forSettingsImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 1008);
    }

    public static UpgradeTrackingEvent forUpgradeButtonClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 3002);
    }

    public static UpgradeTrackingEvent forUpgradeButtonImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 3002);
    }

    public static UpgradeTrackingEvent forUpgradeSuccess()
    {
        return new UpgradeTrackingEvent("upgrade_complete");
    }

    public static UpgradeTrackingEvent forWhyAdsClick()
    {
        return new UpgradeTrackingEvent("upsell_click", 1006);
    }

    public static UpgradeTrackingEvent forWhyAdsImpression()
    {
        return new UpgradeTrackingEvent("upsell_impression", 1006);
    }

    private static String toTrackingCodeUrn(int i)
    {
        return (new StringBuilder("soundcloud:tcode:")).append(i).toString();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(kind).append(" : ").append(get("tcode")).toString();
    }
}
