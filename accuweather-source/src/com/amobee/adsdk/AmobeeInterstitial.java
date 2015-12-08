// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.amobee.richmedia.view.AmobeeView;
import java.util.HashMap;
import java.util.Random;

// Referenced classes of package com.amobee.adsdk:
//            AmobeeInterstitialListener, AdManager, Parameters, Log, 
//            NetworkHelper, AmobeeAdSpace

public final class AmobeeInterstitial
{

    private String mAdSpace;
    private Activity mContext;
    private String mHtml;
    private boolean mIsShowed;
    private AmobeeInterstitialListener mListener;
    private int mRandom;
    int mStatusBarHeight;

    public AmobeeInterstitial()
    {
        mIsShowed = false;
        mStatusBarHeight = 0;
        mListener = new AmobeeInterstitialListener() {

            final AmobeeInterstitial this$0;

            public void interstitialClicked(AmobeeInterstitial amobeeinterstitial)
            {
            }

            public void interstitialClosed(AmobeeInterstitial amobeeinterstitial)
            {
            }

            public void interstitialFailed(AmobeeInterstitial amobeeinterstitial)
            {
            }

            public void interstitialRecieved(AmobeeInterstitial amobeeinterstitial)
            {
            }

            
            {
                this$0 = AmobeeInterstitial.this;
                super();
            }
        };
        mRandom = (new Random()).nextInt(64000);
    }

    private void removeInterstitial()
    {
        mContext.runOnUiThread(new Runnable() {

            final AmobeeInterstitial this$0;

            public void run()
            {
                mIsShowed = false;
                AdManager.getInstance(mContext).setIsExpanded(false);
                FrameLayout framelayout = (FrameLayout)((FrameLayout)mContext.getWindow().getDecorView().getRootView()).findViewById(mRandom);
                if (framelayout == null)
                {
                    return;
                }
                if (framelayout.getChildAt(0) != null && (framelayout.getChildAt(0) instanceof AmobeeView))
                {
                    AmobeeView amobeeview = (AmobeeView)framelayout.getChildAt(0);
                    amobeeview.hideVideo();
                    amobeeview.hideMraidInterstitial();
                    if (android.os.Build.VERSION.SDK_INT >= 19)
                    {
                        amobeeview.loadUrl("about:blank");
                        amobeeview.onPause();
                    } else
                    {
                        amobeeview.loadUrl("javascript:var videos = document.getElementsByTagName('video');for (i=0;i<videos.length;i++) {videos[i].pause();}");
                        amobeeview.loadUrl("about:blank");
                    }
                    amobeeview.setOrientationDefault();
                    amobeeview.amobeeInterstitial = null;
                    amobeeview.mViewState = com.amobee.richmedia.view.AmobeeView.ViewState.HIDDEN;
                }
                framelayout.setVisibility(8);
            }

            
            {
                this$0 = AmobeeInterstitial.this;
                super();
            }
        });
    }

    public void closeInterstitial()
    {
        if (!mIsShowed)
        {
            return;
        } else
        {
            removeInterstitial();
            mListener.interstitialClosed(this);
            return;
        }
    }

    public void getInterstitial()
    {
        AdManager admanager = AdManager.getInstance();
        if (admanager != null && admanager.parameters().getAdSpace() != null)
        {
            getInterstitial(admanager.parameters().getAdSpace());
            return;
        } else
        {
            Log.d("[a\u2022mo\u2022bee]", " AmobeeInterstitial - no ad space has been defined in the AdManager, adspace is mandatory in order to get ads.");
            return;
        }
    }

    public void getInterstitial(final String adSpace)
    {
        final AdManager am = AdManager.getInstance();
        if (adSpace == null || adSpace.equals(""))
        {
            Log.d("[a\u2022mo\u2022bee]", " AmobeeInterstitial - The ad space field is mandatory in order to get ads.");
        } else
        if (AdManager.getInstance() == null || !AdManager.getInstance().cappingBlocksRequest(adSpace))
        {
            (new Thread(new Runnable() {

                final AmobeeInterstitial this$0;
                private final String val$adSpace;
                private final AdManager val$am;

                public void run()
                {
                    new HashMap();
                    String s = "";
                    String s1 = "";
                    Object obj = NetworkHelper.requestInterstitial(adSpace, mRandom);
                    if (obj == null)
                    {
                        mListener.interstitialFailed(AmobeeInterstitial.this);
                        return;
                    }
                    if (((HashMap) (obj)).get(NetworkHelper.FRAGMENT) != null)
                    {
                        s = (String)((HashMap) (obj)).get(NetworkHelper.FRAGMENT);
                        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("Interstitial fragment: ")).append(s).toString());
                    }
                    if (((HashMap) (obj)).get(NetworkHelper.STATUS) != null)
                    {
                        s1 = (String)((HashMap) (obj)).get(NetworkHelper.STATUS);
                    }
                    if (!s.equals("") && s1.equals("6200"))
                    {
                        mHtml = s;
                        s = (String)((HashMap) (obj)).get(NetworkHelper.FREQUENCY);
                        String s2 = (String)((HashMap) (obj)).get(NetworkHelper.FREQUENCY_SESSION);
                        obj = (String)((HashMap) (obj)).get(NetworkHelper.ADSPACE);
                        if (s != null && !s.equals(""))
                        {
                            AmobeeAdSpace amobeeadspace = new AmobeeAdSpace(((String) (obj)));
                            if (s2 != null && !s2.equals(""))
                            {
                                amobeeadspace.setSession(Integer.parseInt(s2));
                            }
                            amobeeadspace.setCappingMinutes(Integer.parseInt(s));
                            am.saveAdSpace(amobeeadspace);
                        }
                        mAdSpace = ((String) (obj));
                        mListener.interstitialRecieved(AmobeeInterstitial.this);
                        return;
                    } else
                    {
                        mListener.interstitialFailed(AmobeeInterstitial.this);
                        return;
                    }
                }

            
            {
                this$0 = AmobeeInterstitial.this;
                adSpace = s;
                am = admanager;
                super();
            }
            })).start();
            return;
        }
    }

    public int getRandom()
    {
        return mRandom;
    }

    public void interstitialClicked()
    {
        removeInterstitial();
        mListener.interstitialClicked(this);
    }

    public void setListener(AmobeeInterstitialListener amobeeinterstitiallistener)
    {
        if (amobeeinterstitiallistener == null)
        {
            mListener = new AmobeeInterstitialListener() {

                final AmobeeInterstitial this$0;

                public void interstitialClicked(AmobeeInterstitial amobeeinterstitial)
                {
                }

                public void interstitialClosed(AmobeeInterstitial amobeeinterstitial)
                {
                }

                public void interstitialFailed(AmobeeInterstitial amobeeinterstitial)
                {
                }

                public void interstitialRecieved(AmobeeInterstitial amobeeinterstitial)
                {
                }

            
            {
                this$0 = AmobeeInterstitial.this;
                super();
            }
            };
            return;
        } else
        {
            mListener = amobeeinterstitiallistener;
            return;
        }
    }

    public void show(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        if (AdManager.getInstance() == null) goto _L2; else goto _L1
_L1:
        boolean flag = AdManager.getInstance().cappingBlocksRequest(mAdSpace);
        if (!flag) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mContext = activity;
        if (mContext instanceof Activity)
        {
            mStatusBarHeight = AdManager.getStatusBarHeight(mContext);
        }
        if (mIsShowed)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        if (mHtml == null || mHtml.equals(""))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        mIsShowed = true;
        AdManager.getInstance(mContext).setIsExpanded(true);
        mContext.runOnUiThread(new Runnable() {

            final AmobeeInterstitial this$0;

            public void run()
            {
                Object obj = (ViewGroup)mContext.getWindow().getDecorView().getRootView();
                Object obj1;
                if (((ViewGroup) (obj)).findViewById(mRandom) != null)
                {
                    obj1 = (FrameLayout)((ViewGroup) (obj)).findViewById(mRandom);
                    obj = (AmobeeView)((FrameLayout) (obj1)).getChildAt(0);
                    if (android.os.Build.VERSION.SDK_INT >= 19)
                    {
                        ((AmobeeView) (obj)).onResume();
                    }
                    ((AmobeeView) (obj)).requestFocusFromTouch();
                } else
                {
                    android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    obj1 = new FrameLayout(mContext);
                    ((FrameLayout) (obj1)).setId(mRandom);
                    ((FrameLayout) (obj1)).setBackgroundColor(-1);
                    if (android.os.Build.VERSION.SDK_INT >= 14)
                    {
                        layoutparams.setMargins(0, mStatusBarHeight, 0, 0);
                    } else
                    {
                        ((FrameLayout) (obj1)).setPadding(0, mStatusBarHeight, 0, 0);
                    }
                    ((ViewGroup) (obj)).addView(((View) (obj1)), layoutparams);
                    obj = new AmobeeView(mContext);
                    ((FrameLayout) (obj1)).addView(((View) (obj)));
                }
                ((FrameLayout) (obj1)).setVisibility(8);
                obj.mViewState = com.amobee.richmedia.view.AmobeeView.ViewState.INTERSTITIAL;
                obj.amobeeInterstitial = AmobeeInterstitial.this;
                ((AmobeeView) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                obj1 = AdManager.getInstance(mContext);
                ((AmobeeView) (obj)).setUserGestureRequiredToOpenAds(((AdManager) (obj1)).getUserGestureRequiredToOpenAds());
                ((AmobeeView) (obj)).requestFocusFromTouch();
                ((AmobeeView) (obj)).loadString(mHtml, null);
                ((AdManager) (obj1)).setImpression(mAdSpace);
            }

            
            {
                this$0 = AmobeeInterstitial.this;
                super();
            }
        });
          goto _L3
        activity;
        throw activity;
        Log.d("[a\u2022mo\u2022bee]", "please call show() only after interstitialRecieved( AmobeeInterstitial ) is being called.");
          goto _L3
        Log.d("[a\u2022mo\u2022bee]", "interstitial is currently shown. please recall show() only after interstitialClosed(). ");
          goto _L3
    }








}
