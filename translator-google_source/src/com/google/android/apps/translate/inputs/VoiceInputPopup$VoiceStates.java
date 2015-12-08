// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;


final class  extends Enum
{

    public static final COMPLETE COMPLETE;
    public static final COMPLETE EDITTEXT_COMLETE;
    public static final COMPLETE EDITTEXT_NEW_WORD;
    public static final COMPLETE ERROR;
    public static final COMPLETE RECOG_COMLETE;
    public static final COMPLETE RECOG_ERROR;
    public static final COMPLETE RECOG_NEW_WORD;
    public static final COMPLETE START;
    public static final COMPLETE TRANSLATION_ERROR;
    public static final COMPLETE TRANSLATION_SUCCESS;
    public static final COMPLETE TTS_BEGIN;
    public static final COMPLETE TTS_COMPLETE;
    public static final COMPLETE TTS_ERROR;
    private static final COMPLETE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/translate/inputs/VoiceInputPopup$VoiceStates, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        START = new <init>("START", 0);
        RECOG_NEW_WORD = new <init>("RECOG_NEW_WORD", 1);
        RECOG_COMLETE = new <init>("RECOG_COMLETE", 2);
        RECOG_ERROR = new <init>("RECOG_ERROR", 3);
        TRANSLATION_SUCCESS = new <init>("TRANSLATION_SUCCESS", 4);
        TRANSLATION_ERROR = new <init>("TRANSLATION_ERROR", 5);
        TTS_BEGIN = new <init>("TTS_BEGIN", 6);
        TTS_COMPLETE = new <init>("TTS_COMPLETE", 7);
        TTS_ERROR = new <init>("TTS_ERROR", 8);
        EDITTEXT_NEW_WORD = new <init>("EDITTEXT_NEW_WORD", 9);
        EDITTEXT_COMLETE = new <init>("EDITTEXT_COMLETE", 10);
        ERROR = new <init>("ERROR", 11);
        COMPLETE = new <init>("COMPLETE", 12);
        a = (new a[] {
            START, RECOG_NEW_WORD, RECOG_COMLETE, RECOG_ERROR, TRANSLATION_SUCCESS, TRANSLATION_ERROR, TTS_BEGIN, TTS_COMPLETE, TTS_ERROR, EDITTEXT_NEW_WORD, 
            EDITTEXT_COMLETE, ERROR, COMPLETE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
