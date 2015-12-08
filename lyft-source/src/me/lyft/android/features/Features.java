// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.features;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.features:
//            FeatureFlag

public class Features
{

    public static final FeatureFlag CONFIRMATION_FLOW = FeatureFlag.create("confirmation_flow", "2014-10-1", "https://lyftme.atlassian.net/browse/LYFT-41475", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.rideConfirmationEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag DESTINY = FeatureFlag.create("destiny", "https://lyftme.atlassian.net/browse/LYFT-39718 ", "2014-12-12", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.destinyEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag ENABLE_PASSENGER_RIDE_MAP_TRAFFIC = FeatureFlag.create("enable_passenger_ride_map_traffic", "https://lyftme.atlassian.net/browse/LYFT-41709", "2015-9-14", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.enablePassengerRideMapTraffic;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    static final List FEATURE_FLAGS = new ArrayList();
    public static final FeatureFlag HEATMAPS = FeatureFlag.create("heatmaps", "https://lyftme.atlassian.net/browse/LYFT-39719", "2014-06-01", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.heatmapEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag LAST_RIDE = FeatureFlag.create("last_ride", "https://lyftme.atlassian.net/browse/LYFT-43533", "2015-10-12", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.lastRideEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag PRICE_ESTIMATE_WIDGET = FeatureFlag.create("price_estimate_widget", "2015/10/19", "https://lyftme.atlassian.net/browse/LYFT-41476", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.fareEstimateEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag QUEUED_RIDES = FeatureFlag.create("queued_rides", "2015-11-09", "https://lyftme.atlassian.net/browse/LYFT-43692", new Func1() {

        public Boolean call(Constants constants)
        {
            return Boolean.valueOf(false);
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag ROUTE_DIRECTIONS = FeatureFlag.create("route_directions", "https://lyftme.atlassian.net/browse/LYFT-43746", "2015-10-14", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.routeDirectionsEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag ROUTE_DIRECTIONS_INCLUDE_DRIVE = FeatureFlag.create("route_directions_include_driver", "https://lyftme.atlassian.net/browse/LYFT-43746", "2015-10-14", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.routeDirectionsIncludeDriver;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag SEARCH_FALLBACK = FeatureFlag.create("search_fallback", "2014-10-16", "https://lyftme.atlassian.net/browse/LYFT-42424", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.featureSearchFallbackEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });
    public static final FeatureFlag SMS_TO_DRIVER = FeatureFlag.create("sms_to_driver", "2015-10-7", "https://lyftme.atlassian.net/browse/LYFT-43221", new Func1() {

        public Boolean call(Constants constants)
        {
            return constants.smsToDriverEnabled;
        }

        public volatile Object call(Object obj)
        {
            return call((Constants)obj);
        }

    });

    public Features()
    {
    }

    static void add(FeatureFlag featureflag)
    {
        FEATURE_FLAGS.add(featureflag);
    }

}
