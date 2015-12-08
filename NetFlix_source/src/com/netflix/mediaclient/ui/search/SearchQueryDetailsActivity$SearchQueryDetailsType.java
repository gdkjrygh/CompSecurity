// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;


// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchQueryDetailsActivity

public static final class Y extends Enum
{

    private static final SEARCH_SUGGESTION $VALUES[];
    public static final SEARCH_SUGGESTION PERSON;
    public static final SEARCH_SUGGESTION SEARCH_SUGGESTION;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/netflix/mediaclient/ui/search/SearchQueryDetailsActivity$SearchQueryDetailsType, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        PERSON = new <init>("PERSON", 0);
        SEARCH_SUGGESTION = new <init>("SEARCH_SUGGESTION", 1);
        $VALUES = (new .VALUES[] {
            PERSON, SEARCH_SUGGESTION
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
