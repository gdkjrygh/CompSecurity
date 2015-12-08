// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            ChangeOrSetPinActivity

static final class  extends Enum
{

    private static final WAITING $VALUES[];
    public static final WAITING CONFIRM_NEW_PIN;
    public static final WAITING ENTER_INITIAL_PIN;
    public static final WAITING ENTER_NEW_PIN;
    public static final WAITING VERIFY_CURRENT_PIN;
    public static final WAITING WAITING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/pin/ChangeOrSetPinActivity$DisplayState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VERIFY_CURRENT_PIN = new <init>("VERIFY_CURRENT_PIN", 0);
        ENTER_INITIAL_PIN = new <init>("ENTER_INITIAL_PIN", 1);
        ENTER_NEW_PIN = new <init>("ENTER_NEW_PIN", 2);
        CONFIRM_NEW_PIN = new <init>("CONFIRM_NEW_PIN", 3);
        WAITING = new <init>("WAITING", 4);
        $VALUES = (new .VALUES[] {
            VERIFY_CURRENT_PIN, ENTER_INITIAL_PIN, ENTER_NEW_PIN, CONFIRM_NEW_PIN, WAITING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
