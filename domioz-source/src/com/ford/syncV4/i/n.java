// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;


final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    private static final n e[];

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/ford/syncV4/i/n, s);
    }

    public static n[] values()
    {
        return (n[])e.clone();
    }

    static 
    {
        a = new n("IDLE", 0);
        b = new n("CONNECTING", 1);
        c = new n("CONNECTED", 2);
        d = new n("DISCONNECTING", 3);
        e = (new n[] {
            a, b, c, d
        });
    }
}
