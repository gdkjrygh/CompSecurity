// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


public final class DeliveryMechanism extends Enum
{

    private static final DeliveryMechanism $VALUES[];
    public static final DeliveryMechanism APP_STORE;
    public static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
    public static final DeliveryMechanism DEVELOPER;
    public static final DeliveryMechanism TEST_DISTRIBUTION;
    public static final DeliveryMechanism USER_SIDELOAD;
    private final int id;

    private DeliveryMechanism(String s, int i, int j)
    {
        super(s, i);
        id = j;
    }

    public static DeliveryMechanism determineFrom(String s)
    {
        if ("io.crash.air".equals(s))
        {
            return TEST_DISTRIBUTION;
        }
        if (s != null)
        {
            return APP_STORE;
        } else
        {
            return DEVELOPER;
        }
    }

    public static DeliveryMechanism valueOf(String s)
    {
        return (DeliveryMechanism)Enum.valueOf(io/fabric/sdk/android/services/common/DeliveryMechanism, s);
    }

    public static DeliveryMechanism[] values()
    {
        return (DeliveryMechanism[])$VALUES.clone();
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return Integer.toString(id);
    }

    static 
    {
        DEVELOPER = new DeliveryMechanism("DEVELOPER", 0, 1);
        USER_SIDELOAD = new DeliveryMechanism("USER_SIDELOAD", 1, 2);
        TEST_DISTRIBUTION = new DeliveryMechanism("TEST_DISTRIBUTION", 2, 3);
        APP_STORE = new DeliveryMechanism("APP_STORE", 3, 4);
        $VALUES = (new DeliveryMechanism[] {
            DEVELOPER, USER_SIDELOAD, TEST_DISTRIBUTION, APP_STORE
        });
    }
}
