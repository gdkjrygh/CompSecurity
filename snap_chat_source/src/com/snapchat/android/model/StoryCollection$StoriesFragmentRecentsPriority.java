// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


// Referenced classes of package com.snapchat.android.model:
//            StoryCollection

public static final class  extends Enum
{

    private static final LIVE $VALUES[];
    public static final LIVE LIVE;
    public static final LIVE RECENT_UPDATES;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/model/StoryCollection$StoriesFragmentRecentsPriority, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RECENT_UPDATES = new <init>("RECENT_UPDATES", 0);
        LIVE = new <init>("LIVE", 1);
        $VALUES = (new .VALUES[] {
            RECENT_UPDATES, LIVE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
