// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.glue.molecules.card;


public final class CardAppearance extends Enum
{

    public static final CardAppearance a;
    public static final CardAppearance b;
    public static final CardAppearance c;
    private static final CardAppearance d[];

    private CardAppearance(String s, int i)
    {
        super(s, i);
    }

    public static CardAppearance valueOf(String s)
    {
        return (CardAppearance)Enum.valueOf(com/spotify/android/glue/molecules/card/CardAppearance, s);
    }

    public static CardAppearance[] values()
    {
        return (CardAppearance[])d.clone();
    }

    static 
    {
        a = new CardAppearance("TITLE_ONLY", 0);
        b = new CardAppearance("TITLE_AND_SUBTITLE", 1);
        c = new CardAppearance("TITLE_AND_METADATA", 2);
        d = (new CardAppearance[] {
            a, b, c
        });
    }
}
