// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycUserEvent

public final class KycWalletBalanceUserEvent
    implements KycUserEvent
{

    public KycWalletBalanceUserEvent()
    {
    }

    public final int getFailureUserEventType()
    {
        return 273;
    }

    public final int getStartedOowUserEventType()
    {
        return 270;
    }

    public final int getStartedUserEventType()
    {
        return 269;
    }

    public final int getSuccessOowUserEventType()
    {
        return 272;
    }

    public final int getSuccessUserEventType()
    {
        return 271;
    }

    public final int getUserEventContextType()
    {
        return 47;
    }
}
