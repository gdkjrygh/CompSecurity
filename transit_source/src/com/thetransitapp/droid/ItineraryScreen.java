// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.thetransitapp.droid.controller.ItineraryMapViewController;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.Schedule;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.util.BitmapUtility;
import com.thetransitapp.droid.util.PolylineUtility;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid:
//            BaseItinerariesScreen

public class ItineraryScreen extends BaseItinerariesScreen
    implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener, com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
{

    private List lines;
    private List otherMarkers;
    private LinearLayout routeContent;
    private List stopMarkers;
    private ItineraryMapViewController viewController;

    public ItineraryScreen()
    {
        super(TransitActivity.TransitScreen.ITINERARY_SCREEN);
        stopMarkers = new ArrayList();
        otherMarkers = new ArrayList();
        lines = new ArrayList();
    }

    private void centerMap(Stop stop)
    {
        Location location = super.getLastLocation();
        if (location != null && stop.getPlacemark().distanceTo(location) < 5000F)
        {
            Object obj = new com.google.android.gms.maps.model.LatLngBounds.Builder();
            ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include((new SimplePlacemark(location)).toLatLng());
            ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(stop.getPlacemark().toLatLng());
            if (!super.isCurrentLocation())
            {
                stop = new LatLng(location.getLatitude(), location.getLongitude());
                stop = (new MarkerOptions()).position(stop);
                otherMarkers.add(super.getMap().addMarker(stop));
            }
            stop = ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).build();
            obj = new DisplayMetrics();
            super.getActivity().getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
            routeContent.measure(-1, -2);
            int i = ((DisplayMetrics) (obj)).heightPixels;
            int j = routeContent.getMeasuredHeight();
            super.centerMap(stop, false, ((DisplayMetrics) (obj)).widthPixels, i - j * 4);
            return;
        } else
        {
            super.centerMap(stop.getPlacemark());
            return;
        }
    }

    private void clear()
    {
        Iterator iterator = stopMarkers.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        iterator = otherMarkers.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        iterator = lines.iterator();
_L7:
        if (!iterator.hasNext())
        {
            return;
        }
        break MISSING_BLOCK_LABEL_88;
_L2:
        ((Marker)iterator.next()).remove();
          goto _L5
_L4:
        ((Marker)iterator.next()).remove();
          goto _L6
        ((Polyline)iterator.next()).remove();
          goto _L7
    }

    private MarkerOptions createMarker(Stop stop, ScheduleItem scheduleitem, LatLng latlng, BitmapDescriptor bitmapdescriptor, boolean flag, boolean flag1)
    {
        bitmapdescriptor = (new MarkerOptions()).position(latlng).icon(bitmapdescriptor);
        if (!flag || flag1)
        {
            bitmapdescriptor.anchor(0.5F, 0.5F);
        }
        if (!flag || !flag1)
        {
            bitmapdescriptor.title(stop.getName());
        }
        if (scheduleitem == null) goto _L2; else goto _L1
_L1:
        latlng = "0|";
        if (!flag || flag1) goto _L4; else goto _L3
_L3:
        stop = "1|";
_L5:
        if (!scheduleitem.isFrequency())
        {
            bitmapdescriptor.snippet((new StringBuilder(String.valueOf(stop))).append(scheduleitem.getStopTime().getTime()).toString());
        }
        return bitmapdescriptor;
_L4:
        stop = latlng;
        if (!flag)
        {
            stop = latlng;
            if (flag1)
            {
                stop = "2|";
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        bitmapdescriptor.snippet("");
        return bitmapdescriptor;
    }

    private void drawItinerary(MergedItinerary mergeditinerary, int i)
    {
        PolylineOptions polylineoptions;
        PolylineOptions polylineoptions1;
        Itinerary itinerary;
        polylineoptions = new PolylineOptions();
        polylineoptions1 = new PolylineOptions();
        polylineoptions.color(-1);
        polylineoptions.width(getResources().getDimension(0x7f080020));
        polylineoptions1.color(i);
        polylineoptions1.width(getResources().getDimension(0x7f080021));
        clear();
        itinerary = viewController.getScheduleItem().getItinerary();
        Object obj = itinerary.getShape();
        if (obj != null)
        {
            obj = PolylineUtility.decodePoly(((String) (obj)));
            polylineoptions.addAll(((Iterable) (obj)));
            polylineoptions1.addAll(((Iterable) (obj)));
        }
        if (itinerary.getStops() == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        BitmapDescriptor bitmapdescriptor;
        com.thetransitapp.droid.model.ServiceDay serviceday;
        Iterator iterator;
        boolean flag;
        boolean flag2;
        bitmapdescriptor = BitmapDescriptorFactory.fromBitmap(BitmapUtility.getPin(i, getResources().getDimensionPixelSize(0x7f080024), getResources().getDimensionPixelSize(0x7f080025)));
        serviceday = viewController.getScheduleItem().getServiceDay();
        flag2 = polylineoptions1.getPoints().isEmpty();
        flag = true;
        obj1 = null;
        iterator = itinerary.getStops().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        lines.add(getMap().addPolyline(polylineoptions));
        lines.add(getMap().addPolyline(polylineoptions1));
        centerMap(mergeditinerary.getClosestStop());
        return;
_L3:
        Stop stop = (Stop)iterator.next();
        LatLng latlng = stop.getPlacemark().toLatLng();
        ScheduleItem scheduleitem = itinerary.getSchedule(stop, serviceday).getScheduleItemForTrip(viewController.getScheduleItem().getTripId());
        boolean flag3 = stop.equals(mergeditinerary.getClosestStop());
        Object obj2 = createMarker(stop, scheduleitem, latlng, bitmapdescriptor, flag3, flag);
        obj2 = getMap().addMarker(((MarkerOptions) (obj2)));
        stopMarkers.add(obj2);
        obj2 = obj1;
        if (obj1 != null)
        {
            obj2 = BitmapUtility.getDirectionArrow(i, ((SimplePlacemark) (obj1)).toLocation().bearingTo(stop.getPlacemark().toLocation()), getResources().getDimensionPixelSize(0x7f080026));
            LatLng latlng1 = ((SimplePlacemark) (obj1)).toLatLng();
            float f = 0.5F;
            float f1 = 0.5F;
            boolean flag1;
            if (latlng.longitude > ((SimplePlacemark) (obj1)).getLongitude())
            {
                f = 0.0F;
            } else
            if (latlng.longitude < ((SimplePlacemark) (obj1)).getLongitude())
            {
                f = 1.0F;
            }
            if (latlng.latitude > ((SimplePlacemark) (obj1)).getLatitude())
            {
                f1 = 0.0F;
            } else
            if (latlng.latitude < ((SimplePlacemark) (obj1)).getLatitude())
            {
                f1 = 1.0F;
            }
            obj1 = (new MarkerOptions()).position(latlng1).icon(BitmapDescriptorFactory.fromBitmap(((android.graphics.Bitmap) (obj2)))).anchor(f, f1);
            obj1 = getMap().addMarker(((MarkerOptions) (obj1)));
            otherMarkers.add(obj1);
            obj2 = null;
        }
        flag1 = flag;
        if (flag3)
        {
            flag1 = false;
            obj1 = createMarker(stop, scheduleitem, latlng, BitmapDescriptorFactory.defaultMarker(120F), flag3, false);
            obj1 = getMap().addMarker(((MarkerOptions) (obj1)));
            ((Marker) (obj1)).showInfoWindow();
            otherMarkers.add(obj1);
            obj2 = stop.getPlacemark();
        }
        flag = flag1;
        obj1 = obj2;
        if (flag2)
        {
            polylineoptions.add(latlng);
            polylineoptions1.add(latlng);
            flag = flag1;
            obj1 = obj2;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        super.onCameraChange(cameraposition);
        if (stopMarkers.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = false;
        if (cameraposition.zoom > viewController.getMarkerZoomLevel())
        {
            flag = true;
        }
        if (((Marker)stopMarkers.get(0)).isVisible() == flag) goto _L2; else goto _L3
_L3:
        cameraposition = stopMarkers.iterator();
_L6:
        if (cameraposition.hasNext()) goto _L4; else goto _L2
_L2:
        return;
_L4:
        ((Marker)cameraposition.next()).setVisible(flag);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPause()
    {
        super.onPause();
        clear();
    }

    public void onRouteClick(View view)
    {
        viewController.changeDirection();
    }

    public void onStart()
    {
        super.onStart();
        Object obj = super.getArguments();
        if (obj != null)
        {
            ScheduleItem scheduleitem = null;
            boolean flag;
            if (((Bundle) (obj)).containsKey("scheduleItem"))
            {
                flag = false;
            } else
            {
                flag = true;
            }
            if (flag)
            {
                routeContent.setOnClickListener(new android.view.View.OnClickListener() {

                    final ItineraryScreen this$0;

                    public void onClick(View view)
                    {
                        viewController.changeDirection();
                    }

            
            {
                this$0 = ItineraryScreen.this;
                super();
            }
                });
            } else
            {
                scheduleitem = (ScheduleItem)((Bundle) (obj)).getSerializable("scheduleItem");
            }
            if (((Bundle) (obj)).containsKey("route"))
            {
                obj = (NearbyRouteViewModel)((Bundle) (obj)).get("route");
                viewController.init(this, ((NearbyRouteViewModel) (obj)), scheduleitem);
            }
        }
    }

    public void showDirection(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        drawItinerary(nearbyrouteviewmodel.getCurrentItinerary(), nearbyrouteviewmodel.getPathColor());
    }

}
