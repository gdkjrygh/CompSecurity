// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.polling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.location.LocationHistory;
import me.lyft.android.infrastructure.lyft.polling.LocationUpdateRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.logging.L;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.application.polling:
//            ILocationUpdateService

public class LocationUpdateService
    implements ILocationUpdateService
{

    private static final long MAX_LOCATION_AGE;
    private static final int MAX_OUTDATED_LOCATION_COUNT = 30;
    private static final int MAX_STORED_LOCATION_SIZE = 240;
    private static final long MIN_LOCATION_TIME_UPDATE;
    private IAppForegroundDetector appForegroundDetector;
    private IConstantsProvider constantsProvider;
    private Location currentBestLocation;
    private IDevice device;
    private IEtaAnalyticService etaAnalyticService;
    private long lastTimeLocationUpdated;
    private ILocationService locationService;
    private LocationHistory locationsHistory;
    private ILyftApi lyftApi;
    private int outdatedLocationCount;
    private IRideRequestSession rideRequestSession;
    private IUserSession userSession;

    public LocationUpdateService(ILocationService ilocationservice, IUserSession iusersession, IAppForegroundDetector iappforegrounddetector, IRideRequestSession iriderequestsession, IEtaAnalyticService ietaanalyticservice, ILyftApi ilyftapi, IConstantsProvider iconstantsprovider, 
            IDevice idevice)
    {
        locationsHistory = new LocationHistory(240);
        outdatedLocationCount = 0;
        locationService = ilocationservice;
        userSession = iusersession;
        appForegroundDetector = iappforegrounddetector;
        rideRequestSession = iriderequestsession;
        etaAnalyticService = ietaanalyticservice;
        lyftApi = ilyftapi;
        constantsProvider = iconstantsprovider;
        device = idevice;
        lastTimeLocationUpdated = idevice.getElapsedRealtime();
    }

    private void checkCurrentLocationAge()
    {
        long l = device.getElapsedRealtime() - lastTimeLocationUpdated;
        if (l > MAX_LOCATION_AGE)
        {
            outdatedLocationCount = outdatedLocationCount + 1;
            boolean flag;
            if (userSession.getRide() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (outdatedLocationCount > 30 && flag)
            {
                L.w((new StringBuilder()).append("Location age:").append(l).toString(), new Object[0]);
                L.w((new StringBuilder()).append("Outdated location count:").append(outdatedLocationCount).toString(), new Object[0]);
                L.w((new StringBuilder()).append("Effected ride:").append(userSession.getRide().getId()).toString(), new Object[0]);
                L.w((new StringBuilder()).append("Effected ride status:").append(userSession.getRide().getStatus()).toString(), new Object[0]);
                L.e(new IllegalStateException("Max amount of outdated location updates exceeded"), "checkCurrentLocationAge", new Object[0]);
            }
            return;
        } else
        {
            outdatedLocationCount = 0;
            return;
        }
    }

    private String getClientRideId(RideDTO ridedto)
    {
        if (isRideActive(ridedto))
        {
            return (String)Objects.firstNonNull(ridedto.getId(), "");
        } else
        {
            return null;
        }
    }

    private String getRideTypeId(RideDTO ridedto)
    {
        if (isRideActive(ridedto))
        {
            return ridedto.getRideTypeId();
        } else
        {
            return rideRequestSession.getCurrentRideType().getId();
        }
    }

    private boolean isInDriverMode(UserDTO userdto)
    {
        return "driver".equalsIgnoreCase(userdto.getMode());
    }

    private boolean isRideActive(RideDTO ridedto)
    {
        return isRidePending(ridedto) || isRideInProgress(ridedto);
    }

    private boolean isRideInProgress(RideDTO ridedto)
    {
        return ridedto != null && Arrays.asList(new String[] {
            "accepted", "approaching", "arrived", "pickedUp", "droppedOff"
        }).contains(ridedto.getStatus());
    }

    private boolean isRidePending(RideDTO ridedto)
    {
        return ridedto != null && "pending".equalsIgnoreCase(ridedto.getStatus());
    }

    private boolean shouldIgnoreLocationUpdate(Location location, Location location1)
    {
        if (!location1.isNull())
        {
            if (location != null)
            {
                if (Math.abs(location.getTime().longValue() - location1.getTime().longValue()) >= MIN_LOCATION_TIME_UPDATE)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public void addLocationToHistory(Location location)
    {
        lastTimeLocationUpdated = device.getElapsedRealtime();
        if (!shouldIgnoreLocationUpdate(currentBestLocation, location))
        {
            currentBestLocation = location;
            if (isInDriverMode(userSession.getUser()))
            {
                location = LocationMapper.fromLocationDomain(location, userSession.getRide(), userSession.getUser(), appForegroundDetector.isForegrounded(), etaAnalyticService.getRecord());
                if (location != null)
                {
                    locationsHistory.add(location);
                }
            }
        }
    }

    public Observable updateBackgroundLocation(Location location)
    {
        location.setSource("significant_location_change_bg");
        location = LocationMapper.fromLocationDomain(location);
        return lyftApi.updateBgLocation(userSession.getUser().getId(), location);
    }

    public Observable updateLocation()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final LocationUpdateService this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    updateLocationSync();
                    subscriber.onNext(Unit.create());
                    subscriber.onCompleted();
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                this$0 = LocationUpdateService.this;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    public void updateLocationSync()
    {
        UserDTO userdto = userSession.getUser();
        RideDTO ridedto = userSession.getRide();
        if (Strings.isNullOrEmpty(userdto.getId()))
        {
            return;
        }
        Object obj = locationService.getLastCachedLocation();
        checkCurrentLocationAge();
        Object obj2 = LocationMapper.fromLocationDomain(((Location) (obj)), userSession.getRide(), userSession.getUser(), appForegroundDetector.isForegrounded(), etaAnalyticService.getRecord());
        obj = new ArrayList();
        Object obj1;
        if (isInDriverMode(userdto))
        {
            obj = locationsHistory.getCopy();
        } else
        if (obj2 != null)
        {
            ((List) (obj)).add(obj2);
        }
        if (((List) (obj)).isEmpty())
        {
            obj1 = null;
        } else
        {
            obj1 = obj;
        }
        obj1 = new LocationUpdateRequestDTO(null, null, ((List) (obj1)), getClientRideId(ridedto), constantsProvider.getAppInfoRevision(), getRideTypeId(ridedto));
        if (isInDriverMode(userdto))
        {
            if (!isRideInProgress(ridedto))
            {
                if (((List) (obj)).isEmpty())
                {
                    obj1 = null;
                } else
                {
                    obj1 = obj;
                }
                obj1 = new LocationUpdateRequestDTO(((me.lyft.android.infrastructure.lyft.location.LocationDTO) (obj2)), null, ((List) (obj1)), getClientRideId(ridedto), constantsProvider.getAppInfoRevision(), getRideTypeId(ridedto));
            }
        } else
        if (!isRideInProgress(ridedto))
        {
            obj1 = rideRequestSession.getPickupLocation();
            me.lyft.android.infrastructure.lyft.location.LocationDTO locationdto;
            if (((Location) (obj1)).isNull())
            {
                obj1 = obj2;
            } else
            {
                obj1 = LocationMapper.fromLocationDomain(((Location) (obj1)));
            }
            locationdto = LocationMapper.fromLocationDomain(rideRequestSession.getDropoffLocation());
            if (((List) (obj)).isEmpty())
            {
                obj2 = null;
            } else
            {
                obj2 = obj;
            }
            obj1 = new LocationUpdateRequestDTO(((me.lyft.android.infrastructure.lyft.location.LocationDTO) (obj1)), locationdto, ((List) (obj2)), getClientRideId(ridedto), constantsProvider.getAppInfoRevision(), getRideTypeId(ridedto));
        }
        lyftApi.updateLocationSync(userdto.getId(), ((LocationUpdateRequestDTO) (obj1)));
        locationsHistory.removeAll(((java.util.Collection) (obj)));
    }

    static 
    {
        MIN_LOCATION_TIME_UPDATE = TimeUnit.SECONDS.toMillis(1L);
        MAX_LOCATION_AGE = TimeUnit.MINUTES.toMillis(2L);
    }
}
