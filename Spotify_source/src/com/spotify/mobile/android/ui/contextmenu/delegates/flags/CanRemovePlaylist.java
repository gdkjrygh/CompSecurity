// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanRemovePlaylist extends Enum
{

    public static final CanRemovePlaylist a;
    public static final CanRemovePlaylist b;
    private static final CanRemovePlaylist c[];

    private CanRemovePlaylist(String s, int i)
    {
        super(s, i);
    }

    public static CanRemovePlaylist valueOf(String s)
    {
        return (CanRemovePlaylist)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanRemovePlaylist, s);
    }

    public static CanRemovePlaylist[] values()
    {
        return (CanRemovePlaylist[])c.clone();
    }

    static 
    {
        a = new CanRemovePlaylist("Yes", 0);
        b = new CanRemovePlaylist("No", 1);
        c = (new CanRemovePlaylist[] {
            a, b
        });
    }
}
