// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.speech.s3;


public final class  extends Enum
{

    public static final UNKNOWN COMPLETED_RESULT;
    public static final UNKNOWN RESULT;
    public static final UNKNOWN UNKNOWN;
    private static final UNKNOWN a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/translate/speech/s3/RecognitionState$ResultType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        RESULT = new <init>("RESULT", 0);
        COMPLETED_RESULT = new <init>("COMPLETED_RESULT", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        a = (new a[] {
            RESULT, COMPLETED_RESULT, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
