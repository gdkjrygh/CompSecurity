// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.location.Location;
import rx.Observer;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel

public class SearchFallbackPlaceItemViewModel
    implements IPlaceItemViewModel
{

    private final Location location;
    Observer selectedObserver;

    private SearchFallbackPlaceItemViewModel(Location location1)
    {
        location = location1;
        location.setPlaceType(getPlaceTypeForAnalytics());
    }

    public static IPlaceItemViewModel create(Location location1)
    {
        return new SearchFallbackPlaceItemViewModel(location1);
    }

    public int getIconResourceId()
    {
        return 0x7f0201a0;
    }

    public me.lyft.android.domain.location.Location.PlaceType getPlaceTypeForAnalytics()
    {
        return me.lyft.android.domain.location.Location.PlaceType.FALLBACK;
    }

    public String getSubtitle()
    {
        return location.getShortRoutableAddress();
    }

    public String getTitle()
    {
        return location.getPlaceName();
    }

    public boolean isEditVisible()
    {
        return false;
    }

    public void onEdit()
    {
    }

    public void onSelected()
    {
        selectedObserver.onNext(location);
    }

    public void setSelectionObserver(Observer observer)
    {
        selectedObserver = observer;
    }
}
