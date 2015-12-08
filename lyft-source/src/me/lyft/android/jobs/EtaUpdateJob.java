// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.geo.IEtaRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRideDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.ride.RideTypeDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class EtaUpdateJob
    implements Job
{

    AppStateDTO currentAppState;
    IEtaRepository etaRepository;

    public EtaUpdateJob(AppStateDTO appstatedto)
    {
        currentAppState = appstatedto;
    }

    public void execute()
    {
        if (currentAppState != null)
        {
            Object obj = currentAppState.getRideTypes();
            if (obj != null)
            {
                RideTypeDTO ridetypedto;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); etaRepository.updateClosestDriverEtas(ridetypedto.getId(), ridetypedto.getClosestDriverEta()))
                {
                    ridetypedto = (RideTypeDTO)((Iterator) (obj)).next();
                }

            }
            obj = (RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance());
            if (obj != null)
            {
                etaRepository.updateEta(((RideDTO) (obj)).getEta());
                etaRepository.updateEtd(((RideDTO) (obj)).getEtd());
                return;
            }
        }
    }
}
