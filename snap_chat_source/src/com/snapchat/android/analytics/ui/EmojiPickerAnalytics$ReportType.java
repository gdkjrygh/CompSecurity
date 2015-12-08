// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.ui;


// Referenced classes of package com.snapchat.android.analytics.ui:
//            EmojiPickerAnalytics

public static final class  extends Enum
{

    private static final SAVED $VALUES[];
    public static final SAVED POSTED;
    public static final SAVED SAVED;
    public static final SAVED SENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/ui/EmojiPickerAnalytics$ReportType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SENT = new <init>("SENT", 0);
        POSTED = new <init>("POSTED", 1);
        SAVED = new <init>("SAVED", 2);
        $VALUES = (new .VALUES[] {
            SENT, POSTED, SAVED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
