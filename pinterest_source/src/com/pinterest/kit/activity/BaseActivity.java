// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.commerce.event.PaymentScannedEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Events;
import com.pinterest.common.async.IntervalRunner;
import com.pinterest.di.HasComponent;
import com.pinterest.di.components.ActivityComponent;
import com.pinterest.di.components.ApplicationComponent;
import com.pinterest.di.components.DaggerActivityComponent;
import com.pinterest.di.modules.ActivityModule;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.squareup.seismic.ShakeDetector;
import io.card.payment.CreditCard;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

public class BaseActivity extends SocialConnectActivity
    implements HasComponent
{

    private static final int DAU_PING_DELAY = 1000;
    private ActivityComponent _activityComponent;
    protected boolean _autoAnalytics;
    private Runnable _dauRunnable;
    protected Handler _handler;
    private android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback _permResultCallback;
    private ShakeDetector _shakeDetector;
    private com.squareup.seismic.ShakeDetector.Listener onShake;

    public BaseActivity()
    {
        _autoAnalytics = true;
        _handler = new Handler();
        _dauRunnable = new _cls1();
        onShake = new _cls2();
    }

    private ActivityModule getActivityModule()
    {
        return new ActivityModule(this);
    }

    private ApplicationComponent getApplicationComponent()
    {
        return ((Application)getApplication()).getComponent();
    }

    private void initializeComponent()
    {
        _activityComponent = DaggerActivityComponent.a().a(getApplicationComponent()).a(getActivityModule()).a();
    }

    public BaseFragment getActiveFragment()
    {
        return null;
    }

    protected String getApiTag()
    {
        return getClass().getName();
    }

    public ActivityComponent getComponent()
    {
        return _activityComponent;
    }

    public volatile Object getComponent()
    {
        return getComponent();
    }

    protected void init()
    {
    }

    protected void onActionBarClicked()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 107 && intent != null && intent.hasExtra("io.card.payment.scanResult"))
        {
            CreditCard creditcard = (CreditCard)intent.getParcelableExtra("io.card.payment.scanResult");
            intent = null;
            if (creditcard.isExpiryValid())
            {
                intent = (new StringBuilder()).append(String.valueOf(creditcard.expiryMonth)).append(String.valueOf(creditcard.expiryYear)).toString();
            }
            Events.postSticky(new PaymentScannedEvent(creditcard.cardNumber, intent));
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public void onBackPressed()
    {
        Pinalytics.a(ElementType.BACK_BUTTON, ComponentType.NAVIGATION);
        if (getIntent().hasExtra("com.pinterest.EXTRA_BACK_TO_ROOT"))
        {
            ActivityHelper.goHome(this);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        initializeComponent();
        super.onCreate(bundle);
        if (ApplicationInfo.isPrerelease())
        {
            _shakeDetector = new ShakeDetector(onShake);
            _shakeDetector.a((SensorManager)getSystemService("sensor"));
        }
    }

    protected void onDestroy()
    {
        ApiHttpClient.cancelPendingRequests(getApiTag());
        if (_shakeDetector != null)
        {
            _shakeDetector.a();
        }
        _shakeDetector = null;
        super.onDestroy();
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            ActivityHelper.goHome(this);
            return true;
        } else
        {
            return super.onKeyLongPress(i, keyevent);
        }
    }

    protected void onPause()
    {
        if (_shakeDetector != null)
        {
            _shakeDetector.a();
        }
        Pinalytics.c();
        IntervalRunner.instance().onBackground();
        ApplicationInfo.onBackground();
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        if (_permResultCallback != null)
        {
            _permResultCallback.onRequestPermissionsResult(i, as, ai);
            _permResultCallback = null;
        }
        super.onRequestPermissionsResult(i, as, ai);
    }

    protected void onResume()
    {
        if (_shakeDetector != null)
        {
            _shakeDetector.a((SensorManager)getSystemService("sensor"));
        }
        if (_autoAnalytics)
        {
            Pinalytics.a(this);
        }
        IntervalRunner.instance().onForeground();
        ApplicationInfo.onForeground();
        super.onResume();
    }

    public boolean onSearchRequested()
    {
        Events.post(new Navigation(Location.SEARCH));
        return super.onSearchRequested();
    }

    protected void onStart()
    {
        super.onStart();
        _handler.postDelayed(_dauRunnable, 1000L);
    }

    protected void onStop()
    {
        _handler.removeCallbacks(_dauRunnable);
        super.onStop();
    }

    public void refresh()
    {
    }

    public void setOnRequestPermissionsResultCallback(android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback onrequestpermissionsresultcallback)
    {
        _permResultCallback = onrequestpermissionsresultcallback;
    }


    private class _cls1
        implements Runnable
    {

        final BaseActivity this$0;

        public void run()
        {
            AnalyticsApi.a(new BaseApiResponseHandler());
        }

        _cls1()
        {
            this$0 = BaseActivity.this;
            super();
        }
    }


    private class _cls2
        implements com.squareup.seismic.ShakeDetector.Listener
    {

        final BaseActivity this$0;

        public void hearShake()
        {
            _shakeDetector.a();
            ShakeMenuDialog shakemenudialog = new ShakeMenuDialog(BaseActivity.this);
            class _cls1
                implements com.pinterest.activity.task.dialog.BaseDialog.OnDismissListener
            {

                final _cls2 this$1;

                public void onDismiss(BaseDialog basedialog)
                {
                    _shakeDetector.a((SensorManager)getSystemService("sensor"));
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
            }

            shakemenudialog.addOnDismissListener(new _cls1());
            show(shakemenudialog);
        }

        _cls2()
        {
            this$0 = BaseActivity.this;
            super();
        }
    }

}
