// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


// Referenced classes of package com.skype.android.app.calling:
//            CallQualityFeedbackRating

public static final class label extends Enum
{

    private static final MPV $VALUES[];
    public static final MPV MPA;
    public static final MPV MPV;
    public static final MPV SKYPE_OUT;
    public static final MPV SKYPE_TO_SKYPE;
    private final String label;

    public static label valueOf(String s)
    {
        return (label)Enum.valueOf(com/skype/android/app/calling/CallQualityFeedbackRating$CQFType, s);
    }

    public static label[] values()
    {
        return (label[])$VALUES.clone();
    }

    public final String getLabel()
    {
        return label;
    }

    static 
    {
        SKYPE_OUT = new <init>("SKYPE_OUT", 0, "25");
        SKYPE_TO_SKYPE = new <init>("SKYPE_TO_SKYPE", 1, "26");
        MPA = new <init>("MPA", 2, "27");
        MPV = new <init>("MPV", 3, "28");
        $VALUES = (new .VALUES[] {
            SKYPE_OUT, SKYPE_TO_SKYPE, MPA, MPV
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        label = s1;
    }
}
