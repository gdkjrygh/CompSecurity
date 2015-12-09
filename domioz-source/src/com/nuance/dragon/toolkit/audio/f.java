// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    private static final f e[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/nuance/dragon/toolkit/audio/f, s);
    }

    public static f[] values()
    {
        return (f[])e.clone();
    }

    static 
    {
        a = new f("PCM_16", 0);
        b = new f("SPEEX", 1);
        c = new f("OPUS", 2);
        d = new f("UNKNOWN", 3);
        e = (new f[] {
            a, b, c, d
        });
    }
}
