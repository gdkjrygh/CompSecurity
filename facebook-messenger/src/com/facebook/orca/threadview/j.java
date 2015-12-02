// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j DELIVEREE;
    public static final j READER;
    public static final j SENDER;

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/orca/threadview/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    static 
    {
        READER = new j("READER", 0);
        SENDER = new j("SENDER", 1);
        DELIVEREE = new j("DELIVEREE", 2);
        $VALUES = (new j[] {
            READER, SENDER, DELIVEREE
        });
    }
}
