// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;


final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    private static final n l[];

    private n(String s, int i1)
    {
        super(s, i1);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/a/a/a/n, s);
    }

    public static n[] values()
    {
        return (n[])l.clone();
    }

    static 
    {
        a = new n("CREATE", 0);
        b = new n("START", 1);
        c = new n("RESUME", 2);
        d = new n("SAVE_INSTANCE_STATE", 3);
        e = new n("PAUSE", 4);
        f = new n("STOP", 5);
        g = new n("DESTROY", 6);
        h = new n("ERROR", 7);
        i = new n("CRASH", 8);
        j = new n("INSTALL", 9);
        k = new n("CUSTOM", 10);
        l = (new n[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
