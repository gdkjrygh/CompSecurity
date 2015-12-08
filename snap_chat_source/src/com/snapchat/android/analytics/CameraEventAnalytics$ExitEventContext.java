// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            CameraEventAnalytics

public static final class name extends Enum
{

    private static final OTHERS $VALUES[];
    public static final OTHERS BACKGROUND;
    public static final OTHERS DEEP_LINK;
    public static final OTHERS OTHERS;
    public static final OTHERS PROFILE;
    private final String name;

    public static name valueOf(String s)
    {
        return (name)Enum.valueOf(com/snapchat/android/analytics/CameraEventAnalytics$ExitEventContext, s);
    }

    public static name[] values()
    {
        return (name[])$VALUES.clone();
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        PROFILE = new <init>("PROFILE", 0, "PROFILE");
        BACKGROUND = new <init>("BACKGROUND", 1, "BACKGROUND");
        DEEP_LINK = new <init>("DEEP_LINK", 2, "DEEPLINK");
        OTHERS = new <init>("OTHERS", 3, "");
        $VALUES = (new .VALUES[] {
            PROFILE, BACKGROUND, DEEP_LINK, OTHERS
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }
}
