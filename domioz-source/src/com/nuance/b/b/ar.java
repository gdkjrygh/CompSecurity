// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class ar extends Enum
{

    public static final ar a;
    public static final ar b;
    public static final ar c;
    public static final ar d;
    public static final ar e;
    public static final ar f;
    public static final ar g;
    private static final ar h[];

    private ar(String s, int i)
    {
        super(s, i);
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(com/nuance/b/b/ar, s);
    }

    public static ar[] values()
    {
        return (ar[])h.clone();
    }

    static 
    {
        a = new ar("SUCCESS", 0);
        b = new ar("NO_INPUT_TIMEOUT", 1);
        c = new ar("NO_MATCH", 2);
        d = new ar("SPEECH_TOO_EARLY", 3);
        e = new ar("TOO_MUCH_SPEECH_TIMEOUT", 4);
        f = new ar("INITIAL_STATE", 5);
        g = new ar("SPEECH_NOT_DETECTED", 6);
        h = (new ar[] {
            a, b, c, d, e, f, g
        });
    }
}
