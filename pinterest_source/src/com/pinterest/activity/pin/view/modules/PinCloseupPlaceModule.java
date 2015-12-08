// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.pin.view.modules.util.IconDoubleTextCellView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.Place;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.MapFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.IconView;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupBaseModule

public class PinCloseupPlaceModule extends PinCloseupBaseModule
    implements android.view.View.OnClickListener
{

    public static final int MARKER_SIZE = (int)(36F * Device.getDensity());
    LinearLayout _attributionWrapper;
    private ViewGroup _mapContainer;
    private MapFragment _mapFragment;
    private Marker _mapMarker;
    private IconView _navigateBt;
    private IconDoubleTextCellView _phoneNumber;
    private IconDoubleTextCellView _website;
    private FrameLayout _wrapper;
    private com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClicked;
    private com.google.android.gms.maps.GoogleMap.OnMapClickListener onMapClicked;
    private com.pinterest.fragment.MapFragment.Listener onMapReady;
    private com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClicked;

    public PinCloseupPlaceModule(Context context)
    {
        super(context);
        onMapReady = new _cls3();
        onInfoWindowClicked = new _cls4();
        onMapClicked = new _cls5();
        onMarkerClicked = new _cls6();
        int i = (int)Resources.dimension(0x7f0a018a);
        _padding.left = i;
        _padding.right = i;
        _padding.top = (int)Resources.dimension(0x7f0a0186);
    }

    private com.google.android.gms.maps.GoogleMap.OnCameraChangeListener makeMapListener(final GoogleMap map, final LatLng latLng)
    {
        return new _cls7();
    }

    private void onMapClicked()
    {
        (new com.pinterest.activity.board.fragment.BoardMapFragment.PinCloseupMarkerClickListener(_pin)).onClick();
    }

    private void showMapMarker()
    {
        Object obj = _pin.getPlace();
        if (obj != null && _mapFragment != null)
        {
            GoogleMap googlemap = _mapFragment.getMap();
            if (googlemap != null && ((Place) (obj)).getLatitude() != null && ((Place) (obj)).getLongitude() != null)
            {
                googlemap.getUiSettings().setAllGesturesEnabled(false);
                googlemap.setOnMarkerClickListener(onMarkerClicked);
                googlemap.setOnMapClickListener(onMapClicked);
                googlemap.setOnInfoWindowClickListener(onInfoWindowClicked);
                googlemap.setInfoWindowAdapter(new CloseupInfoWindowAdapter(getContext(), ((Place) (obj))));
                obj = new LatLng(((Place) (obj)).getLatitude().doubleValue(), ((Place) (obj)).getLongitude().doubleValue());
                googlemap.setOnCameraChangeListener(makeMapListener(googlemap, ((LatLng) (obj))));
                googlemap.moveCamera(CameraUpdateFactory.newLatLngZoom(((LatLng) (obj)), 15F));
                obj = (new MarkerOptions()).position(((LatLng) (obj))).icon(BitmapDescriptorFactory.fromResource(0x7f0201cc));
                if (_mapMarker != null)
                {
                    _mapMarker.remove();
                }
                _mapMarker = googlemap.addMarker(((MarkerOptions) (obj)));
                _mapMarker.showInfoWindow();
            }
        }
    }

    protected ComponentType getComponentType()
    {
        return ComponentType.PIN_CLOSEUP_PLACE;
    }

    protected boolean hasContent()
    {
        return _pin != null && _pin.showMap().booleanValue() && !Experiments.O();
    }

    protected void initView()
    {
        setBackgroundColor(Colors.WHITE);
        removeAllViews();
        setOrientation(1);
        _wrapper = new FrameLayout(getContext());
        addView(_wrapper, -1, -2);
        _mapContainer = new FrameLayout(getContext());
        _wrapper.addView(_mapContainer, -1, (int)Resources.dimension(0x7f0a0196));
        _navigateBt = new IconView(getContext(), null, 0x7f0b015d);
        _navigateBt.setImageResource(0x7f020183);
        _navigateBt.setOnClickListener(this);
        _navigateBt.setBackgroundResource(0x7f020064);
        _navigateBt.setPadding(Constants.MARGIN, Constants.MARGIN, Constants.MARGIN, Constants.MARGIN);
        _wrapper.addView(_navigateBt, Constants.BUTTON_HEIGHT + Constants.MARGIN_HALF, Constants.BUTTON_HEIGHT + Constants.MARGIN_HALF);
        Object obj = (android.widget.FrameLayout.LayoutParams)_navigateBt.getLayoutParams();
        ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(0, 0, Constants.MARGIN, Constants.MARGIN);
        obj.gravity = 85;
        _navigateBt.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        int i = (int)Resources.dimension(0x7f0a018a);
        _attributionWrapper = new LinearLayout(getContext());
        _attributionWrapper.setPadding(i, i, i, 0);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0F);
        _phoneNumber = new IconDoubleTextCellView(getContext());
        _phoneNumber.showImage(false);
        _phoneNumber.setPadding(0, 0, i, 0);
        _phoneNumber.setVisibility(8);
        _attributionWrapper.addView(_phoneNumber, ((android.view.ViewGroup.LayoutParams) (obj)));
        _website = new IconDoubleTextCellView(getContext());
        _website.showImage(false);
        _website.setPadding(0, 0, 0, 0);
        _website.setVisibility(8);
        _attributionWrapper.addView(_website, ((android.view.ViewGroup.LayoutParams) (obj)));
        addView(_attributionWrapper, -1, -2);
        _attributionWrapper.setVisibility(8);
        setVisibility(8);
    }

    public void onClick(View view)
    {
        if (view == _navigateBt)
        {
            Pinalytics.a(ElementType.MAP_DIRECTIONS_BUTTON, null, _pin.getUid());
            ActivityHelper.goIntentPlace(getContext(), _pinPlace);
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

    protected boolean shouldUpdateView()
    {
        return true;
    }

    protected void updateView()
    {
        int j = 1;
        boolean flag = false;
        if (BooleanUtils.isTrue(_pin.showMap()) && !Experiments.O())
        {
            Object obj = getFragmentManager();
            if (_mapFragment == null && obj != null)
            {
                _mapContainer.setId(0x7f0f0010);
                _mapFragment = new PinCloseupMapFragment();
                _mapFragment.setMapListener(onMapReady);
                obj = ((FragmentManager) (obj)).beginTransaction();
                ((FragmentTransaction) (obj)).replace(_mapContainer.getId(), _mapFragment, null);
                ((FragmentTransaction) (obj)).commitAllowingStateLoss();
            } else
            {
                showMapMarker();
            }
            _wrapper.setVisibility(0);
            setVisibility(0);
            if (_pinPlace != null)
            {
                Object obj1 = _pinPlace.getPhone();
                int i;
                if (ModelHelper.isValid(obj1))
                {
                    _phoneNumber.setTitle(Resources.string(0x7f0703ea));
                    _phoneNumber.setSubTitle(((String) (obj1)));
                    _phoneNumber.setOnClickListener(new _cls1());
                    _phoneNumber.setVisibility(0);
                    i = 1;
                } else
                {
                    _phoneNumber.setVisibility(8);
                    i = 0;
                }
                obj1 = _pinPlace.getUrl();
                if (ModelHelper.isValid(obj1))
                {
                    _website.setTitle(Resources.string(0x7f0705ee));
                    _website.setSubTitle(((String) (obj1)));
                    _website.setOnClickListener(new _cls2());
                    _website.setVisibility(0);
                    i = j;
                } else
                {
                    _website.setVisibility(8);
                }
                obj1 = _attributionWrapper;
                if (i != 0)
                {
                    j = 0;
                } else
                {
                    j = 8;
                }
                ((LinearLayout) (obj1)).setVisibility(j);
                if (i != 0)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 8;
                }
                setVisibility(i);
                return;
            } else
            {
                _phoneNumber.setVisibility(8);
                _website.setVisibility(8);
                setVisibility(8);
                return;
            }
        } else
        {
            _wrapper.setVisibility(8);
            return;
        }
    }





    private class _cls3
        implements com.pinterest.fragment.MapFragment.Listener
    {

        final PinCloseupPlaceModule this$0;

        public void onReady()
        {
            showMapMarker();
        }

        _cls3()
        {
            this$0 = PinCloseupPlaceModule.this;
            super();
        }
    }


    private class _cls4
        implements com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    {

        final PinCloseupPlaceModule this$0;

        public void onInfoWindowClick(Marker marker)
        {
            onMapClicked();
        }

        _cls4()
        {
            this$0 = PinCloseupPlaceModule.this;
            super();
        }
    }


    private class _cls5
        implements com.google.android.gms.maps.GoogleMap.OnMapClickListener
    {

        final PinCloseupPlaceModule this$0;

        public void onMapClick(LatLng latlng)
        {
            _mapMarker.showInfoWindow();
            onMapClicked();
        }

        _cls5()
        {
            this$0 = PinCloseupPlaceModule.this;
            super();
        }
    }


    private class _cls6
        implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    {

        final PinCloseupPlaceModule this$0;

        public boolean onMarkerClick(Marker marker)
        {
            onMapClicked();
            return true;
        }

        _cls6()
        {
            this$0 = PinCloseupPlaceModule.this;
            super();
        }
    }


    private class _cls7
        implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
    {

        final PinCloseupPlaceModule this$0;
        final LatLng val$latLng;
        final GoogleMap val$map;

        public void onCameraChange(CameraPosition cameraposition)
        {
            cameraposition = map.getProjection();
            Point point = cameraposition.toScreenLocation(latLng);
            point.offset(0, -PinCloseupPlaceModule.MARKER_SIZE / 2);
            cameraposition = cameraposition.fromScreenLocation(point);
            map.setOnCameraChangeListener(null);
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(cameraposition, 15F));
        }

        _cls7()
        {
            this$0 = PinCloseupPlaceModule.this;
            map = googlemap;
            latLng = latlng;
            super();
        }
    }


    private class CloseupInfoWindowAdapter
        implements com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    {

        private final BasicMapInfoView _infoView;
        Place _place;

        public View getInfoContents(Marker marker)
        {
            return null;
        }

        public View getInfoWindow(Marker marker)
        {
            if (_place == null)
            {
                return null;
            } else
            {
                return _infoView.populate(_place);
            }
        }

        public CloseupInfoWindowAdapter(Context context, Place place)
        {
            _infoView = (BasicMapInfoView)ViewHelper.viewById(context, 0x7f0301c4);
            _place = place;
        }
    }


    private class PinCloseupMapFragment extends MapFragment
    {

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            viewgroup = super.onCreateView(layoutinflater, viewgroup, bundle);
            layoutinflater = new FrameLayout(getActivity());
            layoutinflater.addView(viewgroup, new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewgroup = new FrameLayout(getActivity());
            viewgroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewgroup.setBackgroundResource(0x7f02029a);
            layoutinflater.addView(viewgroup);
            return layoutinflater;
        }

        public PinCloseupMapFragment()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PinCloseupPlaceModule this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PHONE_BUTTON, null, _pin.getUid());
            ActivityHelper.goIntentView(getContext(), (new StringBuilder("tel:")).append(_pinPlace.getPhone()).toString());
        }

        _cls1()
        {
            this$0 = PinCloseupPlaceModule.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PinCloseupPlaceModule this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.WEBSITE_BUTTON, null, _pin.getUid());
            Events.post(new Navigation(Location.BROWSER, _pinPlace.getUrl()));
        }

        _cls2()
        {
            this$0 = PinCloseupPlaceModule.this;
            super();
        }
    }

}
