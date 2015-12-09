// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic.api;


// Referenced classes of package com.google.android.apps.wallet.plastic.api:
//            PlasticCard

public static final class  extends Enum
{

    private static final SUSPENDED $VALUES[];
    public static final SUSPENDED ACTIVATED;
    public static final SUSPENDED CANCELED;
    public static final SUSPENDED LOCKED;
    public static final SUSPENDED NOT_REQUESTED;
    public static final SUSPENDED REQUESTED;
    public static final SUSPENDED SUSPENDED;
    public static final SUSPENDED UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/plastic/api/PlasticCard$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        NOT_REQUESTED = new <init>("NOT_REQUESTED", 1);
        REQUESTED = new <init>("REQUESTED", 2);
        ACTIVATED = new <init>("ACTIVATED", 3);
        LOCKED = new <init>("LOCKED", 4);
        CANCELED = new <init>("CANCELED", 5);
        SUSPENDED = new <init>("SUSPENDED", 6);
        $VALUES = (new .VALUES[] {
            UNKNOWN, NOT_REQUESTED, REQUESTED, ACTIVATED, LOCKED, CANCELED, SUSPENDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
