// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.api;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.funding.api:
//            FundingSource

public final class FeeDescriber
{

    private final Map instrumentFeeDescriptionMap = Maps.newHashMap();

    public FeeDescriber(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo fundingsourceinfo = (com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo)list.next();
            String as[] = fundingsourceinfo.instrumentSubIds;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                instrumentFeeDescriptionMap.put(s, fundingsourceinfo);
                i++;
            }
        }

    }

    private com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo getFundingSourceInfo(FundingSource fundingsource)
    {
        return (com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo)instrumentFeeDescriptionMap.get(fundingsource.getCdpId());
    }

    public final String getListDescription(FundingSource fundingsource)
    {
        fundingsource = getFundingSourceInfo(fundingsource);
        if (fundingsource == null)
        {
            return null;
        } else
        {
            return ((com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo) (fundingsource)).inlineDescription.listDescriptionText;
        }
    }

    public final boolean isFree(FundingSource fundingsource)
    {
        fundingsource = getFundingSourceInfo(fundingsource);
        if (fundingsource == null)
        {
            return false;
        } else
        {
            return ((com.google.wallet.proto.NanoWalletEntities.FundingSourceInfo) (fundingsource)).isFree.booleanValue();
        }
    }
}
