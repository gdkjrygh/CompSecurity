// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class IsVideo extends Enum
{

    public static final IsVideo a;
    public static final IsVideo b;
    private static final IsVideo c[];

    private IsVideo(String s, int i)
    {
        super(s, i);
    }

    public static IsVideo valueOf(String s)
    {
        return (IsVideo)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/IsVideo, s);
    }

    public static IsVideo[] values()
    {
        return (IsVideo[])c.clone();
    }

    static 
    {
        a = new IsVideo("Yes", 0);
        b = new IsVideo("No", 1);
        c = (new IsVideo[] {
            a, b
        });
    }
}
