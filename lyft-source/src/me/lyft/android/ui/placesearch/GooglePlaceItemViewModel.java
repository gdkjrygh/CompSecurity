// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.googleplaces.GooglePlace;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import rx.Observer;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel, PlacesCategories

public class GooglePlaceItemViewModel
    implements IPlaceItemViewModel
{

    private int iconResourceId;
    private final Location location;
    Observer selectedObserver;

    private GooglePlaceItemViewModel(GooglePlace googleplace)
    {
        iconResourceId = PlacesCategories.getIconResource(googleplace.getPlaceType());
        location = GoogleLocationMapper.fromGooglePlace(googleplace);
        location.setPlaceType(getPlaceTypeForAnalytics());
    }

    public static IPlaceItemViewModel create(GooglePlace googleplace)
    {
        return new GooglePlaceItemViewModel(googleplace);
    }

    public int getIconResourceId()
    {
        return iconResourceId;
    }

    public me.lyft.android.domain.location.Location.PlaceType getPlaceTypeForAnalytics()
    {
        return me.lyft.android.domain.location.Location.PlaceType.NEARBY;
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
