// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.enums;

import android.text.TextUtils;

public final class PurchaseType extends Enum
{

    private static final PurchaseType $VALUES[];
    public static final PurchaseType CONSUMABLE;
    public static final PurchaseType SUBSCRIPTION;
    private static final String TINDER_TYPE_CONSUMABLE = "consumable";
    private static final String TINDER_TYPE_SUBSCRIPTION = "subscription";
    private String mType;

    private PurchaseType(String s, int i, String s1)
    {
        super(s, i);
        mType = s1;
    }

    public static PurchaseType getTypeFromSku(String s)
    {
        if (TextUtils.equals("consumable", s.split("_")[1]))
        {
            return CONSUMABLE;
        } else
        {
            return SUBSCRIPTION;
        }
    }

    public static boolean isConsumable(String s)
    {
        return TextUtils.equals(CONSUMABLE.toString(), s);
    }

    public static boolean isSubscription(String s)
    {
        return TextUtils.equals(SUBSCRIPTION.toString(), s);
    }

    public static PurchaseType valueOf(String s)
    {
        return (PurchaseType)Enum.valueOf(com/tinder/enums/PurchaseType, s);
    }

    public static PurchaseType[] values()
    {
        return (PurchaseType[])$VALUES.clone();
    }

    public final String toString()
    {
        return mType;
    }

    static 
    {
        CONSUMABLE = new PurchaseType("CONSUMABLE", 0, "inapp");
        SUBSCRIPTION = new PurchaseType("SUBSCRIPTION", 1, "subs");
        $VALUES = (new PurchaseType[] {
            CONSUMABLE, SUBSCRIPTION
        });
    }
}
