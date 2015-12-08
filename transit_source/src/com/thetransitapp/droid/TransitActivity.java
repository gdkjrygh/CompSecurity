// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.crashlytics.android.Crashlytics;
import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockFragmentActivity;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.thetransitapp.droid.controller.RouteViewController;
import com.thetransitapp.droid.data.TransitDatabaseHelper;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.stats.StatsManager;
import com.thetransitapp.droid.ui.TransitInfoWindow;
import com.thetransitapp.droid.widget.ErrorView;
import com.thetransitapp.droid.widget.PopoverView;
import java.io.IOException;
import java.util.List;
import org.OpenUDID.OpenUDID_manager;

// Referenced classes of package com.thetransitapp.droid:
//            RoutesScreen, RoutingScreen, OptionScreen, AboutScreen

public class TransitActivity extends RoboSherlockFragmentActivity
    implements LocationListener, com.actionbarsherlock.app.ActionBar.OnNavigationListener
{
    public static final class TransitScreen extends Enum
    {

        public static final TransitScreen ABOUT_SCREEN;
        private static final TransitScreen ENUM$VALUES[];
        public static final TransitScreen ITINERARY_SCREEN;
        public static final TransitScreen LEGAL_SCREEN;
        public static final TransitScreen LOCATION_SCREEN;
        public static final TransitScreen NEARBY_SCREEN;
        public static final TransitScreen OPTION_SCREEN;
        public static final TransitScreen ROUTING_SCREEN;
        public static final TransitScreen ROUTING_SCREEN_DETAILS;
        public static final TransitScreen SCHEDULE_SCREEN;

        public static TransitScreen valueOf(String s)
        {
            return (TransitScreen)Enum.valueOf(com/thetransitapp/droid/TransitActivity$TransitScreen, s);
        }

        public static TransitScreen[] values()
        {
            TransitScreen atransitscreen[] = ENUM$VALUES;
            int i = atransitscreen.length;
            TransitScreen atransitscreen1[] = new TransitScreen[i];
            System.arraycopy(atransitscreen, 0, atransitscreen1, 0, i);
            return atransitscreen1;
        }

        static 
        {
            NEARBY_SCREEN = new TransitScreen("NEARBY_SCREEN", 0);
            ROUTING_SCREEN = new TransitScreen("ROUTING_SCREEN", 1);
            LOCATION_SCREEN = new TransitScreen("LOCATION_SCREEN", 2);
            ITINERARY_SCREEN = new TransitScreen("ITINERARY_SCREEN", 3);
            SCHEDULE_SCREEN = new TransitScreen("SCHEDULE_SCREEN", 4);
            OPTION_SCREEN = new TransitScreen("OPTION_SCREEN", 5);
            ABOUT_SCREEN = new TransitScreen("ABOUT_SCREEN", 6);
            LEGAL_SCREEN = new TransitScreen("LEGAL_SCREEN", 7);
            ROUTING_SCREEN_DETAILS = new TransitScreen("ROUTING_SCREEN_DETAILS", 8);
            ENUM$VALUES = (new TransitScreen[] {
                NEARBY_SCREEN, ROUTING_SCREEN, LOCATION_SCREEN, ITINERARY_SCREEN, SCHEDULE_SCREEN, OPTION_SCREEN, ABOUT_SCREEN, LEGAL_SCREEN, ROUTING_SCREEN_DETAILS
            });
        }

        private TransitScreen(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen[];
    public static final String LENGTH_SYSTEM_PREF_KEY = "useImperialSystem";
    private static final String TAG = com/thetransitapp/droid/TransitActivity.getSimpleName();
    private com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectionCallbacks;
    private com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener connectionFailedListener;
    private LinearLayout container;
    private TransitDatabaseHelper databaseHelper;
    private ErrorView errorView;
    private boolean isClosing;
    private Location lastLocation;
    private LocationClient locationClient;
    private LocationManager locationManager;
    private GoogleMap map;
    private PopoverView popoverView;
    private SharedPreferences preferences;
    private RoutesScreen routeScreen;
    private RouteViewController routeViewController;
    private ArrayAdapter screenList;
    private MenuItem searchLocationMenuItem;
    private StatsManager statsManager;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[TransitScreen.values().length];
        try
        {
            ai[TransitScreen.ABOUT_SCREEN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[TransitScreen.ITINERARY_SCREEN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[TransitScreen.LEGAL_SCREEN.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[TransitScreen.LOCATION_SCREEN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[TransitScreen.NEARBY_SCREEN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[TransitScreen.OPTION_SCREEN.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[TransitScreen.ROUTING_SCREEN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[TransitScreen.ROUTING_SCREEN_DETAILS.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[TransitScreen.SCHEDULE_SCREEN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen = ai;
        return ai;
    }

    public TransitActivity()
    {
        routeScreen = new RoutesScreen();
        connectionCallbacks = new com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks() {

            final TransitActivity this$0;

            public void onConnected(Bundle bundle)
            {
                locationClient.requestLocationUpdates(getLocationRequest(), TransitActivity.this);
                if (getLastLocation() == null && routeScreen.isVisible())
                {
                    showLocationServiceError();
                }
            }

            public void onDisconnected()
            {
            }

            
            {
                this$0 = TransitActivity.this;
                super();
            }
        };
        connectionFailedListener = new com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener() {

            final TransitActivity this$0;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                Log.e(TransitActivity.TAG, "LocationClient connection failed");
            }

            
            {
                this$0 = TransitActivity.this;
                super();
            }
        };
    }

    private LocationRequest getLocationRequest()
    {
        LocationRequest locationrequest = LocationRequest.create();
        locationrequest.setInterval(7500L).setPriority(100);
        locationrequest.setSmallestDisplacement(150F);
        return locationrequest;
    }

    private void setUpMapIfNeeded()
    {
        if (map == null)
        {
            map = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(0x7f050038)).getMap();
            if (map != null)
            {
                map.getUiSettings().setZoomControlsEnabled(false);
                map.getUiSettings().setMyLocationButtonEnabled(false);
                map.getUiSettings().setRotateGesturesEnabled(false);
                map.setInfoWindowAdapter(new TransitInfoWindow(this));
                if (locationClient != null)
                {
                    Object obj = getLastLocation();
                    if (obj != null)
                    {
                        obj = CameraUpdateFactory.newCameraPosition(new CameraPosition(new LatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude()), 16F, 0.0F, 0.0F));
                        map.moveCamera(((com.google.android.gms.maps.CameraUpdate) (obj)));
                    }
                }
            } else
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this) != 0)
            {
                container.setVisibility(8);
                return;
            }
        }
    }

    private void updateScreen(Fragment fragment, TransitScreen transitscreen, boolean flag)
    {
        if (fragment != null)
        {
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f05003a, fragment, transitscreen.name());
            if (flag)
            {
                fragmenttransaction.addToBackStack(transitscreen.name());
            }
            fragmenttransaction.setTransition(4099);
            fragmenttransaction.commit();
        }
    }

    public void displayError(String s, String s1, String s2, com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener onerrorbuttonclicklistener)
    {
        errorView.displayError(s, s1, s2, onerrorbuttonclicklistener);
        container.setVisibility(8);
    }

    public TransitScreen getDisplayedScreen()
    {
        Object obj;
        int i;
        obj = super.getSupportFragmentManager();
        i = ((FragmentManager) (obj)).getBackStackEntryCount();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        i--;
_L7:
        if (i >= 0) goto _L4; else goto _L3
_L3:
        return TransitScreen.NEARBY_SCREEN;
_L4:
        android.support.v4.app.FragmentManager.BackStackEntry backstackentry = ((FragmentManager) (obj)).getBackStackEntryAt(i);
        if (backstackentry.getName() != null)
        {
            return TransitScreen.valueOf(backstackentry.getName());
        }
        i--;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = ((FragmentManager) (obj)).findFragmentByTag(TransitScreen.ROUTING_SCREEN.name());
        if (obj == null || !((Fragment) (obj)).isInLayout()) goto _L3; else goto _L5
_L5:
        return TransitScreen.ROUTING_SCREEN;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Location getLastLocation()
    {
        if (lastLocation == null && locationClient != null && locationClient.isConnected())
        {
            return locationClient.getLastLocation();
        } else
        {
            return lastLocation;
        }
    }

    public GoogleMap getMap()
    {
        return map;
    }

    public Location getRealLocation()
    {
        if (locationClient != null && locationClient.isConnected())
        {
            return locationClient.getLastLocation();
        } else
        {
            return null;
        }
    }

    public void hideError()
    {
        if (errorView.isVisible())
        {
            errorView.hideError();
            container.setVisibility(0);
        }
    }

    public void hidePopover(boolean flag)
    {
        if (popoverView != null)
        {
            popoverView.dissmissPopover(flag);
        }
    }

    public boolean isCurrentLocation()
    {
        return lastLocation == null;
    }

    public boolean isDebuggable()
    {
        Object obj = super.getPackageManager();
        int i;
        try
        {
            obj = ((PackageManager) (obj)).getApplicationInfo(super.getPackageName(), 0);
            i = ((ApplicationInfo) (obj)).flags & 2;
            obj.flags = i;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return i != 0;
    }

    public boolean isLocationServiceAvailable()
    {
        return locationClient != null && (locationClient.isConnected() || locationClient.isConnecting());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag;
        flag = true;
        super.onActivityResult(i, j, intent);
        if (i >= TransitScreen.values().length) goto _L2; else goto _L1
_L1:
        $SWITCH_TABLE$com$thetransitapp$droid$TransitActivity$TransitScreen()[TransitScreen.values()[i].ordinal()];
        JVM INSTR tableswitch 3 3: default 48
    //                   3 49;
           goto _L2 _L3
_L2:
        return;
_L3:
        if (routeScreen != null)
        {
            routeScreen.clearError();
        }
        Location location;
        if (j == 2)
        {
            lastLocation = null;
        } else
        {
            intent = (SimplePlacemark)intent.getExtras().get("place");
            lastLocation = intent.toLocation();
            hideError();
            if (j == 1)
            {
                databaseHelper.addLocationFavorite(intent);
            }
        }
        if (getDisplayedScreen() != TransitScreen.LOCATION_SCREEN) goto _L5; else goto _L4
_L4:
        onBackPressed();
_L6:
        if (statsManager != null)
        {
            statsManager.endSession();
            intent = statsManager;
            location = getLastLocation();
            if (lastLocation == null)
            {
                flag = false;
            }
            intent.startSessionWithLocation(location, flag);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (routeScreen != null)
        {
            routeScreen.onResume();
        }
          goto _L6
    }

    public void onBackPressed()
    {
        if (getDisplayedScreen() == TransitScreen.ROUTING_SCREEN_DETAILS)
        {
            preferences.edit().remove("lastRouting").commit();
        }
        super.onBackPressed();
        if (searchLocationMenuItem != null)
        {
            searchLocationMenuItem.expandActionView();
            searchLocationMenuItem.collapseActionView();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!isDebuggable())
        {
            Crashlytics.start(this);
        }
        OpenUDID_manager.sync(this);
        setContentView(0x7f030017);
        screenList = ArrayAdapter.createFromResource(getSupportActionBar().getThemedContext(), 0x7f0c0000, 0x7f030033);
        screenList.setDropDownViewResource(0x7f030032);
        getSupportActionBar().setNavigationMode(1);
        getSupportActionBar().setListNavigationCallbacks(screenList, this);
        bundle = super.getIntent().getExtras();
        if (bundle != null && bundle.containsKey("from") && bundle.containsKey("to"))
        {
            getSupportActionBar().setSelectedNavigationItem(1);
        }
        setUpMapIfNeeded();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        if (getDisplayedScreen() != TransitScreen.OPTION_SCREEN && getDisplayedScreen() != TransitScreen.LOCATION_SCREEN && getDisplayedScreen() != TransitScreen.ABOUT_SCREEN)
        {
            menu.add(0x7f0a0063).setOnMenuItemClickListener(new com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener() {

                final TransitActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    if (getDisplayedScreen() != TransitScreen.OPTION_SCREEN)
                    {
                        updateScreen(new OptionScreen(), TransitScreen.OPTION_SCREEN, true);
                        if (routeScreen != null)
                        {
                            routeScreen.clearError();
                        }
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = TransitActivity.this;
                super();
            }
            });
            menu.add(0x7f0a0064).setOnMenuItemClickListener(new com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener() {

                final TransitActivity this$0;

                public boolean onMenuItemClick(MenuItem menuitem)
                {
                    if (getDisplayedScreen() != TransitScreen.ABOUT_SCREEN)
                    {
                        updateScreen(new AboutScreen(), TransitScreen.ABOUT_SCREEN, true);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = TransitActivity.this;
                super();
            }
            });
        }
        return true;
    }

    public void onLocationChanged(Location location)
    {
        if (location != null && isCurrentLocation())
        {
            if (statsManager != null)
            {
                statsManager.recordLocationUpdate(location);
            }
            routeViewController.refresh(location, false);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        if (menuitem.getIntent() == null) goto _L2; else goto _L1
_L1:
        if (!menuitem.getIntent().hasExtra("place")) goto _L4; else goto _L3
_L3:
        onActivityResult(TransitScreen.LOCATION_SCREEN.ordinal(), 3, menuitem.getIntent());
_L5:
        return true;
_L4:
        if (menuitem.getIntent().hasCategory("current"))
        {
            onActivityResult(TransitScreen.LOCATION_SCREEN.ordinal(), 2, null);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return super.onMenuItemSelected(i, menuitem);
    }

    public boolean onNavigationItemSelected(int i, long l)
    {
        Object obj;
        RoutesScreen routesscreen;
        TransitScreen transitscreen;
        Bundle bundle;
        if (isClosing)
        {
            return false;
        }
        transitscreen = TransitScreen.values()[i];
        bundle = super.getIntent().getExtras();
        obj = null;
        if (transitscreen != TransitScreen.NEARBY_SCREEN)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        routesscreen = routeScreen;
        obj = routesscreen;
        if (bundle == null) goto _L2; else goto _L1
_L1:
        obj = routesscreen;
        if (!bundle.containsKey("query")) goto _L2; else goto _L3
_L3:
        String as[];
        obj = bundle.getString("query");
        as = ((String) (obj)).split(",");
        if (as.length != 2) goto _L5; else goto _L4
_L4:
        lastLocation = (new SimplePlacemark(Double.parseDouble(as[0]), Double.parseDouble(as[1]))).toLocation();
        routeViewController.refresh(lastLocation, true);
_L6:
        bundle.remove("query");
        obj = routesscreen;
_L2:
        if (obj != null)
        {
            super.getSupportFragmentManager().popBackStack(null, 1);
            updateScreen(((Fragment) (obj)), transitscreen, false);
            return true;
        } else
        {
            return false;
        }
_L5:
        try
        {
            throw new NumberFormatException();
        }
        catch (NumberFormatException numberformatexception) { }
        if (Geocoder.isPresent())
        {
            try
            {
                obj = (Address)(new Geocoder(this)).getFromLocationName(((String) (obj)), 1).get(0);
                lastLocation = (new SimplePlacemark(((Address) (obj)).getLatitude(), ((Address) (obj)).getLongitude())).toLocation();
                routeViewController.refresh(lastLocation, true);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
          goto _L6
        if (transitscreen == TransitScreen.ROUTING_SCREEN)
        {
            RoutingScreen routingscreen = new RoutingScreen();
            obj = routingscreen;
            if (bundle != null)
            {
                obj = routingscreen;
                if (bundle.containsKey("from"))
                {
                    obj = routingscreen;
                    if (bundle.containsKey("to"))
                    {
                        routingscreen.setArguments(new Bundle(bundle));
                        bundle.remove("from");
                        bundle.remove("to");
                        obj = routingscreen;
                    }
                }
            }
        }
          goto _L2
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (locationClient != null && locationClient.isConnected())
        {
            locationClient.removeLocationUpdates(this);
            locationClient.disconnect();
        }
        if (statsManager != null)
        {
            statsManager.endSession();
        }
    }

    protected void onResume()
    {
        boolean flag;
        flag = false;
        super.onResume();
        isClosing = false;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this) != 0) goto _L2; else goto _L1
_L1:
        container.setVisibility(0);
        if (locationClient == null)
        {
            locationClient = new LocationClient(this, connectionCallbacks, connectionFailedListener);
        }
        if (!locationClient.isConnected()) goto _L4; else goto _L3
_L3:
        locationClient.requestLocationUpdates(getLocationRequest(), this);
_L5:
        if (statsManager != null)
        {
            StatsManager statsmanager = statsManager;
            Location location = getLastLocation();
            if (lastLocation != null)
            {
                flag = true;
            }
            statsmanager.startSessionWithLocation(location, flag);
        }
        return;
_L4:
        if (!locationClient.isConnecting())
        {
            locationClient.connect();
        }
        if (true) goto _L5; else goto _L2
_L2:
        container.setVisibility(8);
        return;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        isClosing = true;
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        if (!isDebuggable())
        {
            EasyTracker.getInstance().activityStart(this);
        }
    }

    protected void onStop()
    {
        super.onStop();
        if (!isDebuggable())
        {
            EasyTracker.getInstance().activityStop(this);
        }
    }

    public void setSearchLocationMenuItem(MenuItem menuitem)
    {
        searchLocationMenuItem = menuitem;
    }

    public void showLocationServiceError()
    {
        if (locationClient.isConnecting())
        {
            return;
        } else
        {
            displayError(super.getString(0x7f0a0040), super.getString(0x7f0a0078), super.getString(0x7f0a0071), new com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener() {

                final TransitActivity this$0;

                public void onErrorButtonClick()
                {
                    hideError();
                    if (locationClient != null)
                    {
                        if (!locationClient.isConnected() && !locationClient.isConnecting())
                        {
                            locationClient.connect();
                        } else
                        if (getLastLocation() == null)
                        {
                            showLocationServiceError();
                            return;
                        }
                    }
                }

            
            {
                this$0 = TransitActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void showPopover(View view, View view1, Integer integer)
    {
        view.measure(-2, -2);
        popoverView = new PopoverView(this, view);
        popoverView.setContentSizeForViewInPopover(new Point(view.getMeasuredWidth(), view.getMeasuredHeight()));
        view = popoverView;
        RelativeLayout relativelayout = (RelativeLayout)findViewById(0x7f050037);
        view1 = PopoverView.getFrameForView(view1);
        int i = integer.intValue();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.showPopoverFromRectInViewGroup(relativelayout, view1, i, flag);
    }






}
