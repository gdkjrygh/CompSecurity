// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.provider;


public final class  extends Enum
{

    public static final c a;
    private static c b;
    private static c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/provider/Metadata$Track$AdType, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        b = new <init>("NORMAL", 0);
        a = new <init>("OFFER_AD", 1);
        c = new <init>("END_CARD_AD", 2);
        d = (new d[] {
            b, a, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
