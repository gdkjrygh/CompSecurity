// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import java.util.Locale;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionSource

public static final class  extends Enum
{

    private static final STATIONS $VALUES[];
    public static final STATIONS EXPLORE;
    public static final STATIONS RECOMMENDER;
    public static final STATIONS STATIONS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/playback/PlaySessionSource$DiscoverySource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final String value()
    {
        return toString().toLowerCase(Locale.ENGLISH);
    }

    static 
    {
        RECOMMENDER = new <init>("RECOMMENDER", 0);
        EXPLORE = new <init>("EXPLORE", 1);
        STATIONS = new <init>("STATIONS", 2);
        $VALUES = (new .VALUES[] {
            RECOMMENDER, EXPLORE, STATIONS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
