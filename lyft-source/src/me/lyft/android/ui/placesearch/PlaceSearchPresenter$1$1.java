// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import java.util.List;
import me.lyft.android.common.Iterables;
import me.lyft.android.infrastructure.googleplaces.GooglePlacePrediction;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchPresenter, GooglePlaceAutocompleteViewModel, IPlaceItemViewModel

class this._cls1
    implements Func1
{

    final rediction this$1;

    public volatile Object call(Object obj)
    {
        return call((GooglePlacePrediction)obj);
    }

    public IPlaceItemViewModel call(GooglePlacePrediction googleplaceprediction)
    {
        return GooglePlaceAutocompleteViewModel.create(PlaceSearchPresenter.access$000(_fld0), googleplaceprediction);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/placesearch/PlaceSearchPresenter$1

/* anonymous class */
    class PlaceSearchPresenter._cls1
        implements Func1
    {

        final PlaceSearchPresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public List call(List list)
        {
            return Iterables.select(list, new PlaceSearchPresenter._cls1._cls1());
        }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
    }

}
