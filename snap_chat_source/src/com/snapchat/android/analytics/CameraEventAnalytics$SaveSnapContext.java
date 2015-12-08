// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            CameraEventAnalytics

public static final class I extends Enum
{

    private static final DISCOVER $VALUES[];
    public static final DISCOVER DISCOVER;
    public static final DISCOVER PREVIEW;
    public static final DISCOVER STORY;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/snapchat/android/analytics/CameraEventAnalytics$SaveSnapContext, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        PREVIEW = new <init>("PREVIEW", 0);
        STORY = new <init>("STORY", 1);
        DISCOVER = new <init>("DISCOVER", 2);
        $VALUES = (new .VALUES[] {
            PREVIEW, STORY, DISCOVER
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
