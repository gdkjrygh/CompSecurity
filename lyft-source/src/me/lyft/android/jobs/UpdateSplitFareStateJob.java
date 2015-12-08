// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.infrastructure.lyft.faresplit.ContributorDTO;
import me.lyft.android.infrastructure.lyft.faresplit.ContributorStatus;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.ui.splitfare.SearchHelper;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateSplitFareStateJob
    implements Job
{

    final RideDTO ride;
    ISplitFareService splitFareService;
    ISplitFareStateRepository splitFareStateRepository;

    public UpdateSplitFareStateJob(RideDTO ridedto)
    {
        ride = ridedto;
    }

    static int countAccepted(List list)
    {
        list = list.iterator();
        int i = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (((ContributorDTO)list.next()).status == ContributorStatus.ACCEPTED)
            {
                i++;
            }
        } while (true);
        return i;
    }

    private List normalizeNumbers(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ContributorDTO contributordto = (ContributorDTO)list.next();
            if (!Strings.isNullOrEmpty(contributordto.phone))
            {
                String s = SearchHelper.normalizeNumber(contributordto.phone);
                arraylist.add(s);
                if (Strings.isNullOrEmpty(contributordto.name))
                {
                    splitFareService.addUnknownPhoneNumber(s);
                }
            }
        } while (true);
        return arraylist;
    }

    public void execute()
    {
        Object obj = (List)Objects.firstNonNull(ride.getSplitFareContributors(), Collections.emptyList());
        obj = new SplitFareState(countAccepted(((List) (obj))), normalizeNumbers(((List) (obj))));
        splitFareStateRepository.update(((SplitFareState) (obj)));
    }
}
