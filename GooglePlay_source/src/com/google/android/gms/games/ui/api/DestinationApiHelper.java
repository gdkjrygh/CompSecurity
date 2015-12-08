// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.api;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;

public class DestinationApiHelper
{
    public static interface DestinationApiHelperProvider
    {

        public abstract DestinationApiHelper getDestinationApiHelper();
    }


    private final FragmentActivity mActivity;

    public DestinationApiHelper(FragmentActivity fragmentactivity)
    {
        mActivity = (FragmentActivity)Preconditions.checkNotNull(fragmentactivity);
        Asserts.checkState(mActivity instanceof com.google.android.gms.games.ui.GamesUiConfiguration.GamesUiConfigurationProvider);
    }

    protected boolean checkDestAppValidity(Intent intent, String s)
    {
        boolean flag;
        if (UiUtils.isDestinationAppInstalled(mActivity))
        {
            flag = false;
        } else
        {
            DialogFragmentUtil.show(mActivity, new com.google.android.gms.games.ui.dialog.PrebuiltDialogs._cls1(), "com.google.android.gms.games.ui.dialog.installDialog");
            flag = true;
        }
        if (!flag)
        {
            boolean flag1;
            if (UiUtils.getDestinationAppVersion(mActivity) >= 0x1312d00)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                flag1 = false;
            } else
            {
                DialogFragmentUtil.show(mActivity, new com.google.android.gms.games.ui.dialog.PrebuiltDialogs._cls3(), "com.google.android.gms.games.ui.dialog.upgradeDialog");
                flag1 = true;
            }
            if (!flag1)
            {
                return true;
            }
        }
        return false;
    }

    public final void startIntent(Intent intent, String s)
    {
        Asserts.checkNotNull(intent);
        GamesUiConfiguration gamesuiconfiguration = ((com.google.android.gms.games.ui.GamesUiConfiguration.GamesUiConfigurationProvider)mActivity).getConfiguration();
        boolean flag;
        if (gamesuiconfiguration.isClientUi() || gamesuiconfiguration.isRestrictedUi())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "This method can only be called from client or restricted UI");
        if (!checkDestAppValidity(intent, s))
        {
            return;
        } else
        {
            startIntentInternal(intent);
            return;
        }
    }

    protected final void startIntentInternal(Intent intent)
    {
        intent.addFlags(0x10008000);
        mActivity.startActivity(intent);
    }
}
