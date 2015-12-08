// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class mName extends Enum
    implements JacksonModel
{

    private static final getName $VALUES[];
    public static final getName AVAILABLE;
    public static final getName DISCARD;
    public static final getName DISPLAY;
    public static final getName PLAY;
    public static final getName UNKNOWN;
    private static Map sNameMap;
    private final String mName;

    public static mName getByName(String s)
    {
        return (mName)sNameMap.get(s);
    }

    public static sNameMap valueOf(String s)
    {
        return (sNameMap)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/AdEvent$Event, s);
    }

    public static sNameMap[] values()
    {
        return (sNameMap[])$VALUES.clone();
    }

    public final String getName()
    {
        return mName;
    }

    static 
    {
        AVAILABLE = new <init>("AVAILABLE", 0, "available");
        DISCARD = new <init>("DISCARD", 1, "discard");
        PLAY = new <init>("PLAY", 2, "play");
        DISPLAY = new <init>("DISPLAY", 3, "display");
        UNKNOWN = new <init>("UNKNOWN", 4, "unknown");
        $VALUES = (new .VALUES[] {
            AVAILABLE, DISCARD, PLAY, DISPLAY, UNKNOWN
        });
        sNameMap = new HashMap();
        mName mname;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/spotlets/ads/model/AdEvent$Event).iterator(); iterator.hasNext(); sNameMap.put(mname.getName(), mname))
        {
            mname = (getName)iterator.next();
        }

    }

    private A(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }
}
