// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.location.Location;
import rx.Observer;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel

public class TopDestinationPlaceItemViewModel
    implements IPlaceItemViewModel
{

    private Location location;
    private Observer selectionObserver;

    private TopDestinationPlaceItemViewModel(Location location1)
    {
        location = location1;
        location.setPlaceType(getPlaceTypeForAnalytics());
    }

    public static IPlaceItemViewModel create(Location location1)
    {
        return new TopDestinationPlaceItemViewModel(location1);
    }

    public int getIconResourceId()
    {
        return 0x7f0201a2;
    }

    public me.lyft.android.domain.location.Location.PlaceType getPlaceTypeForAnalytics()
    {
        return me.lyft.android.domain.location.Location.PlaceType.TOP_DESTINATIONS;
    }

    public String getSubtitle()
    {
        return location.getShortRoutableAddress();
    }

    public String getTitle()
    {
        return location.getDisplayName();
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
        selectionObserver.onNext(location);
    }

    public void setSelectionObserver(Observer observer)
    {
        selectionObserver = observer;
    }
}
