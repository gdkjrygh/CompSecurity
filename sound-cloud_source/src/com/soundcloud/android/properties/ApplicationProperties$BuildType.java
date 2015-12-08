// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.properties;


// Referenced classes of package com.soundcloud.android.properties:
//            ApplicationProperties

public static final class playbackFeedbackEmail extends Enum
{

    private static final RELEASE $VALUES[];
    public static final RELEASE ALPHA;
    public static final RELEASE BETA;
    public static final RELEASE DEBUG;
    public static final RELEASE RELEASE;
    private final String feedbackEmail;
    private final String playbackFeedbackEmail;

    public static playbackFeedbackEmail valueOf(String s)
    {
        return (playbackFeedbackEmail)Enum.valueOf(com/soundcloud/android/properties/ApplicationProperties$BuildType, s);
    }

    public static playbackFeedbackEmail[] values()
    {
        return (playbackFeedbackEmail[])$VALUES.clone();
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0, "android-dev@soundcloud.com", "skippy@soundcloud.com");
        ALPHA = new <init>("ALPHA", 1, "android-alpha-logs@soundcloud.com", "android-alpha-logs-playback@soundcloud.com");
        BETA = new <init>("BETA", 2, "android-beta-logs@soundcloud.com", "android-beta-logs-playback@soundcloud.com");
        RELEASE = new <init>("RELEASE", 3, null, null);
        $VALUES = (new .VALUES[] {
            DEBUG, ALPHA, BETA, RELEASE
        });
    }



    private (String s, int i, String s1, String s2)
    {
        super(s, i);
        feedbackEmail = s1;
        playbackFeedbackEmail = s2;
    }
}
