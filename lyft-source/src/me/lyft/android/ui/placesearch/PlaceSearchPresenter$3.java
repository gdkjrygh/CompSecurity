// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchPresenter, SearchFallbackPlaceItemViewModel, IPlaceItemViewModel

class this._cls0
    implements Func1
{

    final PlaceSearchPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public List call(List list)
    {
        return Iterables.select(list, new Func1() {

            final PlaceSearchPresenter._cls3 this$1;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public IPlaceItemViewModel call(Location location)
            {
                return SearchFallbackPlaceItemViewModel.create(location);
            }

            
            {
                this$1 = PlaceSearchPresenter._cls3.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = PlaceSearchPresenter.this;
        super();
    }
}
