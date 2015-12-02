// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import com.google.common.base.Preconditions;

public final class aj extends Enum
{

    private static final aj $VALUES[];
    public static final aj Fling;
    public static final aj Idle;
    public static final aj Interactive;

    private aj(String s, int i)
    {
        super(s, i);
    }

    public static aj convertFromOrdinal(int i)
    {
        boolean flag;
        if (i >= 0 && i <= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        switch (i)
        {
        default:
            return Idle;

        case 0: // '\0'
            return Idle;

        case 1: // '\001'
            return Interactive;

        case 2: // '\002'
            return Fling;
        }
    }

    public static aj valueOf(String s)
    {
        return (aj)Enum.valueOf(com/facebook/reflex/aj, s);
    }

    public static aj[] values()
    {
        return (aj[])$VALUES.clone();
    }

    static 
    {
        Idle = new aj("Idle", 0);
        Interactive = new aj("Interactive", 1);
        Fling = new aj("Fling", 2);
        $VALUES = (new aj[] {
            Idle, Interactive, Fling
        });
    }
}
