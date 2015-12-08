// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.wearable.messages;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.location.NullLocationDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRouteDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.ride.RouteDTO;

public class WearableAppState
{

    private AppStateDTO appState;
    private Asset counterpartUserPhoto;
    private Asset counterpartVehiclePhoto;
    private Long driverEta;
    private Asset dropoffMapImage;
    private Asset pickupMapImage;

    public WearableAppState(AppStateDTO appstatedto)
    {
        appState = appstatedto;
    }

    public Asset getDropoffMapImage()
    {
        return dropoffMapImage;
    }

    public Asset getPickupMapImage()
    {
        return pickupMapImage;
    }

    public void setCounterpartUserPhoto(Asset asset)
    {
        counterpartUserPhoto = asset;
    }

    public void setCounterpartVehiclePhoto(Asset asset)
    {
        counterpartVehiclePhoto = asset;
    }

    public void setDriverEta(Long long1)
    {
        driverEta = long1;
    }

    public void setDropoffMapImage(Asset asset)
    {
        dropoffMapImage = asset;
    }

    public void setPickupMapImage(Asset asset)
    {
        pickupMapImage = asset;
    }

    public void writeToDataMap(DataMap datamap)
    {
        RideDTO ridedto = appState.getRide();
        if (ridedto != null)
        {
            Object obj = (UserDTO)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(ridedto.getRoute(), NullRouteDTO.getInstance())).getDriver(), NullUserDTO.getInstance());
            if (!((UserDTO) (obj)).isNull())
            {
                datamap.a("counterpart_first_name", ((UserDTO) (obj)).getFirstName());
                if (counterpartVehiclePhoto != null)
                {
                    datamap.a("counterpart_car_picture", counterpartVehiclePhoto);
                }
                if (counterpartUserPhoto != null)
                {
                    datamap.a("counterpart_user_photo", counterpartUserPhoto);
                }
                obj = ((UserDTO) (obj)).getDriverRating();
                if (obj != null)
                {
                    datamap.a("counterpart_driver_rating", ((Double) (obj)).doubleValue());
                }
                if (driverEta != null)
                {
                    datamap.a("driver_eta", driverEta.longValue());
                }
            }
            datamap.a("ride_start_location_address", (String)Objects.firstNonNull(((LocationDTO)Objects.firstNonNull(ridedto.getPickupLocation(), NullLocationDTO.getInstance())).getAddress(), ""));
            datamap.a("formatted_ride_total", MoneyMapper.fromMoneyDTO(ridedto.getTotalMoney()).format());
            datamap.a("ride_status", ridedto.getStatus());
            if (pickupMapImage != null)
            {
                datamap.a("pickup_map_image", pickupMapImage);
            }
            if (dropoffMapImage != null)
            {
                datamap.a("dropoff_map_image", dropoffMapImage);
            }
            if (!((LocationDTO)Objects.firstNonNull(ridedto.getDropoffLocation(), NullLocationDTO.getInstance())).isNull())
            {
                datamap.a("ride_end_location_address", (String)Objects.firstNonNull(((LocationDTO)Objects.firstNonNull(ridedto.getDropoffLocation(), NullLocationDTO.getInstance())).getAddress(), ""));
            }
        }
        datamap.a("timestamp", System.currentTimeMillis());
    }
}
