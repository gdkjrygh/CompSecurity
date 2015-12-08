// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanChangePlayedState extends Enum
{

    public static final CanChangePlayedState a;
    public static final CanChangePlayedState b;
    private static final CanChangePlayedState c[];

    private CanChangePlayedState(String s, int i)
    {
        super(s, i);
    }

    public static CanChangePlayedState valueOf(String s)
    {
        return (CanChangePlayedState)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanChangePlayedState, s);
    }

    public static CanChangePlayedState[] values()
    {
        return (CanChangePlayedState[])c.clone();
    }

    static 
    {
        a = new CanChangePlayedState("Yes", 0);
        b = new CanChangePlayedState("No", 1);
        c = (new CanChangePlayedState[] {
            a, b
        });
    }
}
