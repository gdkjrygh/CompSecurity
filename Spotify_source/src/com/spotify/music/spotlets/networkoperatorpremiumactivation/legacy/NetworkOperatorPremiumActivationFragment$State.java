// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;


final class  extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/NetworkOperatorPremiumActivationFragment$State, s);
    }

    public static [] values()
    {
        return ([])k.clone();
    }

    static 
    {
        a = new <init>("INITIALIZED", 0);
        b = new <init>("DISABLED", 1);
        c = new <init>("WAITING_FOR_FREE_USER", 2);
        d = new <init>("WAITING_FOR_BACKEND_CONNECTION", 3);
        e = new <init>("WAITING_FOR_MOBILE_CONNECTIVITY", 4);
        f = new <init>("WAITING_FOR_MSISDN", 5);
        g = new <init>("WAITING_FOR_ELIGIBILITY_CHECK", 6);
        h = new <init>("WAITING_FOR_SHOWING_DIALOG", 7);
        i = new <init>("DIALOG_SHOWN", 8);
        j = new <init>("DESTROYED", 9);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private (String s, int l)
    {
        super(s, l);
    }
}
