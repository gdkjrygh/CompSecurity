// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.topdestinations;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.topdestinations:
//            ITopDestinationProvider

public class TopDestinationProvider
    implements ITopDestinationProvider
{

    private IUserSession userSession;

    public TopDestinationProvider(IUserSession iusersession)
    {
        userSession = iusersession;
    }

    public List getTopDestinations()
    {
        return Iterables.select((Iterable)Objects.firstNonNull(userSession.getAppState().getTopDestinations(), new ArrayList()), new Func1() {

            final TopDestinationProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((LocationDTO)obj);
            }

            public Location call(LocationDTO locationdto)
            {
                return LocationMapper.fromLocationDTO(locationdto);
            }

            
            {
                this$0 = TopDestinationProvider.this;
                super();
            }
        });
    }
}
