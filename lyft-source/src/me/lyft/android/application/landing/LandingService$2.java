// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.LoginRequestDTO;
import me.lyft.android.infrastructure.lyft.profile.PhoneDTO;
import me.lyft.android.persistence.landing.SignupUser;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.landing:
//            LandingService

class val.phone
    implements Func1
{

    final LandingService this$0;
    final PhoneDTO val$phone;
    final SignupUser val$signupUser;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        location = LocationMapper.fromLocationDomain(location);
        location = new LoginRequestDTO(val$signupUser.getEmail().trim(), val$signupUser.getFirstName().trim(), val$signupUser.getLastName().trim(), null, val$phone, LandingService.access$100(LandingService.this).getInstallReferrer(), Boolean.valueOf(val$signupUser.hasAgreedToS()), location, LandingService.access$100(LandingService.this).getMatId());
        return LandingService.access$200(LandingService.this).createUser(location);
    }

    estDTO()
    {
        this$0 = final_landingservice;
        val$signupUser = signupuser;
        val$phone = PhoneDTO.this;
        super();
    }
}
