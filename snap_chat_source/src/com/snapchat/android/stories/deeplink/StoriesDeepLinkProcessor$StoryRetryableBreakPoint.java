// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.deeplink;


// Referenced classes of package com.snapchat.android.stories.deeplink:
//            StoriesDeepLinkProcessor

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN GETTING_METADATA_ERROR;
    public static final UNKNOWN PREFETCH_ERROR;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/stories/deeplink/StoriesDeepLinkProcessor$StoryRetryableBreakPoint, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GETTING_METADATA_ERROR = new <init>("GETTING_METADATA_ERROR", 0);
        PREFETCH_ERROR = new <init>("PREFETCH_ERROR", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            GETTING_METADATA_ERROR, PREFETCH_ERROR, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
