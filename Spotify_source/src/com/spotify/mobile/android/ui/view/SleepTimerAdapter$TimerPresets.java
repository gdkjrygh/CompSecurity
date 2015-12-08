// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import java.util.concurrent.TimeUnit;

public final class mTitle extends Enum
{

    public static final g a;
    private static g b;
    private static g c;
    private static g d;
    private static g e;
    private static g f;
    private static g g;
    private static final g h[];
    public long mDuration;
    private int mTitle;

    static int a(mTitle mtitle)
    {
        return mtitle.mTitle;
    }

    public static mTitle valueOf(String s)
    {
        return (mTitle)Enum.valueOf(com/spotify/mobile/android/ui/view/SleepTimerAdapter$TimerPresets, s);
    }

    public static mTitle[] values()
    {
        return (mTitle[])h.clone();
    }

    static 
    {
        a = new <init>("TURN_TIMER_OFF", 0, 0L, 0x7f080513);
        b = new <init>("FIVE_MINUTES", 1, TimeUnit.MINUTES.toMillis(5L), 0x7f08050d);
        c = new <init>("TEN_MINUTES", 2, TimeUnit.MINUTES.toMillis(10L), 0x7f080510);
        d = new <init>("FIFTEEN_MINUTES", 3, TimeUnit.MINUTES.toMillis(15L), 0x7f08050c);
        e = new <init>("THIRTY_MINUTES", 4, TimeUnit.MINUTES.toMillis(30L), 0x7f080511);
        f = new <init>("FORTYFIVE_MINUTES", 5, TimeUnit.MINUTES.toMillis(45L), 0x7f08050e);
        g = new <init>("SIXTY_MINUTES", 6, TimeUnit.HOURS.toMillis(1L), 0x7f08050f);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i, long l, int j)
    {
        super(s, i);
        mDuration = l;
        mTitle = j;
    }
}
