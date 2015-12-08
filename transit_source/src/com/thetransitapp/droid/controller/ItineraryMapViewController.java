// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import android.content.Context;
import android.widget.Toast;
import com.thetransitapp.droid.ItineraryScreen;
import com.thetransitapp.droid.model.DetailRequest;
import com.thetransitapp.droid.model.Itinerary;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.ScheduleItem;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.service.ItinerariesTask;
import com.thetransitapp.droid.service.ItineraryTask;
import com.thetransitapp.droid.service.ServiceCallback;
import java.util.List;

public class ItineraryMapViewController
    implements ServiceCallback
{

    private static int $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType[];
    private final Context context;
    private ScheduleItem scheduleItem;
    private ItineraryScreen view;
    private NearbyRouteViewModel viewModel;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.thetransitapp.droid.model.Route.RouteType.values().length];
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.BUS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.CABLE_CAR.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.FERRY.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.FUNICULAR.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.GONDOLA.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.SUBWAY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.TRAIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.thetransitapp.droid.model.Route.RouteType.TRAMWAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType = ai;
        return ai;
    }

    public ItineraryMapViewController(Context context1)
    {
        context = context1;
    }

    private void fetchItineraries()
    {
        ScheduleItem scheduleitem = getScheduleItem();
        if (scheduleitem != null && !scheduleitem.getItinerary().isTripLoaded(scheduleitem.getTripId()))
        {
            if (scheduleItem == null)
            {
                DetailRequest detailrequest = new DetailRequest();
                detailrequest.setItineraries(viewModel.getCurrentItinerary().getItineraries());
                detailrequest.setScheduleItem(scheduleitem);
                (new ItinerariesTask(context, detailrequest, this)).execute();
                return;
            } else
            {
                (new ItineraryTask(context, scheduleItem, this)).execute();
                return;
            }
        } else
        {
            view.showDirection(viewModel);
            return;
        }
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
            fetchItineraries();
            return;
        } else
        {
            view.shakeRoute();
            return;
        }
    }

    public float getMarkerZoomLevel()
    {
        switch ($SWITCH_TABLE$com$thetransitapp$droid$model$Route$RouteType()[viewModel.getRoute().getType().ordinal()])
        {
        default:
            return 14.5F;

        case 2: // '\002'
            return 12.5F;

        case 3: // '\003'
            return 10.5F;
        }
    }

    public ScheduleItem getScheduleItem()
    {
        if (scheduleItem != null)
        {
            return scheduleItem;
        }
        if (viewModel.getCurrentItinerary().getCurrentScheduleItem() != null)
        {
            return viewModel.getCurrentItinerary().getCurrentScheduleItem();
        }
        List list = viewModel.getCurrentItinerary().getScheduleItems();
        if (list.size() > 0)
        {
            return (ScheduleItem)list.get(0);
        } else
        {
            return null;
        }
    }

    public void init(ItineraryScreen itineraryscreen, NearbyRouteViewModel nearbyrouteviewmodel, ScheduleItem scheduleitem)
    {
        view = itineraryscreen;
        viewModel = nearbyrouteviewmodel;
        scheduleItem = scheduleitem;
        view.updateContent(viewModel, false);
        fetchItineraries();
    }

    public void onError(String s, Exception exception)
    {
        Toast.makeText(context, s, 1).show();
    }

    public volatile void onResult(Object obj)
    {
        onResult((Void)obj);
    }

    public void onResult(Void void1)
    {
        viewModel.getCurrentItinerary().updateServiceItem();
        view.showDirection(viewModel);
    }
}
