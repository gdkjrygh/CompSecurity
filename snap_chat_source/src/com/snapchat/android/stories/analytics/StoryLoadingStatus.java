// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.analytics;


public final class StoryLoadingStatus extends Enum
{

    private static final StoryLoadingStatus $VALUES[];
    public static final StoryLoadingStatus ABANDONED;
    public static final StoryLoadingStatus NETWORK_ERROR;
    public static final StoryLoadingStatus SUCCESS;

    private StoryLoadingStatus(String s, int i)
    {
        super(s, i);
    }

    public static StoryLoadingStatus valueOf(String s)
    {
        return (StoryLoadingStatus)Enum.valueOf(com/snapchat/android/stories/analytics/StoryLoadingStatus, s);
    }

    public static StoryLoadingStatus[] values()
    {
        return (StoryLoadingStatus[])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new StoryLoadingStatus("SUCCESS", 0);
        NETWORK_ERROR = new StoryLoadingStatus("NETWORK_ERROR", 1);
        ABANDONED = new StoryLoadingStatus("ABANDONED", 2);
        $VALUES = (new StoryLoadingStatus[] {
            SUCCESS, NETWORK_ERROR, ABANDONED
        });
    }
}
