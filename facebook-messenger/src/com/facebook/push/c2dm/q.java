// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;


public final class q extends Enum
{

    private static final q $VALUES[];
    public static final q CURRENT;
    public static final q EXPIRED;
    public static final q NONE;
    public static final q WRONG_TYPE;

    private q(String s, int i)
    {
        super(s, i);
    }

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/facebook/push/c2dm/q, s);
    }

    public static q[] values()
    {
        return (q[])$VALUES.clone();
    }

    static 
    {
        CURRENT = new q("CURRENT", 0);
        WRONG_TYPE = new q("WRONG_TYPE", 1);
        EXPIRED = new q("EXPIRED", 2);
        NONE = new q("NONE", 3);
        $VALUES = (new q[] {
            CURRENT, WRONG_TYPE, EXPIRED, NONE
        });
    }
}
