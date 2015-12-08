// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.contextmenu.delegates.flags;


public final class ShowRemoveFromQueue extends Enum
{

    public static final ShowRemoveFromQueue a;
    public static final ShowRemoveFromQueue b;
    private static final ShowRemoveFromQueue c[];

    private ShowRemoveFromQueue(String s, int i)
    {
        super(s, i);
    }

    public static ShowRemoveFromQueue valueOf(String s)
    {
        return (ShowRemoveFromQueue)Enum.valueOf(com/spotify/mobile/android/ui/contextmenu/delegates/flags/ShowRemoveFromQueue, s);
    }

    public static ShowRemoveFromQueue[] values()
    {
        return (ShowRemoveFromQueue[])c.clone();
    }

    static 
    {
        a = new ShowRemoveFromQueue("Yes", 0);
        b = new ShowRemoveFromQueue("No", 1);
        c = (new ShowRemoveFromQueue[] {
            a, b
        });
    }
}
