// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            NetworkAnalytics

public static final class A extends Enum
{

    private static final STORY $VALUES[];
    public static final STORY FEED;
    public static final STORY STORY;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/snapchat/android/analytics/NetworkAnalytics$PageContext, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        FEED = new <init>("FEED", 0);
        STORY = new <init>("STORY", 1);
        $VALUES = (new .VALUES[] {
            FEED, STORY
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
