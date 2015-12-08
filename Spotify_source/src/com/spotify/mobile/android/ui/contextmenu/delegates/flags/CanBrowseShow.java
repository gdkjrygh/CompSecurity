// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanBrowseShow extends Enum
{

    public static final CanBrowseShow a;
    public static final CanBrowseShow b;
    private static final CanBrowseShow c[];

    private CanBrowseShow(String s, int i)
    {
        super(s, i);
    }

    public static CanBrowseShow valueOf(String s)
    {
        return (CanBrowseShow)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanBrowseShow, s);
    }

    public static CanBrowseShow[] values()
    {
        return (CanBrowseShow[])c.clone();
    }

    static 
    {
        a = new CanBrowseShow("Yes", 0);
        b = new CanBrowseShow("No", 1);
        c = (new CanBrowseShow[] {
            a, b
        });
    }
}
