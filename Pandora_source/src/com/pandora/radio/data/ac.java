// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


public final class ac extends Enum
{

    public static final ac a;
    public static final ac b;
    public static final ac c;
    private static final ac d[];

    private ac(String s, int i)
    {
        super(s, i);
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/pandora/radio/data/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])d.clone();
    }

    static 
    {
        a = new ac("Track", 0);
        b = new ac("AudioAd", 1);
        c = new ac("ArtistMessage", 2);
        d = (new ac[] {
            a, b, c
        });
    }
}
