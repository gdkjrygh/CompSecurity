// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.dialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

public class SafeDialer
{

    private final FragmentActivity activity;
    private final TelephonyManager telephonyManager;

    public SafeDialer(FragmentActivity fragmentactivity, TelephonyManager telephonymanager)
    {
        activity = fragmentactivity;
        telephonyManager = telephonymanager;
    }

    private boolean isTelephonyEnabled()
    {
        return telephonyManager.getSimState() == 5;
    }

    public final void safeDial(Uri uri)
    {
        if (isTelephonyEnabled())
        {
            uri = (new Intent("android.intent.action.DIAL")).setData(HelpUrls.createTelephoneHelpUrl());
            activity.startActivity(uri);
            return;
        } else
        {
            uri = uri.getSchemeSpecificPart();
            AlertDialogFragment.newBuilder().setTitle(activity.getString(com.google.android.apps.walletnfcrel.R.string.telephone_number)).setMessage(uri).build().show(activity.getSupportFragmentManager());
            return;
        }
    }
}
