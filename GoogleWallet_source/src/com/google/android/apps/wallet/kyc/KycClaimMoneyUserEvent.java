// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycUserEvent

public final class KycClaimMoneyUserEvent
    implements KycUserEvent
{

    public KycClaimMoneyUserEvent()
    {
    }

    public final int getFailureUserEventType()
    {
        return 280;
    }

    public final int getStartedOowUserEventType()
    {
        return 277;
    }

    public final int getStartedUserEventType()
    {
        return 276;
    }

    public final int getSuccessOowUserEventType()
    {
        return 279;
    }

    public final int getSuccessUserEventType()
    {
        return 278;
    }

    public final int getUserEventContextType()
    {
        return 48;
    }
}
