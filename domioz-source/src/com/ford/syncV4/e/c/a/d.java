// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    private static final d i[];

    private d(String s, int j)
    {
        super(s, j);
    }

    public static d a(String s)
    {
        return valueOf(s);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/ford/syncV4/e/c/a/d, s);
    }

    public static d[] values()
    {
        return (d[])i.clone();
    }

    static 
    {
        a = new d("GRAPHIC_BMP", 0);
        b = new d("GRAPHIC_JPEG", 1);
        c = new d("GRAPHIC_PNG", 2);
        d = new d("AUDIO_WAVE", 3);
        e = new d("AUDIO_AAC", 4);
        f = new d("AUDIO_MP3", 5);
        g = new d("BINARY", 6);
        h = new d("JSON", 7);
        i = (new d[] {
            a, b, c, d, e, f, g, h
        });
    }
}
