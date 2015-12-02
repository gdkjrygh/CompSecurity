// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.presence;


public final class i extends Enum
{

    private static final i $VALUES[];
    public static final i NEARBY;
    public static final i NONE;
    public static final i ONLINE;
    public static final i PUSHABLE;

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/orca/presence/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        ONLINE = new i("ONLINE", 0);
        PUSHABLE = new i("PUSHABLE", 1);
        NEARBY = new i("NEARBY", 2);
        NONE = new i("NONE", 3);
        $VALUES = (new i[] {
            ONLINE, PUSHABLE, NEARBY, NONE
        });
    }
}
