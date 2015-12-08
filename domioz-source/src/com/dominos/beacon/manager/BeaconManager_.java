// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.manager;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.dominos.beacon.api.BeaconAPI_;
import com.dominos.beacon.api.BeaconConfigurationAPI_;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;
import com.dominos.beacon.util.BeaconNotificationUI_;
import com.dominos.loader.ApplicationLoader_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.a;

// Referenced classes of package com.dominos.beacon.manager:
//            BeaconManager

public final class BeaconManager_ extends BeaconManager
{

    private Context context_;
    private Handler handler_;

    private BeaconManager_(Context context)
    {
        handler_ = new Handler(Looper.getMainLooper());
        context_ = context;
        init_();
    }

    public static BeaconManager_ getInstance_(Context context)
    {
        return new BeaconManager_(context);
    }

    private void init_()
    {
        mBeaconPreferences = new BeaconConfigurationPreferences_(context_);
        mApplicationLoader = ApplicationLoader_.getInstance_(context_);
        mBeaconConfigurationAPI = BeaconConfigurationAPI_.getInstance_(context_);
        mBeaconAPI = BeaconAPI_.getInstance_(context_);
        mNotificationUI = BeaconNotificationUI_.getInstance_(context_);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mContext = context_;
    }

    public final void checkIn(com.dominos.beacon.model.CarryoutOrder.Order order, Beacon beacon, BeaconManager.BeaconCheckInCallback beaconcheckincallback)
    {
        a.a(new _cls7(order, beacon, beaconcheckincallback));
    }

    public final void checkInProfiledCustomerIfPending(BeaconManager.BeaconCheckInCallback beaconcheckincallback)
    {
        a.a(new _cls6(0, "", beaconcheckincallback));
    }

    public final void loadAllOpenOrders(Beacon beacon, BeaconManager.BeaconOrderListCallback beaconorderlistcallback)
    {
        a.a(new _cls5("", beacon, beaconorderlistcallback));
    }

    public final void loadConfigurationAndSetGeoFence(String s, int i)
    {
        a.a(new _cls2("", s, i));
    }

    public final void loadOrder(Beacon beacon)
    {
        a.a(new _cls3(0, "", beacon));
    }

    public final void loadProfileCustomerOrder(String s, Beacon beacon, BeaconManager.BeaconOrderListCallback beaconorderlistcallback)
    {
        a.a(new _cls4(s, beacon, beaconorderlistcallback));
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }

    public final void setGeoFenceForCurrentLocation(Location location, String s)
    {
        a.a(new _cls8("", location, s));
    }

    public final void setupLocationServices()
    {
        handler_.post(new _cls1());
    }









    private class _cls7 extends c
    {

        final BeaconManager_ this$0;
        final Beacon val$beacon;
        final BeaconManager.BeaconCheckInCallback val$callback;
        final com.dominos.beacon.model.CarryoutOrder.Order val$order;

        public void execute()
        {
            try
            {
                checkIn(order, beacon, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls7(com.dominos.beacon.model.CarryoutOrder.Order order1, Beacon beacon1, BeaconManager.BeaconCheckInCallback beaconcheckincallback)
        {
            this$0 = BeaconManager_.this;
            order = order1;
            beacon = beacon1;
            callback = beaconcheckincallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls6 extends c
    {

        final BeaconManager_ this$0;
        final BeaconManager.BeaconCheckInCallback val$callback;

        public void execute()
        {
            try
            {
                checkInProfiledCustomerIfPending(callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls6(int i, String s1, BeaconManager.BeaconCheckInCallback beaconcheckincallback)
        {
            this$0 = BeaconManager_.this;
            callback = beaconcheckincallback;
            super(final_s, i, s1);
        }
    }


    private class _cls5 extends c
    {

        final BeaconManager_ this$0;
        final Beacon val$beacon;
        final BeaconManager.BeaconOrderListCallback val$callback;

        public void execute()
        {
            try
            {
                loadAllOpenOrders(beacon, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls5(String s1, Beacon beacon1, BeaconManager.BeaconOrderListCallback beaconorderlistcallback)
        {
            this$0 = BeaconManager_.this;
            beacon = beacon1;
            callback = beaconorderlistcallback;
            super(final_s, final_i, s1);
        }
    }


    private class _cls2 extends c
    {

        final BeaconManager_ this$0;
        final String val$beaconConfigUrl;
        final int val$beaconVersionCode;

        public void execute()
        {
            try
            {
                loadConfigurationAndSetGeoFence(beaconConfigUrl, beaconVersionCode);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls2(String s1, String s2, int j)
        {
            this$0 = BeaconManager_.this;
            beaconConfigUrl = s2;
            beaconVersionCode = j;
            super(final_s, final_i, s1);
        }
    }


    private class _cls3 extends c
    {

        final BeaconManager_ this$0;
        final Beacon val$beacon;

        public void execute()
        {
            try
            {
                loadOrder(beacon);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls3(int i, String s1, Beacon beacon1)
        {
            this$0 = BeaconManager_.this;
            beacon = beacon1;
            super(final_s, i, s1);
        }
    }


    private class _cls4 extends c
    {

        final BeaconManager_ this$0;
        final Beacon val$beacon;
        final BeaconManager.BeaconOrderListCallback val$callback;
        final String val$customerPhone;

        public void execute()
        {
            try
            {
                loadProfileCustomerOrder(customerPhone, beacon, callback);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls4(String s2, Beacon beacon1, BeaconManager.BeaconOrderListCallback beaconorderlistcallback)
        {
            this$0 = BeaconManager_.this;
            customerPhone = s2;
            beacon = beacon1;
            callback = beaconorderlistcallback;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls8 extends c
    {

        final BeaconManager_ this$0;
        final Location val$currentLocation;
        final String val$currentZipCode;

        public void execute()
        {
            try
            {
                setGeoFenceForCurrentLocation(currentLocation, currentZipCode);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls8(String s1, Location location, String s2)
        {
            this$0 = BeaconManager_.this;
            currentLocation = location;
            currentZipCode = s2;
            super(final_s, final_i, s1);
        }
    }


    private class _cls1
        implements Runnable
    {

        final BeaconManager_ this$0;

        public void run()
        {
            setupLocationServices();
        }

        _cls1()
        {
            this$0 = BeaconManager_.this;
            super();
        }
    }

}
