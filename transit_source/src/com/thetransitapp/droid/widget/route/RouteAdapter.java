// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.thetransitapp.droid.model.stats.StatsManager;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.util.BackgroundUtility;
import java.util.ArrayList;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteUiHandlers, RouteItem

public class RouteAdapter extends ArrayAdapter
    implements RouteUiHandlers
{
    public static interface ActionCallback
    {

        public abstract void menuExpanded(RouteItem routeitem);

        public abstract void showDirectionPopover(NearbyRouteViewModel nearbyrouteviewmodel, View view);

        public abstract void showItinerary(NearbyRouteViewModel nearbyrouteviewmodel);

        public abstract void showSchedules(NearbyRouteViewModel nearbyrouteviewmodel);

        public abstract void showTimePopover(NearbyRouteViewModel nearbyrouteviewmodel, View view);

        public abstract void toggleFavorite(NearbyRouteViewModel nearbyrouteviewmodel);

        public abstract void toggleInactiveRoute();

        public abstract void viewMovedSideway();
    }


    private static int $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType[];
    private static int $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType[];
    private ActionCallback callback;
    private boolean emptyInactiveRoute;
    private final LayoutInflater inflater;
    private RouteItem lastOpen;
    private final SharedPreferences preferences;
    private final StatsManager statsManager;

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[RouteUiHandlers.ClickType.values().length];
        try
        {
            ai[RouteUiHandlers.ClickType.DEFAULT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[RouteUiHandlers.ClickType.FAVORITE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[RouteUiHandlers.ClickType.MAP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[RouteUiHandlers.ClickType.MENU_OPEN.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[RouteUiHandlers.ClickType.NONE.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[RouteUiHandlers.ClickType.SWITCH_DIRECTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[RouteUiHandlers.ClickType.TIMETABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType = ai;
        return ai;
    }

    static int[] $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType()
    {
        int ai[] = $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[RouteUiHandlers.LongClickType.values().length];
        try
        {
            ai[RouteUiHandlers.LongClickType.DIRECTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[RouteUiHandlers.LongClickType.TIME.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType = ai;
        return ai;
    }

    public RouteAdapter(Context context, StatsManager statsmanager, SharedPreferences sharedpreferences, LayoutInflater layoutinflater)
    {
        super(context, 0x7f030021, new ArrayList());
        statsManager = statsmanager;
        preferences = sharedpreferences;
        inflater = layoutinflater;
    }

    public void addRoute(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        super.add(new RouteItem(nearbyrouteviewmodel, this, preferences));
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
label0:
        {
            RouteItem routeitem = (RouteItem)super.getItem(i);
            View view1 = view;
            if (view1 != null && (routeitem.getViewModel().getRoute() == null || view1.findViewById(0x7f050053) != null))
            {
                view = view1;
                if (routeitem.getViewModel().getRoute() != null)
                {
                    break label0;
                }
                view = view1;
                if (view1.findViewById(0x7f050050) != null)
                {
                    break label0;
                }
            }
            if (routeitem.getViewModel().getRoute() != null)
            {
                view = inflater.inflate(0x7f030021, null);
            } else
            {
                view = inflater.inflate(0x7f03001f, viewgroup, false);
            }
        }
        if (routeitem.getViewModel().getRoute() != null)
        {
            routeitem.setView(view, false);
            routeitem.getViewModel().getCurrentItinerary().updateRealTimeDataOnList((ListView)viewgroup, routeitem);
            return view;
        }
        viewgroup = (Button)view.findViewById(0x7f050050);
        if (emptyInactiveRoute)
        {
            viewgroup.setText(0x7f0a009b);
        } else
        {
            if (i == getCount() - 1)
            {
                i = 0x7f0a009a;
            } else
            {
                i = 0x7f0a009c;
            }
            viewgroup.setText(i);
        }
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            final RouteAdapter this$0;

            public void onClick(View view2)
            {
                if (callback != null)
                {
                    callback.toggleInactiveRoute();
                }
            }

            
            {
                this$0 = RouteAdapter.this;
                super();
            }
        });
        BackgroundUtility.setGlossyBackground(view, 0xff2e2e2e, 0xff3e3e3e, 0xff464646, true);
        return view;
    }

    public void onClick(RouteUiHandlers.ClickType clicktype, RouteItem routeitem)
    {
        $SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$ClickType()[clicktype.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 81
    //                   2 67
    //                   3 113
    //                   4 97
    //                   5 133
    //                   6 52
    //                   7 163;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7
_L1:
        statsManager.recordRouteHit(routeitem.getViewModel().getCurrentItinerary());
        return;
_L3:
        if (!routeitem.onChangeDirection())
        {
            routeitem.shakeTime();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        callback.showItinerary(routeitem.getViewModel());
        continue; /* Loop/switch isn't completed */
_L5:
        callback.showSchedules(routeitem.getViewModel());
        continue; /* Loop/switch isn't completed */
_L4:
        callback.toggleFavorite(routeitem.getViewModel());
        routeitem.refreshView();
        continue; /* Loop/switch isn't completed */
_L6:
        if (lastOpen != null && lastOpen != routeitem)
        {
            lastOpen.hideMenu();
        }
        lastOpen = routeitem;
        continue; /* Loop/switch isn't completed */
_L7:
        callback.menuExpanded(routeitem);
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void onLongClick(RouteUiHandlers.LongClickType longclicktype, RouteItem routeitem, View view)
    {
        switch ($SWITCH_TABLE$com$thetransitapp$droid$widget$route$RouteUiHandlers$LongClickType()[longclicktype.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            callback.showDirectionPopover(routeitem.getViewModel(), view);
            return;

        case 1: // '\001'
            callback.showTimePopover(routeitem.getViewModel(), view);
            return;
        }
    }

    public void setCallback(ActionCallback actioncallback)
    {
        callback = actioncallback;
    }

    public void setEmptyInactiveRoute(boolean flag)
    {
        emptyInactiveRoute = flag;
    }

    public void setLastOpen(RouteItem routeitem)
    {
        lastOpen = routeitem;
    }

    public void viewMovedSieway()
    {
        callback.viewMovedSideway();
    }

}
