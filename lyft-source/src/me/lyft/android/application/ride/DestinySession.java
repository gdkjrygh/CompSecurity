// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationComparator;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

// Referenced classes of package me.lyft.android.application.ride:
//            IDestinySession

public class DestinySession
    implements IDestinySession
{

    private static final float DEFAULT_ZOOM_LEVEL = 12F;
    private boolean isInDestinyEditMode;
    private ILocationService locationService;
    private ReactiveProperty locationSubject;
    private float zoomLevel;

    public DestinySession(ILocationService ilocationservice)
    {
        zoomLevel = 12F;
        locationService = ilocationservice;
        locationSubject = ReactiveProperty.create(NullLocation.getInstance()).setEqualityComparator(new LocationComparator());
    }

    public Location getLocation()
    {
        return (Location)locationSubject.get();
    }

    public float getZoomLevel()
    {
        return zoomLevel;
    }

    public boolean isDriverInDestinyMode()
    {
        return !getLocation().isNull();
    }

    public boolean isInDestinyEditMode()
    {
        return isInDestinyEditMode;
    }

    public Observable observeLocationChanges()
    {
        return locationSubject.asObservable();
    }

    public void restoreSession()
    {
        if (getLocation().isNull())
        {
            locationService.getLastLocation().subscribe(new SimpleSubscriber() {

                final DestinySession this$0;

                public volatile void onNext(Object obj)
                {
                    onNext((Location)obj);
                }

                public void onNext(Location location)
                {
                    super.onNext(location);
                    locationSubject.onNext(location);
                }

            
            {
                this$0 = DestinySession.this;
                super();
            }
            });
        }
    }

    public void setInDestinyEditMode(boolean flag)
    {
        isInDestinyEditMode = flag;
    }

    public void setLocation(Location location)
    {
        locationSubject.onNext(location);
    }

    public void setZoomLevel(float f)
    {
        zoomLevel = f;
    }

}
