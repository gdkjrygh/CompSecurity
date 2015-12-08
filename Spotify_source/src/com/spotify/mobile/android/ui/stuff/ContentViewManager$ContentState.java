// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.stuff;


public final class mPriority extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    public final int mPriority;

    public static mPriority valueOf(String s)
    {
        return (mPriority)Enum.valueOf(com/spotify/mobile/android/ui/stuff/ContentViewManager$ContentState, s);
    }

    public static mPriority[] values()
    {
        return (mPriority[])e.clone();
    }

    static 
    {
        a = new <init>("NO_NETWORK", 0, 0x7fffffff);
        b = new <init>("SERVICE_ERROR", 1, 0x7ffffffe);
        c = new <init>("SERVICE_WARNING", 2, 0x7ffffffd);
        d = new <init>("EMPTY_CONTENT", 3, 0x7ffffffc);
        e = (new e[] {
            a, b, c, d
        });
    }

    private I(String s, int i, int j)
    {
        super(s, i);
        mPriority = j;
    }
}
