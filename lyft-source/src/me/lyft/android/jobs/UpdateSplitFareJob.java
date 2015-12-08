// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.splitfare.SplitFareRequest;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.faresplit.ContributorRequestDTO;
import me.lyft.android.infrastructure.lyft.faresplit.ContributorStatus;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateSplitFareJob
    implements Job
{

    AppStateDTO appState;
    ISplitFareRequestRepository splitFareRequestRepository;

    public UpdateSplitFareJob(AppStateDTO appstatedto)
    {
        appState = appstatedto;
    }

    static SplitFareRequest resolveSplitFareRequest(List list)
    {
        list = (ContributorRequestDTO)Iterables.firstOrDefault(list, new Func1() {

            public Boolean call(ContributorRequestDTO contributorrequestdto)
            {
                boolean flag1;
                if (contributorrequestdto.status == ContributorStatus.PENDING)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                return Boolean.valueOf(flag1);
            }

            public volatile Object call(Object obj)
            {
                return call((ContributorRequestDTO)obj);
            }

        }, null);
        if (list == null)
        {
            return SplitFareRequest.empty();
        }
        String s = ((ContributorRequestDTO) (list)).id;
        String s1 = ((ContributorRequestDTO) (list)).initiatorName;
        String s2 = ((ContributorRequestDTO) (list)).initiatorPhoto;
        boolean flag;
        if (((ContributorRequestDTO) (list)).status == ContributorStatus.PENDING)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new SplitFareRequest(s, s1, s2, flag);
    }

    public void execute()
    {
        SplitFareRequest splitfarerequest = resolveSplitFareRequest((List)Objects.firstNonNull(appState.getContributorRequests(), Collections.emptyList()));
        splitFareRequestRepository.update(splitfarerequest);
    }
}
