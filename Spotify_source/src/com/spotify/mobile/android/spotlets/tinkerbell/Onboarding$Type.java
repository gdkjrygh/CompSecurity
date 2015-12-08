// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;


public final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/spotlets/tinkerbell/Onboarding$Type, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("PLAYER_SAVE_TOOLTIP", 0);
        b = new <init>("SHUFFLE_PLAY_BUTTON_TOOLTIP", 1);
        c = new <init>("SNACK_BAR_PLAYER_TOOLTIP", 2);
        d = new <init>("CONNECT_NPB_TOOLTIP", 3);
        e = new <init>("CONNECT_NPV_TOOLTIP", 4);
        f = new <init>("ON_DEMAND_UPSELL", 5);
        g = new <init>("OFFLINE_SYNC_TOOLTIP", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
