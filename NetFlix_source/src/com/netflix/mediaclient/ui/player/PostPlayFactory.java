// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForMovies, PostPlayForMDX, PostPlayForEpisodes, PlayerActivity, 
//            PostPlay

public class PostPlayFactory
{
    public static final class PostPlayType extends Enum
    {

        private static final PostPlayType $VALUES[];
        public static final PostPlayType EpisodesForMDX;
        public static final PostPlayType EpisodesForPhone;
        public static final PostPlayType EpisodesForTablet;
        public static final PostPlayType RecommendationForPhone;
        public static final PostPlayType RecommendationForTablet;

        public static PostPlayType valueOf(String s)
        {
            return (PostPlayType)Enum.valueOf(com/netflix/mediaclient/ui/player/PostPlayFactory$PostPlayType, s);
        }

        public static PostPlayType[] values()
        {
            return (PostPlayType[])$VALUES.clone();
        }

        static 
        {
            EpisodesForTablet = new PostPlayType("EpisodesForTablet", 0);
            EpisodesForPhone = new PostPlayType("EpisodesForPhone", 1);
            EpisodesForMDX = new PostPlayType("EpisodesForMDX", 2);
            RecommendationForTablet = new PostPlayType("RecommendationForTablet", 3);
            RecommendationForPhone = new PostPlayType("RecommendationForPhone", 4);
            $VALUES = (new PostPlayType[] {
                EpisodesForTablet, EpisodesForPhone, EpisodesForMDX, RecommendationForTablet, RecommendationForPhone
            });
        }

        private PostPlayType(String s, int i)
        {
            super(s, i);
        }
    }


    public PostPlayFactory()
    {
    }

    static PostPlay create(PlayerActivity playeractivity, PostPlayType postplaytype)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[];

            static 
            {
                $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType = new int[PostPlayType.values().length];
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[PostPlayType.EpisodesForMDX.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[PostPlayType.EpisodesForPhone.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$netflix$mediaclient$ui$player$PostPlayFactory$PostPlayType[PostPlayType.EpisodesForTablet.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.netflix.mediaclient.ui.player.PostPlayFactory.PostPlayType[postplaytype.ordinal()])
        {
        default:
            return new PostPlayForMovies(playeractivity);

        case 1: // '\001'
            return new PostPlayForMDX(playeractivity);

        case 2: // '\002'
        case 3: // '\003'
            return new PostPlayForEpisodes(playeractivity);
        }
    }
}
