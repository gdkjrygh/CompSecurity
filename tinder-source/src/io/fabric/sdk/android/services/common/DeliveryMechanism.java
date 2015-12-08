// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


public final class DeliveryMechanism extends Enum
{

    public static final DeliveryMechanism a;
    public static final DeliveryMechanism b;
    public static final DeliveryMechanism c;
    public static final DeliveryMechanism d;
    private static final DeliveryMechanism f[];
    public final int e;

    private DeliveryMechanism(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static DeliveryMechanism a(String s)
    {
        if ("io.crash.air".equals(s))
        {
            return c;
        }
        if (s != null)
        {
            return d;
        } else
        {
            return a;
        }
    }

    public static DeliveryMechanism valueOf(String s)
    {
        return (DeliveryMechanism)Enum.valueOf(io/fabric/sdk/android/services/common/DeliveryMechanism, s);
    }

    public static DeliveryMechanism[] values()
    {
        return (DeliveryMechanism[])f.clone();
    }

    public final String toString()
    {
        return Integer.toString(e);
    }

    static 
    {
        a = new DeliveryMechanism("DEVELOPER", 0, 1);
        b = new DeliveryMechanism("USER_SIDELOAD", 1, 2);
        c = new DeliveryMechanism("TEST_DISTRIBUTION", 2, 3);
        d = new DeliveryMechanism("APP_STORE", 3, 4);
        f = (new DeliveryMechanism[] {
            a, b, c, d
        });
    }
}
