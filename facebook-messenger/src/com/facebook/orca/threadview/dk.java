// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


final class dk extends Enum
{

    private static final dk $VALUES[];
    public static final dk HIDE;
    public static final dk NONE;
    public static final dk REVEAL;

    private dk(String s, int i)
    {
        super(s, i);
    }

    public static dk valueOf(String s)
    {
        return (dk)Enum.valueOf(com/facebook/orca/threadview/dk, s);
    }

    public static dk[] values()
    {
        return (dk[])$VALUES.clone();
    }

    static 
    {
        NONE = new dk("NONE", 0);
        HIDE = new dk("HIDE", 1);
        REVEAL = new dk("REVEAL", 2);
        $VALUES = (new dk[] {
            NONE, HIDE, REVEAL
        });
    }
}
