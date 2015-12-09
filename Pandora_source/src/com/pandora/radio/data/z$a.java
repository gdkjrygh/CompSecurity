// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


// Referenced classes of package com.pandora.radio.data:
//            z

public static final class  extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/data/z$a, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("app_launched", 0);
        b = new <init>("playback_resumed", 1);
        c = new <init>("smarturl_station_created", 2);
        d = new <init>("smarturl_station_played", 3);
        e = new <init>("station_changed", 4);
        f = new <init>("station_created", 5);
        g = new <init>("track_skipped", 6);
        h = new <init>("track_thumbs_down", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
