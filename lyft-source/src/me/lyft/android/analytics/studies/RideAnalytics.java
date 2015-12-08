// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.Event;
import me.lyft.android.analytics.LeanplumTrackerExtra;
import me.lyft.android.analytics.RedshiftTrackerExtra;
import me.lyft.android.analytics.SpanningAnalytics;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.lyft.ride.BannerItemDTO;

public final class RideAnalytics
{

    public RideAnalytics()
    {
    }

    public static AsyncActionAnalytics createShareRouteAnalytics()
    {
        return new AsyncActionAnalytics(ActionName.SHARE_ROUTE_URL_VALIDATE, Category.RIDE);
    }

    public static ActionAnalytics trackCancelRide(String s)
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.CANCEL_RIDE)).setParameter(s).trackInitiation();
    }

    public static void trackClearRequest()
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.CLEAR_REQUEST)).trackInitiation().trackSuccess();
    }

    public static void trackContactingDriverSetDestinationTap()
    {
        UiAnalytics.trackTap(UiElement.SET_DESTINATION_CLASSIC, Category.RIDE);
    }

    public static AsyncActionAnalytics trackDriverCancelRide()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.DRIVER_RIDE_CANCEL, Category.RIDE);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static void trackLeanplumAssignment(String s)
    {
        Analytics.track((new Event("leanplumAssignment")).addTracker(new LeanplumTrackerExtra(0.0D, s)));
    }

    public static void trackPaymentWidgetShown()
    {
        UiAnalytics.trackShown(UiElement.PAYMENT_WIDGET, Category.RIDE);
    }

    public static void trackPaymentWidgetTap()
    {
        UiAnalytics.trackTap(UiElement.PAYMENT_WIDGET, Category.RIDE);
    }

    public static void trackPromoBannerShown(BannerItemDTO banneritemdto, String s)
    {
        Analytics.track((new Event(EventName.PROMO_BANNER_SHOWN)).putParameter(Parameter.COPY, banneritemdto.getText()).putParameter(Parameter.DEEP_LINK_URL, banneritemdto.getDeeplink()).putParameter(Parameter.STANDARD_URL, banneritemdto.getUrl()).putParameter(Parameter.RIDE_TYPE, s).addTracker(RedshiftTrackerExtra.create()));
    }

    public static void trackPromoBannerTapped()
    {
        UiAnalytics.trackTap(UiElement.PROMO_BANNER, Category.RIDE);
    }

    public static AsyncActionAnalytics trackRateAndDonateDriver()
    {
        return (new AsyncActionAnalytics(ActionName.PASSENGER_RATE_AND_DONATE, Category.RIDE)).trackRequest();
    }

    public static void trackRequestPriceEstimate()
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.REQUEST_PRICE_ESTIMATE)).trackInitiation().trackSuccess();
    }

    public static void trackRequestRide()
    {
        UiAnalytics.trackTap(UiElement.REQUEST_RIDE, Category.RIDE);
        Analytics.track((new Event("clientRideRequested")).addTracker(new LeanplumTrackerExtra()));
    }

    public static ActionAnalytics trackRequestRideAction()
    {
        return (ActionAnalytics)(new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.REQUEST_RIDE)).trackInitiation();
    }

    public static void trackRideTypeInfoTap(String s)
    {
        UiAnalytics.trackTap(UiElement.RIDE_TYPE_INFO, Category.RIDE, s);
    }

    public static void trackRideTypeSwitch(String s)
    {
        Analytics.track((new Event(EventName.RIDE_TYPE_SWITCH)).putParameter(Parameter.RIDE_TYPE_SELECTED, s).addTracker(RedshiftTrackerExtra.create()));
    }

    public static void trackSetDestination(Location location)
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SET_DESTINATION)).setParameter(location.getSource()).trackInitiation().trackSuccess();
    }

    public static void trackSetPickup(Location location)
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SET_PICKUP)).setParameter(location.getSource()).trackInitiation().trackSuccess();
    }

    public static void trackSetRideType(String s)
    {
        (new ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action.SET_RIDE_TYPE)).setParameter(s).trackInitiation().trackSuccess();
    }

    public static void trackTapSetDestination()
    {
        UiAnalytics.trackTap(UiElement.PASSENGER_SET_DESTINATION, Category.RIDE);
    }

    public static void trackTapSetPickup()
    {
        UiAnalytics.trackTap(UiElement.PASSENGER_SET_PICKUP, Category.RIDE);
    }
}
