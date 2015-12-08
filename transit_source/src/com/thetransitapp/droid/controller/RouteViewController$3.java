// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import java.util.Comparator;

// Referenced classes of package com.thetransitapp.droid.controller:
//            RouteViewController

class this._cls0
    implements Comparator
{

    final RouteViewController this$0;

    public int compare(NearbyRouteViewModel nearbyrouteviewmodel, NearbyRouteViewModel nearbyrouteviewmodel1)
    {
        return (int)(nearbyrouteviewmodel.getPoint() - nearbyrouteviewmodel1.getPoint());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((NearbyRouteViewModel)obj, (NearbyRouteViewModel)obj1);
    }

    del()
    {
        this$0 = RouteViewController.this;
        super();
    }
}
