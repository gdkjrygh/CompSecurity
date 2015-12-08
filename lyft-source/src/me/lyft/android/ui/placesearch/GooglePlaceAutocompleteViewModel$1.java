// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observer;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            GooglePlaceAutocompleteViewModel

class this._cls0 extends SimpleSubscriber
{

    final GooglePlaceAutocompleteViewModel this$0;

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
    }

    public volatile void onNext(Object obj)
    {
        onNext((Location)obj);
    }

    public void onNext(Location location)
    {
        location.setPlaceType(getPlaceTypeForAnalytics());
        super.onNext(location);
        GooglePlaceAutocompleteViewModel.access$000(GooglePlaceAutocompleteViewModel.this).onNext(location);
    }

    ()
    {
        this$0 = GooglePlaceAutocompleteViewModel.this;
        super();
    }
}
