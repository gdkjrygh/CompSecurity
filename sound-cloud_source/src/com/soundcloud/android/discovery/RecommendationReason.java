// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;


final class RecommendationReason extends Enum
{

    private static final RecommendationReason $VALUES[];
    public static final RecommendationReason LIKED;
    public static final RecommendationReason LISTENED_TO;

    private RecommendationReason(String s, int i)
    {
        super(s, i);
    }

    public static RecommendationReason valueOf(String s)
    {
        return (RecommendationReason)Enum.valueOf(com/soundcloud/android/discovery/RecommendationReason, s);
    }

    public static RecommendationReason[] values()
    {
        return (RecommendationReason[])$VALUES.clone();
    }

    static 
    {
        LIKED = new RecommendationReason("LIKED", 0);
        LISTENED_TO = new RecommendationReason("LISTENED_TO", 1);
        $VALUES = (new RecommendationReason[] {
            LIKED, LISTENED_TO
        });
    }
}
