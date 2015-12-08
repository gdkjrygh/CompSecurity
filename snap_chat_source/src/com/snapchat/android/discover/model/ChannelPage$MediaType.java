// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;


// Referenced classes of package com.snapchat.android.discover.model:
//            ChannelPage

public static final class  extends Enum
{

    private static final LOADING_ICON $VALUES[];
    public static final LOADING_ICON FILLED_ICON;
    public static final LOADING_ICON INTRO_VIDEO;
    public static final LOADING_ICON INVERTED_ICON;
    public static final LOADING_ICON LOADING_ICON;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/model/ChannelPage$MediaType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INTRO_VIDEO = new <init>("INTRO_VIDEO", 0);
        FILLED_ICON = new <init>("FILLED_ICON", 1);
        INVERTED_ICON = new <init>("INVERTED_ICON", 2);
        LOADING_ICON = new <init>("LOADING_ICON", 3);
        $VALUES = (new .VALUES[] {
            INTRO_VIDEO, FILLED_ICON, INVERTED_ICON, LOADING_ICON
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
