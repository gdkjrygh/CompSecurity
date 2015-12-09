// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;


// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            TosAcceptanceCheckFilter

static final class detailsId extends Enum
{

    private static final ACCEPTANCE_FAILED $VALUES[];
    public static final ACCEPTANCE_FAILED ACCEPTANCE_FAILED;
    public static final ACCEPTANCE_FAILED NO_NETWORK;
    public static final ACCEPTANCE_FAILED SUCCESS;
    private final int detailsId;
    private final int titleId;

    public static detailsId valueOf(String s)
    {
        return (detailsId)Enum.valueOf(com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter$AcceptTosResult, s);
    }

    public static detailsId[] values()
    {
        return (detailsId[])$VALUES.clone();
    }

    public final int getDetailsId()
    {
        return detailsId;
    }

    public final int getTitleId()
    {
        return titleId;
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0, 0, 0);
        NO_NETWORK = new <init>("NO_NETWORK", 1, com.google.android.apps.walletnfcrel.ult, com.google.android.apps.walletnfcrel.ult);
        ACCEPTANCE_FAILED = new <init>("ACCEPTANCE_FAILED", 2, com.google.android.apps.walletnfcrel.ult, com.google.android.apps.walletnfcrel.ult);
        $VALUES = (new .VALUES[] {
            SUCCESS, NO_NETWORK, ACCEPTANCE_FAILED
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        titleId = j;
        detailsId = k;
    }
}
