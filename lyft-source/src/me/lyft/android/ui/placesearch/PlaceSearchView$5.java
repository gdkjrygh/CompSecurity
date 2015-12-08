// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import java.util.List;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchView, PlaceSearchResultsView

class this._cls0
    implements Action1
{

    final PlaceSearchView this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        resultsView.addPlaces(list);
    }

    View()
    {
        this$0 = PlaceSearchView.this;
        super();
    }
}
