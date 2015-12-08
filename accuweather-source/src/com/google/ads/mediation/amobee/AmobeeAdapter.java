// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.amobee;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.AmobeeAdPlaceholder;
import com.amobee.adsdk.AmobeeInterstitial;
import com.amobee.adsdk.AmobeeInterstitialListener;
import com.amobee.adsdk.IAmobeeListener;
import com.amobee.adsdk.Parameters;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.ads.mediation.amobee:
//            AmobeeServerParameters, AmobeeExtras

public final class AmobeeAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter, IAmobeeListener, AmobeeInterstitialListener
{

    public static final String TAG = "Gooogle AmobeeAdapter";
    private AdManager adManager;
    private AmobeeAdPlaceholder amobeeAdPlaceholder;
    private AmobeeInterstitial amobeeInterstitial;
    private Activity bannerActivity;
    private MediationBannerListener bannerListener;
    private boolean bannerNeedToReportDismiss;
    private boolean interstitalNeedToReportDismiss;
    private Activity interstitialActivity;
    private MediationInterstitialListener interstitialListener;
    private boolean onClickWasCalledOnOverlay;

    public AmobeeAdapter()
    {
        amobeeAdPlaceholder = null;
        amobeeInterstitial = null;
        interstitialActivity = null;
        bannerActivity = null;
        onClickWasCalledOnOverlay = false;
        bannerNeedToReportDismiss = false;
        interstitalNeedToReportDismiss = false;
    }

    private void configureRequestParameters(MediationAdRequest mediationadrequest)
    {
        if (mediationadrequest.getBirthday() != null)
        {
            adManager.parameters().setDob(mediationadrequest.getBirthday());
        }
        if (mediationadrequest.getAgeInYears() != null)
        {
            adManager.parameters().setAge(mediationadrequest.getAgeInYears().intValue());
        }
        if (mediationadrequest.getLocation() != null)
        {
            adManager.parameters().setLocation(mediationadrequest.getLocation());
        }
        if (mediationadrequest.getGender() != null)
        {
            com.google.ads.AdRequest.Gender gender = mediationadrequest.getGender();
            if (gender == com.google.ads.AdRequest.Gender.MALE)
            {
                adManager.parameters().setGender(com.amobee.adsdk.Parameters.Gender.Male);
            } else
            if (gender == com.google.ads.AdRequest.Gender.FEMALE)
            {
                adManager.parameters().setGender(com.amobee.adsdk.Parameters.Gender.Female);
            }
        }
        if (mediationadrequest.getKeywords() == null) goto _L2; else goto _L1
_L1:
        mediationadrequest = mediationadrequest.getKeywords().iterator();
_L5:
        if (mediationadrequest.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        String s = (String)mediationadrequest.next();
        adManager.parameters().addKeyword(s);
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void configureServerUrl(AdManager admanager, AmobeeServerParameters amobeeserverparameters)
    {
        if (admanager.getServerURL() == null || admanager.getServerURL().equals(""))
        {
            admanager.setServerURL("http://rrmprod.amobee.com/upsteed/wap/adrequest");
        }
        if (amobeeserverparameters.domain != null && !amobeeserverparameters.domain.equals(""))
        {
            Object obj = amobeeserverparameters.domain;
            amobeeserverparameters = ((AmobeeServerParameters) (obj));
            if (!((String) (obj)).startsWith("http"))
            {
                amobeeserverparameters = (new StringBuilder("http://")).append(((String) (obj))).toString();
            }
            obj = amobeeserverparameters;
            if (amobeeserverparameters.endsWith(".com"))
            {
                obj = (new StringBuilder(String.valueOf(amobeeserverparameters))).append("/upsteed/wap/adrequest").toString();
            }
            admanager.setServerURL(((String) (obj)));
        }
    }

    private void registerActivityLifecycleCallbacks(final Activity activity, final boolean isBanner)
    {
        while (activity == null || android.os.Build.VERSION.SDK_INT < 14) 
        {
            return;
        }
        android.app.Application.ActivityLifecycleCallbacks activitylifecyclecallbacks = new android.app.Application.ActivityLifecycleCallbacks() {

            final AmobeeAdapter this$0;
            private final Activity val$activity;
            private final boolean val$isBanner;

            public void onActivityCreated(Activity activity1, Bundle bundle)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivityCreated");
            }

            public void onActivityDestroyed(Activity activity1)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivityDestroyed");
            }

            public void onActivityPaused(Activity activity1)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivityPaused");
            }

            public void onActivityResumed(Activity activity1)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivityResumed");
            }

            public void onActivitySaveInstanceState(Activity activity1, Bundle bundle)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivitySaveInstanceState");
            }

            public void onActivityStarted(Activity activity1)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivityStarted");
                if (activity1 == activity)
                {
                    if (isBanner && bannerNeedToReportDismiss)
                    {
                        bannerListener.onDismissScreen(AmobeeAdapter.this);
                        bannerNeedToReportDismiss = false;
                    }
                    if (!isBanner && interstitalNeedToReportDismiss)
                    {
                        if (interstitialListener != null)
                        {
                            interstitialListener.onDismissScreen(AmobeeAdapter.this);
                        }
                        interstitalNeedToReportDismiss = false;
                    }
                }
                activity1.getApplication().unregisterActivityLifecycleCallbacks(this);
            }

            public void onActivityStopped(Activity activity1)
            {
                Log.d("Gooogle AmobeeAdapter", "onActivityStopped");
            }

            
            {
                this$0 = AmobeeAdapter.this;
                activity = activity1;
                isBanner = flag;
                super();
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(activitylifecyclecallbacks);
    }

    public void amobeeOnAdFailed(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (bannerListener != null)
        {
            bannerListener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }
    }

    public void amobeeOnAdRecieved(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (bannerListener != null)
        {
            bannerListener.onReceivedAd(this);
        }
    }

    public void amobeeOnError()
    {
    }

    public void amobeeOnLeavingApplication(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        if (!onClickWasCalledOnOverlay)
        {
            bannerNeedToReportDismiss = true;
            if (bannerListener != null)
            {
                bannerListener.onClick(this);
                bannerListener.onPresentScreen(this);
            }
        }
        registerActivityLifecycleCallbacks(bannerActivity, true);
        if (bannerListener != null)
        {
            bannerListener.onLeaveApplication(this);
        }
    }

    public void amobeeOnOverlay(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        onClickWasCalledOnOverlay = true;
        if (bannerListener != null)
        {
            bannerListener.onClick(this);
            bannerListener.onPresentScreen(this);
        }
    }

    public void amobeeOnOverlayDismissed(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        onClickWasCalledOnOverlay = false;
        if (bannerListener != null)
        {
            bannerListener.onDismissScreen(this);
        }
    }

    public void destroy()
    {
        bannerListener = null;
        interstitialListener = null;
    }

    public Class getAdditionalParametersType()
    {
        return com/google/ads/mediation/amobee/AmobeeExtras;
    }

    public View getBannerView()
    {
        return amobeeAdPlaceholder;
    }

    public Class getServerParametersType()
    {
        return com/google/ads/mediation/amobee/AmobeeServerParameters;
    }

    public void interstitialClicked(AmobeeInterstitial amobeeinterstitial)
    {
        interstitalNeedToReportDismiss = true;
        registerActivityLifecycleCallbacks(interstitialActivity, false);
        if (interstitialListener != null)
        {
            interstitialListener.onLeaveApplication(this);
        }
    }

    public void interstitialClosed(AmobeeInterstitial amobeeinterstitial)
    {
        if (interstitialListener != null)
        {
            interstitialListener.onDismissScreen(this);
        }
    }

    public void interstitialFailed(AmobeeInterstitial amobeeinterstitial)
    {
        if (interstitialListener != null)
        {
            interstitialListener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }
    }

    public void interstitialRecieved(AmobeeInterstitial amobeeinterstitial)
    {
        if (interstitialListener != null)
        {
            interstitialListener.onReceivedAd(this);
        }
    }

    public volatile void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestBannerAd(mediationbannerlistener, activity, (AmobeeServerParameters)mediationserverparameters, adsize, mediationadrequest, (AmobeeExtras)networkextras);
    }

    public void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, AmobeeServerParameters amobeeserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, AmobeeExtras amobeeextras)
    {
        adManager = AdManager.getInstance(activity);
        bannerListener = mediationbannerlistener;
        bannerActivity = activity;
        onClickWasCalledOnOverlay = false;
        if (amobeeAdPlaceholder == null)
        {
            amobeeAdPlaceholder = new AmobeeAdPlaceholder(activity);
        }
        amobeeAdPlaceholder.setLayoutParams(new android.widget.FrameLayout.LayoutParams(adsize.getWidthInPixels(activity), adsize.getHeightInPixels(activity)));
        if (adsize.getWidth() < 0 || adsize.getHeight() < 0)
        {
            double d = AdManager.getDensity(activity);
            amobeeAdPlaceholder.setBannerSize((int)((double)adsize.getWidthInPixels(activity) / d), (int)((double)adsize.getHeightInPixels(activity) / d));
        } else
        {
            amobeeAdPlaceholder.setBannerSize(adsize.getWidth(), adsize.getHeight());
        }
        amobeeAdPlaceholder.amrp = true;
        configureServerUrl(adManager, amobeeserverparameters);
        configureRequestParameters(mediationadrequest);
        adManager.setAmobeeListener(this);
        amobeeAdPlaceholder.setAdSpace(amobeeserverparameters.adspace);
        adManager.getAd(amobeeAdPlaceholder);
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestInterstitialAd(mediationinterstitiallistener, activity, (AmobeeServerParameters)mediationserverparameters, mediationadrequest, (AmobeeExtras)networkextras);
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, AmobeeServerParameters amobeeserverparameters, MediationAdRequest mediationadrequest, AmobeeExtras amobeeextras)
    {
        adManager = AdManager.getInstance(activity);
        configureServerUrl(adManager, amobeeserverparameters);
        configureRequestParameters(mediationadrequest);
        interstitialActivity = activity;
        interstitialListener = mediationinterstitiallistener;
        amobeeInterstitial = new AmobeeInterstitial();
        amobeeInterstitial.setListener(this);
        amobeeInterstitial.getInterstitial(amobeeserverparameters.adspace);
    }

    public void showInterstitial()
    {
        if (amobeeInterstitial != null && interstitialActivity != null)
        {
            if (interstitialListener != null)
            {
                interstitialListener.onPresentScreen(this);
            }
            amobeeInterstitial.show(interstitialActivity);
        }
    }






}
