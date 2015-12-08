// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import android.content.SharedPreferences;
import android.os.Handler;
import android.widget.AbsListView;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.widget.route.RouteAdapter;
import com.thetransitapp.droid.widget.route.RouteItem;

// Referenced classes of package com.thetransitapp.droid.controller:
//            RouteViewController

class this._cls0
    implements Runnable
{

    final RouteViewController this$0;

    public void run()
    {
        if (RouteViewController.access$1(RouteViewController.this) || RouteViewController.access$2(RouteViewController.this) == null || !RouteViewController.access$2(RouteViewController.this).isShown()) goto _L2; else goto _L1
_L1:
        int i = RouteViewController.access$2(RouteViewController.this).getFirstVisiblePosition();
_L6:
        if (i < RouteViewController.access$2(RouteViewController.this).getLastVisiblePosition()) goto _L4; else goto _L3
_L3:
        if (RouteViewController.access$7(RouteViewController.this) != null)
        {
            refresh(RouteViewController.access$7(RouteViewController.this).toLocation(), false);
        }
_L2:
        RouteViewController.access$8(RouteViewController.this).postDelayed(this, 5000L);
        return;
_L4:
        if (i < RouteViewController.access$3(RouteViewController.this).getCount())
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        RouteItem routeitem = (RouteItem)RouteViewController.access$3(RouteViewController.this).getItem(i);
        routeitem.refreshView();
        if (RouteViewController.access$4() && i >= 1 && !RouteViewController.access$5(RouteViewController.this).getBoolean("menuPressed", false))
        {
            routeitem.animateMenu();
            RouteViewController.access$3(RouteViewController.this).setLastOpen(routeitem);
            RouteViewController.access$6(false);
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    ()
    {
        this$0 = RouteViewController.this;
        super();
    }
}
