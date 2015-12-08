// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


final class CloudPinState extends Enum
{

    private static final CloudPinState $VALUES[];
    public static final CloudPinState ACTIVE;
    public static final CloudPinState EXPIRED;
    public static final CloudPinState UNSET;

    private CloudPinState(String s, int i)
    {
        super(s, i);
    }

    public static CloudPinState valueOf(String s)
    {
        return (CloudPinState)Enum.valueOf(com/google/android/apps/wallet/pin/CloudPinState, s);
    }

    public static CloudPinState[] values()
    {
        return (CloudPinState[])$VALUES.clone();
    }

    static 
    {
        EXPIRED = new CloudPinState("EXPIRED", 0);
        ACTIVE = new CloudPinState("ACTIVE", 1);
        UNSET = new CloudPinState("UNSET", 2);
        $VALUES = (new CloudPinState[] {
            EXPIRED, ACTIVE, UNSET
        });
    }
}
