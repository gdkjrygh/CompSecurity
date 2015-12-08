// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;


public final class Change extends Enum
{

    public static final Change a;
    public static final Change b;
    public static final Change c;
    public static final Change d;
    private static final Change e[];

    private Change(String s, int i)
    {
        super(s, i);
    }

    public static Change valueOf(String s)
    {
        return (Change)Enum.valueOf(com/spotify/mobile/android/util/Change, s);
    }

    public static Change[] values()
    {
        return (Change[])e.clone();
    }

    static 
    {
        a = new Change("METADATA", 0);
        b = new Change("PLAYBACK_STATE", 1);
        c = new Change("QUEUE", 2);
        d = new Change("PLAYBACK_LOCATION", 3);
        e = (new Change[] {
            a, b, c, d
        });
    }
}
