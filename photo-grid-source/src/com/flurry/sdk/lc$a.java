// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class > extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static > valueOf(String s)
    {
        return (>)Enum.valueOf(com/flurry/sdk/lc$a, s);
    }

    public static Of[] values()
    {
        return (Of[])f.clone();
    }

    static 
    {
        a = new <init>("CREATE", 0);
        b = new <init>("SESSION_ID_CREATED", 1);
        c = new <init>("START", 2);
        d = new <init>("END", 3);
        e = new <init>("FINALIZE", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
