// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.realtime;

import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.thetransitapp.droid.model.realtime:
//            BaseRealTimeDataSource

public class FeedRealTimeDataSource
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private ArrayList dataSources;

    public FeedRealTimeDataSource(ArrayList arraylist)
    {
        dataSources = arraylist;
    }

    public BaseRealTimeDataSource dataSourceForRoute(NearbyRouteViewModel nearbyrouteviewmodel)
    {
        if (dataSources.size() == 1)
        {
            return (BaseRealTimeDataSource)dataSources.get(0);
        }
        nearbyrouteviewmodel = nearbyrouteviewmodel.getType();
        Iterator iterator = dataSources.iterator();
        BaseRealTimeDataSource baserealtimedatasource;
        int i;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            baserealtimedatasource = (BaseRealTimeDataSource)iterator.next();
            i = nearbyrouteviewmodel.ordinal();
        } while (!baserealtimedatasource.getRouteTypes().contains(Integer.valueOf(i)));
        return baserealtimedatasource;
    }
}
