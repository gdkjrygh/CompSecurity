// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class l extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    private static final l f[];

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l a(String s)
    {
        return valueOf(s);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/ford/syncV4/e/c/a/l, s);
    }

    public static l[] values()
    {
        return (l[])f.clone();
    }

    static 
    {
        a = new l("HELP_JINGLE", 0);
        b = new l("INITIAL_JINGLE", 1);
        c = new l("LISTEN_JINGLE", 2);
        d = new l("POSITIVE_JINGLE", 3);
        e = new l("NEGATIVE_JINGLE", 4);
        f = (new l[] {
            a, b, c, d, e
        });
    }
}
