// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class AdBreakState extends Enum
    implements JacksonModel
{

    private static final AdBreakState $VALUES[];
    public static final AdBreakState IDLE;
    public static final AdBreakState IN_PROGRESS;
    public static final AdBreakState PENDING;
    private static Map sNameMap;
    private final String mName;

    private AdBreakState(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static AdBreakState getByName(String s)
    {
        return (AdBreakState)sNameMap.get(s);
    }

    public static AdBreakState valueOf(String s)
    {
        return (AdBreakState)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/AdBreakState, s);
    }

    public static AdBreakState[] values()
    {
        return (AdBreakState[])$VALUES.clone();
    }

    public final String getName()
    {
        return mName;
    }

    static 
    {
        IDLE = new AdBreakState("IDLE", 0, "idle");
        IN_PROGRESS = new AdBreakState("IN_PROGRESS", 1, "in_progress");
        PENDING = new AdBreakState("PENDING", 2, "pending");
        $VALUES = (new AdBreakState[] {
            IDLE, IN_PROGRESS, PENDING
        });
        sNameMap = new HashMap();
        AdBreakState adbreakstate;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/spotlets/ads/model/AdBreakState).iterator(); iterator.hasNext(); sNameMap.put(adbreakstate.getName(), adbreakstate))
        {
            adbreakstate = (AdBreakState)iterator.next();
        }

    }
}
