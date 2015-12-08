// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;


public final class  extends Enum
{

    public static final UNKNOWN END_OF_SPEECH;
    public static final UNKNOWN START_OF_SPEECH;
    public static final UNKNOWN UNKNOWN;
    private static final UNKNOWN a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/speech/s3/RecognitionState$EndpointerState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        START_OF_SPEECH = new <init>("START_OF_SPEECH", 0);
        END_OF_SPEECH = new <init>("END_OF_SPEECH", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        a = (new a[] {
            START_OF_SPEECH, END_OF_SPEECH, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
