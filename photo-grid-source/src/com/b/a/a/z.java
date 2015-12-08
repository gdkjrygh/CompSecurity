// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;


final class z extends Enum
{

    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;
    public static final z g;
    public static final z h;
    public static final z i;
    public static final z j;
    public static final z k;
    public static final z l;
    private static final z m[];

    private z(String s, int i1)
    {
        super(s, i1);
    }

    public static z valueOf(String s)
    {
        return (z)Enum.valueOf(com/b/a/a/z, s);
    }

    public static z[] values()
    {
        return (z[])m.clone();
    }

    static 
    {
        a = new z("CREATE", 0);
        b = new z("START", 1);
        c = new z("RESUME", 2);
        d = new z("SAVE_INSTANCE_STATE", 3);
        e = new z("PAUSE", 4);
        f = new z("STOP", 5);
        g = new z("DESTROY", 6);
        h = new z("ERROR", 7);
        i = new z("CRASH", 8);
        j = new z("INSTALL", 9);
        k = new z("CUSTOM", 10);
        l = new z("PREDEFINED", 11);
        m = (new z[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
