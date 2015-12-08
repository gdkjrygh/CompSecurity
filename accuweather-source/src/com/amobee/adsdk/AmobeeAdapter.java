// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.amobee.richmedia.view.AmobeeView;

// Referenced classes of package com.amobee.adsdk:
//            BaseAdapter, AdManager, IAmobeeListener, Parameters, 
//            AmobeeAdPlaceholder

class AmobeeAdapter extends BaseAdapter
{

    private int adHeight;
    private int adWidth;
    AdManager am;
    private String fragment;
    private Context mContext;
    private AmobeeView ormmaView;

    AmobeeAdapter(Context context, Parameters parameters, String s, int i, int j, String s1)
    {
        super(context, parameters);
        ormmaView = null;
        adHeight = 80;
        adWidth = -1;
        am = AdManager.getInstance();
        setAdspace(s1);
        super.networkName = "amobee";
        fragment = s;
        mContext = context;
        determineAdHeight(j);
        determineAdWidth(i);
        ormmaView = new AmobeeView(mContext, new com.amobee.richmedia.view.AmobeeView.OrmmaViewListener() {

            final AmobeeAdapter this$0;

            public void handleRequest(String s2)
            {
            }

            public boolean onEventFired()
            {
                return false;
            }

            public boolean onExpand()
            {
                AmobeeAdapter.this.onOverlay();
                AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                am.setIsExpanded(true);
                am.fireOnOverlay(true, amobeeadplaceholder);
                return false;
            }

            public boolean onExpandClose()
            {
                AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                onOverlayDismissed();
                am.setIsExpanded(false);
                am.fireOnOverlay(false, amobeeadplaceholder);
                am.getAd(true, am.getPlaceholders());
                return false;
            }

            public void onLeavingApplication()
            {
                AmobeeAdapter.this.onLeavingApplication();
            }

            public boolean onOverlay()
            {
                AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                am.fireOnOverlay(true, amobeeadplaceholder);
                return false;
            }

            public boolean onPostitialClose()
            {
                return false;
            }

            public boolean onReady()
            {
                return false;
            }

            public boolean onResize()
            {
                AmobeeAdapter.this.onOverlay();
                AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                am.fireOnOverlay(true, amobeeadplaceholder);
                amobeeadplaceholder.isResized = true;
                return false;
            }

            public boolean onResizeClose()
            {
                onOverlayDismissed();
                AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
                am.fireOnOverlay(false, amobeeadplaceholder);
                am.getAd(true, am.getPlaceholders());
                amobeeadplaceholder.isResized = false;
                return false;
            }

            
            {
                this$0 = AmobeeAdapter.this;
                super();
            }
        });
        ormmaView.setUserGestureRequiredToOpenAds(am.getUserGestureRequiredToOpenAds());
        ormmaView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(adWidth, adHeight));
        ormmaView.setBackgroundColor(0);
        ormmaView.loadString(fragment, null);
    }

    private void determineAdHeight(int i)
    {
        this;
        JVM INSTR monitorenter ;
        float f;
        Display display = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        f = displaymetrics.density;
        adHeight = (int)((double)(50F * f) + 0.5D);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        adHeight = (int)((double)((float)i * f) + 0.5D);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void determineAdWidth(int i)
    {
        this;
        JVM INSTR monitorenter ;
        double d;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        d = i;
        adWidth = (int)(d * am.getDensity() + 0.5D);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void adFailed()
    {
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.getAmobeeListener().amobeeOnAdFailed(amobeeadplaceholder);
    }

    public void adRecieved()
    {
        super.fireAdRecieved(networkName);
    }

    public void getAd()
    {
        am.getAd();
    }

    public View getAdView()
    {
        return ormmaView;
    }

    public String getFragment()
    {
        return fragment;
    }

    public void onError()
    {
        am.getAmobeeListener().amobeeOnError();
    }

    public void onLeavingApplication()
    {
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        am.getAmobeeListener().amobeeOnLeavingApplication(amobeeadplaceholder);
    }

    public void onOverlay()
    {
    }

    public void onOverlayDismissed()
    {
    }

    public void setFragment(String s)
    {
        fragment = s;
    }

    void updateAdapter(Parameters parameters, String s, int i, int j, String s1)
    {
        setAdspace(s1);
        fragment = s;
        int k = (int)((double)((float)j * AdManager.getDensity(ormmaView.getContext())) + 0.5D);
        int l = (int)((double)((float)i * AdManager.getDensity(ormmaView.getContext())) + 0.5D);
        if (k == adHeight || l == adWidth)
        {
            determineAdHeight(j);
            determineAdWidth(i);
            ormmaView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(adWidth, adHeight));
        }
        ormmaView.setUserGestureRequiredToOpenAds(am.getUserGestureRequiredToOpenAds());
        ormmaView.loadString(fragment, null);
        adRecieved();
    }

    public void updateParameters(Parameters parameters)
    {
        super.setParameters(parameters);
    }
}
