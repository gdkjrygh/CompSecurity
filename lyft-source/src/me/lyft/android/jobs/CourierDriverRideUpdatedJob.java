// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import android.content.res.Resources;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.RideFlags;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRideDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRouteDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.ride.RouteDTO;
import me.lyft.android.infrastructure.lyft.ride.StopDTO;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.TextToSpeech;
import me.lyft.android.utils.Vibrator;
import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class CourierDriverRideUpdatedJob
    implements Job
{

    IAppForegroundDetector appForegroundDetector;
    LyftApplication application;
    private final AppStateDTO currentAppState;
    ILyftPreferences lyftPreferences;
    Navigator navigator;
    private final AppStateDTO previousAppState;
    TextToSpeech textToSpeech;
    Vibrator vibrator;

    public CourierDriverRideUpdatedJob(AppStateDTO appstatedto, AppStateDTO appstatedto1)
    {
        previousAppState = appstatedto;
        currentAppState = appstatedto1;
    }

    private StopDTO getCurrentStop(RouteDTO routedto)
    {
        for (routedto = ((List)Objects.firstNonNull(routedto.getStops(), Collections.EMPTY_LIST)).iterator(); routedto.hasNext();)
        {
            StopDTO stopdto = (StopDTO)routedto.next();
            if (!((Boolean)Objects.firstNonNull(stopdto.getCompleted(), Boolean.valueOf(false))).booleanValue())
            {
                return stopdto;
            }
        }

        return new StopDTO(null, null, null, null, null, null, null);
    }

    private Set getPassengerIds(List list)
    {
        return (Set)Iterables.aggregate(Iterables.select(list, new Func1() {

            final CourierDriverRideUpdatedJob this$0;

            public volatile Object call(Object obj)
            {
                return call((UserDTO)obj);
            }

            public String call(UserDTO userdto)
            {
                return userdto.getId();
            }

            
            {
                this$0 = CourierDriverRideUpdatedJob.this;
                super();
            }
        }), new HashSet(), new Func2() {

            final CourierDriverRideUpdatedJob this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((HashSet)obj, (String)obj1);
            }

            public HashSet call(HashSet hashset, String s)
            {
                hashset.add(s);
                return hashset;
            }

            
            {
                this$0 = CourierDriverRideUpdatedJob.this;
                super();
            }
        });
    }

    private boolean isNewPassengerAdded()
    {
        RouteDTO routedto = (RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(previousAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance());
        Set set = getPassengerIds((List)Objects.firstNonNull(routedto.getPassengers(), Collections.EMPTY_LIST));
        Set set1 = getPassengerIds((List)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance())).getPassengers(), Collections.EMPTY_LIST));
        return !routedto.isNull() && set.size() < set1.size();
    }

    private void setRideFlags()
    {
        RideFlags rideflags = lyftPreferences.getRideFlags();
        if ("courier".equalsIgnoreCase(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getRideTypeId()) ? "accepted".equalsIgnoreCase(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getStatus()) || "approaching".equalsIgnoreCase(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getStatus()) || "arrived".equalsIgnoreCase(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getStatus()) : "accepted".equalsIgnoreCase(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getStatus()) || "approaching".equalsIgnoreCase(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getStatus()))
        {
            rideflags.setPickupMessageShown(true);
        } else
        {
            rideflags.setDropoffMessageShown(true);
        }
        lyftPreferences.setRideFlags(rideflags);
    }

    private boolean shouldDisplayCourierRouteChanged()
    {
        RideDTO ridedto = (RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance());
        UserDTO userdto = (UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance());
        return "courier".equalsIgnoreCase(ridedto.getRideTypeId()) && Arrays.asList(new String[] {
            "accepted", "approaching", "arrived", "pickedUp", "droppedOff"
        }).contains(ridedto.getStatus()) && (!userdto.getId().equalsIgnoreCase(ridedto.getActor()) && shouldReroute());
    }

    private boolean shouldReroute()
    {
        StopDTO stopdto = getCurrentStop((RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(previousAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance()));
        StopDTO stopdto1 = getCurrentStop((RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance()));
        Set set = getPassengerIds((List)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(previousAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance())).getPassengers(), Collections.EMPTY_LIST));
        Set set1 = getPassengerIds((List)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance())).getPassengers(), Collections.EMPTY_LIST));
        return !Objects.equals(stopdto, stopdto1) && !Objects.equals(set, set1);
    }

    public void execute()
    {
        if ("driver".equalsIgnoreCase(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getMode())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!shouldDisplayCourierRouteChanged())
        {
            continue; /* Loop/switch isn't completed */
        }
        vibrator.vibrate(0, 250L, new Long[] {
            Long.valueOf(250L), Long.valueOf(250L), Long.valueOf(1000L)
        });
        DriverAnalytics.trackDriverReroute();
        if (appForegroundDetector.isForegrounded()) goto _L1; else goto _L3
_L3:
        setRideFlags();
        textToSpeech.speak(application.getResources().getString(0x7f0701c4));
        me.lyft.android.domain.location.Location location = LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(getCurrentStop((RouteDTO)Objects.firstNonNull(((RideDTO)Objects.firstNonNull(currentAppState.getRide(), NullRideDTO.getInstance())).getRoute(), NullRouteDTO.getInstance())).getLocation(), NullLocationDTO.getInstance()));
        navigator.navigate(location);
        return;
        if (!isNewPassengerAdded()) goto _L1; else goto _L4
_L4:
        vibrator.vibrate(0, 250L, new Long[] {
            Long.valueOf(250L), Long.valueOf(250L), Long.valueOf(1000L)
        });
        textToSpeech.speak(application.getResources().getString(0x7f0701c3));
        return;
    }
}
