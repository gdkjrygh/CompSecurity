// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;


// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

static final class  extends Enum
{

    private static final REVIEW $VALUES[];
    public static final REVIEW PAUSED;
    public static final REVIEW PRERECORD;
    public static final REVIEW RECORDING;
    public static final REVIEW REVIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/vim/VideoCaptureFragment$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRERECORD = new <init>("PRERECORD", 0);
        PAUSED = new <init>("PAUSED", 1);
        RECORDING = new <init>("RECORDING", 2);
        REVIEW = new <init>("REVIEW", 3);
        $VALUES = (new .VALUES[] {
            PRERECORD, PAUSED, RECORDING, REVIEW
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
