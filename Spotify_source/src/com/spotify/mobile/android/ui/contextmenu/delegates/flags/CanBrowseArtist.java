// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanBrowseArtist extends Enum
{

    public static final CanBrowseArtist a;
    public static final CanBrowseArtist b;
    private static final CanBrowseArtist c[];

    private CanBrowseArtist(String s, int i)
    {
        super(s, i);
    }

    public static CanBrowseArtist valueOf(String s)
    {
        return (CanBrowseArtist)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanBrowseArtist, s);
    }

    public static CanBrowseArtist[] values()
    {
        return (CanBrowseArtist[])c.clone();
    }

    static 
    {
        a = new CanBrowseArtist("Yes", 0);
        b = new CanBrowseArtist("No", 1);
        c = (new CanBrowseArtist[] {
            a, b
        });
    }
}
