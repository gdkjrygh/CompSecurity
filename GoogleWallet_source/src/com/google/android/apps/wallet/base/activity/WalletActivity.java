// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.common.inject.DaggerActivity;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.filter.ActivityFilterPipeline;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.MetadataRejectionException;
import com.google.android.apps.wallet.userscope.UserScopedActivityInjectHelper;
import com.google.android.apps.wallet.userscope.UserScopedApplication;
import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import com.google.android.apps.wallet.util.async.activity.WalletConcurrentActionException;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.dynamicwidth.DynamicWidthFrameLayout;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import dagger.Lazy;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.base.activity:
//            RecentTasksStyler

public abstract class WalletActivity extends ActionBarActivity
    implements DaggerActivity, com.google.android.apps.wallet.util.async.activity.WalletTaskFragment.TaskCallback
{

    private static final String TAG = com/google/android/apps/wallet/base/activity/WalletActivity.getSimpleName();
    public WalletActivityActionExecutor activityActionExecutor;
    Lazy activityFilterPipeline;
    private final UserScopedActivityInjectHelper activityInjectHelper = new UserScopedActivityInjectHelper();
    AppStartTimeLogger appStartTimeLogger;
    private DynamicWidthFrameLayout childActivityContainer;
    private final int containerId;
    private final Supplier filterIntentSupplier = new Supplier() {

        final WalletActivity this$0;

        private Intent get()
        {
            Intent intent = new Intent(getIntent());
            intent.setFlags(intent.getFlags() & 0xefffffff);
            return intent;
        }

        public final volatile Object get()
        {
            return get();
        }

            
            {
                this$0 = WalletActivity.this;
                super();
            }
    };
    private boolean isInjected;

    protected WalletActivity(int i)
    {
        isInjected = false;
        containerId = i;
    }

    private void doInjection()
    {
        if (!isInjected)
        {
            activityInjectHelper.initGraph(this, getModules());
            activityInjectHelper.inject(this);
            isInjected = true;
        }
    }

    private String getActionRequesterId()
    {
        return getClass().getName();
    }

    private DynamicWidthFrameLayout getChildViewContainer()
    {
        if (childActivityContainer == null)
        {
            childActivityContainer = (DynamicWidthFrameLayout)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer);
        }
        return childActivityContainer;
    }

    private List getModules()
    {
        return Lists.newArrayList(((UserScopedApplication)getApplication()).getActivityModules());
    }

    private void limitMaximumWidth(boolean flag)
    {
        getChildViewContainer().limitMaximumWidth(flag);
    }

    private boolean onHomePressed(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            onUpPressed();
            return true;
        } else
        {
            return false;
        }
    }

    private void setChildViewContainerVisibility(boolean flag)
    {
        DynamicWidthFrameLayout dynamicwidthframelayout = getChildViewContainer();
        if (dynamicwidthframelayout == null)
        {
            return;
        }
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        dynamicwidthframelayout.setVisibility(i);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getChildViewContainer().addView(view, layoutparams);
    }

    protected void doOnCreate(Bundle bundle)
    {
    }

    protected void doOnResume()
    {
    }

    public final void executeAction(String s, Callable callable)
    {
        activityActionExecutor.executeAction(getActionRequesterId(), s, callable, this);
    }

    public boolean hasDrawerIndicator()
    {
        return false;
    }

    public final void inject(Object obj)
    {
        activityInjectHelper.inject(obj);
    }

    protected final boolean isActionRunning(String s)
    {
        return activityActionExecutor.isActionRunning(s);
    }

    protected abstract boolean isWidthLimited();

    protected final void navigateUpWithIntent(Intent intent)
    {
        intent.addFlags(0x4000000);
        intent.addFlags(0x20000000);
        startActivity(intent);
    }

    public boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (exception instanceof WalletConcurrentActionException)
        {
            activityActionExecutor.handleConcurrentActionException(this);
        } else
        if (!(exception instanceof MetadataRejectionException))
        {
            return false;
        }
        return true;
    }

    public void onActionSuccess(String s, Callable callable, Object obj)
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onActivityResult(this, i, j, intent);
    }

    public void onAttachFragment(Fragment fragment)
    {
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onAttachFragment(this, fragment);
        super.onAttachFragment(fragment);
    }

    protected void onBeforeCreate(Bundle bundle)
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onConfigurationChanged(this, configuration);
    }

    public final void onCreate(Bundle bundle)
    {
        doInjection();
        Intent intent = ((ActivityFilterPipeline)activityFilterPipeline.get()).onCreate(this, bundle, filterIntentSupplier);
        if (intent != null)
        {
            startActivity(intent);
            overridePendingTransition(0, 0);
            WLog.dfmt(TAG, "%s was filtered in onCreate", new Object[] {
                getClass().getSimpleName()
            });
            super.onCreate(null);
            appStartTimeLogger.abandonLogging();
            finish();
            return;
        } else
        {
            onBeforeCreate(bundle);
            super.onCreate(bundle);
            super.setContentView(containerId);
            setSupportActionBar((Toolbar)findViewById(com.google.android.apps.walletnfcrel.R.id.toolbar));
            RecentTasksStyler.styleRecentTasksEntry(this);
            activityActionExecutor.initialize(getSupportFragmentManager(), bundle);
            limitMaximumWidth(isWidthLimited());
            doOnCreate(bundle);
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = super.onCreateOptionsMenu(menu);
        doInjection();
        boolean flag1 = ((ActivityFilterPipeline)activityFilterPipeline.get()).onCreateOptionsMenu(this, menu);
        return flag || flag1;
    }

    protected void onDestroy()
    {
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onDestroy(this);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return super.onOptionsItemSelected(menuitem) || ((ActivityFilterPipeline)activityFilterPipeline.get()).onOptionsMenuSelected(this, menuitem) || onHomePressed(menuitem);
    }

    protected void onPause()
    {
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onPause(this);
        activityActionExecutor.clearCallback(getActionRequesterId());
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onPostCreate(this, bundle);
    }

    protected void onPostResume()
    {
        super.onStart();
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onPostResume(this);
    }

    public final boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag = super.onPrepareOptionsMenu(menu);
        boolean flag1 = ((ActivityFilterPipeline)activityFilterPipeline.get()).onPrepareOptionsMenu(this, menu);
        return flag || flag1;
    }

    protected final void onResume()
    {
        super.onResume();
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onResume(this);
        if (isFinishing())
        {
            return;
        } else
        {
            setChildViewContainerVisibility(true);
            doOnResume();
            activityActionExecutor.setCallback(getActionRequesterId(), this);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onStart(this);
    }

    protected void onStop()
    {
        setChildViewContainerVisibility(false);
        super.onStop();
        ((ActivityFilterPipeline)activityFilterPipeline.get()).onStop(this);
    }

    protected void onUpPressed()
    {
    }

    public void setContentView(int i)
    {
        View view = getLayoutInflater().inflate(i, getChildViewContainer(), false);
        setContentView(view, view.getLayoutParams());
    }

    public void setContentView(View view)
    {
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        getChildViewContainer().removeAllViews();
        addContentView(view, layoutparams);
    }

}
