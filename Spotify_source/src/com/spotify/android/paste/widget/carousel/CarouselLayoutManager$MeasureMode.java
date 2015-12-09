// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.carousel;


public final class Q extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/spotify/android/paste/widget/carousel/CarouselLayoutManager$MeasureMode, s);
    }

    public static Q[] values()
    {
        return (Q[])c.clone();
    }

    static 
    {
        a = new <init>("SQUARE", 0);
        b = new <init>("FILL", 1);
        c = (new c[] {
            a, b
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
