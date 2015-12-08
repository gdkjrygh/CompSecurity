// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanRemoveTrack extends Enum
{

    public static final CanRemoveTrack a;
    public static final CanRemoveTrack b;
    private static final CanRemoveTrack c[];

    private CanRemoveTrack(String s, int i)
    {
        super(s, i);
    }

    public static CanRemoveTrack valueOf(String s)
    {
        return (CanRemoveTrack)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanRemoveTrack, s);
    }

    public static CanRemoveTrack[] values()
    {
        return (CanRemoveTrack[])c.clone();
    }

    static 
    {
        a = new CanRemoveTrack("Yes", 0);
        b = new CanRemoveTrack("No", 1);
        c = (new CanRemoveTrack[] {
            a, b
        });
    }
}
