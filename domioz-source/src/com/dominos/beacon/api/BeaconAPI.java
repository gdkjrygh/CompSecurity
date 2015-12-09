// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.api;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Location;
import com.dominos.android.sdk.common.DeviceCapabilities;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.locator.LocatorResult;
import com.dominos.android.sdk.common.dom.locator.LocatorStore;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.beacon.client.BeaconRestClient;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import com.dominos.beacon.util.BeaconUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.api.c.d;

public class BeaconAPI
{

    private static final int NUMBER_OF_STORES = 5;
    private static final String TAG = com/dominos/beacon/api/BeaconAPI.getSimpleName();
    BeaconConfigurationPreferences_ mBeaconConfigurationPreferences;
    BeaconRestClient mBeaconRestClient;
    Context mContext;
    DeviceCapabilities mDeviceCapabilities;
    PowerRestClient mPowerRestClient;

    public BeaconAPI()
    {
    }

    private List getStoreFromLocation(Address address)
    {
        Object obj = new StringBuilder();
        for (int i = 0; i < address.getMaxAddressLineIndex(); i++)
        {
            ((StringBuilder) (obj)).append(address.getAddressLine(i));
        }

        ((StringBuilder) (obj)).trimToSize();
        obj = ((StringBuilder) (obj)).toString();
        address = address.getPostalCode();
        address = mPowerRestClient.locateStores(((String) (obj)), address);
        if (address != null)
        {
            return address.getStores();
        } else
        {
            return null;
        }
    }

    public CarryoutOrder getAllOpenOrders(int i, int j)
    {
        return mBeaconRestClient.getOrder(i, j);
    }

    public List getNearByStoresAddress(Location location)
    {
        location = BeaconUtil.createAddressFromLocation(mContext, Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        if (location == null)
        {
            LogUtil.d(TAG, "Unable to get the Address for current location.", new Object[0]);
            return null;
        }
        Object obj = getStoreFromLocation(location);
        if (obj == null)
        {
            LogUtil.d(TAG, "Unable to get the near by stores.", new Object[0]);
            return null;
        }
        location = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            location.add(((LocatorStore)((Iterator) (obj)).next()).getAddressDescription());
        } while (location.size() != 5);
        return BeaconUtil.createAddressListFromLocationNames(mContext, location);
    }

    public CarryoutOrder getProfiledCustomerOrder(String s, int i, int j)
    {
        return mBeaconRestClient.getOrderByPhone(s, i, j);
    }

    public boolean hasDeviceSupportBeacon()
    {
        if (mDeviceCapabilities.isDeviceTablet() && !mBeaconConfigurationPreferences.tabletSupported().a(Boolean.valueOf(false)).booleanValue())
        {
            LogUtil.d(TAG, "Beacon not supported on tablet", new Object[0]);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18 && mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))
        {
            return true;
        }
        return false;
    }

    public boolean sendCheckInStatus(String s, int i, int j)
    {
        return mBeaconRestClient.checkIn(s, i, j);
    }

}
