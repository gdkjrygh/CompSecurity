// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms;

import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class GooglePlayServicesCheckFilter extends ActivityFilter
{

    private FragmentActivity activity;

    GooglePlayServicesCheckFilter(FragmentActivity fragmentactivity)
    {
        activity = fragmentactivity;
    }

    protected final void onResume()
    {
        super.onResume();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity);
        if (i != 0)
        {
            Dialog dialog1 = GooglePlayServicesUtil.getErrorDialog(i, activity, 0);
            Dialog dialog = dialog1;
            if (dialog1 == null)
            {
                dialog = GooglePlayServicesUtil.getErrorDialog(1, activity, 0);
            }
            if (!dialog.isShowing())
            {
                dialog.setCancelable(false);
                dialog.show();
                return;
            }
        }
    }
}
