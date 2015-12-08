// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


public final class ox extends Enum
{

    public static final ox a;
    public static final ox b;
    public static final ox c;
    public static final ox d;
    private static final ox e[];

    private ox(String s, int i)
    {
        super(s, i);
    }

    public static ox valueOf(String s)
    {
        return (ox)Enum.valueOf(com/taplytics/ox, s);
    }

    public static ox[] values()
    {
        return (ox[])e.clone();
    }

    static 
    {
        a = new ox("TLDEV", 0);
        b = new ox("TLPRODUCTION", 1);
        c = new ox("TLSTAGING", 2);
        d = new ox("TLLOCALHOST", 3);
        e = (new ox[] {
            a, b, c, d
        });
    }
}
