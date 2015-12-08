// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanBrowseAlbum extends Enum
{

    public static final CanBrowseAlbum a;
    public static final CanBrowseAlbum b;
    private static final CanBrowseAlbum c[];

    private CanBrowseAlbum(String s, int i)
    {
        super(s, i);
    }

    public static CanBrowseAlbum valueOf(String s)
    {
        return (CanBrowseAlbum)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanBrowseAlbum, s);
    }

    public static CanBrowseAlbum[] values()
    {
        return (CanBrowseAlbum[])c.clone();
    }

    static 
    {
        a = new CanBrowseAlbum("Yes", 0);
        b = new CanBrowseAlbum("No", 1);
        c = (new CanBrowseAlbum[] {
            a, b
        });
    }
}
