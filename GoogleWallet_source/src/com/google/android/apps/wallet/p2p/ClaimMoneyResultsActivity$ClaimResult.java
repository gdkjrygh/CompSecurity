// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyResultsActivity

static final class requestedChallenge
{

    private final String amountClaimed;
    private final String amountFailedToClaim;
    private final com.google.wallet.proto.laimResult callError;
    private final List failedClaims;
    private final com.google.wallet.proto.api.Result requestedChallenge;






    (String s, String s1, List list, com.google.wallet.proto.laimResult laimresult, com.google.wallet.proto.api.Result result)
    {
        amountClaimed = s;
        amountFailedToClaim = s1;
        failedClaims = list;
        callError = laimresult;
        requestedChallenge = result;
    }
}
