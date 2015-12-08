// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.location.Location;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.impl.CircularGeoShape;
import com.digby.mm.android.library.utils.Logger;
import java.util.Iterator;
import java.util.Queue;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.events.impl:
//            AbstractEvent, GeoFenceExitEvent

public class GeoFenceEntryEvent extends AbstractEvent
{

    private static final String TYPE_ID = "GEOFENCE_ENTRY";
    private final IGeoFence mGeoFence;

    public GeoFenceEntryEvent(Context context)
    {
        this(context, null);
    }

    public GeoFenceEntryEvent(Context context, IGeoFence igeofence)
    {
        super(context);
        mGeoFence = igeofence;
    }

    public boolean addToQueue(Queue queue)
    {
label0:
        {
            if (queue == null || queue.size() <= 0)
            {
                break label0;
            }
            queue = queue.iterator();
            IEvent ievent;
            do
            {
                if (!queue.hasNext())
                {
                    break label0;
                }
                ievent = (IEvent)queue.next();
            } while (!(ievent instanceof GeoFenceEntryEvent) && !(ievent instanceof GeoFenceExitEvent));
            return false;
        }
        return true;
    }

    public JSONObject getJSON()
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1 = super.getJSON();
        JSONObject jsonobject2;
        jsonobject = jsonobject1;
        jsonobject2 = jsonobject1;
        if (mGeoFence == null)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        jsonobject = jsonobject1;
        CircularGeoShape circulargeoshape = (CircularGeoShape)mGeoFence.getGeoShape();
        jsonobject = jsonobject1;
        Location location = getEventLocation();
        jsonobject = jsonobject1;
        jsonobject2 = jsonobject1;
        if (circulargeoshape.isLocationInside(location))
        {
            break MISSING_BLOCK_LABEL_251;
        }
        jsonobject = jsonobject1;
        Logger.Debug("Setting accuracy to 60m", getContext());
        jsonobject = jsonobject1;
        location.setAccuracy(60F);
        jsonobject = jsonobject1;
        jsonobject2 = jsonobject1;
        if (circulargeoshape.isLocationInside(location))
        {
            break MISSING_BLOCK_LABEL_251;
        }
        jsonobject = jsonobject1;
        float f = circulargeoshape.distanceFromLocation(location);
        jsonobject = jsonobject1;
        if (circulargeoshape.distanceFromLocation(location) >= circulargeoshape.getRadius()) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject1;
        Logger.Debug("Setting accuracy to radius - distance", getContext());
        jsonobject = jsonobject1;
        location.setAccuracy(circulargeoshape.getRadius() - f);
_L4:
        jsonobject = jsonobject1;
        jsonobject1.put("accuracy", location.getAccuracy());
        return jsonobject1;
_L2:
        jsonobject = jsonobject1;
        Logger.Debug("Setting lat/lng and accuracy to match GeoFence", getContext());
        jsonobject = jsonobject1;
        location.setLatitude(circulargeoshape.getLatitude());
        jsonobject = jsonobject1;
        location.setLongitude(circulargeoshape.getLongitude());
        jsonobject = jsonobject1;
        location.setAccuracy(circulargeoshape.getRadius());
        jsonobject = jsonobject1;
        jsonobject1.put("latitude", location.getLatitude());
        jsonobject = jsonobject1;
        jsonobject1.put("longitude", location.getLongitude());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        Logger.Error("getJSON", exception);
        jsonobject2 = jsonobject;
        return jsonobject2;
    }

    String getTypeID()
    {
        return "GEOFENCE_ENTRY";
    }
}
