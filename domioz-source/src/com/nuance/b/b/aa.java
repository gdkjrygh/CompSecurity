// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class aa extends Enum
{

    public static final aa a;
    public static final aa b;
    public static final aa c;
    private static final aa e[];
    private final String d;

    private aa(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(com/nuance/b/b/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])e.clone();
    }

    public final String toString()
    {
        return d;
    }

    static 
    {
        a = new aa("USER_INTERFACE", 0, "TOUCH");
        b = new aa("AGENCY_CODE", 1, "API");
        c = new aa("GLOBAL_COMMAND", 2, "GLOBALCOMMAND");
        e = (new aa[] {
            a, b, c
        });
    }
}
