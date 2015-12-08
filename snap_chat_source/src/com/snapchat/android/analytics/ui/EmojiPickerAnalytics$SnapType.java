// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.ui;


// Referenced classes of package com.snapchat.android.analytics.ui:
//            EmojiPickerAnalytics

public static final class  extends Enum
{

    private static final VIDEO $VALUES[];
    public static final VIDEO IMAGE;
    public static final VIDEO VIDEO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/ui/EmojiPickerAnalytics$SnapType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IMAGE = new <init>("IMAGE", 0);
        VIDEO = new <init>("VIDEO", 1);
        $VALUES = (new .VALUES[] {
            IMAGE, VIDEO
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
