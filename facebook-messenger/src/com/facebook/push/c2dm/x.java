// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;


public final class x extends Enum
{

    private static final x $VALUES[];
    public static final x CURRENT;
    public static final x EXPIRED;
    public static final x NONE;
    public static final x WRONG_USER;

    private x(String s, int i)
    {
        super(s, i);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/facebook/push/c2dm/x, s);
    }

    public static x[] values()
    {
        return (x[])$VALUES.clone();
    }

    static 
    {
        CURRENT = new x("CURRENT", 0);
        EXPIRED = new x("EXPIRED", 1);
        WRONG_USER = new x("WRONG_USER", 2);
        NONE = new x("NONE", 3);
        $VALUES = (new x[] {
            CURRENT, EXPIRED, WRONG_USER, NONE
        });
    }
}
