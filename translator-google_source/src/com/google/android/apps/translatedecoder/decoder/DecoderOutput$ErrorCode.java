// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


public final class  extends Enum
{

    public static final LOADING_C2C_FAILED DICTIONARY_ERROR;
    public static final LOADING_C2C_FAILED DICTIONARY_TIMEOUT;
    public static final LOADING_C2C_FAILED LOADING_C2C_FAILED;
    public static final LOADING_C2C_FAILED LOADING_FQ_FAILED;
    public static final LOADING_C2C_FAILED LOADING_RR_FAILED;
    private static final LOADING_C2C_FAILED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/translatedecoder/decoder/DecoderOutput$ErrorCode, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DICTIONARY_ERROR = new <init>("DICTIONARY_ERROR", 0);
        DICTIONARY_TIMEOUT = new <init>("DICTIONARY_TIMEOUT", 1);
        LOADING_FQ_FAILED = new <init>("LOADING_FQ_FAILED", 2);
        LOADING_RR_FAILED = new <init>("LOADING_RR_FAILED", 3);
        LOADING_C2C_FAILED = new <init>("LOADING_C2C_FAILED", 4);
        a = (new a[] {
            DICTIONARY_ERROR, DICTIONARY_TIMEOUT, LOADING_FQ_FAILED, LOADING_RR_FAILED, LOADING_C2C_FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
