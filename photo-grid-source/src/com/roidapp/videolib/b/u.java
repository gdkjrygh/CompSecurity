// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;


public final class u extends Enum
{

    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    public static final u f;
    public static final u g;
    public static final u h;
    public static final u i;
    public static final u j;
    public static final u k;
    public static final u l;
    private static final u m[];

    private u(String s, int i1)
    {
        super(s, i1);
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/roidapp/videolib/b/u, s);
    }

    public static u[] values()
    {
        return (u[])m.clone();
    }

    static 
    {
        a = new u("OFF", 0);
        b = new u("ONE_LOVE", 1);
        c = new u("CHRISTMAS", 2);
        d = new u("SHUFFLE", 3);
        e = new u("POP", 4);
        f = new u("PUSH", 5);
        g = new u("FLOP", 6);
        h = new u("COVER", 7);
        i = new u("DISSOLVE", 8);
        j = new u("FLICK", 9);
        k = new u("Count", 10);
        l = new u("S8", 11);
        m = (new u[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
