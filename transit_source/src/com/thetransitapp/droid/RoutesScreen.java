// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.google.android.gms.maps.GoogleMap;
import com.thetransitapp.droid.controller.RouteViewController;
import com.thetransitapp.droid.data.TransitDatabaseHelper;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.service.NotificationTask;
import com.thetransitapp.droid.ui.CompassView;
import com.thetransitapp.droid.util.DistanceUtility;
import com.thetransitapp.droid.widget.route.RouteItem;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen, ItineraryScreen, SchedulesScreen, LocationScreen

public class RoutesScreen extends BaseMapScreen
    implements com.thetransitapp.droid.widget.route.RouteAdapter.ActionCallback, com.thetransitapp.droid.controller.RouteViewController.ErrorHandler
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType[];
    public static final String MENU_PRESS_PREFERENCE_KEY = "menuPressed";
    private TransitDatabaseHelper databaseHelper;
    private boolean favoriteAlertShown;
    private com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType lastError;
    private String lastErrorMessage;
    private String lastErrorTitle;
    private SubMenu locationMenuItem;
    private SharedPreferences preferences;
    private ListView routes;
    private RouteViewController viewController;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.values().length];
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.LINES_INACTIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.MESSAGE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.NO_INTERNET.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.NO_NEARBY_STOPS.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.OUT_OF_SERVICE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.REGION_IN_MAINTENANCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.REGION_UNSUPPORTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.TIMEOUT.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.TIME_DELTA_OUT.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.UNAUTHORIZED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType = ai;
        return ai;
    }

    public RoutesScreen()
    {
        super(TransitActivity.TransitScreen.NEARBY_SCREEN);
        super.setHasOptionsMenu(true);
    }

    private int calculateMinInterval(List list)
    {
        Iterator iterator;
        int i;
        i = 0x7fffffff;
        iterator = list.iterator();
_L2:
        if (!iterator.hasNext())
        {
            return i;
        }
        ScheduleItem scheduleitem = (ScheduleItem)iterator.next();
        Iterator iterator1 = list.iterator();
        int j = i;
        do
        {
            i = j;
            if (!iterator1.hasNext())
            {
                continue;
            }
            ScheduleItem scheduleitem1 = (ScheduleItem)iterator1.next();
            if (scheduleitem != scheduleitem1 && scheduleitem.getStopTime() != null && scheduleitem1.getStopTime() != null)
            {
                j = (int)Math.min(Math.abs(scheduleitem.getStopTime().getTime() - scheduleitem1.getStopTime().getTime()), j);
            }
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void displayScreen(Fragment fragment, NearbyRouteViewModel nearbyrouteviewmodel, TransitActivity.TransitScreen transitscreen)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("route", nearbyrouteviewmodel);
        fragment.setArguments(bundle);
        nearbyrouteviewmodel = super.getActivity().getSupportFragmentManager().beginTransaction();
        nearbyrouteviewmodel.replace(0x7f05003a, fragment, transitscreen.name());
        nearbyrouteviewmodel.addToBackStack(transitscreen.name());
        nearbyrouteviewmodel.commit();
    }

    public void clearError()
    {
        lastError = null;
        lastErrorTitle = null;
        lastErrorMessage = null;
    }

    public void menuExpanded(RouteItem routeitem)
    {
        int i = routeitem.getView().getBottom() + 10;
        if (i > routes.getScrollY() + routes.getHeight())
        {
            routes.setOverScrollMode(0);
            routes.smoothScrollBy(i - routes.getScrollX() - routes.getHeight(), 500);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menu = menu.addSubMenu(0x7f0a0040);
        int i;
        if (super.isCurrentLocation())
        {
            i = 0x7f0200a1;
        } else
        {
            i = 0x7f0200a2;
        }
        locationMenuItem = menu.setIcon(i);
        locationMenuItem.add(0x7f0a0041).setIcon(0x7f020070).setOnMenuItemClickListener(new com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener() {

            final RoutesScreen this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                Object obj = new Bundle();
                if (getLastLocation() != null)
                {
                    ((Bundle) (obj)).putDouble("latitude", getLastLocation().getLatitude());
                    ((Bundle) (obj)).putDouble("longitude", getLastLocation().getLongitude());
                }
                menuitem = new LocationScreen();
                menuitem.setArguments(((Bundle) (obj)));
                obj = getActivity().getSupportFragmentManager().beginTransaction();
                ((FragmentTransaction) (obj)).replace(0x7f05003a, menuitem, TransitActivity.TransitScreen.LOCATION_SCREEN.name());
                ((FragmentTransaction) (obj)).addToBackStack(TransitActivity.TransitScreen.LOCATION_SCREEN.name());
                ((FragmentTransaction) (obj)).commit();
                return true;
            }

            
            {
                this$0 = RoutesScreen.this;
                super();
            }
        });
        menu = new Intent();
        menu.addCategory("current");
        locationMenuItem.add(0x7f0a0042).setIntent(menu).setIcon(0x7f0200a1);
        locationMenuItem.getItem().setShowAsAction(1);
    }

    public void onError(com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType errortype, String s, String s1)
    {
        int i;
        int k;
        if (!super.isVisible())
        {
            return;
        }
        if (errortype == null)
        {
            if (super.getView().getVisibility() != 0)
            {
                super.getView().setVisibility(0);
                super.hideError();
            }
            clearError();
            return;
        }
        lastError = errortype;
        lastErrorTitle = s;
        lastErrorMessage = s1;
        k = -1;
        i = -1;
        $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType()[errortype.ordinal()];
        JVM INSTR tableswitch 1 10: default 124
    //                   1 400
    //                   2 374
    //                   3 361
    //                   4 387
    //                   5 124
    //                   6 124
    //                   7 124
    //                   8 426
    //                   9 413
    //                   10 439;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L6 _L7 _L8
_L1:
        int j;
        if (s == null)
        {
            k = 0x7f0a0076;
        }
        j = k;
        if (s1 == null)
        {
            i = 0x7f0a0079;
            j = k;
        }
_L14:
        String s2 = s;
        if (j != -1)
        {
            s2 = super.getString(j);
        }
        Object obj = s1;
        Object obj1;
        Object obj2;
        if (i != -1)
        {
            if (errortype == com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType.TIME_DELTA_OUT)
            {
                s = TimeZone.getDefault().getDisplayName(false, 0);
                obj = new Date();
                obj = super.getString(i, new Object[] {
                    (new StringBuilder(String.valueOf(DateFormat.getDateFormat(super.getActivity()).format(((Date) (obj)))))).append(DateFormat.getTimeFormat(super.getActivity()).format(((Date) (obj)))).append(" ").append(s).toString(), s1
                });
            } else
            {
                obj = super.getString(i);
            }
        }
        obj1 = null;
        obj2 = null;
        s = obj1;
        s1 = obj2;
        $SWITCH_TABLE$com$thetransitapp$droid$model$NearbyRoutesRequest$ErrorType()[errortype.ordinal()];
        JVM INSTR tableswitch 1 10: default 344
    //                   1 483
    //                   2 350
    //                   3 503
    //                   4 463
    //                   5 350
    //                   6 350
    //                   7 350
    //                   8 463
    //                   9 463
    //                   10 463;
           goto _L9 _L10 _L11 _L12 _L13 _L11 _L11 _L11 _L13 _L13 _L13
_L12:
        break MISSING_BLOCK_LABEL_503;
_L11:
        break; /* Loop/switch isn't completed */
_L9:
        s1 = obj2;
        s = obj1;
_L15:
        super.displayError(s2, ((String) (obj)), s, s1);
        return;
_L4:
        j = 0x7f0a007a;
        i = 0x7f0a007b;
          goto _L14
_L3:
        j = 0x7f0a007c;
        i = 0x7f0a007d;
          goto _L14
_L5:
        j = 0x7f0a0080;
        i = 0x7f0a0081;
          goto _L14
_L2:
        j = 0x7f0a007e;
        i = 0x7f0a007f;
          goto _L14
_L7:
        j = 0x7f0a0072;
        i = 0x7f0a0073;
          goto _L14
_L6:
        j = 0x7f0a0074;
        i = 0x7f0a0075;
          goto _L14
_L8:
        j = 0x7f0a0089;
        i = 0x7f0a008a;
          goto _L14
_L13:
        s = super.getString(0x7f0a0071);
        s1 = new com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener() {

            final RoutesScreen this$0;

            public void onErrorButtonClick()
            {
                hideError();
                viewController.refresh(getLastLocation(), true);
            }

            
            {
                this$0 = RoutesScreen.this;
                super();
            }
        };
          goto _L15
_L10:
        s = super.getString(0x7f0a0096);
        s1 = new com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener() {

            final RoutesScreen this$0;

            public void onErrorButtonClick()
            {
                new NotificationTask(getActivity(), getLastLocation());
            }

            
            {
                this$0 = RoutesScreen.this;
                super();
            }
        };
          goto _L15
        s = super.getString(0x7f0a009a);
        s1 = new com.thetransitapp.droid.widget.ErrorView.OnErrorButtonClickListener() {

            final RoutesScreen this$0;

            public void onErrorButtonClick()
            {
                viewController.refresh(getLastLocation(), true, true);
            }

            
            {
                this$0 = RoutesScreen.this;
                super();
            }
        };
          goto _L15
    }

    public void onPause()
    {
        super.onPause();
        viewController.setPaused(true);
        super.hidePopover(false);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        super.onPrepareOptionsMenu(menu);
        locationMenuItem.removeGroup(1);
        menu = databaseHelper.getLocationFavorites().iterator();
        do
        {
            if (!menu.hasNext())
            {
                return;
            }
            SimplePlacemark simpleplacemark = (SimplePlacemark)menu.next();
            Intent intent = new Intent();
            intent.putExtra("place", simpleplacemark);
            locationMenuItem.add(1, 0, 0, simpleplacemark.getName()).setIcon(0x7f0200a2).setIntent(intent);
        } while (locationMenuItem.size() <= 4);
    }

    public void onResume()
    {
label0:
        {
            super.onResume();
            if (lastError != null)
            {
                onError(lastError, lastErrorTitle, lastErrorMessage);
            }
            if (super.getMap() != null)
            {
                Location location = super.getLastLocation();
                viewController.setPaused(false);
                if (location == null)
                {
                    break label0;
                }
                super.centerMap(location);
                viewController.refresh(location, false);
                if (locationMenuItem != null)
                {
                    SubMenu submenu = locationMenuItem;
                    int i;
                    if (super.isCurrentLocation())
                    {
                        i = 0x7f0200a1;
                    } else
                    {
                        i = 0x7f0200a2;
                    }
                    submenu.setIcon(i);
                }
            }
            return;
        }
        showLocationServiceError();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        viewController.setCallback(this);
        viewController.setErrorHandler(this);
        viewController.setListView(routes);
        routes.setAdapter(viewController.getDataSource());
        routes.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            private int oldLastVisibleItem;
            final RoutesScreen this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                if (i != oldLastVisibleItem)
                {
                    hidePopover(false);
                }
                oldLastVisibleItem = i;
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = RoutesScreen.this;
                super();
            }
        });
    }

    public void showDirectionPopover(final NearbyRouteViewModel route, View view)
    {
        LinearLayout linearlayout = (LinearLayout)super.getLayoutInflater(null).inflate(0x7f03001c, null);
        final TextView distance = (TextView)linearlayout.findViewById(0x7f05004c);
        if (super.getRealLocation() != null)
        {
            distance.setText(DistanceUtility.getDistanceString(route.getCurrentItinerary().getClosestStop().getDistance(new SimplePlacemark(super.getRealLocation())), preferences.getBoolean("useImperialSystem", false)));
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.gravity = 16;
            final CompassView compass = new CompassView(super.getActivity());
            compass.setTarget(route.getPlacemark().toLocation());
            compass.setCurrent(getRealLocation());
            linearlayout.addView(compass, 0, layoutparams);
            super.showPopover(linearlayout, view, Integer.valueOf(6));
            super.getMap().setOnMyLocationChangeListener(new com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener() {

                final RoutesScreen this$0;
                private final CompassView val$compass;
                private final TextView val$distance;
                private final NearbyRouteViewModel val$route;

                public void onMyLocationChange(Location location)
                {
                    BaseMapScreen.this.onMyLocationChange(location);
                    compass.setCurrent(location);
                    int i = (int)route.getCurrentItinerary().getClosestStop().getDistance(new SimplePlacemark(getRealLocation()));
                    distance.setText((new StringBuilder(String.valueOf(i))).append(" m").toString());
                }

            
            {
                this$0 = RoutesScreen.this;
                compass = compassview;
                route = nearbyrouteviewmodel;
                distance = textview;
                super();
            }
            });
        }
    }

    public void showItinerary(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        displayScreen(new ItineraryScreen(), nearbyrouteviewmodel, TransitActivity.TransitScreen.SCHEDULE_SCREEN);
    }

    public void showSchedules(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        displayScreen(new SchedulesScreen(), nearbyrouteviewmodel, TransitActivity.TransitScreen.SCHEDULE_SCREEN);
    }

    public void showTimePopover(NearbyRouteViewModel nearbyrouteviewmodel, View view)
    {
        LinearLayout linearlayout;
        TextView atextview[];
        int i;
        boolean flag;
        int l;
        long l1;
        linearlayout = (LinearLayout)super.getLayoutInflater(null).inflate(0x7f03001d, null);
        atextview = new TextView[3];
        atextview[0] = (TextView)linearlayout.findViewById(0x7f05004d);
        atextview[1] = (TextView)linearlayout.findViewById(0x7f05004e);
        atextview[2] = (TextView)linearlayout.findViewById(0x7f05004f);
        l1 = (new Date()).getTime();
        nearbyrouteviewmodel = nearbyrouteviewmodel.getCurrentItinerary().getOngoingScheduleItems();
        i = 0;
        l = calculateMinInterval(nearbyrouteviewmodel);
        flag = false;
        nearbyrouteviewmodel = nearbyrouteviewmodel.iterator();
_L5:
        if (nearbyrouteviewmodel.hasNext()) goto _L2; else goto _L1
_L1:
        super.showPopover(linearlayout, view, Integer.valueOf(10));
        return;
_L2:
        ScheduleItem scheduleitem = (ScheduleItem)nearbyrouteviewmodel.next();
        int j;
        int k;
        if (scheduleitem.isPastItem())
        {
            j = i;
            if (i > 0)
            {
                j = 0;
            }
            atextview[j].setTextColor(0xffb1b1b1);
            k = j;
            j = ((flag) ? 1 : 0);
        } else
        {
            j = ((flag) ? 1 : 0);
            k = i;
            if (scheduleitem.getStopTime().getTime() > l1)
            {
                atextview[i].setTextColor(0xfff1f1f1);
                j = ((flag) ? 1 : 0);
                k = i;
                if (!flag)
                {
                    atextview[i].setTypeface(Typeface.defaultFromStyle(1));
                    j = 1;
                    k = i;
                }
            }
        }
        if (l <= 0x927c0)
        {
            atextview[k].setText((new StringBuilder(String.valueOf(scheduleitem.getMinutesRemaining()))).append(" min").toString());
        } else
        {
            atextview[k].setText(DateFormat.getTimeFormat(super.getActivity()).format(scheduleitem.getStopTime()));
        }
        atextview[k].setVisibility(0);
        if (k > 0)
        {
            if (atextview[k - 1].getTypeface() != null && atextview[k - 1].getTypeface().isBold())
            {
                atextview[k].setText((new StringBuilder(", ")).append(atextview[k].getText()).toString());
            } else
            {
                atextview[k - 1].setText((new StringBuilder()).append(atextview[k - 1].getText()).append(", ").toString());
            }
        }
        k++;
        if (k > 2) goto _L1; else goto _L3
_L3:
        if (l >= 0x927c0 || !scheduleitem.isPastItem())
        {
            flag = j;
            i = k;
            if (!scheduleitem.isPastItem())
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = j;
            i = k;
            if (scheduleitem.getStopTime().getTime() + 0x493e0L >= l1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = 0;
        flag = j;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void toggleFavorite(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        databaseHelper.toggleFavorite(nearbyrouteviewmodel.getRoute());
        if (!favoriteAlertShown)
        {
            nearbyrouteviewmodel = (new android.app.AlertDialog.Builder(super.getActivity())).create();
            nearbyrouteviewmodel.setTitle(0x7f0a005b);
            nearbyrouteviewmodel.setMessage(getString(0x7f0a005c));
            nearbyrouteviewmodel.setButton(-1, getText(0x7f0a002f), null);
            nearbyrouteviewmodel.show();
            favoriteAlertShown = true;
        }
    }

    public void toggleInactiveRoute()
    {
        viewController.toggleInactiveRoute();
    }

    public void viewMovedSideway()
    {
        super.hidePopover(true);
    }



}
