// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.persistence.ISimpleStorage;
import me.lyft.android.rx.ReactiveProperty;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            IRequestRideTypeProvider

public class RequestRideTypeProvider
    implements IRequestRideTypeProvider
{

    public static final String RIDE_TYPES_KEY = "request_ride_types";
    private ReactiveProperty rideTypesObservable;
    private ISimpleStorage simpleStorage;

    public RequestRideTypeProvider(ISimpleStorage isimplestorage)
    {
        rideTypesObservable = ReactiveProperty.create();
        simpleStorage = isimplestorage;
        isimplestorage = (RideTypeList)isimplestorage.getOrDefault("request_ride_types", me/lyft/android/application/ride/RequestRideTypeProvider$RideTypeList, new RideTypeList());
        rideTypesObservable.onNext(isimplestorage);
    }

    public void clearDrivers()
    {
        for (Iterator iterator = ((List)rideTypesObservable.get()).iterator(); iterator.hasNext(); ((RequestRideType)iterator.next()).clearDrivers()) { }
    }

    public RequestRideType findRideTypeById(final String rideTypeId)
    {
        return (RequestRideType)Iterables.firstOrDefault(getRequestRideTypes(), new Func1() {

            final RequestRideTypeProvider this$0;
            final String val$rideTypeId;

            public Boolean call(RequestRideType requestridetype)
            {
                return Boolean.valueOf(requestridetype.getId().equalsIgnoreCase(rideTypeId));
            }

            public volatile Object call(Object obj)
            {
                return call((RequestRideType)obj);
            }

            
            {
                this$0 = RequestRideTypeProvider.this;
                rideTypeId = s;
                super();
            }
        }, RequestRideType.empty());
    }

    public RequestRideType getDefaultRideType()
    {
        for (Iterator iterator = ((List)rideTypesObservable.get()).iterator(); iterator.hasNext();)
        {
            RequestRideType requestridetype = (RequestRideType)iterator.next();
            if (requestridetype.isDefault().booleanValue())
            {
                return requestridetype;
            }
        }

        for (Iterator iterator1 = ((List)rideTypesObservable.get()).iterator(); iterator1.hasNext();)
        {
            RequestRideType requestridetype1 = (RequestRideType)iterator1.next();
            if (requestridetype1.isStandard())
            {
                return requestridetype1;
            }
        }

        return RequestRideType.empty();
    }

    public List getRequestRideTypes()
    {
        if (rideTypesObservable.get() == null)
        {
            return Collections.emptyList();
        } else
        {
            return (List)rideTypesObservable.get();
        }
    }

    public RequestRideType getRideTypeById(String s)
    {
        for (Iterator iterator = ((List)rideTypesObservable.get()).iterator(); iterator.hasNext();)
        {
            RequestRideType requestridetype = (RequestRideType)iterator.next();
            if (requestridetype.getId().equals(s))
            {
                return requestridetype;
            }
        }

        return getDefaultRideType();
    }

    public Observable observeRideTypes()
    {
        return rideTypesObservable.asObservable();
    }

    public void updateRideTypes(List list)
    {
        rideTypesObservable.onNext(list);
        simpleStorage.put("request_ride_types", list);
    }

    private class RideTypeList extends ArrayList
    {

        public RideTypeList()
        {
        }
    }

}
