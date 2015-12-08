// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.analytics.studies.PlaceSearchAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.Binder;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchResultsView, IPlaceSearchPresenter, PlaceSearchToolbar

public abstract class PlaceSearchView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    private Binder binder;
    IPlaceSearchPresenter placeSearchPresenter;
    PlaceSearchResultsView resultsView;
    private Subscription suggestionsSubscription;
    PlaceSearchToolbar toolbar;

    public PlaceSearchView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        suggestionsSubscription = Subscriptions.empty();
        if (isInEditMode())
        {
            return;
        } else
        {
            setOrientation(1);
            Scoop.a(this).a(context).inflate(0x7f0300ef, this, true);
            ButterKnife.a(this);
            return;
        }
    }

    private void loadInitialPlaces()
    {
        resultsView.clearPlaces();
        suggestionsSubscription.unsubscribe();
        suggestionsSubscription = binder.bind(getInitialPlaces(), new Action1() {

            final PlaceSearchView this$0;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                resultsView.addPlaces(list);
            }

            
            {
                this$0 = PlaceSearchView.this;
                super();
            }
        });
    }

    private void onQueryChanged(String s)
    {
        if (s.length() > 0)
        {
            suggestionsSubscription.unsubscribe();
            suggestionsSubscription = binder.bind(getAutocompletePlaces(s), new Action1() {

                final PlaceSearchView this$0;

                public volatile void call(Object obj)
                {
                    call((List)obj);
                }

                public void call(List list)
                {
                    resultsView.reloadPlaces(list);
                }

            
            {
                this$0 = PlaceSearchView.this;
                super();
            }
            });
            return;
        } else
        {
            loadInitialPlaces();
            return;
        }
    }

    protected Observable getAutocompletePlaces(String s)
    {
        return placeSearchPresenter.loadAutocompleteSuggestions(s);
    }

    protected abstract int getHintId();

    protected abstract Observable getInitialPlaces();

    protected abstract String getInitialQuery();

    protected abstract int getInputIconId();

    protected abstract String getSourceForAnalytics();

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        Binder binder1 = binder;
        binder = Binder.attach(this);
        toolbar.setIconId(getInputIconId());
        toolbar.setHintId(getHintId());
        toolbar.setQuery(getInitialQuery());
        if (Strings.isNullOrEmpty(getInitialQuery()))
        {
            toolbar.showKeyboard();
        }
        loadInitialPlaces();
        binder.bind(toolbar.observeQueryChange(), new Action1() {

            final PlaceSearchView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                onQueryChanged(s);
            }

            
            {
                this$0 = PlaceSearchView.this;
                super();
            }
        });
        binder.bind(toolbar.observeBackButtonTap(), new Action1() {

            final PlaceSearchView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                PlaceSearchAnalytics.trackCancel();
            }

            
            {
                this$0 = PlaceSearchView.this;
                super();
            }
        });
        binder.bind(resultsView.observeSelectedItem(), new Action1() {

            final PlaceSearchView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                PlaceSearchAnalytics.trackSuccess(location.getPlaceType().toString().toLowerCase());
                onPlaceSelected(location);
            }

            
            {
                this$0 = PlaceSearchView.this;
                super();
            }
        });
        PlaceSearchAnalytics.trackSearchPlaces(getSourceForAnalytics());
    }

    public boolean onBack()
    {
        PlaceSearchAnalytics.trackCancel();
        return appFlow.goBack();
    }

    protected abstract void onPlaceSelected(Location location);

}
