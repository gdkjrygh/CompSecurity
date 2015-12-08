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

public class jh
    implements android.content.DialogInterface.OnClickListener
{

    private final Fragment Mx;
    private final int My;
    private final Intent mIntent;
    private final Activity nB;

    public jh(Activity activity, Intent intent, int i)
    {
        nB = activity;
        Mx = null;
        mIntent = intent;
        My = i;
    }

    public jh(Fragment fragment, Intent intent, int i)
    {
        nB = null;
        Mx = fragment;
        mIntent = intent;
        My = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (mIntent == null || Mx == null) goto _L2; else goto _L1
_L1:
        Mx.startActivityForResult(mIntent, My);
_L4:
        dialoginterface.dismiss();
        return;
_L2:
        if (mIntent != null)
        {
            nB.startActivityForResult(mIntent, My);
        }
        if (true) goto _L4; else goto _L3
_L3:
        dialoginterface;
        Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        return;
    }
}
