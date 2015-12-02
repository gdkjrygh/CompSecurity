// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


public final class ca extends Enum
{

    private static final ca $VALUES[];
    public static final ca CONTACTCARD;
    public static final ca GROUP_CONTACTCARD;
    public static final ca MAP;
    public static final ca MESSAGES;

    private ca(String s, int i)
    {
        super(s, i);
    }

    public static ca valueOf(String s)
    {
        return (ca)Enum.valueOf(com/facebook/orca/threadview/ca, s);
    }

    public static ca[] values()
    {
        return (ca[])$VALUES.clone();
    }

    static 
    {
        MESSAGES = new ca("MESSAGES", 0);
        GROUP_CONTACTCARD = new ca("GROUP_CONTACTCARD", 1);
        CONTACTCARD = new ca("CONTACTCARD", 2);
        MAP = new ca("MAP", 3);
        $VALUES = (new ca[] {
            MESSAGES, GROUP_CONTACTCARD, CONTACTCARD, MAP
        });
    }
}
