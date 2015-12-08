// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.controller.stories;


public final class StoryLoadingContext extends Enum
{

    private static final StoryLoadingContext $VALUES[];
    public static final StoryLoadingContext ALREADY_LOADED;
    public static final StoryLoadingContext AUTO_LOADED;
    public static final StoryLoadingContext EXTERNAL;
    public static final StoryLoadingContext LOAD_FROM_VIEWING;
    public static final StoryLoadingContext TAP_TO_LOAD;
    private final String a;

    private StoryLoadingContext(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static StoryLoadingContext valueOf(String s)
    {
        return (StoryLoadingContext)Enum.valueOf(com/snapchat/android/controller/stories/StoryLoadingContext, s);
    }

    public static StoryLoadingContext[] values()
    {
        return (StoryLoadingContext[])$VALUES.clone();
    }

    public final String getMetricName()
    {
        return a;
    }

    static 
    {
        AUTO_LOADED = new StoryLoadingContext("AUTO_LOADED", 0, "AUTOLOADED");
        TAP_TO_LOAD = new StoryLoadingContext("TAP_TO_LOAD", 1, "TAP_TO_LOAD");
        LOAD_FROM_VIEWING = new StoryLoadingContext("LOAD_FROM_VIEWING", 2, "LOAD_FROM_VIEWING");
        ALREADY_LOADED = new StoryLoadingContext("ALREADY_LOADED", 3, "ALREADY_LOADED");
        EXTERNAL = new StoryLoadingContext("EXTERNAL", 4, "EXTERNAL");
        $VALUES = (new StoryLoadingContext[] {
            AUTO_LOADED, TAP_TO_LOAD, LOAD_FROM_VIEWING, ALREADY_LOADED, EXTERNAL
        });
    }
}
