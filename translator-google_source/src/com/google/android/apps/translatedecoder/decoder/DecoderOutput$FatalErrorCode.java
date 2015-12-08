// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


public final class  extends Enum
{

    public static final LOADING_PD_FAILED LOADING_LM_FAILED;
    public static final LOADING_PD_FAILED LOADING_PD_FAILED;
    public static final LOADING_PD_FAILED LOADING_PT_FAILED;
    private static final LOADING_PD_FAILED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/translatedecoder/decoder/DecoderOutput$FatalErrorCode, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        LOADING_LM_FAILED = new <init>("LOADING_LM_FAILED", 0);
        LOADING_PT_FAILED = new <init>("LOADING_PT_FAILED", 1);
        LOADING_PD_FAILED = new <init>("LOADING_PD_FAILED", 2);
        a = (new a[] {
            LOADING_LM_FAILED, LOADING_PT_FAILED, LOADING_PD_FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
