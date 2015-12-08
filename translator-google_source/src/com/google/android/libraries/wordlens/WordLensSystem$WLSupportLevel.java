// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;


public final class I extends Enum
{

    public static final WORD_LENS NONE;
    public static final WORD_LENS SMUDGE_ONLY;
    public static final WORD_LENS WORD_LENS;
    private static final WORD_LENS a[];

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/google/android/libraries/wordlens/WordLensSystem$WLSupportLevel, s);
    }

    public static I[] values()
    {
        return (I[])a.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        SMUDGE_ONLY = new <init>("SMUDGE_ONLY", 1);
        WORD_LENS = new <init>("WORD_LENS", 2);
        a = (new a[] {
            NONE, SMUDGE_ONLY, WORD_LENS
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
