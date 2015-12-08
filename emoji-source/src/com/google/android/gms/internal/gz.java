// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

public class gz
    implements android.content.DialogInterface.OnClickListener
{

    private final Fragment FV;
    private final int FW;
    private final Intent mIntent;
    private final Activity og;

    public gz(Activity activity, Intent intent, int i)
    {
        og = activity;
        FV = null;
        mIntent = intent;
        FW = i;
    }

    public gz(Fragment fragment, Intent intent, int i)
    {
        og = null;
        FV = fragment;
        mIntent = intent;
        FW = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (mIntent == null || FV == null) goto _L2; else goto _L1
_L1:
        FV.startActivityForResult(mIntent, FW);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (mIntent != null)
        {
            og.startActivityForResult(mIntent, FW);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}
