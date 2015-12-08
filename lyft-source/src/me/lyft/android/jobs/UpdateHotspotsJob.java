// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.ride.IHotspotRepository;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.ride.PreRideInfoDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateHotspotsJob
    implements Job
{

    AppStateDTO appState;
    IHotspotRepository hotspotRepository;

    public UpdateHotspotsJob(AppStateDTO appstatedto)
    {
        appState = appstatedto;
    }

    public void execute()
    {
        if (appState.getPreRideInfo() != null && appState.getPreRideInfo().hotspotLocations != null)
        {
            Object obj = appState.getPreRideInfo().hotspotLocations;
            ArrayList arraylist = new ArrayList();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(LocationMapper.fromLocationDTO((LocationDTO)((Iterator) (obj)).next()))) { }
            hotspotRepository.update(arraylist);
        }
    }
}
