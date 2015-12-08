// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.controllers.interfaces.IDominosStoreList;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;
import com.dominos.handlers.LocationUpdateHandler;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class StoreListController
    implements IDominosViewController, com.dominos.handlers.LocationUpdateHandler.OnLocationDataListener
{

    private Context mContext;
    private IDominosStoreList mIDominosView;
    LocationUpdateHandler mLocationUpdateHandler;
    PowerRestClient mPowerRestClient;

    public StoreListController(Context context)
    {
        mContext = context;
    }

    private void loadLocationAddress(double d, double d1)
    {
        Object obj = new Geocoder(mContext, Locale.getDefault());
        obj = ((Geocoder) (obj)).getFromLocation(d, d1, 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (!((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        mIDominosView.onLocateStoresCompleted(null);
        return;
        Address address = (Address)((List) (obj)).get(0);
        int i;
        obj = "";
        i = 0;
_L2:
        if (i >= address.getMaxAddressLineIndex())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(" ").append(address.getAddressLine(i)).toString();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            locateStores(((String) (obj)), address.getPostalCode());
            return;
        }
        catch (IOException ioexception)
        {
            mIDominosView.onLocateStoresCompleted(null);
        }
        return;
    }

    public void dispose()
    {
        mLocationUpdateHandler.dispose();
    }

    public void findStoresAtCurrentLocation()
    {
        Location location = mLocationUpdateHandler.getLastLocation();
        if (location != null)
        {
            loadLocationAddress(location.getLatitude(), location.getLongitude());
            return;
        }
        if (!mLocationUpdateHandler.canUseLocationServices())
        {
            mIDominosView.showGpsEnableDialog();
            return;
        }
        if (mLocationUpdateHandler.isConnecting())
        {
            mLocationUpdateHandler.setLocationCompletedListener(this);
            return;
        } else
        {
            mIDominosView.showRetryLocationDialog();
            return;
        }
    }

    public boolean isLocationProviderExists()
    {
        return mLocationUpdateHandler.isLocationProviderAvailable();
    }

    public void locateStores(String s, String s1)
    {
        mPowerRestClient.locateStores(s, s1, new _cls1());
    }

    public void onLocationCompleted(Location location)
    {
        if (location != null)
        {
            loadLocationAddress(location.getLatitude(), location.getLongitude());
            return;
        } else
        {
            mIDominosView.showRetryLocationDialog();
            return;
        }
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        mIDominosView = (IDominosStoreList)idominosview;
        return this;
    }


    private class _cls1 extends PowerRestCallback
    {

        final StoreListController this$0;

        public void onError(Exception exception, String s)
        {
            mIDominosView.onLocateStoresCompleted(null);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((String)obj);
        }

        public void onSuccess(String s)
        {
            s = LocatorResult.from(s);
            mIDominosView.onLocateStoresCompleted(s);
        }

        _cls1()
        {
            this$0 = StoreListController.this;
            super();
        }
    }

}
