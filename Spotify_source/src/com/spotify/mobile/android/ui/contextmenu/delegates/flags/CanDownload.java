// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanDownload extends Enum
{

    public static final CanDownload a;
    public static final CanDownload b;
    private static final CanDownload c[];

    private CanDownload(String s, int i)
    {
        super(s, i);
    }

    public static CanDownload valueOf(String s)
    {
        return (CanDownload)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanDownload, s);
    }

    public static CanDownload[] values()
    {
        return (CanDownload[])c.clone();
    }

    static 
    {
        a = new CanDownload("Yes", 0);
        b = new CanDownload("No", 1);
        c = (new CanDownload[] {
            a, b
        });
    }
}
