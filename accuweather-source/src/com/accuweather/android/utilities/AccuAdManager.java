// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amobee.adsdk.AdManager;
import com.amobee.adsdk.AmobeeAdPlaceholder;
import com.amobee.adsdk.IAmobeeListener;
import com.amobee.adsdk.Parameters;
import com.amobee.richmedia.view.AmobeeView;
import com.appattach.tracking.appAttachTracking;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeSet;

// Referenced classes of package com.accuweather.android.utilities:
//            PartnerCoding, Logger, AdTrackingController, Utilities

public class AccuAdManager
{
    private class AmobeeListenerImpl
        implements IAmobeeListener
    {

        final AccuAdManager this$0;

        private AmobeeView getAmobeeView(AmobeeAdPlaceholder amobeeadplaceholder)
            throws NoSuchFieldException, IllegalAccessException
        {
            Field field = amobeeadplaceholder.getClass().getDeclaredField("currentAdapter");
            field.setAccessible(true);
            amobeeadplaceholder = ((AmobeeAdPlaceholder) (field.get(amobeeadplaceholder)));
            field = amobeeadplaceholder.getClass().getDeclaredField("ormmaView");
            field.setAccessible(true);
            return (AmobeeView)field.get(amobeeadplaceholder);
        }

        private void setSoftwareLayerOnAmobeeAdView(AmobeeAdPlaceholder amobeeadplaceholder)
        {
            if (!Utilities.isHoneycombOrGreater())
            {
                break MISSING_BLOCK_LABEL_28;
            }
            amobeeadplaceholder.setLayerType(1, null);
            amobeeadplaceholder = getAmobeeView(amobeeadplaceholder);
            if (amobeeadplaceholder == null)
            {
                break MISSING_BLOCK_LABEL_28;
            }
            amobeeadplaceholder.setLayerType(1, null);
_L1:
            return;
            amobeeadplaceholder;
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), (new StringBuilder()).append("In initAmobee(), couldn't get the webview via reflection: ").append(amobeeadplaceholder).toString());
                return;
            }
              goto _L1
        }

        public void amobeeOnAdFailed(AmobeeAdPlaceholder amobeeadplaceholder)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.i(getClass().getName(), "amobeeOnAdFailed");
            }
        }

        public void amobeeOnAdRecieved(AmobeeAdPlaceholder amobeeadplaceholder)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.i(getClass().getName(), "amobeeOnAdRecieved");
            }
            if (amobeeadplaceholder != null)
            {
                setSoftwareLayerOnAmobeeAdView(amobeeadplaceholder);
                amobeeadplaceholder.setVisibility(0);
            }
            if (PartnerCoding.isPartnerCodedAppAttach(mContext))
            {
                Logger.i(getClass().getName(), "partner is appattach send AdDisplayed event");
                appAttachTracking.event("AdDisplayed");
            }
        }

        public void amobeeOnError()
        {
            if (Logger.isDebugEnabled())
            {
                Logger.i(getClass().getName(), "amobeeOnError");
            }
        }

        public void amobeeOnLeavingApplication(AmobeeAdPlaceholder amobeeadplaceholder)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.i(getClass().getName(), "amobeeOnLeavingApplication");
            }
        }

        public void amobeeOnOverlay(AmobeeAdPlaceholder amobeeadplaceholder)
        {
        }

        public void amobeeOnOverlayDismissed(AmobeeAdPlaceholder amobeeadplaceholder)
        {
        }

        private AmobeeListenerImpl()
        {
            this$0 = AccuAdManager.this;
            super();
        }

    }


    private static final int AD_REFRESH_INTERVAL_0 = 0;
    private static final int AD_REFRESH_INTERVAL_30 = 30;
    private static final String AMOBEE_TEST_AD_SERVER_URL = "http://accuprod.amobee.com/upsteed/wap/adrequest";
    private static final int MINIMUM_MILLIS_BETWEEN_AD_REQUESTS = 2000;
    private static final String NOTIFICATION_SERVER_URL = "http://rrmprod.amobee.com/upsteed";
    private static final String PRODUCTION_AD_SERVER_URL = "http://accuprod.amobee.com/upsteed/wap/adrequest";
    private Timer adTimer;
    private AdManager mAdManager;
    private Context mContext;
    private long mLastAdUpdateTime;
    private AmobeeAdPlaceholder placeholder;

    public AccuAdManager()
    {
        mLastAdUpdateTime = 0L;
    }

    private String getAdServerUrl()
    {
        return "http://accuprod.amobee.com/upsteed/wap/adrequest";
    }

    private boolean hasSufficientTimePassedForNextAdRequest()
    {
        return System.currentTimeMillis() - mLastAdUpdateTime >= 2000L;
    }

    private void restartTimer()
    {
        if (adTimer != null)
        {
            adTimer.cancel();
        }
        adTimer = new Timer();
        adTimer.schedule(new TimerTask() {

            final AccuAdManager this$0;

            public void run()
            {
                Handler handler = new Handler(mContext.getMainLooper()) {

                    final _cls1 this$1;

                    public void handleMessage(Message message)
                    {
                        mAdManager.getAd(placeholder);
                    }

            
            {
                this$1 = _cls1.this;
                super(looper);
            }
                };
                handler.sendMessage(handler.obtainMessage(0));
            }

            
            {
                this$0 = AccuAdManager.this;
                super();
            }
        }, 30000L);
    }

    private void setTargetingParameter(String s, String s1)
    {
        mAdManager.parameters().setTargetingParameter(s, s1);
    }

    private void updateLastAdRequestTime()
    {
        mLastAdUpdateTime = System.currentTimeMillis();
    }

    public String buildAdDebugParameters()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (mAdManager != null)
        {
            Parameters parameters = mAdManager.parameters();
            String s;
            for (Iterator iterator = (new TreeSet(parameters.getParameters().keySet())).iterator(); iterator.hasNext(); stringbuilder.append(s).append(": ").append((String)parameters.getParameters().get(s)).append("\n\n"))
            {
                s = (String)iterator.next();
            }

            stringbuilder.append((new StringBuilder()).append("Ad Server Url: ").append(getAdServerUrl()).toString()).append("\n\n");
            if (mContext != null)
            {
                stringbuilder.append((new StringBuilder()).append("Postitial Ad Space: ").append(PartnerCoding.getPostitialAdSpace(mContext)).toString());
            }
        }
        return stringbuilder.toString();
    }

    public void initAmobee(Context context, AmobeeAdPlaceholder amobeeadplaceholder)
    {
        placeholder = amobeeadplaceholder;
        mContext = context;
        if (mAdManager == null)
        {
            Logger.d(this, "initAmobee if admanager == null");
            mAdManager = AdManager.getInstance(context);
            mAdManager.setUserGestureRequiredToOpenAds(true);
        }
        AdManager.debugLevel = com.amobee.adsdk.AdManager.DebugLevel.NODEBUG;
        mAdManager.setServerURL(getAdServerUrl());
        mAdManager.parameters().setAdSpace(PartnerCoding.getAdSpace(context));
    }

    public void onPause()
    {
        if (placeholder != null)
        {
            placeholder.setVisibility(8);
        }
        if (adTimer != null)
        {
            adTimer.cancel();
        }
    }

    public void onResume()
    {
        Logger.d(this, "onResume");
        if (placeholder != null)
        {
            placeholder.setVisibility(0);
        }
    }

    public void requestNewAd()
    {
        if (mAdManager != null)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "In requestNewAd().");
            }
            mAdManager.setRefreshInterval(0);
            if (hasSufficientTimePassedForNextAdRequest())
            {
                Logger.d(this, "sufficient time has passed to grab new ad...next line is mAdManager.getAd()");
                mAdManager.getAd(placeholder);
                updateLastAdRequestTime();
                restartTimer();
            }
        }
    }

    public final void updateAdParameters(AdTrackingController adtrackingcontroller, Context context)
    {
        Logger.d(this, "updateAdParameters()");
        if (mAdManager != null)
        {
            setTargetingParameter("city", adtrackingcontroller.getCity());
            setTargetingParameter("cityName", adtrackingcontroller.getCityName());
            setTargetingParameter("state", adtrackingcontroller.getState());
            setTargetingParameter("country", adtrackingcontroller.getCountry());
            setTargetingParameter("lat", (new StringBuilder()).append(adtrackingcontroller.getLatitude()).append("").toString());
            setTargetingParameter("long", (new StringBuilder()).append(adtrackingcontroller.getLongitude()).append("").toString());
            setTargetingParameter("lang", adtrackingcontroller.getLanguage());
            setTargetingParameter("cuwx", adtrackingcontroller.getCUWX());
            setTargetingParameter("cuhi", adtrackingcontroller.getCUHI());
            setTargetingParameter("partner", adtrackingcontroller.getPartner(context));
            setTargetingParameter("appversion", adtrackingcontroller.getAppVersion(context));
            setTargetingParameter("fc1wx", adtrackingcontroller.getFC1WX());
            setTargetingParameter("skymotion", (new StringBuilder()).append(adtrackingcontroller.getSkyMotionValue()).append("").toString());
            setTargetingParameter("section", adtrackingcontroller.getSection());
            setTargetingParameter("latlontype", adtrackingcontroller.getLatLonType());
            mAdManager.parameters().setZip(adtrackingcontroller.getPostalCode());
            mAdManager.parameters().setStateCode(adtrackingcontroller.getState());
            mAdManager.parameters().setCountryCode(adtrackingcontroller.getCountry());
            setTargetingParameter("adtestkey", "none");
            setTargetingParameter("myawx", "myawxDefault");
            Logger.d(this, "setting AmobeeListener");
            mAdManager.setAmobeeListener(new AmobeeListenerImpl());
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "serverurl in ads is %s", new Object[] {
                    mAdManager.getServerURL()
                });
                Logger.d(getClass().getName(), (new StringBuilder()).append("Ad tracking data = ").append(adtrackingcontroller.buildDebugText(context)).toString());
            }
        }
    }



}
