// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import android.content.Context;
import com.digby.localpoint.sdk.core.ILPFilter;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.localpoint.sdk.core.ILPLocationListener;
import com.digby.localpoint.sdk.core.ILPLocationProvider;
import com.digby.localpoint.sdk.core.ILPOrdering;
import com.digby.localpoint.sdk.core.filter.ILPLocationFilterFactory;
import com.digby.localpoint.sdk.core.impl.filter.LPLocationFilterFactory;
import com.digby.localpoint.sdk.core.impl.ordering.LPLocationOrderingFactory;
import com.digby.localpoint.sdk.core.ordering.ILPLocationOrderingFactory;
import com.digby.mm.android.library.db.impl.DigbyDBHelper;
import com.digby.mm.android.library.db.impl.GeoFenceDBHelper;
import com.digby.mm.android.library.exception.LPArgumentException;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.impl.CircularGeoShape;
import com.digby.mm.android.library.utils.impl.LocationHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPGeopoint, LPLocation

public class LPLocationProvider
    implements ILPLocationProvider
{
    class DefaultLocationOrdering
        implements ILPOrdering
    {

        final LPLocationProvider this$0;

        public int compare(Object obj, Object obj1)
        {
            if (!(obj instanceof ILPLocation) || !(obj1 instanceof ILPLocation))
            {
                throw new LPArgumentException("Ordering requires objects of type ILPLocation.");
            } else
            {
                obj = (ILPLocation)obj;
                obj1 = (ILPLocation)obj1;
                return Long.valueOf(Long.parseLong(((ILPLocation) (obj)).getID().getValue())).compareTo(Long.valueOf(Long.parseLong(((ILPLocation) (obj1)).getID().getValue())));
            }
        }

        DefaultLocationOrdering()
        {
            this$0 = LPLocationProvider.this;
            super();
        }
    }


    private final Context mContext;

    LPLocationProvider()
    {
        mContext = null;
    }

    LPLocationProvider(Context context)
    {
        mContext = context;
    }

    private List filterLocations(List list, ILPFilter ilpfilter)
    {
        ArrayList arraylist = new ArrayList();
        if (ilpfilter != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ILPLocation ilplocation = (ILPLocation)list.next();
                if (ilpfilter.accept(ilplocation))
                {
                    arraylist.add(ilplocation);
                }
            } while (true);
        } else
        {
            arraylist.addAll(list);
        }
        return arraylist;
    }

    private ILPLocation locationFromGeoFence(IGeoFence igeofence)
    {
        if (igeofence == null)
        {
            return null;
        } else
        {
            Object obj = (CircularGeoShape)igeofence.getGeoShape();
            obj = new LPGeopoint(((CircularGeoShape) (obj)).getLatitude(), ((CircularGeoShape) (obj)).getLongitude());
            return new LPLocation(igeofence.getID(), igeofence.getName(), igeofence.getDescription(), ((LPGeopoint) (obj)), igeofence.getBSSID(), igeofence.getSSID(), igeofence.getLocationCode(), igeofence.getTags(), mContext);
        }
    }

    private List locationsFromGeoFences(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(locationFromGeoFence((IGeoFence)list.next()))) { }
        return arraylist;
    }

    private List orderLocations(List list, ILPOrdering ilpordering)
    {
        final Object o = ilpordering;
        if (ilpordering == null)
        {
            o = new DefaultLocationOrdering();
        }
        Collections.sort(list, new Comparator() {

            final LPLocationProvider this$0;
            final ILPOrdering val$o;

            public int compare(ILPLocation ilplocation, ILPLocation ilplocation1)
            {
                return o.compare(ilplocation, ilplocation1);
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((ILPLocation)obj, (ILPLocation)obj1);
            }

            
            {
                this$0 = LPLocationProvider.this;
                o = ilpordering;
                super();
            }
        });
        return list;
    }

    public void addListener(ILPLocationListener ilplocationlistener)
    {
        throw new UnsupportedOperationException("Please extend LPAbstractLocationEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }

    public ILPLocationFilterFactory getFilterFactory()
    {
        return new LPLocationFilterFactory(mContext);
    }

    public GeoFenceDBHelper getGeoFenceDBHelper()
    {
        return new GeoFenceDBHelper(new DigbyDBHelper(mContext));
    }

    public Iterator getListenerIterator()
    {
        throw new UnsupportedOperationException("Please extend LPAbstractLocationEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }

    public ILPLocation getLocation(ILPID ilpid)
    {
        return locationFromGeoFence(getGeoFenceDBHelper().getGeoFence(Long.parseLong(ilpid.getValue())));
    }

    LocationHelper getLocationHelper()
    {
        return new LocationHelper(mContext);
    }

    public List getLocations()
    {
        return locationsFromGeoFences(getGeoFenceDBHelper().getGeoFences());
    }

    public List getLocations(ILPFilter ilpfilter, ILPOrdering ilpordering)
    {
        return orderLocations(filterLocations(getLocations(), ilpfilter), ilpordering);
    }

    public ILPLocationOrderingFactory getOrderingFactory()
    {
        return new LPLocationOrderingFactory(mContext);
    }

    public void removeAllListeners()
    {
        throw new UnsupportedOperationException("Please extend LPAbstractLocationEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }

    public void removeListener(ILPLocationListener ilplocationlistener)
    {
        throw new UnsupportedOperationException("Please extend LPAbstractLocationEventReceiver and register as a BroadcastReceiver in AndroidManifest.xml.");
    }
}
