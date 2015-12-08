// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;


public final class PaywallPerk extends Enum
{

    private static final PaywallPerk $VALUES[];
    public static final PaywallPerk NO_ADS;
    public static final PaywallPerk PASSPORT;
    public static final PaywallPerk SUPER_LIKE;
    public static final PaywallPerk UNDO;
    public static final PaywallPerk UNLIMITED_LIKES;
    public String stringVal;

    private PaywallPerk(String s, int i, String s1)
    {
        super(s, i);
        stringVal = s1;
    }

    public static PaywallPerk valueOf(String s)
    {
        return (PaywallPerk)Enum.valueOf(com/tinder/enums/PaywallPerk, s);
    }

    public static PaywallPerk[] values()
    {
        return (PaywallPerk[])$VALUES.clone();
    }

    static 
    {
        UNLIMITED_LIKES = new PaywallPerk("UNLIMITED_LIKES", 0, "unlimited_likes");
        UNDO = new PaywallPerk("UNDO", 1, "undo");
        NO_ADS = new PaywallPerk("NO_ADS", 2, "no_ads");
        PASSPORT = new PaywallPerk("PASSPORT", 3, "passport");
        SUPER_LIKE = new PaywallPerk("SUPER_LIKE", 4, "super_like");
        $VALUES = (new PaywallPerk[] {
            UNLIMITED_LIKES, UNDO, NO_ADS, PASSPORT, SUPER_LIKE
        });
    }
}
