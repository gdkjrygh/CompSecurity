// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;


// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            LegacySetupNfcPaymentActivity

static final class  extends Enum
{

    private static final EXIT $VALUES[];
    public static final EXIT CONGRATS;
    public static final EXIT EXIT;
    public static final EXIT FUNDING;
    public static final EXIT WAITING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentActivity$NavState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FUNDING = new <init>("FUNDING", 0);
        WAITING = new <init>("WAITING", 1);
        CONGRATS = new <init>("CONGRATS", 2);
        EXIT = new <init>("EXIT", 3);
        $VALUES = (new .VALUES[] {
            FUNDING, WAITING, CONGRATS, EXIT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
