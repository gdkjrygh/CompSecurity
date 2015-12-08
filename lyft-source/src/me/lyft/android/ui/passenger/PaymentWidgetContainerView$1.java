// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.Collections;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

class this._cls0
    implements Func1
{

    final PaymentWidgetContainerView this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public List call(List list)
    {
        Object obj = userSession.getAppState();
        Location location = rideRequestSession.getDropoffLocation();
        Location location1 = LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(((AppStateDTO) (obj)).getMarkerDestination(), NullLocationDTO.getInstance()));
        Location location2 = rideRequestSession.getPickupLocation();
        obj = LocationMapper.fromLocationDTO((LocationDTO)Objects.firstNonNull(((AppStateDTO) (obj)).getMarker(), NullLocationDTO.getInstance()));
        boolean flag;
        if (location1.hasSameCoordinates(location) && ((Location) (obj)).hasSameCoordinates(location2))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return list;
        } else
        {
            return Collections.emptyList();
        }
    }

    TO()
    {
        this$0 = PaymentWidgetContainerView.this;
        super();
    }
}
