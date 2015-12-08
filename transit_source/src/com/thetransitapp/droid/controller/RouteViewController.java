// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.AbsListView;
import android.widget.Toast;
import com.thetransitapp.droid.data.TransitDatabaseHelper;
import com.thetransitapp.droid.model.NearbyRoutesRequest;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.service.NearbyRoutesTask;
import com.thetransitapp.droid.service.ServiceCallback;
import com.thetransitapp.droid.widget.route.RouteAdapter;
import com.thetransitapp.droid.widget.route.RouteItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.controller:
//            FeedManager

public class RouteViewController
    implements ServiceCallback, FeedManager.FeedManagerCallback
{
    public static interface ErrorHandler
    {

        public abstract void onError(com.thetransitapp.droid.model.NearbyRoutesRequest.ErrorType errortype, String s, String s1);
    }


    private static final long REFRESH_DELAY = 0x124f80L;
    private static boolean firstOpen = true;
    private final Context context;
    private final RouteAdapter dataSource;
    private final TransitDatabaseHelper databaseHelper;
    private ErrorHandler errorHandler;
    private final FeedManager feedManager;
    private final Handler handler;
    private List lastInactiveRoutes;
    private long lastRefreshTime;
    private List lastRoutes;
    private AbsListView listView;
    private boolean loading;
    private boolean paused;
    private SimplePlacemark placemark;
    private final SharedPreferences preferences;
    private boolean refreshStarted;
    private boolean showInactivesRoutes;

    public RouteViewController(RouteAdapter routeadapter, Handler handler1, Context context1, FeedManager feedmanager, SharedPreferences sharedpreferences, TransitDatabaseHelper transitdatabasehelper)
    {
        dataSource = routeadapter;
        context = context1;
        handler = handler1;
        feedManager = feedmanager;
        preferences = sharedpreferences;
        databaseHelper = transitdatabasehelper;
        feedManager.addFeedManagerCallback(this);
        lastRefreshTime = SystemClock.elapsedRealtime();
    }

    private void insertRoutes()
    {
        dataSource.clear();
        if (lastRoutes == null) goto _L2; else goto _L1
_L1:
        Object obj = lastRoutes.iterator();
_L9:
        if (((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        dataSource.sort(new Comparator() {

            final RouteViewController this$0;

            public int compare(RouteItem routeitem, RouteItem routeitem1)
            {
                int j = (int)(routeitem.getViewModel().getPoint() - routeitem1.getViewModel().getPoint());
                int i = j;
                if (j == 0)
                {
                    i = routeitem.getViewModel().getCurrentItinerary().getCurrentScheduleItem().compareTo(routeitem1.getViewModel().getCurrentItinerary().getCurrentScheduleItem());
                }
                return i;
            }

            public volatile int compare(Object obj3, Object obj4)
            {
                return compare((RouteItem)obj3, (RouteItem)obj4);
            }

            
            {
                this$0 = RouteViewController.this;
                super();
            }
        });
_L2:
        dataSource.addRoute(new NearbyRouteViewModel());
        if (!showInactivesRoutes || lastInactiveRoutes == null || lastInactiveRoutes.isEmpty()) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj = new ArrayList(lastInactiveRoutes.size());
        obj1 = lastInactiveRoutes.iterator();
_L10:
        if (((Iterator) (obj1)).hasNext()) goto _L8; else goto _L7
_L7:
        Collections.sort(((List) (obj)), new Comparator() {

            final RouteViewController this$0;

            public int compare(NearbyRouteViewModel nearbyrouteviewmodel1, NearbyRouteViewModel nearbyrouteviewmodel2)
            {
                return (int)(nearbyrouteviewmodel1.getPoint() - nearbyrouteviewmodel2.getPoint());
            }

            public volatile int compare(Object obj3, Object obj4)
            {
                return compare((NearbyRouteViewModel)obj3, (NearbyRouteViewModel)obj4);
            }

            
            {
                this$0 = RouteViewController.this;
                super();
            }
        });
        obj = ((List) (obj)).iterator();
_L11:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_330;
        }
        listView.setSelection(lastRoutes.size() - 1);
_L6:
        return;
_L4:
        obj1 = (Route)((Iterator) (obj)).next();
        if (!((Route) (obj1)).getItineraries().isEmpty())
        {
            obj1 = new NearbyRouteViewModel(((Route) (obj1)), placemark, false, databaseHelper);
            if (feedManager.isReady())
            {
                ((NearbyRouteViewModel) (obj1)).setFeed(feedManager.getFeed(((NearbyRouteViewModel) (obj1)).getRoute()));
            }
            if (((NearbyRouteViewModel) (obj1)).isActive())
            {
                dataSource.addRoute(((NearbyRouteViewModel) (obj1)));
            }
        }
          goto _L9
_L8:
        Object obj2 = (Route)((Iterator) (obj1)).next();
        if (!((Route) (obj2)).getItineraries().isEmpty())
        {
            obj2 = new NearbyRouteViewModel(((Route) (obj2)), placemark, true, databaseHelper);
            if (feedManager.isReady())
            {
                ((NearbyRouteViewModel) (obj2)).setFeed(feedManager.getFeed(((NearbyRouteViewModel) (obj2)).getRoute()));
            }
            ((List) (obj)).add(obj2);
        }
          goto _L10
        NearbyRouteViewModel nearbyrouteviewmodel = (NearbyRouteViewModel)((Iterator) (obj)).next();
        dataSource.addRoute(nearbyrouteviewmodel);
          goto _L11
    }

    private void launchRequest(boolean flag)
    {
        NearbyRoutesRequest nearbyroutesrequest = new NearbyRoutesRequest();
        nearbyroutesrequest.setPlacemark(placemark);
        nearbyroutesrequest.setLoadInactives(flag);
        if (feedManager.getClosestBundle() != null)
        {
            nearbyroutesrequest.setBannedModesParameter(feedManager.getClosestBundle().getBannedTransitParameters(true));
        }
        loading = true;
        (new NearbyRoutesTask(context, nearbyroutesrequest, this)).execute();
    }

    private boolean shouldRefresh(Location location)
    {
        boolean flag1 = feedManager.isSelectionChanged();
        float f;
        boolean flag;
        if (SystemClock.elapsedRealtime() - lastRefreshTime > 0x124f80L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (location.hasSpeed())
        {
            f = 10F * location.getSpeed();
        } else
        {
            f = 0.0F;
        }
        return flag1 || flag || placemark == null || placemark.distanceTo(location) > 150F + f;
    }

    public void feedUpdated()
    {
label0:
        {
            if (!paused && !loading)
            {
                if (lastRoutes == null || lastRoutes.isEmpty())
                {
                    break label0;
                }
                insertRoutes();
            }
            return;
        }
        launchRequest(false);
    }

    public RouteAdapter getDataSource()
    {
        return dataSource;
    }

    public List getDisplayedRoute()
    {
        ArrayList arraylist = new ArrayList();
        int i = listView.getFirstVisiblePosition();
        do
        {
            if (i >= listView.getLastVisiblePosition())
            {
                return arraylist;
            }
            if (i < dataSource.getCount())
            {
                arraylist.add(((RouteItem)dataSource.getItem(i)).getViewModel());
            }
            i++;
        } while (true);
    }

    public void onError(String s, Exception exception)
    {
        Toast.makeText(context, s, 1).show();
    }

    public void onResult(NearbyRoutesRequest nearbyroutesrequest)
    {
        if (!paused)
        {
            loading = false;
            if (!nearbyroutesrequest.isLoadInactives())
            {
                if (errorHandler != null)
                {
                    errorHandler.onError(nearbyroutesrequest.getError(), nearbyroutesrequest.getErrorTitle(), nearbyroutesrequest.getErrorMessage());
                }
                if (nearbyroutesrequest.getError() != null)
                {
                    dataSource.clear();
                    return;
                }
                lastRoutes = nearbyroutesrequest.getRoutes();
            } else
            {
                lastInactiveRoutes = nearbyroutesrequest.getInactiveRoutes();
                if (nearbyroutesrequest.getError() != null || lastInactiveRoutes == null || lastInactiveRoutes.isEmpty())
                {
                    dataSource.setEmptyInactiveRoute(true);
                } else
                {
                    errorHandler.onError(null, null, null);
                }
            }
            insertRoutes();
            if (!refreshStarted)
            {
                handler.postDelayed(new Runnable() {

                    final RouteViewController this$0;

                    public void run()
                    {
                        if (loading || listView == null || !listView.isShown()) goto _L2; else goto _L1
_L1:
                        int i = listView.getFirstVisiblePosition();
_L6:
                        if (i < listView.getLastVisiblePosition()) goto _L4; else goto _L3
_L3:
                        if (placemark != null)
                        {
                            refresh(placemark.toLocation(), false);
                        }
_L2:
                        handler.postDelayed(this, 5000L);
                        return;
_L4:
                        if (i < dataSource.getCount())
                        {
                            break; /* Loop/switch isn't completed */
                        }
_L7:
                        i++;
                        if (true) goto _L6; else goto _L5
_L5:
                        RouteItem routeitem = (RouteItem)dataSource.getItem(i);
                        routeitem.refreshView();
                        if (RouteViewController.firstOpen && i >= 1 && !preferences.getBoolean("menuPressed", false))
                        {
                            routeitem.animateMenu();
                            dataSource.setLastOpen(routeitem);
                            RouteViewController.firstOpen = false;
                        }
                          goto _L7
                        if (true) goto _L6; else goto _L8
_L8:
                    }

            
            {
                this$0 = RouteViewController.this;
                super();
            }
                }, 1000L);
                refreshStarted = true;
                return;
            }
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((NearbyRoutesRequest)obj);
    }

    public void refresh(Location location, boolean flag)
    {
        refresh(location, flag, false);
    }

    public void refresh(Location location, boolean flag, boolean flag1)
    {
        if (!paused && (flag || shouldRefresh(location)))
        {
            lastRefreshTime = SystemClock.elapsedRealtime();
            placemark = new SimplePlacemark(location);
            feedManager.refresh(location, context);
            if (feedManager.isReady())
            {
                launchRequest(flag1);
            }
        }
    }

    public void setCallback(com.thetransitapp.droid.widget.route.RouteAdapter.ActionCallback actioncallback)
    {
        dataSource.setCallback(actioncallback);
    }

    public void setErrorHandler(ErrorHandler errorhandler)
    {
        errorHandler = errorhandler;
    }

    public void setListView(AbsListView abslistview)
    {
        listView = abslistview;
    }

    public void setPaused(boolean flag)
    {
        paused = flag;
    }

    public void toggleInactiveRoute()
    {
        boolean flag;
        if (showInactivesRoutes)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        showInactivesRoutes = flag;
        if (showInactivesRoutes)
        {
            refresh(placemark.toLocation(), true, true);
            return;
        }
        if (lastInactiveRoutes != null)
        {
            lastInactiveRoutes.clear();
        }
        insertRoutes();
    }









}
