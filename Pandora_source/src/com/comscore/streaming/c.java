// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    public static final c k;
    private static final c n[];
    private String l;
    private int m;

    private c(String s, int i1, String s1, int j1)
    {
        super(s, i1);
        l = s1;
        m = j1;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/comscore/streaming/c, s);
    }

    public static c[] values()
    {
        return (c[])n.clone();
    }

    public String a()
    {
        return l;
    }

    public String toString()
    {
        return a();
    }

    static 
    {
        a = new c("PLAY", 0, "play", 0);
        b = new c("PAUSE", 1, "pause", 1);
        c = new c("END", 2, "end", 2);
        d = new c("BUFFER", 3, "buffer", 3);
        e = new c("KEEP_ALIVE", 4, "keep-alive", 4);
        f = new c("HEART_BEAT", 5, "hb", 5);
        g = new c("CUSTOM", 6, "custom", 6);
        h = new c("AD_PLAY", 7, "ad_play", 7);
        i = new c("AD_PAUSE", 8, "ad_pause", 8);
        j = new c("AD_END", 9, "ad_end", 9);
        k = new c("AD_CLICK", 10, "ad_click", 10);
        n = (new c[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
