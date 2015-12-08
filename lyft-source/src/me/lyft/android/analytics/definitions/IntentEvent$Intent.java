// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final SHARE_INVITES $VALUES[];
    public static final SHARE_INVITES ONBOARD;
    public static final SHARE_INVITES SEARCH_PLACES;
    public static final SHARE_INVITES SHARE_INVITES;

    public static  fromString(String s)
    {
        return valueOf(s.toUpperCase());
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(me/lyft/android/analytics/definitions/IntentEvent$Intent, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public String toString()
    {
        return name().toLowerCase();
    }

    static 
    {
        ONBOARD = new <init>("ONBOARD", 0);
        SEARCH_PLACES = new <init>("SEARCH_PLACES", 1);
        SHARE_INVITES = new <init>("SHARE_INVITES", 2);
        $VALUES = (new .VALUES[] {
            ONBOARD, SEARCH_PLACES, SHARE_INVITES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
