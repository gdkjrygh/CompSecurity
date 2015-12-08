// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


public final class UiLocation extends Enum
{

    private static final UiLocation $VALUES[];
    public static final UiLocation GENRE_LOLOMO;
    public static final UiLocation HOME_LOLOMO;
    public static final UiLocation MDP;
    public static final UiLocation MDP_SIMILARS;
    public static final UiLocation PEOPLE;
    public static final UiLocation SDP;
    public static final UiLocation SDP_SIMILARS;
    public static final UiLocation SEARCH;
    public static final UiLocation UNKNOWN;
    private String value;

    private UiLocation(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static UiLocation create(String s)
    {
        UiLocation auilocation[] = values();
        int j = auilocation.length;
        for (int i = 0; i < j; i++)
        {
            UiLocation uilocation = auilocation[i];
            if (uilocation.value.equalsIgnoreCase(s))
            {
                return uilocation;
            }
        }

        return UNKNOWN;
    }

    public static UiLocation valueOf(String s)
    {
        return (UiLocation)Enum.valueOf(com/netflix/mediaclient/servicemgr/UiLocation, s);
    }

    public static UiLocation[] values()
    {
        return (UiLocation[])$VALUES.clone();
    }

    public String getValue()
    {
        return value;
    }

    static 
    {
        HOME_LOLOMO = new UiLocation("HOME_LOLOMO", 0, "browseHome");
        GENRE_LOLOMO = new UiLocation("GENRE_LOLOMO", 1, "browseGenre");
        MDP = new UiLocation("MDP", 2, "mdp");
        MDP_SIMILARS = new UiLocation("MDP_SIMILARS", 3, "mdpSimilars");
        SDP = new UiLocation("SDP", 4, "sdp");
        SDP_SIMILARS = new UiLocation("SDP_SIMILARS", 5, "sdpSimilars");
        SEARCH = new UiLocation("SEARCH", 6, "search");
        PEOPLE = new UiLocation("PEOPLE", 7, "people");
        UNKNOWN = new UiLocation("UNKNOWN", 8, "");
        $VALUES = (new UiLocation[] {
            HOME_LOLOMO, GENRE_LOLOMO, MDP, MDP_SIMILARS, SDP, SDP_SIMILARS, SEARCH, PEOPLE, UNKNOWN
        });
    }
}
