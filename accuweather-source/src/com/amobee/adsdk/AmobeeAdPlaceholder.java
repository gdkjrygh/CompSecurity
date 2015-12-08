// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.amobee.richmedia.view.AmobeeView;
import java.lang.reflect.Method;

// Referenced classes of package com.amobee.adsdk:
//            AdManager, Parameters, BaseAdapter, IAmobee, 
//            Log

public final class AmobeeAdPlaceholder extends FrameLayout
{

    static int DEFAULT_BANNER_HEIGHT = 0;
    static int DEFAULT_BANNER_WIDTH = 0;
    static int DEFAULT_IAB_LEADERBOARD_HEIGHT = 0;
    static int DEFAULT_IAB_LEADERBOARD_WIDTH = 0;
    static int MEDIUM_IAB_LEADERBOARD_HEIGHT = 0;
    static int MEDIUM_IAB_LEADERBOARD_WIDTH = 0;
    static int PIXEL = 0;
    private static final String TAG = "AmobeeAdPlaceHolder";
    String adSpace;
    public boolean amrp;
    private BaseAdapter currentAdapter;
    boolean firstRequest;
    protected boolean isResized;
    int mBannerHeight;
    int mBannerWidth;
    int mDefaultBannerHeight;
    int mDefaultBannerWidth;
    private WindowManager mWindowManager;
    Context m_context;
    private BaseAdapter nextAdapter;
    Integer refreshInterval;
    boolean requestAdImmediately;
    boolean sizeWasSet;

    public AmobeeAdPlaceholder(Context context)
    {
        super(context);
        requestAdImmediately = false;
        refreshInterval = Integer.valueOf(-1);
        firstRequest = true;
        mDefaultBannerWidth = DEFAULT_BANNER_WIDTH;
        mDefaultBannerHeight = DEFAULT_BANNER_HEIGHT;
        mBannerWidth = 0;
        mBannerHeight = 0;
        isResized = false;
        amrp = false;
        sizeWasSet = false;
        mWindowManager = (WindowManager)context.getSystemService("window");
        init(context);
    }

    public AmobeeAdPlaceholder(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        requestAdImmediately = false;
        refreshInterval = Integer.valueOf(-1);
        firstRequest = true;
        mDefaultBannerWidth = DEFAULT_BANNER_WIDTH;
        mDefaultBannerHeight = DEFAULT_BANNER_HEIGHT;
        mBannerWidth = 0;
        mBannerHeight = 0;
        isResized = false;
        amrp = false;
        sizeWasSet = false;
        mWindowManager = (WindowManager)context.getSystemService("window");
        init(context);
        if (AdManager.pulse3dSupport)
        {
            SurfaceView surfaceview = new SurfaceView(context);
            surfaceview.setVisibility(4);
            addView(surfaceview, new android.widget.FrameLayout.LayoutParams(PIXEL, PIXEL));
        }
        if (attributeset != null)
        {
            String s = attributeset.getAttributeValue("http://schemas.android.com/apk/lib/com.amobee.adsdk.AmobeeAdPlaceholder", "serverUrl");
            String s1 = attributeset.getAttributeValue("http://schemas.android.com/apk/lib/com.amobee.adsdk.AmobeeAdPlaceholder", "acc");
            String s2 = attributeset.getAttributeValue("http://schemas.android.com/apk/lib/com.amobee.adsdk.AmobeeAdPlaceholder", "adSpace");
            requestAdImmediately = attributeset.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.amobee.adsdk.AmobeeAdPlaceholder", "requestAdImmediately", false);
            refreshInterval = Integer.valueOf(attributeset.getAttributeIntValue("http://schemas.android.com/apk/lib/com.amobee.adsdk.AmobeeAdPlaceholder", "refreshInterval", -1));
            initRequestDetail(s, s1, s2, requestAdImmediately, refreshInterval, context);
        }
    }

    private void initRequestDetail(String s, String s1, String s2, boolean flag, Integer integer, Context context)
    {
        integer = AdManager.getInstance(context);
        if (s != null)
        {
            integer.setServerURL(s);
        }
        if (s2 != null)
        {
            setAdSpace(s2);
        }
        if (s1 != null)
        {
            integer.parameters().setTargetingParameter("acc", s1);
        }
    }

    private boolean vaildHeight(int i)
    {
        while (i <= 0 || (double)mWindowManager.getDefaultDisplay().getHeight() < (double)i * AdManager.getInstance(m_context).getDensity()) 
        {
            return false;
        }
        return true;
    }

    private boolean vaildWidth(int i)
    {
        new DisplayMetrics();
        while (i <= 0 || (double)mWindowManager.getDefaultDisplay().getWidth() < (double)i * AdManager.getInstance(m_context).getDensity()) 
        {
            return false;
        }
        return true;
    }

    Point getAdSize()
    {
        return new Point(getBannerWidth(false), getBannerHeight(false));
    }

    public String getAdSpace()
    {
        return adSpace;
    }

    int getBannerHeight(boolean flag)
    {
        if (mBannerHeight != 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams.height != -1) goto _L2; else goto _L3
_L3:
        int i = layoutparams.height;
_L5:
        return i;
_L2:
        int j;
        j = (int)((float)getHeight() / AdManager.getDensity(getContext()));
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (j != 1) goto _L5; else goto _L4
_L4:
        return mDefaultBannerHeight;
        return mBannerHeight;
    }

    int getBannerWidth(boolean flag)
    {
        if (mBannerWidth != 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams.width != -1) goto _L2; else goto _L3
_L3:
        int i = layoutparams.width;
_L5:
        return i;
_L2:
        int j;
        j = (int)((float)getWidth() / AdManager.getDensity(getContext()));
        i = j;
        if (j != 0) goto _L5; else goto _L4
_L4:
        return mDefaultBannerWidth;
        return mBannerWidth;
    }

    BaseAdapter getCurrentAdapter()
    {
        return currentAdapter;
    }

    BaseAdapter getNextAdapter()
    {
        return nextAdapter;
    }

    void init(Context context)
    {
label0:
        {
            m_context = context;
            setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
            setBackgroundColor(0);
            AdManager admanager = AdManager.getInstance(m_context);
            admanager.addPlaceholder(this);
            if (admanager.isTablet(context))
            {
                if (!admanager.isMiniTablet(getContext()))
                {
                    break label0;
                }
                mDefaultBannerWidth = MEDIUM_IAB_LEADERBOARD_WIDTH;
                mDefaultBannerHeight = MEDIUM_IAB_LEADERBOARD_HEIGHT;
            }
            return;
        }
        mDefaultBannerWidth = DEFAULT_IAB_LEADERBOARD_WIDTH;
        mDefaultBannerHeight = DEFAULT_IAB_LEADERBOARD_HEIGHT;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        AdManager.getInstance(m_context).addPlaceholder(this);
        if (currentAdapter == null || currentAdapter.getAdView() == null || !(currentAdapter.getAdView() instanceof AmobeeView))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        Class.forName("android.webkit.WebView").getMethod("onResume", null).invoke((AmobeeView)currentAdapter.getAdView(), null);
        return;
        Exception exception;
        exception;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        AdManager admanager = AdManager.getInstance(m_context);
        if (currentAdapter != null && currentAdapter.getAdView() != null && (currentAdapter.getAdView() instanceof AmobeeView))
        {
            AmobeeView amobeeview = (AmobeeView)currentAdapter.getAdView();
            if (AmobeeView.isExpanded || ((AmobeeView)currentAdapter.getAdView()).mViewState == com.amobee.richmedia.view.AmobeeView.ViewState.RESIZED || ((AmobeeView)currentAdapter.getAdView()).mViewState == com.amobee.richmedia.view.AmobeeView.ViewState.EXPANDED)
            {
                if (((AmobeeView)currentAdapter.getAdView()).configChnges().equals("true"))
                {
                    ((AmobeeView)currentAdapter.getAdView()).restoreState();
                }
                AmobeeView amobeeview1 = (AmobeeView)currentAdapter.getAdView();
                AmobeeView.isExpanded = false;
                isResized = false;
                ((AmobeeView)currentAdapter.getAdView()).parentView = null;
                admanager.setIsExpanded(false);
            }
            ((AmobeeView)currentAdapter.getAdView()).hideVideo();
            try
            {
                Class.forName("android.webkit.WebView").getMethod("onPause", null).invoke((AmobeeView)currentAdapter.getAdView(), null);
            }
            catch (Exception exception)
            {
                ((AmobeeView)currentAdapter.getAdView()).loadUrl("about:blank");
            }
        }
        admanager.removePlaceholder(this);
    }

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        AdManager admanager = AdManager.getInstance(m_context);
        if (i == 0)
        {
            if (refreshInterval != null && -1 != refreshInterval.intValue())
            {
                admanager.setRefreshInterval(refreshInterval.intValue());
            }
            if (requestAdImmediately && admanager.getRefreshInterval() == 0)
            {
                requestAdImmediately = false;
                admanager.getAd(this);
            } else
            if (requestAdImmediately)
            {
                requestAdImmediately = false;
                admanager.getAd();
                return;
            }
        }
    }

    public void setAdSpace(String s)
    {
        adSpace = s;
    }

    void setAdview(IAmobee iamobee)
    {
        this;
        JVM INSTR monitorenter ;
        View view = getChildAt(0);
        int i = 0;
_L7:
        if (i < getChildCount()) goto _L2; else goto _L1
_L1:
        View view1 = iamobee.getAdView();
        if (view1 != null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        view1 = view;
        if (getChildAt(i).getClass().getSimpleName().equals("Pulse3DView"))
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = view;
        if (!(getChildAt(i) instanceof SurfaceView))
        {
            view1 = getChildAt(i);
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (view.getVisibility() == 0 && view != iamobee.getAdView())
        {
            removeView(view);
        }
        if (view1.getParent() != this)
        {
            if (view1.getParent() != null)
            {
                ((ViewGroup)view1.getParent()).removeView(view1);
            }
            addView(view1);
        }
        if (true) goto _L3; else goto _L5
        iamobee;
        throw iamobee;
_L5:
        i++;
        view = view1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void setBannerHeight(int i)
    {
        mBannerHeight = i;
    }

    public void setBannerSize(int i, int j)
    {
        if (vaildWidth(i))
        {
            mBannerWidth = i;
        } else
        {
            Log.d("[a\u2022mo\u2022bee]", "setBannerSize( int width , int height ): the width you set is invalid - default value will be set instead.");
        }
        if (vaildHeight(j))
        {
            mBannerHeight = j;
            return;
        } else
        {
            Log.d("[a\u2022mo\u2022bee]", "setBannerSize( int width , int height ): the height you set is invalid - default value will be set instead.");
            return;
        }
    }

    void setBannerWidth(int i)
    {
        mBannerWidth = i;
    }

    void setCurrentAdapter(BaseAdapter baseadapter)
    {
        currentAdapter = baseadapter;
        setAdview(baseadapter);
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams.height > 0 || layoutparams.height > 0)
        {
            sizeWasSet = true;
        }
        if (sizeWasSet && (layoutparams.height < 0 || layoutparams.height < 0))
        {
            return;
        } else
        {
            super.setLayoutParams(layoutparams);
            return;
        }
    }

    void setNextAdapter(BaseAdapter baseadapter)
    {
        if (baseadapter == null)
        {
            nextAdapter = null;
            return;
        } else
        {
            nextAdapter = baseadapter;
            nextAdapter.getAdView().setVisibility(4);
            addView(nextAdapter.getAdView());
            return;
        }
    }

    static 
    {
        DEFAULT_BANNER_WIDTH = 320;
        DEFAULT_BANNER_HEIGHT = 50;
        DEFAULT_IAB_LEADERBOARD_WIDTH = 728;
        DEFAULT_IAB_LEADERBOARD_HEIGHT = 90;
        MEDIUM_IAB_LEADERBOARD_WIDTH = 600;
        MEDIUM_IAB_LEADERBOARD_HEIGHT = 75;
        PIXEL = 1;
    }
}
