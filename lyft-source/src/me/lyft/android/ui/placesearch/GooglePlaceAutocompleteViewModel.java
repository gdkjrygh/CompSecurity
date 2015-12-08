// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.googleplaces.GooglePlace;
import me.lyft.android.infrastructure.googleplaces.GooglePlacePrediction;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.Observer;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceItemViewModel, PlacesCategories

public class GooglePlaceAutocompleteViewModel
    implements IPlaceItemViewModel
{

    private IGooglePlaceService googlePlaceService;
    private final int iconResourceId;
    private GooglePlacePrediction prediction;
    private Observer selectedObserver;
    private final String subTitle;

    GooglePlaceAutocompleteViewModel(IGooglePlaceService igoogleplaceservice, GooglePlacePrediction googleplaceprediction)
    {
        googlePlaceService = igoogleplaceservice;
        prediction = googleplaceprediction;
        iconResourceId = PlacesCategories.getIconResource(googleplaceprediction.getPlaceType());
        subTitle = getDisplayAddress(googleplaceprediction.getName(), googleplaceprediction.getDescription());
    }

    public static IPlaceItemViewModel create(IGooglePlaceService igoogleplaceservice, GooglePlacePrediction googleplaceprediction)
    {
        return new GooglePlaceAutocompleteViewModel(igoogleplaceservice, googleplaceprediction);
    }

    private static String getDisplayAddress(String s, String s1)
    {
        if (Strings.isNullOrBlank(s1))
        {
            s1 = "";
        } else
        {
            int i;
            if (!Strings.isNullOrBlank(s))
            {
                s1 = s1.replace(s, "");
            }
            s = s1;
            if (s1.indexOf(", ") == 0)
            {
                s = s1.substring(", ".length(), s1.length());
            }
            i = s.indexOf(", ");
            s1 = s;
            if (i != -1)
            {
                int j = s.lastIndexOf(", ");
                s1 = s;
                if (j != -1)
                {
                    s1 = s;
                    if (i != j)
                    {
                        return s.substring(0, j);
                    }
                }
            }
        }
        return s1;
    }

    public int getIconResourceId()
    {
        return iconResourceId;
    }

    public me.lyft.android.domain.location.Location.PlaceType getPlaceTypeForAnalytics()
    {
        return me.lyft.android.domain.location.Location.PlaceType.AUTOCOMPLETE;
    }

    public String getSubtitle()
    {
        return subTitle;
    }

    public String getTitle()
    {
        return prediction.getName();
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
        googlePlaceService.getPlaceDetails(prediction.getPlaceId()).map(new Func1() {

            final GooglePlaceAutocompleteViewModel this$0;

            public volatile Object call(Object obj)
            {
                return call((GooglePlace)obj);
            }

            public Location call(GooglePlace googleplace)
            {
                return GoogleLocationMapper.fromGooglePlace(googleplace);
            }

            
            {
                this$0 = GooglePlaceAutocompleteViewModel.this;
                super();
            }
        }).subscribe(new SimpleSubscriber() {

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
                selectedObserver.onNext(location);
            }

            
            {
                this$0 = GooglePlaceAutocompleteViewModel.this;
                super();
            }
        });
    }

    public void setSelectionObserver(Observer observer)
    {
        selectedObserver = observer;
    }

}
