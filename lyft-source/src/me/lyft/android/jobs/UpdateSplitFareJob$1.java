// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.infrastructure.lyft.faresplit.ContributorRequestDTO;
import me.lyft.android.infrastructure.lyft.faresplit.ContributorStatus;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.jobs:
//            UpdateSplitFareJob

final class lit.ContributorRequestDTO
    implements Func1
{

    public Boolean call(ContributorRequestDTO contributorrequestdto)
    {
        boolean flag;
        if (contributorrequestdto.status == ContributorStatus.PENDING)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((ContributorRequestDTO)obj);
    }

    lit.ContributorRequestDTO()
    {
    }
}
