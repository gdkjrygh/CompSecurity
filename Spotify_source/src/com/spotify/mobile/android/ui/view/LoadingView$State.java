// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;


public final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/ui/view/LoadingView$State, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("WAITING_TO_BE_SHOWN", 0);
        b = new <init>("WAITING_TO_START_FADE_IN", 1);
        c = new <init>("FADING_IN", 2);
        d = new <init>("FULLY_VISIBLE", 3);
        e = new <init>("FADING_OUT", 4);
        f = new <init>("VISIBILITY_SET_TO_GONE", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
