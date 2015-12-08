// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, User, Domain

final class kgroundTask extends BackgroundTask
{

    final nArtifact val$artifact;

    public final void run()
    {
        if (val$artifact.getPin() != null)
        {
            ModelHelper.setPin(val$artifact.getPin());
        }
        if (val$artifact.getBoard() != null)
        {
            ModelHelper.setBoard(val$artifact.getBoard());
        }
        if (val$artifact.getRecommendationBoard() != null)
        {
            ModelHelper.setBoard(val$artifact.getRecommendationBoard());
        }
        if (val$artifact.getRecommendationPin() != null)
        {
            ModelHelper.setPin(val$artifact.getRecommendationPin());
        }
        if (val$artifact.getRecommendationInterest() != null)
        {
            ModelHelper.setInterest(val$artifact.getRecommendationInterest());
        }
        if (val$artifact.getUser() != null)
        {
            ModelHelper.setUser(val$artifact.getUser());
            if (val$artifact.getUser().getPartner() != null)
            {
                ModelHelper.setPartner(val$artifact.getUser().getPartner());
            }
        }
        if (val$artifact.getPromoterUser() != null)
        {
            ModelHelper.setUser(val$artifact.getPromoterUser());
            if (val$artifact.getPromoterUser().getPartner() != null)
            {
                ModelHelper.setPartner(val$artifact.getPromoterUser().getPartner());
            }
        }
        if (val$artifact.getViaUser() != null)
        {
            ModelHelper.setUser(val$artifact.getViaUser());
            if (val$artifact.getViaUser().getPartner() != null)
            {
                ModelHelper.setPartner(val$artifact.getViaUser().getPartner());
            }
        }
        if (val$artifact.getPlace() != null)
        {
            ModelHelper.setPlace(val$artifact.getPlace());
        }
        if (val$artifact.getDomainObj() != null)
        {
            ModelHelper.setDomain(val$artifact.getDomainObj());
            if (val$artifact.getDomainObj() != null)
            {
                ModelHelper.setUser(val$artifact.getDomainObj().getOfficialUser());
            }
        }
        if (val$artifact.getAggregatedPinData() != null)
        {
            ModelHelper.setAggregatedPinData(val$artifact.getAggregatedPinData());
        }
    }

    nArtifact()
    {
        val$artifact = nartifact;
        super();
    }
}
