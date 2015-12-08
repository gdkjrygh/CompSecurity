// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.rapidresp;


public final class PhraseType extends Enum
{

    public static final PhraseType ANTI_DOMINATING_PHRASE;
    public static final PhraseType DOMINATING_PHRASE;
    private static final PhraseType a[];

    private PhraseType(String s, int i)
    {
        super(s, i);
    }

    public static PhraseType valueOf(String s)
    {
        return (PhraseType)Enum.valueOf(com/google/android/apps/translatedecoder/rapidresp/PhraseType, s);
    }

    public static PhraseType[] values()
    {
        return (PhraseType[])a.clone();
    }

    static 
    {
        DOMINATING_PHRASE = new PhraseType("DOMINATING_PHRASE", 0);
        ANTI_DOMINATING_PHRASE = new PhraseType("ANTI_DOMINATING_PHRASE", 1);
        a = (new PhraseType[] {
            DOMINATING_PHRASE, ANTI_DOMINATING_PHRASE
        });
    }
}
