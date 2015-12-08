// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.FareEstimate;
import me.lyft.android.domain.ride.FixedFareMapper;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ride.FareDTO;
import me.lyft.android.infrastructure.lyft.ride.FareEstimateDTO;
import me.lyft.android.infrastructure.lyft.ride.PreRideInfoDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdatePreRideInfoJob
    implements Job
{

    private AppStateDTO appState;
    IPreRideInfoRepository preRideInfoRepository;

    public UpdatePreRideInfoJob(AppStateDTO appstatedto)
    {
        appState = appstatedto;
    }

    private PreRideInfo createPreRideInfo()
    {
        PreRideInfoDTO prerideinfodto = appState.getPreRideInfo();
        if (prerideinfodto != null)
        {
            return new PreRideInfo(mapFares(prerideinfodto.fares), ((Boolean)Objects.firstNonNull(prerideinfodto.routeIsValid, Boolean.valueOf(true))).booleanValue(), prerideinfodto.errorMessage, mapFareEstimate(prerideinfodto.fareEstimate));
        } else
        {
            return PreRideInfo.empty();
        }
    }

    private FareEstimate mapFareEstimate(FareEstimateDTO fareestimatedto)
    {
        if (fareestimatedto == null)
        {
            return FareEstimate.empty();
        } else
        {
            return new FareEstimate(fareestimatedto.highMoney, fareestimatedto.lowMoney);
        }
    }

    private List mapFares(List list)
    {
        if (list == null)
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
            FareDTO faredto = (FareDTO)list.next();
            if ("courier".equalsIgnoreCase(faredto.fareType))
            {
                arraylist.add(FixedFareMapper.fromDTO(faredto));
            }
        } while (true);
        return arraylist;
    }

    public void execute()
    {
        preRideInfoRepository.update(createPreRideInfo());
    }
}
