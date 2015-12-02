// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


public final class ax extends Enum
{

    private static final ax $VALUES[];
    public static final ax CHANGE;
    public static final ax NO_CHANGE;

    private ax(String s, int i)
    {
        super(s, i);
    }

    public static ax valueOf(String s)
    {
        return (ax)Enum.valueOf(com/facebook/orca/threadview/ax, s);
    }

    public static ax[] values()
    {
        return (ax[])$VALUES.clone();
    }

    static 
    {
        CHANGE = new ax("CHANGE", 0);
        NO_CHANGE = new ax("NO_CHANGE", 1);
        $VALUES = (new ax[] {
            CHANGE, NO_CHANGE
        });
    }
}
