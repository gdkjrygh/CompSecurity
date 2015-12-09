// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanAddToCollection extends Enum
{

    public static final CanAddToCollection a;
    public static final CanAddToCollection b;
    private static final CanAddToCollection c[];

    private CanAddToCollection(String s, int i)
    {
        super(s, i);
    }

    public static CanAddToCollection valueOf(String s)
    {
        return (CanAddToCollection)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanAddToCollection, s);
    }

    public static CanAddToCollection[] values()
    {
        return (CanAddToCollection[])c.clone();
    }

    static 
    {
        a = new CanAddToCollection("Yes", 0);
        b = new CanAddToCollection("No", 1);
        c = (new CanAddToCollection[] {
            a, b
        });
    }
}
