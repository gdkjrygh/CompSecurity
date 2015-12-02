// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c IS_NOT_SESSIONLESS;
    public static final c IS_SESSIONLESS;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/f/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        IS_SESSIONLESS = new c("IS_SESSIONLESS", 0);
        IS_NOT_SESSIONLESS = new c("IS_NOT_SESSIONLESS", 1);
        $VALUES = (new c[] {
            IS_SESSIONLESS, IS_NOT_SESSIONLESS
        });
    }
}
