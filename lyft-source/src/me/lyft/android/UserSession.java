// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import java.util.concurrent.atomic.AtomicLong;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Preconditions;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.infrastructure.ats.DriverApplicationDTO;
import me.lyft.android.infrastructure.ats.DriverApplicationDataDTO;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRideDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.jobs.AppInfoUpdateJob;
import me.lyft.android.jobs.CourierDriverRideUpdatedJob;
import me.lyft.android.jobs.DestinyUpdateJob;
import me.lyft.android.jobs.DriverCloseToCurrentStopJob;
import me.lyft.android.jobs.DriverDailyTotalsJob;
import me.lyft.android.jobs.DriverRideUpdateJob;
import me.lyft.android.jobs.EtaUpdateJob;
import me.lyft.android.jobs.GoogleNowAuthorizationJob;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.jobs.LyftTokenUpdateJob;
import me.lyft.android.jobs.PassengerRideUpdateJob;
import me.lyft.android.jobs.PollingRateChangedJob;
import me.lyft.android.jobs.PrefillLocationJob;
import me.lyft.android.jobs.RideAssignedJob;
import me.lyft.android.jobs.RideStatusChangedJob;
import me.lyft.android.jobs.RideTypesChangedJob;
import me.lyft.android.jobs.ThreatMetrixJob;
import me.lyft.android.jobs.UpdateGcmIdentifierJob;
import me.lyft.android.jobs.UpdateHotspotsJob;
import me.lyft.android.jobs.UpdatePreRideInfoJob;
import me.lyft.android.jobs.UpdateRideFareJob;
import me.lyft.android.jobs.UpdateSplitFareJob;
import me.lyft.android.jobs.UpdateSplitFareStateJob;
import me.lyft.android.jobs.UpdateSystemJob;
import me.lyft.android.jobs.UserModeChangeJob;
import me.lyft.android.jobs.UserUpdateJob;
import me.lyft.android.logging.L;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android:
//            IUserSession, ILyftPreferences

class UserSession
    implements IUserSession
{

    private final Object appStateChangeLock = new Object();
    private final MessageBus bus;
    private AppStateDTO currentAppState;
    AtomicLong currentTimestamp;
    private DriverApplicationDTO driverApplication;
    private DriverApplicationDataDTO driverApplicationData;
    private final JobManager jobManager;
    private final ILyftPreferences preferences;

    public UserSession(MessageBus messagebus, ILyftPreferences ilyftpreferences, JobManager jobmanager)
    {
        currentTimestamp = new AtomicLong(-1L);
        preferences = ilyftpreferences;
        bus = messagebus;
        jobManager = jobmanager;
        setAppState(ilyftpreferences.getLastCachedAppState());
    }

    private boolean shouldRejectAppState(AppStateDTO appstatedto)
    {
        long l = ((Long)Objects.firstNonNull(appstatedto.getPreTimestamp(), Objects.firstNonNull(appstatedto.getTimestamp(), Long.valueOf(0L)))).longValue();
        long l1 = currentTimestamp.get();
        boolean flag;
        if (l <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            L.w(new IllegalStateException("AppState was rejected due stale timestamp."), "AppState was rejected (pre=%s|ts=%s) <= current=%s", new Object[] {
                appstatedto.getPreTimestamp(), Objects.firstNonNull(appstatedto.getTimestamp(), Long.valueOf(0L)), Long.valueOf(l1)
            });
            return flag;
        } else
        {
            currentTimestamp.set(((Long)Objects.firstNonNull(appstatedto.getTimestamp(), Long.valueOf(0L))).longValue());
            return flag;
        }
    }

    public AppStateDTO getAppState()
    {
        return currentAppState;
    }

    public DriverApplicationDTO getDriverApplication()
    {
        return (DriverApplicationDTO)Objects.firstNonNull(driverApplication, DriverApplicationDTO.empty());
    }

    public DriverApplicationDataDTO getDriverApplicationData()
    {
        return driverApplicationData;
    }

    public RideDTO getRide()
    {
        return getAppState().getRide();
    }

    public UserDTO getUser()
    {
        return (UserDTO)Objects.firstNonNull(getAppState().getUser(), NullUserDTO.getInstance());
    }

    public void resetAppState()
    {
        currentAppState = new AppStateDTO(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        preferences.setLastCachedAppState(currentAppState);
        preferences.clearRideRequest();
    }

    boolean setAppState(AppStateDTO appstatedto)
    {
label0:
        {
            Preconditions.checkNotNull(appstatedto, "AppState cannot be null");
            synchronized (appStateChangeLock)
            {
                if (!shouldRejectAppState(appstatedto))
                {
                    break label0;
                }
            }
            return false;
        }
        AppStateDTO appstatedto1;
        UserDTO userdto;
        RideDTO ridedto;
        me.lyft.android.infrastructure.lyft.constants.AppInfo appinfo;
        if (currentAppState == null)
        {
            break MISSING_BLOCK_LABEL_681;
        }
        appstatedto1 = currentAppState;
        userdto = (UserDTO)Objects.firstNonNull(appstatedto1.getUser(), NullUserDTO.getInstance());
        ridedto = (RideDTO)Objects.firstNonNull(appstatedto1.getRide(), NullRideDTO.getInstance());
        currentAppState = appstatedto;
        appinfo = appstatedto.getAppInfo();
        if (appinfo == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        jobManager.queueImmediateJob(new AppInfoUpdateJob(appinfo));
        jobManager.queueImmediateJob(new UpdateSystemJob(currentAppState));
        if (userdto.isNull() && !((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).isNull())
        {
            jobManager.queueBackgroundJob(new ThreatMetrixJob((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())));
        }
        jobManager.queueImmediateJob(new LyftTokenUpdateJob(((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).getLyftToken()));
        jobManager.queueImmediateJob(new RideAssignedJob(ridedto, (RideDTO)Objects.firstNonNull(appstatedto.getRide(), NullRideDTO.getInstance())));
        jobManager.queueImmediateJob(new RideTypesChangedJob(appstatedto));
        jobManager.queueImmediateJob(new UserModeChangeJob(appstatedto1, currentAppState));
        jobManager.queueImmediateJob(new RideStatusChangedJob(appstatedto1, appstatedto));
        jobManager.queueImmediateJob(new CourierDriverRideUpdatedJob(appstatedto1, appstatedto));
        jobManager.queueBackgroundJob(new UpdateGcmIdentifierJob(getUser()));
        jobManager.queueBackgroundJob(new PollingRateChangedJob((Long)Objects.firstNonNull(((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).getPollingRate(), Long.valueOf(UserDTO.DEFAULT_POLLING_RATE))));
        jobManager.queueImmediateJob(new UpdatePreRideInfoJob(appstatedto));
        jobManager.queueImmediateJob(new UpdateHotspotsJob(appstatedto));
        jobManager.queueBackgroundJob(new UpdateRideFareJob((RideDTO)Objects.firstNonNull(appstatedto.getRide(), NullRideDTO.getInstance())));
        jobManager.queueBackgroundJob(new UpdateSplitFareJob(appstatedto));
        jobManager.queueBackgroundJob(new UpdateSplitFareStateJob((RideDTO)Objects.firstNonNull(appstatedto.getRide(), NullRideDTO.getInstance())));
        jobManager.queueBackgroundJob(new GoogleNowAuthorizationJob((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())));
_L1:
        jobManager.queueImmediateJob(new PrefillLocationJob(currentAppState.getPrefillLocations()));
        jobManager.queueImmediateJob(new UserUpdateJob(currentAppState));
        jobManager.queueImmediateJob(new DriverRideUpdateJob(currentAppState));
        jobManager.queueImmediateJob(new PassengerRideUpdateJob(currentAppState));
        jobManager.queueImmediateJob(new DestinyUpdateJob(currentAppState));
        jobManager.queueImmediateJob(new DriverDailyTotalsJob(currentAppState));
        jobManager.queueImmediateJob(new EtaUpdateJob(currentAppState));
        if ("driver".equalsIgnoreCase(getUser().getMode()))
        {
            jobManager.queueBackgroundJob(new DriverCloseToCurrentStopJob());
        }
        bus.post(me/lyft/android/events/AppStateUpdatedEvent, currentAppState);
        preferences.setLastCachedAppState(currentAppState);
        obj;
        JVM INSTR monitorexit ;
        return true;
        appstatedto;
        obj;
        JVM INSTR monitorexit ;
        throw appstatedto;
        currentAppState = appstatedto;
          goto _L1
    }

    public void setDriverApplication(DriverApplicationDTO driverapplicationdto)
    {
        driverApplication = driverapplicationdto;
    }

    public void setDriverApplicationData(DriverApplicationDataDTO driverapplicationdatadto)
    {
        driverApplicationData = driverapplicationdatadto;
    }
}
