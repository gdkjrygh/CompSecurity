// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import eek;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Format extends Enum
    implements JacksonModel, eek
{

    private static final Format $VALUES[];
    public static final Format AUDIO;
    public static final Format BANNER;
    public static final Format VIDEO;
    private static Map sNameMap;
    private final String mName;

    private Format(String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }

    public static Format getByName(String s)
    {
        return (Format)sNameMap.get(s);
    }

    public static Format valueOf(String s)
    {
        return (Format)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/Format, s);
    }

    public static Format[] values()
    {
        return (Format[])$VALUES.clone();
    }

    public final String getCosmosEndpoint()
    {
        return (new StringBuilder("sp://ads/v1/formats/")).append(getName()).toString();
    }

    public final String getName()
    {
        return mName;
    }

    public final com.spotify.mobile.android.util.ClientEvent.SubEvent getSubEvent()
    {
        if (equals(VIDEO))
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.cW;
        }
        if (equals(BANNER))
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.cX;
        } else
        {
            return com.spotify.mobile.android.util.ClientEvent.SubEvent.cV;
        }
    }

    static 
    {
        AUDIO = new Format("AUDIO", 0, "audio");
        BANNER = new Format("BANNER", 1, "banner");
        VIDEO = new Format("VIDEO", 2, "video");
        $VALUES = (new Format[] {
            AUDIO, BANNER, VIDEO
        });
        sNameMap = new HashMap();
        Format format;
        for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/spotlets/ads/model/Format).iterator(); iterator.hasNext(); sNameMap.put(format.getName(), format))
        {
            format = (Format)iterator.next();
        }

    }
}
