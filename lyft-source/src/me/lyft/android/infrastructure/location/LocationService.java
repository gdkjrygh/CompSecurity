// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import android.content.Context;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            ILocationService, LastKnownLocationOnSubscribe, BackgroundLocationUpdatesOnSubscribe, LocationUpdatesOnSubscribe

public class LocationService
    implements ILocationService
{

    private Context context;
    private Location lastCachedLocation;
    private PublishSubject passiveLocationUpdatesSubject;

    public LocationService(Context context1)
    {
        lastCachedLocation = NullLocation.getInstance();
        passiveLocationUpdatesSubject = PublishSubject.create();
        context = context1;
    }

    public Location getLastCachedLocation()
    {
        return lastCachedLocation;
    }

    public Observable getLastLocation()
    {
        return Observable.create(new LastKnownLocationOnSubscribe(context)).doOnNext(new Action1() {

            final LocationService this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                lastCachedLocation = location;
            }

            
            {
                this$0 = LocationService.this;
                super();
            }
        });
    }

    public Observable observeBackgroundLocationUpdates()
    {
        return Observable.create(new BackgroundLocationUpdatesOnSubscribe(context)).doOnNext(new Action1() {

            final LocationService this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                lastCachedLocation = location;
                passiveLocationUpdatesSubject.onNext(location);
            }

            
            {
                this$0 = LocationService.this;
                super();
            }
        });
    }

    public Observable observeLocationUpdates()
    {
        return Observable.create(new LocationUpdatesOnSubscribe(context)).doOnNext(new Action1() {

            final LocationService this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                lastCachedLocation = location;
                passiveLocationUpdatesSubject.onNext(location);
            }

            
            {
                this$0 = LocationService.this;
                super();
            }
        });
    }

    public Observable observePassiveLocationUpdates()
    {
        return passiveLocationUpdatesSubject.asObservable();
    }


/*
    static Location access$002(LocationService locationservice, Location location)
    {
        locationservice.lastCachedLocation = location;
        return location;
    }

*/

}
