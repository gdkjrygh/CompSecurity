// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;


public final class PlacementType extends Enum
{

    public static final PlacementType INLINE;
    public static final PlacementType INTERSTITIAL;
    private static final PlacementType a[];

    private PlacementType(String s, int i)
    {
        super(s, i);
    }

    public static PlacementType valueOf(String s)
    {
        return (PlacementType)Enum.valueOf(com/mopub/mraid/PlacementType, s);
    }

    public static PlacementType[] values()
    {
        return (PlacementType[])a.clone();
    }

    static 
    {
        INLINE = new PlacementType("INLINE", 0);
        INTERSTITIAL = new PlacementType("INTERSTITIAL", 1);
        a = (new PlacementType[] {
            INLINE, INTERSTITIAL
        });
    }
}
