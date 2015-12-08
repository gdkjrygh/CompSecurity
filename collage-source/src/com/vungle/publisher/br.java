// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;


public final class br extends Enum
{

    public static final br a;
    public static final br b;
    public static final br c;
    private static final br e[];
    public int d;

    private br(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static br valueOf(String s)
    {
        return (br)Enum.valueOf(com/vungle/publisher/br, s);
    }

    public static br[] values()
    {
        return (br[])e.clone();
    }

    static 
    {
        a = new br("GINGERBREAD", 0, 9);
        b = new br("KITKAT", 1, 19);
        c = new br("MARSHMALLOW", 2, 23);
        e = (new br[] {
            a, b, c
        });
    }
}
