// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.util;


public final class mName extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    final String mName;

    public static mName valueOf(String s)
    {
        return (mName)Enum.valueOf(com/spotify/mobile/android/spotlets/playlist/util/PlaylistLogger$SourceAction, s);
    }

    public static mName[] values()
    {
        return (mName[])c.clone();
    }

    static 
    {
        a = new <init>("ADD_TO_PLAYLIST", 0, "add-to-playlist");
        b = new <init>("SAVE_TO_COLLECTION", 1, "save-to-collection");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mName = s1;
    }
}
