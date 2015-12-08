// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.shortcuts.IShortcutService;
import me.lyft.android.application.topdestinations.ITopDestinationProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.shortcuts.Shortcut;
import me.lyft.android.infrastructure.googleplaces.GooglePlace;
import me.lyft.android.infrastructure.googleplaces.GooglePlacePrediction;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.placesearch.IPlaceSearchService;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            IPlaceSearchPresenter, GooglePlaceAutocompleteViewModel, IPlaceItemViewModel, SearchFallbackPlaceItemViewModel, 
//            GooglePlaceItemViewModel, ShortcutPlaceItemViewModel, TopDestinationPlaceItemViewModel

public class PlaceSearchPresenter
    implements IPlaceSearchPresenter
{

    private AppFlow appFlow;
    private IConstantsProvider constantsProvider;
    private IGooglePlaceService googlePlaceService;
    private ILocationService locationService;
    private IPlaceSearchService placeSearchService;
    private Resources resources;
    private IShortcutService shortcutService;
    private ITopDestinationProvider topDestinationProvider;

    public PlaceSearchPresenter(IGooglePlaceService igoogleplaceservice, ILocationService ilocationservice, IShortcutService ishortcutservice, ITopDestinationProvider itopdestinationprovider, IPlaceSearchService iplacesearchservice, AppFlow appflow, Resources resources1, 
            IConstantsProvider iconstantsprovider)
    {
        googlePlaceService = igoogleplaceservice;
        locationService = ilocationservice;
        shortcutService = ishortcutservice;
        topDestinationProvider = itopdestinationprovider;
        placeSearchService = iplacesearchservice;
        appFlow = appflow;
        resources = resources1;
        constantsProvider = iconstantsprovider;
    }

    private Observable combineWithSearchFallback(final String query, Observable observable)
    {
        return observable.flatMap(new Func1() {

            final PlaceSearchPresenter this$0;
            final String val$query;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public Observable call(List list)
            {
                if (list.size() > constantsProvider.getConstants().getSearchFallbackThreshold())
                {
                    return Observable.just(list);
                } else
                {
                    return loadPlacesFromSearchFallback(query).flatMap(list. new Func1() {

                        final _cls2 this$1;
                        final List val$places;

                        public volatile Object call(Object obj)
                        {
                            return call((List)obj);
                        }

                        public Observable call(List list)
                        {
                            ArrayList arraylist = new ArrayList(places);
                            arraylist.addAll(list);
                            return Observable.just(arraylist);
                        }

            
            {
                this$1 = final__pcls2;
                places = List.this;
                super();
            }
                    }).startWith(list);
                }
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                query = s;
                super();
            }
        });
    }

    private static Func1 errorToEmpty()
    {
        return new Func1() {

            public volatile Object call(Object obj)
            {
                return call((Throwable)obj);
            }

            public Observable call(Throwable throwable)
            {
                return Observable.empty();
            }

        };
    }

    private Observable loadNearbyGooglePlaces()
    {
        return googlePlaceService.getCurrentPlaces().map(new Func1() {

            final PlaceSearchPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public List call(List list)
            {
                return Iterables.select(list, new Func1() {

                    final _cls5 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((GooglePlace)obj);
                    }

                    public IPlaceItemViewModel call(GooglePlace googleplace)
                    {
                        return GooglePlaceItemViewModel.create(googleplace);
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
        }).onErrorResumeNext(errorToEmpty());
    }

    private Observable loadPlacesFromSearchFallback(String s)
    {
        return placeSearchService.placeSearchFallback(s).map(new Func1() {

            final PlaceSearchPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public List call(List list)
            {
                return Iterables.select(list, new Func1() {

                    final _cls3 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((Location)obj);
                    }

                    public IPlaceItemViewModel call(Location location)
                    {
                        return SearchFallbackPlaceItemViewModel.create(location);
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
        }).onErrorResumeNext(errorToEmpty());
    }

    private Observable loadShortcuts()
    {
        return Observable.just(Iterables.select(shortcutService.getShortcuts(), new Func1() {

            final PlaceSearchPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((Shortcut)obj);
            }

            public IPlaceItemViewModel call(Shortcut shortcut)
            {
                return ShortcutPlaceItemViewModel.create(shortcut, appFlow, resources);
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
        }));
    }

    private Observable loadTopDestinations()
    {
        return Observable.just(Iterables.select(topDestinationProvider.getTopDestinations(), new Func1() {

            final PlaceSearchPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public IPlaceItemViewModel call(Location location)
            {
                return TopDestinationPlaceItemViewModel.create(location);
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
        }));
    }

    public Observable loadAutocompleteSuggestions(String s)
    {
        return combineWithSearchFallback(s, googlePlaceService.queryPlaces(s, locationService.getLastCachedLocation()).map(new Func1() {

            final PlaceSearchPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public List call(List list)
            {
                return Iterables.select(list, new Func1() {

                    final _cls1 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((GooglePlacePrediction)obj);
                    }

                    public IPlaceItemViewModel call(GooglePlacePrediction googleplaceprediction)
                    {
                        return GooglePlaceAutocompleteViewModel.create(googlePlaceService, googleplaceprediction);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
        })).onErrorResumeNext(errorToEmpty());
    }

    public Observable loadCityAutocompleteSuggestions(String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Integer.valueOf(1007));
        Location location = locationService.getLastCachedLocation();
        return googlePlaceService.queryPlaces(s, location, arraylist).map(new Func1() {

            final PlaceSearchPresenter this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public List call(List list)
            {
                return Iterables.select(list, new Func1() {

                    final _cls4 this$1;

                    public volatile Object call(Object obj)
                    {
                        return call((GooglePlacePrediction)obj);
                    }

                    public IPlaceItemViewModel call(GooglePlacePrediction googleplaceprediction)
                    {
                        return GooglePlaceAutocompleteViewModel.create(googlePlaceService, googleplaceprediction);
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
            }

            
            {
                this$0 = PlaceSearchPresenter.this;
                super();
            }
        }).onErrorResumeNext(errorToEmpty());
    }

    public Observable observeDriverDropoffPlacesSuggestions()
    {
        return Observable.empty();
    }

    public Observable observePickupPlacesSuggestions()
    {
        return Observable.merge(loadShortcuts(), loadNearbyGooglePlaces());
    }

    public Observable observeShortcutSuggestions()
    {
        return loadTopDestinations();
    }

    public Observable observeUserDropoffPlacesSuggestions()
    {
        return Observable.merge(loadShortcuts(), loadTopDestinations());
    }





}
