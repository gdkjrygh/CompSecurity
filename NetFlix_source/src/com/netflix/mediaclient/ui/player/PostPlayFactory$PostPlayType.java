// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayFactory

public static final class  extends Enum
{

    private static final RecommendationForPhone $VALUES[];
    public static final RecommendationForPhone EpisodesForMDX;
    public static final RecommendationForPhone EpisodesForPhone;
    public static final RecommendationForPhone EpisodesForTablet;
    public static final RecommendationForPhone RecommendationForPhone;
    public static final RecommendationForPhone RecommendationForTablet;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/ui/player/PostPlayFactory$PostPlayType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        EpisodesForTablet = new <init>("EpisodesForTablet", 0);
        EpisodesForPhone = new <init>("EpisodesForPhone", 1);
        EpisodesForMDX = new <init>("EpisodesForMDX", 2);
        RecommendationForTablet = new <init>("RecommendationForTablet", 3);
        RecommendationForPhone = new <init>("RecommendationForPhone", 4);
        $VALUES = (new .VALUES[] {
            EpisodesForTablet, EpisodesForPhone, EpisodesForMDX, RecommendationForTablet, RecommendationForPhone
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
