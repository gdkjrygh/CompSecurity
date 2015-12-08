// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.adapter;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.pinterest.activity.place.LocationProvider;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Place;
import com.pinterest.api.model.metadata.PlaceFeed;
import com.pinterest.api.remote.PlaceApi;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.listview.ListCellTwoLinesText;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class PlacePickerAdapter extends BaseAdapter
    implements ListAdapter
{

    private static final Location DEFAULT_SEARCH_LOCATION;
    private static final int TYPE_FOURSQUARE_PLACEHOLDER = 1;
    private static final int TYPE_PLACE = 0;
    private final BaseActivity _activity;
    private String _apiTag;
    private Place _fourSquarePlaceHolder;
    private final Handler _handler = new Handler();
    private Location _lastCachedLocation;
    private String _lastLocation;
    private String _lastQuery;
    private final LayoutInflater _li;
    private LocationProvider _locationProvider;
    private Feed emptyFeed;
    private boolean isLastChangeInSearchQuery;
    private com.pinterest.activity.place.LocationProvider.Listener locationUpdateListener;
    private Feed placeFeed;
    private ProgressSpinnerListCell spinnerView;

    public PlacePickerAdapter(BaseActivity baseactivity)
    {
        emptyFeed = new PlaceFeed(null);
        placeFeed = emptyFeed;
        _fourSquarePlaceHolder = new Place();
        locationUpdateListener = new _cls1();
        _activity = baseactivity;
        _li = LayoutInflater.from(baseactivity);
    }

    private String getSubtitle(Place place)
    {
        String s = "";
        if (ModelHelper.isValidString(place.getCategory()))
        {
            s = (new StringBuilder()).append("").append(place.getCategory()).append(" \u2022 ").toString();
        }
        return (new StringBuilder()).append(s).append(place.getAddress()).toString();
    }

    private void reset()
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            placeFeed = emptyFeed;
            notifyDataSetChanged();
        }
    }

    private void showErrorCell(int i)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            ArrayList arraylist = new ArrayList();
            Object obj = new Place();
            ((Place) (obj)).setName(Resources.string(i));
            arraylist.add(obj);
            arraylist.add(_fourSquarePlaceHolder);
            obj = new PlaceFeed(null);
            ((PlaceFeed) (obj)).setItems(arraylist);
            placeFeed = ((Feed) (obj));
            notifyDataSetChanged();
        }
    }

    private void showLocationNotFoundError()
    {
        showErrorCell(0x7f07045a);
        spinnerView.hideSpinner();
    }

    public int getCount()
    {
        return placeFeed.getCount();
    }

    public Object getItem(int i)
    {
        return placeFeed.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        int j = getCount();
        Place place = (Place)getItem(0);
        if (j > 1 || j == 1 && place != null && place.getUid() != null)
        {
            return i != j - 1 ? 0 : 1;
        } else
        {
            return 0;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) == 1)
        {
            if (view == null)
            {
                view = (LinearLayout)_li.inflate(0x7f03015c, null);
                view.setBackgroundResource(0);
                ((WebImageView)view.findViewById(0x7f0f004b)).setImageResource(0x7f0201e5);
                return view;
            }
        } else
        {
            Object obj = (ListCellTwoLinesText)view;
            if (obj == null)
            {
                viewgroup = (ListCellTwoLinesText)_li.inflate(0x7f03016e, viewgroup, false);
            } else
            {
                viewgroup = ((ViewGroup) (obj));
            }
            obj = (Place)getItem(i);
            if (obj != null)
            {
                viewgroup.setTitle(((Place) (obj)).getName());
                if (isLastChangeInSearchQuery)
                {
                    view = getSubtitle(((Place) (obj)));
                } else
                {
                    view = null;
                }
                viewgroup.setSubTitle(view);
                return viewgroup;
            }
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isShowingLocations()
    {
        return !isLastChangeInSearchQuery;
    }

    public boolean isShowingPlaces()
    {
        return isLastChangeInSearchQuery;
    }

    public void onLocationPermissionResponse(boolean flag)
    {
        if (flag)
        {
            _lastCachedLocation = LocationProvider.getLastLocation(_activity);
            _locationProvider = new LocationProvider();
            _locationProvider.requestLocationUpdate(locationUpdateListener);
            return;
        } else
        {
            _lastCachedLocation = DEFAULT_SEARCH_LOCATION;
            return;
        }
    }

    public void onLocationTextChanged(String s)
    {
        _lastLocation = s;
        isLastChangeInSearchQuery = false;
        reset();
        PlaceApi.f(s, new PlaceResponseHandler(s, false), _apiTag);
        spinnerView.showSpinner(true);
    }

    public void onSearchFieldsEmpty()
    {
        reset();
    }

    public void onSearchQueryChanged(String s)
    {
        _lastQuery = s;
        isLastChangeInSearchQuery = true;
        reset();
        if (StringUtils.isNotEmpty(_lastLocation))
        {
            PlaceApi.d(s, _lastLocation, new PlaceResponseHandler(s, true), _apiTag);
            spinnerView.showSpinner(true);
            return;
        }
        if (_lastCachedLocation != null)
        {
            PlaceApi.a(s, _lastCachedLocation.getLatitude(), _lastCachedLocation.getLongitude(), new PlaceResponseHandler(s, true), _apiTag);
            spinnerView.showSpinner(true);
            return;
        } else
        {
            showLocationNotFoundError();
            return;
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setSpinnerView(ProgressSpinnerListCell progressspinnerlistcell)
    {
        spinnerView = progressspinnerlistcell;
        spinnerView.hideSpinner();
    }

    static 
    {
        Location location = new Location("none");
        DEFAULT_SEARCH_LOCATION = location;
        location.setLatitude(37.772995999999999D);
        DEFAULT_SEARCH_LOCATION.setLongitude(-122.40374199999999D);
    }


/*
    static Location access$002(PlacePickerAdapter placepickeradapter, Location location)
    {
        placepickeradapter._lastCachedLocation = location;
        return location;
    }

*/





/*
    static Feed access$502(PlacePickerAdapter placepickeradapter, Feed feed)
    {
        placepickeradapter.placeFeed = feed;
        return feed;
    }

*/





    private class _cls1
        implements com.pinterest.activity.place.LocationProvider.Listener
    {

        final PlacePickerAdapter this$0;

        public void onGPSLocationUpdate(Location location)
        {
            _lastCachedLocation = location;
        }

        public void onNetworkLocationUpdate(Location location)
        {
            _lastCachedLocation = location;
        }

        _cls1()
        {
            this$0 = PlacePickerAdapter.this;
            super();
        }
    }


    private class PlaceResponseHandler extends BaseApiResponseHandler
    {

        private boolean isPlacesTypeahead;
        private String query;
        final PlacePickerAdapter this$0;

        private boolean isValidData()
        {
            return isPlacesTypeahead && isLastChangeInSearchQuery && query.equals(_lastQuery) || !isPlacesTypeahead && !isLastChangeInSearchQuery && query.equals(_lastLocation);
        }

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Application.showToast(throwable.getMessage());
        }

        public void onSuccess(final ApiResponse feed)
        {
            super.onSuccess(feed);
            if (isValidData())
            {
                feed = new PlaceFeed((PinterestJsonArray)feed.getData());
                class _cls1
                    implements Runnable
                {

                    final PlaceResponseHandler this$1;
                    final PlaceFeed val$feed;

                    public void run()
                    {
label0:
                        {
                            if (isValidData())
                            {
                                spinnerView.hideSpinner();
                                if (feed.getCount() != 0)
                                {
                                    break label0;
                                }
                                showErrorCell(0x7f0703a0);
                            }
                            return;
                        }
                        feed.appendItem(_fourSquarePlaceHolder);
                        placeFeed = feed;
                        notifyDataSetChanged();
                    }

                _cls1()
                {
                    this$1 = PlaceResponseHandler.this;
                    feed = placefeed;
                    super();
                }
                }

                _handler.post(new _cls1());
            }
        }


        public PlaceResponseHandler(String s, boolean flag)
        {
            this$0 = PlacePickerAdapter.this;
            super();
            query = s;
            isPlacesTypeahead = flag;
        }
    }

}
