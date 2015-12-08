// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture;


// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture:
//            WobsActionDecoratingResponseHandler

public static final class q extends Enum
{

    private static final FINISH_CAPTURE_AND_EXIT $VALUES[];
    public static final FINISH_CAPTURE_AND_EXIT FINISH_CAPTURE;
    public static final FINISH_CAPTURE_AND_EXIT FINISH_CAPTURE_AND_EXIT;
    public static final FINISH_CAPTURE_AND_EXIT PAUSE_CAPTURE_AND_FLIP_SIDE;

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/google/android/libraries/commerce/ocr/wobs/capture/WobsActionDecoratingResponseHandler$OcrAttemptAction, s);
    }

    public static q[] values()
    {
        return (q[])$VALUES.clone();
    }

    static 
    {
        FINISH_CAPTURE = new <init>("FINISH_CAPTURE", 0);
        PAUSE_CAPTURE_AND_FLIP_SIDE = new <init>("PAUSE_CAPTURE_AND_FLIP_SIDE", 1);
        FINISH_CAPTURE_AND_EXIT = new <init>("FINISH_CAPTURE_AND_EXIT", 2);
        $VALUES = (new .VALUES[] {
            FINISH_CAPTURE, PAUSE_CAPTURE_AND_FLIP_SIDE, FINISH_CAPTURE_AND_EXIT
        });
    }

    private q(String s, int i)
    {
        super(s, i);
    }
}
