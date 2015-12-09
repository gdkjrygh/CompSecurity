// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


// Referenced classes of package com.pandora.radio.data:
//            StationRecommendations

public static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/data/StationRecommendations$b, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("ARTIST_STATION", 0);
        b = new <init>("EXTRA_ARTIST_STATION", 1);
        c = new <init>("GENRE_STATION", 2);
        d = new <init>("EXTRA_GENRE_STATION", 3);
        e = new <init>("HEADER", 4);
        f = new <init>("PROMOTED_STATION", 5);
        g = new <init>("CONSOLIDATED_STATION", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
