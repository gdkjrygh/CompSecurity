// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.app.PendingIntent;
import android.content.Context;
import com.urbanairship.Logger;
import com.urbanairship.PendingResult;
import com.urbanairship.google.PlayServicesUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.location:
//            FusedLocationAdapter, StandardLocationAdapter, LocationAdapter, LocationRequestOptions

class UALocationProvider
{

    private List adapters;
    private LocationAdapter connectedAdapter;
    private boolean isConnected;

    public UALocationProvider(Context context)
    {
        adapters = new ArrayList();
        isConnected = false;
        if (PlayServicesUtils.isGooglePlayServicesDependencyAvailable())
        {
            adapters.add(new FusedLocationAdapter(context));
        }
        adapters.add(new StandardLocationAdapter(context));
    }

    transient UALocationProvider(LocationAdapter alocationadapter[])
    {
        adapters = new ArrayList();
        isConnected = false;
        adapters.addAll(Arrays.asList(alocationadapter));
    }

    public void cancelRequests(PendingIntent pendingintent)
    {
        Logger.debug("Canceling location requests.");
        Iterator iterator = adapters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LocationAdapter locationadapter = (LocationAdapter)iterator.next();
            Logger.verbose((new StringBuilder()).append("Canceling location requests for adapter: ").append(locationadapter).toString());
            if (locationadapter == connectedAdapter)
            {
                locationadapter.cancelLocationUpdates(pendingintent);
            } else
            if (locationadapter.connect())
            {
                locationadapter.cancelLocationUpdates(pendingintent);
                locationadapter.disconnect();
            }
        } while (true);
    }

    public void connect()
    {
        if (isConnected)
        {
            return;
        }
        Logger.debug("Connecting to location provider.");
        Iterator iterator = adapters.iterator();
        do
        {
            LocationAdapter locationadapter;
label0:
            {
                if (iterator.hasNext())
                {
                    locationadapter = (LocationAdapter)iterator.next();
                    Logger.verbose((new StringBuilder()).append("Attempting to connect to location adapter: ").append(locationadapter).toString());
                    if (!locationadapter.connect())
                    {
                        break label0;
                    }
                    Logger.verbose((new StringBuilder()).append("Connected to location adapter: ").append(locationadapter).toString());
                    connectedAdapter = locationadapter;
                }
                isConnected = true;
                return;
            }
            Logger.verbose((new StringBuilder()).append("Failed to connect to location adapter: ").append(locationadapter).toString());
        } while (true);
    }

    public void disconnect()
    {
        if (!isConnected)
        {
            return;
        }
        Logger.debug("Disconnecting from location provider.");
        if (connectedAdapter != null)
        {
            connectedAdapter.disconnect();
            connectedAdapter = null;
        }
        isConnected = false;
    }

    public boolean isConnected()
    {
        return isConnected;
    }

    public void requestLocationUpdates(LocationRequestOptions locationrequestoptions, PendingIntent pendingintent)
    {
        if (!isConnected)
        {
            throw new IllegalStateException("Provider must be connected before making requests.");
        }
        if (connectedAdapter == null)
        {
            Logger.info("Ignoring request, connected adapter unavailable.");
            return;
        } else
        {
            Logger.debug((new StringBuilder()).append("Requesting location updates: ").append(locationrequestoptions).toString());
            connectedAdapter.requestLocationUpdates(locationrequestoptions, pendingintent);
            return;
        }
    }

    public PendingResult requestSingleLocation(LocationRequestOptions locationrequestoptions)
    {
        if (!isConnected)
        {
            throw new IllegalStateException("Provider must be connected before making requests.");
        }
        if (connectedAdapter == null)
        {
            Logger.info("Ignoring request, connected adapter unavailable.");
            return null;
        } else
        {
            Logger.debug((new StringBuilder()).append("Requesting single location update: ").append(locationrequestoptions).toString());
            return connectedAdapter.requestSingleLocation(locationrequestoptions);
        }
    }
}
