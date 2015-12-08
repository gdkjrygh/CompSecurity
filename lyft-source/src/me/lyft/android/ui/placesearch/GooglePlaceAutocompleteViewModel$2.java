// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.googleplaces.GooglePlace;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            GooglePlaceAutocompleteViewModel

class this._cls0
    implements Func1
{

    final GooglePlaceAutocompleteViewModel this$0;

    public volatile Object call(Object obj)
    {
        return call((GooglePlace)obj);
    }

    public Location call(GooglePlace googleplace)
    {
        return GoogleLocationMapper.fromGooglePlace(googleplace);
    }

    ()
    {
        this$0 = GooglePlaceAutocompleteViewModel.this;
        super();
    }
}
