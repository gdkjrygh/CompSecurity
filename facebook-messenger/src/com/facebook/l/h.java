// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;


final class h extends Enum
{

    private static final h $VALUES[];
    public static final h MUSIC_IS_NOT_PLAYING;
    public static final h MUSIC_IS_PLAYING;
    public static final h UNKNOWN;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/l/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new h("UNKNOWN", 0);
        MUSIC_IS_PLAYING = new h("MUSIC_IS_PLAYING", 1);
        MUSIC_IS_NOT_PLAYING = new h("MUSIC_IS_NOT_PLAYING", 2);
        $VALUES = (new h[] {
            UNKNOWN, MUSIC_IS_PLAYING, MUSIC_IS_NOT_PLAYING
        });
    }
}
