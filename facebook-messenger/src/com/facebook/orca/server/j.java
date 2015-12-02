// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j QUERY;
    public static final j TOP_RANKED;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/orca/server/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        TOP_RANKED = new j("TOP_RANKED", 0);
        QUERY = new j("QUERY", 1);
        $VALUES = (new j[] {
            TOP_RANKED, QUERY
        });
    }
}
