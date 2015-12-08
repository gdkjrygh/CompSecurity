// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.placesearch;

import java.util.List;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.placesearch:
//            PlaceSearchService, PlaceSearchResponseDTO

class this._cls0
    implements Func1
{

    final PlaceSearchService this$0;

    public volatile Object call(Object obj)
    {
        return call((PlaceSearchResponseDTO)obj);
    }

    public List call(PlaceSearchResponseDTO placesearchresponsedto)
    {
        return placesearchresponsedto.toDomainLocations();
    }

    O()
    {
        this$0 = PlaceSearchService.this;
        super();
    }
}
