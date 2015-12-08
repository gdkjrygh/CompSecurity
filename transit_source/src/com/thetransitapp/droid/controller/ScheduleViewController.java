// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.thetransitapp.droid.ItineraryScreen;
import com.thetransitapp.droid.SchedulesScreen;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.ScheduleRequest;
import com.thetransitapp.droid.model.ServiceDay;
import com.thetransitapp.droid.model.Stop;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.service.SchedulesTask;
import com.thetransitapp.droid.service.ServiceCallback;
import com.thetransitapp.droid.widget.ListViewItem;
import com.thetransitapp.droid.widget.ScheduleAdapter;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class ScheduleViewController
    implements ServiceCallback, android.widget.AdapterView.OnItemClickListener, com.thetransitapp.droid.widget.ScheduleAdapter.OnReachEndListener
{

    private int addDay;
    private final Context context;
    private final ScheduleAdapter dataSource;
    private int dayShown;
    private Handler handler;
    private boolean loading;
    private SchedulesScreen view;
    private NearbyRouteViewModel viewModel;

    public ScheduleViewController(ScheduleAdapter scheduleadapter, Context context1)
    {
        addDay = 0;
        dayShown = 0;
        handler = null;
        dataSource = scheduleadapter;
        context = context1;
        dataSource.setOnReachEndListener(this);
    }

    private void showSchedules()
    {
        Object obj = viewModel.getCurrentItinerary();
        ((MergedItinerary) (obj)).updateServiceItem();
        if (((MergedItinerary) (obj)).getScheduleItems() != null)
        {
            int i;
            if (dayShown >= 0 && (Calendar.getInstance().get(11) < 8 || dayShown != 0))
            {
                i = 0;
            } else
            {
                i = 1;
            }
            if (i != 0)
            {
                dataSource.clear();
            } else
            {
                Calendar calendar = Calendar.getInstance();
                calendar.add(6, dayShown);
                dataSource.addTitle(SimpleDateFormat.getDateInstance(1).format(calendar.getTime()));
            }
            dataSource.addSchedule(((MergedItinerary) (obj)).getScheduleItems(new ServiceDay(dayShown)));
            if (((MergedItinerary) (obj)).getOngoingScheduleItems().size() > 0)
            {
                obj = (ScheduleItem)((MergedItinerary) (obj)).getOngoingScheduleItems().get(0);
                i = dataSource.getPosition(new ListViewItem(obj));
                if (dayShown == 0)
                {
                    view.setSelected(i);
                }
            }
        }
        dayShown = dayShown + 1;
    }

    public void changeDirection()
    {
        NearbyRouteViewModel nearbyrouteviewmodel = viewModel;
        boolean flag;
        if (viewModel.isActive())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (nearbyrouteviewmodel.getNextItinerary(flag))
        {
            view.updateContent(viewModel, true);
            if (Calendar.getInstance().get(11) < 8)
            {
                addDay = -1;
                dayShown = -1;
            } else
            {
                addDay = 0;
                dayShown = 0;
            }
            onReachEnd();
            return;
        } else
        {
            view.shakeRoute();
            return;
        }
    }

    public ScheduleAdapter getDataSource()
    {
        return dataSource;
    }

    public void init(SchedulesScreen schedulesscreen, NearbyRouteViewModel nearbyrouteviewmodel)
    {
        view = schedulesscreen;
        viewModel = nearbyrouteviewmodel;
        view.updateContent(viewModel, false);
        if (Calendar.getInstance().get(11) < 8)
        {
            addDay = -1;
            dayShown = -1;
        } else
        {
            addDay = 0;
            dayShown = 0;
        }
        dataSource.clear();
        onReachEnd();
    }

    public void onError(String s, Exception exception)
    {
        Toast.makeText(context, s, 1).show();
    }

    public void onItemClick(AdapterView adapterview, View view1, int i, long l)
    {
        view1 = (ListViewItem)dataSource.getItem(i);
        if (view1.hasValue())
        {
            adapterview = new Bundle();
            adapterview.putSerializable("route", viewModel);
            adapterview.putSerializable("scheduleItem", (Serializable)view1.getValue());
            adapterview.putString("tripId", ((ScheduleItem)view1.getValue()).getTripId());
            view1 = new ItineraryScreen();
            view1.setArguments(adapterview);
            adapterview = view.getActivity().getSupportFragmentManager().beginTransaction();
            adapterview.replace(0x7f05003a, view1, com.thetransitapp.droid.TransitActivity.TransitScreen.LOCATION_SCREEN.name());
            adapterview.addToBackStack(com.thetransitapp.droid.TransitActivity.TransitScreen.LOCATION_SCREEN.name());
            adapterview.commit();
        }
    }

    public void onReachEnd()
    {
        if (loading)
        {
            return;
        }
        loading = true;
        int i = addDay;
        addDay = i + 1;
        ServiceDay serviceday = new ServiceDay(i);
        MergedItinerary mergeditinerary = viewModel.getCurrentItinerary();
        if (!mergeditinerary.getServiceDates().contains(serviceday))
        {
            mergeditinerary.getServiceDates().add(serviceday);
        }
        ScheduleRequest schedulerequest = new ScheduleRequest();
        schedulerequest.setRoute(viewModel.getRoute());
        schedulerequest.setStop(mergeditinerary.getClosestStop());
        schedulerequest.setServiceDay(serviceday);
        (new SchedulesTask(context, schedulerequest, this)).execute();
    }

    public volatile void onResult(Object obj)
    {
        onResult((List)obj);
    }

    public void onResult(List list)
    {
        Stop stop;
        com.thetransitapp.droid.model.Itinerary.DirectionType directiontype;
        Object obj;
        Iterator iterator;
        list = viewModel.getCurrentItinerary().getItineraries();
        obj = (Itinerary)list.get(0);
        stop = viewModel.getCurrentItinerary().getClosestStop();
        directiontype = ((Itinerary) (obj)).getDirectionType();
        obj = ((Itinerary) (obj)).getGroupingKey(stop);
        iterator = viewModel.getRoute().getItineraries().iterator();
_L8:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        showSchedules();
        loading = false;
        if (dayShown != 0) goto _L4; else goto _L3
_L3:
        onReachEnd();
_L6:
        return;
_L2:
        Itinerary itinerary = (Itinerary)iterator.next();
        boolean flag;
        boolean flag1;
        if (obj != null && !((String) (obj)).equals(itinerary.getGroupingKey(stop)))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (stop != null && !stop.equals(itinerary.getClosestStop(viewModel.getPlacemark())))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (list.contains(itinerary))
        {
            list.remove(list.indexOf(itinerary));
            list.add(itinerary);
        } else
        if (itinerary.getDirectionType() == directiontype && flag && flag1)
        {
            list.add(itinerary);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (dayShown != 1 || handler != null) goto _L6; else goto _L5
_L5:
        handler = new Handler();
        handler.postDelayed(new Runnable() {

            final ScheduleViewController this$0;

            public void run()
            {
                if (view != null && view.isVisible())
                {
                    viewModel.getCurrentItinerary().updateRealTimeDataOnList(view.getScheduleList());
                    handler.postDelayed(this, 30000L);
                }
            }

            
            {
                this$0 = ScheduleViewController.this;
                super();
            }
        }, 1000L);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }



}
