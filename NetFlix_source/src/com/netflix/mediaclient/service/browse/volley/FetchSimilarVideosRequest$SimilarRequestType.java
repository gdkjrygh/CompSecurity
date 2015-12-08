// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;


// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchSimilarVideosRequest

private static final class keyName extends Enum
{

    private static final QUERY_SUGGESTION $VALUES[];
    public static final QUERY_SUGGESTION PEOPLE;
    public static final QUERY_SUGGESTION QUERY_SUGGESTION;
    public final String keyName;

    public static keyName valueOf(String s)
    {
        return (keyName)Enum.valueOf(com/netflix/mediaclient/service/browse/volley/FetchSimilarVideosRequest$SimilarRequestType, s);
    }

    public static keyName[] values()
    {
        return (keyName[])$VALUES.clone();
    }

    static 
    {
        PEOPLE = new <init>("PEOPLE", 0, "people");
        QUERY_SUGGESTION = new <init>("QUERY_SUGGESTION", 1, "suggestions");
        $VALUES = (new .VALUES[] {
            PEOPLE, QUERY_SUGGESTION
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        keyName = s1;
    }
}
