// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.order;

import com.dominos.android.sdk.common.StringHelper;

public final class ServiceMethod extends Enum
{

    private static final ServiceMethod $VALUES[];
    public static final ServiceMethod CARRYOUT;
    public static final ServiceMethod DELIVERY;
    public static final ServiceMethod UNKNOWN;
    private final String name;

    private ServiceMethod(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static ServiceMethod fromString(String s)
    {
        if (StringHelper.equalsIgnoreCase(CARRYOUT.toString(), s) || StringHelper.equalsIgnoreCase("Carry-Out", s))
        {
            return CARRYOUT;
        }
        if (StringHelper.equalsIgnoreCase(DELIVERY.toString(), s))
        {
            return DELIVERY;
        } else
        {
            return UNKNOWN;
        }
    }

    public static ServiceMethod valueOf(String s)
    {
        return (ServiceMethod)Enum.valueOf(com/dominos/android/sdk/common/dom/order/ServiceMethod, s);
    }

    public static ServiceMethod[] values()
    {
        return (ServiceMethod[])$VALUES.clone();
    }

    public final String toString()
    {
        return name;
    }

    static 
    {
        CARRYOUT = new ServiceMethod("CARRYOUT", 0, "Carryout");
        DELIVERY = new ServiceMethod("DELIVERY", 1, "Delivery");
        UNKNOWN = new ServiceMethod("UNKNOWN", 2, "");
        $VALUES = (new ServiceMethod[] {
            CARRYOUT, DELIVERY, UNKNOWN
        });
    }
}
