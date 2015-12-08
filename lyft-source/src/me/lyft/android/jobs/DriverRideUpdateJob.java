// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.DriverRideMapper;
import me.lyft.android.domain.ride.Route;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.utils.TextToSpeech;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class DriverRideUpdateJob
    implements Job
{

    AppStateDTO appStateDTO;
    LyftApplication application;
    DialogFlow dialogFlow;
    IDriverRideProvider driverRideProvider;
    TextToSpeech textToSpeech;

    public DriverRideUpdateJob(AppStateDTO appstatedto)
    {
        appStateDTO = appstatedto;
    }

    private List getNewPassengers(DriverRide driverride, DriverRide driverride1)
    {
        if (driverride.isNull())
        {
            return Collections.emptyList();
        }
        driverride = driverride.getQueuedRoutes();
        List list = driverride1.getQueuedRoutes();
        driverride1 = new ArrayList();
        for (driverride = Iterables.skip(list, driverride.size()).iterator(); driverride.hasNext(); driverride1.addAll(((Route)driverride.next()).getPassengers())) { }
        return driverride1;
    }

    private boolean isRideInProgress(RideDTO ridedto)
    {
        return ridedto != null && Arrays.asList(new String[] {
            "accepted", "approaching", "arrived", "pickedUp", "droppedOff"
        }).contains(ridedto.getStatus());
    }

    public void execute()
    {
        if (appStateDTO != null && "driver".equalsIgnoreCase(appStateDTO.getUser().getMode()))
        {
            Object obj1 = appStateDTO.getRide();
            if (isRideInProgress(((RideDTO) (obj1))))
            {
                driverRideProvider.setIgnoreRideId(null);
            }
            Object obj;
            if (obj1 != null)
            {
                obj = (String)Objects.firstNonNull(((RideDTO) (obj1)).id, "");
            } else
            {
                obj = "";
            }
            if (!Objects.equals(obj, driverRideProvider.getIgnoreRideId()))
            {
                obj = DriverRideMapper.createDriverRide(((RideDTO) (obj1)));
                obj1 = getNewPassengers(driverRideProvider.getDriverRide(), ((DriverRide) (obj)));
                if (!((List) (obj1)).isEmpty())
                {
                    String s = application.getResources().getQuantityString(0x7f0f0004, ((List) (obj1)).size());
                    textToSpeech.speak(String.format(s, new Object[] {
                        Integer.valueOf(((List) (obj1)).size())
                    }));
                    dialogFlow.show(new me.lyft.android.ui.driver.DriverDialogs.QueuedRideDialog(((List) (obj1))));
                }
                driverRideProvider.updateRide(((DriverRide) (obj)));
                return;
            }
        }
    }
}
