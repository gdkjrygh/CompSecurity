// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import com.google.android.apps.common.inject.DaggerActivity;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.base.activity.OrientationController;
import com.google.android.apps.wallet.base.activity.RecentTasksStyler;
import com.google.android.apps.wallet.filter.ActivityFilters;
import com.google.android.apps.wallet.init.InitializerTaskManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.userscope.UserScopedActivityInjectHelper;
import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import com.google.common.collect.Lists;
import dagger.Lazy;
import java.util.concurrent.Callable;

public class InitializerActivity extends FragmentActivity
    implements DaggerActivity, com.google.android.apps.wallet.util.async.activity.WalletTaskFragment.TaskCallback
{
    final class InitializationAction
        implements Callable
    {

        final InitializerActivity this$0;

        private Void call()
            throws Exception
        {
            InitializerTaskManager initializertaskmanager = (InitializerTaskManager)taskManager.get();
            WLog.d(InitializerActivity.TAG, "Running initialization tasks.");
            initializertaskmanager.runTasks();
            WLog.d(InitializerActivity.TAG, "Done running initialization tasks.");
            return null;
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

        private InitializationAction()
        {
            this$0 = InitializerActivity.this;
            super();
        }

    }


    private static final String TAG = com/google/android/apps/wallet/init/ui/InitializerActivity.getName();
    private static Class moduleClass;
    public WalletActivityActionExecutor activityActionExecutor;
    Lazy appStartTimeLogger;
    private final UserScopedActivityInjectHelper injectHelper = new UserScopedActivityInjectHelper();
    Lazy taskManager;

    public InitializerActivity()
    {
    }

    private void finishInitialization()
    {
        startActivity(ActivityFilters.getRedirectIntent(getIntent()));
        finish();
    }

    public static void setModuleClass(Class class1)
    {
        moduleClass = class1;
    }

    public final void inject(Object obj)
    {
        injectHelper.inject(obj);
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        ((AppStartTimeLogger)appStartTimeLogger.get()).abandonLogging();
        WLog.e(TAG, "Fatal initialization error", exception);
        Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message);
        finish();
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        finishInitialization();
    }

    public final void onCreate(Bundle bundle)
    {
        injectHelper.initGraph(this, Lists.newArrayList(new Object[] {
            moduleClass
        }));
        injectHelper.inject(this);
        super.onCreate(bundle);
        activityActionExecutor.initialize(getSupportFragmentManager(), bundle);
        getWindow().addFlags(128);
        RecentTasksStyler.styleRecentTasksEntry(this);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.generic_progress_activity);
        if (bundle == null)
        {
            activityActionExecutor.executeAction(TAG, "initialize", new InitializationAction(), this);
        }
        OrientationController.disableOrientationChanges(this);
    }

    public final void onPause()
    {
        super.onPause();
        activityActionExecutor.clearCallback(TAG);
    }

    protected final void onResume()
    {
        super.onResume();
        activityActionExecutor.setCallback(TAG, this);
    }


}
