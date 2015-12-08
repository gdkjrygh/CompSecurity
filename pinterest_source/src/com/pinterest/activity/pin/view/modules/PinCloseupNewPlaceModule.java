// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.pin.view.PlaceModulePinGridView;
import com.pinterest.activity.pin.view.modules.util.PinMapMarker;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.api.remote.PlaceApi;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.MapFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.view.RoundedMaskView;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupNewPlaceModule extends PinCloseupBaseModule
{

    private static final boolean DEBUG_PIN_COLLECTION = false;
    private static final int DEFAULT_ZOOM = 11;
    private static final int MIN_NUM_PINS = 4;
    private String _apiTag;
    private FeedApiResponseHandler _feedApiResponseHandler;
    private ViewGroup _mapContainer;
    private MapFragment _mapFragment;
    private PinMapMarker _mapMarker;
    private PlaceModulePinGridView _pinGridView;
    private String _placeUid;
    private boolean _placeUpdated;
    private TextView _title;
    private FrameLayout _wrapper;
    private com.pinterest.fragment.MapFragment.Listener onMapReady;

    public PinCloseupNewPlaceModule(Context context, String s)
    {
        super(context);
        _placeUpdated = true;
        _feedApiResponseHandler = new _cls2();
        onMapReady = new _cls3();
        _padding.top = (int)Resources.dimension(0x7f0a0186);
        _padding.bottom = (int)Resources.dimension(0x7f0a018a);
        _apiTag = s;
    }

    private int getMapHeight()
    {
        return (int)((float)(FragmentHelper.getCloseupWidth() - (int)Resources.dimension(0x7f0a0184) * 2 - (int)Resources.dimension(0x7f0a0161)) / 2.0F);
    }

    private void loadNearbyPins()
    {
        if (!Experiments.S())
        {
            return;
        } else
        {
            PlaceApi.b(_pin.getPlace().getLatitude().doubleValue(), _pin.getPlace().getLongitude().doubleValue(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(_feedApiResponseHandler), _apiTag);
            return;
        }
    }

    private void loadRelatedPins()
    {
        PlaceApi.a(_pinPlace.getUid(), new _cls4(), _apiTag);
    }

    private void onMapClicked()
    {
        Pinalytics.a(ElementType.PLACE_MODULE_MAP, ComponentType.CLOSEUP_PLACE_MODULE);
        Events.post(new Navigation(Location.PIN_PLACE, _pin));
    }

    private void showMapMarker()
    {
        final LatLng latLng = _pin.getPlace();
        if (latLng != null && _mapFragment != null && _pin.getImageSquareUrl() != null)
        {
            final GoogleMap map = _mapFragment.getMap();
            if (map != null && latLng.getLatitude() != null && latLng.getLongitude() != null)
            {
                map.getUiSettings().setAllGesturesEnabled(false);
                map.setOnMarkerClickListener(new _cls5());
                map.setOnMapClickListener(new _cls6());
                latLng = latLng.getLatLng();
                map.setOnCameraChangeListener(new _cls7());
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 11F));
                map.setInfoWindowAdapter(new com.pinterest.activity.pin.view.modules.util.PinMapMarker.EmptyInfoWindowAdapter(getContext()));
                if (_mapMarker != null)
                {
                    _mapMarker.remove();
                }
                _mapMarker = new PinMapMarker(_pin, map);
                postDelayed(new _cls8(), 500L);
            }
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_PLACE;
    }

    protected boolean hasContent()
    {
        return _pin != null && _pin.showMap().booleanValue() && Experiments.O();
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        setOrientation(1);
        addView(getDividerView(), -1, Constants.HAIRLINE);
        _title = new TextView(getContext(), null, 0x7f0100e3);
        int i = (int)Resources.dimension(0x7f0a0185);
        int j = (int)Resources.dimension(0x7f0a0184);
        _title.setPadding(j, Constants.MARGIN, i, Constants.MARGIN);
        addView(_title, -1, -2);
        _wrapper = new FrameLayout(getContext());
        _wrapper.setPadding(j, 0, j, 0);
        addView(_wrapper, -1, -2);
        Object obj = new LinearLayout(getContext());
        _mapContainer = new FrameLayout(getContext());
        i = getMapHeight();
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, i, 1.0F);
        ((LinearLayout) (obj)).addView(_mapContainer, layoutparams);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, i, 1.0F);
        _pinGridView = new PlaceModulePinGridView(getContext());
        _pinGridView.setOnClickListener(new _cls1());
        ((LinearLayout) (obj)).addView(_pinGridView, layoutparams);
        _wrapper.addView(((View) (obj)), -1, -2);
        obj = new RoundedMaskView(getContext());
        _wrapper.addView(((View) (obj)), -1, -1);
        setVisibility(8);
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        int i = getMapHeight();
        if (_mapContainer != null)
        {
            _mapContainer.getLayoutParams().height = i;
        }
        if (_pinGridView != null)
        {
            _pinGridView.getLayoutParams().height = i;
        }
    }

    protected void onDetachedFromWindow()
    {
        if (_mapFragment != null)
        {
            _mapFragment.setMapListener(null);
        }
        _mapFragment = null;
        super.onDetachedFromWindow();
    }

    public void setPin(Pin pin, boolean flag)
    {
        if (pin != null && !StringUtils.equals(_placeUid, pin.getPlaceUid()))
        {
            _placeUpdated = true;
        }
        super.setPin(pin, flag);
        if (pin != null)
        {
            pin = pin.getPlaceUid();
        } else
        {
            pin = null;
        }
        _placeUid = pin;
    }

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        if (!_detailsLoaded || !_placeUpdated)
        {
            return;
        }
        if (BooleanUtils.isTrue(_pin.showMap()) && Experiments.O())
        {
            _placeUpdated = false;
            _title.setText(String.format(Resources.string(0x7f07043c), new Object[] {
                _pin.getPlace().getName()
            }));
            Object obj = getFragmentManager();
            if (_mapFragment == null && obj != null)
            {
                _mapContainer.setId(0x7f0f0010);
                _mapFragment = new MapFragment();
                _mapFragment.setMapListener(onMapReady);
                obj = ((FragmentManager) (obj)).beginTransaction();
                ((FragmentTransaction) (obj)).replace(_mapContainer.getId(), _mapFragment, null);
                ((FragmentTransaction) (obj)).commitAllowingStateLoss();
                _mapContainer.setVisibility(4);
            } else
            {
                showMapMarker();
            }
            loadRelatedPins();
            loadNearbyPins();
            _wrapper.setVisibility(0);
            setVisibility(0);
            return;
        } else
        {
            _wrapper.setVisibility(8);
            return;
        }
    }






/*
    static boolean access$402(PinCloseupNewPlaceModule pincloseupnewplacemodule, boolean flag)
    {
        pincloseupnewplacemodule._placeUpdated = flag;
        return flag;
    }

*/



    private class _cls2 extends FeedApiResponseHandler
    {

        final PinCloseupNewPlaceModule this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            if (_mapFragment != null)
            {
                GoogleMap googlemap = _mapFragment.getMap();
                LatLng latlng = new LatLng(_pinPlace.getLatitude().doubleValue(), _pinPlace.getLongitude().doubleValue());
                HashSet hashset = new HashSet();
                feed = feed.getItems().iterator();
                do
                {
                    if (!feed.hasNext())
                    {
                        break;
                    }
                    Place place = ((Pin)feed.next()).getPlace();
                    if (place != null)
                    {
                        hashset.add(new LatLng(place.getLatitude().doubleValue(), place.getLongitude().doubleValue()));
                    }
                } while (true);
                hashset.remove(latlng);
                feed = hashset.iterator();
                while (feed.hasNext()) 
                {
                    final Marker marker = (LatLng)feed.next();
                    marker = googlemap.addMarker((new MarkerOptions()).position(marker).icon(BitmapDescriptorFactory.fromResource(0x7f0201de)));
                    ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                        0.0F, 1.0F
                    });
                    valueanimator.setDuration((int)(Math.random() * 600D));
                    class _cls1
                        implements android.animation.ValueAnimator.AnimatorUpdateListener
                    {

                        final _cls2 this$1;
                        final Marker val$marker;

                        public void onAnimationUpdate(ValueAnimator valueanimator1)
                        {
                            marker.setAlpha(((Float)valueanimator1.getAnimatedValue()).floatValue());
                        }

                _cls1()
                {
                    this$1 = _cls2.this;
                    marker = marker1;
                    super();
                }
                    }

                    valueanimator.addUpdateListener(new _cls1());
                    valueanimator.start();
                }
            }
        }

        _cls2()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.fragment.MapFragment.Listener
    {

        final PinCloseupNewPlaceModule this$0;

        public void onReady()
        {
            showMapMarker();
        }

        _cls3()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
    {

        final PinCloseupNewPlaceModule this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            _pinGridView.setVisibility(8);
            _placeUpdated = true;
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            int i = feed.getCount();
            feed = feed.getItems();
            _pinGridView.setPins(feed);
            if (i < 4)
            {
                _pinGridView.setVisibility(8);
            }
        }

        _cls4()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }


    private class _cls5
        implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    {

        final PinCloseupNewPlaceModule this$0;

        public boolean onMarkerClick(Marker marker)
        {
            onMapClicked();
            return true;
        }

        _cls5()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }


    private class _cls6
        implements com.google.android.gms.maps.GoogleMap.OnMapClickListener
    {

        final PinCloseupNewPlaceModule this$0;

        public void onMapClick(LatLng latlng)
        {
            onMapClicked();
        }

        _cls6()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }


    private class _cls7
        implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
    {

        final PinCloseupNewPlaceModule this$0;
        final LatLng val$latLng;
        final GoogleMap val$map;

        public void onCameraChange(CameraPosition cameraposition)
        {
            map.setOnCameraChangeListener(null);
            cameraposition = map.getProjection().toScreenLocation(latLng);
            int i = ((Point) (cameraposition)).y;
            int j = (int)((float)_mapMarker.getMarkerHeight() / 2.0F);
            cameraposition = map.getProjection().fromScreenLocation(new Point(((Point) (cameraposition)).x, i - j));
            map.moveCamera(CameraUpdateFactory.newLatLng(cameraposition));
        }

        _cls7()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            map = googlemap;
            latLng = latlng;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final PinCloseupNewPlaceModule this$0;

        public void run()
        {
            _mapMarker.bringToFront();
            _mapContainer.setVisibility(0);
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.setDuration(Constants.ANIM_SPEED_FAST);
            class _cls1
                implements android.animation.ValueAnimator.AnimatorUpdateListener
            {

                final _cls8 this$1;

                public void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    _mapContainer.setAlpha(((Float)valueanimator1.getAnimatedValue()).floatValue());
                }

                _cls1()
                {
                    this$1 = _cls8.this;
                    super();
                }
            }

            valueanimator.addUpdateListener(new _cls1());
            valueanimator.start();
        }

        _cls8()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupNewPlaceModule this$0;

        public void onClick(View view)
        {
            onMapClicked();
        }

        _cls1()
        {
            this$0 = PinCloseupNewPlaceModule.this;
            super();
        }
    }

}
