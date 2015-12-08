// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchPresenter, TopDestinationPlaceItemViewModel, IPlaceItemViewModel

class this._cls0
    implements Func1
{

    final PlaceSearchPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public IPlaceItemViewModel call(Location location)
    {
        return TopDestinationPlaceItemViewModel.create(location);
    }

    ViewModel()
    {
        this$0 = PlaceSearchPresenter.this;
        super();
    }
}
