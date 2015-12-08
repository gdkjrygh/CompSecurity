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

class this._cls0
    implements Func1
{

    final LandingService this$0;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Observable call(Unit unit)
    {
        return LandingService.access$400(LandingService.this).getLastLocation().flatMap(new Func1() {

            final LandingService._cls5 this$1;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                location = LocationMapper.fromLocationDomain(location);
                location = new LoginRequestDTO(null, null, null, LandingService.access$300(this$0).getFacebookToken(), null, null, null, location, LandingService.access$100(this$0).getMatId());
                return LandingService.access$200(this$0).createUser(location);
            }

            
            {
                this$1 = LandingService._cls5.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = LandingService.this;
        super();
    }
}
