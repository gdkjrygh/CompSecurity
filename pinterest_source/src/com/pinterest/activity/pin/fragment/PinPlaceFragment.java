// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.pin.view.PinPlaceInfoView;
import com.pinterest.activity.pin.view.modules.util.PinMapMarker;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.api.remote.PlaceApi;
import com.pinterest.base.Events;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.view.MapViewGroup;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ViewType;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PinPlaceFragment extends PinGridFragment
{

    private static final int DEFAULT_ZOOM = 11;
    private static final float PIN_IMAGE_SIZE_MULTIPLIER = 0.9F;
    private static final float ZOOM_BY = 2F;
    private final int RELATED_PIN_DELAY_MS = (int)(Math.random() * 300D) + 1000;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private int _gridHeaderLocation[];
    private Handler _handler;
    private PinMapMarker _mainMapMarker;
    private MapClickListener _mapClickListener;
    private PinPlaceMapFragment _mapFragment;
    private com.pinterest.kit.view.MapViewGroup.MapState _mapState;
    private MapViewGroup _mapViewGroup;
    private Map _markerIdPinMap;
    private List _nearbyMarkers;
    private FeedApiResponseHandler _nearbyPinsResponseHandler;
    private boolean _pendingHandler;
    private Pin _pin;
    private Place _pinPlace;
    private PinPlaceInfoView _pinPlaceInfoView;
    TextView _relatedTitle;
    private boolean _sentGridImpressionEvent;
    private Point _zoomTarget;

    public PinPlaceFragment()
    {
        _mapState = com.pinterest.kit.view.MapViewGroup.MapState.b;
        _sentGridImpressionEvent = false;
        _gridHeaderLocation = new int[2];
        _nearbyMarkers = new ArrayList();
        _markerIdPinMap = new HashMap();
        _eventsSubscriber = new _cls5();
        _nearbyPinsResponseHandler = new _cls7();
    }

    private void createMapFragment()
    {
        _mapFragment = new PinPlaceMapFragment();
        _mapFragment.setMapListener(new _cls11());
        FragmentHelper.replaceFragment(this, 0x7f0f01e0, _mapFragment, false);
    }

    private void hideInfoWindows()
    {
        if (_mainMapMarker != null && _mainMapMarker.getMarker() != null)
        {
            _mainMapMarker.getMarker().hideInfoWindow();
        }
        if (_nearbyMarkers != null)
        {
            Iterator iterator = _nearbyMarkers.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PinMapMarker pinmapmarker = (PinMapMarker)iterator.next();
                if (pinmapmarker.getMarker() != null)
                {
                    pinmapmarker.getMarker().hideInfoWindow();
                }
            } while (true);
        }
    }

    private void showMapMarker()
    {
        if (_mapFragment != null && _mapFragment.getMap() != null)
        {
            final GoogleMap map = _mapFragment.getMap();
            final LatLng latLng = _pinPlace.getLatLng();
            map.setOnCameraChangeListener(new _cls8());
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 11F));
            _mapClickListener = new MapClickListener();
            map.setOnMarkerClickListener(_mapClickListener);
            map.setInfoWindowAdapter(new com.pinterest.activity.pin.view.modules.util.PinMapMarker.EmptyInfoWindowAdapter(getContext()));
            map.setOnInfoWindowClickListener(_mapClickListener);
            if (_mainMapMarker != null)
            {
                _mainMapMarker.remove();
            }
            _mainMapMarker = new PinMapMarker(_pin, map, (new com.pinterest.activity.pin.view.modules.util.PinMapMarker.PinMapMarkerOptions()).setBackgroundDrawable(0x7f0201dc).setListener(new _cls9()));
            _handler.postDelayed(new _cls10(), 500L);
        }
    }

    protected void loadData()
    {
        if (!MyUser.hasAccessToken() || !_active || _pendingHandler || _adapter == null || ((PinGridAdapter)_adapter).getCount() != 0 || ((PinGridAdapter)_adapter).isLoading())
        {
            return;
        } else
        {
            _pendingHandler = true;
            _handler.postDelayed(new _cls6(), RELATED_PIN_DELAY_MS);
            PlaceApi.a(_pinPlace.getLatitude().doubleValue(), _pinPlace.getLongitude().doubleValue(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(_nearbyPinsResponseHandler), getApiTag());
            return;
        }
    }

    public void onActivate()
    {
        super.onActivate();
        Pinalytics.a(ViewType.PLACE, ComponentType.PLACE_VIEW, null);
        if (_mapState == com.pinterest.kit.view.MapViewGroup.MapState.a)
        {
            Pinalytics.a(ViewType.PLACE, ComponentType.PLACE_VIEW_MAP, null);
        }
        loadData();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300f5;
        _handler = new Handler();
        ((PinGridAdapter)_adapter).setIsRelatedContent(true);
    }

    public void onDeactivate()
    {
        super.onDeactivate();
        Pinalytics.b(ViewType.PLACE, ComponentType.PLACE_VIEW, null);
        if (_mapState == com.pinterest.kit.view.MapViewGroup.MapState.a)
        {
            Pinalytics.b(ViewType.PLACE, ComponentType.PLACE_VIEW_MAP, null);
        }
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        if (_mapViewGroup != null)
        {
            _mapViewGroup.setListener(null);
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        if (_pin == null || _pin.getPlace() == null)
        {
            return;
        } else
        {
            _actionBar.setTitle(0x7f07043a);
            _pinPlace = _pin.getPlace();
            _pinPlaceInfoView = new PinPlaceInfoView(view.getContext(), _pin);
            _pinPlaceInfoView.setOnClickListener(new _cls1());
            _gridVw.addHeaderView(_pinPlaceInfoView, -1, -2);
            _mapViewGroup = (MapViewGroup)view.findViewById(0x7f0f02a7);
            _mapViewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new _cls2());
            _mapViewGroup.setListener(new _cls3());
            int i = (int)Resources.dimension(0x7f0a015f);
            int j = Resources.color(0x7f0e0015);
            _gridVw.getEmptyView().setBackgroundColor(j);
            _gridVw.getAdapterView().setBackgroundColor(j);
            _gridVw.setContentBackgroundColor(j);
            _gridVw.addListener(new _cls4());
            _relatedTitle = new TextView(view.getContext(), null, 0x7f0100e3);
            _relatedTitle.setPadding(i, i, i, 0);
            _relatedTitle.setText(0x7f07043d);
            _relatedTitle.setBackgroundColor(j);
            _gridVw.addHeaderView(_relatedTitle, -1, -2);
            _relatedTitle.setVisibility(8);
            Events.register(_eventsSubscriber, com/pinterest/kit/view/MapViewGroup$MapState, new Class[0]);
            return;
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null)
        {
            _pin = navigation.getModelAsPin();
        }
    }



/*
    static com.pinterest.kit.view.MapViewGroup.MapState access$002(PinPlaceFragment pinplacefragment, com.pinterest.kit.view.MapViewGroup.MapState mapstate)
    {
        pinplacefragment._mapState = mapstate;
        return mapstate;
    }

*/





/*
    static boolean access$1202(PinPlaceFragment pinplacefragment, boolean flag)
    {
        pinplacefragment._pendingHandler = flag;
        return flag;
    }

*/












/*
    static boolean access$402(PinPlaceFragment pinplacefragment, boolean flag)
    {
        pinplacefragment._sentGridImpressionEvent = flag;
        return flag;
    }

*/





/*
    static Point access$702(PinPlaceFragment pinplacefragment, Point point)
    {
        pinplacefragment._zoomTarget = point;
        return point;
    }

*/




    private class _cls7 extends FeedApiResponseHandler
    {

        final PinPlaceFragment this$0;

        public void onSuccess(Feed feed)
        {
            onSuccess(feed);
            if (_mapFragment != null)
            {
                GoogleMap googlemap = _mapFragment.getMap();
                LatLng latlng = new LatLng(_pinPlace.getLatitude().doubleValue(), _pinPlace.getLongitude().doubleValue());
                HashMap hashmap = new HashMap();
                feed = feed.getItems().iterator();
                do
                {
                    if (!feed.hasNext())
                    {
                        break;
                    }
                    Pin pin = (Pin)feed.next();
                    Place place = pin.getPlace();
                    if (place != null)
                    {
                        hashmap.put(place.getLatLng(), pin);
                    }
                } while (true);
                hashmap.remove(latlng);
                feed = hashmap.values().iterator();
                while (feed.hasNext()) 
                {
                    final Pin nearbyPin = (Pin)feed.next();
                    class _cls1
                        implements com.pinterest.activity.pin.view.modules.util.PinMapMarker.PinMapMarkerListener
                    {

                        final _cls7 this$1;
                        final Pin val$nearbyPin;

                        public void onMarkerAdded(Marker marker)
                        {
                            _markerIdPinMap.put(marker.getId(), nearbyPin);
                        }

                _cls1()
                {
                    this$1 = _cls7.this;
                    nearbyPin = pin;
                    Object();
                }
                    }

                    nearbyPin = new PinMapMarker(nearbyPin, googlemap, (new PinMapMarkerOptions()).setBackgroundDrawable(0x7f0201df).setPinImageSizeMultiplier(0.9F).setRound(false).setCornerRadius(Resources.dimension(0x7f0a01a2)).setFadeIn(true).setListener(new _cls1()));
                    _nearbyMarkers.add(nearbyPin);
                }
            }
        }

        _cls7()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }


    private class PinPlaceMapFragment extends MapFragment
    {

        public PinPlaceMapFragment()
        {
        }
    }


    private class _cls11
        implements com.pinterest.fragment.MapFragment.Listener
    {

        final PinPlaceFragment this$0;

        public void onReady()
        {
            showMapMarker();
        }

        _cls11()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }



    private class MapClickListener
        implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    {

        BasicMapInfoView _mainMapInfoView;
        NearbyPinInfoView _nearbyPinInfoView;
        final PinPlaceFragment this$0;

        public View getInfoContents(Marker marker)
        {
            return null;
        }

        public View getInfoWindow(Marker marker)
        {
            marker = (Pin)_markerIdPinMap.get(marker.getId());
            if (marker != null)
            {
                if (marker.equals(_pin))
                {
                    return _mainMapInfoView.populate(marker.getPlace());
                } else
                {
                    return _nearbyPinInfoView;
                }
            } else
            {
                return null;
            }
        }

        public void onInfoWindowClick(Marker marker)
        {
            Pinalytics.a(ElementType.PLACE_VIEW_MAP_CALLOUT, ComponentType.PLACE_VIEW_MAP);
            marker = (Pin)_markerIdPinMap.get(marker.getId());
            if (marker != null && !marker.equals(_pin))
            {
                Events.post(new Navigation(Location.PIN, marker));
            }
        }

        public boolean onMarkerClick(final Marker marker)
        {
            Pinalytics.a(ElementType.PLACE_VIEW_MAP_MARKER, ComponentType.PLACE_VIEW_MAP);
            Pin pin = (Pin)_markerIdPinMap.get(marker.getId());
            if (pin != null && !pin.equals(_pin))
            {
                class _cls1 extends com.pinterest.ui.imageview.WebImageView.ImageListener
                {

                    final MapClickListener this$1;
                    final Marker val$marker;

                    public void onBitmapSet()
                    {
                        marker.showInfoWindow();
                    }

                _cls1()
                {
                    this$1 = MapClickListener.this;
                    marker = marker1;
                    ImageListener();
                }
                }

                _nearbyPinInfoView.populate(pin, new _cls1());
                _mapFragment.getMap().animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
                return true;
            } else
            {
                return false;
            }
        }

        public MapClickListener()
        {
            this$0 = PinPlaceFragment.this;
            super();
            _mainMapInfoView = (BasicMapInfoView)ViewHelper.viewById(getActivity(), 0x7f0301c4);
            _nearbyPinInfoView = (NearbyPinInfoView)ViewHelper.viewById(getActivity(), 0x7f0301e9);
        }
    }


    private class _cls9
        implements com.pinterest.activity.pin.view.modules.util.PinMapMarker.PinMapMarkerListener
    {

        final PinPlaceFragment this$0;

        public void onMarkerAdded(Marker marker)
        {
            _markerIdPinMap.put(marker.getId(), _pin);
        }

        _cls9()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final PinPlaceFragment this$0;
        final GoogleMap val$map;

        public void run()
        {
            _mainMapMarker.bringToFront();
            map.setInfoWindowAdapter(_mapClickListener);
        }

        _cls10()
        {
            this$0 = PinPlaceFragment.this;
            map = googlemap;
            super();
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinPlaceFragment this$0;

        public void onClick(View view)
        {
            if (_mapState == com.pinterest.kit.view.MapViewGroup.MapState.a)
            {
                _mapViewGroup.switchMapState(false);
            }
        }

        _cls1()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final PinPlaceFragment this$0;

        public void onGlobalLayout()
        {
            _mapViewGroup.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            _mapViewGroup.setVerticalDragRangeAdjustment(_pinPlaceInfoView.getTitleHeight());
            createMapFragment();
            _mapViewGroup.setMapShown(true);
        }

        _cls2()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.kit.view.MapViewGroup.MapViewGroupListener
    {

        final PinPlaceFragment this$0;

        public void onLargeMapDragged()
        {
            Pinalytics.a(EventType.DRAG, ElementType.PLACE_VIEW_LARGE_MAP, ComponentType.PLACE_VIEW_MAP, null);
        }

        public void onSmallMapSwiped()
        {
            Pinalytics.a(EventType.SWIPE, ElementType.PLACE_VIEW_SMALL_MAP, ComponentType.PLACE_VIEW, null);
        }

        public void onSmallMapTapped()
        {
            Pinalytics.a(ElementType.PLACE_VIEW_SMALL_MAP, ComponentType.PLACE_VIEW);
        }

        _cls3()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final PinPlaceFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (!_sentGridImpressionEvent && _relatedTitle.getVisibility() == 0)
            {
                _relatedTitle.getLocationOnScreen(_gridHeaderLocation);
                i = _gridHeaderLocation[1];
                j = _relatedTitle.getMeasuredHeight() + i;
                k = (int)Device.getScreenHeight();
                if (i >= 0 && i <= k || j >= 0 && j <= k || i <= 0 && j >= k)
                {
                    _sentGridImpressionEvent = true;
                    Pinalytics.a(ViewType.PLACE, ComponentType.PLACE_VIEW);
                }
            }
        }

        _cls4()
        {
            this$0 = PinPlaceFragment.this;
            super();
        }
    }

}
