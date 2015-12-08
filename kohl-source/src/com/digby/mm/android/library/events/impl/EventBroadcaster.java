// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.Context;
import android.location.Location;
import com.digby.localpoint.sdk.core.impl.LPID;
import com.digby.localpoint.sdk.core.util.LocationEventBroadcaster;
import com.digby.mm.android.library.events.IEventBroadcaster;
import com.digby.mm.android.library.utils.Logger;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public class EventBroadcaster
    implements IEventBroadcaster
{
    private static interface Converter
    {

        public abstract Object convert(Object obj);
    }


    static final String GEOFENCE_IDS_EXTRAS_KEY = "geofence_ids";
    private Context mContext;
    private Set mInGeofenceIdsNew;
    private Set mInGeofenceIdsOld;

    public EventBroadcaster(Context context, JSONArray jsonarray, JSONArray jsonarray1, Location location, JSONArray jsonarray2)
    {
        try
        {
            mContext = context;
            mInGeofenceIdsNew = convertJSONArrayToSet(jsonarray);
            mInGeofenceIdsOld = convertJSONArrayToSet(jsonarray2);
            context = new HashSet(mInGeofenceIdsNew);
            context.removeAll(mInGeofenceIdsOld);
            jsonarray = new HashSet(mInGeofenceIdsOld);
            jsonarray.removeAll(mInGeofenceIdsNew);
            if (context.size() > 0)
            {
                sendGeoFenceEntryBroadcast(context, jsonarray1, location);
            }
            if (jsonarray.size() > 0)
            {
                sendGeoFenceExitBroadcast(jsonarray, jsonarray1, location);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("EventBroadcaster", context);
        }
    }

    private static final Collection buildCollection(JSONArray jsonarray, Collection collection, Converter converter)
    {
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonarray.length())
                {
                    break;
                }
                collection.add(converter.convert(jsonarray.get(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                break;
            }
            i++;
        } while (true);
        return collection;
    }

    private Set convertJSONArrayToSet(JSONArray jsonarray)
    {
        return (Set)buildCollection(jsonarray, new HashSet(), new Converter() {

            final EventBroadcaster this$0;

            public Integer convert(Object obj)
            {
                return Integer.valueOf(obj.toString());
            }

            public volatile Object convert(Object obj)
            {
                return convert(obj);
            }

            
            {
                this$0 = EventBroadcaster.this;
                super();
            }
        });
    }

    private Set getLocationIdSet(Set set)
    {
        HashSet hashset = new HashSet();
        for (set = set.iterator(); set.hasNext(); hashset.add(new LPID(((Integer)set.next()).toString()))) { }
        return hashset;
    }

    public void sendGeoFenceEntryBroadcast(Set set, JSONArray jsonarray, Location location)
    {
        try
        {
            LocationEventBroadcaster.getInstance(mContext).broadcastEntry(getLocationIdSet(set), location);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Logger.Error("sendGeoFenceEntryBroadcast", set);
        }
    }

    public void sendGeoFenceExitBroadcast(Set set, JSONArray jsonarray, Location location)
    {
        try
        {
            LocationEventBroadcaster.getInstance(mContext).broadcastExit(getLocationIdSet(set), location);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Logger.Error("sendGeoFenceExitBroadcast", set);
        }
    }
}
