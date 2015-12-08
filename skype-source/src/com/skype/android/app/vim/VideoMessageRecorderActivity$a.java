// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;


// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

private static final class  extends Enum
{

    private static final INTERRUPTED $VALUES[];
    public static final INTERRUPTED CANCELED;
    public static final INTERRUPTED INTERRUPTED;
    public static final INTERRUPTED PRERECORD;
    public static final INTERRUPTED RECORDING;
    public static final INTERRUPTED REVIEW;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/vim/VideoMessageRecorderActivity$a, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRERECORD = new <init>("PRERECORD", 0);
        RECORDING = new <init>("RECORDING", 1);
        REVIEW = new <init>("REVIEW", 2);
        CANCELED = new <init>("CANCELED", 3);
        INTERRUPTED = new <init>("INTERRUPTED", 4);
        $VALUES = (new .VALUES[] {
            PRERECORD, RECORDING, REVIEW, CANCELED, INTERRUPTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
