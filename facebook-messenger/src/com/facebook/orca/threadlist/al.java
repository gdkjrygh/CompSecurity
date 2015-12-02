// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;


public final class al extends Enum
{

    private static final al $VALUES[];
    public static final al CHOOSE_DIALOG;
    public static final al NORMAL;

    private al(String s, int i)
    {
        super(s, i);
    }

    public static al valueOf(String s)
    {
        return (al)Enum.valueOf(com/facebook/orca/threadlist/al, s);
    }

    public static al[] values()
    {
        return (al[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new al("NORMAL", 0);
        CHOOSE_DIALOG = new al("CHOOSE_DIALOG", 1);
        $VALUES = (new al[] {
            NORMAL, CHOOSE_DIALOG
        });
    }
}
