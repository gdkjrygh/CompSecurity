// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            VerifyCloudPinActivity

static final class  extends Enum
{

    private static final WAITING $VALUES[];
    public static final WAITING VERIFY_CURRENT_PIN;
    public static final WAITING WAITING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/pin/VerifyCloudPinActivity$DisplayState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VERIFY_CURRENT_PIN = new <init>("VERIFY_CURRENT_PIN", 0);
        WAITING = new <init>("WAITING", 1);
        $VALUES = (new .VALUES[] {
            VERIFY_CURRENT_PIN, WAITING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
