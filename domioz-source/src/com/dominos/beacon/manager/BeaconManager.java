// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Location;
import android.net.Uri;
import android.text.format.DateUtils;
import com.dominos.activities.LandingActivity_;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.beacon.activities.BeaconCheckInActivity_;
import com.dominos.beacon.api.BeaconAPI;
import com.dominos.beacon.api.BeaconConfigurationAPI;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.model.BeaconConfig;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.service.BeaconService_;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import com.dominos.beacon.util.BeaconNotificationUI;
import com.dominos.beacon.util.BeaconUtil;
import com.dominos.handlers.LocationUpdateHandler;
import com.dominos.handlers.LocationUpdateHandler_;
import com.dominos.loader.ApplicationLoader;
import com.dominos.utils.AnalyticsUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.api.c.k;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.beacon.manager:
//            GeofenceManager

public class BeaconManager extends Manager
    implements com.dominos.handlers.LocationUpdateHandler.OnLocationDataListener
{

    private static final int RECENT_STORE_ORDER_INDEX = 0;
    private static final String TAG = com/dominos/beacon/manager/BeaconManager.getSimpleName();
    AnalyticsUtil mAnalyticsUtil;
    ApplicationLoader mApplicationLoader;
    private Beacon mBeacon;
    BeaconAPI mBeaconAPI;
    private BeaconConfig mBeaconConfig;
    BeaconConfigurationAPI mBeaconConfigurationAPI;
    BeaconConfigurationPreferences_ mBeaconPreferences;
    private boolean mCheckInPending;
    Context mContext;
    private GeofenceManager mGeofenceManager;
    BeaconNotificationUI mNotificationUI;
    private com.dominos.beacon.model.CarryoutOrder.Order mOrder;
    private UserProfileManager mUserProfileManager;

    public BeaconManager()
    {
        mCheckInPending = false;
    }

    private void postNotification(Beacon beacon, String s, CarryoutOrder carryoutorder)
    {
        if (carryoutorder.getStatusItems().getUser().equals("ANONYMOUS"))
        {
            mNotificationUI.showWelcomeNotification(mContext, carryoutorder, beacon);
            return;
        } else
        {
            mNotificationUI.showConfirmationNotification(mContext, carryoutorder, s, beacon);
            return;
        }
    }

    private void setGeoFence(List list, final String currentZipCode)
    {
        mGeofenceManager.setupGeofences(list, new _cls2());
    }

    private void setupGeoFences(Location location)
    {
        String s1;
label0:
        {
            boolean flag1 = true;
            String s = (String)mBeaconPreferences.lastGefenceSetZipcode().c();
            s1 = BeaconUtil.getZipCodeFromLocation(mContext, location.getLatitude(), location.getLongitude());
            boolean flag;
            if (!StringHelper.equals(s, s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (DateUtils.isToday(mBeaconPreferences.lastGefenceSetTime().a(Long.valueOf(0L)).longValue()))
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                if (!mBeaconConfig.getEnableAllStores())
                {
                    break label0;
                }
                setGeoFenceForCurrentLocation(location, s1);
            }
            return;
        }
        setGeoFence(BeaconUtil.createGeofenceDataFromLocation(mBeaconConfig.getStoreLocationInfo()), s1);
    }

    public void checkIn(com.dominos.beacon.model.CarryoutOrder.Order order, Beacon beacon, BeaconCheckInCallback beaconcheckincallback)
    {
        beaconcheckincallback.onBegin();
        if (order == null || beacon == null)
        {
            beaconcheckincallback.onCheckInFailed();
            LogUtil.e(TAG, "order or beacon is null", new Object[] {
                order, beacon
            });
        } else
        if (mBeaconAPI.sendCheckInStatus(order.getOrderId(), beacon.getMajor(), beacon.getMinor()))
        {
            beaconcheckincallback.onCheckInSuccess();
        } else
        {
            mAnalyticsUtil.postOnEventCheckinFailure();
            beaconcheckincallback.onCheckInFailed();
        }
        beaconcheckincallback.onFinish();
    }

    public void checkInCustomer(Context context, CarryoutOrder carryoutorder, boolean flag, Beacon beacon)
    {
        if (flag)
        {
            LogUtil.d(TAG, "Customer is profiled!", new Object[0]);
            mBeacon = beacon;
            mOrder = (com.dominos.beacon.model.CarryoutOrder.Order)carryoutorder.getOrder().get(0);
            mCheckInPending = true;
            if (LandingActivity_.getInstance() == null)
            {
                LogUtil.d(TAG, "App is not launched, starting now..", new Object[0]);
                carryoutorder = new Intent("android.intent.action.VIEW");
                carryoutorder.setData(Uri.parse("dominos://android"));
                carryoutorder.addFlags(0x10000000);
                carryoutorder.putExtra("beacon.manager.setup", true);
                context.startActivity(carryoutorder);
                return;
            } else
            {
                LogUtil.d(TAG, "App is already in stack , starting Landing activity...", new Object[0]);
                carryoutorder = new Intent(context, com/dominos/activities/LandingActivity_);
                carryoutorder.addFlags(0x10000000);
                context.startActivity(carryoutorder);
                return;
            }
        } else
        {
            LogUtil.d(TAG, "Customer is anonymous!", new Object[0]);
            ((com.dominos.beacon.activities.BeaconCheckInActivity_.IntentBuilder_)BeaconCheckInActivity_.intent(context).mCarryoutOrder(carryoutorder).mBeacon(beacon).flags(0x50800000)).start();
            return;
        }
    }

    public void checkInProfiledCustomerIfPending(BeaconCheckInCallback beaconcheckincallback)
    {
        if (mCheckInPending)
        {
            setCheckInPopupPending(false);
            beaconcheckincallback.onBegin();
            if (mBeaconAPI.sendCheckInStatus(mOrder.getOrderId(), mBeacon.getMajor(), mBeacon.getMinor()))
            {
                beaconcheckincallback.onCheckInSuccess();
            } else
            {
                mAnalyticsUtil.postOnEventCheckinFailure();
                beaconcheckincallback.onCheckInFailed();
            }
            beaconcheckincallback.onFinish();
        }
    }

    public Beacon getBeacon()
    {
        return mBeacon;
    }

    public String getName()
    {
        return "beacon_manager";
    }

    public boolean isCheckInPending()
    {
        return mCheckInPending;
    }

    public void loadAllOpenOrders(Beacon beacon, BeaconOrderListCallback beaconorderlistcallback)
    {
        beaconorderlistcallback.onBegin();
        beacon = mBeaconAPI.getAllOpenOrders(beacon.getMajor(), beacon.getMinor());
        if (beacon != null)
        {
            beaconorderlistcallback.onBeaconOrderList(beacon);
        } else
        {
            beaconorderlistcallback.onBeaconRequestFailed();
        }
        beaconorderlistcallback.onFinish();
    }

    protected void loadConfigurationAndSetGeoFence(String s, int i)
    {
        s = mBeaconConfigurationAPI.loadBeaconConfiguration(s, i);
        if (s != null)
        {
            mBeaconConfig = s;
            setupLocationServices();
            i = s.getGeoFenceRadius();
            mGeofenceManager.setRadius(i);
            return;
        } else
        {
            LogUtil.d(TAG, "Loading beacon configuration failed!", new Object[0]);
            return;
        }
    }

    protected void loadOrder(Beacon beacon)
    {
        if (mUserProfileManager.isAuthorizedUser())
        {
            String s = mUserProfileManager.getCurrentUser().getFirstName();
            Object obj = mUserProfileManager.getCurrentUser().getPhone();
            obj = mBeaconAPI.getProfiledCustomerOrder(((String) (obj)), beacon.getMajor(), beacon.getMinor());
            if (obj != null && ((CarryoutOrder) (obj)).getStatusItems().getUser() != null && !StringHelper.equals(((CarryoutOrder) (obj)).getStatusItems().getCode(), "FAILURE"))
            {
                postNotification(beacon, s, ((CarryoutOrder) (obj)));
                mAnalyticsUtil.postOnEventCheckinOrderListLoad();
            } else
            {
                LogUtil.d(TAG, "Unable to load order \n", new Object[0]);
                mAnalyticsUtil.postOnEventCheckinOrderListLoadError();
            }
        } else
        {
            CarryoutOrder carryoutorder = mBeaconAPI.getAllOpenOrders(beacon.getMajor(), beacon.getMinor());
            if (carryoutorder != null && carryoutorder.getStatusItems().getUser() != null && !carryoutorder.getStatusItems().getCode().equals("FAILURE"))
            {
                mNotificationUI.showWelcomeNotification(mContext, carryoutorder, beacon);
                mAnalyticsUtil.postOnEventCheckinOrderListLoad();
            } else
            {
                LogUtil.d(TAG, "Unable to load order \n", new Object[0]);
                mAnalyticsUtil.postOnEventCheckinOrderListLoadError();
            }
        }
        stopBeaconService();
    }

    public void loadProfileCustomerOrder(String s, Beacon beacon, BeaconOrderListCallback beaconorderlistcallback)
    {
        beaconorderlistcallback.onBegin();
        s = mBeaconAPI.getProfiledCustomerOrder(s, beacon.getMajor(), beacon.getMinor());
        if (s != null)
        {
            beaconorderlistcallback.onBeaconOrderList(s);
        } else
        {
            beaconorderlistcallback.onBeaconRequestFailed();
        }
        beaconorderlistcallback.onFinish();
    }

    public void onBeaconFound(final Beacon beacon)
    {
        mAnalyticsUtil.postOnEventBeaconFound();
        mBeacon = beacon;
        if (!mApplicationLoader.isApplicationInitialized())
        {
            mApplicationLoader.setupAsync(getSession(), new _cls1());
            return;
        } else
        {
            loadOrder(beacon);
            return;
        }
    }

    public void onBeaconServiceStopped()
    {
        mAnalyticsUtil.postOnEventBeaconServiceStop();
    }

    public void onLocationCompleted(Location location)
    {
        if (location != null)
        {
            setupGeoFences(location);
            return;
        } else
        {
            LogUtil.d(TAG, "Unable to get the current location", new Object[0]);
            return;
        }
    }

    protected void onSessionSet()
    {
        mGeofenceManager = (GeofenceManager)getSession().getManager("geofence_manager");
        mUserProfileManager = (UserProfileManager)getSession().getManager("user_manager");
    }

    public void setCheckInPopupPending(boolean flag)
    {
        mCheckInPending = flag;
    }

    protected void setGeoFenceForCurrentLocation(Location location, String s)
    {
        Object obj = mBeaconAPI.getNearByStoresAddress(location);
        if (obj == null || ((List) (obj)).isEmpty())
        {
            LogUtil.d(TAG, "Unable to get the store addresses", new Object[0]);
        } else
        {
            location = new ArrayList();
            Address address;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); location.add((new com.dominos.beacon.model.GeofenceData.Builder()).setLatitude(address.getLatitude()).setLongitude(address.getLongitude()).build()))
            {
                address = (Address)((Iterator) (obj)).next();
            }

            if (!location.isEmpty())
            {
                setGeoFence(location, s);
                return;
            }
        }
    }

    public void setup(String s, int i)
    {
        if (mBeaconAPI.hasDeviceSupportBeacon())
        {
            loadConfigurationAndSetGeoFence(s, i);
            return;
        } else
        {
            LogUtil.d(TAG, "BLE Feature not supported by this device.", new Object[0]);
            return;
        }
    }

    protected void setupLocationServices()
    {
        LocationUpdateHandler_ locationupdatehandler_ = LocationUpdateHandler_.getInstance_(mContext);
        if (locationupdatehandler_.canUseLocationServices())
        {
            locationupdatehandler_.setLocationCompletedListener(this);
        }
    }

    public void startBeaconService()
    {
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothadapter != null && bluetoothadapter.isEnabled() && mBeaconConfig != null)
        {
            mAnalyticsUtil.postOnEventBeaconServiceStart();
            Intent intent = new Intent(mContext, com/dominos/beacon/service/BeaconService_);
            intent.setAction("beacon.intent.action.BEACON_START");
            intent.putExtra("beacon.delay", mBeaconConfig.getScanDelayInterval());
            intent.putExtra("beacon.scan.time", mBeaconConfig.getScanDuration());
            mContext.startService(intent);
        }
    }

    public void stopBeaconService()
    {
        Intent intent = new Intent(mContext, com/dominos/beacon/service/BeaconService_);
        mContext.stopService(intent);
    }



    private class _cls2 extends GeofenceManager.GeofenceCallback
    {

        final BeaconManager this$0;
        final String val$currentZipCode;

        public void onGeofenceSetFailure()
        {
        }

        public void onGeofenceSetSuccess()
        {
            mBeaconPreferences.lastGefenceSetZipcode().b(currentZipCode);
            mBeaconPreferences.lastGefenceSetTime().b(Long.valueOf(System.currentTimeMillis()));
            LogUtil.d(BeaconManager.TAG, "Set geo-fences successfully", new Object[0]);
        }

        _cls2()
        {
            this$0 = BeaconManager.this;
            currentZipCode = s;
            super();
        }
    }


    private class BeaconCheckInCallback extends BaseCallback
    {

        public abstract void onCheckInFailed();

        public abstract void onCheckInSuccess();

        public BeaconCheckInCallback()
        {
        }
    }


    private class BeaconOrderListCallback extends BaseCallback
    {

        public abstract void onBeaconOrderList(CarryoutOrder carryoutorder);

        public abstract void onBeaconRequestFailed();

        public BeaconOrderListCallback()
        {
        }
    }


    private class _cls1
        implements com.dominos.loader.ApplicationLoader.SetupLoadCallback
    {

        final BeaconManager this$0;
        final Beacon val$beacon;

        public void onSetupFailure(int i, String s)
        {
        }

        public void onSetupSuccess()
        {
            loadOrder(beacon);
        }

        _cls1()
        {
            this$0 = BeaconManager.this;
            beacon = beacon1;
            super();
        }
    }

}
