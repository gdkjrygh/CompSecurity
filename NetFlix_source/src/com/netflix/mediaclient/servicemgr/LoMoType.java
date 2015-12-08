// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public final class LoMoType extends Enum
{

    private static final LoMoType $VALUES[];
    public static final LoMoType BILLBOARD;
    public static final LoMoType CHARACTERS;
    public static final LoMoType CONTINUE_WATCHING;
    public static final LoMoType FLAT_GENRE;
    public static final LoMoType INSTANT_QUEUE;
    public static final LoMoType SOCIAL_FRIEND;
    public static final LoMoType SOCIAL_GROUP;
    public static final LoMoType SOCIAL_POPULAR;
    public static final LoMoType STANDARD;
    private String value;

    private LoMoType(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static LoMoType create(String s)
    {
        LoMoType alomotype[] = values();
        int j = alomotype.length;
        for (int i = 0; i < j; i++)
        {
            LoMoType lomotype = alomotype[i];
            if (lomotype.value.equalsIgnoreCase(s))
            {
                return lomotype;
            }
        }

        return STANDARD;
    }

    public static LoMoType valueOf(String s)
    {
        return (LoMoType)Enum.valueOf(com/netflix/mediaclient/servicemgr/LoMoType, s);
    }

    public static LoMoType[] values()
    {
        return (LoMoType[])$VALUES.clone();
    }

    public String getValue()
    {
        return value;
    }

    static 
    {
        CONTINUE_WATCHING = new LoMoType("CONTINUE_WATCHING", 0, "continueWatching");
        INSTANT_QUEUE = new LoMoType("INSTANT_QUEUE", 1, "queue");
        SOCIAL_GROUP = new LoMoType("SOCIAL_GROUP", 2, "SocialGroup");
        SOCIAL_FRIEND = new LoMoType("SOCIAL_FRIEND", 3, "SocialFriend");
        SOCIAL_POPULAR = new LoMoType("SOCIAL_POPULAR", 4, "socialPopular");
        BILLBOARD = new LoMoType("BILLBOARD", 5, "BillboardList");
        CHARACTERS = new LoMoType("CHARACTERS", 6, "character");
        FLAT_GENRE = new LoMoType("FLAT_GENRE", 7, "defaultKidsList");
        STANDARD = new LoMoType("STANDARD", 8, "");
        $VALUES = (new LoMoType[] {
            CONTINUE_WATCHING, INSTANT_QUEUE, SOCIAL_GROUP, SOCIAL_FRIEND, SOCIAL_POPULAR, BILLBOARD, CHARACTERS, FLAT_GENRE, STANDARD
        });
    }
}
