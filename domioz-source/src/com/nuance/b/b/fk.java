// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


final class fk extends Enum
{

    public static final fk a;
    public static final fk b;
    public static final fk c;
    private static final fk e[];
    private final String d;

    private fk(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static fk valueOf(String s)
    {
        return (fk)Enum.valueOf(com/nuance/b/b/fk, s);
    }

    public static fk[] values()
    {
        return (fk[])e.clone();
    }

    public final String toString()
    {
        return d;
    }

    static 
    {
        a = new fk("REINSTALL", 0, "REINSTALL");
        b = new fk("NEWINSTALL", 1, "NEWINSTALL");
        c = new fk("RELAUNCH", 2, "RELAUNCH");
        e = (new fk[] {
            a, b, c
        });
    }
}
