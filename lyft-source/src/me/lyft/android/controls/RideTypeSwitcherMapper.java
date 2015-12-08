// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.infrastructure.lyft.constants.Selector;

// Referenced classes of package me.lyft.android.controls:
//            RideSwitcherItem

public class RideTypeSwitcherMapper
{

    public RideTypeSwitcherMapper()
    {
    }

    static RideSwitcherItem map(RequestRideType requestridetype, RideTypeMeta ridetypemeta)
    {
        return new RideSwitcherItem(ridetypemeta.getId(), ridetypemeta.getSelector().getLabel(), ridetypemeta.getSelector().getActiveColor(), requestridetype.getPricing().isPrimeTime());
    }

    public static List mapToRideSwitcherItem(List list, List list1)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
label0:
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            RequestRideType requestridetype = (RequestRideType)list.next();
            String s = requestridetype.getId();
            Iterator iterator = list1.iterator();
            RideTypeMeta ridetypemeta;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                ridetypemeta = (RideTypeMeta)iterator.next();
            } while (!s.equals(ridetypemeta.getId()));
            arraylist.add(map(requestridetype, ridetypemeta));
        } while (true);
        return arraylist;
    }
}
