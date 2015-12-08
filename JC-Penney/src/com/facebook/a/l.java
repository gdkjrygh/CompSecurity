// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


final class l extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    private static final l e[];

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/facebook/a/l, s);
    }

    public static l[] values()
    {
        return (l[])e.clone();
    }

    static 
    {
        a = new l("SUCCESS", 0);
        b = new l("SERVER_ERROR", 1);
        c = new l("NO_CONNECTIVITY", 2);
        d = new l("UNKNOWN_ERROR", 3);
        e = (new l[] {
            a, b, c, d
        });
    }
}
