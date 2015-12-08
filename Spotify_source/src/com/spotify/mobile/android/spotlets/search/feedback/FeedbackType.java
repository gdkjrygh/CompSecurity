// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.feedback;


abstract class FeedbackType extends Enum
{

    private static FeedbackType a;
    private static FeedbackType b;
    private static FeedbackType c;
    private static final FeedbackType d[];

    private FeedbackType(String s, int i)
    {
        super(s, i);
    }

    FeedbackType(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static FeedbackType valueOf(String s)
    {
        return (FeedbackType)Enum.valueOf(com/spotify/mobile/android/spotlets/search/feedback/FeedbackType, s);
    }

    public static FeedbackType[] values()
    {
        return (FeedbackType[])d.clone();
    }

    static 
    {
        a = new FeedbackType("COULD_NOT_FIND") {

        };
        b = new FeedbackType("SLOW") {

        };
        c = new FeedbackType("IRRELEVANT_RESULTS") {

        };
        d = (new FeedbackType[] {
            a, b, c
        });
    }
}
