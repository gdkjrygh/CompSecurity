// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.controller;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.thetransitapp.droid.data.TransitDatabaseHelper;
import com.thetransitapp.droid.model.BundleResponse;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitMode;
import com.thetransitapp.droid.model.TransitServer;
import com.thetransitapp.droid.service.BundleTask;
import com.thetransitapp.droid.service.ServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public class FeedManager
    implements ServiceCallback
{
    public static interface FeedManagerCallback
    {

        public abstract void feedUpdated();
    }


    private List bundles;
    private List callbacks;
    private TransitBundle closestBundle;
    private final TransitDatabaseHelper databaseHelper;
    private Location lastLocation;
    private boolean loadedAll;
    private final SharedPreferences preferences;
    private BundleResponse response;
    private boolean selectionChanged;

    public FeedManager(Application application, TransitDatabaseHelper transitdatabasehelper, SharedPreferences sharedpreferences)
    {
        loadedAll = false;
        databaseHelper = transitdatabasehelper;
        preferences = sharedpreferences;
        bundles = new ArrayList();
        callbacks = new ArrayList();
    }

    private void notifyCallbacks()
    {
        updateTimeZone();
        if (closestBundle != null)
        {
            boolean flag = "US".equalsIgnoreCase(closestBundle.getCountryCode());
            android.content.SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("useImperialSystem", flag);
            if (closestBundle.getServer() != null)
            {
                editor.putString("router_id", closestBundle.getServer().getRouterId());
            }
            editor.commit();
        }
        Iterator iterator = callbacks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((FeedManagerCallback)iterator.next()).feedUpdated();
        } while (true);
    }

    private TransitBundle setClosestBundle()
    {
        if (lastLocation == null)
        {
            return (TransitBundle)bundles.get(0);
        } else
        {
            return closestBundleToLocation(lastLocation);
        }
    }

    private boolean shouldLoad(Location location)
    {
        return lastLocation == null || lastLocation.distanceTo(location) > 100000F;
    }

    private void updateTimeZone()
    {
        closestBundle = setClosestBundle();
        if (closestBundle != null && !closestBundle.getFeeds().isEmpty())
        {
            TimeZone.setDefault(((Feed)closestBundle.getFeeds().get(0)).getTimeZone());
        }
    }

    public void addFeedManagerCallback(FeedManagerCallback feedmanagercallback)
    {
        callbacks.add(feedmanagercallback);
    }

    public TransitBundle closestBundleToLocation(Location location)
    {
        double d;
        TransitBundle transitbundle;
        Iterator iterator;
        transitbundle = null;
        d = 1.7976931348623157E+308D;
        iterator = bundles.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (transitbundle == null) goto _L4; else goto _L3
_L3:
        selectionChanged = false;
        location = transitbundle.getTransitModes().iterator();
_L6:
        if (location.hasNext())
        {
            break MISSING_BLOCK_LABEL_130;
        }
_L4:
        return transitbundle;
_L2:
        TransitBundle transitbundle1 = (TransitBundle)iterator.next();
        Location location1 = new Location("Transit");
        location1.setLatitude(transitbundle1.getLatitude());
        location1.setLongitude(transitbundle1.getLongitude());
        double d1 = location1.distanceTo(location);
        if (d1 < d)
        {
            d = d1;
            transitbundle = transitbundle1;
        }
          goto _L5
        TransitMode transitmode = (TransitMode)location.next();
        transitmode.setSelected(databaseHelper.isTransitModeSlected(transitbundle, transitmode));
          goto _L6
    }

    public List getBundles()
    {
        return bundles;
    }

    public TransitBundle getClosestBundle()
    {
        return closestBundle;
    }

    public Feed getFeed(Route route)
    {
        Iterator iterator = bundles.iterator();
        Feed feed;
label0:
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            Iterator iterator1 = ((TransitBundle)iterator.next()).getFeeds().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    continue label0;
                }
                feed = (Feed)iterator1.next();
            } while (!feed.getFeedId().equals(route.getFeedId()));
            break;
        } while (true);
        return feed;
    }

    public String getShareMessage()
    {
        String s;
        Iterator iterator;
        iterator = null;
        s = iterator;
        if (response == null) goto _L2; else goto _L1
_L1:
        s = iterator;
        if (response.getShareMessage() == null) goto _L2; else goto _L3
_L3:
        s = (String)response.getShareMessage().get("en_us");
        iterator = response.getShareMessage().keySet().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L2
_L2:
        return s;
_L4:
        String s1 = (String)iterator.next();
        if (s1.contains(Locale.getDefault().getLanguage().toLowerCase()))
        {
            return (String)response.getShareMessage().get(s1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isReady()
    {
        return !bundles.isEmpty();
    }

    public boolean isSelectionChanged()
    {
        return selectionChanged;
    }

    public void onError(String s, Exception exception)
    {
        notifyCallbacks();
    }

    public void onResult(BundleResponse bundleresponse)
    {
        response = bundleresponse;
        bundleresponse = bundleresponse.getBundles().iterator();
        do
        {
            if (!bundleresponse.hasNext())
            {
                notifyCallbacks();
                return;
            }
            TransitBundle transitbundle = (TransitBundle)bundleresponse.next();
            int i = bundles.indexOf(transitbundle);
            if (i != -1)
            {
                ((TransitBundle)bundles.get(i)).merge(transitbundle);
            } else
            {
                bundles.add(transitbundle);
            }
        } while (true);
    }

    public volatile void onResult(Object obj)
    {
        onResult((BundleResponse)obj);
    }

    public void onSelectionChanged()
    {
        selectionChanged = true;
        databaseHelper.saveTransitModeSelection(closestBundle);
    }

    public void refresh(Location location, Context context)
    {
        if (location == null)
        {
            (new BundleTask(context, null, true, this)).execute();
            return;
        }
        if (shouldLoad(location))
        {
            lastLocation = location;
            updateTimeZone();
            boolean flag;
            if (loadedAll)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            (new BundleTask(context, location, flag, this)).execute();
            loadedAll = true;
            return;
        } else
        {
            lastLocation = location;
            notifyCallbacks();
            return;
        }
    }

    public void removeFeedManagerCallback(FeedManagerCallback feedmanagercallback)
    {
        callbacks.remove(feedmanagercallback);
    }
}
