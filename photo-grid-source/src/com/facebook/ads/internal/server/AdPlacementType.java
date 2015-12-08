// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import com.facebook.ads.internal.util.s;
import java.util.Locale;

public final class AdPlacementType extends Enum
{

    public static final AdPlacementType BANNER;
    public static final AdPlacementType INTERSTITIAL;
    public static final AdPlacementType NATIVE;
    public static final AdPlacementType UNKNOWN;
    private static final AdPlacementType b[];
    private String a;

    private AdPlacementType(String s1, int i, String s2)
    {
        super(s1, i);
        a = s2;
    }

    public static AdPlacementType fromString(String s1)
    {
        if (s.a(s1))
        {
            return UNKNOWN;
        }
        try
        {
            s1 = valueOf(s1.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return UNKNOWN;
        }
        return s1;
    }

    public static AdPlacementType valueOf(String s1)
    {
        return (AdPlacementType)Enum.valueOf(com/facebook/ads/internal/server/AdPlacementType, s1);
    }

    public static AdPlacementType[] values()
    {
        return (AdPlacementType[])b.clone();
    }

    public final String toString()
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
