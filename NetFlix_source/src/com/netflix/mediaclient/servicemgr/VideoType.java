// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public final class VideoType extends Enum
{

    private static final VideoType $VALUES[];
    public static final VideoType CHARACTERS;
    public static final VideoType EPISODE;
    public static final VideoType MOVIE;
    public static final VideoType SEASON;
    public static final VideoType SERIES;
    public static final VideoType SHOW;
    public static final VideoType SOCIAL_FRIEND;
    public static final VideoType SOCIAL_GROUP;
    public static final VideoType SOCIAL_POPULAR;
    public static final VideoType UNAVAILABLE;
    public static final VideoType UNKNOWN;
    private String value;

    private VideoType(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static VideoType create(String s)
    {
        VideoType avideotype[] = values();
        int j = avideotype.length;
        for (int i = 0; i < j; i++)
        {
            VideoType videotype = avideotype[i];
            if (videotype.value.equalsIgnoreCase(s))
            {
                return videotype;
            }
        }

        return UNKNOWN;
    }

    public static boolean isPresentationTrackingType(VideoType videotype)
    {
        return MOVIE == videotype || SHOW == videotype || SERIES == videotype || SEASON == videotype || EPISODE == videotype;
    }

    public static VideoType valueOf(String s)
    {
        return (VideoType)Enum.valueOf(com/netflix/mediaclient/servicemgr/VideoType, s);
    }

    public static VideoType[] values()
    {
        return (VideoType[])$VALUES.clone();
    }

    public String getValue()
    {
        return value;
    }

    static 
    {
        MOVIE = new VideoType("MOVIE", 0, "movies");
        SHOW = new VideoType("SHOW", 1, "shows");
        SERIES = new VideoType("SERIES", 2, "series");
        SEASON = new VideoType("SEASON", 3, "seasons");
        EPISODE = new VideoType("EPISODE", 4, "episodes");
        CHARACTERS = new VideoType("CHARACTERS", 5, "characters");
        SOCIAL_GROUP = new VideoType("SOCIAL_GROUP", 6, "SocialGroup");
        SOCIAL_FRIEND = new VideoType("SOCIAL_FRIEND", 7, "SocialFriend");
        SOCIAL_POPULAR = new VideoType("SOCIAL_POPULAR", 8, "socialPopular");
        UNAVAILABLE = new VideoType("UNAVAILABLE", 9, "unavailable");
        UNKNOWN = new VideoType("UNKNOWN", 10, "");
        $VALUES = (new VideoType[] {
            MOVIE, SHOW, SERIES, SEASON, EPISODE, CHARACTERS, SOCIAL_GROUP, SOCIAL_FRIEND, SOCIAL_POPULAR, UNAVAILABLE, 
            UNKNOWN
        });
    }
}
