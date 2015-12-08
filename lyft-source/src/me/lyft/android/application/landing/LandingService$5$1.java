// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.landing;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.facebook.IFacebookService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.profile.LoginRequestDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.landing:
//            LandingService

class this._cls1
    implements Func1
{

    final tDTO this$1;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public Observable call(Location location)
    {
        location = LocationMapper.fromLocationDomain(location);
        location = new LoginRequestDTO(null, null, null, LandingService.access$300(_fld0).getFacebookToken(), null, null, null, location, LandingService.access$100(_fld0).getMatId());
        return LandingService.access$200(_fld0).createUser(location);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/application/landing/LandingService$5

/* anonymous class */
    class LandingService._cls5
        implements Func1
    {

        final LandingService this$0;

        public volatile Object call(Object obj)
        {
            return call((Unit)obj);
        }

        public Observable call(Unit unit)
        {
            return LandingService.access$400(LandingService.this).getLastLocation().flatMap(new LandingService._cls5._cls1());
        }

            
            {
                this$0 = LandingService.this;
                super();
            }
    }

}
