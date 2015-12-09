// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//            c

public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    private static final f h[];
    private String e;
    private int f;
    private c g;

    private f(String s, int i, String s1, int j, c c1)
    {
        super(s, i);
        e = s1;
        f = j;
        g = c1;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/comscore/streaming/f, s);
    }

    public static f[] values()
    {
        return (f[])h.clone();
    }

    public String a()
    {
        return e;
    }

    public c b()
    {
        return g;
    }

    public String toString()
    {
        return a();
    }

    static 
    {
        a = new f("IDLE", 0, "idle", 0, c.c);
        b = new f("PLAYING", 1, "playing", 1, c.a);
        c = new f("PAUSED", 2, "paused", 2, c.b);
        d = new f("BUFFERING", 3, "buffering", 3, c.d);
        h = (new f[] {
            a, b, c, d
        });
    }
}
