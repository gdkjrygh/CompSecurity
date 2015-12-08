// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;


public final class AssetFilter extends Enum
{

    private static final AssetFilter $VALUES[];
    public static final AssetFilter PAST_EVENTS;
    public static final AssetFilter RSN;
    public static final AssetFilter SPORT;

    private AssetFilter(String s, int i)
    {
        super(s, i);
    }

    public static AssetFilter valueOf(String s)
    {
        return (AssetFilter)Enum.valueOf(com/nbcsports/liveextra/ui/main/core/AssetFilter, s);
    }

    public static AssetFilter[] values()
    {
        return (AssetFilter[])$VALUES.clone();
    }

    static 
    {
        RSN = new AssetFilter("RSN", 0);
        PAST_EVENTS = new AssetFilter("PAST_EVENTS", 1);
        SPORT = new AssetFilter("SPORT", 2);
        $VALUES = (new AssetFilter[] {
            RSN, PAST_EVENTS, SPORT
        });
    }
}
