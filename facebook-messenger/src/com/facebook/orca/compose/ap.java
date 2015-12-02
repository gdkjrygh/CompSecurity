// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


public final class ap extends Enum
{

    private static final ap $VALUES[];
    public static final ap EXPANDED;
    public static final ap SHRUNK;

    private ap(String s, int i)
    {
        super(s, i);
    }

    public static ap valueOf(String s)
    {
        return (ap)Enum.valueOf(com/facebook/orca/compose/ap, s);
    }

    public static ap[] values()
    {
        return (ap[])$VALUES.clone();
    }

    static 
    {
        EXPANDED = new ap("EXPANDED", 0);
        SHRUNK = new ap("SHRUNK", 1);
        $VALUES = (new ap[] {
            EXPANDED, SHRUNK
        });
    }
}
