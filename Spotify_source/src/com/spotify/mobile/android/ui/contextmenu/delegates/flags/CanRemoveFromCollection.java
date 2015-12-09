// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class CanRemoveFromCollection extends Enum
{

    public static final CanRemoveFromCollection a;
    public static final CanRemoveFromCollection b;
    private static final CanRemoveFromCollection c[];

    private CanRemoveFromCollection(String s, int i)
    {
        super(s, i);
    }

    public static CanRemoveFromCollection valueOf(String s)
    {
        return (CanRemoveFromCollection)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/CanRemoveFromCollection, s);
    }

    public static CanRemoveFromCollection[] values()
    {
        return (CanRemoveFromCollection[])c.clone();
    }

    static 
    {
        a = new CanRemoveFromCollection("Yes", 0);
        b = new CanRemoveFromCollection("No", 1);
        c = (new CanRemoveFromCollection[] {
            a, b
        });
    }
}
