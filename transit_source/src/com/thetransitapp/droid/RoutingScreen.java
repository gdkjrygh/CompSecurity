// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Base64InputStream;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.crashlytics.android.Crashlytics;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.thetransitapp.droid.controller.FeedManager;
import com.thetransitapp.droid.model.RoutingItinerary;
import com.thetransitapp.droid.model.RoutingLeg;
import com.thetransitapp.droid.model.RoutingRequest;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitServer;
import com.thetransitapp.droid.model.stats.StatsManager;
import com.thetransitapp.droid.model.viewmodel.RouteViewModel;
import com.thetransitapp.droid.service.RoutingTask;
import com.thetransitapp.droid.service.ServiceCallback;
import com.thetransitapp.droid.util.BitmapUtility;
import com.thetransitapp.droid.util.PolylineUtility;
import com.thetransitapp.droid.util.ShieldUtility;
import com.thetransitapp.droid.widget.RoutingDetails;
import com.thetransitapp.droid.widget.RoutingSearch;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen

public class RoutingScreen extends BaseMapScreen
    implements ServiceCallback, com.thetransitapp.droid.widget.RoutingDetails.OnDetailClickListener, com.thetransitapp.droid.widget.RoutingSearch.RoutingSearchDelegate
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType[];
    public static final String LAST_ROUTING_KEY = "lastRouting";
    private RoutingItinerary currentShownItinerary;
    private MenuItem directionMenuItem;
    private List drawnMarkers;
    private List drawnPoly;
    private FeedManager feedManager;
    private List legMarkers;
    private RoutingRequest oldDirectionLoaded;
    private SharedPreferences preferences;
    private Button routeButton;
    private RoutingDetails routingDetails;
    private RoutingSearch routingSearch;
    private ShieldUtility shieldUtility;
    private StatsManager statsManager;
    private MenuItem stepsMenuItem;
    private MenuItem timeMenuItem;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.thetransitapp.droid.model.RoutingRequest.ErrorType.values().length];
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.DIRECTION_UNAVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.MESSAGE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.NO_INTERNET.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.OUT_OF_SERVICE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.REGION_IN_MAINTENANCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.REGION_UNSUPPORTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.TIMEOUT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.thetransitapp.droid.model.RoutingRequest.ErrorType.UNAUTHORIZED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType = ai;
        return ai;
    }

    public RoutingScreen()
    {
        super(TransitActivity.TransitScreen.ROUTING_SCREEN);
        drawnPoly = new ArrayList();
        drawnMarkers = new ArrayList();
        legMarkers = new ArrayList();
        oldDirectionLoaded = null;
        super.setHasOptionsMenu(true);
    }

    private void addMarkers(RoutingItinerary routingitinerary)
    {
        if (!routingitinerary.getLegs().isEmpty())
        {
            int i = routingitinerary.getLegs().size();
            Object obj = ((RoutingLeg)routingitinerary.getLegs().get(0)).getFromPlacemark().toLatLng();
            routingitinerary = ((RoutingLeg)routingitinerary.getLegs().get(i - 1)).getToPlacemark().toLatLng();
            Object obj1 = LatLngBounds.builder();
            ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj1)).include(((com.google.android.gms.maps.model.LatLng) (obj)));
            ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj1)).include(routingitinerary);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            super.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            if (super.getView() != null && super.isVisible())
            {
                super.getView().measure(-1, -2);
                int j = displaymetrics.heightPixels;
                int k = super.getView().getMeasuredHeight();
                int l = (int)((double)Math.min(getView().getWidth(), getView().getHeight()) * 0.10000000000000001D);
                obj1 = CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj1)).build(), displaymetrics.widthPixels, j - k * 2, l);
                try
                {
                    getMap().moveCamera(((com.google.android.gms.maps.CameraUpdate) (obj1)));
                }
                catch (Exception exception)
                {
                    Log.e(com/thetransitapp/droid/RoutingScreen.getSimpleName(), exception.getMessage(), exception);
                    Crashlytics.logException(exception);
                }
                obj = (new MarkerOptions()).icon(BitmapDescriptorFactory.defaultMarker(120F)).position(((com.google.android.gms.maps.model.LatLng) (obj)));
                legMarkers.add(getMap().addMarker(((MarkerOptions) (obj))));
                routingitinerary = (new MarkerOptions()).icon(BitmapDescriptorFactory.defaultMarker(0.0F)).position(routingitinerary);
                legMarkers.add(getMap().addMarker(routingitinerary));
            }
        }
    }

    private void clearDrawing()
    {
        Iterator iterator = drawnPoly.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        iterator = drawnMarkers.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        iterator = legMarkers.iterator();
_L7:
        if (!iterator.hasNext())
        {
            drawnPoly.clear();
            drawnMarkers.clear();
            legMarkers.clear();
            getShieldUtility().clear();
            return;
        }
        break MISSING_BLOCK_LABEL_122;
_L2:
        ((Polyline)iterator.next()).remove();
          goto _L5
_L4:
        ((Marker)iterator.next()).remove();
          goto _L6
        ((Marker)iterator.next()).remove();
          goto _L7
    }

    private void onError(com.thetransitapp.droid.model.RoutingRequest.ErrorType errortype, String s, String s1)
    {
        int i;
        int k;
        if (errortype == null)
        {
            if (super.getView().getVisibility() != 0)
            {
                super.getView().setVisibility(0);
                super.hideError();
            }
            return;
        }
        k = -1;
        i = -1;
        $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType()[errortype.ordinal()];
        JVM INSTR tableswitch 1 8: default 88
    //                   1 207
    //                   2 207
    //                   3 88
    //                   4 194
    //                   5 88
    //                   6 88
    //                   7 233
    //                   8 220;
           goto _L1 _L2 _L2 _L1 _L3 _L1 _L1 _L4 _L5
_L1:
        int j;
        if (s == null)
        {
            k = 0x7f0a0076;
        }
        j = k;
        if (s1 == null)
        {
            i = 0x7f0a0086;
            j = k;
        }
_L8:
        if (j != -1)
        {
            s = super.getString(j);
        }
        if (i != -1)
        {
            s1 = super.getString(i);
        }
        $SWITCH_TABLE$com$thetransitapp$droid$model$RoutingRequest$ErrorType()[errortype.ordinal()];
        JVM INSTR tableswitch 7 8: default 172
    //                   7 246
    //                   8 246;
           goto _L6 _L7 _L7
_L6:
        super.displayError(s, s1, super.getString(0x7f0a002f), new com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener() {

            final RoutingScreen this$0;

            public void onErrorButtonClick()
            {
                hideError();
            }

            
            {
                this$0 = RoutingScreen.this;
                super();
            }
        });
        return;
_L3:
        j = 0x7f0a0036;
        i = 0x7f0a0085;
          goto _L8
_L2:
        j = 0x7f0a007e;
        i = 0x7f0a0084;
          goto _L8
_L5:
        j = 0x7f0a0072;
        i = 0x7f0a0073;
          goto _L8
_L4:
        j = 0x7f0a0074;
        i = 0x7f0a0075;
          goto _L8
_L7:
        super.getString(0x7f0a0071);
        new com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener() {

            final RoutingScreen this$0;

            public void onErrorButtonClick()
            {
                hideError();
                onRouteClick();
            }

            
            {
                this$0 = RoutingScreen.this;
                super();
            }
        };
          goto _L6
    }

    private void saveResult(RoutingRequest routingrequest)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            Object obj = new ObjectOutputStream(bytearrayoutputstream);
            ((ObjectOutputStream) (obj)).writeObject(routingrequest);
            routingrequest = bytearrayoutputstream.toByteArray();
            ((ObjectOutputStream) (obj)).close();
            bytearrayoutputstream.close();
            bytearrayoutputstream = new ByteArrayOutputStream();
            obj = new Base64OutputStream(bytearrayoutputstream, 0);
            ((Base64OutputStream) (obj)).write(routingrequest);
            ((Base64OutputStream) (obj)).close();
            bytearrayoutputstream.close();
            preferences.edit().putString("lastRouting", new String(bytearrayoutputstream.toByteArray())).commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RoutingRequest routingrequest)
        {
            routingrequest.printStackTrace();
        }
    }

    public void clear()
    {
        currentShownItinerary = null;
        clearDrawing();
    }

    public ShieldUtility getShieldUtility()
    {
        if (shieldUtility == null)
        {
            shieldUtility = new ShieldUtility(super.getMap(), super.getActivity());
        }
        return shieldUtility;
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        super.onCameraChange(cameraposition);
        if (drawnMarkers.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = false;
        if (cameraposition.zoom > 15.5F)
        {
            flag = true;
        }
        if (((Marker)drawnMarkers.get(0)).isVisible() == flag) goto _L2; else goto _L3
_L3:
        cameraposition = drawnMarkers.iterator();
_L7:
        if (cameraposition.hasNext()) goto _L4; else goto _L2
_L2:
        if (currentShownItinerary == null) goto _L6; else goto _L5
_L5:
        getShieldUtility().clear();
        cameraposition = currentShownItinerary.getLegs().iterator();
_L8:
        if (cameraposition.hasNext())
        {
            break MISSING_BLOCK_LABEL_124;
        }
_L6:
        return;
_L4:
        ((Marker)cameraposition.next()).setVisible(flag);
          goto _L7
        RoutingLeg routingleg = (RoutingLeg)cameraposition.next();
        getShieldUtility().draw(routingleg);
          goto _L8
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = true;
        super.onCreateOptionsMenu(menu, menuinflater);
        menuinflater = menu.add(0, 0, 0, 0x7f0a0032).setIcon(0x7f020097).setShowAsActionFlags(2);
        boolean flag;
        if (routingDetails == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        directionMenuItem = menuinflater.setVisible(flag);
        menuinflater = menu.add(0, 1, 0, 0x7f0a004b).setIcon(0x7f020094).setShowAsActionFlags(2);
        if (routingDetails == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        timeMenuItem = menuinflater.setVisible(flag);
        menu = menu.add(0, 2, 0, 0x7f0a004a).setIcon(0x7f020096).setShowAsActionFlags(2);
        if (routingDetails != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        stepsMenuItem = menu.setVisible(flag);
        if (routingSearch != null)
        {
            directionMenuItem.setOnMenuItemClickListener(routingSearch);
            timeMenuItem.setOnMenuItemClickListener(routingSearch);
        }
        if (routingDetails != null)
        {
            stepsMenuItem.setOnMenuItemClickListener(routingDetails);
        }
    }

    public void onDetailClick(RoutingItinerary routingitinerary)
    {
        showItinerary(routingitinerary);
    }

    public void onError(String s, Exception exception)
    {
        Toast.makeText(super.getActivity(), s, 1).show();
    }

    public void onLegClick(RoutingLeg routingleg)
    {
        if (shieldUtility != null)
        {
            shieldUtility.clear();
        }
        DisplayMetrics displaymetrics = new DisplayMetrics();
        super.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        View view = super.getView().findViewById(0x7f050091);
        view.measure(-1, -2);
        int i = view.getMeasuredHeight();
        super.centerMap(routingleg.getBounds(), true, displaymetrics.widthPixels, displaymetrics.heightPixels - i * 2);
    }

    public void onPause()
    {
        super.onPause();
        clearDrawing();
        if (routingSearch != null)
        {
            routingSearch.onPause();
        }
    }

    public void onResult(RoutingRequest routingrequest)
    {
        onError(routingrequest.getError(), routingrequest.getErrorTitle(), routingrequest.getErrorMessage());
        if (routingrequest.getItineraries() != null && !routingrequest.getItineraries().isEmpty())
        {
            super.getSherlockActivity().getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            routingDetails = new RoutingDetails();
            routingDetails.setOnDetailClickListener(this);
            routingDetails.setPossibleItineraries(routingrequest.getItineraries());
            routingDetails.setDisplayedItinerary((RoutingItinerary)routingrequest.getItineraries().get(0));
            if (stepsMenuItem != null)
            {
                stepsMenuItem.setOnMenuItemClickListener(routingDetails);
            }
            FragmentTransaction fragmenttransaction = super.getActivity().getSupportFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f050091, routingDetails);
            fragmenttransaction.addToBackStack(TransitActivity.TransitScreen.ROUTING_SCREEN_DETAILS.name());
            fragmenttransaction.commit();
            showItinerary((RoutingItinerary)routingrequest.getItineraries().get(0));
        }
        if (oldDirectionLoaded == null)
        {
            saveResult(routingrequest);
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((RoutingRequest)obj);
    }

    public void onResume()
    {
        super.onResume();
        boolean flag = feedManager.isSelectionChanged();
        if (routingSearch != null)
        {
            routingSearch.setDelegate(this);
        }
        if (oldDirectionLoaded != null && routingDetails == null && !flag)
        {
            onResult(oldDirectionLoaded);
        }
        if (routingDetails != null && routingDetails.isVisible())
        {
            super.getSherlockActivity().getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            if (flag)
            {
                super.getFragmentManager().popBackStack();
                routeButton.performClick();
            } else
            if (currentShownItinerary != null)
            {
                showItinerary(currentShownItinerary);
                return;
            }
        }
    }

    public void onRouteClick()
    {
        RoutingRequest routingrequest = routingSearch.getRoutingRequest();
        if (routingrequest != null)
        {
            if (feedManager.isReady())
            {
                routingrequest.setFeedId(feedManager.getClosestBundle().getServer().getRouterId());
            }
            Date date;
            Date date1;
            if (routingrequest.isArriveBy())
            {
                date = null;
            } else
            {
                date = routingrequest.getDate();
            }
            if (routingrequest.isArriveBy())
            {
                date1 = routingrequest.getDate();
            } else
            {
                date1 = null;
            }
            statsManager.recordPlanRequest(routingrequest.getStart().toLatLng(), routingrequest.getEnd().toLatLng(), date, date1);
            (new RoutingTask(super.getActivity(), routingrequest, this)).execute();
        }
    }

    public void onStart()
    {
        super.onStart();
        android.location.Location location = super.getLastLocation();
        if (location != null && routingDetails == null)
        {
            super.centerMap(location);
            feedManager.refresh(location, super.getActivity());
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (routingSearch != null)
        {
            return;
        }
        view = preferences.getString("lastRouting", "{}").getBytes();
        if (view.length == 0) goto _L2; else goto _L1
_L1:
        long l;
        bundle = new ByteArrayInputStream(view);
        Base64InputStream base64inputstream = new Base64InputStream(bundle, 0);
        ObjectInputStream objectinputstream = new ObjectInputStream(base64inputstream);
        view = (RoutingRequest)objectinputstream.readObject();
        objectinputstream.close();
        base64inputstream.close();
        bundle.close();
        l = (new Date()).getTime();
        boolean flag = false;
        bundle = view.getItineraries().iterator();
_L4:
        if (bundle.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        boolean flag1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        try
        {
            oldDirectionLoaded = view;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
_L2:
        if (super.getArguments() != null)
        {
            view = new Bundle(super.getArguments());
        } else
        {
            view = new Bundle();
        }
        if (oldDirectionLoaded != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.putBoolean("oldDirectionLoaded", flag1);
        routingSearch = new RoutingSearch();
        routingSearch.setArguments(view);
        view = super.getActivity().getSupportFragmentManager().beginTransaction();
        view.replace(0x7f050091, routingSearch);
        view.commit();
        routeButton.setEnabled(false);
        routeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RoutingScreen this$0;

            public void onClick(View view1)
            {
                onRouteClick();
            }

            
            {
                this$0 = RoutingScreen.this;
                super();
            }
        });
        return;
        if (((RoutingItinerary)bundle.next()).getEndTime().getTime() <= l - 0x2bf20L) goto _L4; else goto _L3
_L3:
        flag = true;
          goto _L5
        preferences.edit().remove("lastRouting").commit();
          goto _L2
    }

    public void routeButtonStatusChange(boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag4 = false;
        Button button;
        boolean flag3;
        byte byte0;
        if (flag2 && flag && !flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        routeButton.setEnabled(flag);
        button = routeButton;
        if (flag1)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        button.setVisibility(byte0);
        if (directionMenuItem != null)
        {
            MenuItem menuitem = directionMenuItem;
            if (flag1)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            menuitem.setVisible(flag);
            menuitem = timeMenuItem;
            if (flag1)
            {
                flag = flag4;
            } else
            {
                flag = true;
            }
            menuitem.setVisible(flag);
            stepsMenuItem.setVisible(flag1);
        }
        if (flag3)
        {
            onRouteClick();
        }
    }

    public void shouldClearItineraries()
    {
        clear();
        oldDirectionLoaded = null;
        routingDetails = null;
    }

    public void showItinerary(RoutingItinerary routingitinerary)
    {
        Iterator iterator;
        clear();
        currentShownItinerary = routingitinerary;
        iterator = routingitinerary.getLegs().iterator();
_L3:
        PolylineOptions polylineoptions;
        PolylineOptions polylineoptions1;
        Object obj;
        Object obj1;
        boolean flag;
        if (!iterator.hasNext())
        {
            onCameraChange(super.getMap().getCameraPosition());
            addMarkers(routingitinerary);
            return;
        }
        obj1 = (RoutingLeg)iterator.next();
        int j = 0x55ffffff;
        int i = 0x99000000;
        if (((RoutingLeg) (obj1)).getLegType() == com.thetransitapp.droid.model.RoutingLeg.LegType.TRANSIT)
        {
            j = -1;
            i = ((RoutingLeg) (obj1)).getRoute().getPathColor();
        }
        polylineoptions = new PolylineOptions();
        polylineoptions1 = new PolylineOptions();
        polylineoptions.color(j);
        polylineoptions1.color(i);
        obj = ((RoutingLeg) (obj1)).getShape();
        if (obj != null)
        {
            obj = PolylineUtility.decodePoly(((String) (obj)));
            polylineoptions.addAll(((Iterable) (obj)));
            polylineoptions1.addAll(((Iterable) (obj)));
        }
        obj = BitmapDescriptorFactory.fromBitmap(BitmapUtility.getPin(i, getResources().getDimensionPixelSize(0x7f080024), getResources().getDimensionPixelSize(0x7f080025)));
        if (((RoutingLeg) (obj1)).getLegType() == com.thetransitapp.droid.model.RoutingLeg.LegType.TRANSIT)
        {
            Object obj2 = ((RoutingLeg) (obj1)).getFromPlacemark().toLatLng();
            obj2 = (new MarkerOptions()).position(((com.google.android.gms.maps.model.LatLng) (obj2))).icon(((com.google.android.gms.maps.model.BitmapDescriptor) (obj))).anchor(0.5F, 0.5F).title(((RoutingLeg) (obj1)).getFromPlacemark().getName());
            legMarkers.add(getMap().addMarker(((MarkerOptions) (obj2))));
            obj2 = ((RoutingLeg) (obj1)).getToPlacemark().toLatLng();
            obj2 = (new MarkerOptions()).position(((com.google.android.gms.maps.model.LatLng) (obj2))).icon(((com.google.android.gms.maps.model.BitmapDescriptor) (obj))).anchor(0.5F, 0.5F).title(((RoutingLeg) (obj1)).getToPlacemark().getName());
            legMarkers.add(getMap().addMarker(((MarkerOptions) (obj2))));
            polylineoptions.width(getResources().getDimensionPixelSize(0x7f080020));
            polylineoptions1.width(getResources().getDimensionPixelSize(0x7f080021));
        } else
        {
            polylineoptions.width(getResources().getDimensionPixelSize(0x7f080022));
            polylineoptions1.width(getResources().getDimensionPixelSize(0x7f080023));
        }
        if (((RoutingLeg) (obj1)).getIntermediateStops() == null || ((RoutingLeg) (obj1)).getIntermediateStops().isEmpty()) goto _L2; else goto _L1
_L1:
        flag = polylineoptions1.getPoints().isEmpty();
        obj1 = ((RoutingLeg) (obj1)).getIntermediateStops().iterator();
_L4:
        if (((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_497;
        }
_L2:
        drawnPoly.add(getMap().addPolyline(polylineoptions));
        drawnPoly.add(getMap().addPolyline(polylineoptions1));
          goto _L3
        Object obj3 = (Stop)((Iterator) (obj1)).next();
        com.google.android.gms.maps.model.LatLng latlng = ((Stop) (obj3)).getPlacemark().toLatLng();
        obj3 = (new MarkerOptions()).position(latlng).icon(((com.google.android.gms.maps.model.BitmapDescriptor) (obj))).anchor(0.5F, 0.5F).title(((Stop) (obj3)).getPlacemark().getName());
        drawnMarkers.add(getMap().addMarker(((MarkerOptions) (obj3))));
        if (flag)
        {
            polylineoptions.add(latlng);
            polylineoptions1.add(latlng);
        }
          goto _L4
    }
}
