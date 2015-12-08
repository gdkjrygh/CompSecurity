// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.studies.RideHistoryAnalytics;
import me.lyft.android.application.ridehistory.IPassengerRideHistoryService;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryDetails;
import me.lyft.android.domain.ridehistory.PaymentBreakdown;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryPaymentBreakdownView

public class PassengerRideHistoryDetailedView extends LinearLayout
{

    private Binder binder;
    View contentContainerView;
    private PassengerRideHistoryDetails details;
    ImageView driverPhotoImageView;
    Button findLostItemButton;
    TextView helpCenterTextView;
    ImageLoader imageLoader;
    ILyftPreferences lyftPreferences;
    IPassengerRideHistoryService passengerRideHistoryService;
    LinearLayout paymentBreakdownViewContainer;
    TextView pricingFaqTextView;
    IProgressController progressController;
    Button requestReviewButton;
    Button retryButton;
    View retryView;
    TextView rideDistanceAndDurationTextView;
    TextView rideDropoffAddressTextView;
    TextView rideDropoffTimeTextView;
    private String rideId;
    TextView ridePickupAddressTextView;
    TextView ridePickupTimeTextView;
    TextView rideSummaryTextView;
    TextView rideTotalTextView;
    ImageView routeMapImageView;
    ISignUrlService signUrlService;
    Button tipDriverButton;
    Toolbar toolbar;
    IViewErrorHandler viewErrorHandler;

    public PassengerRideHistoryDetailedView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            context = Scoop.a(this);
            context.b(this);
            rideId = ((RideHistoryScreens.PassengerRideHistoryDetailedScreen)context.a()).getRideId();
            return;
        }
    }

    private void bindDetailsToView(PassengerRideHistoryDetails passengerridehistorydetails)
    {
        details = passengerridehistorydetails;
        imageLoader.load(passengerridehistorydetails.getDriverPhotoUrl()).centerCrop().fit().into(driverPhotoImageView);
        imageLoader.load(passengerridehistorydetails.getMapImageUrl()).into(routeMapImageView);
        rideTotalTextView.setText(passengerridehistorydetails.getRideTotal());
        rideSummaryTextView.setText(getResources().getString(0x7f070234, new Object[] {
            passengerridehistorydetails.getDriverName()
        }));
        rideDistanceAndDurationTextView.setText(getResources().getString(0x7f070229, new Object[] {
            passengerridehistorydetails.getDistance(), passengerridehistorydetails.getDuration()
        }));
        ridePickupTimeTextView.setText(passengerridehistorydetails.getPickupTime());
        ridePickupAddressTextView.setText(passengerridehistorydetails.getPickupAddress());
        rideDropoffTimeTextView.setText(passengerridehistorydetails.getDropoffTime());
        rideDropoffAddressTextView.setText(passengerridehistorydetails.getDropoffAddress());
        PaymentBreakdown paymentbreakdown;
        for (Iterator iterator = passengerridehistorydetails.getPaymentsBreakdown().iterator(); iterator.hasNext(); paymentBreakdownViewContainer.addView(new PassengerRideHistoryPaymentBreakdownView(getContext(), paymentbreakdown, imageLoader)))
        {
            paymentbreakdown = (PaymentBreakdown)iterator.next();
        }

        toolbar.setTitle(passengerridehistorydetails.getPickupDateTime());
    }

    private String getRegion()
    {
        if (details != null)
        {
            return details.getRegion();
        } else
        {
            return "";
        }
    }

    private String getRideActionUrl(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(30);
        stringbuilder.append(lyftPreferences.getLyftWebRoot());
        stringbuilder.append(s);
        stringbuilder.append("/");
        stringbuilder.append(rideId);
        return stringbuilder.toString();
    }

    private void loadRideDetails()
    {
        final AsyncActionAnalytics analyitcs = RideHistoryAnalytics.trackLoadRideHistoryDetails();
        progressController.showProgress();
        contentContainerView.setVisibility(8);
        retryView.setVisibility(8);
        binder.bind(passengerRideHistoryService.getPassengerHistoryDetails(rideId), new AsyncCall() {

            final PassengerRideHistoryDetailedView this$0;
            final AsyncActionAnalytics val$analyitcs;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analyitcs.trackResponseFailure(throwable);
                retryView.setVisibility(0);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((PassengerRideHistoryDetails)obj);
            }

            public void onSuccess(PassengerRideHistoryDetails passengerridehistorydetails)
            {
                bindDetailsToView(passengerridehistorydetails);
                contentContainerView.setVisibility(0);
                analyitcs.trackResponseSuccess();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                analyitcs = asyncactionanalytics;
                super();
            }
        });
    }

    private void signUrlAndOpenBrowser(String s)
    {
        progressController.showProgress();
        binder.bind(signUrlService.getSignedUrl(s), new AsyncCall() {

            final PassengerRideHistoryDetailedView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s1)
            {
                super.onSuccess(s1);
                WebBrowser.open(getContext(), s1);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            ScreenAnalytics.trackScreenView("ride_details", rideId);
            binder = Binder.attach(this);
            loadRideDetails();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            pricingFaqTextView.setText(Html.fromHtml(getResources().getString(0x7f070232)));
            helpCenterTextView.setText(Html.fromHtml(getResources().getString(0x7f07022f)));
            tipDriverButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryDetailedView this$0;

                public void onClick(View view)
                {
                    RideHistoryAnalytics.trackAddTipTap(rideId);
                    signUrlAndOpenBrowser(getRideActionUrl("/addtip"));
                }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
            });
            findLostItemButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryDetailedView this$0;

                public void onClick(View view)
                {
                    RideHistoryAnalytics.trackLostAndFoundTap(rideId);
                    signUrlAndOpenBrowser(getRideActionUrl("/lostitem"));
                }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
            });
            requestReviewButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryDetailedView this$0;

                public void onClick(View view)
                {
                    RideHistoryAnalytics.trackPriceReviewTap(rideId);
                    signUrlAndOpenBrowser(getRideActionUrl("/rides"));
                }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
            });
            pricingFaqTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryDetailedView this$0;

                public void onClick(View view)
                {
                    view = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append(String.format("/pricing/%s", new Object[] {
                        getRegion()
                    })).toString();
                    WebBrowser.open(getContext(), view);
                }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
            });
            helpCenterTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryDetailedView this$0;

                public void onClick(View view)
                {
                    view = (new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/help").toString();
                    WebBrowser.open(getContext(), view);
                }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
            });
            retryButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PassengerRideHistoryDetailedView this$0;

                public void onClick(View view)
                {
                    loadRideDetails();
                }

            
            {
                this$0 = PassengerRideHistoryDetailedView.this;
                super();
            }
            });
            return;
        }
    }






}
