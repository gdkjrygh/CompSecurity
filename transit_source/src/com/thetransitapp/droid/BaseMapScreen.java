// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.app.Activity;
import android.location.Location;
import android.view.View;
import android.widget.ImageButton;
import com.bricolsoftconsulting.geocoderplus.Area;
import com.bricolsoftconsulting.geocoderplus.Position;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.thetransitapp.droid.model.SimplePlacemark;

// Referenced classes of package com.thetransitapp.droid:
//            BaseFragment, TransitActivity

public abstract class BaseMapScreen extends BaseFragment
    implements com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener, com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{

    private TransitActivity activity;
    private ImageButton currentLocationButton;
    private boolean fromLocationChange;
    private boolean tracking;

    public BaseMapScreen()
    {
    }

    public BaseMapScreen(TransitActivity.TransitScreen transitscreen)
    {
        super(transitscreen);
    }

    public void centerMap(double d, double d1)
    {
        centerMap(d, d1, 16F, false);
    }

    public void centerMap(double d, double d1, float f, boolean flag)
    {
        if (getMap() == null)
        {
            return;
        }
        com.google.android.gms.maps.CameraUpdate cameraupdate = CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(d, d1), f, 0.0F, 0.0F));
        if (flag)
        {
            getMap().animateCamera(cameraupdate);
            return;
        } else
        {
            getMap().moveCamera(cameraupdate);
            return;
        }
    }

    public void centerMap(Location location)
    {
        centerMap(location, 16F, false);
    }

    public void centerMap(Location location, float f, boolean flag)
    {
        centerMap(location.getLatitude(), location.getLongitude(), f, flag);
    }

    public void centerMap(Area area)
    {
        if (getMap() == null)
        {
            return;
        } else
        {
            LatLng latlng = new LatLng(area.getNorthEast().getLatitude(), area.getNorthEast().getLongitude());
            area = new LatLngBounds(new LatLng(area.getSouthWest().getLatitude(), area.getSouthWest().getLongitude()), latlng);
            getMap().moveCamera(CameraUpdateFactory.newLatLngBounds(area, 10));
            return;
        }
    }

    public void centerMap(LatLngBounds latlngbounds, boolean flag, int i, int j)
    {
        if (getMap() == null)
        {
            return;
        }
        LatLng latlng = latlngbounds.southwest;
        LatLng latlng1 = latlngbounds.northeast;
        double d = Math.abs(latlng.latitude - latlng1.latitude);
        double d1 = Math.abs(latlng.longitude - latlng1.longitude);
        if (d < 0.0050000000000000001D)
        {
            latlngbounds = new LatLngBounds(new LatLng(latlng.latitude - (0.0050000000000000001D - d / 2D), latlng.longitude), new LatLng(latlng1.latitude + (0.0050000000000000001D - d / 2D), latlng1.longitude));
        } else
        if (d1 < 0.0050000000000000001D)
        {
            latlngbounds = new LatLngBounds(new LatLng(latlng.latitude, latlng.longitude - (0.0050000000000000001D - d1 / 2D)), new LatLng(latlng1.latitude, latlng1.longitude + (0.0050000000000000001D - d1 / 2D)));
        }
        latlngbounds = CameraUpdateFactory.newLatLngBounds(latlngbounds, i, j, 10);
        if (flag)
        {
            getMap().animateCamera(latlngbounds);
            return;
        } else
        {
            getMap().moveCamera(latlngbounds);
            return;
        }
    }

    public void centerMap(SimplePlacemark simpleplacemark)
    {
        centerMap(simpleplacemark.getLatitude(), simpleplacemark.getLongitude(), 16F, false);
    }

    public void displayError(String s, String s1, String s2, com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener onerrorbuttonclicklistener)
    {
        activity.displayError(s, s1, s2, onerrorbuttonclicklistener);
    }

    public Location getLastLocation()
    {
        return activity.getLastLocation();
    }

    public GoogleMap getMap()
    {
        return activity.getMap();
    }

    public Location getRealLocation()
    {
        return activity.getRealLocation();
    }

    public void hideError()
    {
        activity.hideError();
    }

    public void hidePopover(boolean flag)
    {
        activity.hidePopover(flag);
    }

    public boolean isCurrentLocation()
    {
        return activity.isCurrentLocation();
    }

    public boolean isLocationServiceConnecting()
    {
        return activity.isLocationServiceAvailable();
    }

    public boolean isTracking()
    {
        return tracking;
    }

    public void onAttach(Activity activity1)
    {
        super.onAttach(activity1);
        activity = (TransitActivity)activity1;
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        if (tracking && getMap() != null)
        {
            Location location = getMap().getMyLocation();
            if (location != null && (new SimplePlacemark(cameraposition.target)).distanceTo(location) > 100F)
            {
                tracking = false;
                currentLocationButton.setImageResource(0x7f02009c);
            }
        }
        if (!fromLocationChange)
        {
            super.hideKeyboard();
        }
        fromLocationChange = false;
    }

    public void onMyLocationChange(Location location)
    {
        if (tracking && isVisible())
        {
            fromLocationChange = true;
            centerMap(location, getMap().getCameraPosition().zoom, true);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (getMap() != null && currentLocationButton != null)
        {
            getMap().setMyLocationEnabled(false);
            getMap().setOnMyLocationChangeListener(null);
            getMap().setOnCameraChangeListener(null);
        }
    }

    public void onResume()
    {
        super.onResume();
        if (getMap() != null)
        {
            currentLocationButton = (ImageButton)getView().findViewById(0x7f05008c);
            if (currentLocationButton != null)
            {
                currentLocationButton.setOnClickListener(new android.view.View.OnClickListener() {

                    final BaseMapScreen this$0;

                    public void onClick(View view)
                    {
                        view = BaseMapScreen.this;
                        int i;
                        boolean flag;
                        if (tracking)
                        {
                            flag = false;
                        } else
                        {
                            flag = true;
                        }
                        view.tracking = flag;
                        view = currentLocationButton;
                        if (tracking)
                        {
                            i = 0x7f0200a0;
                        } else
                        {
                            i = 0x7f02009f;
                        }
                        view.setImageResource(i);
                        if (getMap().getMyLocation() != null)
                        {
                            onMyLocationChange(getMap().getMyLocation());
                        }
                    }

            
            {
                this$0 = BaseMapScreen.this;
                super();
            }
                });
                getMap().setMyLocationEnabled(true);
                getMap().setOnMyLocationChangeListener(this);
                getMap().setOnCameraChangeListener(this);
            }
        }
    }

    public void onStart()
    {
        super.onStart();
        hideError();
    }

    public void showLocationServiceError()
    {
        activity.showLocationServiceError();
    }

    public void showPopover(View view, View view1, Integer integer)
    {
        activity.showPopover(view, view1, integer);
    }



}
