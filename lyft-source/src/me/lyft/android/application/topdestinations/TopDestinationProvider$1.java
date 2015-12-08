// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.topdestinations;

import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.topdestinations:
//            TopDestinationProvider

class this._cls0
    implements Func1
{

    final TopDestinationProvider this$0;

    public volatile Object call(Object obj)
    {
        return call((LocationDTO)obj);
    }

    public Location call(LocationDTO locationdto)
    {
        return LocationMapper.fromLocationDTO(locationdto);
    }

    ()
    {
        this$0 = TopDestinationProvider.this;
        super();
    }
}
