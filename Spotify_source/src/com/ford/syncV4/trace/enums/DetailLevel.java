// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.trace.enums;


public final class DetailLevel extends Enum
{

    public static final DetailLevel a;
    public static final DetailLevel b;
    private static DetailLevel c;
    private static final DetailLevel d[];

    private DetailLevel(String s, int i)
    {
        super(s, i);
    }

    public static DetailLevel valueOf(String s)
    {
        return (DetailLevel)Enum.valueOf(com/ford/syncV4/trace/enums/DetailLevel, s);
    }

    public static DetailLevel[] values()
    {
        return (DetailLevel[])d.clone();
    }

    static 
    {
        a = new DetailLevel("OFF", 0);
        c = new DetailLevel("TERSE", 1);
        b = new DetailLevel("VERBOSE", 2);
        d = (new DetailLevel[] {
            a, c, b
        });
    }
}
