// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.api;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

public class FundsTransferInfoEvent
{

    private final Throwable failureCause;
    private final ImmutableList fundingSourceInfos;
    private final com.google.wallet.proto.NanoWalletWobl.RenderOutput fundingSourceOverview;
    private final Optional maxTransferAmount;

    public FundsTransferInfoEvent(com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo afundingsourceinfo[], com.google.wallet.proto.NanoWalletWobl.RenderOutput renderoutput, com.google.wallet.proto.NanoWalletEntities.DisplayableMoney displayablemoney, Throwable throwable)
    {
        if (afundingsourceinfo == null)
        {
            afundingsourceinfo = ImmutableList.of();
        } else
        {
            afundingsourceinfo = ImmutableList.copyOf(afundingsourceinfo);
        }
        fundingSourceInfos = afundingsourceinfo;
        fundingSourceOverview = renderoutput;
        failureCause = throwable;
        maxTransferAmount = Optional.fromNullable(displayablemoney);
    }

    public final Throwable getFailureCause()
    {
        return failureCause;
    }

    public final ImmutableList getFundingSourceInfos()
    {
        return fundingSourceInfos;
    }

    public final com.google.wallet.proto.NanoWalletWobl.RenderOutput getFundingSourceOverview()
    {
        return fundingSourceOverview;
    }

    public final Optional getMaxTransferAmount()
    {
        return maxTransferAmount;
    }
}
