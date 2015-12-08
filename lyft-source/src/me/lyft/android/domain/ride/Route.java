// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.List;
import me.lyft.android.common.Iterables;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.domain.ride:
//            Stop

public class Route
{

    private final List passengers;
    private final List stops;

    public Route(List list, List list1)
    {
        stops = list;
        passengers = list1;
    }

    public Stop getFirstStop()
    {
        return (Stop)stops.get(0);
    }

    public List getIncompleteStops()
    {
        return Iterables.where(stops, new Func1() {

            final Route this$0;

            public Boolean call(Stop stop)
            {
                boolean flag;
                if (!stop.isCompleted())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((Stop)obj);
            }

            
            {
                this$0 = Route.this;
                super();
            }
        });
    }

    public Stop getLastStop()
    {
        return (Stop)stops.get(stops.size() - 1);
    }

    public List getPassengers()
    {
        return passengers;
    }

    public List getStops()
    {
        return stops;
    }
}
