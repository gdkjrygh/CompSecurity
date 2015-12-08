// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            AnalyticsEvents

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ADD_FRIENDS;
    public static final UNKNOWN REGISTER_ADD_FRIENDS;
    public static final UNKNOWN SEND;
    public static final UNKNOWN STORIES;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AnalyticsParent, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REGISTER_ADD_FRIENDS = new <init>("REGISTER_ADD_FRIENDS", 0);
        ADD_FRIENDS = new <init>("ADD_FRIENDS", 1);
        SEND = new <init>("SEND", 2);
        STORIES = new <init>("STORIES", 3);
        UNKNOWN = new <init>("UNKNOWN", 4);
        $VALUES = (new .VALUES[] {
            REGISTER_ADD_FRIENDS, ADD_FRIENDS, SEND, STORIES, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
