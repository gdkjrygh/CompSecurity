// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRideMapper;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.domain.profile.ProfileMapper;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.lyft.ride.NullRouteDTO;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.infrastructure.lyft.ride.RouteDTO;

// Referenced classes of package me.lyft.android.application.profile:
//            IProfileProvider

public class ProfileProvider
    implements IProfileProvider
{

    final IUserSession userSession;

    public ProfileProvider(IUserSession iusersession)
    {
        userSession = iusersession;
    }

    public Profile getDriverProfile()
    {
        Object obj = userSession.getRide();
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getRoute();
        } else
        {
            obj = null;
        }
        return ProfileMapper.fromUserDTO((UserDTO)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(obj, NullRouteDTO.getInstance())).getDriver(), NullUserDTO.getInstance()), userSession.getUser().getId());
    }

    public Profile getMyProfile()
    {
        UserDTO userdto = userSession.getUser();
        return ProfileMapper.fromUserDTO(userdto, userdto.getId());
    }

    public Profile getPassengerProfile(String s)
    {
        String s1 = userSession.getUser().getId();
        if (Objects.equals(s, s1))
        {
            return getMyProfile();
        }
        Object obj = userSession.getRide();
        if (obj != null)
        {
            obj = ((RideDTO) (obj)).getRoute();
        } else
        {
            obj = null;
        }
        for (obj = ((List)Objects.firstNonNull(((RouteDTO)Objects.firstNonNull(obj, NullRouteDTO.getInstance())).getPassengers(), Collections.EMPTY_LIST)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            UserDTO userdto = (UserDTO)((Iterator) (obj)).next();
            if (Objects.equals(s, userdto.getId()))
            {
                return ProfileMapper.fromUserDTO(userdto, s1);
            }
        }

        return Profile.empty();
    }

    public Driver getSelfAsDriver()
    {
        return PassengerRideMapper.createDriver(userSession.getUser(), userSession.getRide());
    }
}
