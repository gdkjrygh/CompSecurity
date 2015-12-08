// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import com.analytics.AnalyticsMain;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.components.SlidingUpViewHelper;
import com.kohls.mcommerce.opal.common.util.ConfigurationUpdateObserver;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.iface.IViewControllerListener;
import com.kohls.mcommerce.opal.framework.view.component.views.BottomBarDrawer;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.worklight.androidgap.api.WL;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseActivityWithoutSlider extends Activity
    implements IViewControllerListener, ConfigurationUpdateObserver
{

    private ActionBarHelper mActionBarHelper;

    public BaseActivityWithoutSlider()
    {
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (KohlsPhoneApplication.getInstance() != null && KohlsPhoneApplication.getInstance().getAuthenticationUtils() != null)
        {
            KohlsPhoneApplication.getInstance().getAuthenticationUtils().resetIdleTimer();
        }
        return super.dispatchTouchEvent(motionevent);
    }

    public ActionBarHelper getActionBarHelper()
    {
        return mActionBarHelper;
    }

    protected abstract int getLayoutId();

    protected void initActionBar()
    {
        getActionBar().setBackgroundDrawable(null);
        mActionBarHelper = new ActionBarHelper(this, getActionBar());
        mActionBarHelper.initActionBarWithCustomView();
    }

    protected abstract void initializeViews(Bundle bundle);

    public final void notifyViewOnFailure(final Object object)
    {
        if (!isFinishing())
        {
            runOnUiThread(new Runnable() {

                final BaseActivityWithoutSlider this$0;
                final Object val$object;

                public void run()
                {
                    updateViewsOnFailure(object);
                }

            
            {
                this$0 = BaseActivityWithoutSlider.this;
                object = obj;
                super();
            }
            });
        }
    }

    public final void notifyViewOnSuccess(final Object object)
    {
        if (!isFinishing())
        {
            runOnUiThread(new Runnable() {

                final BaseActivityWithoutSlider this$0;
                final Object val$object;

                public void run()
                {
                    updateViewsOnSuccess(object);
                }

            
            {
                this$0 = BaseActivityWithoutSlider.this;
                object = obj;
                super();
            }
            });
        }
    }

    public void onConfigUpdated()
    {
        com.kohls.mcommerce.opal.framework.vo.ConfigurationVO.PayLoad.Config config = KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig();
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("configData", new JSONObject(UtilityMethods.createJsonFromModel(config)));
            WL.getInstance().sendActionToJS("getConfigSuccess", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            WL.getInstance().sendActionToJS("getConfigSuccess");
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Logger.error("WL", "Instance not created");
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030059);
        getWindow().setBackgroundDrawableResource(0x7f0c010a);
        ((FrameLayout)findViewById(0x7f0d001f)).addView(getLayoutInflater().inflate(getLayoutId(), null));
        initActionBar();
        bundle = new SlidingUpViewHelper((BottomBarDrawer)findViewById(0x7f0d0205), this, UtilityMethods.getActionBarHeight(this));
        bundle.initSlidingUpLayout();
        bundle.disableSlidingLayout();
        initializeViews(getIntent().getExtras());
    }

    protected void onPause()
    {
        KohlsPhoneApplication.getInstance().getAnalytics().pauseCollectingLifeCycleData();
        KohlsPhoneApplication.getInstance().setApplicationBackground();
        KohlsPhoneApplication.getInstance().getConfigurationUtils().removeConfigUpdateObserver();
        super.onPause();
    }

    protected void onResume()
    {
        if (KohlsPhoneApplication.getInstance().isAppBackground())
        {
            UtilityMethods.getFlushTimes();
            KohlsPhoneApplication.getInstance().getConfigurationUtils().fetchAppConfigFromApi(this);
        }
        KohlsPhoneApplication.getInstance().setApplicationForeground();
        KohlsPhoneApplication.getInstance().getAnalytics().startCollectingLifeCycleData(this);
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
        updateActionBarViews();
    }

    protected abstract void updateActionBarViews();

    protected abstract void updateViewsOnFailure(Object obj);

    protected abstract void updateViewsOnSuccess(Object obj);
}
