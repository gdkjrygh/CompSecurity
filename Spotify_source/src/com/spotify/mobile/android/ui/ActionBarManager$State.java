// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui;


public final class mAlpha extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private final int mAlpha;

    public static int a(mAlpha malpha)
    {
        return malpha.mAlpha;
    }

    public static int b(mAlpha malpha)
    {
        return malpha.mAlpha;
    }

    public static mAlpha valueOf(String s)
    {
        return (mAlpha)Enum.valueOf(com/spotify/mobile/android/ui/ActionBarManager$State, s);
    }

    public static mAlpha[] values()
    {
        return (mAlpha[])c.clone();
    }

    static 
    {
        a = new <init>("TRANSPARENT", 0, 0);
        b = new <init>("OPAQUE", 1, 255);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mAlpha = j;
    }
}
