// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.apps.common.inject.FragmentInjectHelper;
import com.google.android.apps.wallet.analytics.AnalyticsContext;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.util.async.activity.WalletActivityActionExecutor;
import com.google.android.apps.wallet.util.async.activity.WalletConcurrentActionException;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;

public class WalletFragment extends Fragment
    implements com.google.android.apps.wallet.util.async.activity.WalletTaskFragment.TaskCallback
{

    public WalletActivityActionExecutor activityActionExecutor;
    public AnalyticsUtil analyticsUtil;
    boolean fieldsInjected;

    public WalletFragment()
    {
    }

    private String getActionRequesterId()
    {
        return getClass().getName();
    }

    public final void executeAction(String s, Callable callable)
    {
        boolean flag;
        if (activityActionExecutor != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        activityActionExecutor.executeAction(getActionRequesterId(), s, callable, this);
    }

    protected final boolean isActionRunning(String s)
    {
        boolean flag;
        if (activityActionExecutor != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        return activityActionExecutor.isActionRunning(s);
    }

    public boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (exception instanceof WalletConcurrentActionException)
        {
            activityActionExecutor.handleConcurrentActionException(getActivity());
            return true;
        } else
        {
            return false;
        }
    }

    public void onActionSuccess(String s, Callable callable, Object obj)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!fieldsInjected)
        {
            FragmentInjectHelper.inject(this);
        }
    }

    public void onPause()
    {
        super.onPause();
        if (activityActionExecutor != null)
        {
            activityActionExecutor.clearCallback(getActionRequesterId());
        }
    }

    public void onResume()
    {
        super.onResume();
        if (activityActionExecutor != null)
        {
            activityActionExecutor.setCallback(getActionRequesterId(), this);
        }
        AnalyticsContext analyticscontext = (AnalyticsContext)getClass().getAnnotation(com/google/android/apps/wallet/analytics/AnalyticsContext);
        if (analyticscontext != null)
        {
            analyticsUtil.sendScreen(analyticscontext.value(), new AnalyticsCustomDimension[0]);
        }
    }
}
