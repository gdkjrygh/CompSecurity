// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public final class DialogRedirect
    implements android.content.DialogInterface.OnClickListener
{

    private final Activity mActivity;
    private final Fragment mFragment;
    private final Intent mIntent;
    private final int mRequestCode;

    public DialogRedirect(Activity activity, Intent intent, int i)
    {
        mActivity = activity;
        mFragment = null;
        mIntent = intent;
        mRequestCode = i;
    }

    public DialogRedirect(Fragment fragment, Intent intent, int i)
    {
        mActivity = null;
        mFragment = fragment;
        mIntent = intent;
        mRequestCode = i;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (mIntent == null || mFragment == null) goto _L2; else goto _L1
_L1:
        mFragment.startActivityForResult(mIntent, mRequestCode);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (mIntent != null)
        {
            mActivity.startActivityForResult(mIntent, mRequestCode);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}
