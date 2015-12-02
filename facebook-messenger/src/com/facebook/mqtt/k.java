// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;

import com.google.common.base.Preconditions;

final class k extends Enum
{

    private static final k $VALUES[];
    public static final k ACKNOWLEDGED_DELIVERY;
    private final byte mPosition;

    private k(String s, int i, int j)
    {
        boolean flag1 = true;
        super(s, i);
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Bit position too small.");
        if (j < 64)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Bit position too big.");
        mPosition = (byte)j;
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/mqtt/k, s);
    }

    public static k[] values()
    {
        return (k[])$VALUES.clone();
    }

    public byte getPosition()
    {
        return mPosition;
    }

    static 
    {
        ACKNOWLEDGED_DELIVERY = new k("ACKNOWLEDGED_DELIVERY", 0, 0);
        $VALUES = (new k[] {
            ACKNOWLEDGED_DELIVERY
        });
    }
}
