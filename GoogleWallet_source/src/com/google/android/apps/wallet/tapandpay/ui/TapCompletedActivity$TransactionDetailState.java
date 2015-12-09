// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;


// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

static final class  extends Enum
{

    private static final DETAILS_DONE $VALUES[];
    public static final DETAILS_DONE DETAILS_DELAYED;
    public static final DETAILS_DONE DETAILS_DELAYED_LONGER;
    public static final DETAILS_DONE DETAILS_DONE;
    public static final DETAILS_DONE NOT_STARTED;
    public static final DETAILS_DONE REQUESTING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/tapandpay/ui/TapCompletedActivity$TransactionDetailState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_STARTED = new <init>("NOT_STARTED", 0);
        REQUESTING = new <init>("REQUESTING", 1);
        DETAILS_DELAYED = new <init>("DETAILS_DELAYED", 2);
        DETAILS_DELAYED_LONGER = new <init>("DETAILS_DELAYED_LONGER", 3);
        DETAILS_DONE = new <init>("DETAILS_DONE", 4);
        $VALUES = (new .VALUES[] {
            NOT_STARTED, REQUESTING, DETAILS_DELAYED, DETAILS_DELAYED_LONGER, DETAILS_DONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
