// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import com.facebook.ads.internal.util.t;
import java.util.Locale;

public final class AdPlacementType extends Enum
{

    public static final AdPlacementType BANNER;
    public static final AdPlacementType INTERSTITIAL;
    public static final AdPlacementType NATIVE;
    public static final AdPlacementType UNKNOWN;
    private static final AdPlacementType b[];
    private String a;

    private AdPlacementType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static AdPlacementType fromString(String s)
    {
        if (t.a(s))
        {
            return UNKNOWN;
        }
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return UNKNOWN;
        }
        return s;
    }

    public static AdPlacementType valueOf(String s)
    {
        return (AdPlacementType)Enum.valueOf(com/facebook/ads/internal/server/AdPlacementType, s);
    }

    public static AdPlacementType[] values()
    {
        return (AdPlacementType[])b.clone();
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        UNKNOWN = new AdPlacementType("UNKNOWN", 0, "unknown");
        BANNER = new AdPlacementType("BANNER", 1, "banner");
        INTERSTITIAL = new AdPlacementType("INTERSTITIAL", 2, "interstitial");
        NATIVE = new AdPlacementType("NATIVE", 3, "native");
        b = (new AdPlacementType[] {
            UNKNOWN, BANNER, INTERSTITIAL, NATIVE
        });
    }
}
